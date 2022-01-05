/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2.project2.a6.pws;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author danisarahadians
 */
@Entity
@Table(name="barang")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class coffeeshop {
    @Id
    private String idproduct;
    private String name;
    private String stock;
    private String price;
       
}
