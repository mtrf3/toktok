package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.deviceregister.DeviceRegisterManager;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QK9 {
    public static String LIZ = null;
    public static InterfaceC66783QIx LIZIZ = null;
    public static String LIZJ = null;
    public static String LIZLLL = null;
    public static int LJ = 0;
    public static int LJFF = 0;
    public static String LJI = null;
    public static String LJII = "2.15.0";
    public static volatile JSONObject LJIIJ;
    public static String LJIIJJI;
    public static String LJIIL;
    public static String LJIILIIL;
    public static C66816QKe LJIILL;
    public static QL3 LJIILLIIL;
    public static String LJIIZILJ;
    public static volatile EnumC86803Y4x LJIJ;
    public static String LJIJI;
    public static volatile boolean LJIJJ;
    public static final ConcurrentHashMap<String, Object> LJIIIIZZ = new ConcurrentHashMap<>();
    public static boolean LJIIIZ = false;
    public static final Object LJIILJJIL = new Object();
    public static volatile boolean LJIJJLI = true;

    public static int LJFF() {
        InterfaceC66783QIx interfaceC66783QIx;
        if (LJ <= 0 && (interfaceC66783QIx = LIZIZ) != null) {
            LJ = interfaceC66783QIx.getVersionCode();
        }
        return LJ;
    }

    public static String LIZIZ(Context context) {
        if (!TextUtils.isEmpty(LIZ)) {
            return LIZ;
        }
        InterfaceC66783QIx interfaceC66783QIx = LIZIZ;
        if (interfaceC66783QIx != null) {
            return interfaceC66783QIx.LIZIZ();
        }
        try {
            if (C16880lQ.LLLLLLLLL(context.getPackageManager(), context.getPackageName(), 128).metaData != null) {
                LIZ = null;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static String LIZLLL(Context context) {
        Signature[] signatureArr;
        if (C38354F3m.LJ(LJIIJJI) && context != null) {
            try {
                PackageInfo LLLLLLZ = C16880lQ.LLLLLLZ(context.getPackageManager(), context.getPackageName(), 64);
                if (LLLLLLZ == null || (signatureArr = LLLLLLZ.signatures) == null || signatureArr.length < 1) {
                    return LJIIJJI;
                }
                Signature signature = signatureArr[0];
                if (signature == null) {
                    return LJIIJJI;
                }
                LJIIJJI = C38352F3k.LIZLLL(signature.toByteArray());
            } catch (Exception unused) {
            }
        }
        return LJIIJJI;
    }

    public static String LJ(Context context) {
        if (C38354F3m.LJ(LJIIL)) {
            LJIIL = C48841JEv.LJIIJ(context).getString("user_agent", null);
        }
        return LJIIL;
    }

    public static void LJI(Throwable th) {
        InterfaceC66783QIx interfaceC66783QIx = LIZIZ;
        if (interfaceC66783QIx == null) {
            return;
        }
        QL3 ql3 = LJIILLIIL;
        interfaceC66783QIx.getContext();
        if (ql3 != null) {
            String stackTraceString = android.util.Log.getStackTraceString(th);
            if (!C38354F3m.LJ(stackTraceString)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("stack", stackTraceString);
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
                AppLogNewUtils.onEventV3("device_register", jSONObject);
            }
        }
    }

    public static void LIZ(JSONObject jSONObject, JSONObject jSONObject2) {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                jSONObject2.put(next, jSONObject.opt(next));
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    public static boolean LIZJ(Context context, JSONObject jSONObject, boolean z) {
        String LIZLLL2;
        String country;
        boolean z2;
        boolean z3;
        int i;
        int i2;
        String str;
        InterfaceC66783QIx interfaceC66783QIx;
        int i3;
        HashMap hashMap = new HashMap();
        synchronized (LJIILJJIL) {
            if (LJIIJ != null && LJIJJ == z) {
                LIZ(LJIIJ, jSONObject);
                return true;
            }
            boolean isTouristMode = DeviceRegisterManager.isTouristMode();
            JSONObject jSONObject2 = new JSONObject();
            boolean z4 = false;
            try {
                String packageName = context.getPackageName();
                try {
                    Bundle bundle = C16880lQ.LLLLLLLLL(context.getPackageManager(), packageName, 128).metaData;
                    String str2 = LIZ;
                    if (str2 != null && str2.length() > 0) {
                        hashMap.put("channel", LIZ);
                    } else if (bundle != null && !TextUtils.isEmpty("")) {
                        hashMap.put("channel", null);
                    }
                    if (bundle != null && !TextUtils.isEmpty("")) {
                        hashMap.put("appkey", bundle.getString(""));
                    }
                } catch (Exception e) {
                    LJI(e);
                    C16880lQ.LLLLIIL(e);
                }
                if (!TextUtils.isEmpty(LJIJI)) {
                    hashMap.put("package", LJIJI);
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("real_package_name", context.getPackageName());
                    DeviceRegisterManager.addCustomerHeaser(bundle2);
                } else {
                    hashMap.put("package", context.getPackageName());
                }
                InterfaceC66783QIx interfaceC66783QIx2 = LIZIZ;
                if (interfaceC66783QIx2 != null) {
                    LIZJ = interfaceC66783QIx2.getVersion();
                }
                if (!C38354F3m.LJ(LIZLLL)) {
                    LIZJ = LIZLLL;
                }
                hashMap.put("app_version", LIZJ);
                InterfaceC66783QIx interfaceC66783QIx3 = LIZIZ;
                if (interfaceC66783QIx3 != null) {
                    LJ = interfaceC66783QIx3.getVersionCode();
                }
                ApplicationInfo applicationInfo = C16880lQ.LLLLLLZ(context.getPackageManager(), packageName, 0).applicationInfo;
                if (applicationInfo != null && (i3 = applicationInfo.labelRes) > 0) {
                    jSONObject2.put("display_name", context.getString(i3));
                }
                InterfaceC66783QIx interfaceC66783QIx4 = LIZIZ;
                if (interfaceC66783QIx4 != null) {
                    int updateVersionCode = interfaceC66783QIx4.getUpdateVersionCode();
                    if (updateVersionCode > 0) {
                        jSONObject2.put("update_version_code", updateVersionCode);
                    }
                    int manifestVersionCode = LIZIZ.getManifestVersionCode();
                    if (manifestVersionCode > 0) {
                        jSONObject2.put("manifest_version_code", manifestVersionCode);
                    }
                    if (!TextUtils.isEmpty(DeviceRegisterManager.getAppVersionMinor())) {
                        jSONObject2.put("app_version_minor", DeviceRegisterManager.getAppVersionMinor());
                    } else {
                        jSONObject2.put("app_version_minor", "");
                    }
                }
                String[] strArr = {"channel", "appkey", "package", "app_version"};
                try {
                    if (LJFF == 0 && (interfaceC66783QIx = LIZIZ) != null) {
                        LJFF = interfaceC66783QIx.getAid();
                    }
                    jSONObject2.put("aid", LJFF);
                    int i4 = 0;
                    do {
                        String str3 = strArr[i4];
                        String str4 = (String) hashMap.get(str3);
                        if (C38354F3m.LJ(str4)) {
                            if (!"appkey".equals(str3)) {
                                return false;
                            }
                        } else {
                            jSONObject2.put(str3, str4);
                        }
                        i4++;
                    } while (i4 < 4);
                    jSONObject2.put("version_code", LJ);
                    jSONObject2.put("sdk_version", LJII);
                    jSONObject2.put("sdk_target_version", 29);
                    jSONObject2.put("git_hash", "98405cd");
                    jSONObject2.put("os", "Android");
                    jSONObject2.put("os_version", Build.VERSION.RELEASE);
                    jSONObject2.put("os_api", Build.VERSION.SDK_INT);
                    jSONObject2.put("device_model", Build.MODEL);
                    jSONObject2.put("device_brand", Build.BRAND);
                    jSONObject2.put("device_manufacturer", Build.MANUFACTURER);
                    if (LJIJ != null) {
                        jSONObject2.put("device_category", LJIJ.getLower());
                    }
                    jSONObject2.put("cpu_abi", Build.CPU_ABI);
                    String str5 = LJI;
                    if (str5 == null) {
                        str5 = "";
                    }
                    jSONObject2.put("release_build", str5);
                } catch (Exception e2) {
                    LJI(e2);
                }
                try {
                    DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    int i5 = displayMetrics.densityDpi;
                    jSONObject2.put("density_dpi", i5);
                    if (i5 != 120) {
                        if (i5 != 240) {
                            if (i5 == 320) {
                                str = "xhdpi";
                            } else {
                                str = "mdpi";
                            }
                        } else {
                            str = "hdpi";
                        }
                    } else {
                        str = "ldpi";
                    }
                    jSONObject2.put("display_density", str);
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(displayMetrics.heightPixels);
                    LIZ2.append("x");
                    LIZ2.append(displayMetrics.widthPixels);
                    jSONObject2.put("resolution", X1D.LIZIZ(LIZ2));
                } catch (Exception e3) {
                    LJI(e3);
                }
                SharedPreferences LJIIJ2 = C48841JEv.LJIIJ(context);
                try {
                    String language = context.getResources().getConfiguration().locale.getLanguage();
                    if (!C38354F3m.LJ(language)) {
                        jSONObject2.put("language", language);
                    }
                    float rawOffset = (TimeZone.getDefault().getRawOffset() * 1.0f) / 3600000.0f;
                    if (rawOffset < -12.0f) {
                        rawOffset = -12.0f;
                    } else if (rawOffset > 12.0f) {
                        rawOffset = 12.0f;
                    }
                    jSONObject2.put("timezone", rawOffset);
                    String LLJILJILJ = C16880lQ.LLJILJILJ(context);
                    if (LLJILJILJ != null) {
                        jSONObject2.put("access", LLJILJILJ);
                    }
                } catch (Exception e4) {
                    LJI(e4);
                    C16880lQ.LLLLIIL(e4);
                }
                try {
                    ConcurrentHashMap<String, Object> concurrentHashMap = LJIIIIZZ;
                    if (!concurrentHashMap.isEmpty()) {
                        for (Map.Entry<String, Object> entry : concurrentHashMap.entrySet()) {
                            if (entry != null) {
                                jSONObject2.put(entry.getKey(), entry.getValue());
                            }
                        }
                    }
                    if (LJIIIZ) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    jSONObject2.put("not_request_sender", i2);
                } catch (Exception e5) {
                    LJI(e5);
                    C16880lQ.LLLLIIL(e5);
                }
                try {
                    String LJ2 = C39243Fah.LJ(context);
                    String LJFF2 = C39243Fah.LJFF(context);
                    if (!C38354F3m.LJ(LJ2)) {
                        jSONObject2.put("carrier", LJ2);
                    }
                    if (!C38354F3m.LJ(LJFF2)) {
                        jSONObject2.put("mcc_mnc", LJFF2);
                    }
                } catch (Exception e6) {
                    LJI(e6);
                    C16880lQ.LLLLIIL(e6);
                }
                StringBuilder sb = new StringBuilder();
                try {
                    if (FCD.LJII()) {
                        sb.append("MIUI-");
                    } else if (FCD.LIZJ()) {
                        sb.append("FLYME-");
                    } else {
                        String LIZIZ2 = EXC.LIZ().LIZIZ("ro.build.version.emui");
                        if (PCI.LJ(LIZIZ2)) {
                            sb.append("EMUI-");
                        }
                        if (!TextUtils.isEmpty(LIZIZ2)) {
                            sb.append(LIZIZ2);
                            sb.append("-");
                        }
                    }
                    sb.append(Build.VERSION.INCREMENTAL);
                    if (sb.length() > 0) {
                        jSONObject2.put("rom", sb.toString());
                    }
                } catch (Throwable th) {
                    LJI(th);
                }
                try {
                    String LIZJ2 = PCI.LIZJ();
                    if (!C38354F3m.LJ(LIZJ2)) {
                        jSONObject2.put("rom_version", LIZJ2);
                    }
                } catch (Throwable th2) {
                    LJI(th2);
                }
                try {
                    String LIZ3 = QK5.LIZ(context);
                    if (!C38354F3m.LJ(LIZ3)) {
                        jSONObject2.put("cdid", LIZ3);
                    }
                } catch (Throwable th3) {
                    LJI(th3);
                }
                String LIZLLL3 = LIZLLL(context);
                if (LIZLLL3 != null) {
                    try {
                        jSONObject2.put("sig_hash", LIZLLL3);
                    } catch (JSONException e7) {
                        C16880lQ.LLLLIIL(e7);
                    }
                }
                String string = LJIIJ2.getString("app_language", null);
                String string2 = LJIIJ2.getString("app_region", null);
                try {
                    String str6 = V1B.LJLJI;
                    String str7 = V1B.LJLJJI;
                    if (!z && !isTouristMode) {
                        Pair<String, Boolean> LIZ4 = C39247Fal.LIZ(context);
                        if (!DeviceRegisterManager.isNewUserMode(context) && LIZ4 != null) {
                            Object obj = LIZ4.second;
                            if (obj != null && ((Boolean) obj).booleanValue()) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                i = 1;
                            } else {
                                i = 0;
                            }
                            jSONObject2.put("gaid_limited", i);
                            jSONObject2.put("google_aid", LIZ4.first);
                        }
                    }
                    if (!C38354F3m.LJ(str6) && !str6.equals(string)) {
                        string = str6;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!C38354F3m.LJ(string)) {
                        jSONObject2.put("app_language", string);
                    }
                    if (!C38354F3m.LJ(str7) && !str7.equals(string2)) {
                        string2 = str7;
                        z4 = true;
                    }
                    if (!C38354F3m.LJ(string2)) {
                        jSONObject2.put("app_region", string2);
                    }
                    SharedPreferences.Editor edit = LJIIJ2.edit();
                    if (z2) {
                        edit.putString("app_language", string);
                    }
                    if (z4) {
                        edit.putString("app_region", string2);
                    }
                    if (z2 || z4) {
                        edit.commit();
                    }
                } catch (Throwable th4) {
                    LJI(th4);
                }
                String string3 = LJIIJ2.getString("app_track", "");
                LJIILIIL = string3;
                try {
                    if (!C38354F3m.LJ(string3)) {
                        jSONObject2.put("app_track", new JSONObject(LJIILIIL));
                    }
                } catch (Throwable th5) {
                    LJI(th5);
                }
                C66816QKe c66816QKe = LJIILL;
                if (c66816QKe != null) {
                    try {
                        String LIZJ3 = ((JFK) c66816QKe.LJ).LIZJ();
                        if (!C38354F3m.LJ(LIZJ3)) {
                            jSONObject2.put("device_id", LIZJ3);
                        }
                        if (!z) {
                            C66816QKe c66816QKe2 = LJIILL;
                            if (c66816QKe2.LIZIZ) {
                                LIZLLL2 = "";
                            } else {
                                LIZLLL2 = ((JFK) c66816QKe2.LJ).LIZLLL();
                            }
                            if (!C38354F3m.LJ(LIZLLL2)) {
                                jSONObject2.put("openudid", LIZLLL2);
                            }
                        }
                        String str8 = LJIILL.LJIIJ;
                        if (!C38354F3m.LJ(str8)) {
                            jSONObject2.put("install_id", str8);
                        }
                        String LIZIZ3 = ((JFK) LJIILL.LJ).LIZIZ();
                        if (!C38354F3m.LJ(LIZIZ3)) {
                            jSONObject2.put("clientudid", LIZIZ3);
                        }
                    } catch (Exception e8) {
                        LJI(e8);
                        C16880lQ.LLLLIIL(e8);
                    }
                }
                if (DeviceRegisterManager.isNewUserMode(context)) {
                    try {
                        if (C44384HbQ.LJLLJ(DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId()) || C44384HbQ.LJLLJ(DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_lancet_launch_DeviceRegisterManagerLancet_getInstallId())) {
                            jSONObject2.put("new_user_mode", 1);
                        }
                    } catch (JSONException e9) {
                        C16880lQ.LLLLIIL(e9);
                    }
                }
                try {
                    InterfaceC39244Fai bpeaApiCallback = DeviceRegisterManager.getBpeaApiCallback();
                    if (bpeaApiCallback != null) {
                        country = bpeaApiCallback.getCountry();
                    } else {
                        country = Locale.getDefault().getCountry();
                    }
                    if (!C38354F3m.LJ(country)) {
                        jSONObject2.put("region", country);
                    }
                    String id = Calendar.getInstance().getTimeZone().getID();
                    if (!C38354F3m.LJ(id)) {
                        jSONObject2.put("tz_name", id);
                    }
                    jSONObject2.put("tz_offset", Calendar.getInstance().getTimeZone().getOffset(System.currentTimeMillis()) / 1000);
                    String LJI2 = C39243Fah.LJI(context);
                    if (!C38354F3m.LJ(LJI2)) {
                        jSONObject2.put("sim_region", LJI2);
                    }
                } catch (Throwable th6) {
                    LJI(th6);
                }
                if (!TextUtils.isEmpty(LJIIZILJ)) {
                    try {
                        jSONObject2.put("old_did", LJIIZILJ);
                    } catch (JSONException e10) {
                        C16880lQ.LLLLIIL(e10);
                    }
                }
                synchronized (LJIILJJIL) {
                    LJIIJ = jSONObject2;
                    LJIJJ = z;
                    LIZ(jSONObject2, jSONObject);
                }
                return true;
            } catch (Exception e11) {
                LJI(e11);
                return false;
            }
        }
    }
}
