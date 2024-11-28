package com.paygoal.techiemultitask;

import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TechieMultiTaskServiceTest extends TechieMultiTaskApplicationTest{
  @Autowired
  private TechieMultiTaskService techieMultiTaskService;

  @Test
  @SneakyThrows
  void getCantoRapido() {
    long startTime = System.currentTimeMillis();
    String result = techieMultiTaskService.getCantoRapido();
    long endTime = System.currentTimeMillis();
    int time = (int) ((endTime - startTime)/1000);
    assertEquals(3, time);
    assertEquals("En argentina nací, tierra de Diego y Lionel, de los pibes de malvinas", result);
  }

  @Test
  @SneakyThrows
  void getCantoLento() {
    long startTime = System.currentTimeMillis();
    String result = techieMultiTaskService.getCantoLento();
    long endTime = System.currentTimeMillis();
    int time = (int) ((endTime - startTime)/1000);
    assertEquals(5, time);
    assertEquals("No te lo puedo explicar, por que no vas a entender", result);
  }

  @Test
  @SneakyThrows
  void getElPrimeroQueTermina() {
    long startTime = System.currentTimeMillis();
    String result = techieMultiTaskService.getElPrimeroQueTermina();
    long endTime = System.currentTimeMillis();
    int time = (int) ((endTime - startTime)/1000);
    assertEquals(1, time);
    assertEquals(", tierra de Diego y Lionel", result);
  }

  @Test
  @SneakyThrows
  void getElUltimoSeparado() {
    long startTime = System.currentTimeMillis();
    String result = techieMultiTaskService.getElUltimoSeparado(false);
    long endTime = System.currentTimeMillis();
    int time = (int) ((endTime - startTime)/1000);
    assertEquals(7, time);
    assertEquals("En argentina nací, tierra de Diego y Lionel, de los pibes de malvinas, que jamás olvidaré.", result);
  }

  @Test
  @SneakyThrows
  void getElUltimoLanzandoException() {
    long startTime = System.currentTimeMillis();
    String result = techieMultiTaskService.getElUltimoSeparado(true);
    long endTime = System.currentTimeMillis();
    int time = (int) ((endTime - startTime)/1000);
    assertEquals(7, time);
    assertEquals("500 Internal Server Error", result);
  }
}
