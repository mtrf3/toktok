package X;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* loaded from: classes11.dex */
public final class NPN {
    public static C59314NPq LIZIZ(Intent intent) {
        Bundle LLJJIJI = C16880lQ.LLJJIJI(intent);
        if (LLJJIJI == null) {
            LLJJIJI = new Bundle();
        }
        if (TextUtils.isEmpty(LLJJIJI.getString("url")) && intent.getData() != null && !TextUtils.isEmpty(intent.getData().toString())) {
            LLJJIJI.putString("url", intent.getData().toString());
        }
        try {
            if (!TextUtils.isEmpty(LLJJIJI.getString("url"))) {
                android.net.Uri parse = UriProtector.parse(LLJJIJI.getString("url"));
                LLJJIJI.putString("hybrid_report_source", UriProtector.getQueryParameter(parse, "hybrid_report_source"));
                String queryParameter = UriProtector.getQueryParameter(parse, "has_adinfojson");
                LLJJIJI.putString("has_ad_info_json", queryParameter);
                if (TextUtils.equals(queryParameter, "1")) {
                    LLJJIJI.putString("ad_info_json", UriProtector.getQueryParameter(UriProtector.parse(LLJJIJI.getString("url")), "adinfojson"));
                }
            }
            String string = LLJJIJI.getString("hide_nav_bar", "-1");
            if (!TextUtils.equals(string, "-1")) {
                LIZ("hide_nav_bar", string, LLJJIJI);
            }
            String string2 = LLJJIJI.getString("hide_status_bar", "-1");
            if (!TextUtils.equals(string2, "-1")) {
                LIZ("hide_status_bar", string2, LLJJIJI);
            }
            String string3 = LLJJIJI.getString("hide_more", "-1");
            if (!TextUtils.equals(string3, "-1")) {
                LIZ("hide_more", string3, LLJJIJI);
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        return C59307NPj.LIZ(LLJJIJI);
    }

    public static void LIZ(String str, String str2, Bundle bundle) {
        if (TextUtils.equals("1", str2)) {
            bundle.putBoolean(str, true);
            return;
        }
        if (TextUtils.equals("true", str2)) {
            bundle.putBoolean(str, true);
        } else if (TextUtils.equals(CardStruct.IStatusCode.DEFAULT, str2)) {
            bundle.putBoolean(str, false);
        } else {
            if (!TextUtils.equals("false", str2)) {
                return;
            }
            bundle.putBoolean(str, false);
        }
    }
}
