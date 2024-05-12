package X;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.detail.ui.DetailActivity;
import kotlin.jvm.internal.o;

/* renamed from: X.Lvp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C55841Lvp extends M56 {
    @Override // X.M56
    public final boolean LJFF(String str, String str2) {
        return SC5.LIZIZ(str, "host", str2, "path", str, "detail");
    }

    @Override // X.M56
    public final void LIZLLL(Activity activity, android.net.Uri uri, boolean z) {
        String queryParameter;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(uri, "uri");
        Intent intent = new Intent(activity, (Class<?>) DetailActivity.class);
        String queryParameter2 = UriProtector.getQueryParameter(uri, "enter_from");
        intent.putExtra("id", UriProtector.getQueryParameter(uri, "id"));
        intent.putExtra("video_from", "STORY_ENTRANCE_DEFAULT");
        intent.putExtra("refer", "web");
        intent.putExtra("enter_from", queryParameter2);
        intent.putExtra("story type", "1");
        if (C37093Eh7.LIZJ(uri, "utm_campaign", "client_share") || C37093Eh7.LIZJ(uri, "utm_campaign", "client_scan_code")) {
            intent.putExtra("share_expose_sharer", true);
            String queryParameter3 = UriProtector.getQueryParameter(uri, "story_uid");
            if (queryParameter3 == null && (queryParameter = UriProtector.getQueryParameter(uri, "params_url")) != null) {
                queryParameter3 = UriProtector.getQueryParameter(UriProtector.parse(queryParameter), "story_uid");
            }
            intent.putExtra("userid", queryParameter3);
            intent.putExtra("is_from_story_client_share", true);
        }
        intent.setData(uri);
        String queryParameter4 = UriProtector.getQueryParameter(uri, "commentId");
        if (!TextUtils.isEmpty(queryParameter4)) {
            intent.putExtra("cid", queryParameter4);
        }
        if (C61017Nx7.LIZ().LIZIZ()) {
            C16880lQ.LIZIZ(activity, intent);
            return;
        }
        Intent LJIJI = C51029K0z.LJIJI(activity);
        LJIJI.putExtra("extra_from_deeplink", true);
        activity.startActivities(new Intent[]{LJIJI, intent});
    }

    @Override // X.M56
    public final Intent LIZ(Activity activity, android.net.Uri uri, String host, String path, String fromTokenType, boolean z) {
        String str;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(host, "host");
        o.LJIIIZ(path, "path");
        o.LJIIIZ(fromTokenType, "fromTokenType");
        Intent intent = new Intent(activity, (Class<?>) DetailActivity.class);
        String queryParameter = UriProtector.getQueryParameter(uri, "share_comment_id");
        if (!TextUtils.isEmpty(fromTokenType)) {
            str = fromTokenType;
        } else {
            str = "web";
        }
        if (C55837Lvl.LJI(uri, UriProtector.getQueryParameter(uri, "id"))) {
            return null;
        }
        Intent LIZ = C55839Lvn.LIZ(activity, uri, intent, z, UriProtector.getQueryParameter(uri, "id"));
        C55836Lvk.LIZ(uri, LIZ, z);
        LIZ.putExtra("refer", str);
        LIZ.putExtra("from_token", fromTokenType);
        LIZ.putExtra("id", UriProtector.getQueryParameter(uri, "id"));
        if (C55839Lvn.LIZJ(uri)) {
            LIZ.putExtra("video_from", "from_search_video_detail_applink");
            String queryParameter2 = UriProtector.getQueryParameter(uri, "search_keyword");
            String str2 = "";
            if (queryParameter2 == null) {
                queryParameter2 = "";
            }
            LIZ.putExtra("search_keyword", queryParameter2);
            LIZ.putExtra("key_search_type", "video");
            String queryParameter3 = UriProtector.getQueryParameter(uri, "enter_from_sub");
            if (queryParameter3 == null) {
                queryParameter3 = "";
            }
            LIZ.putExtra("enter_from_sub", queryParameter3);
            String queryParameter4 = UriProtector.getQueryParameter(uri, "enter_from");
            if (queryParameter4 == null) {
                queryParameter4 = "";
            }
            LIZ.putExtra("enter_from", queryParameter4);
            String queryParameter5 = UriProtector.getQueryParameter(uri, "enter_method");
            if (queryParameter5 == null) {
                queryParameter5 = "";
            }
            LIZ.putExtra("enter_method", queryParameter5);
            String queryParameter6 = UriProtector.getQueryParameter(uri, "preClickImprId");
            if (queryParameter6 != null) {
                str2 = queryParameter6;
            }
            LIZ.putExtra("preClickImprId", str2);
        }
        if (!TextUtils.isEmpty(queryParameter)) {
            LIZ.putExtra("cid", queryParameter);
        }
        M62.LIZIZ.LIZIZ(uri, "detail", z);
        return LIZ;
    }
}
