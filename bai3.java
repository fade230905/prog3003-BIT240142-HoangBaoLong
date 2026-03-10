import java.util.concurrent.CompletableFuture;

public class MovieTicketSystem {
    public static void main(String[] args) throws Exception {
        CompletableFuture<String> authTask = CompletableFuture.supplyAsync(() -> {
            simulateDelay(1000);
            System.out.println("1. Xác thực khách hàng thành công.");
            return "Khách hàng: Nguyễn Văn A";
        });

        CompletableFuture<String> ticketTask = CompletableFuture.supplyAsync(() -> {
            simulateDelay(2000);
            System.out.println("2. Vé đã được tạo.");
            return "Vé Phim: Avengers";
        });
        CompletableFuture<String> finalProcess = authTask.thenCombine(ticketTask, (auth, ticket) -> {
            return "Hoàn tất đặt vé cho [" + auth + "] - [" + ticket + "]";
        });

        System.out.println("Đang xử lý...");
        System.out.println(finalProcess.get());
    }

    private static void simulateDelay(int ms) {
        try { Thread.sleep(ms); } catch (InterruptedException e) { e.printStackTrace(); }
    }
}
