package com.ss.android.ugc.aweme.deeplink;

import X.AV1;
import X.C16880lQ;
import X.C38891fp;
import X.C40372Fsu;
import X.C56235M5f;
import X.C56236M5g;
import X.C56251M5v;
import X.C65803Ps7;
import X.C78598Ut0;
import X.M5K;
import X.M66;
import X.M6N;
import X.M6P;
import X.OZ0;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.tiktok.seclink.impl.SecLinkServiceImpl;
import java.util.Set;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class AppLinkHandler extends DeepLinkHandlerActivity {
    @Override // com.ss.android.ugc.aweme.deeplink.DeepLinkHandlerActivity, X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
    }

    @Override // com.ss.android.ugc.aweme.deeplink.DeepLinkHandlerActivity, X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // com.ss.android.ugc.aweme.deeplink.DeepLinkHandlerActivity, X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
    }

    @Override // com.ss.android.ugc.aweme.deeplink.DeepLinkHandlerActivity, X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // com.ss.android.ugc.aweme.deeplink.DeepLinkHandlerActivity, X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.deeplink.AppLinkHandler", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.DeepLinkHandlerActivity, X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStop() {
        C65803Ps7.LJFF(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable unused2) {
        }
    }

    public final void LLIIJI(Uri uri) {
        if (M66.LIZIZ.LJJIFFI(this, "from_app_link", false)) {
            C56235M5f.LIZLLL(2005, uri, "login");
            return;
        }
        C56235M5f.LIZLLL(2003, uri, "uri_parse");
        String LJFF = SecLinkServiceImpl.LIZ().LJFF(uri.toString(), "deeplink");
        if (LJFF.isEmpty()) {
            LJFF = uri.toString();
        }
        Intent handleAmeWebViewBrowserForDeeplink = MainServiceImpl.createIMainServicebyMonsterPlugin(false).handleAmeWebViewBrowserForDeeplink(this, uri.buildUpon().appendQueryParameter("url", LJFF).build(), Boolean.TRUE, Boolean.FALSE);
        if (handleAmeWebViewBrowserForDeeplink != null) {
            if (!this.LJLJI) {
                handleAmeWebViewBrowserForDeeplink.addFlags(268435456);
            }
            C78598Ut0.LJIJJ(handleAmeWebViewBrowserForDeeplink, this);
            startActivity(handleAmeWebViewBrowserForDeeplink);
        }
        getIntent().setData(null);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.DeepLinkHandlerActivity, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        M6P c56236M5g;
        Set<String> queryParameterNames;
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.deeplink.AppLinkHandler", "onCreate", true);
        Intent intent = getIntent();
        Uri data = intent.getData();
        String uri = data.toString();
        o.LJIIIZ(uri, "<set-?>");
        C56251M5v.LIZ = uri;
        C56251M5v.LIZLLL = intent;
        C56235M5f.LJFF = "applink";
        C56235M5f.LJIIIZ = "old";
        C56235M5f.LJI(intent);
        if (!TextUtils.equals("http", data.getScheme()) && !TextUtils.equals("https", data.getScheme())) {
            C56235M5f.LIZLLL(2002, data, "uri_parse");
        } else {
            if (C16880lQ.LLJJIJI(intent) != null) {
                Object LLJJIII = C16880lQ.LLJJIII(C16880lQ.LLJJIJI(intent), "android.intent.extra.REFERRER");
                if (LLJJIII != null) {
                    str = LLJJIII.toString();
                } else {
                    str = C16880lQ.LLJJIJIIJIL(intent, "android.intent.extra.REFERRER_NAME");
                }
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                C40372Fsu c40372Fsu = this.LJLIL;
                c40372Fsu.getClass();
                o.LJIIIZ(str, "<set-?>");
                c40372Fsu.LJII = str;
            }
            C40372Fsu c40372Fsu2 = this.LJLIL;
            String uri2 = data.toString();
            c40372Fsu2.getClass();
            o.LJIIIZ(uri2, "<set-?>");
            c40372Fsu2.LJIIIIZZ = uri2;
            C40372Fsu c40372Fsu3 = this.LJLIL;
            c40372Fsu3.getClass();
            c40372Fsu3.LIZJ = "applink";
            try {
                String host = data.getHost();
                String path = data.getPath();
                if (M5K.LJIIIIZZ(host, path) || (((queryParameterNames = UriProtector.getQueryParameterNames(data)) != null && queryParameterNames.contains("_t") && (!TextUtils.isEmpty(UriProtector.getQueryParameter(data, "_t")))) || M5K.LJIIJ(data))) {
                    Context applicationContext = getApplicationContext();
                    if (C38891fp.LJLJI && applicationContext == null) {
                        applicationContext = C38891fp.LJLILLLLZI;
                    }
                    c56236M5g = new C56236M5g(applicationContext, false);
                    C56235M5f.LJIIJ = "short_to_long";
                    this.LJLLLLLL = true;
                } else if (M5K.LJII(host, path)) {
                    c56236M5g = new M6N();
                    String str2 = C56235M5f.LJIIJ;
                    if (C56235M5f.LJIILIIL) {
                        C56235M5f.LJIIJ = "personalize_link";
                    } else if (TextUtils.equals(str2, "short_to_long")) {
                        C56235M5f.LJIIJ = "short_to_semantic";
                    } else {
                        C56235M5f.LJIIJ = "semantic";
                    }
                } else {
                    c56236M5g = new OZ0();
                }
                Uri LIZ = c56236M5g.LIZ(data);
                if (LIZ == null && ((c56236M5g instanceof OZ0) || (LIZ = new OZ0().LIZ(data)) == null)) {
                    if (!AV1.LJIIJJI()) {
                        LLIIJI(data);
                    }
                }
                intent.setData(LIZ);
                C40372Fsu c40372Fsu4 = this.LJLIL;
                c40372Fsu4.getClass();
                c40372Fsu4.LIZ = "link_direct";
                C40372Fsu c40372Fsu5 = this.LJLIL;
                c40372Fsu5.getClass();
                c40372Fsu5.LIZIZ = "google";
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        super.onCreate(bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.deeplink.AppLinkHandler", "onCreate", false);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.DeepLinkHandlerActivity
    public final Intent LLFZ(Uri uri, boolean z) {
        if (uri != null && TextUtils.equals("shortlink", uri.getHost())) {
            if (DeepLinkHandlerActivity.LLII()) {
                return null;
            }
            return MainServiceImpl.createIMainServicebyMonsterPlugin(false).getMainActivityIntent(this);
        }
        return super.LLFZ(uri, z);
    }
}
