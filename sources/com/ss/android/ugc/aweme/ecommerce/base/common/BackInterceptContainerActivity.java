package com.ss.android.ugc.aweme.ecommerce.base.common;

import X.C65803Ps7;
import X.C78983UzD;
import X.InterfaceC60061Nhh;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.bullet.BulletContainerActivity;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class BackInterceptContainerActivity extends BulletContainerActivity implements InterfaceC60061Nhh {
    public String LLIIJLIL;
    public final Map<Integer, View> LLIIL = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.bullet.BulletContainerActivity, X.AbstractActivityC60177NjZ
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLIIL;
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

    @Override // com.ss.android.ugc.aweme.bullet.BulletContainerActivity, X.AbstractActivityC60177NjZ, X.AbstractActivityC60886Nv0, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // com.ss.android.ugc.aweme.bullet.BulletContainerActivity, X.AbstractActivityC60177NjZ, X.AbstractActivityC60886Nv0, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
    }

    @Override // com.ss.android.ugc.aweme.bullet.BulletContainerActivity, X.AbstractActivityC60177NjZ, X.AbstractActivityC60886Nv0, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // com.ss.android.ugc.aweme.bullet.BulletContainerActivity, X.AbstractActivityC60177NjZ, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.common.BackInterceptContainerActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.ss.android.ugc.aweme.bullet.BulletContainerActivity, X.AbstractActivityC60177NjZ, android.app.Activity
    public final void finish() {
        super.finish();
        String str = this.LLIIJLIL;
        if (str != null && str.length() > 0) {
            SmartRouter.buildRoute(this, str).open();
        }
    }

    @Override // com.ss.android.ugc.aweme.bullet.BulletContainerActivity, X.AbstractActivityC60177NjZ, X.AbstractActivityC60886Nv0, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
        EventCenter.LJ().LIZIZ("ec_hybrid_container_intercept_back", this);
    }

    @Override // com.ss.android.ugc.aweme.bullet.BulletContainerActivity, X.AbstractActivityC60177NjZ, X.AbstractActivityC60886Nv0, X.C29S, X.ActivityC45651qj, android.app.Activity
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

    @Override // com.ss.android.ugc.aweme.bullet.BulletContainerActivity, X.AbstractActivityC60177NjZ, X.AbstractActivityC60886Nv0, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.common.BackInterceptContainerActivity", "onCreate", true);
        super.onCreate(bundle);
        Uri data = getIntent().getData();
        if (data != null) {
            str = UriProtector.getQueryParameter(data, "back_open_url");
        } else {
            str = null;
        }
        this.LLIIJLIL = str;
        EventCenter.LJ().LIZJ("ec_hybrid_container_intercept_back", this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.common.BackInterceptContainerActivity", "onCreate", false);
    }

    @Override // X.InterfaceC60061Nhh
    public final void onEvent(String eventName, String str) {
        o.LJIIIZ(eventName, "eventName");
        if (o.LJ("ec_hybrid_container_intercept_back", eventName) && str.length() > 0) {
            try {
                if (o.LJ(LLFII().getReactId(), new JSONObject(str).optString("react_id"))) {
                    this.LLIIJLIL = new JSONObject(str).optString("back_open_url");
                }
            } catch (Throwable th) {
                C78983UzD.LJIIZILJ(th);
            }
        }
    }
}
