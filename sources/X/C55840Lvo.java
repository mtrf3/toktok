package X;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.detail.ui.DetailActivity;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* renamed from: X.Lvo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55840Lvo extends M56 {
    public static Intent LJII(Activity activity, android.net.Uri uri) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(uri, "uri");
        Intent intent = new Intent(activity, (Class<?>) DetailActivity.class);
        intent.putExtra("from_adsapp_activity", true);
        intent.putExtra("from_uid", UriProtector.getQueryParameter(uri, "from_uid"));
        return intent;
    }

    @Override // X.M56
    public final boolean LJFF(String host, String path) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(path, "path");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(host);
        LIZ.append(path);
        return o.LJ(X1D.LIZIZ(LIZ), "aweme/push_detail");
    }

    @Override // X.M56
    public final Intent LIZ(Activity activity, android.net.Uri uri, String host, String path, String str, boolean z) {
        Intent LJII;
        String queryParameter;
        String fromTokenType = str;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(host, "host");
        o.LJIIIZ(path, "path");
        o.LJIIIZ(fromTokenType, "fromTokenType");
        JSONObject jSONObject = new JSONObject();
        String queryParameter2 = UriProtector.getQueryParameter(uri, "gids");
        String str2 = "";
        if (queryParameter2 == null) {
            queryParameter2 = "";
        }
        int i = 0;
        String str3 = (String) ORZ.LJLLLLLL(0, s.LJLJJL(queryParameter2, new String[]{","}, 0, 6));
        if (C55839Lvn.LIZJ(uri) && C78685UuP.LJJJZ(str3)) {
            LJII = new Intent(activity, (Class<?>) DetailActivity.class);
            LJII.putExtra("id", str3);
            LJII.putExtra("from_adsapp_activity", true);
            LJII.putExtra("from_uid", UriProtector.getQueryParameter(uri, "from_uid"));
            LJII.putExtra("video_from", "from_search_video_detail_applink");
            String queryParameter3 = UriProtector.getQueryParameter(uri, "search_keyword");
            if (queryParameter3 == null) {
                queryParameter3 = "";
            }
            LJII.putExtra("search_keyword", queryParameter3);
            LJII.putExtra("key_search_type", "video");
            String queryParameter4 = UriProtector.getQueryParameter(uri, "enter_from_sub");
            if (queryParameter4 == null) {
                queryParameter4 = "";
            }
            LJII.putExtra("enter_from_sub", queryParameter4);
            String queryParameter5 = UriProtector.getQueryParameter(uri, "enter_from");
            if (queryParameter5 == null) {
                queryParameter5 = "";
            }
            LJII.putExtra("enter_from", queryParameter5);
            String queryParameter6 = UriProtector.getQueryParameter(uri, "enter_method");
            if (queryParameter6 == null) {
                queryParameter6 = "";
            }
            LJII.putExtra("enter_method", queryParameter6);
            String queryParameter7 = UriProtector.getQueryParameter(uri, "preClickImprId");
            if (queryParameter7 == null) {
                queryParameter7 = "";
            }
            LJII.putExtra("preClickImprId", queryParameter7);
        } else if (C61017Nx7.LIZ().LIZIZ()) {
            if (TextUtils.equals(UriProtector.getQueryParameter(uri, "hot"), "feed")) {
                LJII = C51029K0z.LJIJI(activity);
                LJII.putExtra("extra_from_deeplink", true);
                LJII.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME");
                LJII.putExtra("tab", 1);
            } else {
                LJII = LJII(activity, uri);
            }
        } else if (TextUtils.equals(UriProtector.getQueryParameter(uri, "cold"), "feed")) {
            LJII = C51029K0z.LJIJI(activity);
            LJII.putExtra("extra_from_deeplink", true);
            LJII.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME");
            LJII.putExtra("tab", 1);
        } else {
            LJII = LJII(activity, uri);
        }
        String queryParameter8 = UriProtector.getQueryParameter(uri, "gids");
        if (!TextUtils.isEmpty(queryParameter8)) {
            LJII.putExtra("ids", queryParameter8);
            LJII.putExtra("gids", queryParameter8);
        }
        String queryParameter9 = UriProtector.getQueryParameter(uri, "from");
        if (!TextUtils.isEmpty(queryParameter9)) {
            LJII.putExtra("from_micro_app", queryParameter9);
        }
        String queryParameter10 = UriProtector.getQueryParameter(uri, "label");
        if (TextUtils.isEmpty(queryParameter10)) {
            queryParameter10 = "web";
        }
        if (TextUtils.isEmpty(fromTokenType)) {
            fromTokenType = queryParameter10;
        }
        if (!TextUtils.isEmpty(queryParameter9)) {
            fromTokenType = "mp_page";
        }
        LJII.putExtra("refer", fromTokenType);
        LJII.putExtra("gd_label", UriProtector.getQueryParameter(uri, "gd_label"));
        String queryParameter11 = UriProtector.getQueryParameter(uri, "push_params");
        if (!TextUtils.isEmpty(queryParameter11)) {
            LJII.putExtra("push_params", queryParameter11);
        }
        if (TextUtils.equals(UriProtector.getQueryParameter(uri, "cold"), "nearby_detail") && !C61017Nx7.LIZ().LIZIZ()) {
            LJII.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "NEARBY");
        }
        try {
            if (!C61017Nx7.LIZ().LIZIZ()) {
                i = 1;
            }
            jSONObject.put("is_cold_launch", i);
            if (C61017Nx7.LIZ().LIZIZ()) {
                queryParameter = UriProtector.getQueryParameter(uri, "hot");
            } else {
                queryParameter = UriProtector.getQueryParameter(uri, "cold");
            }
            jSONObject.put("landing_page", queryParameter);
            String queryParameter12 = UriProtector.getQueryParameter(uri, "push_id");
            if (queryParameter12 == null) {
                queryParameter12 = "";
            }
            jSONObject.put("rule_id", queryParameter12);
            String queryParameter13 = UriProtector.getQueryParameter(uri, "gids");
            if (queryParameter13 == null) {
                queryParameter13 = "";
            }
            jSONObject.put("group_id", queryParameter13);
            Activity[] activityStack = ActivityStack.getActivityStack();
            if (activityStack != null && activityStack.length > 1) {
                jSONObject.put("last_page_path", C16880lQ.LJLLJ(activityStack[activityStack.length - 1].getClass()));
            } else {
                jSONObject.put("last_page_path", "");
            }
            String queryParameter14 = UriProtector.getQueryParameter(uri, "gd_label");
            if (queryParameter14 != null) {
                str2 = queryParameter14;
            }
            jSONObject.put("push_label", str2);
            M62.LIZIZ.LIZIZ(uri, "homepage_hot", z);
            FMX.LJIILJJIL("hot_search_video_push", jSONObject);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        return LJII;
    }
}
