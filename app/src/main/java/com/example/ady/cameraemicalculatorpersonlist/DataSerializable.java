package com.example.ady.cameraemicalculatorpersonlist;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ady on 11/11/2017.
 */

public class DataSerializable implements Serializable {
    List<clients> listofclient = new ArrayList<>();





    public DataSerializable(List<clients> list) {
        listofclient = list;

    }



    public List<clients> getclient() {

        return listofclient;
    }




}
