package chapter06;

public class Box {
    double wigft;
    double hight;
    double depth;

    double volume() {
        return wigft * hight * depth;
    }

    void SetDim(double w, double h, double d) {
        wigft = w;
        hight = h;
        depth = d;
    }


    }
