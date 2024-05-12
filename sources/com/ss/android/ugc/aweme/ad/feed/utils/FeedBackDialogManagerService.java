package com.ss.android.ugc.aweme.ad.feed.utils;

import X.C26227ARb;
import X.C66892jt;
import X.C78983UzD;
import X.FMX;
import X.KMP;
import X.Q7K;
import X.UC0;
import android.content.Context;
import android.net.Uri;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ad.feed.AdFeedBackUrlSetting;
import com.ss.android.ugc.aweme.ad.feed.IFeedBackDialogManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class FeedBackDialogManagerService implements IFeedBackDialogManager {
    public static volatile long LIZ;
    public static final /* synthetic */ int LIZIZ = 0;

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedBackDialogManager
    public final void LIZ(String str) {
        if (LIZIZ(str) && LIZ == 0) {
            LIZ = System.currentTimeMillis();
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedBackDialogManager
    public final boolean LIZIZ(String str) {
        Uri parse;
        String host;
        String path;
        AdFeedBackUrlSetting.AdFeedBackUrlModel adFeedBackUrlModel;
        AdFeedBackUrlSetting.AdFeedBackUrlModel adFeedBackUrlModel2;
        if (str == null || (parse = UriProtector.parse(str)) == null || (host = parse.getHost()) == null || (path = parse.getPath()) == null) {
            return false;
        }
        try {
            SettingsManager LIZLLL = SettingsManager.LIZLLL();
            adFeedBackUrlModel = AdFeedBackUrlSetting.LIZ;
            AdFeedBackUrlSetting.AdFeedBackUrlModel adFeedBackUrlModel3 = (AdFeedBackUrlSetting.AdFeedBackUrlModel) LIZLLL.LJIIIIZZ("ad_feed_back_url", AdFeedBackUrlSetting.AdFeedBackUrlModel.class, adFeedBackUrlModel);
            if (adFeedBackUrlModel3 != null) {
                adFeedBackUrlModel = adFeedBackUrlModel3;
            }
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
            adFeedBackUrlModel = AdFeedBackUrlSetting.LIZ;
        }
        if (adFeedBackUrlModel.url == null) {
            return false;
        }
        try {
            SettingsManager LIZLLL2 = SettingsManager.LIZLLL();
            adFeedBackUrlModel2 = AdFeedBackUrlSetting.LIZ;
            AdFeedBackUrlSetting.AdFeedBackUrlModel adFeedBackUrlModel4 = (AdFeedBackUrlSetting.AdFeedBackUrlModel) LIZLLL2.LJIIIIZZ("ad_feed_back_url", AdFeedBackUrlSetting.AdFeedBackUrlModel.class, adFeedBackUrlModel2);
            if (adFeedBackUrlModel4 != null) {
                adFeedBackUrlModel2 = adFeedBackUrlModel4;
            }
        } catch (Throwable th2) {
            C78983UzD.LJIIZILJ(th2);
            adFeedBackUrlModel2 = AdFeedBackUrlSetting.LIZ;
        }
        for (String str2 : adFeedBackUrlModel2.url) {
            Uri parse2 = UriProtector.parse(str2);
            if (parse2 != null && o.LJ(parse2.getHost(), host) && o.LJ(parse2.getPath(), path) && o.LJ(UriProtector.getQueryParameter(parse, "source_type"), "feed")) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedBackDialogManager
    public final void LIZJ(Context context, Aweme aweme) {
        String str;
        AwemeRawAd awemeRawAd;
        if (context == null) {
            return;
        }
        long j = LIZ;
        LIZ = 0L;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            str = awemeRawAd.getWebUrl();
        } else {
            str = null;
        }
        if (!LIZIZ(str) || j == 0 || (System.currentTimeMillis() - j) / 1000 < Q7K.LIZIZ("ad_feedback_dialog_time", 10)) {
            return;
        }
        C26227ARb LIZLLL = KMP.LIZLLL(context, R.string.ba, R.string.bb);
        UC0.LIZJ(LIZLLL, C66892jt.LJLIL);
        LIZLLL.LJII = false;
        LIZLLL.LJI().LIZLLL();
        FMX.onEventV3("your_ad_activity_page_back_toast_show");
    }
}
