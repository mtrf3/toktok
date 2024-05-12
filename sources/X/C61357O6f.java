package X;

import Y.ARunnableS46S0100000_10;
import android.text.TextUtils;
import java.io.File;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: X.O6f, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61357O6f {
    public static volatile C61357O6f LIZIZ;
    public final ConcurrentHashMap<String, String> LIZ = new ConcurrentHashMap<>();

    public static C61357O6f LIZIZ() {
        if (LIZIZ == null) {
            synchronized (C61357O6f.class) {
                if (LIZIZ == null) {
                    LIZIZ = new C61357O6f();
                }
            }
        }
        return LIZIZ;
    }

    public final void LIZLLL() {
        if (!C61359O6h.LJJIIJ) {
            return;
        }
        if (Math.abs(System.currentTimeMillis() - O76.LJI().LIZJ.LIZJ("clear_local_cache_time", 0L)) < Math.min(C61359O6h.LJJIII, 3600000L)) {
            return;
        }
        C61359O6h.LJFF.execute(new ARunnableS46S0100000_10(this, 106));
    }

    public final void LJ() {
        ConcurrentHashMap<String, String> concurrentHashMap = this.LIZ;
        if (concurrentHashMap == null || concurrentHashMap.isEmpty()) {
            return;
        }
        for (Map.Entry<String, String> entry : this.LIZ.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                File file = new File(key);
                if (file.exists() && !O76.LJI().LJIIJ(value)) {
                    C16880lQ.LLLZZIL(file);
                }
            }
        }
        this.LIZ.clear();
    }

    public static void LIZ(String str) {
        File[] listFiles;
        try {
            File file = new File(str);
            if (file.exists() && (listFiles = file.listFiles()) != null && listFiles.length > 0) {
                for (File file2 : listFiles) {
                    long j = C61359O6h.LJJIII;
                    if (file2 != null) {
                        if (j > 0 && System.currentTimeMillis() - file2.lastModified() <= j) {
                        }
                        if (file2.exists()) {
                            C16880lQ.LLLZZIL(file2);
                        }
                    }
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("file ");
                    LIZ.append(str);
                    LIZ.append(" is expired, delete it");
                    X1D.LIZIZ(LIZ);
                }
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static void LIZJ(String str, boolean z) {
        String str2;
        try {
            long LJJ = O5Y.LJJ(new File(str)) / 1024;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key_splash_cache_size", LJJ);
            if (!z) {
                str2 = "service_ad_res_disk_cache_size_in_mb";
            } else {
                str2 = "service_ad_extra_res_disk_cache_size_in_mb";
            }
            O8O.LIZLLL().LJI(str2, jSONObject, null);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
