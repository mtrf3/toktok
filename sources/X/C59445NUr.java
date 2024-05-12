package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.ad.model.AdLandingPageConfig;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.NativeAuthorInfo;

/* renamed from: X.NUr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59445NUr {
    public static final /* synthetic */ int LIZ = 0;

    public static final AdLandingPageConfig LIZ() {
        String LJ;
        C58909NAb.LIZ.getClass();
        if (NH3.LIZJ() != null && (LJ = NU7.LJ()) != null) {
            return (AdLandingPageConfig) GsonProtectorUtils.fromJson(new Gson(), LJ, AdLandingPageConfig.class);
        }
        return null;
    }

    public static final void LIZIZ(InterfaceC88472Yns<? super AdLandingPageConfig, C76800UCe> interfaceC88472Yns) {
        AdLandingPageConfig LIZ2 = LIZ();
        if (LIZ2 != null) {
            interfaceC88472Yns.invoke(LIZ2);
        }
    }

    public static int LIZJ(AwemeRawAd awemeRawAd) {
        NativeAuthorInfo nativeAuthorInfo;
        if (awemeRawAd == null || awemeRawAd.getNativeAuthorInfo() == null || awemeRawAd == null || (nativeAuthorInfo = awemeRawAd.getNativeAuthorInfo()) == null || Integer.valueOf(nativeAuthorInfo.getAutoPullStyle()) == null) {
            return 0;
        }
        return awemeRawAd.getNativeAuthorInfo().getAutoPullStyle();
    }
}
