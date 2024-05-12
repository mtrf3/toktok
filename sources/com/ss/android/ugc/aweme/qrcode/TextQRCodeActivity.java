package com.ss.android.ugc.aweme.qrcode;

import X.ActivityC86117Xqz;
import X.C16880lQ;
import X.C65803Ps7;
import Y.ACListenerS24S0100000_4;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.zhiliaoapp.musically.R;

/* loaded from: classes5.dex */
public class TextQRCodeActivity extends ActivityC86117Xqz {
    public static final /* synthetic */ int LJLJL = 0;
    public View LJLIL;
    public TextView LJLILLLLZI;
    public String LJLJI = "";
    public View LJLJJI;
    public View LJLJJL;
    public TextView LJLJJLL;

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.qrcode.TextQRCodeActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
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

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.qrcode.TextQRCodeActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.fc);
        this.LJLJJL = findViewById(R.id.eys);
        this.LJLIL = findViewById(R.id.mi6);
        this.LJLJJI = findViewById(R.id.m2x);
        this.LJLILLLLZI = (TextView) findViewById(R.id.m2v);
        this.LJLIL.setVisibility(8);
        this.LJLJJLL = (TextView) findViewById(R.id.mcg);
        Intent intent = getIntent();
        if (intent != null) {
            this.LJLJI = C16880lQ.LLJJIJIIJIL(intent, "intent_extra_content");
        }
        this.LJLILLLLZI.setText(this.LJLJI);
        String str = this.LJLJI;
        if (str != null && ((!TextUtils.isEmpty(str) && str.startsWith("aweme://webview/")) || this.LJLJI.contains("snssdk1128"))) {
            this.LJLJJLL.setText(getResources().getText(R.string.q_v));
        }
        C16880lQ.LJIIJ(new ACListenerS24S0100000_4(this, 159), this.LJLJJI);
        C16880lQ.LJIIJ(new ACListenerS24S0100000_4(this, 160), this.LJLJJL);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.qrcode.TextQRCodeActivity", "onCreate", false);
    }
}
