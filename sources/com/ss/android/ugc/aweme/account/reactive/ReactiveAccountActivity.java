package com.ss.android.ugc.aweme.account.reactive;

import X.ActivityC86117Xqz;
import X.C16880lQ;
import X.C188727au;
import X.C26045AKb;
import X.C38816FLg;
import X.C65803Ps7;
import X.DialogC25756A8y;
import X.FMX;
import X.InterfaceC18010nF;
import X.KL2;
import X.OUG;
import X.R41;
import X.RBY;
import X.SY4;
import Y.ACListenerS24S0101000_5;
import Y.ACListenerS32S0101000_15;
import Y.AObjectS12S0001000_7;
import Y.ARunnableS14S0101000_10;
import Y.IDCListenerS10S0101000;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.keva.KevaImpl;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.compliance.api.model.PolicyBodyLinkList;
import com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Map;
import yq4.a;

/* loaded from: classes11.dex */
public class ReactiveAccountActivity extends ActivityC86117Xqz implements InterfaceC18010nF {
    public static final /* synthetic */ int LJLL = 0;
    public TuxTextView LJLIL;
    public TuxTextView LJLILLLLZI;
    public TuxTextView LJLJI;
    public TuxTextView LJLJJI;
    public SY4 LJLJJL;
    public String LJLJJLL;
    public DialogC25756A8y LJLJL;
    public boolean LJLJLJ;
    public final RBY LJLJLLL = R41.LIZ();

    @Override // X.InterfaceC18010nF
    public String getBtmPageCode() {
        return "b2361";
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.reactive.ReactiveAccountActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC18010nF
    public final Map<String, String> x3() {
        return null;
    }

    public final void LLFII() {
        KevaImpl.getRepo("age_gate", 1).storeString("mixed_age_seen", CardStruct.IStatusCode.DEFAULT);
        C38816FLg.LIZLLL(new ARunnableS14S0101000_10(2, this, 8), 5000);
        User curUser = this.LJLJLLL.getCurUser();
        curUser.setUserCancelled(false);
        this.LJLJLLL.updateCurUser(curUser);
        if (TextUtils.equals(this.LJLJJLL, "enter_from_login_ui_routine")) {
            OUG.LIZ(null);
        }
        if (a.LJIILL().LJIIJ()) {
            a.LJIILL().LJI();
            a.LJIILL().LJIILLIIL();
        }
        C26045AKb c26045AKb = new C26045AKb(this);
        c26045AKb.LJIIIIZZ(R.string.hwe);
        c26045AKb.LIZ(true);
        c26045AKb.LJIIJ();
        PopupManager.LIZJ(a.LJFF().LJIJI());
        finish();
    }

    @Override // X.InterfaceC18010nF
    public final String LLZIL() {
        return String.valueOf(hashCode());
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
        PopupManager.LIZJ(a.LJFF().LJIJI());
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
        String string;
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.reactive.ReactiveAccountActivity", "onCreate", true);
        activityConfiguration(new AObjectS12S0001000_7(0, 4));
        super.onCreate(bundle);
        setContentView(R.layout.m0);
        this.LJLJJLL = C16880lQ.LLJJIJIIJIL(getIntent(), "enter_from");
        this.LJLIL = (TuxTextView) findViewById(R.id.mo6);
        this.LJLILLLLZI = (TuxTextView) findViewById(R.id.m4n);
        SY4 sy4 = (SY4) findViewById(R.id.aya);
        this.LJLJJL = sy4;
        sy4.getClass();
        this.LJLJI = (TuxTextView) findViewById(R.id.ax3);
        this.LJLJJI = (TuxTextView) findViewById(R.id.m5q);
        if (this.LJLJLLL.getCurUser().getCancelType() == 1) {
            View findViewById = findViewById(R.id.f5a);
            View findViewById2 = findViewById(R.id.jcz);
            ((LinearLayout.LayoutParams) findViewById.getLayoutParams()).topMargin = (int) KL2.LIZJ(this, 136.0f);
            ((RelativeLayout.LayoutParams) findViewById2.getLayoutParams()).topMargin = (int) KL2.LIZJ(this, 16.0f);
            this.LJLILLLLZI.setGravity(8388611);
        }
        if (this.LJLJLLL.getCurUser().getCancelType() == 1) {
            IComplianceSettingsService LJIIZILJ = a.LJIIZILJ();
            if (!TextUtils.isEmpty(LJIIZILJ.LJIJJLI())) {
                this.LJLILLLLZI.setText(LJIIZILJ.LJIJ(this, LJIIZILJ.LJIJJLI(), LJIIZILJ.LJIJJ()));
            } else {
                ArrayList arrayList = new ArrayList();
                String string2 = getString(R.string.g7i);
                Boolean bool = Boolean.FALSE;
                arrayList.add(new PolicyBodyLinkList(string2, "aweme://webview/?url=https://www.tiktok.com/legal/terms-of-service?", bool, 0, bool, ""));
                arrayList.add(new PolicyBodyLinkList(getString(R.string.g7h), "aweme://webview/?url=https://www.tiktok.com/legal/privacy-policy?", bool, 0, bool, ""));
                this.LJLILLLLZI.setText(LJIIZILJ.LJIJ(this, getString(R.string.eek), arrayList));
            }
            this.LJLILLLLZI.setMovementMethod(LinkMovementMethod.getInstance());
            TuxTextView tuxTextView = this.LJLIL;
            if (!TextUtils.isEmpty(LJIIZILJ.LJI())) {
                string = LJIIZILJ.LJI();
            } else {
                string = getString(R.string.eel);
            }
            tuxTextView.setText(string);
            this.LJLJJL.setText(R.string.eej);
        } else {
            this.LJLIL.setText(R.string.hwd);
            this.LJLILLLLZI.setText(R.string.hwb);
            this.LJLJJL.setText(R.string.hwa);
        }
        C16880lQ.LJJJJI(this.LJLJI, new ACListenerS32S0101000_15(0, this, 10));
        C16880lQ.LJJIZ(this.LJLJJL, new ACListenerS24S0101000_5(1, this, 10));
        if (a.LJIIZILJ().LJIILLIIL() != 0) {
            this.LJLJJI.setVisibility(0);
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", "reactive_account");
            FMX.LJIIL("show_data_download", c188727au.LIZ);
            C16880lQ.LJJJJI(this.LJLJJI, new IDCListenerS10S0101000(2, this, 7));
            this.LJLJJI.setMovementMethod(LinkMovementMethod.getInstance());
        }
        FMX.onEventV3("show_reactivate_account");
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.reactive.ReactiveAccountActivity", "onCreate", false);
    }

    @Override // X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.LJLJJLL = C16880lQ.LLJJIJIIJIL(intent, "enter_from");
    }
}
