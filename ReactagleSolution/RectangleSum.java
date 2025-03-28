package ReactagleSolution;

public class RectangleSum {
    // Function to check if two rectangles intersect
    public static boolean doRectanglesIntersect(int x1, int y1, int x2, int y2, 
                                                int x3, int y3, int x4, int y4) {
        // Check if one rectangle is completely to the left or right of the other
        if (x2 < x3 || x4 < x1) {
            return false;
        }

        // Check if one rectangle is completely above or below the other
        if (y2 < y3 || y4 < y1) {
            return false;
        }

        return true; // Rectangles overlap
    }

    public static void main(String[] args) {
        // Example rectangles
        int x1 = 0, y1 = 0, x2 = 4, y2 = 4; // First rectangle (0,0) to (4,4)
        int x3 = 2, y3 = 2, x4 = 6, y4 = 6; // Second rectangle (2,2) to (6,6)

        if (doRectanglesIntersect(x1, y1, x2, y2, x3, y3, x4, y4)) {
            System.out.println("Rectangles Intersect.");
        } else {
            System.out.println("Rectangles Do Not Intersect.");
        }
    }
}

