package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewNetworkSpeedThresholdSetting;
import com.bytedance.apm.net.DefaultHttpServiceImpl;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.services.apm.api.IHttpService;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0aH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C09970aH {
    public static Context LIZ;
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static long LIZLLL;
    public static long LJ;
    public static long LJIILIIL;
    public static long LJIILJJIL;
    public static String LJIILL;
    public static boolean LJIILLIIL;
    public static boolean LJIIZILJ;
    public static boolean LJIJ;
    public static List<String> LJIJJ;
    public static String LJIJJLI;
    public static C09980aI LJIL;
    public static JSONObject LJFF = new JSONObject();
    public static PEV LJI = new TMC();
    public static java.util.Map<String, String> LJII = Collections.emptyMap();
    public static IHttpService LJIIIIZZ = new DefaultHttpServiceImpl();
    public static long LJIIIZ = -1;
    public static volatile int LJIIJ = -1;
    public static boolean LJIIJJI = true;
    public static final boolean LJIIL = true;
    public static final boolean LJIJI = true;
    public static boolean LJJ = false;
    public static InterfaceC58333Muv LJJI = null;

    public static String LIZIZ() {
        if (TextUtils.isEmpty(LJIILL)) {
            LJIILL = C79234V7u.LJIIZILJ(Process.myPid());
        }
        return LJIILL;
    }

    public static long LIZJ() {
        if (LJIILJJIL == 0) {
            LJIILJJIL = System.currentTimeMillis();
        }
        return LJIILJJIL;
    }

    public static synchronized C09980aI LIZLLL() {
        C09980aI c09980aI;
        synchronized (C09970aH.class) {
            c09980aI = LJIL;
        }
        return c09980aI;
    }

    public static synchronized java.util.Map<String, String> LJ() {
        java.util.Map<String, String> LIZ2;
        synchronized (C09970aH.class) {
            InterfaceC58333Muv interfaceC58333Muv = LJJI;
            if (interfaceC58333Muv != null && (LIZ2 = interfaceC58333Muv.LIZ()) != null && LIZ2.size() > 0) {
                HashMap hashMap = new HashMap(LJII);
                hashMap.putAll(LIZ2);
                return hashMap;
            }
            return LJII;
        }
    }

    public static long LJFF() {
        if (LJIIIZ == -1) {
            long currentTimeMillis = System.currentTimeMillis();
            LJIIIZ = currentTimeMillis;
            LJIILJJIL = currentTimeMillis;
        }
        return LJIIIZ;
    }

    public static boolean LJII() {
        if (!LIZIZ) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
    
        if (r2.equals(X.C09970aH.LIZ.getPackageName()) != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJIIIIZZ() {
        /*
            boolean r0 = X.C09970aH.LJIILLIIL
            r3 = 1
            if (r0 == 0) goto L6
            return r3
        L6:
            android.content.Context r0 = X.C09970aH.LIZ
            if (r0 != 0) goto Lf
            boolean r0 = LJIIIZ()
            return r0
        Lf:
            java.lang.String r2 = LIZIZ()
            r1 = 0
            if (r2 == 0) goto L23
            java.lang.String r0 = ":"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L25
            X.C09970aH.LJIILLIIL = r1
        L20:
            boolean r0 = X.C09970aH.LJIILLIIL
            return r0
        L23:
            r3 = 0
            goto L31
        L25:
            android.content.Context r0 = X.C09970aH.LIZ
            java.lang.String r0 = r0.getPackageName()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L23
        L31:
            X.C09970aH.LJIILLIIL = r3
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09970aH.LJIIIIZZ():boolean");
    }

    public static boolean LJIIIZ() {
        String LIZIZ2;
        if (LJIILLIIL || (LIZIZ2 = LIZIZ()) == null || !LIZIZ2.contains(":")) {
            return true;
        }
        return false;
    }

    public static String LJI(long j) {
        long j2 = j - LJIILJJIL;
        if (j2 < 30000) {
            return "0 - 30s";
        }
        if (j2 < 60000) {
            return "30s - 1min";
        }
        if (j2 < 120000) {
            return "1min - 2min";
        }
        if (j2 < LivePreviewNetworkSpeedThresholdSetting.DEFAULT) {
            return "2min - 5min";
        }
        if (j2 < 600000) {
            return "5min - 10min";
        }
        if (j2 < 1800000) {
            return "10min - 30min";
        }
        if (j2 < 3600000) {
            return "30min - 1h";
        }
        return "1h - ";
    }

    public static synchronized void LJIIJ(PEV pev) {
        synchronized (C09970aH.class) {
            LJI = pev;
            java.util.Map<String, String> commonParams = pev.getCommonParams();
            LJII = commonParams;
            if (commonParams == null) {
                LJII = new HashMap();
            }
            if (!LJII.containsKey("aid")) {
                LJII.put("aid", LJFF.optString("aid"));
            }
            if (!LJII.containsKey("app_id")) {
                LJII.put("app_id", LJFF.optString("aid"));
            }
            if (!LJII.containsKey("device_id")) {
                LJII.put("device_id", LJFF.optString("device_id"));
            }
            if (!LJII.containsKey("device_platform")) {
                LJII.put("device_platform", "android");
            }
            LJII.put("os", "Android");
            if (!LJII.containsKey("update_version_code")) {
                LJII.put("update_version_code", LJFF.optString("update_version_code"));
            }
            if (!LJII.containsKey("version_code")) {
                LJII.put("version_code", LJFF.optString("version_code"));
            }
            if (!LJII.containsKey("channel")) {
                LJII.put("channel", LJFF.optString("channel"));
            }
            if (!LJII.containsKey("os_api")) {
                java.util.Map<String, String> map = LJII;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(Build.VERSION.SDK_INT);
                LIZ2.append("");
                map.put("os_api", X1D.LIZIZ(LIZ2));
            }
            if (LJII() && !LJII.containsKey("_log_level")) {
                LJII.put("_log_level", "debug");
            }
            if (LJIL == null) {
                LJIL = new C09980aI();
            }
            LJIL.LJIIIZ = new HashMap(LJII);
        }
    }

    public static synchronized void LJIIJJI(JSONObject jSONObject) {
        PackageInfo packageInfo;
        synchronized (C09970aH.class) {
            try {
                if (LJIL == null) {
                    LJIL = new C09980aI();
                }
                jSONObject.put("os", "Android");
                jSONObject.put("device_platform", "android");
                jSONObject.put("os_version", Build.VERSION.RELEASE);
                jSONObject.put("os_api", Build.VERSION.SDK_INT);
                jSONObject.put("device_model", Build.MODEL);
                jSONObject.put("device_brand", Build.BRAND);
                jSONObject.put("device_manufacturer", Build.MANUFACTURER);
                jSONObject.put("process_name", C79234V7u.LJIIZILJ(Process.myPid()));
                jSONObject.put("sid", LJFF());
                jSONObject.put("phone_startup_time", LIZJ());
                jSONObject.put("verify_info", C60903NvH.LJIJ());
                jSONObject.put("rom_version", PC8.LIZ());
                if (!jSONObject.has("version_name")) {
                    packageInfo = C16880lQ.LLLLLLZ(LIZ.getPackageManager(), LIZ.getPackageName(), 0);
                    jSONObject.put("version_name", packageInfo.versionName);
                } else {
                    packageInfo = null;
                }
                if (TextUtils.isEmpty(jSONObject.optString("app_version"))) {
                    jSONObject.put("app_version", jSONObject.optString("version_name"));
                }
                if (!jSONObject.has("version_code")) {
                    if (packageInfo == null) {
                        packageInfo = C16880lQ.LLLLLLZ(LIZ.getPackageManager(), LIZ.getPackageName(), 0);
                    }
                    jSONObject.put("version_code", packageInfo.versionCode);
                }
                if (TextUtils.isEmpty(jSONObject.optString("package"))) {
                    jSONObject.put("package", LIZ.getPackageName());
                }
                jSONObject.put("monitor_version", "5.0.20.1-rc.121-ttp");
            } catch (Exception unused) {
            }
            C09980aI c09980aI = LJIL;
            jSONObject.optString("process_name");
            c09980aI.getClass();
            LJIL.LIZIZ = jSONObject.optString("device_id");
            try {
                LJIL.LIZ = jSONObject.optInt("aid");
                LJIL.LIZJ = jSONObject.optString("channel");
                if (jSONObject.has("update_version_code")) {
                    if (jSONObject.get("update_version_code") instanceof String) {
                        LJIL.LIZLLL = CastIntegerProtector.valueOf(jSONObject.optString("update_version_code")).intValue();
                    } else {
                        LJIL.LIZLLL = jSONObject.optInt("update_version_code");
                    }
                }
                if (jSONObject.has("version_name")) {
                    LJIL.LJ = jSONObject.optString("version_name");
                }
                if (jSONObject.has("manifest_version_code")) {
                    if (jSONObject.get("manifest_version_code") instanceof String) {
                        LJIL.LJFF = CastIntegerProtector.valueOf(jSONObject.optString("manifest_version_code")).intValue();
                    } else {
                        LJIL.LJFF = jSONObject.optInt("manifest_version_code");
                    }
                }
                if (jSONObject.has("version_code")) {
                    if (jSONObject.get("version_code") instanceof String) {
                        C09980aI c09980aI2 = LJIL;
                        CastIntegerProtector.valueOf(jSONObject.optString("version_code")).intValue();
                        c09980aI2.getClass();
                    } else {
                        C09980aI c09980aI3 = LJIL;
                        jSONObject.optInt("version_code");
                        c09980aI3.getClass();
                    }
                }
                if (jSONObject.has("app_version")) {
                    LJIL.LJI = jSONObject.optString("app_version");
                }
                if (jSONObject.has("release_build")) {
                    LJIL.LJII = jSONObject.optString("release_build");
                } else if (!C60903NvH.LJIJ().isEmpty()) {
                    LJIL.LJII = C60903NvH.LJIJ();
                }
            } catch (Exception unused2) {
            }
            LJIL.LJIIIIZZ = C43001GuD.LJII(jSONObject);
            LJFF = jSONObject;
        }
    }

    public static void LIZ(String str, String str2) {
        JSONObject jSONObject = LJFF;
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put(str, str2);
        } catch (JSONException unused) {
        }
    }
}
