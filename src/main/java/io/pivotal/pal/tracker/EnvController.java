package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class EnvController {
    private final String portNo;
    private final String memyLimit;
    private final String instanceIndex;
    private final String insAddrress;

    public EnvController(@Value("${PORT:NOT SET}")String port, @Value("${MEMORY_LIMIT:NOT SET}")String memLimit, @Value("${CF_INSTANCE_INDEX:NOT SET}") String insInd, @Value("${CF_INSTANCE_ADDR:NOT SET}")String insAddr) {
        portNo = port;
        memyLimit = memLimit;
        instanceIndex = insInd;
        insAddrress = insAddr;
    }
    @GetMapping("/env")
    public Map<String, String> getEnv() {
        Map<String,String> map=new HashMap();
               map.put("PORT", portNo);
               map.put("MEMORY_LIMIT",memyLimit);
               map.put("CF_INSTANCE_INDEX",instanceIndex);
               map.put("CF_INSTANCE_ADDR", insAddrress);
               return map;
    }
}
