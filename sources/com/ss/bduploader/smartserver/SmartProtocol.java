package com.ss.bduploader.smartserver;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class SmartProtocol extends SmartAbstract {
    public SmartServiceInterface mIntelligentService;
    public int mSpeedTestUseVCN = -1;
    public String mIntelligentURL = "";

    @Override // com.ss.bduploader.smartserver.SmartAbstract
    public void configServer() {
        this.mIntelligentService.setStringValue(1000, "mlsdk");
        this.mIntelligentService.setStringValue(1001, "smart_upload_protocol");
        this.mIntelligentService.setStringValue(1002, "classify");
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
            if (JSONObjectProtectorUtils.getJSONObject(jSONObject, "optimized_info") != null) {
                if (JSONObjectProtectorUtils.getInt(jSONObject, "origin_speed_test") > 0) {
                    hashMap.put("origin_speed_test", Float.valueOf(parseIntelligentInputFloat(jSONObject, "origin_speed_test", 0)));
                    hashMap.put("init_rtt", Double.valueOf(parseIntelligentInputFloat(jSONObject, "init_rtt", 1) / 1000.0d));
                    hashMap.put("close_rtt", Double.valueOf(parseIntelligentInputFloat(jSONObject, "close_rtt", 1) / 1000.0d));
                    hashMap.put("mss", Float.valueOf(parseIntelligentInputFloat(jSONObject, "mss", 1)));
                    hashMap.put("inner_time", Double.valueOf(parseIntelligentInputFloat(jSONObject, "inner", 1) / 1000.0d));
                    hashMap.put("origin_time", Double.valueOf(parseIntelligentInputFloat(jSONObject, "origin", 1) / 1000.0d));
                    String parseIntelligentInputString = parseIntelligentInputString(jSONObject, "apply_start", 0);
                    String parseIntelligentInputString2 = parseIntelligentInputString(jSONObject, "apply_end", 0);
                    if (!parseIntelligentInputString2.isEmpty() && !parseIntelligentInputString.isEmpty()) {
                        float longValue = (float) (CastLongProtector.valueOf(parseIntelligentInputString2).longValue() - CastLongProtector.valueOf(parseIntelligentInputString).longValue());
                        if (longValue < 0.0f) {
                            return null;
                        }
                        hashMap.put("apply_duration", Float.valueOf(longValue));
                        String parseIntelligentInputString3 = parseIntelligentInputString(jSONObject, "node_type", 0);
                        parseIntelligentInputString3.getClass();
                        if (!parseIntelligentInputString3.equals("Origin")) {
                            if (!parseIntelligentInputString3.equals("Edge")) {
                                hashMap.put("node_type", Float.valueOf(0.0f));
                            } else {
                                hashMap.put("node_type", Float.valueOf(1.0f));
                            }
                        } else {
                            hashMap.put("node_type", Float.valueOf(2.0f));
                        }
                        return hashMap;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    @Override // com.ss.bduploader.smartserver.SmartAbstract
    public void parseUrl(String str) {
        try {
            this.mIntelligentURL = JSONObjectProtectorUtils.getString(new JSONObject(str), "intelligent_protocol_url");
        } catch (Exception unused) {
            this.mIntelligentURL = "";
        }
    }

    @Override // com.ss.bduploader.smartserver.SmartAbstract
    public int predictClassificationSync(JSONObject jSONObject) {
        Map intelligentInput;
        if (!this.mIntelligentService.serviceEnabled() || (intelligentInput = getIntelligentInput(jSONObject)) == null) {
            return -1;
        }
        return (int) this.mIntelligentService.runSync(intelligentInput);
    }

    @Override // com.ss.bduploader.smartserver.SmartAbstract
    public void setUrl(String str) {
        this.mIntelligentURL = str;
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

    private String parseIntelligentInputString(JSONObject jSONObject, String str, int i) {
        String string;
        try {
            if (i == 1) {
                string = JSONObjectProtectorUtils.getString(JSONObjectProtectorUtils.getJSONObject(jSONObject, "optimized_info"), str);
            } else {
                string = JSONObjectProtectorUtils.getString(jSONObject, str);
            }
            return string;
        } catch (Exception unused) {
            return "";
        }
    }
}
