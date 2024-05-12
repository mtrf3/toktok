package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.bnpl;

import X.ARN;
import X.AbstractActivityC27434Api;
import X.C113554cx;
import X.C16880lQ;
import X.C221108m2;
import X.C26227ARb;
import X.C36636EZk;
import X.C3AW;
import X.C62822Ol8;
import X.C65803Ps7;
import X.C66502jG;
import X.C76800UCe;
import X.C78565UsT;
import X.FMX;
import X.InterfaceC88472Yns;
import X.MBB;
import X.OSZ;
import X.SAP;
import X.UC0;
import X.V1B;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.pipo.PipoService;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS34S1300000_12;

/* loaded from: classes13.dex */
public final class BnplMiddleActivity extends AbstractActivityC27434Api {
    public String LJLJJL;
    public String LJLJJLL;
    public int LJLJL;
    public long LJLJLJ;
    public long LJLJLLL;
    public final Map<Integer, View> LJLL = new LinkedHashMap();
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 274));

    public final void LLFZ() {
        FMX.LJIIL("rd_pipo_bnpl_df_download_start", C113554cx.LJJLIIIIJ(new OSZ("bnpl_source_id", this.LJLJJL), new OSZ("download_scene", "middlePage")));
        V1B.LJLJJL((Dialog) this.LJLJJI.getValue());
        PipoService.LJ().LIZIZ(new AqS178S0100000_12(this, 115));
    }

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLL).clear();
    }

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLL;
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.osp.payment.bnpl.BnplMiddleActivity", "onWindowFocusChanged", true);
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

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        String str2;
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.osp.payment.bnpl.BnplMiddleActivity", "onCreate", true);
        super.onCreate(bundle);
        this.LJLJLLL = System.currentTimeMillis();
        Bundle LLJJIJI = C16880lQ.LLJJIJI(getIntent());
        if (LLJJIJI != null) {
            str = LLJJIJI.getString("source");
        } else {
            str = null;
        }
        this.LJLJJL = str;
        Bundle LLJJIJI2 = C16880lQ.LLJJIJI(getIntent());
        if (LLJJIJI2 != null) {
            str2 = LLJJIJI2.getString("landing_info");
        } else {
            str2 = null;
        }
        this.LJLJJLL = str2;
        FMX.LJIIL("rd_pipo_enter_middle_page", C113554cx.LJJLIIIIJ(new OSZ("bnpl_source_id", this.LJLJJL)));
        if (!PipoService.LJ().LIZJ()) {
            this.LJLJLJ = System.currentTimeMillis();
            LLFZ();
        } else {
            C78565UsT.LJJIIZI(this, MBB.INSTANCE, new SAP(this, null));
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.osp.payment.bnpl.BnplMiddleActivity", "onCreate", false);
    }

    public final void LLII(String str, InterfaceC88472Yns<? super ARN, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super ARN, C76800UCe> interfaceC88472Yns2) {
        FMX.LJIIL("rd_pipo_middle_retry_show", C113554cx.LJJLIIIIJ(new OSZ("bnpl_source_id", this.LJLJJL), new OSZ("object_id", str)));
        C26227ARb LIZ = C3AW.LIZ(this);
        LIZ.LIZ(R.string.f2m);
        LIZ.LJII = false;
        UC0.LIZJ(LIZ, new AqS34S1300000_12(this, (BnplMiddleActivity) str, (String) interfaceC88472Yns, interfaceC88472Yns2, (InterfaceC88472Yns<? super ARN, C76800UCe>) 0));
        C78565UsT.LJJIIZI(this, C36636EZk.LIZ, new C66502jG(LIZ.LJI(), null));
    }
}
