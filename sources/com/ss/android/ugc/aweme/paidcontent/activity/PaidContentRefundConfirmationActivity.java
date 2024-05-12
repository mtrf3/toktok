package com.ss.android.ugc.aweme.paidcontent.activity;

import X.ActivityC86117Xqz;
import X.C16880lQ;
import X.C221108m2;
import X.C252709vu;
import X.C62822Ol8;
import X.C65803Ps7;
import X.C9KF;
import X.GDY;
import X.SY4;
import Y.ACListenerS23S0100000_3;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PaidContentRefundConfirmationActivity extends ActivityC86117Xqz {
    public final Map<Integer, View> LJLJI = new LinkedHashMap();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 675));
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 674));

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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.paidcontent.activity.PaidContentRefundConfirmationActivity", "onWindowFocusChanged", true);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.paidcontent.activity.PaidContentRefundConfirmationActivity", "onCreate", true);
        activityConfiguration(GDY.LJLIL);
        super.onCreate(bundle);
        setContentView(R.layout.aiz);
        C252709vu c252709vu = (C252709vu) findViewById(R.id.hfu);
        C9KF c9kf = new C9KF();
        String string = getResources().getString(R.string.qod);
        o.LJIIIIZZ(string, "resources.getString(R.st…efund_confirmation_title)");
        c9kf.LIZJ = string;
        c252709vu.LJIILLIIL(c9kf);
        ((TextView) findViewById(R.id.itr)).setText((String) this.LJLIL.getValue());
        ((TextView) findViewById(R.id.its)).setText((String) this.LJLILLLLZI.getValue());
        C16880lQ.LJJIZ((SY4) findViewById(R.id.hft), new ACListenerS23S0100000_3(this, 115));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.paidcontent.activity.PaidContentRefundConfirmationActivity", "onCreate", false);
    }
}
