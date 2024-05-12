package com.ss.android.ugc.aweme.account.login.rememberaccount;

import X.C01R;
import X.C06F;
import X.C16880lQ;
import X.C36089EEj;
import X.C36093EEn;
import X.C43212Gxc;
import X.C61410O8g;
import X.C63026OoQ;
import X.C63081OpJ;
import X.C65803Ps7;
import X.C68989R5t;
import X.C69101RAb;
import X.C76732zl;
import X.C79045V0n;
import X.C81225VuH;
import X.C85580XiK;
import X.DUE;
import X.FCD;
import X.GGS;
import X.InterfaceC69103RAd;
import X.R5Q;
import Y.ACListenerS31S0100000_11;
import Y.ACListenerS35S0100000_15;
import Y.ACListenerS48S0200000_14;
import Y.ARunnableS25S0300000_14;
import Y.ARunnableS50S0100000_14;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.account.login.ViewPagerBottomSheetBehavior;
import com.ss.android.ugc.aweme.account.login.passkey.PasskeyService;
import com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity;
import com.ss.android.ugc.aweme.app.services.NewUserMainModuleService;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class LoginMethodListActivity extends CommonFlowActivity implements InterfaceC69103RAd {
    public static final /* synthetic */ int LJLLLL = 0;
    public boolean LJLLILLLL;
    public OneClickLoginViewModel LJLLJ;
    public final Map<Integer, View> LJLLL = new LinkedHashMap();

    @Override // X.AbstractActivityC69131RBf
    public final void LLIIIJ() {
        supportRequestWindowFeature(1);
        Window window = getWindow();
        window.setGravity(80);
        window.setLayout(-1, -1);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity
    public final int LLIILII() {
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity, X.AbstractActivityC69131RBf, X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLL).clear();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity, X.AbstractActivityC69131RBf, X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLL;
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

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity, X.ActivityC86117Xqz, android.app.Activity
    public final void finish() {
        overridePendingTransition(0, R.anim.a6);
        super.finish();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity, X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity, X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity, X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity, X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.rememberaccount.LoginMethodListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity
    public final C43212Gxc LLIL() {
        GGS.LIZ.getClass();
        return GGS.LJFF;
    }

    @Override // X.AbstractActivityC69131RBf, X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        OneClickLoginViewModel oneClickLoginViewModel = this.LJLLJ;
        String str = null;
        if (oneClickLoginViewModel != null) {
            if (oneClickLoginViewModel.gv0()) {
                return;
            }
            String LJJLIIIJJI = LJJLIIIJJI();
            String LJJLIIIJLLLLLLLZ = LJJLIIIJLLLLLLLZ();
            Intent intent = getIntent();
            if (intent != null) {
                str = C16880lQ.LLJJIJIIJIL(intent, "login_panel_type");
            }
            R5Q.LIZJ(LJJLIIIJJI, LJJLIIIJLLLLLLLZ, str, "go_back");
            getWindow().setDimAmount(0.0f);
            ViewPagerBottomSheetBehavior LIZ = ViewPagerBottomSheetBehavior.LIZ(_$_findCachedViewById(R.id.j71));
            if (LIZ != null) {
                LIZ.setState(5);
                return;
            } else {
                super.onBackPressed();
                return;
            }
        }
        o.LJIJI("oneClickLoginViewModel");
        throw null;
    }

    @Override // X.AbstractActivityC69131RBf
    public final void LLIIIILZ() {
        setContentView(R.layout.lz);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity, X.AbstractActivityC69131RBf, X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        ((CopyOnWriteArrayList) C69101RAb.LIZJ).remove(this);
        super.onDestroy();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity, X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
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

    @Override // X.InterfaceC69103RAd
    public final void LJIIL(int i) {
        if (i == 11) {
            LLIIJLIL(i, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity, X.AbstractActivityC69131RBf
    public final void LLII(Bundle bundle) {
        if (DUE.LJFF(true) && !this.LJLLILLLL) {
            C36093EEn.LIZ.getClass();
            C36089EEj LJIIIZ = C36093EEn.LJIIIZ();
            LJIIIZ.LIZ(NewUserMainModuleService.LJIIJ().LIZLLL(1, 3));
            LJIIIZ.LIZJ();
            this.LJLLILLLL = true;
        }
        super.LLII(bundle);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity, X.AbstractActivityC69131RBf, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.rememberaccount.LoginMethodListActivity", "onCreate", true);
        super.onCreate(bundle);
        Intent intent = getIntent();
        o.LJIIIZ(intent, "intent");
        OneClickLoginViewModel oneClickLoginViewModel = (OneClickLoginViewModel) new ViewModelProvider(this).get(OneClickLoginViewModel.class);
        oneClickLoginViewModel.LJLIL = new WeakReference<>(this);
        oneClickLoginViewModel.LJLILLLLZI = intent;
        this.LJLLJ = oneClickLoginViewModel;
        ((CopyOnWriteArrayList) C69101RAb.LIZJ).add(this);
        OneClickLoginViewModel oneClickLoginViewModel2 = this.LJLLJ;
        if (oneClickLoginViewModel2 != null) {
            if (oneClickLoginViewModel2.gv0()) {
                C06F c06f = new C06F(-1, -1);
                c06f.setMargins(0, 0, 0, 0);
                _$_findCachedViewById(R.id.j71).setLayoutParams(c06f);
                ViewGroup.LayoutParams layoutParams = _$_findCachedViewById(R.id.bv8).getLayoutParams();
                o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                ((FrameLayout.LayoutParams) layoutParams).topMargin = 0;
                ViewGroup.LayoutParams layoutParams2 = _$_findCachedViewById(R.id.j71).getLayoutParams();
                o.LJII(layoutParams2, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
                ((C06F) layoutParams2).LIZIZ(null);
                _$_findCachedViewById(R.id.j71).setBackground(C79045V0n.LJIIIIZZ(R.attr.cl, this));
                ((ImageView) _$_findCachedViewById(R.id.bf7)).setVisibility(8);
            } else {
                C76732zl c76732zl = new C76732zl();
                Rect rect = new Rect();
                getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                c76732zl.element = rect.height() - C63081OpJ.LJJJJLI(this);
                if (FCD.LJII() && C61410O8g.LJFF(this)) {
                    c76732zl.element = C61410O8g.LIZIZ(this) + c76732zl.element;
                }
                ViewPagerBottomSheetBehavior LIZ = ViewPagerBottomSheetBehavior.LIZ(_$_findCachedViewById(R.id.j71));
                LIZ.setPeekHeight(c76732zl.element);
                LIZ.LJII = true;
                LIZ.LJIILLIIL = new C85580XiK(this);
                LIZ.LJIJJLI = new C81225VuH(LIZ, this);
                _$_findCachedViewById(R.id.j71).post(new ARunnableS25S0300000_14(LIZ, this, c76732zl, 24));
                C16880lQ.LJIILJJIL((FrameLayout) _$_findCachedViewById(R.id.dn3), new ACListenerS48S0200000_14(LIZ, this, 12));
                _$_findCachedViewById(R.id.j71).post(new ARunnableS50S0100000_14(LIZ, 225));
            }
            C16880lQ.LJJJ((TuxIconView) _$_findCachedViewById(R.id.e50), new ACListenerS31S0100000_11(this, 4));
            C16880lQ.LJJJ((TuxIconView) _$_findCachedViewById(R.id.bf7), new ACListenerS35S0100000_15(this, 27));
            if (PasskeyService.LJFF().LIZJ()) {
                C68989R5t.LIZJ(this, "passkey", new C63026OoQ(LJJLIIIJJI(), LJJLIIIJLLLLLLLZ(), "click_login", "passkey_login", "", C01R.LIZ("isFromOCL", true)));
            }
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.rememberaccount.LoginMethodListActivity", "onCreate", false);
            return;
        }
        o.LJIJI("oneClickLoginViewModel");
        throw null;
    }
}
