package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.subpayment;

import X.AbstractActivityC27434Api;
import X.C16880lQ;
import X.C1B3;
import X.C27588AsC;
import X.C65803Ps7;
import X.C78983UzD;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class SubPaymentListActivity extends AbstractActivityC27434Api {
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();
    public final String LJLJJI = "sub_payment_list";

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, X.KMV
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

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.osp.payment.subpayment.SubPaymentListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        finish();
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

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.osp.payment.subpayment.SubPaymentListActivity", "onCreate", true);
        activityConfiguration(C27588AsC.LJLIL);
        super.onCreate(bundle);
        setContentView(R.layout.uv);
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "sub_payment_list_checked_sub_pm_id");
        if (LLJJIJIIJIL == null) {
            LLJJIJIIJIL = "";
        }
        boolean parseBoolean = Boolean.parseBoolean(C16880lQ.LLJJIJIIJIL(getIntent(), "is_from_osp"));
        try {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            C1B3 c1b3 = new C1B3(supportFragmentManager);
            SubPaymentListFragment subPaymentListFragment = new SubPaymentListFragment();
            subPaymentListFragment.LJLILLLLZI = LLJJIJIIJIL;
            subPaymentListFragment.LJLJI = parseBoolean;
            c1b3.LJIIIIZZ(R.id.dm7, 1, subPaymentListFragment, this.LJLJJI);
            c1b3.LJ(this.LJLJJI);
            c1b3.LJI();
        } catch (Exception e) {
            C78983UzD.LJIIZILJ(e);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.osp.payment.subpayment.SubPaymentListActivity", "onCreate", false);
    }
}
