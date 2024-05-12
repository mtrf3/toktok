package com.ss.android.ugc.aweme.live;

import X.C1B3;
import X.C5H3;
import X.C65803Ps7;
import X.InterfaceC27469AqH;
import X.InterfaceC36571c5;
import X.InterfaceC86394XvS;
import X.O6U;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveGameDualDeviceSourceSetting;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public final class LiveGameDualDeviceActivity extends O6U {
    public final Map<Integer, View> LJLILLLLZI = new LinkedHashMap();
    public final C5H3 LJLIL = RouteArgExtension.INSTANCE.navArg(this);

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

    @Override // X.O6U, X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.O6U, X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveGameDualDeviceActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        InterfaceC36571c5 LJJJI = getSupportFragmentManager().LJJJI(R.id.dm7);
        if ((LJJJI instanceof InterfaceC27469AqH) && !((InterfaceC27469AqH) LJJJI).onBackPressed()) {
            super.onBackPressed();
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

    @Override // X.O6U, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveGameDualDeviceActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.bos);
        if (!LiveGameDualDeviceSourceSetting.INSTANCE.enable()) {
            finish();
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveGameDualDeviceActivity", "onCreate", false);
            return;
        }
        Window window = getWindow();
        if (window != null) {
            window.addFlags(128);
        }
        LiveGameDualDeviceActivityArgs liveGameDualDeviceActivityArgs = (LiveGameDualDeviceActivityArgs) this.LJLIL.getValue();
        if (liveGameDualDeviceActivityArgs != null) {
            InterfaceC86394XvS service = Live.getService();
            String sourceIp = liveGameDualDeviceActivityArgs.getSourceIp();
            Fragment LJIIL = service.LJIIL(liveGameDualDeviceActivityArgs.getSourcePort(), liveGameDualDeviceActivityArgs.getVideoWidth(), liveGameDualDeviceActivityArgs.getVideoHeight(), liveGameDualDeviceActivityArgs.getVersion(), sourceIp, liveGameDualDeviceActivityArgs.getRoomId());
            if (LJIIL != null) {
                FragmentManager supportFragmentManager = getSupportFragmentManager();
                supportFragmentManager.getClass();
                C1B3 c1b3 = new C1B3(supportFragmentManager);
                c1b3.LJIIJ(LJIIL, null, R.id.dm7);
                c1b3.LJI();
            } else {
                finish();
                ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveGameDualDeviceActivity", "onCreate", false);
                return;
            }
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveGameDualDeviceActivity", "onCreate", false);
    }
}
