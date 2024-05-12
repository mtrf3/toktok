package X;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.IExternalService;
import defpackage.e1;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.Lvn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55839Lvn {
    public static boolean LIZJ(android.net.Uri uri) {
        if (!C37093Eh7.LIZJ(uri, "jump_to_search_detail", "1")) {
            return false;
        }
        Z9N z9n = Z9N.LIZIZ;
        if (!z9n.LJJIIJZLJL()) {
            return false;
        }
        String queryParameter = UriProtector.getQueryParameter(uri, "search_keyword");
        if (queryParameter == null) {
            queryParameter = "";
        }
        if (queryParameter.length() == 0) {
            return false;
        }
        if (a.LJIIIZ().LIZJ()) {
            z9n.LJJJZ(uri);
            return false;
        }
        HG3.LJIIL();
        if (!HG3.LJLJL.LJFF().isLogin()) {
            C85990Xow.LIZ.getClass();
            if (C85990Xow.LJIIIIZZ()) {
                z9n.LJJZZI(uri);
                return false;
            }
        }
        return true;
    }

    public static String LIZLLL(String str, android.net.Uri uri) {
        String str2;
        String str3;
        if (uri != null) {
            str2 = UriProtector.getQueryParameter(uri, "sec_uid");
        } else {
            str2 = null;
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            C40515FvD.LIZJ().LJIIIIZZ(str, str2);
        }
        C40515FvD LIZJ = C40515FvD.LIZJ();
        if (uri == null || (str3 = uri.toString()) == null) {
            str3 = "";
        }
        LIZJ.getClass();
        C40515FvD.LJFF(str3, str, str2);
        return str2;
    }

    public static void LIZIZ(android.net.Uri uri, Intent intent, boolean z) {
        o.LJIIIZ(uri, "uri");
        String queryParameter = UriProtector.getQueryParameter(uri, "tab");
        if (queryParameter == null) {
            queryParameter = "";
        }
        try {
            int parseInt = CastIntegerProtector.parseInt(queryParameter);
            intent.putExtra("tab", parseInt);
            if (parseInt != 1) {
                if (parseInt != 5) {
                    return;
                }
                M62.LIZIZ.LIZIZ(uri, "follow", z);
                return;
            }
            M62.LIZIZ.LIZIZ(uri, "discovery", z);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static Intent LJ(Activity activity, Intent intent, String str) {
        IExternalService LIZ = AVExternalServiceImpl.LIZ();
        if (LIZ.configService().shortVideoConfig().isRecording() || LIZ.publishService().inPublishPage(activity) || LIZ.publishService().isPublishing()) {
            return intent;
        }
        Intent LJIJI = C51029K0z.LJIJI(activity);
        LJIJI.putExtra("extra_from_deeplink", true);
        LJIJI.setFlags(335544320);
        LJIJI.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME");
        LJIJI.putExtra("tab", 1);
        LJIJI.putExtra("need_post", true);
        if (!C70412pZ.LIZ()) {
            LJIJI.putExtra("id", str);
        }
        LJIJI.putExtra("gids", str);
        return LJIJI;
    }

    public static Intent LIZ(Activity activity, android.net.Uri uri, Intent intent, boolean z, String str) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(uri, "uri");
        String queryParameter = UriProtector.getQueryParameter(uri, "share_comment_id");
        if (queryParameter == null) {
            queryParameter = "";
        }
        if (!z && !C55837Lvl.LJI(uri, str) && TextUtils.isEmpty(queryParameter)) {
            if (C37093Eh7.LIZJ(uri, "insert_feed", "1")) {
                return LJ(activity, intent, str);
            }
            if (C37093Eh7.LIZJ(uri, "video_detail", "1")) {
                return intent;
            }
            if (LIZJ(uri)) {
                return intent;
            }
            if (e1.LIZ(31744, "insert_reflow_video_by_default", true, false) || C37093Eh7.LIZJ(uri, "utm_campaign", "client_share")) {
                return LJ(activity, intent, str);
            }
        }
        return intent;
    }
}
