class Canvas {

List<Point> points = new ArrayList<Point>();
points.add(new Point(1, 2));
points.add(new Point(60, 50));
points.add(new Point(50, 3));
Collections.sort(points,new Comparator<Point>() {

public int compare(Point o1, Point o2) {
    return Integer.compare(o1.getX(), o2.getX());
}
}