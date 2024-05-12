package com.ss.n_project.opensdk_tt.ui;

import X.C16880lQ;
import X.C221108m2;
import X.C29S;
import X.C62634Oi6;
import X.C62801Okn;
import X.C62803Okp;
import X.C62804Okq;
import X.C62805Okr;
import X.C62806Oks;
import X.C62822Ol8;
import X.C65803Ps7;
import X.InterfaceC62809Okv;
import X.InterfaceC64712gN;
import X.ViewOnClickListenerC85790Xli;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class WebAuthActivity extends C29S {
    public static final /* synthetic */ int LJLJL = 0;
    public WebView LJLIL;
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(C62804Okq.LJLIL);
    public final String LJLJI = "https://www.tiktok.com/auth/authorize";
    public final String LJLJJI = "https://open-api.tiktok.com/oauth/authorize/callback/";
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(C62805Okr.LJLIL);
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 372));

    @Override // X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
    }

    @Override // X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    public final String LLFII() {
        return (String) this.LJLJJLL.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        if (r1 == false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LLII() {
        /*
            r8 = this;
            android.webkit.WebView r2 = r8.LJLIL
            r1 = 0
            if (r2 != 0) goto L19
        L5:
            X.Okv r2 = X.C62634Oi6.LIZIZ
            if (r2 != 0) goto La
        L9:
            return r1
        La:
            r3 = 0
            r4 = 20104(0x4e88, float:2.8172E-41)
            java.lang.String r5 = "user cancel in opensdk"
            java.lang.String r6 = r8.LLFII()
            r7 = 14
            X.C62806Oks.LIZ(r2, r3, r4, r5, r6, r7)
            goto L9
        L19:
            boolean r0 = r2.canGoBack()
            if (r0 == 0) goto L2a
            r2.goBack()
            r0 = 1
        L23:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            if (r0 != 0) goto L2c
            goto L5
        L2a:
            r0 = 0
            goto L23
        L2c:
            boolean r1 = r0.booleanValue()
            if (r1 != 0) goto L9
            goto L5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.n_project.opensdk_tt.ui.WebAuthActivity.LLII():boolean");
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (!LLII()) {
            super.onBackPressed();
        }
    }

    @Override // X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
    }

    @Override // X.C29S, X.ActivityC45651qj, android.app.Activity
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

    public static void LLIIIILZ(WebView webView) {
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setAllowFileAccess(true);
        webView.getSettings().setUseWideViewPort(true);
    }

    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        super.onCreate(bundle);
        if (C62634Oi6.LIZ == null) {
            InterfaceC62809Okv interfaceC62809Okv = C62634Oi6.LIZIZ;
            if (interfaceC62809Okv != null) {
                C62806Oks.LIZ(interfaceC62809Okv, null, 20102, "opensdk not init", LLFII(), 14);
            }
        } else {
            String lemon8IntroUrl = (String) this.LJLILLLLZI.getValue();
            o.LJIIIIZZ(lemon8IntroUrl, "lemon8IntroUrl");
            if (lemon8IntroUrl.length() == 0) {
                InterfaceC62809Okv interfaceC62809Okv2 = C62634Oi6.LIZIZ;
                if (interfaceC62809Okv2 != null) {
                    C62806Oks.LIZ(interfaceC62809Okv2, null, 20103, "opensdk introduction url invalid", LLFII(), 14);
                }
            } else {
                setContentView(R.layout.du5);
                WebView webView = new WebView(getBaseContext());
                LLIIIILZ(webView);
                WebSettings settings = webView.getSettings();
                String userAgentString = settings.getUserAgentString();
                if (userAgentString == null) {
                    userAgentString = "";
                }
                C16880lQ.LLZL(settings, userAgentString.concat(" Lemon8SyncAuthSDK/1.0.0 "));
                C16880lQ.LLZLI(webView, new C62801Okn(this));
                this.LJLIL = webView;
                ViewGroup viewGroup = (ViewGroup) findViewById(R.id.nhp);
                viewGroup.removeAllViews();
                viewGroup.addView(webView, new FrameLayout.LayoutParams(-1, -1));
                C16880lQ.LJIILLIIL((ImageView) findViewById(R.id.nho), new ViewOnClickListenerC85790Xli(3, this));
                WebView webView2 = this.LJLIL;
                if (webView2 != null) {
                    C16880lQ.LLZZ(webView2, (String) this.LJLILLLLZI.getValue());
                }
                InterfaceC64712gN interfaceC64712gN = (InterfaceC64712gN) this.LJLJJL.getValue();
                if (interfaceC64712gN == null) {
                    return;
                }
                interfaceC64712gN.onEvent("enter_lemon8_join_page", null);
                return;
            }
        }
        finish();
    }

    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        C62803Okp.LIZ(intent);
        finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLFZ(java.lang.String r15, java.lang.String r16) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.n_project.opensdk_tt.ui.WebAuthActivity.LLFZ(java.lang.String, java.lang.String):void");
    }
}
