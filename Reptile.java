
//
//Source code recreated from a .class file by IntelliJ IDEA
//(powered by FernFlower decompiler)
//
package org.a0521;
import org.a0521.animal;
public class Reptile extends animal1 {
 private String Height;
 public Reptile() {
     this.Height = "short";
 }
 public Reptile(String height, String animalType, int bloodType, int weight) {
     super(animalType, bloodType, weight);
     this.Height = Height;
 }
 public Reptile(String Height) {
     this.Height = Height;
 }
 public String getHeight() {
     return this.Height;
 }
 public String toString() {
     return "Reptile [getHeight()=" + this.getHeight() + ", getanimalType()=" + this.getanimalType() + ", getbloodType()=" + this.getbloodType() + ", getweight()=" + this.getweight() + "]";
 }}