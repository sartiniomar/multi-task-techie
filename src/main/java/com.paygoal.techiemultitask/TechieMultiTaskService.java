package com.paygoal.techiemultitask;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.concurrent.TimeUnit;

@Service
@RequiredArgsConstructor
public class TechieMultiTaskService {

  public String getCantoRapido() {
    String result = "";
    // Aquí la lógica para que el canto demore 4 segundos.
    return result;
  }

  public String getCantoLento() {
    String result = "";
    // Aquí la lógica para que el canto demore 10 segundos.
    return result;
  }

  public String getElPrimeroQueTermina() {
    String result = "";
    // Aquí la lógica para el canto que demore menos tiempo
    return result;
  }

  public String getElUltimoSeparado(boolean throwException) {
    String result = "";
    // Aquí la lógica para el canto demore 7 segundos
    return result;
  }

  private String getFirstPart(boolean throwException) {
    delay(2);
    return "En argentina nací";
  }

  private String getSecondPart() {
    delay(1);
    return ", tierra de Diego y Lionel";
  }

  private String getThirdPart() {
    delay(3);
    return ", de los pibes de malvinas";
  }

  private String getQuarterPart(boolean throwException) {
    if (throwException) {
      throw new RuntimeException();
    }
    delay(4);
    return ", que jamás olvidaré.";
  }

  public static void delay(int seconds) {
    try {
      TimeUnit.SECONDS.sleep(seconds);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }
}
