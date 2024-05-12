package com.ss.android.ugc.aweme.image.ui;

import X.AbstractActivityC162676Zz;
import X.C163846bs;
import X.C16880lQ;
import X.C42326GjK;
import X.C5HC;
import X.C65803Ps7;
import X.HEP;
import X.HXO;
import X.InterfaceC144185lG;
import X.InterfaceC163766bk;
import X.InterfaceC45540Hu4;
import X.InterfaceC80245VeT;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.image.ui.ImageEditActivity;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class ImageEditActivity extends AbstractActivityC162676Zz implements InterfaceC45540Hu4, InterfaceC163766bk {
    public static final /* synthetic */ int LJLLILLLL = 0;
    public ImageEditRootScene LJLJLLL;
    public HXO LJLL;
    public final Map<Integer, View> LJLLI = new LinkedHashMap();

    @Override // X.InterfaceC163766bk
    public final void LJIJI() {
    }

    @Override // X.InterfaceC163766bk
    public final void LJLJL() {
    }

    @Override // X.AbstractActivityC162676Zz
    public final void LLIIIZ(boolean z) {
    }

    @Override // X.AbstractActivityC162676Zz
    public final void LLIIJLIL(boolean z) {
    }

    @Override // X.GBO, X.GB7, X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLI).clear();
    }

    @Override // X.GBO, X.GB7, X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLI;
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

    @Override // X.AbstractActivityC162676Zz, X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
    }

    @Override // X.AbstractActivityC162676Zz, X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.image.ui.ImageEditActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final ImageEditRootScene LLILIL() {
        ImageEditRootScene imageEditRootScene = this.LJLJLLL;
        if (imageEditRootScene != null) {
            return imageEditRootScene;
        }
        o.LJIJI("rootScene");
        throw null;
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        HXO hxo = this.LJLL;
        if (hxo != null) {
            if (!hxo.onBackPressed() && !LLILIL().onBackPressed()) {
                super.onBackPressed();
                return;
            }
            return;
        }
        o.LJIJI("sceneDelegate");
        throw null;
    }

    @Override // X.InterfaceC163766bk
    public final boolean LJL() {
        return !C163846bs.LIZ();
    }

    @Override // X.AbstractActivityC162676Zz
    public final void LLIIJI() {
        LLILIL().LJIJI();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // X.AbstractActivityC162676Zz, X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
        C42326GjK.LIZ.getClass();
        C42326GjK.LIZ(this);
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

    @Override // X.AbstractActivityC162676Zz, X.GBO, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.image.ui.ImageEditActivity", "onCreate", true);
        if (!C163846bs.LIZ()) {
            try {
                C42326GjK c42326GjK = C42326GjK.LIZ;
                Intent intent = getIntent();
                c42326GjK.getClass();
                C42326GjK.LIZJ(this, intent, bundle);
                super.onCreate(bundle);
                setContentView(R.layout.ew);
                this.LJLJLLL = new ImageEditRootScene();
                Bundle LLJJIJI = C16880lQ.LLJJIJI(getIntent());
                if (LLJJIJI != null) {
                    LLILIL().mArguments = LLJJIJI;
                }
                HEP hep = new HEP(this, ImageEditRootScene.class);
                hep.LJFF = R.id.dd8;
                hep.LJII = new InterfaceC80245VeT() { // from class: X.6bi
                    @Override // X.InterfaceC80245VeT
                    public final WM7 LIZ(ClassLoader classLoader, String str) {
                        o.LJIIIZ(classLoader, "<anonymous parameter 0>");
                        o.LJIIIZ(str, "<anonymous parameter 1>");
                        return ImageEditActivity.this.LLILIL();
                    }
                };
                hep.LJI = false;
                this.LJLL = hep.LIZ();
                ActivityAgent.onTrace("com.ss.android.ugc.aweme.image.ui.ImageEditActivity", "onCreate", false);
                return;
            } catch (Exception unused) {
                super.onCreate(null);
                getIntent().replaceExtras((Bundle) null);
                finish();
                SmartRoute buildRoute = SmartRouter.buildRoute(this, "aweme://main");
                buildRoute.addFlags(268468224);
                buildRoute.open();
                ActivityAgent.onTrace("com.ss.android.ugc.aweme.image.ui.ImageEditActivity", "onCreate", false);
                return;
            }
        }
        RuntimeException runtimeException = new RuntimeException("should not start ImageEditActivity when merge_photo_mode_to_single_activity AB value is true");
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.image.ui.ImageEditActivity", "onCreate", false);
        throw runtimeException;
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        o.LJIIIZ(outState, "outState");
        super.onSaveInstanceState(outState);
        C42326GjK c42326GjK = C42326GjK.LIZ;
        getIntent();
        c42326GjK.getClass();
        C42326GjK.LJI(this, outState);
    }

    @Override // X.InterfaceC45540Hu4
    public final void registerActivityOnKeyDownListener(C5HC listener) {
        o.LJIIIZ(listener, "listener");
        throw new RuntimeException("implement in TikTokSAARootGroupScene");
    }

    @Override // X.InterfaceC45540Hu4
    public final void registerActivityOnKeyDownListenerHead(C5HC listener) {
        o.LJIIIZ(listener, "listener");
        throw new RuntimeException("implement in TikTokSAARootGroupScene");
    }

    @Override // X.InterfaceC45540Hu4
    public final void registerActivityResultListener(InterfaceC144185lG listener) {
        o.LJIIIZ(listener, "listener");
        throw new RuntimeException("implement in TikTokSAARootGroupScene");
    }

    @Override // X.InterfaceC45540Hu4
    public final void unRegisterActivityOnKeyDownListener(C5HC listener) {
        o.LJIIIZ(listener, "listener");
        throw new RuntimeException("implement in TikTokSAARootGroupScene");
    }

    @Override // X.InterfaceC45540Hu4
    public final void unRegisterActivityResultListener(InterfaceC144185lG listener) {
        o.LJIIIZ(listener, "listener");
        throw new RuntimeException("implement in TikTokSAARootGroupScene");
    }

    @Override // X.AbstractActivityC162676Zz
    public final void LLIL(int i, int i2) {
        LLILIL().LLLFZ(i, i2);
    }

    @Override // X.GB7, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        LLILIL().onActivityResult(i, i2, intent);
    }
}
