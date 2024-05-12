package com.ss.android.ugc.aweme.utils;

import X.ActivityC86117Xqz;
import X.C16880lQ;
import X.C197457oz;
import X.C65803Ps7;
import X.MAD;
import X.MCT;
import X.X1D;
import X.Z89;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes10.dex */
public final class AppWidgetLinkProxyActivity extends ActivityC86117Xqz {
    public static final /* synthetic */ int LJLJJLL = 0;
    public boolean LJLJI;
    public SmartRoute LJLJJI;
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();
    public String LJLIL = "";
    public String LJLILLLLZI = "";

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

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.utils.AppWidgetLinkProxyActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.utils.AppWidgetLinkProxyActivity", "onResume", true);
        super.onResume();
        SmartRoute smartRoute = this.LJLJJI;
        if (smartRoute != null) {
            smartRoute.open();
            this.LJLJJI = null;
        }
        finish();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.utils.AppWidgetLinkProxyActivity", "onResume", false);
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
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("openDefaultCamera: ");
        LIZ.append(str);
        MCT.LIZ("AppWidgetLinkProxyActivity", X1D.LIZIZ(LIZ));
        SmartRoute buildRoute = SmartRouter.buildRoute(this, "aweme://openShoot");
        buildRoute.withParam("enter_from", this.LJLIL);
        buildRoute.withParam("enter_method", this.LJLILLLLZI);
        buildRoute.open();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ba, code lost:
    
        if (r8 != null) goto L32;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:54:0x00dc. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e3  */
    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r37) {
        /*
            Method dump skipped, instructions count: 1850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.AppWidgetLinkProxyActivity.onCreate(android.os.Bundle):void");
    }

    public final void LLFZ(MAD mad, Serializable serializable) {
        Z89 z89 = Z89.LIZIZ;
        Bundle bundle = new Bundle();
        bundle.putString("now_post_item_id_list", C16880lQ.LLJJIJIIJIL(getIntent(), "extra_aweme_id"));
        bundle.putBoolean("is_from_widget", true);
        bundle.putString("enter_method", this.LJLILLLLZI);
        if (mad != null) {
            bundle.putInt("extra_now_proxy_action_type", mad.getValue());
            bundle.putSerializable("extra_now_proxy_action_param", serializable);
        }
        C197457oz.LIZ(z89, this, bundle, true, 8);
    }
}
