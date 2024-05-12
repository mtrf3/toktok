package X;

import android.text.TextUtils;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PGU extends PGP {
    public static final int LJLJLJ = Runtime.getRuntime().availableProcessors();
    public static boolean LJLJLLL = false;
    public static int LJLL = 300;
    public static boolean LJLLI = false;
    public static boolean LJLLILLLL = false;
    public long LJLJL = 600000;

    @Override // X.PGP
    public final boolean LJIIJ() {
        return true;
    }

    @Override // X.PGP
    public final void LJIIL() {
        if (LJLLI && LJLLILLLL && System.currentTimeMillis() - C09970aH.LIZJ() > 1200000) {
            try {
                int length = new File("/proc/self/task/").list().length;
                if (length != 0) {
                    ThreadGroup threadGroup = C16880lQ.LLJJJJ().getThread().getThreadGroup();
                    while (threadGroup.getParent() != null) {
                        threadGroup = threadGroup.getParent();
                    }
                    F9U.LIZ.LIZJ(new PGV(new int[]{threadGroup.activeCount()}, length, threadGroup));
                }
            } catch (Throwable unused) {
            }
        }
    }

    public PGU() {
        this.LJLJJL = "thread";
    }

    @Override // X.PGP, X.InterfaceC64103PDv
    public final void LIZ() {
        super.LIZ();
        LJLJLLL = true;
    }

    @Override // X.PGP
    public final long LJIILJJIL() {
        return this.LJLJL;
    }

    @Override // X.PGP
    public final void LJIIIIZZ(JSONObject jSONObject) {
        boolean z;
        boolean z2 = false;
        if (jSONObject.optInt("enable_thread_collect", 0) == 1) {
            z = true;
        } else {
            z = false;
        }
        LJLLI = z;
        if (jSONObject.optInt("enable_upload", 0) == 1) {
            z2 = true;
        }
        LJLLILLLL = z2;
        LJLL = jSONObject.optInt("thread_count_threshold", 300);
        this.LJLJL = jSONObject.optLong("collect_interval", 10L) * 60000;
    }

    public static JSONObject LJIILL(int i, int i2, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        if (i > 0) {
            try {
                jSONObject.put("total_thread_count", i);
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        jSONObject.put("java_thread_count", i2);
        if (!TextUtils.isEmpty(str)) {
            jSONObject.put(WM7.SCENE_SERVICE, str);
        }
        if (!TextUtils.isEmpty(str2)) {
            jSONObject.put("thread_detail", str2);
        }
        jSONObject.put("is_main_process", C09970aH.LJIIIIZZ());
        jSONObject.put("cpu_count", LJLJLJ);
        jSONObject.put("process_name", C09970aH.LIZIZ());
        return jSONObject;
    }
}
