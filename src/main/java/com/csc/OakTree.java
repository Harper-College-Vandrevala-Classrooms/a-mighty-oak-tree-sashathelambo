package com.csc;

public class OakTree {
  private Squirrel squirrel;
  private OakTree left;
  private OakTree right;

  public OakTree(Squirrel squirrel) {
    this.squirrel = squirrel;
    this.left = null;
    this.right = null;
  }

  public void attachLeft(OakTree node) {
    this.left = node;
  }

  public void attachRight(OakTree node) {
    this.right = node;
  }

  public OakTree left() {
    return this.left;
  }

  public OakTree right() {
    return this.right;
  }

  public Squirrel getSquirrel() {
    return this.squirrel;
  }

  public static void main(String[] args) {
    // Example usage:
    Squirrel rocky = new Squirrel("Rocky");
    Squirrel bullwinkle = new Squirrel("Bullwinkle");
    Squirrel sandy = new Squirrel("Sandy");

    OakTree root = new OakTree(rocky);
    OakTree leftNode = new OakTree(bullwinkle);
    OakTree rightNode = new OakTree(sandy);

    root.attachLeft(leftNode);
    root.attachRight(rightNode);
  }
}
