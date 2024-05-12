package X;

import Y.ACallableS0S4000000_6;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.bpea.cert.token.TokenCert;
import kotlin.jvm.internal.AqS66S1200000_11;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FLJ {
    public static final FLJ LIZ = new FLJ();

    public final void LJII() {
        C10K.LIZJ(new ACallableS0S4000000_6(1)).LIZLLL(new C36224EJo());
    }

    public static final void LJ(String str) {
        LIZ("Login", null, null);
        LIZIZ("login", "product", str);
    }

    public static final void LJFF(String str) {
        FLM.LIZ(EF7.LIZIZ(), str, null, TokenCert.Companion.with("bpea-appsflyer_androidsdk_1971"));
    }

    public static final void LJI(String str) {
        FLM.LIZ(EF7.LIZIZ(), str, null, TokenCert.Companion.with("bpea-appsflyer_androidsdk_1970"));
    }

    public static final void LIZJ(String str, String str2) {
        if (str != null) {
            int i = 0;
            switch (str.hashCode()) {
                case -2090153577:
                    if (!str.equals("mus_af_follow")) {
                        return;
                    }
                    LIZ("Subscribe", "product", str2);
                    return;
                case -1617792023:
                    if (!str.equals("video_view")) {
                        return;
                    }
                    LIZIZ("Video_content", "product", str2);
                    LIZ("fb_mobile_content_view", "product", str2);
                    return;
                case -1101213402:
                    if (!str.equals("collect_video")) {
                        return;
                    }
                    LIZ("fb_mobile_add_to_wishlist", "product", str2);
                    return;
                case 70775934:
                    if (!str.equals("start_upload")) {
                        return;
                    }
                    LIZ("fb_mobile_initiated_checkout", null, null);
                    return;
                case 109413407:
                    if (!str.equals("shoot")) {
                        return;
                    }
                    LIZ("fb_mobile_add_payment_info", null, null);
                    return;
                case 1263148345:
                    if (!str.equals("mus_af_comment")) {
                        return;
                    }
                    LIZ("fb_mobile_rate", "product", str2);
                    return;
                case 2026292779:
                    if (!str.equals("mus_af_like_video_1") || !FIZ.LIZ().getBoolean("is_first_like_success", true)) {
                        return;
                    }
                    FIZ.LIZ().edit().putBoolean("is_first_like_success", false).apply();
                    return;
                case 2026292783:
                    if (!str.equals("mus_af_like_video_5")) {
                        return;
                    }
                    int i2 = FIZ.LIZ().getInt("like_success_count", 0) + 1;
                    if (i2 != 5) {
                        i = i2;
                    }
                    FIZ.LIZ().edit().putInt("like_success_count", i).apply();
                    return;
                default:
                    return;
            }
        }
    }

    public static final void LIZLLL(String str, java.util.Map<String, ? extends Object> map) {
        FLM.LIZ(EF7.LIZIZ(), str, map, TokenCert.Companion.with("bpea-appsflyer_androidsdk_1972"));
    }

    public static void LIZ(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(str2)) {
            bundle.putString("fb_content_type", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            if (TextUtils.equals(str, "fb_mobile_search")) {
                bundle.putString("fb_search_string", str3);
            } else {
                bundle.putString("fb_content_id", str3);
            }
        }
    }

    public static void LIZIZ(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(str2)) {
            bundle.putString("content_type", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            if (TextUtils.equals(str, "search")) {
                bundle.putString("search_term", str3);
            } else {
                bundle.putString("item_id", str3);
            }
        }
        C63053Oor LIZ2 = C63053Oor.LIZIZ.LIZ(EF7.LIZIZ());
        TokenCert cert = TokenCert.Companion.with("bpea-firebase_androidsdk_1991");
        o.LJIIIZ(cert, "cert");
        C1GE.LJIJJ(cert, "Firebase", "logEvent", new AqS66S1200000_11(bundle, LIZ2, str, 13));
    }
}
