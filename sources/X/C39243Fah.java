package X;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.ss.android.deviceregister.DeviceRegisterManager;
import p83.a;

/* renamed from: X.Fah, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39243Fah {
    public static String LIZJ(ContentResolver contentResolver) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {contentResolver, "android_id"};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;", "3019481267739682102");
        C39519Ff9 LIZJ = c03880Dg.LIZJ(102004, "android/provider/Settings$Secure", "getString", Settings.Secure.class, objArr, "java.lang.String", c65300Pk0);
        if (LIZJ.LIZ) {
            c03880Dg.LIZIZ(102004, "android/provider/Settings$Secure", "getString", null, objArr, Settings.Secure.class, c65300Pk0, false);
            return (String) LIZJ.LIZIZ;
        }
        String string = Settings.Secure.getString(contentResolver, "android_id");
        c03880Dg.LIZIZ(102004, "android/provider/Settings$Secure", "getString", string, objArr, Settings.Secure.class, c65300Pk0, true);
        return string;
    }

    public static String LIZLLL(TelephonyManager telephonyManager) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(100922, "android/telephony/TelephonyManager", "getSimCountryIso", telephonyManager, new Object[0], "java.lang.String", new C65300Pk0(false, "()Ljava/lang/String;", "3019481267739682102"));
        return LIZJ.LIZ ? (String) LIZJ.LIZIZ : telephonyManager.getSimCountryIso();
    }

    public static String LIZ(ContentResolver contentResolver) {
        if (TextUtils.equals("android_id", "android_id")) {
            if (AV1.LJIILLIIL() && C65928Pu8.LIZIZ.LIZ().strictModeConfigs.get("kids_mode_overseas_scene").fuseApiIds.contains(102004)) {
                return "";
            }
            if (TextUtils.isEmpty(E77.LIZ)) {
                E77.LIZ = LIZJ(contentResolver);
            }
            return E77.LIZ;
        }
        return LIZJ(contentResolver);
    }

    public static a.C0043a LIZIZ(Context context) {
        if (AV1.LJIILLIIL() && C65928Pu8.LIZIZ.LIZ().strictModeConfigs.get("kids_mode_overseas_scene").fuseApiIds.contains(103000)) {
            return new a.C0043a("00000000-0000-0000-0000-000000000000", true);
        }
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {context};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Landroid/content/Context;)Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;", "3019481267739682102");
        C39519Ff9 LIZJ = c03880Dg.LIZJ(103000, "com/google/android/gms/ads/identifier/AdvertisingIdClient", "getAdvertisingIdInfo", a.class, objArr, "com.google.android.gms.ads.identifier.AdvertisingIdClient$Info", c65300Pk0);
        if (LIZJ.LIZ) {
            c03880Dg.LIZIZ(103000, "com/google/android/gms/ads/identifier/AdvertisingIdClient", "getAdvertisingIdInfo", null, objArr, a.class, c65300Pk0, false);
            return (a.C0043a) LIZJ.LIZIZ;
        }
        a.C0043a LIZIZ = a.LIZIZ(context);
        c03880Dg.LIZIZ(103000, "com/google/android/gms/ads/identifier/AdvertisingIdClient", "getAdvertisingIdInfo", LIZIZ, objArr, a.class, c65300Pk0, true);
        return LIZIZ;
    }

    public static String LJ(Context context) {
        InterfaceC39244Fai bpeaApiCallback = DeviceRegisterManager.getBpeaApiCallback();
        if (bpeaApiCallback != null) {
            return bpeaApiCallback.LIZ();
        }
        TelephonyManager telephonyManager = (TelephonyManager) C16880lQ.LLILL(context, "phone");
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(100920, "android/telephony/TelephonyManager", "getNetworkOperatorName", telephonyManager, new Object[0], "java.lang.String", new C65300Pk0(false, "()Ljava/lang/String;", "3019481267739682102"));
        if (LIZJ.LIZ) {
            return (String) LIZJ.LIZIZ;
        }
        return telephonyManager.getNetworkOperatorName();
    }

    public static String LJFF(Context context) {
        InterfaceC39244Fai bpeaApiCallback = DeviceRegisterManager.getBpeaApiCallback();
        if (bpeaApiCallback != null) {
            return bpeaApiCallback.getNetworkOperator();
        }
        TelephonyManager telephonyManager = (TelephonyManager) C16880lQ.LLILL(context, "phone");
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(100919, "android/telephony/TelephonyManager", "getNetworkOperator", telephonyManager, new Object[0], "java.lang.String", new C65300Pk0(false, "()Ljava/lang/String;", "3019481267739682102"));
        if (LIZJ.LIZ) {
            return (String) LIZJ.LIZIZ;
        }
        return telephonyManager.getNetworkOperator();
    }

    public static String LJI(Context context) {
        InterfaceC39244Fai bpeaApiCallback = DeviceRegisterManager.getBpeaApiCallback();
        if (bpeaApiCallback != null) {
            return bpeaApiCallback.LIZJ();
        }
        TelephonyManager telephonyManager = (TelephonyManager) C16880lQ.LLILL(context, "phone");
        if (!C34049DXx.LIZ()) {
            return LIZLLL(telephonyManager);
        }
        if (TextUtils.isEmpty(C39248Fam.LJIJI)) {
            C39248Fam.LJIJI = LIZLLL(telephonyManager);
        }
        return C39248Fam.LJIJI;
    }
}
