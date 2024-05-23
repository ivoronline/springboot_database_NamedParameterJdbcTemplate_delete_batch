package com.ivoronline.springboot_database_namedparameterjdbctemplate_delete_batch.controllers;

import com.ivoronline.springboot_database_namedparameterjdbctemplate_delete_batch.dto.PersonDTO;
import com.ivoronline.springboot_database_namedparameterjdbctemplate_delete_batch.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
public class MyController {

  //PROPERTIES
  @Autowired private MyService myService;

  //=========================================================================================================
  // DELETE
  //=========================================================================================================
  @ResponseBody
  @GetMapping("/delete")
  public int[] delete() {
    int[]  success = myService.delete(createRecords());
    return success;
  }

  //=========================================================================================================
  // CREATE RECORDS
  //=========================================================================================================
  public List<PersonDTO> createRecords() {

    //CREATE RECORDS TO DELETE
    PersonDTO       jill    = new PersonDTO(0, "John" , 10);
    PersonDTO       bill    = new PersonDTO(0, "Bill" , 20);
    PersonDTO       susan   = new PersonDTO(0, "Susan", 30);

    //CREATE LIST
    List<PersonDTO> records = new ArrayList<>();
                    records.add(jill);
                    records.add(bill);
                    records.add(susan);

    //RETURN LIST
    return records;

  }

}

