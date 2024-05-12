package X;

import android.text.TextUtils;
import com.bytedance.crash.CrashType;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PJV extends C64238PJa {
    public static final ConcurrentLinkedQueue<PJU> LIZ = new ConcurrentLinkedQueue<>();
    public static final Object LIZIZ;
    public static String LIZJ;

    static {
        new ConcurrentHashMap();
        LIZIZ = new Object();
    }

    public static String LIZ(Object obj) {
        if (obj == LIZIZ) {
            if (TextUtils.isEmpty(LIZJ)) {
                LIZJ = PK0.LIZIZ().LIZ();
            }
            return LIZJ;
        }
        Iterator<PJU> it = LIZ.iterator();
        while (it.hasNext()) {
            PJU next = it.next();
            if (next != null && next.LIZ == obj) {
                return next.LIZ();
            }
        }
        return null;
    }

    public static JSONArray LIZIZ(Object obj) {
        boolean z;
        JSONArray jSONArray = new JSONArray();
        Iterator<PJU> it = LIZ.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            PJU next = it.next();
            if (next != null) {
                if (next.LIZ == obj) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    CrashType crashType = CrashType.JAVA;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("header", next.LIZLLL());
                        if (crashType != null) {
                            jSONObject.put("custom", next.LIZIZ(crashType));
                            jSONObject.put("filters", next.LIZJ());
                        }
                    } catch (Throwable unused) {
                    }
                    jSONArray.put(jSONObject);
                }
            }
        }
        return jSONArray;
    }

    public static JSONArray LIZJ(Object obj) {
        boolean z;
        JSONArray jSONArray = new JSONArray();
        Iterator<PJU> it = LIZ.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            PJU next = it.next();
            if (next != null) {
                if (next.LIZ == obj) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    CrashType crashType = CrashType.JAVA;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("header", next.LIZLLL());
                        if (crashType != null) {
                            jSONObject.put("custom", next.LIZIZ(crashType));
                            jSONObject.put("filters", next.LIZJ());
                        }
                        jSONObject.put("line_num", (Object) null);
                    } catch (Throwable unused) {
                    }
                    jSONArray.put(jSONObject);
                }
            }
        }
        return jSONArray;
    }
}
