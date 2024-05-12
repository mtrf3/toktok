package com.ss.android.ugc.aweme.account.login.twostep;

import X.AbstractC73672Svk;
import X.ActivityC86117Xqz;
import X.C16880lQ;
import X.C221108m2;
import X.C35936E8m;
import X.C62822Ol8;
import X.C65803Ps7;
import X.C73411SrX;
import X.C73666Sve;
import X.C73969T1h;
import X.C74088T5w;
import X.C85778XlW;
import X.FMX;
import X.KL2;
import X.RCD;
import X.RCE;
import X.ViewOnClickListenerC13880ga;
import Y.ACListenerS35S0100000_15;
import Y.ARunnableS51S0100000_15;
import Y.AfS67S0100000_15;
import Y.IDaS224S0100000_15;
import Y.IDhS108S0100000_15;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class TwoStepVerifyPushFor2067Activity extends ActivityC86117Xqz {
    public final C62822Ol8 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public C73411SrX LJLJJL;
    public C73666Sve LJLJJLL;
    public C73666Sve LJLJL;
    public C73411SrX LJLJLJ;
    public String LJLJLLL;
    public String LJLL;
    public String LJLLI;
    public String LJLLILLLL;
    public final long LJLLJ;
    public final long LJLLL;
    public ArrayList<String> LJLLLL;
    public final Handler LJLLLLLL;
    public boolean LJLZ;
    public final ARunnableS51S0100000_15 LJZ;
    public final Map<Integer, View> LJZI = new LinkedHashMap();

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJZI).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJZI;
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerifyPushFor2067Activity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public TwoStepVerifyPushFor2067Activity() {
        C221108m2.LIZIZ(new AqS165S0100000_15(this, 164));
        this.LJLIL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 165));
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS165S0100000_15(this, 166));
        this.LJLJI = C221108m2.LIZIZ(new AqS165S0100000_15(this, 168));
        this.LJLJJI = C221108m2.LIZIZ(new AqS165S0100000_15(this, 167));
        this.LJLLJ = 60L;
        this.LJLLL = 120000L;
        this.LJLLLL = new ArrayList<>();
        this.LJLLLLLL = new Handler(C16880lQ.LLJJJJ());
        this.LJZ = new ARunnableS51S0100000_15(this, 22);
    }

    public final void LLFII() {
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_method", getEnterMethod());
        c35936E8m.LIZLLL("enter_from", getEnterMethod());
        c35936E8m.LIZLLL("enter_type", (String) this.LJLILLLLZI.getValue());
        c35936E8m.LIZLLL("platform", (String) this.LJLJI.getValue());
        FMX.LJIIL("cancel_push_challenge_login_request", c35936E8m.LIZ);
    }

    public final String getEnterMethod() {
        return (String) this.LJLIL.getValue();
    }

    public final void LLFZ() {
        C16880lQ.LJJJJI((TuxTextView) _$_findCachedViewById(R.id.m1c), new ACListenerS35S0100000_15(this, 45));
        _$_findCachedViewById(R.id.ayj).setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS35S0100000_15(this, 46)));
    }

    public final void LLII() {
        C74088T5w c74088T5w = (C74088T5w) _$_findCachedViewById(R.id.ayj);
        String string = getString(R.string.pm3, String.valueOf(this.LJLLJ));
        o.LJIIIIZZ(string, "getString(R.string.pushc…tn, countDown.toString())");
        c74088T5w.setText(string);
        ((C74088T5w) _$_findCachedViewById(R.id.ayj)).setEnabled(false);
        C73411SrX c73411SrX = this.LJLJJL;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        this.LJLJJL = (C73411SrX) AbstractC73672Svk.LJJIIZI(0L, 1L, TimeUnit.SECONDS).LJJLIIIJ(this.LJLLJ).LJJIJL(new IDhS108S0100000_15(this, 1)).LJJJ(C73969T1h.LIZIZ()).LJJJLL(new AfS67S0100000_15(this, 21), C85778XlW.LJLIL, new IDaS224S0100000_15(this, 4));
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity
    public final void finish() {
        super.finish();
        if (!this.LJLZ) {
            RCE.LIZ().LIZIZ(new RCD(null, this.LJLL, 0, "User left TwoStepAuthActivity before completing auth process", this.LJLJLLL));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        View decorView = getWindow().getDecorView();
        o.LJIIIIZZ(decorView, "window.decorView");
        setFinishOnTouchOutside(false);
        ViewGroup.LayoutParams layoutParams = decorView.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
        WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) layoutParams;
        layoutParams2.gravity = 80;
        layoutParams2.width = KL2.LJIIJJI(this);
        layoutParams2.height = -2;
        getWindowManager().updateViewLayout(decorView, layoutParams2);
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        LLFII();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
        C73411SrX c73411SrX = this.LJLJJL;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        C73666Sve c73666Sve = this.LJLJJLL;
        if (c73666Sve != null) {
            c73666Sve.dispose();
        }
        C73666Sve c73666Sve2 = this.LJLJL;
        if (c73666Sve2 != null) {
            c73666Sve2.dispose();
        }
        C73411SrX c73411SrX2 = this.LJLJLJ;
        if (c73411SrX2 != null) {
            c73411SrX2.dispose();
        }
        this.LJLLLLLL.removeCallbacks(this.LJZ);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerifyPushFor2067Activity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.oa);
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("device_list");
        if (stringArrayListExtra == null) {
            stringArrayListExtra = new ArrayList<>();
        }
        this.LJLLLL = stringArrayListExtra;
        this.LJLLI = C16880lQ.LLJJIJIIJIL(getIntent(), "wait_ticket");
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "sms_code_key");
        if (LLJJIJIIJIL == null) {
            LLJJIJIIJIL = "";
        }
        this.LJLJLLL = LLJJIJIIJIL;
        String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(getIntent(), "profile_key");
        if (LLJJIJIIJIL2 == null) {
            LLJJIJIIJIL2 = "";
        }
        this.LJLL = LLJJIJIIJIL2;
        if (this.LJLLLL.size() == 1) {
            ((TextView) _$_findCachedViewById(R.id.m2v)).setText(getString(R.string.pm0, ListProtector.get(this.LJLLLL, 0)));
        } else if (this.LJLLLL.size() >= 2) {
            ((TextView) _$_findCachedViewById(R.id.m2v)).setText(getResources().getQuantityString(R.plurals.r2, this.LJLLLL.size() - 1, ListProtector.get(this.LJLLLL, 0), String.valueOf(this.LJLLLL.size() - 1)));
        } else {
            ((TextView) _$_findCachedViewById(R.id.m2v)).setText(getString(R.string.pm0, ""));
        }
        ((TextView) _$_findCachedViewById(R.id.m1c)).setText(getString(R.string.cgb));
        ((C74088T5w) _$_findCachedViewById(R.id.ayj)).setEnabled(false);
        C74088T5w c74088T5w = (C74088T5w) _$_findCachedViewById(R.id.ayj);
        String string = getString(R.string.pm3, String.valueOf(this.LJLLJ));
        o.LJIIIIZZ(string, "getString(R.string.pushc…tn, countDown.toString())");
        c74088T5w.setText(string);
        LLFZ();
        this.LJLJLJ = (C73411SrX) AbstractC73672Svk.LJJIIZI(0L, 3L, TimeUnit.SECONDS).LJJJJZI(new AfS67S0100000_15(this, 86));
        LLFZ();
        LLII();
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_method", getEnterMethod());
        c35936E8m.LIZLLL("enter_from", getEnterMethod());
        c35936E8m.LIZLLL("enter_type", (String) this.LJLILLLLZI.getValue());
        c35936E8m.LIZLLL("platform", (String) this.LJLJI.getValue());
        FMX.LJIIL("show_interrupted_login_panel", c35936E8m.LIZ);
        this.LJLLLLLL.postDelayed(this.LJZ, this.LJLLL);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerifyPushFor2067Activity", "onCreate", false);
    }

    public final void onError(String str) {
        RCE.LIZ().LIZIZ(new RCD(null, this.LJLL, 0, str, this.LJLJLLL));
        this.LJLZ = true;
        finish();
    }
}
