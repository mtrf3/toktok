package X;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Pair;
import java.util.Locale;
import p83.a;

/* renamed from: X.Fak, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39246Fak extends QXX {
    public QIF LJLIL;

    public C39246Fak() {
        super((Object) null);
    }

    public static String LLLLZ(TelephonyManager telephonyManager) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(100922, "android/telephony/TelephonyManager", "getSimCountryIso", telephonyManager, new Object[0], "java.lang.String", new C65300Pk0(false, "()Ljava/lang/String;", "-4002195855485279857"));
        return LIZJ.LIZ ? (String) LIZJ.LIZIZ : telephonyManager.getSimCountryIso();
    }

    public Pair<String, Boolean> LLLLZLLIL() {
        a.C0043a LIZIZ;
        String str;
        Context context = this.LJLIL.LIZJ;
        boolean z = false;
        if (AV1.LJIILLIIL() && C65928Pu8.LIZIZ.LIZ().strictModeConfigs.get("kids_mode_overseas_scene").fuseApiIds.contains(103000)) {
            LIZIZ = new a.C0043a("00000000-0000-0000-0000-000000000000", true);
        } else {
            C03880Dg c03880Dg = new C03880Dg(2);
            Object[] objArr = {context};
            C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Landroid/content/Context;)Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;", "-4002195855485279857");
            C39519Ff9 LIZJ = c03880Dg.LIZJ(103000, "com/google/android/gms/ads/identifier/AdvertisingIdClient", "getAdvertisingIdInfo", a.class, objArr, "com.google.android.gms.ads.identifier.AdvertisingIdClient$Info", c65300Pk0);
            if (LIZJ.LIZ) {
                c03880Dg.LIZIZ(103000, "com/google/android/gms/ads/identifier/AdvertisingIdClient", "getAdvertisingIdInfo", null, objArr, a.class, c65300Pk0, false);
                LIZIZ = (a.C0043a) LIZJ.LIZIZ;
            } else {
                LIZIZ = a.LIZIZ(context);
                c03880Dg.LIZIZ(103000, "com/google/android/gms/ads/identifier/AdvertisingIdClient", "getAdvertisingIdInfo", LIZIZ, objArr, a.class, c65300Pk0, true);
            }
            if (LIZIZ == null) {
                str = null;
                return new Pair<>(str, Boolean.valueOf(z));
            }
        }
        str = LIZIZ.LIZ;
        z = LIZIZ.LIZIZ;
        return new Pair<>(str, Boolean.valueOf(z));
    }

    public String LLLLZLLLI() {
        TelephonyManager telephonyManager = this.LJLIL.LJJIIZ;
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(100919, "android/telephony/TelephonyManager", "getNetworkOperator", telephonyManager, new Object[0], "java.lang.String", new C65300Pk0(false, "()Ljava/lang/String;", "-4002195855485279857"));
        if (LIZJ.LIZ) {
            return (String) LIZJ.LIZIZ;
        }
        return telephonyManager.getNetworkOperator();
    }

    public String LLLZ() {
        TelephonyManager telephonyManager = this.LJLIL.LJJIIZ;
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(100920, "android/telephony/TelephonyManager", "getNetworkOperatorName", telephonyManager, new Object[0], "java.lang.String", new C65300Pk0(false, "()Ljava/lang/String;", "-4002195855485279857"));
        if (LIZJ.LIZ) {
            return (String) LIZJ.LIZIZ;
        }
        return telephonyManager.getNetworkOperatorName();
    }

    public String LLLZI() {
        TelephonyManager telephonyManager = this.LJLIL.LJJIIZ;
        if (!C34049DXx.LIZ()) {
            return LLLLZ(telephonyManager);
        }
        if (TextUtils.isEmpty(C39248Fam.LJIJI)) {
            C39248Fam.LJIJI = LLLLZ(telephonyManager);
        }
        return C39248Fam.LJIJI;
    }

    public String LLLLZIL() {
        return Locale.getDefault().getCountry();
    }
}
