package com.ss.android.ugc.aweme.adaptation.saa;

import X.AbstractC42651GoZ;
import X.C00F;
import X.C0I0;
import X.C0I4;
import X.C0ON;
import X.C142955jH;
import X.C16880lQ;
import X.C1B3;
import X.C40871j1;
import X.C42025GeT;
import X.C42326GjK;
import X.C42670Gos;
import X.C42671Got;
import X.C42672Gou;
import X.C42674Gow;
import X.C42680Gp2;
import X.C42691GpD;
import X.C5HC;
import X.C5OG;
import X.C60903NvH;
import X.C65803Ps7;
import X.C76800UCe;
import X.FFL;
import X.GB7;
import X.InterfaceC04050Dx;
import X.InterfaceC144185lG;
import X.InterfaceC163766bk;
import X.InterfaceC36571c5;
import X.InterfaceC40895G3f;
import X.InterfaceC42390GkM;
import X.InterfaceC42675Gox;
import X.InterfaceC42677Goz;
import X.InterfaceC45540Hu4;
import X.InterfaceC65784Pro;
import X.OHQ;
import X.OSZ;
import X.U1F;
import X.WM7;
import X.WMA;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelStore;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.scene.ktx.SceneExtensionsKt;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.performance.ICrashReportService;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS96S0300000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class SAAActivity extends GB7 implements InterfaceC163766bk, InterfaceC42677Goz, InterfaceC45540Hu4, InterfaceC04050Dx, InterfaceC40895G3f {
    public int LJLJJI;
    public C42691GpD LJLJJL;
    public NavigationScene LJLJJLL;
    public final Map<Integer, View> LJLJLLL = new LinkedHashMap();
    public final HashMap<String, Boolean> LJLILLLLZI = new HashMap<>();
    public volatile boolean LJLJI = true;
    public final C40871j1 LJLJL = new C40871j1(null);
    public final ICrashReportService LJLJLJ = AVExternalServiceImpl.LIZ().provideErrorReporter();

    @Override // X.InterfaceC163766bk
    public final void LJIJI() {
    }

    @Override // X.InterfaceC04050Dx
    public final void LJIJJ() {
        this.LJLJI = true;
    }

    @Override // X.InterfaceC40895G3f
    public final void LJJI() {
    }

    @Override // X.InterfaceC163766bk
    public final boolean LJL() {
        return false;
    }

    @Override // X.InterfaceC163766bk
    public final void LJLJL() {
    }

    @Override // X.InterfaceC04050Dx
    public final void LL() {
        this.LJLJI = false;
    }

    @Override // X.GB7, X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJLLL).clear();
    }

    @Override // X.GB7, X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJLLL;
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

    public final void LLFZ() {
        LLIIJLIL(new AqS157S0100000_7(this, 54));
        SmartRoute buildRoute = SmartRouter.buildRoute(this, "aweme://main");
        buildRoute.addFlags(268468224);
        buildRoute.open();
    }

    public final void LLII() {
        this.LJLJJI--;
    }

    public final AbstractC42651GoZ LLIIIILZ() {
        WM7 wm7;
        NavigationScene navigationScene = this.LJLJJLL;
        if (navigationScene != null) {
            wm7 = navigationScene.LLJJIII();
        } else {
            wm7 = null;
        }
        if (!(wm7 instanceof AbstractC42651GoZ)) {
            return null;
        }
        return (AbstractC42651GoZ) wm7;
    }

    public final void LLIIIZ() {
        this.LJLJJI++;
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity
    public final void finish() {
        LLIILII("finish", "Use TikTokSAARootGroupScene.finish instead.");
        super.finish();
        AbstractC42651GoZ LLIIIILZ = LLIIIILZ();
        if (LLIIIILZ != null) {
            U1F.LIZJ(this, LLIIIILZ.LLJJIII());
        }
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity
    public final Intent getIntent() {
        LLIILII("getIntent", "Use TikTokSAARootGroupScene.getArgumentsSafely instead.");
        return super.getIntent();
    }

    @Override // androidx.activity.ComponentActivity, X.C1AU, androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        LLIILII("getLifecycle", "use Scene.getLifecycle() instead");
        Lifecycle lifecycle = super.getLifecycle();
        o.LJIIIIZZ(lifecycle, "super.getLifecycle()");
        return lifecycle;
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.ViewModelStoreOwner
    public final ViewModelStore getViewModelStore() {
        LLIILII("getViewModelStore", "use SAAViewModelProviders instead");
        ViewModelStore viewModelStore = super.getViewModelStore();
        o.LJIIIIZZ(viewModelStore, "super.getViewModelStore()");
        return viewModelStore;
    }

    @Override // X.InterfaceC42677Goz
    public final boolean isRecording() {
        NavigationScene navigationScene = this.LJLJJLL;
        if (navigationScene != null) {
            for (InterfaceC36571c5 interfaceC36571c5 : navigationScene.getSceneList()) {
                if ((interfaceC36571c5 instanceof InterfaceC42677Goz) && ((InterfaceC42677Goz) interfaceC36571c5).isRecording()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        NavigationScene navigationScene = this.LJLJJLL;
        if (navigationScene != null && navigationScene.onBackPressed()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        C42691GpD c42691GpD = this.LJLJJL;
        if (c42691GpD != null) {
            c42691GpD.LJII();
        }
        super.onDestroy();
        this.LJLJLJ.setCustomTag("saa_page", "");
        for (Fragment fragment : getSupportFragmentManager().LJJJJLI()) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            C1B3 c1b3 = new C1B3(supportFragmentManager);
            c1b3.LJJI(fragment);
            c1b3.LJII();
        }
    }

    @Override // android.app.Activity
    public final void onEnterAnimationComplete() {
        super.onEnterAnimationComplete();
        AbstractC42651GoZ LLIIIILZ = LLIIIILZ();
        if (LLIIIILZ != null) {
            LLIIIILZ.LLJJJJ();
        }
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        C42691GpD c42691GpD = this.LJLJJL;
        if (c42691GpD != null) {
            c42691GpD.LIZJ();
        }
        super.onPause();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.adaptation.saa.SAAActivity", "onResume", true);
        super.onResume();
        C42691GpD c42691GpD = this.LJLJJL;
        if (c42691GpD != null) {
            c42691GpD.LIZLLL();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.adaptation.saa.SAAActivity", "onResume", false);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.adaptation.saa.SAAActivity", "onStart", true);
        super.onStart();
        C42691GpD c42691GpD = this.LJLJJL;
        if (c42691GpD != null) {
            c42691GpD.LJFF();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.adaptation.saa.SAAActivity", "onStart", false);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStop() {
        C65803Ps7.LJFF(this);
        C42691GpD c42691GpD = this.LJLJJL;
        if (c42691GpD != null) {
            c42691GpD.LJI();
        }
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

    public final void LLIIIJ(WM7 wm7) {
        InterfaceC42675Gox interfaceC42675Gox;
        NavigationScene navigationScene = this.LJLJJLL;
        if (navigationScene != null) {
            for (InterfaceC36571c5 interfaceC36571c5 : navigationScene.getSceneList()) {
                if (!o.LJ(interfaceC36571c5, wm7) && (interfaceC36571c5 instanceof InterfaceC42675Gox) && (interfaceC42675Gox = (InterfaceC42675Gox) interfaceC36571c5) != null) {
                    interfaceC42675Gox.aa();
                }
            }
        }
    }

    public final void LLIIJLIL(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LJLJI = false;
        interfaceC65784Pro.invoke();
        this.LJLJI = true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        AbstractC42651GoZ LLIIIILZ = LLIIIILZ();
        if (LLIIIILZ != null) {
            LLIIIILZ.LLJJ(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.adaptation.saa.SAAActivity", "onCreate", true);
        this.LJLJJI = 0;
        super.onCreate(bundle);
        if (!((Boolean) C42680Gp2.LIZ.getValue()).booleanValue()) {
            C0I0.LIZ(this).LIZIZ = true;
        }
        C42674Gow.LIZ.getClass();
        FFL.LJIIIZ().getClass();
        if (FFL.LJ(31744, "studio_enable_find_als_container_opti", true, false)) {
            C0I4.LIZ = false;
        }
        setContentView(R.layout.f3);
        Intent intent = getIntent();
        try {
            C42326GjK.LIZ.getClass();
            C42326GjK.LIZJ(this, intent, bundle);
            Bundle LLJJIJI = C16880lQ.LLJJIJI(getIntent());
            if (LLJJIJI == null) {
                LLFZ();
                ActivityAgent.onTrace("com.ss.android.ugc.aweme.adaptation.saa.SAAActivity", "onCreate", false);
                return;
            }
            InterfaceC42390GkM LJIL = C60903NvH.LJIIJJI().LJIL();
            String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "creative_saa_page");
            if (LLJJIJIIJIL == null) {
                LLJJIJIIJIL = "";
            }
            OSZ<NavigationScene, WMA<?>> LIZIZ = C42025GeT.LIZIZ(this, LJIL.LJ(LLJJIJIIJIL), LLJJIJI, R.id.ja3);
            NavigationScene first = LIZIZ.getFirst();
            WMA<?> second = LIZIZ.getSecond();
            this.LJLJJLL = first;
            C40871j1 c40871j1 = this.LJLJL;
            o.LJII(c40871j1, "null cannot be cast to non-null type com.bytedance.als.MutableLiveState<com.bytedance.scene.navigation.NavigationScene?>");
            c40871j1.LJI(first);
            NavigationScene navigationScene = this.LJLJJLL;
            if (navigationScene != null) {
                navigationScene.registerChildSceneLifecycleCallbacks(new C42671Got(this), true);
            }
            NavigationScene navigationScene2 = this.LJLJJLL;
            if (navigationScene2 != null) {
                navigationScene2.registerChildSceneLifecycleCallbacks(new C42670Gos(this), false);
            }
            C42691GpD c42691GpD = new C42691GpD(second);
            this.LJLJJL = c42691GpD;
            try {
                c42691GpD.LIZIZ(this, bundle);
                AbstractC42651GoZ LLIIIILZ = LLIIIILZ();
                if (LLIIIILZ != null) {
                    U1F.LJFF(this, LLIIIILZ.LLJJIJI());
                }
            } catch (OutOfMemoryError unused) {
                this.LJLJJI = 0;
                LLFZ();
                C142955jH.LIZ("OOM in SAAActivity onCreate");
            }
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.adaptation.saa.SAAActivity", "onCreate", false);
        } catch (Exception unused2) {
            intent.replaceExtras((Bundle) null);
            LLFZ();
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.adaptation.saa.SAAActivity", "onCreate", false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0018, code lost:
    
        if (r4 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if (r0 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
    
        r0 = new android.os.Bundle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        X.C42662Gok.LIZ(r3, r1, r0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        return;
     */
    @Override // X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onNewIntent(android.content.Intent r4) {
        /*
            r3 = this;
            super.onNewIntent(r4)
            X.GjK r0 = X.C42326GjK.LIZ
            r0.getClass()
            r2 = 0
            X.C42326GjK.LIZJ(r3, r4, r2)
            if (r4 == 0) goto L16
            java.lang.String r0 = "creative_saa_page"
            java.lang.String r1 = X.C16880lQ.LLJJIJIIJIL(r4, r0)
            if (r1 != 0) goto L1a
        L16:
            java.lang.String r1 = ""
            if (r4 == 0) goto L20
        L1a:
            android.os.Bundle r0 = X.C16880lQ.LLJJIJI(r4)
            if (r0 != 0) goto L25
        L20:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
        L25:
            X.C42662Gok.LIZ(r3, r1, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.adaptation.saa.SAAActivity.onNewIntent(android.content.Intent):void");
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        o.LJIIIZ(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.remove("android:fragments");
        outState.remove("android:support:fragments");
        C42691GpD c42691GpD = this.LJLJJL;
        if (c42691GpD != null) {
            c42691GpD.LJ(outState);
        }
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.adaptation.saa.SAAActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
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

    public final void LLIIJI(String str, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LJLILLLLZI.put(str, Boolean.FALSE);
        interfaceC65784Pro.invoke();
        this.LJLILLLLZI.put(str, Boolean.TRUE);
    }

    public final void LLIILII(String str, String str2) {
        if (!this.LJLJI) {
            return;
        }
        C42672Gou.LIZ.getClass();
        if (((List) C42672Gou.LIZIZ.getValue()).contains(str)) {
            if (!C5OG.LIZ() || this.LJLJJI <= 0) {
                return;
            }
            if (C00F.LIZ(31744, 1, "remind_when_invoke_forbidden_methods_in_scene_lifecycle_callback", true) != 1 || o.LJ(this.LJLILLLLZI.get(str), Boolean.FALSE)) {
                if (C00F.LIZ(31744, 1, "remind_when_invoke_forbidden_methods_in_scene_lifecycle_callback", true) == 2) {
                    o.LJ(this.LJLILLLLZI.get(str), Boolean.FALSE);
                    return;
                }
                return;
            }
            throw new RuntimeException(C0ON.LIZJ("Method ", str, " cannot be called directly. ", str2));
        }
        if (C00F.LIZ(31744, 1, "remind_when_invoke_forbidden_methods", true) != 1 || o.LJ(this.LJLILLLLZI.get(str), Boolean.FALSE)) {
            if (C00F.LIZ(31744, 1, "remind_when_invoke_forbidden_methods", true) == 2) {
                o.LJ(this.LJLILLLLZI.get(str), Boolean.FALSE);
                return;
            }
            return;
        }
        throw new RuntimeException(C0ON.LIZJ("Method ", str, " cannot be called directly. ", str2));
    }

    @Override // X.ActivityC86117Xqz, X.C29S, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        WM7 wm7;
        NavigationScene navigationScene = this.LJLJJLL;
        if (navigationScene != null) {
            wm7 = navigationScene.LLJJIII();
        } else {
            wm7 = null;
        }
        if (wm7 != null && SceneExtensionsKt.LIZ(wm7)) {
            return super.onKeyDown(i, keyEvent);
        }
        if ((wm7 instanceof AbstractC42651GoZ) && ((AbstractC42651GoZ) wm7).onKeyDown(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        o.LJIIIZ(outState, "outState");
        o.LJIIIZ(outPersistentState, "outPersistentState");
        LLIIJI("getLifecycle", new AqS96S0300000_7(this, outState, outPersistentState, 0));
    }

    @Override // X.GB7, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        AbstractC42651GoZ LLIIIILZ = LLIIIILZ();
        if (LLIIIILZ != null && LLIIIILZ.LLJJL(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
        AbstractC42651GoZ LLIIIILZ2 = LLIIIILZ();
        if (LLIIIILZ2 != null) {
            LLIIIILZ2.onActivityResult(i, i2, intent);
        }
    }

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity, X.C06Q
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] grantResults) {
        o.LJIIIZ(strArr, OHQ.LIZIZ);
        o.LJIIIZ(grantResults, "grantResults");
        super.onRequestPermissionsResult(i, strArr, grantResults);
        C60903NvH.LJIIJJI().LJJIII().getAlbumService().tryPreloadMediaAfterAlbumPermissionGranted(this);
    }
}
