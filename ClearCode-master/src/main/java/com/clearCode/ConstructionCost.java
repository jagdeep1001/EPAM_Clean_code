package com.clearCode;

import java.io.IOException;

public class ConstructionCost {
    double area, cost;
    String type;
    public void standardMaterial() throws IOException {
        cost = area * 1200;
        System.out.write(("Cost when Standard Material used:\n" + cost).getBytes());
    }
    public void abovesStandardMaterial() throws IOException {
        cost = area * 1500;
        System.out.write(("Cost when Above Standard Material used:" + cost).getBytes());
    }
    public void highStandardMaterial() throws IOException {
        cost = area * 1800;
        System.out.write(("Cost when High Standard Material used:" + cost).getBytes());
    }
    public void standardMaterialAndAutomatedHome() throws IOException {
        cost = area * 2500;
        System.out.write(("Cost when High Standard Material and full automated home used:" + cost).getBytes());
    }
}
