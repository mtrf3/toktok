package com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription;

import X.ActivityC86117Xqz;
import X.C199777sj;
import X.C1B3;
import X.C234529Ii;
import X.C252709vu;
import X.C65803Ps7;
import X.GI6;
import X.GI7;
import X.GI9;
import X.GIA;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class SubscriptionActivity extends ActivityC86117Xqz {
    public SubscriptionPage LJLIL;
    public FreeTrialPage LJLILLLLZI;
    public C252709vu LJLJJI;
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();
    public int LJLJI = -1;

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
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

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if ((getSupportFragmentManager().LJJJI(R.id.dm7) instanceof SubscriptionPage) && this.LJLJI == 2) {
            super.onBackPressed();
        }
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        PopupManager.LIZJ(C199777sj.class);
        super.onDestroy();
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

    public final void LLFII(Fragment fragment) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        C1B3 c1b3 = new C1B3(supportFragmentManager);
        c1b3.LJIIJ(fragment, null, R.id.dm7);
        c1b3.LJIILJJIL();
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        activityConfiguration(new AqS173S0100000_7(this, 36));
        super.onCreate(bundle);
        setContentView(R.layout.ahs);
        SmartRouter.autowire(this);
        int intExtra = getIntent().getIntExtra("enter_from", -1);
        this.LJLJI = intExtra;
        if (intExtra == -1) {
            return;
        }
        if (intExtra == 2 && !(getSupportFragmentManager().LJJJI(R.id.dm7) instanceof FreeTrialPage)) {
            View findViewById = findViewById(R.id.hfl);
            o.LJIIIIZZ(findViewById, "findViewById(R.id.page_nav_bar)");
            C252709vu c252709vu = (C252709vu) findViewById;
            this.LJLJJI = c252709vu;
            C234529Ii LIZJ = s1.LIZJ();
            LIZJ.LIZJ = R.raw.icon_arrow_left_ltr;
            LIZJ.LIZIZ(new AqS157S0100000_7(this, 625));
            c252709vu.LIZJ(LIZJ);
            C252709vu c252709vu2 = this.LJLJJI;
            if (c252709vu2 != null) {
                c252709vu2.LJIILJJIL(false);
                C252709vu c252709vu3 = this.LJLJJI;
                if (c252709vu3 != null) {
                    c252709vu3.setNavBackground(0);
                    C252709vu c252709vu4 = this.LJLJJI;
                    if (c252709vu4 != null) {
                        c252709vu4.setVisibility(0);
                    } else {
                        o.LJIJI("pageNavBar");
                        throw null;
                    }
                } else {
                    o.LJIJI("pageNavBar");
                    throw null;
                }
            } else {
                o.LJIJI("pageNavBar");
                throw null;
            }
        }
        this.LJLIL = GIA.LIZ(this.LJLJI, new GI6(this), null);
        this.LJLILLLLZI = GI9.LIZ(this.LJLJI, new GI7(this), null);
        SubscriptionPage subscriptionPage = this.LJLIL;
        if (subscriptionPage != null) {
            LLFII(subscriptionPage);
        }
    }
}
