package X;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.aweme.ug.UgCommonServiceImpl;
import com.ss.android.ugc.tiktok.seclink.impl.SecLinkServiceImpl;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.M5e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56234M5e extends M61 {
    public boolean LIZIZ;

    public C56234M5e() {
        super(false);
    }

    @Override // X.M61
    public final void LIZIZ(M5X m5x) {
        M6P c56236M5g;
        String str;
        Object LLJJIII;
        String LLJJIJIIJIL;
        if (!C56235M5f.LJIIL) {
            C56235M5f.LIZJ("AppLinkNode");
        }
        Intent intent = m5x.LJLJI;
        android.net.Uri data = intent.getData();
        if (data == null) {
            C56235M5f.LIZLLL(2001, null, "uri_parse");
            return;
        }
        Uri.Builder buildUpon = UriProtector.parse(data.toString()).buildUpon();
        String uri = data.toString();
        o.LJIIIIZZ(uri, "originalUri.toString()");
        buildUpon.appendQueryParameter("convert_url", ((String[]) s.LJLJJL(uri, new String[]{"?"}, 0, 6).toArray(new String[0]))[0]);
        android.net.Uri build = buildUpon.build();
        o.LJIIIIZZ(build, "uriBuilder.build()");
        if (!TextUtils.equals("http", build.getScheme()) && !TextUtils.equals("https", build.getScheme()) && !C38586FCk.LIZJ(build)) {
            C56235M5f.LIZLLL(2002, build, "uri_parse");
            return;
        }
        Bundle LLJJIJI = C16880lQ.LLJJIJI(intent);
        if (LLJJIJI != null && (((LLJJIII = C16880lQ.LLJJIII(LLJJIJI, "android.intent.extra.REFERRER")) != null && (LLJJIJIIJIL = LLJJIII.toString()) != null) || (LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "android.intent.extra.REFERRER_NAME")) != null)) {
            C40372Fsu c40372Fsu = m5x.LJLJJLL;
            c40372Fsu.getClass();
            c40372Fsu.LJII = LLJJIJIIJIL;
        }
        C40372Fsu c40372Fsu2 = m5x.LJLJJLL;
        String uri2 = build.toString();
        o.LJIIIIZZ(uri2, "uri.toString()");
        c40372Fsu2.getClass();
        c40372Fsu2.LJIIIIZZ = uri2;
        C40372Fsu c40372Fsu3 = m5x.LJLJJLL;
        c40372Fsu3.getClass();
        c40372Fsu3.LIZJ = "applink";
        try {
            String host = build.getHost();
            String path = build.getPath();
            if (M5K.LJIIIIZZ(host, path) || C38586FCk.LIZJ(build) || M5K.LJIIJ(build)) {
                UgCommonServiceImpl.LJIJ().LJIILL().LIZIZ();
                c56236M5g = new C56236M5g(C16880lQ.LLLLJ(m5x.LJLIL), true);
                C56235M5f.LJIIJ = "short_to_long";
                Activity activity = m5x.LJLIL;
                o.LJIIIZ(activity, "activity");
                if (!C38586FCk.LIZIZ() && !C38985FRt.LIZIZ.LJIIJJI(activity)) {
                    C16880lQ.LIZIZ(activity, MainServiceImpl.createIMainServicebyMonsterPlugin(false).getMainActivityIntent(activity));
                    this.LIZIZ = true;
                }
                this.LIZ = true;
            } else if (M5K.LJII(host, path)) {
                c56236M5g = new M6N();
                if (C56235M5f.LJIILIIL) {
                    str = "personalize_link";
                } else if (o.LJ(C56235M5f.LJIIJ, "short_to_long")) {
                    str = "short_to_semantic";
                } else {
                    str = "semantic";
                }
                C56235M5f.LJIIJ = str;
            } else {
                c56236M5g = new OZ0();
            }
            if (o.LJ(m5x.LJLJJL.get("is_async_render_fact"), Boolean.TRUE)) {
                LJ(m5x);
            }
            android.net.Uri LIZ = c56236M5g.LIZ(build);
            if (LIZ != null || (!(c56236M5g instanceof OZ0) && (LIZ = new OZ0().LIZ(build)) != null)) {
                if (!this.LIZ) {
                    String uri3 = m5x.LJLILLLLZI.toString();
                    o.LJIIIIZZ(uri3, "deepLinkData.originalUri.toString()");
                    C56251M5v.LIZ = uri3;
                    m5x.LJLILLLLZI = LIZ;
                    C40372Fsu c40372Fsu4 = m5x.LJLJJLL;
                    c40372Fsu4.getClass();
                    c40372Fsu4.LIZ = "link_direct";
                    C40372Fsu c40372Fsu5 = m5x.LJLJJLL;
                    c40372Fsu5.getClass();
                    c40372Fsu5.LIZIZ = "google";
                    String targetPage = C38758FJa.LIZ(LIZ);
                    o.LJIIIZ(targetPage, "targetPage");
                    C56235M5f.LJI = targetPage;
                }
            } else if (!AV1.LJIIJJI()) {
                LIZLLL(m5x.LJLIL, build);
            }
            if ((this.LIZ && C38586FCk.LIZIZ()) || this.LIZIZ) {
                m5x.LJLIL.finish();
                C56235M5f.LJIIL = true;
            } else {
                C56235M5f.LJFF("AppLinkNode");
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public final void LJ(M5X m5x) {
        Activity activity = m5x.LJLIL;
        Intent mainActivityIntent = MainServiceImpl.createIMainServicebyMonsterPlugin(false).getMainActivityIntent(activity);
        String uri = m5x.LJLILLLLZI.toString();
        o.LJIIIIZZ(uri, "deepLinkData.originalUri.toString()");
        if (mainActivityIntent != null) {
            mainActivityIntent.setFlags(335544320);
            mainActivityIntent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME");
        }
        if (mainActivityIntent != null) {
            mainActivityIntent.putExtra("tab", 1);
            mainActivityIntent.putExtra("need_post", true);
            mainActivityIntent.putExtra("share_url", uri);
            mainActivityIntent.putExtra("share_link_mode", 1);
            mainActivityIntent.putExtra("from_notification", false);
            mainActivityIntent.putExtra("share_expose_sharer", true);
        }
        C16880lQ.LIZIZ(activity, mainActivityIntent);
        this.LIZIZ = true;
        C56235M5f.LJ(LiveNetAdaptiveHurryTimeSetting.DEFAULT, m5x.LJLILLLLZI, "Transfer");
    }

    public static void LIZLLL(Activity activity, android.net.Uri uri) {
        if (M66.LIZIZ.LJJIFFI(activity, "from_app_link", true)) {
            C56235M5f.LIZLLL(2005, uri, "login");
            return;
        }
        C56235M5f.LIZLLL(2003, uri, "uri_parse");
        String LJFF = SecLinkServiceImpl.LIZ().LJFF(uri.toString(), "deeplink");
        if (LJFF == null) {
            LJFF = uri.toString();
            o.LJIIIIZZ(LJFF, "uri.toString()");
        }
        Intent awemeWebIntent = MainServiceImpl.createIMainServicebyMonsterPlugin(false).getAwemeWebIntent(activity, uri.buildUpon().appendQueryParameter("url", LJFF).build(), Boolean.TRUE, Boolean.FALSE);
        if (awemeWebIntent != null) {
            C16880lQ.LIZIZ(activity, awemeWebIntent);
        }
    }
}
