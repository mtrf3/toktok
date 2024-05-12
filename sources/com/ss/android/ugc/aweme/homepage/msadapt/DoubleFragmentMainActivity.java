package com.ss.android.ugc.aweme.homepage.msadapt;

import X.AbstractC53892LDc;
import X.C16880lQ;
import X.C188787b0;
import X.C1B3;
import X.C1B6;
import X.C221108m2;
import X.C224498rV;
import X.C2L4;
import X.C55428LpA;
import X.C55429LpB;
import X.C55430LpC;
import X.C55431LpD;
import X.C55888Lwa;
import X.C58096Mr6;
import X.C62822Ol8;
import X.C65803Ps7;
import X.C76965UIn;
import X.C77095UNn;
import X.C77101UNt;
import X.C84193Sd;
import X.C8VV;
import X.EF7;
import X.F69;
import X.GHC;
import X.InterfaceC40004Fmy;
import X.InterfaceC54054LJi;
import X.InterfaceC54150LNa;
import X.InterfaceC55058LjC;
import X.InterfaceC55286Lms;
import X.InterfaceC55336Lng;
import X.JG5;
import X.LDX;
import X.LNH;
import X.MH4;
import X.QD3;
import X.X1D;
import X.YUJ;
import Y.AObserverS77S0100000_9;
import Y.ARunnableS28S0200000_9;
import Y.ARunnableS45S0100000_9;
import android.app.Application;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.hox.Hox;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformFragment;
import com.ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.main.assems.tabs.TabAbilityAssem;
import com.ss.android.ugc.aweme.main.spi.HomePageServiceImpl;
import com.ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import com.ss.android.ugc.aweme.music.service.MusicDetailService;
import com.ss.android.ugc.aweme.profile.ProfileServiceImpl;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.aweme.spi.IHomePageService;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS140S0200000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class DoubleFragmentMainActivity extends YUJ implements InterfaceC55058LjC, InterfaceC55286Lms, C2L4 {
    public static final /* synthetic */ int LJLLI = 0;
    public C77095UNn LJLJI;
    public InterfaceC40004Fmy LJLJJL;
    public Fragment LJLJJLL;
    public AmeBaseFragment LJLJL;
    public Fragment LJLJLJ;
    public int LJLJLLL;
    public final Map<Integer, View> LJLL = new LinkedHashMap();
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(C55430LpC.LJLIL);

    public final void LLFII() {
        Fragment LLII = LLII(false);
        if (LLII == null) {
            return;
        }
        if (TextUtils.equals(LLII.getTag(), "duo_detail")) {
            int i = this.LJLJLLL;
            int i2 = 1;
            if (1 <= i) {
                while (true) {
                    getSupportFragmentManager().LJJLIIIJJI();
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.LJLJLLL = 0;
            return;
        }
        getSupportFragmentManager().LJJLIIIJJI();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLL).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLL;
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

    @Override // X.InterfaceC55058LjC
    public final void onKeyBack() {
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.homepage.msadapt.DoubleFragmentMainActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.C34X
    public final void registerActivityOnKeyDownListener(GHC listener) {
        o.LJIIIZ(listener, "listener");
    }

    @Override // X.C34X
    public final void unRegisterActivityOnKeyDownListener(GHC listener) {
        o.LJIIIZ(listener, "listener");
    }

    public final Fragment LLFZ() {
        return (Fragment) this.LJLJJI.getValue();
    }

    @Override // X.InterfaceC55058LjC
    public final InterfaceC54150LNa getMainHelper() {
        return new C55431LpD();
    }

    @Override // X.C2L4
    public final List<Class<Object>> getScopeDefine() {
        return C76965UIn.LIZ(MainActivityScope.class);
    }

    @Override // X.InterfaceC55058LjC
    public final Fragment getCurFragment() {
        return LLFZ();
    }

    @Override // X.InterfaceC55058LjC
    public final String getEnterFrom() {
        boolean z;
        InterfaceC54054LJi LIZJ = MSAdaptionService.LJIIL().LIZJ(this);
        if (LIZJ != null && LIZJ.Oe()) {
            z = true;
        } else {
            z = false;
        }
        if (!z && LIZJ != null) {
            if (LIZJ.lj()) {
                return "homepage_follow";
            }
            if (LIZJ.oc()) {
                return "homepage_nearby";
            }
        }
        return "homepage_hot";
    }

    @Override // X.InterfaceC55286Lms
    public final InterfaceC55336Lng getHelper() {
        InterfaceC55336Lng obtainSwitchHelper = HomePageUIFrameServiceImpl.LIZ().obtainSwitchHelper(this, null, null);
        o.LJI(obtainSwitchHelper);
        return obtainSwitchHelper;
    }

    @Override // X.InterfaceC55058LjC
    public final boolean isDuoDualMode() {
        if (!C77101UNt.LJ(this)) {
            return false;
        }
        return C77101UNt.LJFF(this);
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        if (MSAdaptionService.LJIIL().LIZIZ(this)) {
            SmartRoute buildRoute = SmartRouter.buildRoute(this, "//duo");
            buildRoute.withParam("duo_type", "duo_back");
            buildRoute.open();
        }
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.homepage.msadapt.DoubleFragmentMainActivity", "onResume", true);
        super.onResume();
        if (!C77101UNt.LJFF(this)) {
            SmartRouter.buildRoute(this, "//main").open();
            finish();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.homepage.msadapt.DoubleFragmentMainActivity", "onResume", false);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.homepage.msadapt.DoubleFragmentMainActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.homepage.msadapt.DoubleFragmentMainActivity", "onStart", false);
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

    public final Fragment LLII(boolean z) {
        boolean z2;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        o.LJIIIIZZ(supportFragmentManager, "supportFragmentManager");
        List<Fragment> LJJJJLI = supportFragmentManager.LJJJJLI();
        o.LJIIIIZZ(LJJJJLI, "fragmentManager.fragments");
        for (Fragment fragment : LJJJJLI) {
            if (fragment != null && fragment.isVisible()) {
                if (TextUtils.equals(fragment.getTag(), "HOME") || TextUtils.equals(fragment.getTag(), "duo_detail")) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z) {
                    if (!z2) {
                        return fragment;
                    }
                } else if (z2) {
                    return fragment;
                }
            }
        }
        return null;
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        if (C77101UNt.LJ(this) && C77101UNt.LJFF(this) && getResources().getConfiguration().orientation == 1 && getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
            SmartRouter.buildRoute(this, "//main").open();
            finish();
        }
        if (!C77101UNt.LJFF(this) && getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
            SmartRouter.buildRoute(this, "//main").open();
            finish();
        }
    }

    @Override // X.YUJ, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        IHomePageService iHomePageService;
        View view;
        View view2;
        InterfaceC40004Fmy interfaceC40004Fmy;
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.homepage.msadapt.DoubleFragmentMainActivity", "onCreate", true);
        activityConfiguration(C55429LpB.LJLIL);
        super.onCreate(bundle);
        supportRequestWindowFeature(10);
        setContentView(R.layout.e1);
        Object LIZ = C58096Mr6.LIZ(IHomePageService.class, false);
        if (LIZ != null) {
            iHomePageService = (IHomePageService) LIZ;
        } else {
            if (C58096Mr6.G2 == null) {
                synchronized (IHomePageService.class) {
                    if (C58096Mr6.G2 == null) {
                        C58096Mr6.G2 = new HomePageServiceImpl();
                    }
                }
            }
            iHomePageService = C58096Mr6.G2;
        }
        TabAbilityAssem LIZ2 = iHomePageService.LIZ();
        AmeBaseFragment ameBaseFragment = null;
        if ((LIZ2 instanceof LDX) && LIZ2 != null) {
            LIZ2.LLLLZ(this);
        }
        C8VV.LIZIZ(this, new AqS140S0200000_9(this, LIZ2, 11));
        AbstractC53892LDc rootNode = HomePageUIFrameServiceImpl.LIZ().getRootNode(this);
        C188787b0 c188787b0 = Hox.LJLLI;
        Hox LIZ3 = c188787b0.LIZ(this);
        o.LJIIJ(rootNode, "rootNode");
        LIZ3.LJLIL = this;
        LIZ3.LJLILLLLZI = rootNode;
        ScrollSwitchStateManager LIZ4 = C84193Sd.LIZ(this);
        if (LIZ4 != null) {
            LIZ4.LJLIL.setValue(LIZ4.nv0("page_feed"));
            Bundle bundle2 = new Bundle();
            bundle2.putString("fromStart", "MainPage");
            c188787b0.LIZ(this).Cv0(bundle2, "HOME");
            this.LJLJJL = F69.LIZIZ.LIZ();
            if (getApplication() != null && (interfaceC40004Fmy = this.LJLJJL) != null) {
                Application application = getApplication();
                o.LJIIIIZZ(application, "application");
                interfaceC40004Fmy.LIZ(application);
            }
            LNH.LIZJ(this).observe(this, new AObserverS77S0100000_9(new C55428LpA(this), 24));
            C77095UNn c77095UNn = (C77095UNn) findViewById(R.id.cx0);
            this.LJLJI = c77095UNn;
            if (c77095UNn != null) {
                view = c77095UNn.findViewById(R.id.dd9);
            } else {
                view = null;
            }
            if (view != null) {
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("end   ");
                C77095UNn c77095UNn2 = this.LJLJI;
                if (c77095UNn2 != null) {
                    view2 = c77095UNn2.findViewById(R.id.dd9);
                } else {
                    view2 = null;
                }
                LIZ5.append(view2);
                X1D.LIZIZ(LIZ5);
                Fragment LLFZ = LLFZ();
                o.LJI(LLFZ);
                LLIIIILZ(R.id.dd9, LLFZ);
                MSAdaptionService.LJIIL().LIZ(LLFZ());
                this.LJLJJLL = MainServiceImpl.createIMainServicebyMonsterPlugin(false).obtainSecondTabFragment();
                Class LJIIL = C55888Lwa.LIZIZ.LJIIL();
                if (LJIIL != null) {
                    ameBaseFragment = (AmeBaseFragment) LJIIL.newInstance();
                }
                this.LJLJL = ameBaseFragment;
                Fragment obtainMyProfileFragment = ProfileServiceImpl.LIZ().obtainMyProfileFragment();
                o.LJI(obtainMyProfileFragment);
                this.LJLJLJ = obtainMyProfileFragment;
                FragmentManager supportFragmentManager = getSupportFragmentManager();
                C1B3 LIZ6 = C1B6.LIZ(supportFragmentManager, supportFragmentManager);
                Fragment fragment = this.LJLJJLL;
                o.LJI(fragment);
                LIZ6.LJIIIIZZ(R.id.dda, 1, fragment, "DISCOVER");
                AmeBaseFragment ameBaseFragment2 = this.LJLJL;
                o.LJI(ameBaseFragment2);
                LIZ6.LJIIIIZZ(R.id.dda, 1, ameBaseFragment2, "NOTIFICATION");
                Fragment fragment2 = this.LJLJLJ;
                o.LJI(fragment2);
                LIZ6.LJIIIIZZ(R.id.dda, 1, fragment2, "USER");
                Fragment fragment3 = this.LJLJJLL;
                o.LJI(fragment3);
                LIZ6.LJIIL(fragment3);
                AmeBaseFragment ameBaseFragment3 = this.LJLJL;
                o.LJI(ameBaseFragment3);
                LIZ6.LJIIIZ(ameBaseFragment3);
                Fragment fragment4 = this.LJLJLJ;
                o.LJI(fragment4);
                LIZ6.LJIIIZ(fragment4);
                LIZ6.LJIILJJIL();
            } else if (LLFZ() != null) {
                LLIIIILZ(R.id.dda, LLFZ());
            }
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.homepage.msadapt.DoubleFragmentMainActivity", "onCreate", false);
            return;
        }
        o.LJIJI("stateManager");
        throw null;
    }

    @Override // X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        String str;
        boolean equals;
        super.onNewIntent(intent);
        setIntent(intent);
        Fragment fragment = null;
        r4 = null;
        r4 = null;
        r4 = null;
        Fragment fragment2 = null;
        String str2 = null;
        if (intent != null) {
            str = C16880lQ.LLJJIJIIJIL(intent, "duo_type");
        } else {
            str = null;
        }
        Fragment LLII = LLII(false);
        if (LLII == null) {
            equals = false;
        } else {
            equals = TextUtils.equals(LLII.getTag(), "duo_detail");
        }
        boolean z = !TextUtils.equals("duo_back", str);
        if (TextUtils.equals(str, "duo_detail") || (z && equals)) {
            this.LJLJLLL++;
        }
        if (intent != null) {
            C16880lQ.LLJJIJIIJIL(intent, "duo_type");
            String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "duo_type");
            if (LLJJIJIIJIL == null) {
                return;
            }
            switch (LLJJIJIIJIL.hashCode()) {
                case -2080291192:
                    if (!LLJJIJIIJIL.equals("duo_back")) {
                        return;
                    }
                    LLFII();
                    return;
                case -1938590286:
                    if (!LLJJIJIIJIL.equals("duo_detail")) {
                        return;
                    }
                    if (MSAdaptionService.LJIIL().LIZLLL(EF7.LIZIZ())) {
                        fragment = JG5.LIZ().LJI(this);
                    }
                    LLIIIJ(fragment, "duo_detail", false);
                    return;
                case -1833904024:
                    if (!LLJJIJIIJIL.equals("duo_profile")) {
                        return;
                    }
                    Fragment LLII2 = LLII(true);
                    if (LLII2 != null) {
                        str2 = LLII2.getTag();
                    }
                    if (TextUtils.equals(str2, "duo_profile")) {
                        return;
                    }
                    Fragment obtainUserProfileFragment = ProfileServiceImpl.LIZ().obtainUserProfileFragment();
                    Aweme LIZIZ = LNH.LIZIZ(this);
                    LLIIIJ(obtainUserProfileFragment, "duo_profile", true);
                    new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS28S0200000_9(LIZIZ, obtainUserProfileFragment, 14), 1000L);
                    return;
                case -300053832:
                    if (!LLJJIJIIJIL.equals("duo_webview")) {
                        return;
                    }
                    CrossPlatformFragment crossPlatformFragment = new CrossPlatformFragment();
                    ARunnableS45S0100000_9 aRunnableS45S0100000_9 = new ARunnableS45S0100000_9(this, 51);
                    crossPlatformFragment.LJLJI = aRunnableS45S0100000_9;
                    MixActivityContainer mixActivityContainer = crossPlatformFragment.LJLIL;
                    if (mixActivityContainer != null) {
                        mixActivityContainer.LJLJLLL = aRunnableS45S0100000_9;
                    }
                    crossPlatformFragment.setArguments(C16880lQ.LLJJIJI(getIntent()));
                    LLIIIJ(crossPlatformFragment, "duo_webview", true);
                    return;
                case -30215092:
                    if (!LLJJIJIIJIL.equals("duo_music_detail")) {
                        return;
                    }
                    LLIIIJ(MusicDetailService.LJIJJ().LJIIIIZZ(getIntent()), "duo_music_detail", true);
                    return;
                case 962860898:
                    if (!LLJJIJIIJIL.equals("duo_challenge")) {
                        return;
                    }
                    LLIIIJ(MH4.LIZJ.LIZ(getIntent()), "duo_challenge", true);
                    return;
                case 971786005:
                    if (!LLJJIJIIJIL.equals("duo_bottom_click")) {
                        return;
                    }
                    String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(intent, "duo_clicked_tab_name");
                    if (LLJJIJIIJIL2 == null) {
                        LLJJIJIIJIL2 = "";
                    }
                    if (TextUtils.equals(LLJJIJIIJIL2, "PUBLISH")) {
                        C16880lQ.LLZILL(Toast.makeText(this, getString(R.string.f1i), 0));
                        return;
                    }
                    if (TextUtils.equals(LLJJIJIIJIL2, "HOME")) {
                        return;
                    }
                    int hashCode = LLJJIJIIJIL2.hashCode();
                    if (hashCode != -1382453013) {
                        if (hashCode != 2614219) {
                            if (hashCode == 1055811561 && LLJJIJIIJIL2.equals("DISCOVER")) {
                                fragment2 = this.LJLJJLL;
                            }
                        } else if (LLJJIJIIJIL2.equals("USER")) {
                            fragment2 = this.LJLJLJ;
                        }
                    } else if (LLJJIJIIJIL2.equals("NOTIFICATION")) {
                        fragment2 = this.LJLJL;
                    }
                    LLIIIJ(fragment2, LLJJIJIIJIL2, true);
                    return;
                default:
                    return;
            }
        }
    }

    @QD3
    public final void onScrollToProfileEvent(C224498rV c224498rV) {
        if (MSAdaptionService.LJIIL().LIZIZ(this)) {
            SmartRoute buildRoute = SmartRouter.buildRoute(this, "//duo");
            buildRoute.withParam("duo_type", "duo_profile");
            buildRoute.open();
        }
    }

    public final void LLIIIILZ(int i, Fragment fragment) {
        if (this.LJLJI != null && findViewById(i) != null && fragment != null) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            C1B3 c1b3 = new C1B3(supportFragmentManager);
            c1b3.LJIIJ(fragment, "HOME", i);
            c1b3.LJI();
        }
    }

    public final void LLIIIJ(Fragment fragment, String str, boolean z) {
        int i;
        if (fragment == null) {
            return;
        }
        if (z) {
            i = R.id.dda;
        } else {
            i = R.id.dd9;
        }
        Fragment LLII = LLII(z);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C1B3 LIZ = C1B6.LIZ(supportFragmentManager, supportFragmentManager);
        if (LLII != null) {
            LIZ.LJIIIZ(LLII);
        }
        if (o.LJ(str, "DISCOVER") || o.LJ(str, "NOTIFICATION") || o.LJ(str, "USER")) {
            LIZ.LJIIL(fragment);
        } else {
            LIZ.LJIIIIZZ(i, 1, fragment, str);
        }
        LIZ.LJ(null);
        LIZ.LJIILJJIL();
    }
}
