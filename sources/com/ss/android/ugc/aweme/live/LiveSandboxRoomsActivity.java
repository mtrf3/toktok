package com.ss.android.ugc.aweme.live;

import X.ActivityC86117Xqz;
import X.BHA;
import X.C16880lQ;
import X.C1B3;
import X.C25956AGq;
import X.C38891fp;
import X.C65803Ps7;
import X.CGG;
import X.CN1;
import X.FMX;
import X.G3V;
import X.InterfaceC31194CMc;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.livesdk.comp.api.debug.IDebugService;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes7.dex */
public class LiveSandboxRoomsActivity extends ActivityC86117Xqz {
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveSandboxRoomsActivity", "onWindowFocusChanged", true);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveSandboxRoomsActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.box);
        try {
            Constructor<?> constructor = Class.forName("com.bytedance.android.livesdk.gift.debugservice.DebugToolInitServiceManager").getConstructor(Context.class, CGG.class);
            Object[] objArr = new Object[2];
            Context applicationContext = getApplicationContext();
            if (C38891fp.LJLJI && applicationContext == null) {
                applicationContext = C38891fp.LJLILLLLZI;
            }
            objArr[0] = applicationContext;
            objArr[1] = CGG.AUDIENCE;
            InterfaceC31194CMc interfaceC31194CMc = (InterfaceC31194CMc) constructor.newInstance(objArr);
            if (interfaceC31194CMc != null) {
                IDebugService iDebugService = (IDebugService) CN1.LIZ(IDebugService.class);
                Context applicationContext2 = getApplicationContext();
                if (C38891fp.LJLJI && applicationContext2 == null) {
                    applicationContext2 = C38891fp.LJLILLLLZI;
                }
                iDebugService.vl0(interfaceC31194CMc, applicationContext2, BHA.LIZ(ViewModelProviders.of(this), this));
                FMX.LJIIL("livesdk_gift_debug_tools_launch", new C25956AGq());
                FMX.LJIIL("livesdk_gift_debug_tools_fun_click", new G3V());
                Fragment LJIILIIL = interfaceC31194CMc.LJIILIIL();
                FragmentManager supportFragmentManager = getSupportFragmentManager();
                supportFragmentManager.getClass();
                C1B3 c1b3 = new C1B3(supportFragmentManager);
                c1b3.LIZIZ(R.id.dm7, LJIILIIL);
                c1b3.LJIILJJIL();
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            C16880lQ.LLLLIIL(e);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveSandboxRoomsActivity", "onCreate", false);
    }
}
