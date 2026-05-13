package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        Wall wall1    = new Wall("North");
        Wall wall2    = new Wall("South");
        Wall wall3    = new Wall("East");
        Wall wall4    = new Wall("West");
        Ceiling ceiling = new Ceiling(3, PaintColor.WHITE);
        Bed bed       = new Bed("Modern", 4, 60, 2, 1);
        Lamp lamp     = new Lamp(LampType.NEON, true, 5);
        Wardrobe wardrobe = new Wardrobe(120, 200, 45.5);
        Carpet carpet = new Carpet(300, 400, PaintColor.RED);

        Bedroom bedroom = new Bedroom("Master Bedroom",
                wall1, wall2, wall3, wall4,
                ceiling, bed, lamp, wardrobe, carpet);

        // Metodları test et
        bedroom.getLamp().turnOn();
        bedroom.getBed().make();
        bedroom.getWardrobe().add();
        bedroom.getCarpet().lying();
        bedroom.getCeiling().create();
        bedroom.getWall1().create();

        // Getter'ları test et
        System.out.println("Bedroom: "     + bedroom.getName());
        System.out.println("Lamp Style: "  + bedroom.getLamp().getStyle());
        System.out.println("Bed Height: "  + bedroom.getBed().getHeight());
        System.out.println("Wall: "        + bedroom.getWall1().getDirection());
        System.out.println("Ceiling Color: "+ bedroom.getCeiling().getColor());
        System.out.println("Carpet Color: " + bedroom.getCarpet().getColor());
    }
}