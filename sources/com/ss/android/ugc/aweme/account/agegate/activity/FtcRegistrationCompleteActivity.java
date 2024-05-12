package com.ss.android.ugc.aweme.account.agegate.activity;

import X.ActivityC86117Xqz;
import X.C16880lQ;
import X.C221108m2;
import X.C26045AKb;
import X.C26227ARb;
import X.C35936E8m;
import X.C3AW;
import X.C58725N2z;
import X.C5S1;
import X.C62822Ol8;
import X.C65803Ps7;
import X.C77123UOp;
import X.C78857UxB;
import X.EOO;
import X.EnumC72807Shn;
import X.FMX;
import X.W5F;
import X.W5U;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class FtcRegistrationCompleteActivity extends ActivityC86117Xqz {
    public final Map<Integer, View> LJLJI = new LinkedHashMap();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 37));
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 36));

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.FtcRegistrationCompleteActivity", "onWindowFocusChanged", true);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.FtcRegistrationCompleteActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.ly);
        ImageView imageView = new ImageView(this);
        W5F LJIIIIZZ = W5U.LJIIIIZZ("https://p16-amd-va.tiktokcdn.com/obj/tiktok-obj/family_friendly.png");
        LJIIIIZZ.LJIJJ = EnumC72807Shn.FIT_CENTER;
        LJIIIIZZ.LJJIIJZLJL = imageView;
        C16880lQ.LLJJJ(LJIIIIZZ);
        if (((Boolean) this.LJLILLLLZI.getValue()).booleanValue()) {
            C5S1 c5s1 = new C5S1(C58725N2z.LIZ);
            c5s1.LIZJ(R.string.bvt);
            C26045AKb c26045AKb = c5s1.LIZIZ;
            if (c26045AKb != null) {
                c26045AKb.LIZLLL(5000L);
            }
            c5s1.LJ();
        }
        String string = getString(R.string.q01);
        o.LJIIIIZZ(string, "getString(R.string.relau…hscreen_modal_title_a_V2)");
        C26227ARb LIZ = C3AW.LIZ(this);
        C78857UxB.LJJI(LIZ, imageView, new AqS170S0100000_4(this, 1536));
        LIZ.LJFF(string);
        LIZ.LIZIZ(getString(R.string.pzz));
        C77123UOp.LJIILL(LIZ, new AqS170S0100000_4(this, 1537));
        LIZ.LJII = false;
        LIZ.LJI().LIZLLL();
        String str = (String) this.LJLIL.getValue();
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_method", str);
        c35936E8m.LIZ(EOO.LIZIZ(), "is_in_personalized_nuj");
        FMX.LJIIL("show_relaunch_app_popup", c35936E8m.LIZ);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.FtcRegistrationCompleteActivity", "onCreate", false);
    }
}
