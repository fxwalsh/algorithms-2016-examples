package topic5;


import java.util.Random;

import edu.princeton.cs.introcs.StdDraw;

public class TreeFractal{
public static void tree(int n, double x, double y, double a, double branchRadius) {
    
	Random r = new Random();
	
	
	
	double bendAngle   = Math.toRadians(r.nextInt((25 - 10) + 1) + 10);
    double branchAngle = Math.toRadians(r.nextInt((40 - 20) + 1) + 20);
    double branchRatio = 0.65;

    double cx = x + Math.cos(a) * branchRadius;
    double cy = y + Math.sin(a) * branchRadius;
    StdDraw.setPenRadius(0.001 * Math.pow(n, 1.2));
    StdDraw.line(x, y, cx, cy);
    if (n == 0) return;

    tree(n-1, cx, cy, a + bendAngle - branchAngle, branchRadius * branchRatio);
    tree(n-1, cx, cy, a + bendAngle + branchAngle, branchRadius * branchRatio);
    tree(n-1, cx, cy, a + bendAngle,               branchRadius * (1 - branchRatio));
}

public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    StdDraw.enableDoubleBuffering();
    tree(n, 0.5, 0, Math.PI/2, 0.3);
    StdDraw.show();
}
}
