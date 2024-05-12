package com.benchmark.presenter;

import X.C09590Zf;
import X.C16880lQ;
import X.C79146V4k;
import android.content.Context;
import android.hardware.Sensor;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes19.dex */
public class SensorInfoBridge {
    private String keyToString(int i) {
        if (i == 12) {
            return "relative_humidity";
        }
        if (i == 13) {
            return "temperature";
        }
        if (i == 18) {
            return "step_detector";
        }
        if (i == 19) {
            return "step_counter";
        }
        switch (i) {
            case 1:
                return "accelerometer";
            case 2:
                return "magnetic_field";
            case 3:
                return "orientation";
            case 4:
                return "gyroscope";
            case 5:
                return "light";
            case 6:
                return "pressure";
            case 7:
                return "temperature";
            case 8:
                return "proximity";
            case 9:
                return "gravity";
            case 10:
                return "linear_acceleration";
            default:
                return "other";
        }
    }

    public String getSensorInfo() {
        List<Sensor> LJJIJIIJIL;
        Context context = C09590Zf.LJIILLIIL.LIZ;
        if (context == null || C16880lQ.LLILL(context, "sensor") == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            LJJIJIIJIL = C79146V4k.LJJIJIIJIL();
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        if (LJJIJIIJIL == null) {
            return null;
        }
        for (Sensor sensor : LJJIJIIJIL) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("name", sensor.getName());
            jSONObject2.put("maxRange", sensor.getMaximumRange());
            jSONObject2.put("minDelay", sensor.getMinDelay());
            jSONObject2.put("power", sensor.getPower());
            jSONObject2.put("resolution", sensor.getResolution());
            jSONObject2.put("type", sensor.getType());
            jSONObject2.put("vendor", sensor.getVendor());
            jSONObject2.put("version", sensor.getVersion());
            String valueOf = String.valueOf(sensor.getType());
            if (!jSONObject.has(valueOf)) {
                jSONObject.put(valueOf, new JSONArray());
            }
            JSONObjectProtectorUtils.getJSONArray(jSONObject, valueOf).put(jSONObject2);
        }
        return jSONObject.toString();
    }
}
