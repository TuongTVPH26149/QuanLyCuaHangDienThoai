/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17322.nhom6.repositories;

import com.poly.it17322.nhom6.domainmodels.CPU;
import com.poly.it17322.nhom6.domainmodels.CPU;
import com.poly.it17322.nhom6.utilities.HibernatUtil;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author LiamTrieu
 */
public class CPURepository {

    private Session session = HibernatUtil.getFACTORY().openSession();

    public List<CPU> selectALLCPU() {
        List<CPU> listCPU = new ArrayList<>();
        try{
            Query query = session.createQuery("FROM CPU", CPU.class);
            listCPU = query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listCPU;
    }

    public CPU SelectCPUById(UUID Id) {
        CPU cpu = new CPU();
        try{
            Query query = session.createQuery("FROM CPU where Id = :Id", CPU.class);
            query.setParameter("Id", Id);
            cpu = (CPU) query.getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cpu;
    }

    public Boolean InsertCPU(CPU cpu) {
        try ( Session session = HibernatUtil.getFACTORY().openSession()) {
            Transaction tran = session.getTransaction();
            tran.begin();
            session.save(cpu);
            tran.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Boolean UpdateCPU(CPU cpu) {
        try ( Session session = HibernatUtil.getFACTORY().openSession()) {
            Transaction tran = session.getTransaction();
            tran.begin();
            cpu.setLastModifiedDate(new Date());
            session.saveOrUpdate(cpu);
            tran.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
