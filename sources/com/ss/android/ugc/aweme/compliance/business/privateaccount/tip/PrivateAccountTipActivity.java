package com.ss.android.ugc.aweme.compliance.business.privateaccount.tip;

import X.ActivityC86117Xqz;
import X.C116484hg;
import X.C16880lQ;
import X.C188727au;
import X.C26045AKb;
import X.C279017q;
import X.C40434Ftu;
import X.C62905OmT;
import X.C63048Oom;
import X.C63049Oon;
import X.C65803Ps7;
import X.C6ZT;
import X.C9WG;
import X.DialogInterfaceOnShowListenerC63050Ooo;
import X.FMX;
import X.InterfaceC18010nF;
import X.InterfaceC26189APp;
import X.Z8A;
import Y.IDCListenerS162S0100000_10;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes11.dex */
public final class PrivateAccountTipActivity extends ActivityC86117Xqz implements View.OnClickListener, InterfaceC26189APp, InterfaceC18010nF {
    public boolean LJLIL;
    public C9WG LJLILLLLZI;
    public boolean LJLJI;
    public long LJLJJI;
    public TextView LJLJJL;
    public TextView LJLJJLL;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();

    @Override // X.InterfaceC26189APp
    public final void FI(boolean z) {
    }

    @Override // X.InterfaceC26189APp
    public final void Pp0(User data, int i) {
        o.LJIIIZ(data, "data");
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJL).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJL;
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

    @Override // X.InterfaceC18010nF
    public String getBtmPageCode() {
        return "b3953";
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.privateaccount.tip.PrivateAccountTipActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC26189APp
    public final void vb0(String toast, boolean z) {
        o.LJIIIZ(toast, "toast");
    }

    @Override // X.InterfaceC18010nF
    public final Map<String, String> x3() {
        return null;
    }

    @Override // X.InterfaceC18010nF
    public final String LLZIL() {
        return String.valueOf(hashCode());
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        PopupManager.LIZJ(C40434Ftu.class);
        super.onDestroy();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.privateaccount.tip.PrivateAccountTipActivity", "onResume", true);
        super.onResume();
        this.LJLJJI = System.currentTimeMillis();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.privateaccount.tip.PrivateAccountTipActivity", "onResume", false);
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

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        o.LJIIIZ(view, "view");
        if (C6ZT.LIZ(view)) {
            return;
        }
        int id = view.getId();
        if (id == R.id.awh) {
            a.LJIILJJIL().LIZLLL();
            SettingServiceImpl.LIZ().providePushSettingChangePresenter().LJIILL("notify_private_account", 1);
            finish();
            C63048Oom.LIZ(System.currentTimeMillis() - this.LJLJJI, "tns_privacy_notify_skip");
            C63049Oon.LIZ(System.currentTimeMillis() - this.LJLJJI, "skip");
            return;
        }
        if (id != R.id.awg) {
            return;
        }
        if (!this.LJLJI) {
            if (!isDestroyed()) {
                C62905OmT c62905OmT = new C62905OmT(this);
                c62905OmT.LIZ(R.string.g3f);
                c62905OmT.LJIIIIZZ(R.string.cg_, new IDCListenerS162S0100000_10(this, 2), false);
                c62905OmT.LJIIJJI(R.string.gs4, new IDCListenerS162S0100000_10(this, 3), false);
                c62905OmT.LJFF = DialogInterfaceOnShowListenerC63050Ooo.LJLIL;
                C279017q.LIZLLL(c62905OmT);
            }
            C63048Oom.LIZ(System.currentTimeMillis() - this.LJLJJI, "tns_privacy_notify_enable");
            C63049Oon.LIZ(System.currentTimeMillis() - this.LJLJJI, "go_private");
            return;
        }
        SettingServiceImpl.LIZ().providePushSettingChangePresenter().LJIILL("notify_private_account", 1);
        C63048Oom.LIZIZ("privacy_account_setting_confirm", this.LJLIL);
        finish();
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.privateaccount.tip.PrivateAccountTipActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.afv);
        this.LJLJJL = (TextView) findViewById(R.id.awh);
        this.LJLJJLL = (TextView) findViewById(R.id.awg);
        TextView textView = this.LJLJJL;
        if (textView != null) {
            textView.setText(getString(R.string.re9));
        }
        TextView textView2 = this.LJLJJLL;
        if (textView2 != null) {
            textView2.setText(getString(R.string.par));
        }
        TextView textView3 = (TextView) findViewById(R.id.title);
        TextView textView4 = (TextView) findViewById(R.id.bst);
        View findViewById = findViewById(R.id.b96);
        boolean LIZJ = a.LJIILJJIL().LIZJ();
        this.LJLJI = LIZJ;
        if (LIZJ) {
            TextView textView5 = this.LJLJJL;
            o.LJI(textView5);
            textView5.setVisibility(8);
            textView3.setText(R.string.b4o);
            TextView textView6 = this.LJLJJLL;
            o.LJI(textView6);
            textView6.setText(R.string.gsg);
            textView4.setText(R.string.g3h);
            findViewById.setVisibility(8);
        }
        TextView textView7 = this.LJLJJL;
        o.LJI(textView7);
        C16880lQ.LJIJI(textView7, this);
        TextView textView8 = this.LJLJJLL;
        o.LJI(textView8);
        C16880lQ.LJIJI(textView8, this);
        if (getIntent() != null) {
            this.LJLIL = getIntent().getBooleanExtra("isFirstLaunch", false);
        }
        if (a.LJIILJJIL().LIZJ()) {
            C63048Oom.LIZIZ("privacy_account_setting_show", this.LJLIL);
        } else {
            C63048Oom.LIZJ("privacy_account_setting_show", this.LJLIL);
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("confirm_content", "go_private");
        c188727au.LJIIIZ("cancel_content", "skip");
        c188727au.LJIIIZ("button_design", "left_right");
        FMX.LJIIL("tns_privacy_notify", c188727au.LIZ);
        C116484hg.LIZ("action_type", "show", "account_privacy_page");
        C9WG newUserPresenter = Z8A.LIZIZ.newUserPresenter();
        this.LJLILLLLZI = newUserPresenter;
        o.LJI(newUserPresenter);
        newUserPresenter.bindView(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.privateaccount.tip.PrivateAccountTipActivity", "onCreate", false);
    }

    @Override // X.InterfaceC26189APp
    public final void Xa(Exception e, int i) {
        o.LJIIIZ(e, "e");
        if (i == 122) {
            C26045AKb c26045AKb = new C26045AKb(this);
            c26045AKb.LJIIIIZZ(R.string.t6b);
            c26045AKb.LJIIJ();
        }
    }
}
