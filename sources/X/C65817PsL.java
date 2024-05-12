package X;

import Y.ARunnableS11S0301000_11;
import Y.ARunnableS17S0101000_13;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.facebook.GraphRequest;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;
import m43.u;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.PsL, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65817PsL {
    public static final C65817PsL LIZ = new C65817PsL();
    public static final AtomicBoolean LIZIZ;
    public static final ConcurrentLinkedQueue<InterfaceC65818PsM> LIZJ;
    public static final java.util.Map<String, JSONObject> LIZLLL;
    public static Long LJ;
    public static QM9 LJFF;

    static {
        C65352Pkq.LIZ(C65817PsL.class).LJFF();
        LIZIZ = new AtomicBoolean(false);
        LIZJ = new ConcurrentLinkedQueue<>();
        LIZLLL = new ConcurrentHashMap();
    }

    public static JSONObject LIZ() {
        Bundle LIZ2 = C0H1.LIZ("platform", "android");
        C16880lQ.LLILII();
        LIZ2.putString("sdk_version", "13.1.0");
        LIZ2.putString("fields", "gatekeepers");
        String LLLZ = C16880lQ.LLLZ("app/%s", Arrays.copyOf(new Object[]{"mobile_sdk_gk"}, 1));
        o.LJIIIIZZ(LLLZ, "java.lang.String.format(format, *args)");
        GraphRequest LJI = C66388Q3s.LJI(null, LLLZ, null);
        LJI.LIZJ = LIZ2;
        JSONObject jSONObject = LJI.LIZJ().LJ;
        if (jSONObject == null) {
            return new JSONObject();
        }
        return jSONObject;
    }

    public static void LIZLLL() {
        Handler handler = new Handler(C16880lQ.LLJJJJ());
        while (true) {
            ConcurrentLinkedQueue<InterfaceC65818PsM> concurrentLinkedQueue = LIZJ;
            if (!concurrentLinkedQueue.isEmpty()) {
                InterfaceC65818PsM poll = concurrentLinkedQueue.poll();
                if (poll != null) {
                    handler.post(new ARunnableS17S0101000_13(1, poll, 11));
                }
            } else {
                return;
            }
        }
    }

    public static final synchronized void LIZIZ(C65842Psk c65842Psk) {
        synchronized (C65817PsL.class) {
            if (c65842Psk != null) {
                LIZJ.add(c65842Psk);
            }
            String LIZLLL2 = u.LIZLLL();
            C65817PsL c65817PsL = LIZ;
            Long l = LJ;
            c65817PsL.getClass();
            if (l != null && System.currentTimeMillis() - l.longValue() < 3600000 && ((ConcurrentHashMap) LIZLLL).containsKey(LIZLLL2)) {
                LIZLLL();
                return;
            }
            Context LIZJ2 = u.LIZJ();
            String LLLZ = C16880lQ.LLLZ("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{LIZLLL2}, 1));
            o.LJIIIIZZ(LLLZ, "java.lang.String.format(format, *args)");
            String string = F9J.LIZIZ(LIZJ2, 0, "com.facebook.internal.preferences.APP_GATEKEEPERS").getString(LLLZ, null);
            if (!C66373Q3d.LJIJJ(string)) {
                try {
                    LIZJ(LIZLLL2, new JSONObject(string));
                } catch (JSONException unused) {
                }
            }
            Executor LJ2 = u.LJ();
            if (!LIZIZ.compareAndSet(false, true)) {
                return;
            }
            LJ2.execute(new ARunnableS11S0301000_11(LIZJ2, LIZLLL2, LLLZ, 0));
        }
    }

    public static final synchronized JSONObject LIZJ(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject optJSONObject;
        synchronized (C65817PsL.class) {
            jSONObject2 = (JSONObject) ((ConcurrentHashMap) LIZLLL).get(str);
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("data");
            int i = 0;
            if (optJSONArray != null) {
                optJSONObject = optJSONArray.optJSONObject(0);
            } else {
                optJSONObject = null;
            }
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            JSONArray optJSONArray2 = optJSONObject.optJSONArray("gatekeepers");
            if (optJSONArray2 == null) {
                optJSONArray2 = new JSONArray();
            }
            int length = optJSONArray2.length();
            if (length > 0) {
                while (true) {
                    int i2 = i + 1;
                    try {
                        JSONObject jSONObject3 = optJSONArray2.getJSONObject(i);
                        jSONObject2.put(jSONObject3.getString("key"), jSONObject3.getBoolean("value"));
                    } catch (JSONException unused) {
                    }
                    if (i2 >= length) {
                        break;
                    }
                    i = i2;
                }
            }
            ((ConcurrentHashMap) LIZLLL).put(str, jSONObject2);
        }
        return jSONObject2;
    }
}
