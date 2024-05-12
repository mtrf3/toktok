package com.benchmark.strategy.nativePort;

import X.C32771Qj;
import X.X1D;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import defpackage.i0;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ByteBenchFeatureCenterPort {
    public static native void native_registerComponent(String str);

    public static native void native_registerFeaturePool(String str, String str2);

    public static native void native_setEventSource(String str);

    public static native void native_unregisterFeaturePool(String str, String str2);

    public static native void native_unregisterFeaturePoolAll(String str);

    public static native void native_updateNumberFeatureValue(String str, double d);

    public static native void native_updateStrFeatureValue(String str, String str2);

    static {
        new HashMap();
    }

    public static void LIZ(JSONObject jSONObject) {
        if (!C32771Qj.LIZIZ) {
            return;
        }
        native_registerFeaturePool("shoot_page", jSONObject.toString());
    }

    public static void LIZJ(List list) {
        if (!C32771Qj.LIZIZ || list.isEmpty()) {
            return;
        }
        String str = (String) ListProtector.get(list, 0);
        for (int i = 1; i < list.size(); i++) {
            String LJFF = i0.LJFF(str, ",");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(LJFF);
            LIZ.append((String) ListProtector.get(list, i));
            str = X1D.LIZIZ(LIZ);
        }
        native_unregisterFeaturePool("shoot_page", str);
    }

    public static void LIZIZ(String str, JSONObject jSONObject) {
        if (!C32771Qj.LIZIZ) {
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("event_name", str);
            jSONObject2.putOpt("params", jSONObject);
            native_setEventSource(jSONObject2.toString());
        } catch (Exception unused) {
        }
    }
}
