package com.ss.android.ugc.aweme.account.unbind;

import X.AbstractActivityC69131RBf;
import X.C16880lQ;
import X.C65803Ps7;
import X.C69106RAg;
import X.C85635XjD;
import X.EnumC69113RAn;
import X.EnumC69116RAq;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.account.login.v2.base.ActionResultModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class UnbindPhoneOrEmailActivity extends AbstractActivityC69131RBf {
    public final Map<Integer, View> LJLJI = new LinkedHashMap();

    @Override // X.AbstractActivityC69131RBf, X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // X.AbstractActivityC69131RBf, X.ActivityC86117Xqz, X.KMV
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.unbind.UnbindPhoneOrEmailActivity", "onWindowFocusChanged", true);
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

    @Override // X.AbstractActivityC69131RBf
    public final void LLFZ(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        C69106RAg c69106RAg = EnumC69113RAn.Companion;
        int i = bundle2.getInt("next_page", EnumC69113RAn.UNBIND_PHONE_CONFIRM.getValue());
        c69106RAg.getClass();
        EnumC69113RAn LIZ = C69106RAg.LIZ(i);
        bundle2.remove("next_page");
        bundle2.putInt("current_page", LIZ.getValue());
        AbstractActivityC69131RBf.LLIIIZ(this, C85635XjD.LIZ(LIZ), bundle2);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    @Override // X.AbstractActivityC69131RBf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLII(android.os.Bundle r6) {
        /*
            r5 = this;
            r4 = 0
            if (r6 == 0) goto L8e
            java.lang.String r0 = "unbind_success"
            boolean r3 = r6.getBoolean(r0)
            java.lang.String r0 = "unbind_type"
            int r0 = r6.getInt(r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            if (r3 == 0) goto L8f
            X.RAq r0 = X.EnumC69116RAq.UNBIND_PHONE
            int r1 = r0.getValue()
            if (r2 != 0) goto L77
        L1d:
            X.RAq r0 = X.EnumC69116RAq.UNBIND_PHONE
            int r1 = r0.getValue()
            if (r2 != 0) goto L69
        L25:
            X.RAq r0 = X.EnumC69116RAq.UNBIND_EMAIL
            int r1 = r0.getValue()
            if (r2 != 0) goto L5b
        L2d:
            java.lang.String r2 = ""
        L2f:
            java.lang.String r0 = "if (isSuccess) {\n       …ast_ineligible)\n        }"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L57
            X.AKb r1 = new X.AKb
            r1.<init>(r5)
            if (r3 == 0) goto L4d
            r0 = 2131756414(0x7f10057e, float:1.9143735E38)
            r1.LJFF(r0)
            r0 = 2130968667(0x7f04005b, float:1.7545994E38)
            r1.LJII(r0)
        L4d:
            r1.LJIIIZ(r2)
            r0 = 1
            r1.LIZ(r0)
            r1.LJIIJ()
        L57:
            r5.finish()
            return
        L5b:
            int r0 = r2.intValue()
            if (r0 != r1) goto L2d
            r0 = 2131829824(0x7f112440, float:1.9292628E38)
            java.lang.String r2 = r5.getString(r0)
            goto L2f
        L69:
            int r0 = r2.intValue()
            if (r0 != r1) goto L25
            r0 = 2131834617(0x7f1136f9, float:1.930235E38)
            java.lang.String r2 = r5.getString(r0)
            goto L2f
        L77:
            int r0 = r2.intValue()
            if (r0 != r1) goto L1d
            X.UUc r1 = X.C77266UUc.LIZIZ
            X.Mfn r0 = r1.LJIILLIIL()
            r0.LJFF(r4)
            X.UQ5 r0 = r1.LJIIJ()
            r0.LJFF(r4)
            goto L1d
        L8e:
            r3 = 0
        L8f:
            r0 = 2131848291(0x7f116c63, float:1.9330084E38)
            java.lang.String r2 = r5.getString(r0)
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.unbind.UnbindPhoneOrEmailActivity.LLII(android.os.Bundle):void");
    }

    @Override // X.AbstractActivityC69131RBf, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.unbind.UnbindPhoneOrEmailActivity", "onCreate", true);
        super.onCreate(bundle);
        if (bundle == null) {
            ((ActionResultModel) ViewModelProviders.of(this).get(ActionResultModel.class)).LJLIL.postValue(C16880lQ.LLJJIJI(getIntent()));
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.unbind.UnbindPhoneOrEmailActivity", "onCreate", false);
    }

    public static final void LLIIJLIL(Context context, ArrayList<String> extraLoginMethod, String enterFrom, Boolean bool, Bundle bundle) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(extraLoginMethod, "extraLoginMethod");
        o.LJIIIZ(enterFrom, "enterFrom");
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "//account/phone_or_email/unbind");
        buildRoute.withParam("enter_from", enterFrom);
        buildRoute.withParam("current_scene", EnumC69116RAq.UNBIND_PHONE.getValue());
        buildRoute.withParam("next_page", EnumC69113RAn.UNBIND_PHONE_CONFIRM.getValue());
        buildRoute.withParam("extra_eligible_login_methods", extraLoginMethod);
        buildRoute.withParam("is_safe_env", bool);
        buildRoute.withParam(bundle);
        buildRoute.open();
    }

    public static final void LLIIJI(Context context, boolean z, ArrayList<String> extraLoginMethod, String enterFrom, Boolean bool, Bundle bundle) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(extraLoginMethod, "extraLoginMethod");
        o.LJIIIZ(enterFrom, "enterFrom");
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "//account/phone_or_email/unbind");
        buildRoute.withParam("enter_from", enterFrom);
        buildRoute.withParam("current_scene", EnumC69116RAq.UNBIND_EMAIL.getValue());
        buildRoute.withParam("next_page", EnumC69113RAn.UNBIND_EMAIL_CONFIRM.getValue());
        buildRoute.withParam("is_email_verified", z);
        buildRoute.withParam("extra_eligible_login_methods", extraLoginMethod);
        buildRoute.withParam("is_safe_env", bool);
        buildRoute.withParam(bundle);
        buildRoute.open();
    }
}
