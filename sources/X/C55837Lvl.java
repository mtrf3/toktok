package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import java.net.URLDecoder;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Lvl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55837Lvl {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZJ(android.net.Uri uri) {
        String queryParameter;
        o.LJIIIZ(uri, "uri");
        String queryParameter2 = UriProtector.getQueryParameter(uri, "story_uid");
        if (queryParameter2 == null && (queryParameter = UriProtector.getQueryParameter(uri, "params_url")) != null) {
            return UriProtector.getQueryParameter(UriProtector.parse(queryParameter), "story_uid");
        }
        return queryParameter2;
    }

    public static void LIZIZ(android.net.Uri uri, HashMap hashMap) {
        if (TextUtils.equals(UriProtector.getQueryParameter(uri, "utm_campaign"), "client_share")) {
            hashMap.put("share_expose_sharer", Boolean.TRUE);
        } else if (TextUtils.equals(UriProtector.getQueryParameter(uri, "insert_feed"), "1")) {
            hashMap.put("share_expose_sharer", Boolean.FALSE);
        }
        hashMap.put("from_notification", Boolean.FALSE);
    }

    public static void LIZLLL(String str, HashMap hashMap) {
        hashMap.put("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME");
        hashMap.put("tab", 1);
        hashMap.put("need_post", Boolean.TRUE);
        hashMap.put("id", str);
        hashMap.put("gids", str);
    }

    public static void LJ(android.net.Uri uri, HashMap hashMap) {
        String queryParameter = UriProtector.getQueryParameter(uri, "utm_source");
        if (queryParameter != null) {
            hashMap.put("share_url_utm_source", queryParameter);
        }
        String queryParameter2 = UriProtector.getQueryParameter(uri, "share_link_id");
        if (queryParameter2 != null) {
            hashMap.put("share_url_link_id", queryParameter2);
        }
        String queryParameter3 = UriProtector.getQueryParameter(uri, "user_id");
        if (queryParameter3 != null) {
            hashMap.put("share_url_user_id", queryParameter3);
        }
        String queryParameter4 = UriProtector.getQueryParameter(uri, "sec_user_id");
        if (queryParameter4 != null) {
            hashMap.put("share_sec_url_user_id", queryParameter4);
        }
        String queryParameter5 = UriProtector.getQueryParameter(uri, "checksum");
        if (queryParameter5 != null) {
            hashMap.put("share_url_checksum", queryParameter5);
        }
        String queryParameter6 = UriProtector.getQueryParameter(uri, "timestamp");
        if (queryParameter6 != null) {
            hashMap.put("share_url_timestamp", queryParameter6);
        }
        String queryParameter7 = UriProtector.getQueryParameter(uri, "invitation_scene");
        if (queryParameter7 != null) {
            hashMap.put("invitation_scene", queryParameter7);
        }
    }

    public static boolean LJI(android.net.Uri uri, String str) {
        o.LJIIIZ(uri, "uri");
        if (str == null) {
            str = "";
        }
        if (!TextUtils.isDigitsOnly(str)) {
            return false;
        }
        if (o.LJ("40", UriProtector.getQueryParameter(uri, "aweme_type"))) {
            return true;
        }
        String queryParameter = UriProtector.getQueryParameter(uri, "params_url");
        if (queryParameter == null || !o.LJ("40", UriProtector.getQueryParameter(UriProtector.parse(queryParameter), "aweme_type"))) {
            return false;
        }
        return true;
    }

    public static void LIZ(android.net.Uri uri, HashMap hashMap, boolean z) {
        if (!z) {
            try {
                if (!uri.isOpaque()) {
                    if (TextUtils.equals(UriProtector.getQueryParameter(uri, "utm_campaign"), "client_share") || TextUtils.equals(UriProtector.getQueryParameter(uri, "insert_feed"), "1")) {
                        LIZIZ(uri, hashMap);
                        if (o.LJ(UriProtector.getQueryParameter(uri, "utm_campaign"), "client_share")) {
                            LJ(uri, hashMap);
                        }
                    }
                    String str = "";
                    String queryParameter = UriProtector.getQueryParameter(uri, "params_url");
                    if (queryParameter == null) {
                        String queryParameter2 = UriProtector.getQueryParameter(uri, "target_url");
                        if (queryParameter2 != null) {
                            str = URLDecoder.decode(queryParameter2, "UTF-8");
                            o.LJIIIIZZ(str, "decode(this, \"UTF-8\")");
                        }
                    } else {
                        str = URLDecoder.decode(queryParameter, "UTF-8");
                        o.LJIIIIZZ(str, "decode(this, \"UTF-8\")");
                    }
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    android.net.Uri httpLink = UriProtector.parse(str);
                    if (TextUtils.equals(UriProtector.getQueryParameter(httpLink, "utm_campaign"), "client_share") || TextUtils.equals(UriProtector.getQueryParameter(httpLink, "insert_feed"), "1")) {
                        o.LJIIIIZZ(httpLink, "httpLink");
                        LIZIZ(httpLink, hashMap);
                        if (TextUtils.equals(UriProtector.getQueryParameter(httpLink, "utm_campaign"), "client_share")) {
                            LJ(httpLink, hashMap);
                        }
                    }
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    public static boolean LJFF(android.net.Uri uri, String str, String str2) {
        o.LJIIIZ(uri, "uri");
        if (TextUtils.equals(str2, UriProtector.getQueryParameter(uri, str))) {
            return true;
        }
        String queryParameter = UriProtector.getQueryParameter(uri, "params_url");
        if (queryParameter != null && TextUtils.equals(str2, UriProtector.getQueryParameter(UriProtector.parse(queryParameter), str))) {
            return true;
        }
        return false;
    }

    public static boolean LJII(android.net.Uri uri, boolean z, String str, boolean z2, boolean z3) {
        if (z2) {
            return false;
        }
        String queryParameter = UriProtector.getQueryParameter(uri, "share_comment_id");
        if (queryParameter == null) {
            queryParameter = "";
        }
        if (z || LJI(uri, str) || !TextUtils.isEmpty(queryParameter)) {
            return false;
        }
        if (!LJFF(uri, "insert_feed", "1")) {
            if (LJFF(uri, "video_detail", "1")) {
                return false;
            }
            if (LJFF(uri, "jump_to_search_detail", "1") && z3) {
                return false;
            }
        }
        return true;
    }
}
