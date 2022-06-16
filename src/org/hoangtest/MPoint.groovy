package org.foo

// point in 3D space
class MPoint {
  float x,y,z
  public MPoint (float xvalue) {
    x = xvalue;
    y = 2.4f;
    z = 3.0f;
  }

  def abc() {
    sh 'echo abcd'
  }
  return this

}