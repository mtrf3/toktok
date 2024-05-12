package X;

import android.content.Context;
import android.support.v4.media.session.PlaybackStateCompat;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.ICommonParams;
import com.bytedance.crash.entity.Header;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class PKN {
    public final JSONObject LIZ;
    public Header LIZIZ;

    public static String LJIIIZ(long j) {
        return j <= 1024 ? "0 - 1K" : j <= 65536 ? "1K - 64K" : j <= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED ? "64K - 512K" : j <= 1048576 ? "512K - 1M" : j <= 67108864 ? "1M - 64M" : "64M - ";
    }

    public final JSONObject LJII() {
        Object opt = this.LIZ.opt("data");
        if (opt instanceof JSONArray) {
            return ((JSONArray) opt).optJSONObject(0);
        }
        return this.LIZ;
    }

    public final Header LJIIIIZZ() {
        if (this.LIZIZ == null) {
            Header header = new Header();
            this.LIZIZ = header;
            LJIIZILJ(header);
        }
        return this.LIZIZ;
    }

    public PKN() {
        this.LIZ = new JSONObject();
    }

    public static boolean LJIIJ() {
        if (new PLN(new File(C78596Usy.LJIJI(PK0.LIZ, PK0.LIZJ()), "meminfo.txt")).LIZ() > PKM.LJ()) {
            return true;
        }
        return false;
    }

    public PKN(JSONObject jSONObject) {
        this.LIZ = jSONObject;
    }

    public final void LJIILLIIL(java.util.Map map) {
        JSONObject jSONObject;
        JSONObject optJSONObject;
        Object opt = this.LIZ.opt("data");
        if (opt instanceof JSONArray) {
            jSONObject = ((JSONArray) opt).optJSONObject(0);
        } else {
            jSONObject = this.LIZ;
        }
        if (jSONObject == null) {
            optJSONObject = new JSONObject();
        } else {
            optJSONObject = jSONObject.optJSONObject("filters");
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
                LJIIJJI("filters", optJSONObject);
            }
        }
        try {
            try {
                for (Map.Entry entry : ((HashMap) map).entrySet()) {
                    PJC.LJIIJ(optJSONObject, (String) entry.getKey(), entry.getValue());
                }
            } catch (Throwable unused) {
                for (Map.Entry entry2 : ((HashMap) map).entrySet()) {
                    PJC.LJIIJ(optJSONObject, (String) entry2.getKey(), entry2.getValue());
                }
            }
        } catch (Throwable unused2) {
        }
        LJIIJJI("filters", optJSONObject);
    }

    public final void LJIIZILJ(Header header) {
        LJIIJJI("header", header.LIZ);
        this.LIZIZ = header;
    }

    public final void LJIJ(JSONObject jSONObject) {
        LJIIJJI("header", jSONObject);
    }

    public final void LJIJI(List list) {
        JSONArray jSONArray = new JSONArray();
        if (list == null || list.isEmpty()) {
            LJIIJJI("patch_info", jSONArray);
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        LJIIJJI("patch_info", jSONArray);
    }

    public final void LJIJJ(ICommonParams iCommonParams) {
        boolean z = C64307PLr.LIZ;
        PJC.LJIIJ(this.LIZ, "mira_init", Boolean.valueOf(z));
        JSONArray jSONArray = null;
        if (z) {
            try {
                java.util.Map<String, Integer> pluginInfo = iCommonParams.getPluginInfo();
                if (pluginInfo != null) {
                    JSONArray jSONArray2 = new JSONArray();
                    try {
                        for (Map.Entry<String, Integer> entry : pluginInfo.entrySet()) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("package_name", entry.getKey());
                            jSONObject.put("version_code", entry.getValue());
                            jSONArray2.put(jSONObject);
                        }
                        jSONArray = jSONArray2;
                    } catch (Throwable th) {
                        th = th;
                        jSONArray = jSONArray2;
                        try {
                            JSONObject jSONObject2 = this.LIZ;
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("Code err:\n");
                            LIZ.append(PKW.LIZJ(th));
                            jSONObject2.put(X1D.LIZIZ(LIZ), 0);
                        } catch (Throwable unused) {
                        }
                        PJC.LJIIJ(this.LIZ, "plugin_info", jSONArray);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        PJC.LJIIJ(this.LIZ, "plugin_info", jSONArray);
    }

    public static void LJI(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null || jSONObject2 == null || jSONObject2.length() <= 0) {
            return;
        }
        try {
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object opt = jSONObject.opt(next);
                if (opt == null) {
                    jSONObject.put(next, jSONObject2.opt(next));
                } else if (opt instanceof JSONObject) {
                    LJI(JSONObjectProtectorUtils.getJSONObject(jSONObject, next), JSONObjectProtectorUtils.getJSONObject(jSONObject2, next));
                } else if (opt instanceof JSONArray) {
                    JSONArray optJSONArray = jSONObject2.optJSONArray(next);
                    if (optJSONArray != null) {
                        JSONArray jSONArray = (JSONArray) opt;
                        if (jSONArray.length() == 1 && (jSONArray.opt(0) instanceof JSONObject) && (optJSONArray.opt(0) instanceof JSONObject)) {
                            LJI(JSONArrayProtectorUtils.getJSONObject(jSONArray, 0), JSONArrayProtectorUtils.getJSONObject(optJSONArray, 0));
                        } else {
                            for (int i = 0; i < optJSONArray.length(); i++) {
                                jSONArray.put(optJSONArray.get(i));
                            }
                        }
                    }
                } else {
                    jSONObject.put(next, jSONObject2.opt(next));
                }
            }
        } catch (JSONException unused) {
        }
    }

    public static void LJIIL(Throwable th, JSONObject jSONObject) {
        try {
            if (jSONObject.opt("npth_err_info") == null) {
                jSONObject.put("npth_err_info", PKW.LIZJ(th));
            } else {
                int i = 0;
                do {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("npth_err_info");
                    LIZ.append(i);
                    if (jSONObject.opt(X1D.LIZIZ(LIZ)) != null) {
                        i++;
                    } else {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("npth_err_info");
                        LIZ2.append(i);
                        jSONObject.put(X1D.LIZIZ(LIZ2), PKW.LIZJ(th));
                    }
                } while (i < 5);
            }
        } catch (Throwable unused) {
        }
    }

    public static void LJIILJJIL(java.util.Map map, JSONObject jSONObject) {
        if (map != null) {
            try {
                for (Map.Entry entry : map.entrySet()) {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static void LJIJJLI(JSONObject jSONObject, JSONObject jSONObject2) {
        PJC.LJIIJ(jSONObject, "storage", jSONObject2);
        long optLong = jSONObject2.optLong("inner_free");
        long optLong2 = jSONObject2.optLong("sdcard_free");
        long optLong3 = jSONObject2.optLong("inner_free_real");
        String LJIIIZ = LJIIIZ(optLong);
        String LJIIIZ2 = LJIIIZ(optLong2);
        String LJIIIZ3 = LJIIIZ(optLong3);
        LJIILIIL(LJIIIZ, "filters", "inner_free", jSONObject);
        LJIILIIL(LJIIIZ3, "filters", "inner_free_real", jSONObject);
        LJIILIIL(LJIIIZ2, "filters", "sdcard_free", jSONObject);
    }

    public final void LIZ(String str, String str2) {
        LJIILIIL(str2, "anr_timestamp", str, this.LIZ);
    }

    public final void LIZIZ(String str, String str2) {
        LJIILIIL(str2, "custom", str, LJII());
    }

    public final void LIZJ(String str, List list) {
        if (list == null) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        JSONObject optJSONObject = this.LIZ.optJSONObject("custom_long");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
            LJIIJJI("custom_long", optJSONObject);
        }
        PJC.LJIIJ(optJSONObject, str, jSONArray);
    }

    public final void LIZLLL(float f, String str) {
        JSONObject jSONObject = this.LIZ;
        if (jSONObject == null) {
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("features_num");
        if (optJSONObject == null) {
            try {
                optJSONObject = new JSONObject();
                jSONObject.put("features_num", optJSONObject);
            } catch (Throwable unused) {
                return;
            }
        }
        optJSONObject.put(str, f);
    }

    public final void LJ(long j, String str) {
        JSONObject jSONObject = this.LIZ;
        if (jSONObject == null) {
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("features_num");
        if (optJSONObject == null) {
            try {
                optJSONObject = new JSONObject();
                jSONObject.put("features_num", optJSONObject);
            } catch (Throwable unused) {
                return;
            }
        }
        optJSONObject.put(str, j);
    }

    public final void LJFF(String str, String str2) {
        LJIILIIL(str2, "filters", str, LJII());
    }

    public final void LJIIJJI(String str, Object obj) {
        PJC.LJIIJ(this.LIZ, str, obj);
    }

    public final void LJIILL(long j, long j2) {
        try {
            LJIIJJI("app_start_time", Long.valueOf(j));
            if (j2 != 0) {
                LJIIJJI("app_start_up_time", Long.valueOf(j2));
            }
            LJIIJJI("app_start_time_readable", new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss", Locale.getDefault()).format(new Date(j)));
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static PKN LJIL(Context context, long j, String str) {
        PKN pkn = new PKN();
        pkn.LJIIJJI("is_dart", 1);
        pkn.LJIIJJI("crash_time", Long.valueOf(j));
        pkn.LJIIJJI("process_name", C64264PKa.LIZJ(context));
        pkn.LJIIJJI("data", str);
        C64264PKa.LJ(context, pkn.LIZ);
        return pkn;
    }

    public static void LJIILIIL(Object obj, String str, String str2, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
            PJC.LJIIJ(jSONObject, str, optJSONObject);
        }
        PJC.LJIIJ(optJSONObject, str2, obj);
    }

    public static PKN LJJ(Context context, String str, String str2, String str3) {
        PKN pkn = new PKN();
        pkn.LJIIJJI("crash_time", Long.valueOf(System.currentTimeMillis()));
        pkn.LJIIJJI("process_name", C64264PKa.LIZJ(context));
        pkn.LJIIJJI("crash_name", str);
        pkn.LJIIJJI("crash_reason", str2);
        pkn.LJIIJJI("data", str3);
        pkn.LJIIJJI("crash_type", CrashType.GAME.getName());
        C64264PKa.LJ(context, pkn.LIZ);
        return pkn;
    }
}
