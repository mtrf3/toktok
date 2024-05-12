package com.ss.android.ugc.aweme.compliance.business.termspp;

import X.AGI;
import X.AGJ;
import X.AbstractC86162Xri;
import X.ActivityC86117Xqz;
import X.AnonymousClass021;
import X.C65803Ps7;
import X.C86159Xrf;
import X.C86163Xrj;
import X.InterfaceC62984Onk;
import X.O0X;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.compliance.api.services.policy.ICompliancePolicyService;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes16.dex */
public final class TermsConsentCombineDialogV2 extends ActivityC86117Xqz implements InterfaceC62984Onk {
    public static final /* synthetic */ int LJLJI = 0;
    public C86159Xrf LJLIL;
    public final Map<Integer, View> LJLILLLLZI = new LinkedHashMap();

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLILLLLZI).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLILLLLZI;
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

    @Override // X.InterfaceC62984Onk
    public final boolean getCanCollectConsent() {
        return false;
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
    }

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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.termspp.TermsConsentCombineDialogV2", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void LLII() {
        boolean z;
        C86159Xrf c86159Xrf = this.LJLIL;
        if (c86159Xrf != null) {
            AbstractC86162Xri abstractC86162Xri = c86159Xrf.LIZLLL;
            if (abstractC86162Xri != null) {
                AbstractC86162Xri abstractC86162Xri2 = c86159Xrf.LIZIZ;
                if (abstractC86162Xri2 != null) {
                    if (abstractC86162Xri2.LIZJ) {
                        AbstractC86162Xri abstractC86162Xri3 = c86159Xrf.LIZJ;
                        if (abstractC86162Xri3 != null) {
                            if (abstractC86162Xri3.LIZJ) {
                                z = true;
                                abstractC86162Xri.LIZ(z);
                                return;
                            }
                        } else {
                            o.LJIJI("agreePrivacyCheckBox");
                            throw null;
                        }
                    }
                    z = false;
                    abstractC86162Xri.LIZ(z);
                    return;
                }
                o.LJIJI("agreeTermsCheckBox");
                throw null;
            }
            o.LJIJI("selectAllCheckBox");
            throw null;
        }
        o.LJIJI("contentView");
        throw null;
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

    public final void LLFII(String str) {
        ICompliancePolicyService LJII = a.LJII();
        if (LJII != null) {
            LJII.LIZIZ(new O0X(AGJ.CONSENT_BOX_KR_OLD.getValue(), str, true, false, 20), new C86163Xrj());
        }
    }

    public final void LLIIIILZ(String str) {
        ICompliancePolicyService LJII = a.LJII();
        if (LJII != null) {
            LJII.LIZ(new O0X(AGJ.CONSENT_BOX_KR_OLD.getValue(), str, false, false, 28));
        }
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.termspp.TermsConsentCombineDialogV2", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.agb);
        AnonymousClass021 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.LJFF();
        }
        C86159Xrf c86159Xrf = new C86159Xrf(this);
        this.LJLIL = c86159Xrf;
        AbstractC86162Xri abstractC86162Xri = c86159Xrf.LIZLLL;
        if (abstractC86162Xri != null) {
            abstractC86162Xri.LIZ = new AqS181S0100000_15(this, 237);
            abstractC86162Xri.LIZIZ = new AqS165S0100000_15(this, 808);
            C86159Xrf c86159Xrf2 = this.LJLIL;
            if (c86159Xrf2 != null) {
                AbstractC86162Xri abstractC86162Xri2 = c86159Xrf2.LIZIZ;
                if (abstractC86162Xri2 != null) {
                    abstractC86162Xri2.LIZ = new AqS181S0100000_15(this, 238);
                    C86159Xrf c86159Xrf3 = this.LJLIL;
                    if (c86159Xrf3 != null) {
                        AbstractC86162Xri abstractC86162Xri3 = c86159Xrf3.LIZJ;
                        if (abstractC86162Xri3 != null) {
                            abstractC86162Xri3.LIZ = new AqS181S0100000_15(this, 239);
                            C86159Xrf c86159Xrf4 = this.LJLIL;
                            if (c86159Xrf4 != null) {
                                c86159Xrf4.LJFF = new AqS165S0100000_15(this, 809);
                                C86159Xrf c86159Xrf5 = this.LJLIL;
                                if (c86159Xrf5 != null) {
                                    c86159Xrf5.LJI = new AqS165S0100000_15(this, 810);
                                    if (AGI.LIZ()) {
                                        LLIIIILZ("terms-of-use");
                                        LLIIIILZ("privacy-policy");
                                    }
                                    C86159Xrf c86159Xrf6 = this.LJLIL;
                                    if (c86159Xrf6 != null) {
                                        c86159Xrf6.LJII = new AqS165S0100000_15(this, 811);
                                        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.termspp.TermsConsentCombineDialogV2", "onCreate", false);
                                        return;
                                    } else {
                                        o.LJIJI("contentView");
                                        throw null;
                                    }
                                }
                                o.LJIJI("contentView");
                                throw null;
                            }
                            o.LJIJI("contentView");
                            throw null;
                        }
                        o.LJIJI("agreePrivacyCheckBox");
                        throw null;
                    }
                    o.LJIJI("contentView");
                    throw null;
                }
                o.LJIJI("agreeTermsCheckBox");
                throw null;
            }
            o.LJIJI("contentView");
            throw null;
        }
        o.LJIJI("selectAllCheckBox");
        throw null;
    }

    public final void LLFZ(String str, String str2) {
        SmartRoute buildRoute = SmartRouter.buildRoute(this, "//webview");
        buildRoute.withParam("url", str);
        buildRoute.withParam("title", str2);
        buildRoute.withParam("skip_consent", true);
        buildRoute.open();
    }
}
