package com.example.sep1.viewmodel;

import com.example.sep1.model.AnimalForSale;
import com.example.sep1.model.AnimalInformation;
import com.example.sep1.model.dataManagement.AnimalsForSaleManagement;

import java.time.LocalDate;

public class MainViewModel
{

  public void addAnimalForSale(String name, String birthday)
  {
    AnimalInformation information = new AnimalInformation(true, LocalDate.of(2002, 12, 2), birthday);
    AnimalForSale animalForSale= new AnimalForSale(20.0, information);
    AnimalsForSaleManagement.addAnimalForSale(animalForSale);
  }
}
