enum LightBulbType {
    LED,
    FLUORESCENT,
    INCANDESCENT,
}

class LightBulb {
    int power; // in Watts
    int lifetime; // in hours
    String color;
    String brand;
    LightBulbType type;
}