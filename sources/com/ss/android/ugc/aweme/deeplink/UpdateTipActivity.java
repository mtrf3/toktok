package com.ss.android.ugc.aweme.deeplink;

import X.ActivityC86117Xqz;
import X.C110614Vt;
import X.C16880lQ;
import X.C2068389v;
import X.C32151Nz;
import X.C61328O5c;
import X.C65803Ps7;
import X.C78598Ut0;
import X.EF7;
import X.FMX;
import X.O6R;
import X.SY9;
import Y.IDCListenerS10S0101000;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class UpdateTipActivity extends ActivityC86117Xqz {
    public static final /* synthetic */ int LJLJI = 0;
    public String LJLIL = "";
    public UpdateTipsArgs LJLILLLLZI;

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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.deeplink.UpdateTipActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void LLFII() {
        Intent intent = new Intent(this, MainServiceImpl.createIMainServicebyMonsterPlugin(false).getMainActivityClass());
        intent.addFlags(131072);
        C78598Ut0.LJIJJ(intent, this);
        startActivity(intent);
        HashMap hashMap = new HashMap();
        hashMap.put("schema_url", this.LJLIL);
        hashMap.put("click_position", "back");
        FMX.LJIIL("schema_update_toast_click", hashMap);
        finish();
    }

    public final void LLFZ() {
        if (C16880lQ.LLJJIJI(getIntent()) != null) {
            String versionRequire = this.LJLILLLLZI.getVersionRequire();
            if (!TextUtils.isEmpty(versionRequire)) {
                ((TextView) findViewById(R.id.c4v)).setText(C16880lQ.LLLZ(getResources().getString(R.string.q7h), new Object[]{versionRequire}));
            }
        }
    }

    public final void LLII() {
        if (C16880lQ.LLJJIJI(getIntent()) == null) {
            return;
        }
        this.LJLIL = this.LJLILLLLZI.getUrlToGo();
        if (TextUtils.equals(EF7.LJIILIIL, "local_test") && !this.LJLIL.isEmpty()) {
            TextView textView = (TextView) findViewById(R.id.c4u);
            textView.setText(this.LJLIL);
            textView.setVisibility(0);
        }
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

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        LLFII();
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.deeplink.UpdateTipActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.fe);
        this.LJLILLLLZI = UpdateTipsArgs.getOrNew(this);
        View findViewById = findViewById(R.id.c4w);
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_chevron_left_offset_ltr;
        findViewById.setBackground(c2068389v.LIZ(this));
        View findViewById2 = findViewById(R.id.c4t);
        C16880lQ.LJIIJ(new IDCListenerS10S0101000(4, this, 7), findViewById);
        View findViewById3 = findViewById(R.id.h40);
        C2068389v c2068389v2 = new C2068389v();
        c2068389v2.LIZ = R.raw.icon_exclamation_mark;
        c2068389v2.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(48));
        c2068389v2.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(48));
        c2068389v2.LJ = Integer.valueOf(R.attr.gp);
        SY9 LIZ = c2068389v2.LIZ(this);
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.cv);
        c110614Vt.LIZJ = C61328O5c.LIZJ(50);
        c110614Vt.LJII = O6R.LJJIIZ(C32151Nz.LJIIZILJ(72));
        c110614Vt.LJI = O6R.LJJIIZ(C32151Nz.LJIIZILJ(72));
        findViewById3.setBackground(new LayerDrawable(new Drawable[]{LIZ, c110614Vt.LIZ(this)}));
        if (TextUtils.equals(EF7.LJIILIIL, "local_test")) {
            findViewById2.setVisibility(4);
        } else {
            C16880lQ.LJIIJ(new IDCListenerS10S0101000(2, this, 8), findViewById2);
        }
        LLFZ();
        LLII();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.deeplink.UpdateTipActivity", "onCreate", false);
    }

    @Override // X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        LLFZ();
        LLII();
    }
}
