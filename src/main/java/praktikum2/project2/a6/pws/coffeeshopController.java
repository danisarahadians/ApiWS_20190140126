/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2.project2.a6.pws;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author danisarahadians
 */
@CrossOrigin
@RestController
@RequestMapping("/databarang")
public class coffeeshopController {
     @Autowired
     private coffeeshoprepo coffeeshop;
     
     @GetMapping("/coffeeshop")
    public List<coffeeshop> getAllCoffeeShop(){
        return coffeeshop.findAll();
    }
    
    @GetMapping ("/coffeeshop/{idproduct}")
    public coffeeshop getErialbById(@PathVariable String idproduct){
        return coffeeshop.findById(idproduct).get();
    }
    
    @PostMapping ("/coffeeshop")
    public coffeeshop saveCoffeeshopDetails(@RequestBody coffeeshop c){
        return coffeeshop.save(c);
    }
    
    @PutMapping("/coffeeshop")
    public coffeeshop updateCoffeeshop(@RequestBody coffeeshop c){
        return coffeeshop.save(c);
    }
    
    @DeleteMapping("/coffeeshop/{idproduct}")
    public ResponseEntity<HttpStatus> deleteCoffeeshopById(@PathVariable String idproduct){
        coffeeshop.deleteById(idproduct);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
