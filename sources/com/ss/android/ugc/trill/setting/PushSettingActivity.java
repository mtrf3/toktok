package com.ss.android.ugc.trill.setting;

import X.AbstractActivityC79459VGl;
import X.C235119Kp;
import X.C252709vu;
import X.C25848ACm;
import X.C25849ACn;
import X.C25851ACp;
import X.C38337F2v;
import X.C65803Ps7;
import X.C76W;
import X.C78840Uwu;
import X.FMX;
import X.HG3;
import X.InterfaceC79460VGm;
import X.RBX;
import X.SYL;
import X.ViewOnClickListenerC85790Xli;
import Y.ACListenerS23S0101000_4;
import Y.ACListenerS32S0101000_15;
import Y.AObjectS15S0001000_14;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

@InterfaceC79460VGm(C38337F2v.class)
/* loaded from: classes15.dex */
public class PushSettingActivity extends AbstractActivityC79459VGl<C38337F2v> implements View.OnClickListener {
    public static final /* synthetic */ int LJLJL = 0;
    public C252709vu LJLILLLLZI;
    public C25851ACp LJLJI;
    public C25849ACn LJLJJI;
    public C25849ACn LJLJJL;
    public C25849ACn LJLJJLL;

    @Override // X.AbstractActivityC79459VGl, X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
    }

    @Override // X.AbstractActivityC79459VGl, X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.AbstractActivityC79459VGl, X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
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
        ActivityAgent.onTrace("com.ss.android.ugc.trill.setting.PushSettingActivity", "onWindowFocusChanged", true);
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

    public static C25848ACm LLFII(C25848ACm switchItem) {
        o.LJIIIZ(switchItem, "switchItem");
        return C25848ACm.LJIILJJIL(switchItem, !switchItem.LJZI, null, null, false, null, null, null, false, false, false, 65534);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        view.getId();
    }

    @Override // X.AbstractActivityC79459VGl, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean z;
        boolean z2;
        C65803Ps7.LIZ(this, bundle);
        boolean z3 = true;
        ActivityAgent.onTrace("com.ss.android.ugc.trill.setting.PushSettingActivity", "onCreate", true);
        int i = 2;
        activityConfiguration(new AObjectS15S0001000_14(2, 4));
        super.onCreate(bundle);
        setContentView(R.layout.f0);
        this.LJLILLLLZI = (C252709vu) findViewById(R.id.la4);
        this.LJLJI = new C25851ACp((SYL) findViewById(R.id.i04));
        C252709vu c252709vu = this.LJLILLLLZI;
        C235119Kp c235119Kp = new C235119Kp();
        C78840Uwu.LJJIL(c235119Kp, getString(R.string.plx), this);
        c252709vu.setNavActions(c235119Kp);
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        if (curUser.getShieldFollowNotice() != 1) {
            z = true;
        } else {
            z = false;
        }
        this.LJLJJI = new C25849ACn(new C25848ACm(z, getString(R.string.gjv), new ACListenerS23S0101000_4(1, this, 5)));
        if (curUser.getShieldDiggNotice() != 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LJLJJL = new C25849ACn(new C25848ACm(z2, getString(R.string.hs3), new ViewOnClickListenerC85790Xli(i, this)));
        if (curUser.getShieldCommentNotice() == 1) {
            z3 = false;
        }
        this.LJLJJLL = new C25849ACn(new C25848ACm(z3, getString(R.string.dkg), new ACListenerS32S0101000_15(2, this, 9)));
        this.LJLJI.LIZ(this.LJLJJI);
        this.LJLJI.LIZ(this.LJLJJL);
        this.LJLJI.LIZ(this.LJLJJLL);
        ActivityAgent.onTrace("com.ss.android.ugc.trill.setting.PushSettingActivity", "onCreate", false);
    }

    public final void LLFZ(String str, boolean z) {
        String str2;
        C76W c76w = new C76W();
        if (z) {
            str2 = "on";
        } else {
            str2 = "off";
        }
        c76w.LIZ("to_status", str2);
        MobClick obtain = MobClick.obtain();
        obtain.setEventName("notification_switch");
        obtain.setLabelName(str);
        obtain.setJsonObject(c76w.LIZIZ());
        FMX.onEvent(obtain);
    }
}
