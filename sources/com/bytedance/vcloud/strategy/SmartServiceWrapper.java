package com.bytedance.vcloud.strategy;

import X.AbstractC48510J2c;
import X.C46687ITz;
import X.C47322Ihi;
import X.C47333Iht;
import X.C47663InD;
import X.IE2;
import X.IFR;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class SmartServiceWrapper {
    public AbstractC48510J2c mSmartServiceInstance;

    public float getLastResult() {
        C47333Iht LJFF;
        Float f;
        AbstractC48510J2c abstractC48510J2c = this.mSmartServiceInstance;
        if (abstractC48510J2c != null && abstractC48510J2c.LJ() && (LJFF = this.mSmartServiceInstance.LJFF()) != null && LJFF.LIZ() && (f = LJFF.LIZJ) != null) {
            return f.floatValue();
        }
        return -1.0f;
    }

    public void preloadEnv() {
        AbstractC48510J2c abstractC48510J2c = this.mSmartServiceInstance;
        if (abstractC48510J2c != null) {
            abstractC48510J2c.LJI();
        }
    }

    public Boolean configServer(String str) {
        C46687ITz c46687ITz = IE2.LIZ;
        if (c46687ITz == null) {
            c46687ITz = IFR.LIZ;
        }
        AbstractC48510J2c LIZ = c46687ITz.LIZ("vod_smart_speed");
        this.mSmartServiceInstance = LIZ;
        if (LIZ != null) {
            C47663InD c47663InD = new C47663InD("vod_smart_speed");
            Map map = (Map) c47663InD.LIZJ;
            if (map == null) {
                map = new HashMap();
                c47663InD.LIZJ = map;
            }
            map.put("engineType", "mlsdk");
            map.put("outputType", "regression");
            map.put("packageUrl", str);
            this.mSmartServiceInstance.LIZJ(c47663InD);
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public float[] jsonArray2FloatArray(JSONArray jSONArray) {
        float[] fArr = new float[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            fArr[i] = (float) jSONArray.optDouble(i, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
        }
        return fArr;
    }

    public float predictSmartSlice(JSONObject jSONObject) {
        AbstractC48510J2c abstractC48510J2c;
        C47333Iht LJIIIIZZ;
        Float f;
        C47322Ihi c47322Ihi = new C47322Ihi();
        if (-1 == getIntelligentInput(jSONObject, c47322Ihi) || (abstractC48510J2c = this.mSmartServiceInstance) == null || (LJIIIIZZ = abstractC48510J2c.LJIIIIZZ(c47322Ihi)) == null || !LJIIIIZZ.LIZ() || (f = LJIIIIZZ.LIZJ) == null) {
            return -1.0f;
        }
        return f.floatValue();
    }

    public int getIntelligentInput(JSONObject jSONObject, C47322Ihi c47322Ihi) {
        Map<String, Object> LIZ = c47322Ihi.LIZ();
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                if ((obj instanceof JSONArray) && ((JSONArray) obj).length() > 0) {
                    LIZ.put(next, jsonArray2FloatArray((JSONArray) obj));
                } else {
                    LIZ.put(next, obj);
                }
            }
            return 0;
        } catch (JSONException unused) {
            return -1;
        }
    }

    public float parseIntelligentInputFromJson(JSONObject jSONObject, String str) {
        try {
            return (float) JSONObjectProtectorUtils.getDouble(jSONObject, str);
        } catch (JSONException unused) {
            return 0.0f;
        }
    }
}
