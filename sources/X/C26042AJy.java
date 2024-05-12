package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.AJy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26042AJy {
    public static final /* synthetic */ int LIZ = 0;

    public static final HashMap LIZIZ(Aweme aweme) {
        String str;
        Long groupId;
        o.LJIIIZ(aweme, "aweme");
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", "homepage_hot");
        hashMap.put("author_id", aweme.getAuthorUid());
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null && (groupId = awemeRawAd.getGroupId()) != null) {
            str = String.valueOf(groupId);
        } else {
            str = "";
        }
        hashMap.put("group_id", str);
        return hashMap;
    }

    public static final Uri.Builder LIZJ(String str, Aweme aweme) {
        String creativeIdStr;
        Uri.Builder builder = new Uri.Builder();
        HashMap hashMap = new HashMap();
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        String str2 = null;
        if (awemeRawAd != null && awemeRawAd.getLogExtra() != null) {
            AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
            o.LJI(awemeRawAd2);
            str2 = awemeRawAd2.getLogExtra();
        }
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        hashMap.put("log_extra", str2);
        AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
        if (awemeRawAd3 != null && (creativeIdStr = awemeRawAd3.getCreativeIdStr()) != null) {
            str3 = creativeIdStr;
        }
        hashMap.put("cid", str3);
        String json = GsonProtectorUtils.toJson(new Gson(), hashMap);
        o.LJIIIIZZ(json, "Gson().toJson(extraMap)");
        Uri.Builder LIZ2 = LIZ(builder, aweme, str, json);
        C247839o3 c247839o3 = C9X3.LIZ;
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("commerce_report_uri_key_");
        LIZ3.append(AppLog.getServerDeviceId());
        c247839o3.LIZJ(LIZ2.toString(), X1D.LIZIZ(LIZ3));
        return LIZ2;
    }

    public static final Uri.Builder LIZ(Uri.Builder builder, Aweme aweme, String str, String str2) {
        Long l;
        int reportAdType;
        C247839o3 c247839o3 = C9X3.LIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("ies_ad_info_key_");
        LIZ2.append(AppLog.getServerDeviceId());
        c247839o3.LIZJ(str2, X1D.LIZIZ(LIZ2));
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("ies_ad_info_key_");
        LIZ3.append(AppLog.getServerDeviceId());
        if (!TextUtils.equals(c247839o3.LIZIZ(X1D.LIZIZ(LIZ3), ""), str2) || TextUtils.isEmpty(str2)) {
            C58655N0h LIZLLL = C58704N2e.LIZLLL(str, "client_report_write_failed", aweme.getAwemeRawAd());
            LIZLLL.LIZIZ(str2, "ies_ad_info");
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("ies_ad_info_key_");
            LIZ4.append(AppLog.getServerDeviceId());
            LIZLLL.LIZIZ(X1D.LIZIZ(LIZ4), "ies_key");
            LIZLLL.LJI();
        }
        if (TextUtils.isEmpty(AppLog.getServerDeviceId())) {
            C0JU.LIZJ(1, C58704N2e.LIZLLL(str, "client_report_required_param_lost", aweme.getAwemeRawAd()), "device_id_null");
        }
        if (!TextUtils.isEmpty(str2)) {
            JSONObject jSONObject = new JSONObject(str2);
            if (TextUtils.isEmpty(jSONObject.get("log_extra").toString())) {
                C0JU.LIZJ(1, C58704N2e.LIZLLL(str, "client_report_required_param_lost", aweme.getAwemeRawAd()), "log_extra_null");
            }
            if (TextUtils.isEmpty(jSONObject.get("cid").toString())) {
                C0JU.LIZJ(1, C58704N2e.LIZLLL(str, "client_report_required_param_lost", aweme.getAwemeRawAd()), "cid_value_invalid");
            }
        }
        Uri.Builder appendQueryParameter = builder.appendQueryParameter("report_type", "ad").appendQueryParameter("object_id", aweme.getAid()).appendQueryParameter("item_id", aweme.getAid()).appendQueryParameter("owner_id", aweme.getAuthorUid()).appendQueryParameter("user_id", ((RBX) HG3.LJIILL()).getCurUserId());
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null) {
            l = awemeRawAd.getGroupId();
        } else {
            l = null;
        }
        Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("group_id", String.valueOf(l)).appendQueryParameter("report_from", str).appendQueryParameter("app_language", SettingServiceImpl.LIZ().getAppLanguage()).appendQueryParameter("app_name", EF7.LIZ()).appendQueryParameter("device_id", AppLog.getServerDeviceId()).appendQueryParameter("platform", "android").appendQueryParameter("version", EF7.LIZLLL()).appendQueryParameter("install_id", AppLog.getInstallId());
        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
        if (awemeRawAd2 != null && (reportAdType = awemeRawAd2.getReportAdType()) != 0) {
            builder.appendQueryParameter("report_ad_type", String.valueOf(reportAdType));
        }
        o.LJIIIIZZ(appendQueryParameter2, "builder\n            .app…          }\n            }");
        return appendQueryParameter2;
    }
}
