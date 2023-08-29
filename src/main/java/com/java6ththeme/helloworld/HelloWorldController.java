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
                new Hunter("Gon", 12,
                        List.of("ジャンケングー", "ジャンケンチー", "ジャンケンパー")),
                new Hunter("Killua", 12,
                        List.of("雷掌(イズツシ)", "神速(カンムル)", "肢曲", "蛇活", "落雷(ナルカミ)")),
                new Hunter("Kurapika", 18,
                        List.of("絶対時間(エンペラータイム)", "律する小指の鎖(ジャッジメントチェーン)",
                                "奪う人差し指の鎖(スチールチェーン)", "導く薬指の鎖(ダウジングチェーン)",
                                "束縛する中指の鎖(チェーンジェイル)", "癒す親指の鎖(ホーリーチェーン)")),
                new Hunter("Leorio", 20,
                        List.of("ナイフが得意")));

        // Hunterの名前を大文字に変換
        List<String> upperNames
                = hunters.stream().map(hunter -> hunter.getName().toUpperCase()).toList();
        for (int i = 0; i < hunters.size(); i++) {
            hunters.get(i).setName(upperNames.get(i));
        }

        // Hunterに試験番号を付与
        Map<Integer, Hunter> examNum = Map.of(
                405, hunters.get(0), 99, hunters.get(1), 404, hunters.get(2), 403, hunters.get(3));

        // retrurn
        return examNum;

    }
}
