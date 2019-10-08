public class ChessParams {
    private int height;
    private int width;

    public ChessParams(String[] args) {
        if (args == null || args.length < 2) {
            System.out.println("Please path variables from command line!");
            return;
        }
        try {
            height = Integer.parseInt(args[0]);
            width = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("Parameters not valid!");
        }
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}