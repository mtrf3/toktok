package com.ss.android.ugc.aweme.account.ui;

import X.ActivityC86117Xqz;
import X.C16880lQ;
import X.C1B3;
import X.C65803Ps7;
import X.InterfaceC252919wF;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.account.verify.EmailConsentPageFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes5.dex */
public class EmailConsentPageActivity extends ActivityC86117Xqz {
    public final Map<Integer, View> LJLIL = new LinkedHashMap();

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLIL).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLIL;
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.ui.EmailConsentPageActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        BaseAccountFlowFragment baseAccountFlowFragment = (BaseAccountFlowFragment) getSupportFragmentManager().LJJJI(R.id.ctr);
        if (baseAccountFlowFragment != null && baseAccountFlowFragment.onBackPressed()) {
            return;
        }
        if (getSupportFragmentManager().LJJJJIZL() == 1) {
            finish();
        } else {
            if (!isActive()) {
                return;
            }
            getSupportFragmentManager().LJJLIIIJJI();
        }
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.ui.EmailConsentPageActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.e8);
        final String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "enter_from");
        if (LLJJIJIIJIL == null) {
            LLJJIJIIJIL = "";
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        o.LJIIIIZZ(supportFragmentManager, "supportFragmentManager");
        C1B3 c1b3 = new C1B3(supportFragmentManager);
        EmailConsentPageFragment emailConsentPageFragment = new EmailConsentPageFragment();
        emailConsentPageFragment.LJLLLLLL = new InterfaceC252919wF() { // from class: X.9wD
            @Override // X.InterfaceC252919wF
            public final void LJI() {
                C252809w4.LIZ(LLJJIJIIJIL, "back");
                this.finish();
            }

            @Override // X.InterfaceC252919wF
            public final void LIZ() {
                a.LJIILIIL().LJI("email_consent");
                C252809w4.LIZ(LLJJIJIIJIL, "get_updates");
                C57082Lw.LIZ.LIZJ("email_consent_status").postValue(new C252889wC(true));
                this.finish();
            }

            @Override // X.InterfaceC252919wF
            public final void onCancel() {
                C252859w9.LIZIZ();
                C252809w4.LIZ(LLJJIJIIJIL, "no_thanks");
                this.finish();
            }
        };
        Bundle bundle2 = new Bundle();
        bundle2.putString("enter_from", LLJJIJIIJIL);
        emailConsentPageFragment.setArguments(bundle2);
        c1b3.LJIIIIZZ(R.id.ctr, 1, emailConsentPageFragment, null);
        c1b3.LJIILJJIL();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.ui.EmailConsentPageActivity", "onCreate", false);
    }
}
