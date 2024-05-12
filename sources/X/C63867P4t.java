package X;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.P4t, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C63867P4t {
    public static Thread LIZ;
    public static volatile boolean LIZIZ;
    public static final Object LIZJ = new Object();
    public static boolean LIZLLL = false;

    public static Sensor LIZIZ(SensorManager sensorManager, int i) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Integer.valueOf(i)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(I)Landroid/hardware/Sensor;", "2491821924792992587");
        C39519Ff9 LIZJ2 = c03880Dg.LIZJ(100703, "android/hardware/SensorManager", "getDefaultSensor", sensorManager, objArr, "android.hardware.Sensor", c65300Pk0);
        if (LIZJ2.LIZ) {
            c03880Dg.LIZIZ(100703, "android/hardware/SensorManager", "getDefaultSensor", null, objArr, sensorManager, c65300Pk0, false);
            return (Sensor) LIZJ2.LIZIZ;
        }
        Sensor defaultSensor = sensorManager.getDefaultSensor(i);
        c03880Dg.LIZIZ(100703, "android/hardware/SensorManager", "getDefaultSensor", defaultSensor, objArr, sensorManager, c65300Pk0, true);
        return defaultSensor;
    }

    public static void LIZ() {
        if (LIZLLL && !LIZIZ) {
            synchronized (LIZJ) {
                while (!LIZIZ) {
                    try {
                        System.currentTimeMillis();
                        LIZJ.wait();
                    } catch (InterruptedException e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
            }
        }
    }

    public static String LIZJ(String str) {
        JSONObject jSONObject;
        LIZ();
        C64009PAf LIZ2 = C64017PAn.LIZ();
        if (LIZ2 != null && (jSONObject = LIZ2.LIZIZ) != null) {
            try {
                return JSONObjectProtectorUtils.getString(jSONObject, str);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public static void LJ(Context context) {
        boolean z;
        String str;
        boolean z2;
        String str2;
        boolean z3;
        String str3;
        boolean z4;
        String str4;
        HashMap hashMap = new HashMap();
        SensorManager sensorManager = (SensorManager) C16880lQ.LLILL(context, "sensor");
        Sensor LIZIZ2 = LIZIZ(sensorManager, 4);
        boolean z5 = false;
        if (LIZIZ2 != null) {
            z = true;
        } else {
            z = false;
        }
        hashMap.put("te_sensor_type_gyroscope_exist", Boolean.valueOf(z));
        String str5 = null;
        if (LIZIZ2 != null) {
            str = LIZIZ2.getName();
        } else {
            str = null;
        }
        hashMap.put("te_sensor_type_gyroscope_name", str);
        Sensor LIZIZ3 = LIZIZ(sensorManager, 15);
        if (LIZIZ3 != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        hashMap.put("te_sensor_type_game_rotation_vector_exist", Boolean.valueOf(z2));
        if (LIZIZ3 != null) {
            str2 = LIZIZ3.getName();
        } else {
            str2 = null;
        }
        hashMap.put("te_sensor_type_game_rotation_vector_name", str2);
        Sensor LIZIZ4 = LIZIZ(sensorManager, 11);
        if (LIZIZ4 != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        hashMap.put("te_sensor_type_rotation_vector_exist", Boolean.valueOf(z3));
        if (LIZIZ4 != null) {
            str3 = LIZIZ4.getName();
        } else {
            str3 = null;
        }
        hashMap.put("te_sensor_type_rotation_vector_name", str3);
        Sensor LIZIZ5 = LIZIZ(sensorManager, 9);
        if (LIZIZ5 != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        hashMap.put("te_sensor_type_gravity_exist", Boolean.valueOf(z4));
        if (LIZIZ5 != null) {
            str4 = LIZIZ5.getName();
        } else {
            str4 = null;
        }
        hashMap.put("te_sensor_type_gravity_name", str4);
        Sensor LIZIZ6 = LIZIZ(sensorManager, 1);
        if (LIZIZ6 != null) {
            z5 = true;
        }
        hashMap.put("te_sensor_type_accelerometer_exist", Boolean.valueOf(z5));
        if (LIZIZ6 != null) {
            str5 = LIZIZ6.getName();
        }
        hashMap.put("te_sensor_type_accelerometer_name", str5);
        C63868P4u.LIZJ("iesve_veeditor_sensor_report", "iesve_veeditor_sensor_report", hashMap);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(6:14|15|(2:18|16)|19|6|(2:8|9)(1:11))|3|4|5|6|(0)(0)) */
    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(java.lang.String r5, X.C63870P4w r6) {
        /*
            LIZ()
            r4 = 0
            if (r6 != 0) goto L8
        L6:
            r3 = r4
            goto L33
        L8:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> L6
            r3.<init>()     // Catch: java.lang.Exception -> L6
            java.util.Map<java.lang.String, java.lang.String> r0 = r6.LIZ     // Catch: java.lang.Exception -> L6
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch: java.lang.Exception -> L6
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Exception -> L6
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Exception -> L6
        L19:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Exception -> L6
            if (r0 == 0) goto L39
            java.lang.Object r0 = r2.next()     // Catch: java.lang.Exception -> L6
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Exception -> L6
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Exception -> L6
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L6
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L6
            r3.put(r1, r0)     // Catch: java.lang.Exception -> L6
            goto L19
        L33:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L39
            r0.<init>()     // Catch: java.lang.Exception -> L39
            r3 = r0
        L39:
            X.PAf r0 = X.C64017PAn.LIZ()
            if (r0 == 0) goto L47
            X.PAf r1 = X.C64017PAn.LIZ()
            r0 = 1
            r1.LJIILIIL(r5, r0, r3, r4)
        L47:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63867P4t.LIZLLL(java.lang.String, X.P4w):void");
    }

    public static void LJFF(String str, String str2) {
        JSONObject jSONObject;
        LIZ();
        C64009PAf LIZ2 = C64017PAn.LIZ();
        if (LIZ2 == null || (jSONObject = LIZ2.LIZIZ) == null) {
            return;
        }
        try {
            jSONObject.put(str, str2);
        } catch (JSONException unused) {
        }
    }
}
