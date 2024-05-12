package com.ss.android.ugc.aweme.account.ui;

import X.AbstractActivityC69131RBf;
import X.AnonymousClass636;
import X.C16880lQ;
import X.C221108m2;
import X.C38891fp;
import X.C41565GSz;
import X.C58725N2z;
import X.C5S1;
import X.C62822Ol8;
import X.C65803Ps7;
import X.C69104RAe;
import X.C69106RAg;
import X.C85635XjD;
import X.EnumC69113RAn;
import X.EnumC69116RAq;
import X.R41;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.account.login.v2.base.ActionResultModel;
import com.ss.android.ugc.aweme.app.services.IPushLaunchPageAssistantService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS177S0100000_11;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class BindOrModifyPhoneActivity extends AbstractActivityC69131RBf {
    public static final /* synthetic */ int LJLL = 0;
    public boolean LJLJJI;
    public Bundle LJLJJL;
    public Integer LJLJJLL;
    public boolean LJLJL;
    public final Map<Integer, View> LJLJLLL = new LinkedHashMap();
    public EnumC69113RAn LJLJI = EnumC69113RAn.INPUT_PHONE_BIND;
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(new C69104RAe(this));

    @Override // X.AbstractActivityC69131RBf, X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJLLL).clear();
    }

    @Override // X.AbstractActivityC69131RBf, X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJLLL;
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

    @Override // X.AbstractActivityC69131RBf, X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.ui.BindOrModifyPhoneActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity
    public final void finish() {
        super.finish();
        if (this.LJLJJI) {
            Integer num = this.LJLJJLL;
            o.LJI(num);
            R41.LJIIL(num.intValue(), 1, this.LJLJJL);
        } else {
            ((IPushLaunchPageAssistantService) C58725N2z.LIZIZ(IPushLaunchPageAssistantService.class)).LIZ(this);
            User LIZJ = R41.LIZJ();
            if (LIZJ == null || LIZJ.isPhoneBinded()) {
                return;
            }
            R41.LJIIL(7, 2, null);
        }
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStop() {
        C65803Ps7.LJFF(this);
        super.onStop();
        if (this.LJLJL) {
            finish();
        }
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

    @Override // X.AbstractActivityC69131RBf
    public final void LLFZ(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        C69106RAg c69106RAg = EnumC69113RAn.Companion;
        int i = bundle2.getInt("next_page", EnumC69113RAn.INPUT_PHONE_BIND.getValue());
        c69106RAg.getClass();
        EnumC69113RAn LIZ = C69106RAg.LIZ(i);
        bundle2.putInt("previous_page", bundle2.getInt("current_page", -1));
        bundle2.putInt("current_page", LIZ.getValue());
        bundle2.remove("next_page");
        AbstractActivityC69131RBf.LLIIIZ(this, C85635XjD.LIZ(LIZ), bundle2);
    }

    @Override // X.AbstractActivityC69131RBf
    public final void LLII(Bundle bundle) {
        if (bundle != null && bundle.getBoolean("show_modify_phone_success_toast", false)) {
            Context applicationContext = getApplicationContext();
            if (C38891fp.LJLJI && applicationContext == null) {
                applicationContext = C38891fp.LJLILLLLZI;
            }
            C5S1 c5s1 = new C5S1(applicationContext);
            c5s1.LIZLLL(getString(R.string.c_9));
            c5s1.LJ();
        } else if (((Bundle) this.LJLJLJ.getValue()).getBoolean("show_success_toast", true)) {
            Context applicationContext2 = getApplicationContext();
            if (C38891fp.LJLJI && applicationContext2 == null) {
                applicationContext2 = C38891fp.LJLILLLLZI;
            }
            C5S1 c5s12 = new C5S1(applicationContext2);
            c5s12.LIZLLL(getString(R.string.qu0));
            c5s12.LJ();
        }
        if (C41565GSz.LIZIZ(getIntent())) {
            this.LJLJL = true;
        } else {
            finish();
        }
    }

    @Override // X.AbstractActivityC69131RBf, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.ui.BindOrModifyPhoneActivity", "onCreate", true);
        activityConfiguration(new AqS177S0100000_11(this, 19));
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(new ColorDrawable(AnonymousClass636.LJIIIIZZ(R.attr.cl, this)));
        C69106RAg c69106RAg = EnumC69113RAn.Companion;
        int intExtra = getIntent().getIntExtra("next_page", EnumC69113RAn.INPUT_PHONE_BIND.getValue());
        c69106RAg.getClass();
        this.LJLJI = C69106RAg.LIZ(intExtra);
        Intent intent = getIntent();
        EnumC69116RAq enumC69116RAq = EnumC69116RAq.NONE;
        if (intent.getIntExtra("current_scene", enumC69116RAq.getValue()) == enumC69116RAq.getValue()) {
            getIntent().putExtra("current_scene", EnumC69116RAq.BIND_PHONE.getValue());
            getIntent().putExtra("enter_method", "first_bind_phone_click");
        }
        if (bundle == null) {
            MediatorLiveData<Bundle> mediatorLiveData = ((ActionResultModel) ViewModelProviders.of(this).get(ActionResultModel.class)).LJLIL;
            Bundle LLJJIJI = C16880lQ.LLJJIJI(getIntent());
            if (LLJJIJI == null) {
                LLJJIJI = new Bundle();
            }
            LLJJIJI.putString("enter_from", C16880lQ.LLJJIJIIJIL(getIntent(), "ENTER_REASON"));
            LLJJIJI.putString("enter_method", C16880lQ.LLJJIJIIJIL(getIntent(), "enter_method"));
            String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "enter_type");
            if (LLJJIJIIJIL == null) {
                LLJJIJIIJIL = "";
            }
            LLJJIJI.putString("enter_type", LLJJIJIIJIL);
            LLJJIJI.putInt("next_page", this.LJLJI.getValue());
            mediatorLiveData.postValue(LLJJIJI);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.ui.BindOrModifyPhoneActivity", "onCreate", false);
    }
}
