package com.twitter.sdk.android.core.identity;

import X.C65051Pfz;
import X.C65263PjP;
import X.C65265PjR;
import X.C65288Pjo;
import X.C65361Pkz;
import X.C65363Pl1;
import X.C65803Ps7;
import X.InterfaceC65360Pky;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ProgressBar;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.internal.oauth.OAuth1aService;
import com.zhiliaoapp.musically.R;

/* loaded from: classes12.dex */
public class OAuthActivity extends Activity implements InterfaceC65360Pky {
    public C65363Pl1 LJLIL;
    public ProgressBar LJLILLLLZI;
    public WebView LJLJI;

    @Override // android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
    }

    @Override // android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        this.LJLIL.LIZ(0, new C65288Pjo("Authorization failed, request was canceled."));
    }

    @Override // android.app.Activity
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

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean z;
        C65803Ps7.LIZ(this, bundle);
        super.onCreate(bundle);
        setContentView(R.layout.dqw);
        this.LJLILLLLZI = (ProgressBar) findViewById(R.id.mr6);
        this.LJLJI = (WebView) findViewById(R.id.mr7);
        int i = 0;
        if (bundle != null) {
            z = bundle.getBoolean("progress", false);
        } else {
            z = true;
        }
        ProgressBar progressBar = this.LJLILLLLZI;
        if (!z) {
            i = 8;
        }
        progressBar.setVisibility(i);
        C65263PjP LIZIZ = C65263PjP.LIZIZ();
        ProgressBar progressBar2 = this.LJLILLLLZI;
        WebView webView = this.LJLJI;
        TwitterAuthConfig twitterAuthConfig = (TwitterAuthConfig) getIntent().getParcelableExtra("auth_config");
        OAuth1aService oAuth1aService = new OAuth1aService(LIZIZ, new C65051Pfz());
        C65363Pl1 c65363Pl1 = new C65363Pl1(progressBar2, webView, twitterAuthConfig, oAuth1aService, this);
        this.LJLIL = c65363Pl1;
        C65265PjR.LIZIZ().getClass();
        oAuth1aService.LIZLLL(new C65361Pkz(c65363Pl1));
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        if (this.LJLILLLLZI.getVisibility() == 0) {
            bundle.putBoolean("progress", true);
        }
        super.onSaveInstanceState(bundle);
    }
}
