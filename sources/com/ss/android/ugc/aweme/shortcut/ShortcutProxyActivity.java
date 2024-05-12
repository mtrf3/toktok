package com.ss.android.ugc.aweme.shortcut;

import X.ActivityC86117Xqz;
import X.C16880lQ;
import X.C188727au;
import X.C40373Fsv;
import X.C59593Na9;
import X.C65803Ps7;
import X.C78598Ut0;
import X.FMX;
import X.LV0;
import X.N2B;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouteSet;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ShortcutProxyActivity extends ActivityC86117Xqz {
    public static final C59593Na9 Companion = new C59593Na9();
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();

    @Override // X.ActivityC86117Xqz, X.KMV
    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public void com_ss_android_ugc_aweme_shortcut_ShortcutProxyActivity__onStop$___twin___() {
        super.onStop();
    }

    @Override // X.KMV, X.JBS
    public /* bridge */ /* synthetic */ void onBeforeActivityCreated(Activity activity) {
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public void onStop() {
        C65803Ps7.LJFF(this);
        com_ss_android_ugc_aweme_shortcut_ShortcutProxyActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop(this);
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortcut.ShortcutProxyActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    private final void openShootingPage() {
        SmartRouteSet buildRoute = SmartRouteSet.Companion.buildRoute(this);
        SmartRoute buildRoute2 = SmartRouter.buildRoute(this, "//main");
        o.LJIIIIZZ(buildRoute2, "buildRoute(this, \"//main\")");
        buildRoute.addRoute(buildRoute2);
        SmartRoute buildRoute3 = SmartRouter.buildRoute(this, "//shortcut/shooting");
        o.LJIIIIZZ(buildRoute3, "buildRoute(this, \"//shortcut/shooting\")");
        buildRoute.addRoute(buildRoute3);
        buildRoute.open();
    }

    private final void openMoneyGrowthPage() {
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "open_url");
        LV0 lv0 = LV0.LJII;
        o.LJI(LLJJIJIIJIL);
        lv0.getClass();
        LV0.LIZLLL(this, LLJJIJIIJIL);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "feed_popup");
        FMX.LJIIL("enter_activity_page", c188727au.LIZ);
    }

    public static void com_ss_android_ugc_aweme_shortcut_ShortcutProxyActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(ShortcutProxyActivity shortcutProxyActivity) {
        shortcutProxyActivity.com_ss_android_ugc_aweme_shortcut_ShortcutProxyActivity__onStop$___twin___();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                shortcutProxyActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
    }

    public static void com_ss_android_ugc_aweme_shortcut_ShortcutProxyActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop(ShortcutProxyActivity shortcutProxyActivity) {
        com_ss_android_ugc_aweme_shortcut_ShortcutProxyActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(shortcutProxyActivity);
        try {
            shortcutProxyActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable unused) {
        }
    }

    private final boolean needBlock(boolean z) {
        Class<?> LIZLLL;
        if (z || (LIZLLL = TiktokShortcutManager.LJIIJ().LIZLLL()) == null) {
            return false;
        }
        Intent intent = new Intent(this, LIZLLL);
        intent.putExtra("type", C16880lQ.LLJJIJIIJIL(getIntent(), "type"));
        intent.putExtra("open_url", C16880lQ.LLJJIJIIJIL(getIntent(), "open_url"));
        C78598Ut0.LJIJJ(intent, this);
        startActivity(intent);
        return true;
    }

    private final void openNormalPage(String str) {
        SmartRouter.buildRoute(this, str).open();
    }

    private final void openPage(String str) {
        if (o.LJ(str, N2B.WILL_GET_MOST.getShortcutId())) {
            openMoneyGrowthPage();
            return;
        }
        if (o.LJ(str, N2B.WITHDRAWAL.getShortcutId())) {
            openMoneyGrowthPage();
        } else if (o.LJ(str, N2B.NOTIFICATION.getShortcutId())) {
            openNormalPage("//shortcut/message");
        } else {
            if (!o.LJ(str, N2B.SHOOTING.getShortcutId())) {
                return;
            }
            openShootingPage();
        }
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortcut.ShortcutProxyActivity", "onCreate", true);
        super.onCreate(bundle);
        boolean booleanExtra = getIntent().getBooleanExtra("from_live_block_dialog", false);
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "type");
        if (LLJJIJIIJIL == null) {
            LLJJIJIIJIL = "";
        }
        if (!booleanExtra) {
            C40373Fsv.LIZ(LLJJIJIIJIL);
        }
        if (needBlock(booleanExtra)) {
            finish();
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortcut.ShortcutProxyActivity", "onCreate", false);
        } else {
            openPage(LLJJIJIIJIL);
            finish();
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortcut.ShortcutProxyActivity", "onCreate", false);
        }
    }
}
