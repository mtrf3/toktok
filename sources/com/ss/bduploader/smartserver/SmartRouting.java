package com.ss.bduploader.smartserver;

import X.X1D;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class SmartRouting extends SmartAbstract {
    public SmartServiceInterface mIntelligentService;
    public String mIntelligentURL = "";

    @Override // com.ss.bduploader.smartserver.SmartAbstract
    public void configServer() {
        this.mIntelligentService.setStringValue(1000, "mlsdk");
        this.mIntelligentService.setStringValue(1001, "smart_upload_tcp_quic");
        this.mIntelligentService.setStringValue(1002, "regression");
        this.mIntelligentService.setStringValue(1003, this.mIntelligentURL);
        this.mIntelligentService.configServer();
    }

    @Override // com.ss.bduploader.smartserver.SmartAbstract
    public void init() {
        this.mIntelligentService = new SmartServiceWrapper();
    }

    @Override // com.ss.bduploader.smartserver.SmartAbstract
    public void preloadEnv() {
        SmartServiceInterface smartServiceInterface = this.mIntelligentService;
        if (smartServiceInterface != null) {
            smartServiceInterface.preloadEnv();
        }
    }

    public Map getIntelligentInput(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        try {
            if (JSONObjectProtectorUtils.getInt(jSONObject, "est_file_size") > 0 && JSONObjectProtectorUtils.getJSONObject(jSONObject, "optimized_info") != null) {
                if (JSONObjectProtectorUtils.getInt(jSONObject, "origin_speed_test") > 0) {
                    hashMap.put("origin_speed_test", Float.valueOf(parseIntelligentInputFloat(jSONObject, "origin_speed_test", 0)));
                    hashMap.put("speed_test_protocol", Float.valueOf(parseIntelligentInputFloat(jSONObject, "speed_test_protocol", 0)));
                    hashMap.put("init_rtt", Double.valueOf(parseIntelligentInputFloat(jSONObject, "init_rtt", 1) / 1000.0d));
                    hashMap.put("close_rtt", Double.valueOf(parseIntelligentInputFloat(jSONObject, "close_rtt", 1) / 1000.0d));
                    hashMap.put("mss", Float.valueOf(parseIntelligentInputFloat(jSONObject, "mss", 1)));
                    hashMap.put("inner_time", Double.valueOf(parseIntelligentInputFloat(jSONObject, "inner", 1) / 1000.0d));
                    hashMap.put("origin_time", Double.valueOf(parseIntelligentInputFloat(jSONObject, "origin", 1) / 1000.0d));
                    hashMap.put("est_file_size", Float.valueOf(parseIntelligentInputFloat(jSONObject, "est_file_size", 0)));
                    return hashMap;
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public Map getIntelligentInputTTNet(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        try {
            if (JSONObjectProtectorUtils.getInt(jSONObject, "est_file_size") > 0 && JSONObjectProtectorUtils.getJSONObject(jSONObject, "tcp_domain") != null && JSONObjectProtectorUtils.getJSONObject(jSONObject, "quic_domain") != null) {
                List asList = Arrays.asList("tcp", "quic");
                List<String> asList2 = Arrays.asList("SeverSpeed", "speed", "duration", "routing_request_log.timing.detailed_duration.inner", "routing_request_log.timing.detailed_duration.send", "routing_request_log.timing.detailed_duration.ttfb", "routing_request_log.timing.request.duration");
                List<String> asList3 = Arrays.asList("routing_request_log.nqe.http_rtt", "routing_request_log.nqe.tcp_rtt", "routing_request_log.nqe.downlink_throughput", "routing_request_log.nqe.real_net_type", "routing_request_log.nqe.effective_net_type");
                for (int i = 0; i < asList.size(); i++) {
                    String str = (String) ListProtector.get(asList, i);
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(str);
                    LIZ.append("_domain");
                    JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, X1D.LIZIZ(LIZ));
                    for (String str2 : asList2) {
                        String[] split = str2.split("\\.");
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append(str);
                        LIZ2.append("_");
                        LIZ2.append(split[split.length - 1].toLowerCase(Locale.US));
                        String LIZIZ = X1D.LIZIZ(LIZ2);
                        if (str2.equals("duration")) {
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append(LIZIZ);
                            LIZ3.append("_bd");
                            LIZIZ = X1D.LIZIZ(LIZ3);
                        }
                        float valueForKey = getValueForKey(jSONObject2, str2);
                        if (valueForKey != -1.0f) {
                            hashMap.put(LIZIZ, Float.valueOf(valueForKey));
                        } else {
                            return null;
                        }
                    }
                }
                for (String str3 : asList3) {
                    hashMap.put(str3.split("\\.")[r1.length - 1].toLowerCase(Locale.US), Float.valueOf(getValueForKey(JSONObjectProtectorUtils.getJSONObject(jSONObject, "tcp_domain"), str3)));
                }
                float parseIntelligentInputFloat = parseIntelligentInputFloat(jSONObject, "est_file_size", 0);
                if (parseIntelligentInputFloat <= 0.0f) {
                    return null;
                }
                hashMap.put("est_file_size", Float.valueOf(parseIntelligentInputFloat));
                return hashMap;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.ss.bduploader.smartserver.SmartAbstract
    public void parseUrl(String str) {
        try {
            this.mIntelligentURL = JSONObjectProtectorUtils.getString(new JSONObject(str), "intelligent_model_url");
        } catch (Exception unused) {
            this.mIntelligentURL = "";
        }
    }

    @Override // com.ss.bduploader.smartserver.SmartAbstract
    public float predictSpeedSync(JSONObject jSONObject) {
        if (!this.mIntelligentService.serviceEnabled()) {
            return -1.0f;
        }
        Map hashMap = new HashMap();
        try {
            if (JSONObjectProtectorUtils.getInt(jSONObject, "routing_using_vcn") == 1) {
                hashMap = getIntelligentInput(jSONObject);
            } else {
                if (JSONObjectProtectorUtils.getInt(jSONObject, "routing_using_vcn") == 0) {
                    hashMap = getIntelligentInputTTNet(jSONObject);
                }
                return this.mIntelligentService.runSync(hashMap);
            }
            if (hashMap == null) {
                return -1.0f;
            }
            return this.mIntelligentService.runSync(hashMap);
        } catch (Exception unused) {
            return -1.0f;
        }
    }

    @Override // com.ss.bduploader.smartserver.SmartAbstract
    public void setUrl(String str) {
        this.mIntelligentURL = str;
    }

    private float getValueForKey(JSONObject jSONObject, String str) {
        String[] split = str.split("\\.");
        for (int i = 0; i < split.length - 1; i++) {
            try {
                jSONObject = JSONObjectProtectorUtils.getJSONObject(jSONObject, split[i]);
            } catch (Exception unused) {
                return -1.0f;
            }
        }
        String str2 = split[split.length - 1];
        if (!jSONObject.has(str2)) {
            return -1.0f;
        }
        return (float) JSONObjectProtectorUtils.getDouble(jSONObject, str2);
    }

    private float parseIntelligentInputFloat(JSONObject jSONObject, String str, int i) {
        double d;
        try {
            if (i == 1) {
                d = JSONObjectProtectorUtils.getDouble(JSONObjectProtectorUtils.getJSONObject(jSONObject, "optimized_info"), str);
            } else {
                d = JSONObjectProtectorUtils.getDouble(jSONObject, str);
            }
            return (float) d;
        } catch (Exception unused) {
            return 0.0f;
        }
    }
}
