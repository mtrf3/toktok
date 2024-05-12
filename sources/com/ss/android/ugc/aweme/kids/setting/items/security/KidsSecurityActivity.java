package com.ss.android.ugc.aweme.kids.setting.items.security;

import X.AEY;
import X.AI8;
import X.AI9;
import X.ActivityC86117Xqz;
import X.C235119Kp;
import X.C251689uG;
import X.C252709vu;
import X.C65803Ps7;
import X.C78840Uwu;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.kids.api.account.IKidsAccountService;
import com.ss.android.ugc.aweme.kids.intergration.account.KidsAccountServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class KidsSecurityActivity extends ActivityC86117Xqz {
    public final Map<Integer, View> LJLILLLLZI = new LinkedHashMap();
    public final IKidsAccountService LJLIL = KidsAccountServiceImpl.LJIIIIZZ();

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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.items.security.KidsSecurityActivity", "onWindowFocusChanged", true);
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

    public final void LLFII(boolean z) {
        IKidsAccountService loginService = this.LJLIL;
        o.LJIIIIZZ(loginService, "loginService");
        loginService.updateAllowOneKeyLoginInfo(z, true);
        AI9 accessory = ((AI8) _$_findCachedViewById(R.id.jar)).getAccessory();
        o.LJII(accessory, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.Switch");
        ((AEY) accessory).LJIILIIL(z);
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.items.security.KidsSecurityActivity", "onCreate", true);
        activityConfiguration(C251689uG.LJLIL);
        super.onCreate(bundle);
        setContentView(R.layout.bf8);
        boolean LJI = this.LJLIL.LJI();
        _$_findCachedViewById(R.id.jar).setVisibility(0);
        AI9 accessory = ((AI8) _$_findCachedViewById(R.id.jar)).getAccessory();
        o.LJII(accessory, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.Switch");
        ((AEY) accessory).LJIILIIL(LJI);
        ((AI8) _$_findCachedViewById(R.id.jar)).setOnClickListener(new AqS170S0100000_4(this, 1559));
        C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.la4);
        C235119Kp c235119Kp = new C235119Kp();
        String string = getString(R.string.qws);
        o.LJIIIIZZ(string, "getString(R.string.setting_security)");
        C78840Uwu.LJJIL(c235119Kp, string, this);
        c252709vu.setNavActions(c235119Kp);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.items.security.KidsSecurityActivity", "onCreate", false);
    }
}
