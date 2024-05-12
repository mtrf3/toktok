package com.bytedance.crash.entity;

import X.C16880lQ;
import X.C47261Igj;
import X.C48008Ism;
import X.C64254PJq;
import X.C64257PJt;
import X.C78685UuP;
import X.EXC;
import X.FCW;
import X.PC9;
import X.PJC;
import X.PK0;
import X.X1D;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.bytedance.crash.util.NativeTools;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.Iterator;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class Header {
    public static String LIZJ;
    public final JSONObject LIZ = new JSONObject();
    public static final String[] LIZIZ = {"version_code", "manifest_version_code", "aid", "update_version_code"};
    public static int LIZLLL = -1;
    public static int LJ = -1;

    public static Header LIZJ() {
        Header header = new Header();
        JSONObject jSONObject = header.LIZ;
        try {
            jSONObject.put("sdk_version", 30107101);
            jSONObject.put("sdk_version_name", "3.1.7-rc.51.oversea");
            jSONObject.put("bytrace_id", PK0.LIZ());
        } catch (Exception unused) {
        }
        return header;
    }

    public static String LJII() {
        if (LIZJ == null) {
            try {
                StringBuilder sb = new StringBuilder();
                if (Build.SUPPORTED_ABIS.length > 0) {
                    int i = 0;
                    while (true) {
                        String[] strArr = Build.SUPPORTED_ABIS;
                        if (i >= strArr.length) {
                            break;
                        }
                        sb.append(strArr[i]);
                        if (i != strArr.length - 1) {
                            sb.append(", ");
                        }
                        i++;
                    }
                } else {
                    sb = new StringBuilder(Build.CPU_ABI);
                }
                if (TextUtils.isEmpty(sb.toString())) {
                    LIZJ = "unknown";
                }
                LIZJ = sb.toString();
            } catch (Exception unused) {
                C78685UuP.LJLIL();
                LIZJ = "unknown";
            }
        }
        return LIZJ;
    }

    public static boolean LJIIIIZZ() {
        if (LIZLLL == -1) {
            LIZLLL = LJII().contains("64") ? 1 : 0;
        }
        if (LIZLLL == 1) {
            return true;
        }
        return false;
    }

    public static boolean LJIIIZ() {
        if (LJ == -1) {
            LJ = LJII().contains("86") ? 1 : 0;
        }
        if (LJ == 1) {
            return true;
        }
        return false;
    }

    public final void LJIIJ() {
        try {
            this.LIZ.put("device_id", PK0.LIZLLL().LIZ());
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static Header LIZLLL() {
        Header LIZJ2 = LIZJ();
        addRuntimeHeader(LIZJ2.LIZ);
        LIZ(LIZJ2);
        LIZJ2.LJ();
        LIZJ2.LJIIJ();
        try {
            C64257PJt LIZIZ2 = PK0.LIZIZ();
            LIZIZ2.getClass();
            try {
                long userId = LIZIZ2.LIZIZ.getUserId();
                if (userId > 0) {
                    LIZJ2.LIZ.put("user_id", userId);
                }
            } catch (Throwable unused) {
            }
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        return LIZJ2;
    }

    public final void LJ() {
        LJFF(PK0.LIZIZ().LIZLLL());
    }

    public static void LIZ(Header header) {
        if (header == null) {
            return;
        }
        addOtherHeader(header.LIZ);
    }

    public static boolean LJIIJJI(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0 || ((jSONObject.opt("app_version") == null && jSONObject.opt("version_name") == null) || jSONObject.opt("version_code") == null || jSONObject.opt("update_version_code") == null)) {
            return true;
        }
        return false;
    }

    public static void addOtherHeader(JSONObject jSONObject) {
        Object opt;
        Object obj;
        Object obj2;
        int i;
        Object obj3;
        if (jSONObject == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        try {
            if (FCW.LIZIZ()) {
                sb.append("MIUI-");
            } else if (Build.DISPLAY.contains("Flyme") || Build.USER.equals("flyme")) {
                sb.append("FLYME-");
            } else {
                String LIZIZ2 = EXC.LIZ().LIZIZ("ro.build.version.emui");
                if (FCW.LIZ(LIZIZ2)) {
                    sb.append("EMUI-");
                }
                if (!TextUtils.isEmpty(LIZIZ2)) {
                    sb.append(LIZIZ2);
                    sb.append("-");
                }
            }
            sb.append(Build.VERSION.INCREMENTAL);
            if (sb.length() > 0) {
                jSONObject.put("rom", sb.toString());
            }
            jSONObject.put("rom_version", PC9.LIZ());
        } catch (Throwable unused) {
        }
        try {
            DisplayMetrics displayMetrics = PK0.LIZ.getResources().getDisplayMetrics();
            int i2 = displayMetrics.densityDpi;
            if (i2 != 120) {
                if (i2 != 240) {
                    if (i2 == 320) {
                        obj3 = "xhdpi";
                    } else {
                        obj3 = "mdpi";
                    }
                } else {
                    obj3 = "hdpi";
                }
            } else {
                obj3 = "ldpi";
            }
            jSONObject.put("density_dpi", i2);
            jSONObject.put("display_density", obj3);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(displayMetrics.heightPixels);
            LIZ.append("x");
            LIZ.append(displayMetrics.widthPixels);
            jSONObject.put("resolution", X1D.LIZIZ(LIZ));
        } catch (Exception unused2) {
        }
        try {
            int rawOffset = TimeZone.getDefault().getRawOffset() / 3600000;
            if (rawOffset < -12) {
                rawOffset = -12;
            } else if (rawOffset > 12) {
                rawOffset = 12;
            }
            jSONObject.put("timezone", rawOffset);
        } catch (Exception unused3) {
        }
        try {
            jSONObject.put("os", "Android");
            if (NativeTools.LJIILJJIL().LJJIIZ()) {
                obj = "64";
            } else {
                obj = "32";
            }
            jSONObject.put("verify_info", obj);
            jSONObject.put("device_id", PK0.LIZLLL().LIZ());
            String str = Build.VERSION.RELEASE;
            if (!str.contains(".")) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(str);
                LIZ2.append(".0");
                str = X1D.LIZIZ(LIZ2);
            }
            jSONObject.put("os_version", str);
            jSONObject.put("os_api", Build.VERSION.SDK_INT);
            String str2 = Build.MODEL;
            String str3 = Build.BRAND;
            if (str2 == null) {
                str2 = str3;
            } else if (str3 != null && !str2.contains(str3)) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(str3);
                LIZ3.append(' ');
                LIZ3.append(str2);
                str2 = X1D.LIZIZ(LIZ3);
            }
            jSONObject.put("device_model", str2);
            jSONObject.put("device_brand", str3);
            jSONObject.put("device_manufacturer", Build.MANUFACTURER);
            jSONObject.put("cpu_abi", LJII());
            jSONObject.put("cpu_model", C47261Igj.LJIJJ());
            jSONObject.put("hardware", Build.HARDWARE);
            try {
                obj2 = System.getProperty("os.version");
            } catch (Throwable unused4) {
                obj2 = null;
            }
            jSONObject.put("kernel_version", obj2);
            Context context = PK0.LIZ;
            String packageName = context.getPackageName();
            jSONObject.put("package", packageName);
            ApplicationInfo applicationInfo = C16880lQ.LLLLLLZ(context.getPackageManager(), packageName, 0).applicationInfo;
            if (applicationInfo != null && (i = applicationInfo.labelRes) > 0) {
                jSONObject.put("display_name", context.getString(i));
            }
        } catch (Throwable unused5) {
        }
        try {
            C64254PJq.LIZIZ();
            JSONObject jSONObject2 = C64254PJq.LIZ;
            if (jSONObject2 != null) {
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (!"slardar_filter".equals(next) && (opt = C64254PJq.LIZ.opt(next)) != null) {
                        try {
                            jSONObject.put(next, opt);
                        } catch (JSONException unused6) {
                        }
                    }
                }
            }
        } catch (Throwable unused7) {
        }
    }

    public static void addRuntimeHeader(JSONObject jSONObject) {
        try {
            jSONObject.put("access", C48008Ism.LIZIZ(PK0.LIZ));
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public final JSONObject LJFF(Map<String, Object> map) {
        if (map == null) {
            return this.LIZ;
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (!this.LIZ.has(entry.getKey())) {
                this.LIZ.put(entry.getKey(), entry.getValue());
            }
        }
        for (String str : LIZIZ) {
            if (map.containsKey(str)) {
                try {
                    this.LIZ.put(str, CastIntegerProtector.parseInt(String.valueOf(map.get(str))));
                } catch (Throwable unused) {
                    this.LIZ.put(str, map.get(str));
                }
            }
        }
        if (map.containsKey("version_code") && !map.containsKey("manifest_version_code")) {
            try {
                this.LIZ.put("manifest_version_code", CastIntegerProtector.parseInt(String.valueOf(map.get("version_code"))));
            } catch (Throwable unused2) {
            }
        }
        if (map.containsKey("version_name")) {
            this.LIZ.put("app_version", map.get("version_name"));
            this.LIZ.remove("version_name");
        }
        this.LIZ.put("version_get_time", 0);
        return this.LIZ;
    }

    public final void LJI(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            PJC.LJIIJ(this.LIZ, next, jSONObject.opt(next));
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:1|(1:3)|4|(1:58)|8|(2:9|(3:11|(4:46|(1:48)|49|(3:51|52|53)(1:54))(2:13|(1:15)(1:44))|45)(2:55|(1:57)(0)))|16|(4:26|27|28|(1:(5:31|(2:39|40)|33|34|(3:36|21|22))))|18|19|20|21|22|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b6, code lost:
    
        if (r5 != null) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.PKN LIZIZ(long r12, long r14, java.lang.String r16) {
        /*
            r4 = r16
            X.PJs r8 = X.C64256PJs.LIZIZ()
            r10 = 0
            int r0 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r0 != 0) goto L10
            long r14 = java.lang.System.currentTimeMillis()
        L10:
            r8.getClass()
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L21
            android.content.Context r0 = r8.LIZLLL
            boolean r0 = X.C64264PKa.LJIIIIZZ(r0, r4)
            if (r0 == 0) goto L23
        L21:
            java.lang.String r4 = "main"
        L23:
            android.content.Context r0 = r8.LIZLLL
            java.io.File r7 = new java.io.File
            java.lang.String r3 = X.C78596Usy.LJJIIJ(r0)
            java.lang.StringBuilder r2 = X.X1D.LIZ()
            java.lang.String r0 = "npth/RuntimeContext/"
            r2.append(r0)
            java.lang.String r1 = ":"
            java.lang.String r0 = "@"
            java.lang.String r0 = r4.replaceAll(r1, r0)
            r2.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r2)
            r7.<init>(r3, r0)
            java.lang.String r6 = ".ctx2"
            java.util.ArrayList r0 = r8.LIZ(r7, r6)
            java.util.Iterator r9 = r0.iterator()
            r5 = 0
            r3 = r5
        L52:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L72
            java.lang.Object r4 = r9.next()
            X.PJr r4 = (X.C64255PJr) r4
            long r1 = r4.LIZ
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 != 0) goto L6f
            if (r3 != 0) goto L67
            r3 = r4
        L67:
            long r1 = r4.LIZIZ
            int r0 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r0 < 0) goto L52
            r3 = r4
            goto L52
        L6f:
            if (r3 == 0) goto L52
            goto L78
        L72:
            if (r3 != 0) goto L78
            X.PJr r3 = r8.LIZJ(r6, r7, r14)
        L78:
            java.lang.String r6 = "version_get_time"
            java.lang.String r7 = "header"
            if (r3 == 0) goto L97
            java.io.File r0 = r3.LIZJ     // Catch: java.lang.Throwable -> L8f
            java.lang.String r0 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L8f
            java.lang.String r1 = X.PK8.LJFF(r0)     // Catch: java.lang.Throwable -> L8f
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L8f
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L8f
            r5 = r0
        L8f:
            long r1 = r3.LJ
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 == 0) goto Lb6
            if (r5 != 0) goto La4
        L97:
            X.PKN r4 = new X.PKN
            r4.<init>()
            com.bytedance.crash.entity.Header r3 = LIZJ()
            r3.LJ()
            goto Lbf
        La4:
            org.json.JSONObject r0 = r5.optJSONObject(r7)
            if (r0 != 0) goto Lb2
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lb6
            r0.<init>()     // Catch: java.lang.Throwable -> Lb6
            r5.put(r7, r0)     // Catch: java.lang.Throwable -> Lb6
        Lb2:
            r0.put(r6, r1)     // Catch: java.lang.Throwable -> Lb6
            goto Lb8
        Lb6:
            if (r5 == 0) goto L97
        Lb8:
            int r0 = r5.length()
            if (r0 != 0) goto Lc9
            goto L97
        Lbf:
            org.json.JSONObject r2 = r3.LIZ     // Catch: java.lang.Throwable -> Ldb
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Ldb
            r2.put(r6, r0)     // Catch: java.lang.Throwable -> Ldb
            goto Ldb
        Lc9:
            X.PKN r4 = new X.PKN
            r4.<init>(r5)
            com.bytedance.crash.entity.Header r3 = new com.bytedance.crash.entity.Header
            r3.<init>()
            org.json.JSONObject r0 = r5.optJSONObject(r7)
            r3.LJI(r0)
        Ldb:
            r3.LJIIJ()
            LIZ(r3)
            r4.LJIIZILJ(r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.entity.Header.LIZIZ(long, long, java.lang.String):X.PKN");
    }
}
