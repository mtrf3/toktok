package com.ss.android.ugc.aweme.account.agegate.activity;

import X.AbstractActivityC69131RBf;
import X.C16880lQ;
import X.C41115GBr;
import X.C5H3;
import X.C65803Ps7;
import X.C69106RAg;
import X.C85635XjD;
import X.EnumC69113RAn;
import X.ORY;
import X.R41;
import X.R46;
import X.RAU;
import X.RAV;
import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.account.login.v2.base.ActionResultModel;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class FtcActivity extends AbstractActivityC69131RBf {
    public final C5H3 LJLJI;
    public final C5H3 LJLJJI;
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();

    @Override // X.AbstractActivityC69131RBf, X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // X.AbstractActivityC69131RBf, X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJL;
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.FtcActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public FtcActivity() {
        RouteArgExtension routeArgExtension = RouteArgExtension.INSTANCE;
        this.LJLJI = routeArgExtension.optionalArgNotNull(this, RAU.LJLIL, "next_page", Integer.class);
        this.LJLJJI = routeArgExtension.optionalArgNotNull(this, RAV.LJLIL, "child_account_not_expected_upon_signup_success", Boolean.class);
    }

    public final int LLIIJI() {
        return ((Number) this.LJLJI.getValue()).intValue();
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

    @Override // X.AbstractActivityC69131RBf
    public final void LLFZ(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        int i = bundle.getInt("current_page", -1);
        C69106RAg c69106RAg = EnumC69113RAn.Companion;
        int i2 = bundle.getInt("next_page", EnumC69113RAn.FTC_CREATE_ACCOUNT.getValue());
        c69106RAg.getClass();
        EnumC69113RAn LIZ = C69106RAg.LIZ(i2);
        if (LIZ == EnumC69113RAn.DELETE_VIDEO_ALERT) {
            SmartRoute buildRoute = SmartRouter.buildRoute(this, "aweme://hyd_action/delete_video_us");
            buildRoute.withParam(bundle);
            buildRoute.open();
            finish();
            return;
        }
        bundle.putInt("previous_page", i);
        bundle.putInt("current_page", LIZ.getValue());
        bundle.remove("next_page");
        AbstractActivityC69131RBf.LLIIIZ(this, C85635XjD.LIZ(LIZ), bundle);
    }

    @Override // X.AbstractActivityC69131RBf
    public final void LLII(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (!TextUtils.isEmpty(R46.LIZIZ)) {
            bundle.putString("enter_from", R46.LIZIZ);
        }
        if (!TextUtils.isEmpty(R46.LIZJ)) {
            bundle.putString("login_panel_type", R46.LIZJ);
        }
        if (R41.LJII()) {
            bundle.putBoolean("only_login", true);
        }
        if (((Boolean) this.LJLJJI.getValue()).booleanValue()) {
            bundle.putBoolean("child_account_not_expected_upon_signup_success", true);
        }
        bundle.putString("platform", "account");
        SmartRoute buildRoute = SmartRouter.buildRoute(this, "//account/ftc/complete");
        buildRoute.withParam(bundle);
        buildRoute.open();
        Activity[] activityStack = ActivityStack.getActivityStack();
        o.LJIIIIZZ(activityStack, "getActivityStack()");
        for (Activity activity : ORY.LJJIJL(activityStack)) {
            if (!activity.isFinishing()) {
                activity.finish();
            }
        }
    }

    @Override // X.AbstractActivityC69131RBf, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.FtcActivity", "onCreate", true);
        activityConfiguration(C41115GBr.LJLIL);
        super.onCreate(bundle);
        if (bundle == null) {
            if (LLIIJI() != EnumC69113RAn.NONE.getValue()) {
                MediatorLiveData<Bundle> mediatorLiveData = ((ActionResultModel) ViewModelProviders.of(this).get(ActionResultModel.class)).LJLIL;
                Bundle LLJJIJI = C16880lQ.LLJJIJI(getIntent());
                if (LLJJIJI == null) {
                    LLJJIJI = new Bundle();
                }
                LLJJIJI.putInt("next_page", LLIIJI());
                mediatorLiveData.postValue(LLJJIJI);
            } else {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Cannot start AgeGateActivityV2 with Step.NONE");
                ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.FtcActivity", "onCreate", false);
                throw illegalArgumentException;
            }
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.FtcActivity", "onCreate", false);
    }
}
