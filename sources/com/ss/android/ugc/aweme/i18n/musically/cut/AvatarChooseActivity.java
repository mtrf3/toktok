package com.ss.android.ugc.aweme.i18n.musically.cut;

import X.ActivityC86117Xqz;
import X.C158096Ij;
import X.C235119Kp;
import X.C252709vu;
import X.C43254GyI;
import X.C43255GyJ;
import X.C43256GyK;
import X.C44291oX;
import X.C65803Ps7;
import X.C78840Uwu;
import android.os.Bundle;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.ComplianceBusinessServiceImpl;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.IDLCallbackS16S0200000_7;
import com.ss.android.ugc.aweme.services.videochoose.IVideoChoose;
import com.zhiliaoapp.musically.R;

/* loaded from: classes8.dex */
public class AvatarChooseActivity extends ActivityC86117Xqz implements IVideoChoose.Callback {
    public static final /* synthetic */ int LJLJJI = 0;
    public IVideoChoose LJLIL;
    public final IComplianceBusinessService LJLILLLLZI = ComplianceBusinessServiceImpl.LJJJJIZL();
    public boolean LJLJI;

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
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
        IVideoChoose iVideoChoose;
        C65803Ps7.LIZLLL(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.i18n.musically.cut.AvatarChooseActivity", "onResume", true);
        super.onResume();
        if (!this.LJLJI && (iVideoChoose = this.LJLIL) != null) {
            this.LJLJI = true;
            iVideoChoose.loadData();
        }
        if (C158096Ij.LIZ) {
            getLifecycle().addObserver(this.LJLILLLLZI.LJIIJ(this, R.string.g0n, "direct_shoot", "personal_homepage", "", null));
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.i18n.musically.cut.AvatarChooseActivity", "onResume", false);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.i18n.musically.cut.AvatarChooseActivity", "onWindowFocusChanged", true);
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

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.i18n.musically.cut.AvatarChooseActivity", "onCreate", true);
        activityConfiguration(new C44291oX(1));
        super.onCreate(bundle);
        setContentView(R.layout.c3i);
        C252709vu c252709vu = (C252709vu) findViewById(R.id.la4);
        C235119Kp c235119Kp = new C235119Kp();
        C78840Uwu.LJJIL(c235119Kp, getString(R.string.iah), this);
        c252709vu.setNavActions(c235119Kp);
        AVExternalServiceImpl.LIZ().asyncService(this, "AvatarChoose", new IDLCallbackS16S0200000_7(getSupportFragmentManager().LJJJI(R.id.hor), this, 0));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.i18n.musically.cut.AvatarChooseActivity", "onCreate", false);
    }

    @Override // com.ss.android.ugc.aweme.services.videochoose.IVideoChoose.Callback
    public final void onData(String str) {
        C43256GyK c43256GyK = new C43256GyK();
        c43256GyK.LIZIZ = new C43255GyJ(this);
        SmartRoute buildRoute = SmartRouter.buildRoute(this, "//profile/avatar_cut");
        buildRoute.withParam("file_path", str);
        buildRoute.open(3, new C43254GyI(c43256GyK));
    }
}
