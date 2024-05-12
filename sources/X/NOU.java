package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.commercialize.feed.preload.PreloadData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class NOU {
    public static final /* synthetic */ int LIZ = 0;

    public static NOA LIZ(Context context, AwemeRawAd awemeRawAd) {
        C59282NOk c59282NOk = C59282NOk.LIZ;
        o.LJIIIZ(context, "context");
        NOA noa = new NOA(context, c59282NOk);
        noa.LJ = awemeRawAd;
        return noa;
    }

    public static Bundle LIZIZ(int i, Aweme aweme) {
        AwemeRawAd awemeRawAd;
        Bundle bundle = new Bundle();
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            bundle.putString("ad_type", awemeRawAd.getType());
            bundle.putString("light_page_web_url", awemeRawAd.getLightWebUrl());
            bundle.putInt("webview_type", awemeRawAd.getWebviewType());
            bundle.putInt("click_from", i);
        }
        return bundle;
    }

    public static Bundle LIZLLL(String str, Aweme aweme) {
        AwemeRawAd awemeRawAd;
        long longValue;
        Bundle bundle = new Bundle();
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            Long creativeId = awemeRawAd.getCreativeId();
            long j = 0;
            if (creativeId == null) {
                longValue = 0;
            } else {
                longValue = creativeId.longValue();
            }
            bundle.putLong("creative_id", longValue);
            bundle.putString("log_extra", awemeRawAd.getLogExtra());
            Long groupId = awemeRawAd.getGroupId();
            if (groupId != null) {
                j = groupId.longValue();
            }
            bundle.putLong("group_id", j);
            bundle.putString("open_url", str);
            bundle.putString("log_tag", "draw_ad");
            bundle.putString("aweme_id", aweme.getAid());
        }
        return bundle;
    }

    public static Bundle LIZJ(Aweme aweme, String str, String str2, int i) {
        AwemeRawAd awemeRawAd;
        Bundle bundle = new Bundle();
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            bundle.putString("real_web_url", str);
            if (str2 == null) {
                str2 = awemeRawAd.getWebTitle();
            }
            bundle.putString("title", str2);
            bundle.putString("aweme_id", aweme.getAid());
            bundle.putInt("click_from", i);
        }
        return bundle;
    }

    public static Bundle LJ(Context context, String str, String str2, Aweme aweme, boolean z, String str3, int i, int i2) {
        int i3;
        Boolean bool;
        AwemeRawAd awemeRawAd;
        long longValue;
        String str4;
        PreloadData preloadData;
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        int i4 = i;
        if ((i2 & 32) != 0) {
            str7 = "draw_ad";
        }
        int i5 = 1;
        if ((i2 & 64) != 0) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        String str8 = null;
        if ((i2 & 128) != 0) {
            bool = Boolean.FALSE;
        } else {
            bool = null;
        }
        if ((i2 & 256) != 0) {
            i4 = 0;
        }
        Bundle bundle = new Bundle();
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            Long creativeId = awemeRawAd.getCreativeId();
            long j = 0;
            if (creativeId == null) {
                longValue = 0;
            } else {
                longValue = creativeId.longValue();
            }
            bundle.putLong("creative_id", longValue);
            bundle.putString("log_extra", awemeRawAd.getLogExtra());
            Long groupId = awemeRawAd.getGroupId();
            if (groupId != null) {
                j = groupId.longValue();
            }
            bundle.putLong("group_id", j);
            bundle.putString("log_tag", str7);
            if (str5 == null) {
                str5 = awemeRawAd.getWebUrl();
                if (str5 == null) {
                    str5 = NN2.LIZJ(aweme);
                }
            } else {
                i5 = 0;
            }
            bundle.putString("real_web_url", str5);
            if (str6 == null) {
                str6 = awemeRawAd.getWebTitle();
            }
            if (TextUtils.isEmpty(str6)) {
                str6 = " ";
            }
            bundle.putString("title", str6);
            bundle.putBoolean("show_report", awemeRawAd.isReportEnable());
            bundle.putInt("app_ad_from", i3);
            if (C63081OpJ.LLIIII(aweme)) {
                bundle.putString("enter_from", "topview");
            }
            bundle.putString("ad_type", awemeRawAd.getType());
            bundle.putInt("ad_system_origin", awemeRawAd.getSystemOrigin());
            bundle.putString("landing_page_info", awemeRawAd.getLandingPageInfo());
            bundle.putBoolean("disable_download_dialog", awemeRawAd.isDisableDownloadDialog());
            bundle.putString("download_url", awemeRawAd.getDownloadUrl());
            bundle.putString("aweme_package_name", awemeRawAd.getPackageName());
            bundle.putString("ad_quick_app_url", awemeRawAd.getQuickAppUrl());
            bundle.putString("download_app_name", awemeRawAd.getAppName());
            bundle.putString("web_url", awemeRawAd.getWebUrl());
            bundle.putString("web_title", awemeRawAd.getWebTitle());
            bundle.putInt("download_mode", awemeRawAd.getDownloadMode());
            bundle.putInt("link_mode", awemeRawAd.getLinkMode());
            bundle.putBoolean("support_multiple_download", awemeRawAd.isSupportMultiple());
            bundle.putString("open_url", awemeRawAd.getOpenUrl());
            JSONObject LJIIIZ = C59280NOi.LIZIZ.LJIIIZ(context, aweme);
            if (LJIIIZ == null || (str4 = LJIIIZ.toString()) == null) {
                str4 = "";
            }
            bundle.putString("aweme_json_extra", str4);
            bundle.putBoolean("use_default_color", awemeRawAd.isUseDefaultColor());
            bundle.putString("channel_name", awemeRawAd.getChannelName());
            bundle.putString("aweme_id", aweme.getAid());
            bundle.putInt("click_from", i4);
            bundle.putString("owner_id", aweme.getAuthorUid());
            bundle.putBoolean("use_ordinary_web", z);
            AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
            if (awemeRawAd2 != null && (preloadData = awemeRawAd2.getPreloadData()) != null) {
                str8 = preloadData.getSiteId();
            }
            bundle.putString("site_id", str8);
            bundle.putInt("preload_web_status", awemeRawAd.getPreloadWeb());
            bundle.putInt("preload_is_web_url", i5);
            bundle.putInt("web_type", awemeRawAd.getWebType());
            bundle.putBoolean("enable_web_report", awemeRawAd.isEnableWebReport());
            bundle.putInt("webview_progress_bar", awemeRawAd.getWebviewProgressBar());
            if (o.LJ(bool, Boolean.TRUE)) {
                bundle.putString("commerce_enter_from", "splash");
            } else {
                bundle.putString("commerce_enter_from", "feedad");
            }
        }
        return bundle;
    }
}
