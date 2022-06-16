package org.foo

// point in 3D space
class MPoint {
  float x,y,z
  public Point (float xvalue) {
    x = xvalue;
    y = 2.4f;
    z = 3.0f;
  }
  public String echo() {
    return x + " " + y + " " + z;
  }
}