package X;

import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import java.net.URLDecoder;
import kotlin.jvm.internal.o;

/* renamed from: X.Lvk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55836Lvk {
    public static void LIZIZ(Intent intent, android.net.Uri uri) {
        if (TextUtils.equals(UriProtector.getQueryParameter(uri, "utm_campaign"), "client_share")) {
            intent.putExtra("share_expose_sharer", true);
        } else if (TextUtils.equals(UriProtector.getQueryParameter(uri, "insert_feed"), "1")) {
            intent.putExtra("share_expose_sharer", false);
        }
        intent.putExtra("from_notification", false);
    }

    public static void LIZJ(Intent intent, android.net.Uri uri) {
        String queryParameter = UriProtector.getQueryParameter(uri, "utm_source");
        if (queryParameter != null) {
            intent.putExtra("share_url_utm_source", queryParameter);
        }
        String queryParameter2 = UriProtector.getQueryParameter(uri, "share_link_id");
        if (queryParameter2 != null) {
            intent.putExtra("share_url_link_id", queryParameter2);
        }
        String queryParameter3 = UriProtector.getQueryParameter(uri, "user_id");
        if (queryParameter3 != null) {
            intent.putExtra("share_url_user_id", queryParameter3);
        }
        String queryParameter4 = UriProtector.getQueryParameter(uri, "sec_user_id");
        if (queryParameter4 != null) {
            intent.putExtra("share_sec_url_user_id", queryParameter4);
        }
        String queryParameter5 = UriProtector.getQueryParameter(uri, "checksum");
        if (queryParameter5 != null) {
            intent.putExtra("share_url_checksum", queryParameter5);
        }
        String queryParameter6 = UriProtector.getQueryParameter(uri, "share_item_id");
        if (queryParameter6 != null) {
            intent.putExtra("share_url_item_id", queryParameter6);
        }
        String queryParameter7 = UriProtector.getQueryParameter(uri, "social_share_type");
        if (queryParameter7 != null) {
            intent.putExtra("social_share_type", queryParameter7);
        }
        String queryParameter8 = UriProtector.getQueryParameter(uri, "timestamp");
        if (queryParameter8 != null) {
            intent.putExtra("share_url_timestamp", queryParameter8);
        }
        String queryParameter9 = UriProtector.getQueryParameter(uri, "invitation_scene");
        if (queryParameter9 != null) {
            intent.putExtra("invitation_scene", queryParameter9);
        }
    }

    public static void LIZ(android.net.Uri uri, Intent intent, boolean z) {
        if (uri != null && intent != null && !z) {
            try {
                if (!uri.isOpaque()) {
                    if (TextUtils.equals(UriProtector.getQueryParameter(uri, "utm_campaign"), "client_share") || TextUtils.equals(UriProtector.getQueryParameter(uri, "insert_feed"), "1")) {
                        LIZIZ(intent, uri);
                        if (TextUtils.equals(UriProtector.getQueryParameter(uri, "utm_campaign"), "client_share")) {
                            LIZJ(intent, uri);
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
                        LIZIZ(intent, httpLink);
                        if (TextUtils.equals(UriProtector.getQueryParameter(httpLink, "utm_campaign"), "client_share")) {
                            LIZJ(intent, httpLink);
                        }
                    }
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }
}
