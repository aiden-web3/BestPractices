package com.best.practice.tool;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 */
public class TestCurl {
    /**
     * 各部分构成
     * @param cmdParts
     * @return
     */
    public static String execCmdParts(String[] cmdParts) {
        ProcessBuilder process = new ProcessBuilder(cmdParts);
        Process p;
        try {
            p = process.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
            StringBuilder builder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                builder.append(line);
                builder.append(System.getProperty("line.separator"));
            }

            return builder.toString();
        } catch (IOException e) {
            System.out.print("error");
            e.printStackTrace();
        }

        return null;
    }

    /**
     * 直接字符串
     * @param command
     * @return
     */
    private static String execCmd(String command) {
        StringBuilder output = new StringBuilder();
        Process p;
        try {
            p = Runtime.getRuntime().exec(command);
            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("line=" + line);
                output.append(line).append("\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return output.toString();
    }

    static String[] cmdParts1 = {"curl", "-H", "Host: www.chineseconverter.com", "-H", "Cache-Control: max-age=0", "--compressed", "https://www.chineseconverter.com/zh-cn/convert/chinese-stroke-order-tool"};
    static String[] cmdParts2 = {"curl", "-H", "Cache-Control: max-age=0", "--compressed", "https://www.chineseconverter.com/zh-cn/convert/chinese-stroke-order-tool"};
    static String test ="curl 'https://www.kucoin.net/_pxapi/dual-investment/v1/orders?c=0f629e5d90b5448f8df3478bba00dbe4&lang=zh_CN' \\\n" +
            "  -H 'authority: www.kucoin.net' \\\n" +
            "  -H 'accept: application/json' \\\n" +
            "  -H 'accept-language: zh-CN,zh;q=0.9' \\\n" +
            "  -H 'cache-control: no-cache' \\\n" +
            "  -H 'content-type: application/json' \\\n" +
            "  -H 'cookie: _fbp=fb.1.1657596353364.879442465; gr_user_id=173bc215-75ee-4577-8b38-776361ed9f5b; grwng_uid=e47d0178-bb30-459d-af49-199dc22a6f91; _gid=GA1.2.564775591.1663311754; sensorsdata2015jssdkcross=%7B%22distinct_id%22%3A%2220200326360292%22%2C%22first_id%22%3A%22181f07117c8aa8-09cf0c267cdfe78-1c525635-1930176-181f07117c91539%22%2C%22props%22%3A%7B%22%24latest_traffic_source_type%22%3A%22%E7%9B%B4%E6%8E%A5%E6%B5%81%E9%87%8F%22%2C%22%24latest_search_keyword%22%3A%22%E6%9C%AA%E5%8F%96%E5%88%B0%E5%80%BC_%E7%9B%B4%E6%8E%A5%E6%89%93%E5%BC%80%22%2C%22%24latest_referrer%22%3A%22%22%7D%2C%22%24device_id%22%3A%22181f07117c8aa8-09cf0c267cdfe78-1c525635-1930176-181f07117c91539%22%2C%22identities%22%3A%22eyIkaWRlbnRpdHlfY29va2llX2lkIjoiMTgzNDUxYjM0MDViYjItMGNiMjBmMDdhN2M5OC0xYTUyNTYzNS0zNjg2NDAwLTE4MzQ1MWIzNDA2MWU3MCIsIiRpZGVudGl0eV9sb2dpbl9pZCI6IjIwMjAwMzI2MzYwMjkyIn0%3D%22%2C%22history_login_id%22%3A%7B%22name%22%3A%22%24identity_login_id%22%2C%22value%22%3A%2220200326360292%22%7D%7D; SESSION=YmU0ZjcwZWMtZmZkMS00MTVjLTk1NWMtNTM4YzJhNWQxZGQ5; version=63241f92297fe70001091b6f; X-TRACE=Fla0ob7YFG5CgoXp4dTkDfluy8Y1EoREtP40DAUMqGQ=; a46016b4ef684522_gr_last_sent_cs1=M7L8BAEP; a46016b4ef684522_gr_session_id=f6e30ba8-a12d-40e4-9b3a-a62f7e062cbf; a46016b4ef684522_gr_last_sent_sid_with_cs1=f6e30ba8-a12d-40e4-9b3a-a62f7e062cbf; a46016b4ef684522_gr_session_id_f6e30ba8-a12d-40e4-9b3a-a62f7e062cbf=true; x-bullet-token=2neAiuYvAU5cbMXpmsXD5OJlewXCKryg8dSpDCgag8ZwbZpn3uIHi6siD_s132wYwoXOiOG0Q0H0u5aYOwIoF4peAk92v6aSeKskBBqxT9uoTCLGNid53aqRyqznCVt1whuoNZhpWWGMVDiks1ILK5Y1PnizNntY.2Q5eUFmY3JRMLZor3iTb_A==; a46016b4ef684522_gr_cs1=M7L8BAEP; _uetsid=e7b55ec0359711ed8ecc45531868315f; _uetvid=5d5f76a008da11ed912dbd144a3932fe; _gat_UA-46608064-1=1; _ga_YHWW24NNH9=GS1.1.1663311754.38.1.1663318340.49.0.0; _ga=GA1.1.179110992.1657610820' \\\n" +
            "  -H 'origin: https://www.kucoin.net' \\\n" +
            "  -H 'pragma: no-cache' \\\n" +
            "  -H 'referer: https://www.kucoin.net/zh-hans/earn/dual' \\\n" +
            "  -H 'sec-ch-ua: \"Google Chrome\";v=\"105\", \"Not)A;Brand\";v=\"8\", \"Chromium\";v=\"105\"' \\\n" +
            "  -H 'sec-ch-ua-mobile: ?0' \\\n" +
            "  -H 'sec-ch-ua-platform: \"macOS\"' \\\n" +
            "  -H 'sec-fetch-dest: empty' \\\n" +
            "  -H 'sec-fetch-mode: cors' \\\n" +
            "  -H 'sec-fetch-site: same-origin' \\\n" +
            "  -H 'user-agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/105.0.0.0 Safari/537.36' \\\n" +
            "  --data-raw '{\"accountType\":\"MAIN\",\"annualRate\":\"9\",\"expirationTime\":1662949417000,\"investCurrency\":\"BTC\",\"productId\":\"2\",\"strikePrice\":\"26500\",\"investAmount\":\"0.1\"}' \\\n" +
            "  --compressed";

    public static void main(String[] args) {
        // 成功
        System.out.println(execCmdParts(cmdParts1));
        // 成功
//        System.out.println(execCmdParts(cmdParts2));
        // 失败
//        System.out.println(execCmd(String.join(" ", cmdParts1)));
        // 成功
//        System.out.println(execCmd(String.join(" ", cmdParts2)));
//        getCMD(test);
        System.out.println(execCmd(test));
    }


    public static String[] getCMD(String data){
//        String param = data.replace(" ", "").replace("\n", "").replace("\t", "");
        String param = data.replace(" ", "").replace("\n", "").replace("\t", "");

        String [] cmd = param.split(" ");
        return cmd;
    }

}
