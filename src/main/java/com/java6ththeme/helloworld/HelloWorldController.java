package com.java6ththeme.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class HelloWorldController {
    @GetMapping("/hellohunters")
    public Map<Integer, Hunter> helloHunters() {

        // Hunterリスト作成
        List<Hunter> hunters = List.of(
                new Hunter("Gon", 12, "ジャジャン拳"),
                new Hunter("Killua", 12, "神速"),
                new Hunter("Kurapika", 18, "絶対時間"));

        // Hunterの名前を大文字に変換
        List<String> upperNames
                = hunters.stream().map(hunter -> hunter.getName().toUpperCase()).toList();
        for (int i = 0; i < hunters.size(); i++) {
            hunters.get(i).setName(upperNames.get(i));
        }

        // Hunterに試験番号を付与
        Map<Integer, Hunter> examNum = Map.of(
                405, hunters.get(0), 99, hunters.get(1), 403, hunters.get(2));

        // retrurn
        return examNum;

    }
}
