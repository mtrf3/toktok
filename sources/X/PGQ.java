package X;

import android.os.Debug;
import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PGQ implements PGD {
    public static volatile PGQ LJI;
    public final CopyOnWriteArraySet<String> LIZ = new CopyOnWriteArraySet<>();
    public final ConcurrentHashMap<String, String> LIZIZ = new ConcurrentHashMap<>();
    public long LIZJ;
    public boolean LIZLLL;
    public long LJ;
    public long LJFF;

    public static PGQ LIZ() {
        if (LJI == null) {
            synchronized (PGQ.class) {
                if (LJI == null) {
                    LJI = new PGQ();
                }
            }
        }
        return LJI;
    }

    public final JSONObject LIZIZ() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, String> entry : this.LIZIZ.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final JSONObject LIZLLL() {
        boolean z;
        try {
            JSONObject jSONObject = new JSONObject();
            this.LIZJ = Debug.getNativeHeapAllocatedSize() / 1048576;
            Runtime runtime = Runtime.getRuntime();
            long maxMemory = runtime.maxMemory();
            long freeMemory = runtime.freeMemory();
            long j = runtime.totalMemory();
            this.LJ = maxMemory / 1048576;
            long j2 = j - freeMemory;
            this.LJFF = j2 / 1048576;
            if (((float) j2) > ((float) maxMemory) * 0.95f) {
                z = true;
            } else {
                z = false;
            }
            this.LIZLLL = z;
            jSONObject.put("apm_native_heap_size", this.LIZJ);
            jSONObject.put("apm_java_heap_leak", this.LIZLLL);
            jSONObject.put("apm_java_heap_used", this.LJFF);
            jSONObject.put("apm_java_heap_max", this.LJ);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public final String LJ() {
        String LJIIIZ = C78915Uy7.LJIIIZ(this.LIZ.toArray());
        if (!TextUtils.isEmpty(LJIIIZ)) {
            return LJIIIZ;
        }
        PG9 pg9 = (PG9) PGH.LIZ(PG9.class);
        if (pg9 != null) {
            return pg9.LIZLLL();
        }
        return "";
    }

    public final JSONObject LIZJ(boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, String> entry : this.LIZIZ.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            jSONObject.put("RealRefreshRate", String.valueOf(PH9.LJ));
            jSONObject.put("RealMaxRefreshRate", String.valueOf(PH9.LJ));
            if (z) {
                C39712FiG c39712FiG = C39715FiJ.LIZ;
                if (c39712FiG.LIZ) {
                    try {
                        c39712FiG.LIZIZ(jSONObject);
                    } catch (JSONException unused) {
                    }
                }
                c39712FiG.LIZ(jSONObject);
            }
        } catch (JSONException unused2) {
        }
        return jSONObject;
    }
}
