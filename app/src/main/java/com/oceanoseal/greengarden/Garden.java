package com.oceanoseal.greengarden;

import java.util.ArrayList;
import java.util.List;

public class Garden {
    private List<Plant> plants;
    private int gardenSize;
    private String gardenName;

    public Garden(String gardenName, int size) {
        this.gardenName = gardenName;
        this.gardenSize = size;
        this.plants = new ArrayList<>();
    }

    public void addPlant(Plant plant) {
        if (plants.size() < gardenSize) {
            plants.add(plant);
        }
    }

    public void removePlant(Plant plant) {
        plants.remove(plant);
    }

    public List<Plant> getAllPlants() {
        return plants;
    }

    public int getPlantCount() {
        return plants.size();
    }

    public boolean canAddPlant() {
        return plants.size() < gardenSize;
    }

    public String getGardenName() {
        return gardenName;
    }

    public void setGardenName(String name) {
        this.gardenName = name;
    }

    public int getGardenSize() {
        return gardenSize;
    }
}