package Y;

import X.AV1;
import X.C03880Dg;
import X.C39519Ff9;
import X.C47150Iew;
import X.C65300Pk0;
import X.C65928Pu8;
import X.C76W;
import X.EF7;
import X.FLJ;
import X.FMX;
import X.FVJ;
import X.PEH;
import android.content.Context;
import com.google.android.play.core.appupdate.u;
import com.ss.android.ugc.aweme.common.MobClick;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p83.a;

/* loaded from: classes7.dex */
public class ACallableS0S4000000_6 implements Callable {
    public final int $t;
    public String s0;
    public String s1;
    public String s2;
    public String s3;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public ACallableS0S4000000_6(int i) {
        this.$t = i;
        this.s0 = "Appvault";
        this.s1 = "xiaomiglobal_int";
        this.s2 = "Appvault";
        this.s3 = "CPI";
    }

    public static a.C0043a LIZ$0(Context context) {
        if (AV1.LJIILLIIL() && C65928Pu8.LIZIZ.LIZ().strictModeConfigs.get("kids_mode_overseas_scene").fuseApiIds.contains(103000)) {
            return new a.C0043a("00000000-0000-0000-0000-000000000000", true);
        }
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {context};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Landroid/content/Context;)Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;", "-5067840982411208134");
        C39519Ff9 LIZJ = c03880Dg.LIZJ(103000, "com/google/android/gms/ads/identifier/AdvertisingIdClient", "getAdvertisingIdInfo", a.class, objArr, "com.google.android.gms.ads.identifier.AdvertisingIdClient$Info", c65300Pk0);
        if (LIZJ.LIZ) {
            c03880Dg.LIZIZ(103000, "com/google/android/gms/ads/identifier/AdvertisingIdClient", "getAdvertisingIdInfo", null, objArr, a.class, c65300Pk0, false);
            return (a.C0043a) LIZJ.LIZIZ;
        }
        a.C0043a LIZIZ = a.LIZIZ(context);
        c03880Dg.LIZIZ(103000, "com/google/android/gms/ads/identifier/AdvertisingIdClient", "getAdvertisingIdInfo", LIZIZ, objArr, a.class, c65300Pk0, true);
        return LIZIZ;
    }

    public static final Object call$0(ACallableS0S4000000_6 aCallableS0S4000000_6) {
        String str = aCallableS0S4000000_6.s0;
        String str2 = aCallableS0S4000000_6.s1;
        String str3 = aCallableS0S4000000_6.s2;
        String str4 = aCallableS0S4000000_6.s3;
        C76W c76w = new C76W();
        c76w.LIZ("top_activity", str);
        c76w.LIZ("feed_tab", str2);
        c76w.LIZ("err_code", str3);
        c76w.LIZ("play_sess", String.valueOf(str4));
        JSONObject LIZIZ = c76w.LIZIZ();
        try {
            LIZIZ.put("preloader_type", u.LJIILJJIL());
        } catch (Exception e) {
            PEH.LIZJ(e);
        }
        MobClick obtain = MobClick.obtain();
        obtain.setEventName("video_prepare_error");
        obtain.setLabelName("perf_monitor");
        obtain.setJsonObject(LIZIZ);
        FMX.onEvent(obtain);
        FMX.LJIILJJIL("video_prepare_error", LIZIZ);
        FVJ.LIZIZ("video_prepare_error", System.currentTimeMillis(), LIZIZ);
        C47150Iew.LIZIZ("video_prepare_error", LIZIZ);
        return null;
    }

    public static final Object call$1(ACallableS0S4000000_6 aCallableS0S4000000_6) {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str2 = aCallableS0S4000000_6.s1;
        String str3 = aCallableS0S4000000_6.s2;
        String str4 = aCallableS0S4000000_6.s3;
        linkedHashMap.put("media_source", str2);
        linkedHashMap.put("campaign", str3);
        linkedHashMap.put("cost_model", str4);
        FLJ.LIZLLL(aCallableS0S4000000_6.s0, linkedHashMap);
        try {
            a.C0043a LIZ$0 = LIZ$0(EF7.LIZIZ());
            if (LIZ$0 != null) {
                str = LIZ$0.LIZ;
            } else {
                str = null;
            }
        } catch (Exception unused) {
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public ACallableS0S4000000_6(String str, String str2, String str3, String str4, int i) {
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
        this.s3 = str4;
    }
}
