package com.ss.android.ugc.aweme.ecommerce.base.pdp.ui;

import X.AbstractActivityC27434Api;
import X.C1A8;
import X.C1B3;
import X.C1B6;
import X.C27350AoM;
import X.C27531ArH;
import X.C61928OSe;
import X.C65803Ps7;
import X.C70414RkI;
import X.EnumC61929OSf;
import X.EnumC63755P0l;
import X.GGM;
import X.InterfaceC18010nF;
import X.InterfaceC36571c5;
import X.InterfaceC61927OSd;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EcPdpSlowFuncOpt;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public final class PdpActivity extends AbstractActivityC27434Api implements InterfaceC18010nF {
    public String LJLJJL;
    public boolean LJLJJLL;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();
    public long LJLJJI = -1;

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJL).clear();
    }

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, X.KMV
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

    @Override // X.AbstractActivityC27434Api, X.InterfaceC37828Esy
    public final String getPageName() {
        return "product_detail";
    }

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.pdp.ui.PdpActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC18010nF
    public final Map<String, String> x3() {
        return null;
    }

    @Override // X.InterfaceC18010nF
    public String getBtmPageCode() {
        return EnumC63755P0l.PDP_PAGE.getPageCode();
    }

    @Override // X.InterfaceC18010nF
    public final String LLZIL() {
        return String.valueOf(hashCode());
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        int LJJJJIZL = getSupportFragmentManager().LJJJJIZL();
        String str = "";
        if (LJJJJIZL > 0) {
            InterfaceC36571c5 LJJJIL = getSupportFragmentManager().LJJJIL(getSupportFragmentManager().LJJJJI(LJJJJIZL - 1).getName());
            if (!(LJJJIL instanceof InterfaceC61927OSd) || !((InterfaceC61927OSd) LJJJIL).onBackPressed()) {
                if (LJJJJIZL == 1) {
                    this.LJLJJLL = true;
                    C70414RkI LIZ = C27350AoM.LIZ(this);
                    if (LIZ != null) {
                        LIZ.LJJ = "return";
                    }
                    String str2 = this.LJLJJL;
                    if (str2 != null) {
                        str = str2;
                    }
                    C61928OSe c61928OSe = new C61928OSe(str);
                    c61928OSe.LJIILIIL(EnumC61929OSf.RETURN);
                    c61928OSe.LJIIL(LLFII());
                    c61928OSe.LJIIJ();
                    finish();
                    return;
                }
                super.onBackPressed();
                return;
            }
            return;
        }
        this.LJLJJLL = true;
        C70414RkI LIZ2 = C27350AoM.LIZ(this);
        if (LIZ2 != null) {
            LIZ2.LJJ = "return";
            LIZ2.LJJJJJL(EnumC61929OSf.RETURN);
        }
        String str3 = this.LJLJJL;
        if (str3 != null) {
            str = str3;
        }
        C61928OSe c61928OSe2 = new C61928OSe(str);
        c61928OSe2.LJIILIIL(EnumC61929OSf.RETURN);
        c61928OSe2.LJIIL(LLFII());
        c61928OSe2.LJIIJ();
        super.onBackPressed();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
        LiveOuterService.LJJJLL().LJJIJIL().E8(SystemClock.elapsedRealtime() - this.LJLJJI);
    }

    @Override // X.AbstractActivityC27434Api, X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.pdp.ui.PdpActivity", "onResume", true);
        super.onResume();
        this.LJLJJI = SystemClock.elapsedRealtime();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.pdp.ui.PdpActivity", "onResume", false);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStop() {
        C70414RkI LIZ;
        C65803Ps7.LJFF(this);
        super.onStop();
        if (!this.LJLJJLL && !ActivityStack.isAppBackGround() && (LIZ = C27350AoM.LIZ(this)) != null) {
            LIZ.LJJJJJL(EnumC61929OSf.NEXT);
        }
        this.LJLJJLL = false;
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.pdp.ui.PdpActivity", "onCreate", true);
        activityConfiguration(GGM.LJLIL);
        super.onCreate(bundle);
        getIntent().putExtra("in_window", "product_detail");
        IPdpStarter.PdpEnterParam pdpEnterParam = (IPdpStarter.PdpEnterParam) C1A8.LJIIZILJ(this, "ENTER_PARAMS");
        if (pdpEnterParam == null) {
            finish();
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.pdp.ui.PdpActivity", "onCreate", false);
            return;
        }
        if (EcPdpSlowFuncOpt.LIZJ()) {
            C27531ArH.LIZIZ(this, pdpEnterParam.getBizType());
        }
        setContentView(R.layout.a1z);
        this.LJLJJL = pdpEnterParam.getProductId();
        Object LJIIZILJ = C1A8.LJIIZILJ(this, "PREFETCH_RESULT");
        int intExtra = getIntent().getIntExtra("ERROR_CODE", 0);
        C70414RkI c70414RkI = new C70414RkI(this, pdpEnterParam);
        getIntent().getLongExtra("CLICK_TIMESTAMP", SystemClock.elapsedRealtime());
        c70414RkI.LJIIZILJ = getIntent().getLongExtra("CLICK_TIMESTAMP", SystemClock.elapsedRealtime());
        PdpFragment pdpFragment = new PdpFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("full_screen", pdpEnterParam.getFullScreen());
        if (LJIIZILJ != null) {
            if (intExtra != 0) {
                bundle2.putInt("ERROR_CODE", intExtra);
            }
            bundle2.putLong("PREFETCH_FINISH_TIME", getIntent().getLongExtra("PREFETCH_FINISH_TIME", 0L));
        }
        pdpFragment.setArguments(bundle2);
        pdpFragment.LJLJJLL = pdpEnterParam.getBizType();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C1B3 LIZ = C1B6.LIZ(supportFragmentManager, supportFragmentManager);
        LIZ.LJIIIIZZ(R.id.dm7, 1, pdpFragment, "pdp_fragment");
        LIZ.LJ("pdp_fragment");
        LIZ.LJI();
        if (!EcPdpSlowFuncOpt.LIZJ()) {
            C27531ArH.LIZIZ(this, pdpEnterParam.getBizType());
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.pdp.ui.PdpActivity", "onCreate", false);
    }
}
