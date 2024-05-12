package com.ss.android.ugc.aweme.shoutouts;

import X.C04270Et;
import X.C16880lQ;
import X.C43212Gxc;
import X.C44172HVg;
import X.C65803Ps7;
import X.C73305Spp;
import X.C73306Spq;
import X.GBO;
import X.GGS;
import X.KL2;
import X.Q8U;
import X.U1F;
import Y.ACListenerS22S0100000_2;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.internal.ShoutOutServiceImpl;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class ShoutOutsEditSuccessActivity extends GBO {
    public final Map<Integer, View> LJLJI = new LinkedHashMap();

    @Override // X.GBO, X.GB7, X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // X.GBO, X.GB7, X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.ShoutOutsEditSuccessActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.GBO
    public final C43212Gxc LLFII() {
        GGS.LIZ.getClass();
        return GGS.LIZJ;
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity
    public final void finish() {
        super.finish();
        U1F.LIZJ(this, 3);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
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

    @Override // X.GBO, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.ShoutOutsEditSuccessActivity", "onCreate", true);
        super.onCreate(bundle);
        boolean booleanExtra = getIntent().getBooleanExtra("shoutout_edit_price", false);
        boolean booleanExtra2 = getIntent().getBooleanExtra("shoutout_hide_button", false);
        ShoutOutServiceImpl.LIZJ().LIZIZ(System.currentTimeMillis(), "shoutouts_edit_post_success_time_" + C44172HVg.LJIJ.getCurrentUserID());
        String string = getString(R.string.hij);
        o.LJIIIIZZ(string, "getString(R.string.intro_submit_popup_title)");
        String string2 = getString(R.string.hii);
        o.LJIIIIZZ(string2, "getString(R.string.intro_submit_popup_desc)");
        String LIZIZ = Q8U.LIZIZ(new Object[]{AVExternalServiceImpl.LIZ().shoutOutsService().getShoutOutSettingsModel().LIZ()}, 1, string2, "format(format, *args)");
        if (booleanExtra) {
            string = getString(R.string.rcg);
            o.LJIIIIZZ(string, "getString(R.string.shoutouts_updated_title)");
            LIZIZ = "";
        }
        setContentView(R.layout.e5);
        U1F.LJFF(this, 3);
        C73306Spq c73306Spq = new C73306Spq();
        Drawable LIZIZ2 = C04270Et.LIZIZ(this, R.drawable.c5j);
        c73306Spq.LIZJ = 0;
        c73306Spq.LIZ = LIZIZ2;
        c73306Spq.LJFF = string;
        c73306Spq.LJI = LIZIZ;
        int LIZJ = (int) KL2.LIZJ(this, 72.0f);
        int LIZJ2 = (int) KL2.LIZJ(this, 72.0f);
        c73306Spq.LIZLLL = LIZJ;
        c73306Spq.LJ = LIZJ2;
        if (!booleanExtra2) {
            c73306Spq.LJII = new AqS168S0100000_2(this, 218);
        }
        ((C73305Spp) findViewById(R.id.kf_)).setStatus(c73306Spq);
        C16880lQ.LJIIJ(new ACListenerS22S0100000_2(this, 49), findViewById(R.id.bf7));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shoutouts.ShoutOutsEditSuccessActivity", "onCreate", false);
    }
}
