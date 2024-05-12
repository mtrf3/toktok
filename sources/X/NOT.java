package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.AutofillModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;

/* loaded from: classes11.dex */
public final class NOT {
    public static void LIZJ(Context context, Bundle bundle) {
        bundle.putInt("bundle_app_ad_from", 1);
        bundle.putBoolean("bundle_is_ad_fake", true);
    }

    public static void LIZ(Context context, Bundle bundle, Aweme aweme) {
        String str;
        if (aweme.getAwemeRawAd() == null) {
            return;
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null) {
            str = awemeRawAd.getWebUrl();
        } else {
            str = null;
        }
        bundle.putString("url", str);
        bundle.putString("aweme_id", aweme.getAid());
        bundle.putBoolean("control_request_url", true);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x017b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(android.content.Context r10, android.os.Bundle r11, com.ss.android.ugc.aweme.feed.model.Aweme r12) {
        /*
            Method dump skipped, instructions count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NOT.LIZIZ(android.content.Context, android.os.Bundle, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    public static void LIZLLL(Context context, Bundle bundle, Aweme aweme) {
        String str;
        boolean z;
        AutofillModel autofillModel;
        if (aweme.getAwemeRawAd() == null) {
            return;
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null) {
            str = awemeRawAd.getWebTitle();
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            str = " ";
        }
        bundle.putString("bundle_web_title", str);
        boolean z2 = true;
        bundle.putBoolean("bundle_nav_bar_status_padding", true);
        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
        if (awemeRawAd2 != null && awemeRawAd2.isUseDefaultColor()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            bundle.putInt("bundle_webview_background", C78609UtB.LJJJ(R.attr.cl, context));
        } else {
            bundle.putInt("bundle_webview_background", -1);
        }
        AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
        if (awemeRawAd3 != null) {
            bundle.putBoolean("show_report", awemeRawAd3.isReportEnable());
        }
        AwemeRawAd awemeRawAd4 = aweme.getAwemeRawAd();
        if (awemeRawAd4 != null) {
            bundle.putBoolean("web_apply_camera", awemeRawAd4.getWebApplyCamera());
        }
        AwemeRawAd awemeRawAd5 = aweme.getAwemeRawAd();
        if (awemeRawAd5 != null && (autofillModel = awemeRawAd5.getAutofillModel()) != null) {
            bundle.putBoolean("autofill_enable", autofillModel.getEnable());
        }
        AwemeRawAd awemeRawAd6 = aweme.getAwemeRawAd();
        if (awemeRawAd6 != null) {
            bundle.putBoolean("use_ordinary_web", C78939UyV.LJJIZ(awemeRawAd6));
        }
        AwemeRawAd awemeRawAd7 = aweme.getAwemeRawAd();
        if (awemeRawAd7 == null || awemeRawAd7.getWebviewProgressBar() != 1) {
            z2 = false;
        }
        bundle.putBoolean("webview_progress_bar", z2);
    }
}
