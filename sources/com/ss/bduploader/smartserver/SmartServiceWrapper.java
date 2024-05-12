package com.ss.bduploader.smartserver;

import X.AbstractC48510J2c;
import X.C46687ITz;
import X.C47322Ihi;
import X.C47333Iht;
import X.C47663InD;
import X.IE2;
import X.IFR;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class SmartServiceWrapper implements SmartServiceInterface {
    public AbstractC48510J2c mMLSDKService;
    public String mMLSDKEngineType = "";
    public String mMLSDKServiceName = "";
    public String mMLSDKOutputType = "";
    public String mIntelligentURL = "";

    @Override // com.ss.bduploader.smartserver.SmartServiceInterface
    public void runAsync(Map map, SmartServiceListener smartServiceListener) {
    }

    @Override // com.ss.bduploader.smartserver.SmartServiceInterface
    public float runAsyncJsonObject(JSONObject jSONObject, SmartServiceListener smartServiceListener) {
        return 0.0f;
    }

    @Override // com.ss.bduploader.smartserver.SmartServiceInterface
    public float runSyncJsonObject(JSONObject jSONObject) {
        return 0.0f;
    }

    @Override // com.ss.bduploader.smartserver.SmartServiceInterface
    public void setIntValue(int i, int i2) {
    }

    @Override // com.ss.bduploader.smartserver.SmartServiceInterface
    public void configServer() {
        if (TextUtils.isEmpty(this.mMLSDKEngineType) || TextUtils.isEmpty(this.mMLSDKOutputType) || TextUtils.isEmpty(this.mMLSDKServiceName) || TextUtils.isEmpty(this.mIntelligentURL)) {
            return;
        }
        C46687ITz c46687ITz = IE2.LIZ;
        if (c46687ITz == null) {
            c46687ITz = IFR.LIZ;
        }
        AbstractC48510J2c LIZ = c46687ITz.LIZ(this.mMLSDKServiceName);
        this.mMLSDKService = LIZ;
        if (LIZ == null) {
            return;
        }
        C47663InD c47663InD = new C47663InD(this.mMLSDKServiceName);
        Map map = (Map) c47663InD.LIZJ;
        if (map == null) {
            map = new HashMap();
            c47663InD.LIZJ = map;
        }
        map.put("engineType", this.mMLSDKEngineType);
        map.put("outputType", this.mMLSDKOutputType);
        map.put("packageUrl", this.mIntelligentURL);
        this.mMLSDKService.LIZJ(c47663InD);
    }

    @Override // com.ss.bduploader.smartserver.SmartServiceInterface
    public void preloadEnv() {
        AbstractC48510J2c abstractC48510J2c = this.mMLSDKService;
        if (abstractC48510J2c != null) {
            abstractC48510J2c.LJI();
        }
    }

    @Override // com.ss.bduploader.smartserver.SmartServiceInterface
    public boolean serviceEnabled() {
        AbstractC48510J2c abstractC48510J2c = this.mMLSDKService;
        if (abstractC48510J2c != null && abstractC48510J2c.LIZLLL()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.bduploader.smartserver.SmartServiceInterface
    public float runSync(Map map) {
        String str;
        Float f;
        C47322Ihi c47322Ihi = new C47322Ihi();
        Map<String, Object> LIZ = c47322Ihi.LIZ();
        for (Object obj : map.keySet()) {
            LIZ.put(obj, map.get(obj));
        }
        AbstractC48510J2c abstractC48510J2c = this.mMLSDKService;
        if (abstractC48510J2c == null || !abstractC48510J2c.LIZLLL()) {
            return -1.0f;
        }
        C47333Iht LJIIIIZZ = this.mMLSDKService.LJIIIIZZ(c47322Ihi);
        String str2 = this.mMLSDKOutputType;
        str2.getClass();
        if (!str2.equals("classify")) {
            if (!str2.equals("regression") || LJIIIIZZ == null || !LJIIIIZZ.LIZ() || (f = LJIIIIZZ.LIZJ) == null) {
                return -1.0f;
            }
            return f.floatValue();
        }
        if (LJIIIIZZ == null || !LJIIIIZZ.LIZ() || (str = LJIIIIZZ.LIZ) == null) {
            return -1.0f;
        }
        if ("false".equals(str)) {
            return 0.0f;
        }
        if (!"true".equals(str)) {
            return -1.0f;
        }
        return 1.0f;
    }

    @Override // com.ss.bduploader.smartserver.SmartServiceInterface
    public int getIntelligentInput(JSONObject jSONObject, C47322Ihi c47322Ihi) {
        Map<String, Object> LIZ = c47322Ihi.LIZ();
        try {
            if (JSONObjectProtectorUtils.getJSONObject(jSONObject, "optimized_info") != null) {
                if (JSONObjectProtectorUtils.getInt(jSONObject, "origin_speed_test") > 0) {
                    LIZ.put("origin_speed_test", Float.valueOf(parseIntelligentInputFloat(jSONObject, "origin_speed_test", 0)));
                    LIZ.put("init_rtt", Double.valueOf(parseIntelligentInputFloat(jSONObject, "init_rtt", 1) / 1000.0d));
                    LIZ.put("close_rtt", Double.valueOf(parseIntelligentInputFloat(jSONObject, "close_rtt", 1) / 1000.0d));
                    LIZ.put("mss", Float.valueOf(parseIntelligentInputFloat(jSONObject, "mss", 1)));
                    LIZ.put("inner_time", Double.valueOf(parseIntelligentInputFloat(jSONObject, "inner", 1) / 1000.0d));
                    LIZ.put("origin_time", Double.valueOf(parseIntelligentInputFloat(jSONObject, "origin", 1) / 1000.0d));
                    String parseIntelligentInputString = parseIntelligentInputString(jSONObject, "apply_start", 0);
                    String parseIntelligentInputString2 = parseIntelligentInputString(jSONObject, "apply_end", 0);
                    if (!parseIntelligentInputString2.isEmpty() && !parseIntelligentInputString.isEmpty()) {
                        float longValue = (float) (CastLongProtector.valueOf(parseIntelligentInputString2).longValue() - CastLongProtector.valueOf(parseIntelligentInputString).longValue());
                        if (longValue < 0.0f) {
                            return -1;
                        }
                        LIZ.put("apply_duration", Float.valueOf(longValue));
                        String parseIntelligentInputString3 = parseIntelligentInputString(jSONObject, "node_type", 0);
                        parseIntelligentInputString3.getClass();
                        if (!parseIntelligentInputString3.equals("Origin")) {
                            if (!parseIntelligentInputString3.equals("Edge")) {
                                LIZ.put("node_type", Float.valueOf(0.0f));
                            } else {
                                LIZ.put("node_type", Float.valueOf(1.0f));
                            }
                        } else {
                            LIZ.put("node_type", Float.valueOf(2.0f));
                        }
                        return 0;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return -1;
    }

    @Override // com.ss.bduploader.smartserver.SmartServiceInterface
    public void setStringValue(int i, String str) {
        switch (i) {
            case 1000:
                this.mMLSDKEngineType = str;
                return;
            case 1001:
                this.mMLSDKServiceName = str;
                return;
            case 1002:
                this.mMLSDKOutputType = str;
                return;
            case 1003:
                this.mIntelligentURL = str;
                return;
            default:
                return;
        }
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
