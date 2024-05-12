package com.ss.android.ugc.aweme.commercialize.im;

import X.ActivityC86117Xqz;
import X.AnonymousClass446;
import X.C5H3;
import X.C65803Ps7;
import X.C68322mC;
import X.HG3;
import X.InterfaceC65784Pro;
import X.J9P;
import X.OVM;
import X.OVN;
import X.OVO;
import Y.IDgS139S0200000_10;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS160S0100000_10;

/* loaded from: classes11.dex */
public final class ChatCheckLoginActivity extends ActivityC86117Xqz {
    public static final /* synthetic */ int LJLJJL = 0;
    public final C5H3 LJLIL;
    public final C5H3 LJLILLLLZI;
    public final C5H3 LJLJI;
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.im.ChatCheckLoginActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public ChatCheckLoginActivity() {
        RouteArgExtension routeArgExtension = RouteArgExtension.INSTANCE;
        this.LJLIL = routeArgExtension.optionalArg(this, OVN.LJLIL, "extra_uid", String.class);
        this.LJLILLLLZI = routeArgExtension.optionalArg(this, OVM.LJLIL, "extra_ext", String.class);
        this.LJLJI = routeArgExtension.optionalArg(this, OVO.LJLIL, "extra_imadlog", AnonymousClass446.class);
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

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.internal.AqS160S0100000_10, T] */
    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.im.ChatCheckLoginActivity", "onCreate", true);
        super.onCreate(bundle);
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = new AqS160S0100000_10(this, 86);
        if (HG3.LJIILL().isLogin()) {
            ((InterfaceC65784Pro) c68322mC.element).invoke();
        } else {
            J9P.LIZIZ(this, "", "", null, new IDgS139S0200000_10(c68322mC, this, 0));
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.commercialize.im.ChatCheckLoginActivity", "onCreate", false);
    }
}
