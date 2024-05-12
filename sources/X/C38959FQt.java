package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.live.Live;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.FQt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38959FQt {
    public static final List<String> LIZ = C47261Igj.LJJIJIIJI("status_bar_height", "type", "gravity", "status_bar_color", "radius", "height", "width", "hide_nav_bar", "hide_status", "close_button", "use_page_back", "disable_background", "show_title_bar", "title", "show_title_close", "show_title_share", "show_dim", "mask_alpha", "soft_input_mode", "use_new_container", "disable_back_press", "show_closeall", "use_spark", "__live_platform__");

    public static boolean LIZJ(android.net.Uri uri) {
        String str;
        String authority;
        if (uri != null) {
            str = UriProtector.getQueryParameter(uri, "use_spark");
        } else {
            str = null;
        }
        if (!o.LJ("1", str)) {
            return false;
        }
        String authority2 = uri.getAuthority();
        if ((authority2 != null && !s.LJJJLZIJ(authority2, "webview", false) && (authority = uri.getAuthority()) != null && !s.LJJJLZIJ(authority, "lynxview", false)) || !TextUtils.equals(UriProtector.getQueryParameter(uri, "__live_platform__"), "webcast")) {
            return false;
        }
        return true;
    }

    public static boolean LIZLLL(android.net.Uri uri) {
        if (TextUtils.equals("webcast_lynxview", uri.getHost())) {
            return false;
        }
        if (!TextUtils.equals("webcast_webview", uri.getHost()) && !TextUtils.equals(UriProtector.getQueryParameter(uri, "__live_platform__"), "webcast")) {
            return false;
        }
        return true;
    }

    public static final boolean LIZ(android.net.Uri uri, Context context) {
        String queryParameter;
        if (uri == null) {
            return false;
        }
        String uri2 = uri.toString();
        o.LJIIIIZZ(uri2, "uri.toString()");
        if (LIZJ(uri)) {
            if (context == null) {
                context = ActivityStack.getTopActivity();
            }
            o.LJIIIIZZ(context, "context ?: ActivityStack.getTopActivity()");
            C38557FBh.LIZ(context, uri2, null, null);
            return true;
        }
        if (LIZLLL(uri)) {
            String queryParameter2 = UriProtector.getQueryParameter(uri, "url");
            if (queryParameter2 == null) {
                return false;
            }
            String decode = URLDecoder.decode(queryParameter2);
            StringBuilder sb = new StringBuilder();
            android.net.Uri parse = UriProtector.parse(decode);
            for (String str : LIZ) {
                if (parse != null && (queryParameter = UriProtector.getQueryParameter(parse, str)) != null) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append('&');
                    LIZ2.append(str);
                    LIZ2.append('=');
                    LIZ2.append(queryParameter);
                    sb.append(X1D.LIZIZ(LIZ2));
                } else {
                    String queryParameter3 = UriProtector.getQueryParameter(uri, str);
                    if (queryParameter3 != null) {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append('&');
                        LIZ3.append(str);
                        LIZ3.append('=');
                        LIZ3.append(queryParameter3);
                        sb.append(X1D.LIZIZ(LIZ3));
                    }
                }
            }
            if (C19N.LJ("live_host_schema_handle_opt", true)) {
                String sb2 = sb.toString();
                String encode = URLEncoder.encode(decode);
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("sslocal://webcast_webview?url=");
                LIZ4.append(encode);
                LIZ4.append(sb2);
                LIZIZ(null, X1D.LIZIZ(LIZ4));
                return true;
            }
            OZ1.LIZIZ.LJII(decode, sb.toString(), new C38960FQu());
            return true;
        }
        return LIZIZ(context, uri2);
    }

    public static final boolean LIZIZ(Context context, String str) {
        if (str == null) {
            return false;
        }
        if (context == null) {
            context = EF7.LIZIZ();
        }
        try {
            LiveOuterService.LJJJLL().LJJIJLIJ();
            if (C78475Ur1.LIZ()) {
                if (LiveOuterService.LJJJLL().LJJIJIL().LIZLLL(context, str)) {
                    return true;
                }
            }
        } catch (Throwable th) {
            PEH.LIZJ(th);
        }
        if (!TMC.LJJIJIL(str)) {
            return false;
        }
        LiveOuterService.LJJJLL().LJJIJIL().getClass();
        Live.openLiveRecordBySchema(str);
        return true;
    }
}
