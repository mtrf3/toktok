package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.billingaddress;

import X.AbstractActivityC27434Api;
import X.C1B3;
import X.C27494Aqg;
import X.C27739Aud;
import X.C65330PkU;
import X.C65352Pkq;
import X.C65803Ps7;
import X.C66822jm;
import X.C78983UzD;
import X.C79057V0z;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.gson.s;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class BillingAddressActivity extends AbstractActivityC27434Api {
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJI;
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.osp.payment.billingaddress.BillingAddressActivity", "onWindowFocusChanged", true);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.osp.payment.billingaddress.BillingAddressActivity", "onCreate", true);
        activityConfiguration(C27494Aqg.LJLIL);
        super.onCreate(bundle);
        setContentView(R.layout.uv);
        BillingFragmentEnterParams billingFragmentEnterParams = null;
        try {
            Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), C79057V0z.LJJIFFI(C66822jm.LIZ, "BILLING_ADDRESS_PARAMS"), C65330PkU.LIZJ(C65352Pkq.LIZLLL(BillingFragmentEnterParams.class)));
            if (!(fromJson instanceof BillingFragmentEnterParams)) {
                fromJson = null;
            }
            billingFragmentEnterParams = (BillingFragmentEnterParams) fromJson;
        } catch (s unused) {
        }
        try {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            C1B3 c1b3 = new C1B3(supportFragmentManager);
            BillingAddressFragment billingAddressFragment = new BillingAddressFragment();
            billingAddressFragment.LJLIL = billingFragmentEnterParams;
            c1b3.LJIIIIZZ(R.id.dm7, 1, billingAddressFragment, "BILLING_ADDRESS_HALF_FRAG_TAG");
            c1b3.LJ("BILLING_ADDRESS_HALF_FRAG_TAG");
            c1b3.LJI();
        } catch (Exception e) {
            C78983UzD.LJIIZILJ(e);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.osp.payment.billingaddress.BillingAddressActivity", "onCreate", false);
    }
}
