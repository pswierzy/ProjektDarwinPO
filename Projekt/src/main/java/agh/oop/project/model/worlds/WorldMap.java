package agh.oop.project.model.worlds;

import agh.oop.project.model.CsvWriter;
import agh.oop.project.model.Vector2d;
import agh.oop.project.model.WorldElement;
import agh.oop.project.model.animals.Animal;
import agh.oop.project.model.app.MapChangeListener;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public interface WorldMap {

    Map<Vector2d, List<Animal>> getLivingAnimals();
    Map<Vector2d, Plant> getPlants();

    int getLivingAnimalAmount();
    int getDeadAnimalAmount();
    int getFreeAreas();
    int getSumOfLivingEnergy();
    int getSumOfDeadDays();
    int getSumOfKids();
    HashSet<Vector2d> getBetterArea();
    List<Integer> getTheMostPopularGenotype();
    public Animal getAnimalWithTheMostPopularGenotype(Vector2d position);

    void placeAnimal(Animal animal);

    void removeDeadAnimals(int day);

    boolean isPlantAt(Vector2d position);

    boolean canMoveTo( Vector2d position);

    Animal getTheBestAnimal(List<Animal> animals);
    void sortAnimals(List<Animal> animals);

    void manageReproduction(List<Animal> animals);

    void eatingAndReproduction();

    void generateBetterArea();

    void placePlant(Vector2d position);
    void generatePlants(int quantity);

    void moveAllAnimals();
    void move(Animal animal);
    int getHeight();
    int getWidth();
    void setListener(MapChangeListener listener);
    WorldElement objectAt(Vector2d position);

    void writeStatsToFile(CsvWriter writer, int day) throws IOException;
}
