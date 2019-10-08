public class ChessPrinter {
    public  static void printChess(ChessParams chessParams) {
        if (chessParams == null) {
            return;
        }
        for (int b = 0; b < chessParams.getHeight(); b++) {
            if (b % 2 == 1) {
                System.out.print(" ");
            }
            for (int i = 0; i < chessParams.getWidth(); i++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
