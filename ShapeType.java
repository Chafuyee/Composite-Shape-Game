/*
 *	===============================================================================
 *	ShapeType represents the type of a shape
 *  YOUR UPI:
 *	=============================================================================== */

enum ShapeType { RECTANGLE, OVAL;
	public ShapeType next() {
		return values()[(ordinal() + 1) % values().length];
	}
}