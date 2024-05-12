package com.ss.android.ugc.aweme.ad.feed.shakeEgg;

import X.ActivityC45651qj;
import X.C03880Dg;
import X.C141335gf;
import X.C16880lQ;
import X.C1B3;
import X.C221108m2;
import X.C29S;
import X.C37A;
import X.C39187FZn;
import X.C39188FZo;
import X.C39519Ff9;
import X.C3C5;
import X.C42625Go9;
import X.C4NV;
import X.C55511LqV;
import X.C58653N0f;
import X.C58909NAb;
import X.C62822Ol8;
import X.C65300Pk0;
import X.C76800UCe;
import X.C78857UxB;
import X.C78862UxG;
import X.C9CL;
import X.InterfaceC36571c5;
import X.InterfaceC55508LqS;
import X.NH3;
import X.NHO;
import X.NLL;
import X.NLM;
import X.NMA;
import X.NMO;
import X.NMS;
import X.O3U;
import X.Q0C;
import X.QD3;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import Y.AObserverS78S0100000_10;
import Y.ARunnableS46S0100000_10;
import Y.ARunnableS9S0210000_10;
import android.app.Dialog;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.hox.Hox;
import com.bytedance.ies.ugc.aweme.commercialize.splash.report.ITopViewAdEventLogger;
import com.bytedance.ies.ugc.aweme.commercialize.splash.report.TopViewAdEventLogger;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.commercialize.model.ShakeModel;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformFragment;
import com.ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.web.experiment.CommerceWebCrossToSparkExt;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.AqS33S1000000_10;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes11.dex */
public final class ShakeEgg implements GenericLifecycleObserver, InterfaceC55508LqS, SensorEventListener {
    public static final /* synthetic */ int LLFFF = 0;
    public final ActivityC45651qj LJLIL;
    public ShakeEggVM LJLILLLLZI;
    public Hox LJLJI;
    public final List<String> LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public int LJLL;
    public final C62822Ol8 LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LJLLL;
    public Fragment LJLLLL;
    public final C62822Ol8 LJLLLLLL;
    public final C62822Ol8 LJLZ;
    public final C62822Ol8 LJZ;
    public final C62822Ol8 LJZI;
    public float LJZL;
    public int LL;
    public boolean LLD;
    public boolean LLF;
    public final NLM LLFF;

    public static Sensor LIZ(SensorManager sensorManager) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {1};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(I)Landroid/hardware/Sensor;", "-5556088748753235549");
        C39519Ff9 LIZJ = c03880Dg.LIZJ(100703, "android/hardware/SensorManager", "getDefaultSensor", sensorManager, objArr, "android.hardware.Sensor", c65300Pk0);
        if (LIZJ.LIZ) {
            c03880Dg.LIZIZ(100703, "android/hardware/SensorManager", "getDefaultSensor", null, objArr, sensorManager, c65300Pk0, false);
            return (Sensor) LIZJ.LIZIZ;
        }
        Sensor defaultSensor = sensorManager.getDefaultSensor(1);
        c03880Dg.LIZIZ(100703, "android/hardware/SensorManager", "getDefaultSensor", defaultSensor, objArr, sensorManager, c65300Pk0, true);
        return defaultSensor;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onActivityCreate();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onActivityDestroy();
        }
    }

    public final C37A LIZIZ() {
        Object value = this.LJLLJ.getValue();
        o.LJIIIIZZ(value, "<get-shakeEggAnimeContainer>(...)");
        return (C37A) value;
    }

    public final FrameLayout LIZJ() {
        Object value = this.LJLLILLLL.getValue();
        o.LJIIIIZZ(value, "<get-webPageContainer>(...)");
        return (FrameLayout) value;
    }

    public final boolean LJI() {
        Dialog dialog;
        ShakeEggVM shakeEggVM = this.LJLILLLLZI;
        if (shakeEggVM != null) {
            if (shakeEggVM.LJLJI || (!this.LJLJJI.isEmpty())) {
                return true;
            }
            List<Fragment> LJJJJLI = this.LJLIL.getSupportFragmentManager().LJJJJLI();
            o.LJIIIIZZ(LJJJJLI, "mainActivity.supportFragmentManager.fragments");
            if (!LJJJJLI.isEmpty()) {
                for (Fragment fragment : LJJJJLI) {
                    if ((fragment instanceof DialogFragment) && (dialog = ((DialogFragment) fragment).getDialog()) != null && dialog.isShowing()) {
                        return true;
                    }
                }
            }
            return false;
        }
        o.LJIJI("shakeEggVM");
        throw null;
    }

    public final void LJIILIIL() {
        AwemeRawAd awemeRawAd;
        String str;
        ShakeEggVM shakeEggVM = this.LJLILLLLZI;
        Sensor sensor = null;
        if (shakeEggVM != null) {
            Aweme value = shakeEggVM.LJLIL.getValue();
            if (value == null) {
                return;
            }
            if (this.LJLJLLL) {
                LJIIJJI(NLL.SHOW);
                this.LJLJLLL = false;
            }
            if (!this.LJLJJL) {
                str = "data_load_fail";
            } else if (!this.LJLJJLL) {
                str = "load_timeout";
            } else if (this.LJLZ.getValue() == null) {
                str = "shake_fail";
            } else {
                NHO nho = NHO.LIZIZ;
                ShakeEggVM shakeEggVM2 = this.LJLILLLLZI;
                if (shakeEggVM2 != null) {
                    if (!nho.LIZ(shakeEggVM2.LJLIL.getValue()) || !LJII(false) || LJI() || LIZIZ().getVisibility() == 0) {
                        return;
                    }
                    LIZIZ().setVisibility(0);
                    if (this.LJLJLJ) {
                        ITopViewAdEventLogger LJJIJ = TopViewAdEventLogger.LJJIJ();
                        NMA.LIZ.getClass();
                        C58653N0f c58653N0f = NMA.LJIJI;
                        ShakeEggVM shakeEggVM3 = this.LJLILLLLZI;
                        if (shakeEggVM3 != null) {
                            Aweme value2 = shakeEggVM3.LJLIL.getValue();
                            if (value2 != null) {
                                awemeRawAd = value2.getAwemeRawAd();
                            } else {
                                awemeRawAd = null;
                            }
                            LJJIJ.LJI(c58653N0f, awemeRawAd);
                            this.LJLJLJ = false;
                        } else {
                            o.LJIJI("shakeEggVM");
                            throw null;
                        }
                    }
                    LJIIL(false);
                    if (this.LLD) {
                        return;
                    }
                    try {
                        SensorManager sensorManager = (SensorManager) this.LJLZ.getValue();
                        if (sensorManager != null) {
                            C39187FZn c39187FZn = C39188FZo.LIZ;
                            SensorManager sensorManager2 = (SensorManager) this.LJLZ.getValue();
                            if (sensorManager2 != null) {
                                sensor = LIZ(sensorManager2);
                            }
                            C78862UxG LJJIIJ = C78857UxB.LJJIIJ(1476415492, "bpea-commerce_shake_egg_register_sensor");
                            c39187FZn.getClass();
                            C39187FZn.LIZJ(sensorManager, this, sensor, 2, LJJIIJ);
                        }
                    } catch (Q0C unused) {
                    }
                    this.LLD = true;
                    return;
                }
                o.LJIJI("shakeEggVM");
                throw null;
            }
            ITopViewAdEventLogger LJJIJ2 = TopViewAdEventLogger.LJJIJ();
            NMA.LIZ.getClass();
            LJJIJ2.LJIIIZ(NMA.LJIJ, value.getAwemeRawAd(), new AqS33S1000000_10(str, 1));
            return;
        }
        o.LJIJI("shakeEggVM");
        throw null;
    }

    public final void LIZLLL() {
        LIZIZ().setVisibility(8);
        NMO nmo = (NMO) this.LJZ.getValue();
        if (nmo != null) {
            nmo.enable(false);
        }
        LJIIL(false);
    }

    public final void LJ() {
        if (LIZIZ().getVisibility() != 8) {
            LIZIZ().setVisibility(8);
            ITopViewAdEventLogger LJJIJ = TopViewAdEventLogger.LJJIJ();
            NMA.LIZ.getClass();
            C58653N0f c58653N0f = NMA.LJIJJ;
            ShakeEggVM shakeEggVM = this.LJLILLLLZI;
            AwemeRawAd awemeRawAd = null;
            if (shakeEggVM != null) {
                Aweme value = shakeEggVM.LJLIL.getValue();
                if (value != null) {
                    awemeRawAd = value.getAwemeRawAd();
                }
                LJJIJ.LJI(c58653N0f, awemeRawAd);
                return;
            }
            o.LJIJI("shakeEggVM");
            throw null;
        }
    }

    public final void LJFF() {
        CrossPlatformFragment crossPlatformFragment;
        MixActivityContainer mixActivityContainer;
        NMS nms;
        String aid;
        String aid2;
        if (LIZJ().getVisibility() != 8) {
            LIZJ().setVisibility(8);
            InterfaceC36571c5 interfaceC36571c5 = this.LJLLLL;
            if (interfaceC36571c5 != null) {
                if (CommerceWebCrossToSparkExt.LIZJ()) {
                    if ((interfaceC36571c5 instanceof NMS) && (nms = (NMS) interfaceC36571c5) != null) {
                        nms.onHide();
                    }
                } else if ((interfaceC36571c5 instanceof CrossPlatformFragment) && (crossPlatformFragment = (CrossPlatformFragment) interfaceC36571c5) != null && (mixActivityContainer = crossPlatformFragment.LJLIL) != null) {
                    mixActivityContainer.LJJIIZI();
                }
            }
            ShakeEggVM shakeEggVM = this.LJLILLLLZI;
            if (shakeEggVM != null) {
                shakeEggVM.LJLJI = false;
                Aweme value = shakeEggVM.LJLIL.getValue();
                if (value != null && (aid2 = value.getAid()) != null) {
                    shakeEggVM.LJLZ.setValue(aid2);
                }
                NMO nmo = (NMO) this.LJZI.getValue();
                if (nmo != null) {
                    nmo.enable(false);
                }
                ShakeEggVM shakeEggVM2 = this.LJLILLLLZI;
                if (shakeEggVM2 != null) {
                    Aweme value2 = shakeEggVM2.LJLIL.getValue();
                    if (value2 != null && (aid = value2.getAid()) != null) {
                        shakeEggVM2.LJLLLL.setValue(aid);
                        return;
                    }
                    return;
                }
                o.LJIJI("shakeEggVM");
                throw null;
            }
            o.LJIJI("shakeEggVM");
            throw null;
        }
    }

    public final void LJIILJJIL() {
        LJFF();
        LJ();
        LIZLLL();
        try {
            SensorManager sensorManager = (SensorManager) this.LJLZ.getValue();
            if (sensorManager != null) {
                C39187FZn c39187FZn = C39188FZo.LIZ;
                C78862UxG LJJIIJ = C78857UxB.LJJIIJ(1476415492, "bpea-commerce_shake_egg_unregister_sensor");
                c39187FZn.getClass();
                C39187FZn.LIZLLL(sensorManager, this, LJJIIJ);
            }
        } catch (Q0C unused) {
        }
        this.LLD = false;
        ((ArrayList) this.LJLJJI).clear();
        NHO nho = NHO.LIZIZ;
        ShakeEggVM shakeEggVM = this.LJLILLLLZI;
        if (shakeEggVM != null) {
            if (!nho.LIZ(shakeEggVM.LJLIL.getValue())) {
                LJIIJ(true);
            }
            ShakeEggVM shakeEggVM2 = this.LJLILLLLZI;
            if (shakeEggVM2 != null) {
                shakeEggVM2.LJLILLLLZI = false;
                return;
            } else {
                o.LJIJI("shakeEggVM");
                throw null;
            }
        }
        o.LJIJI("shakeEggVM");
        throw null;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onActivityCreate() {
        C42625Go9.LIZIZ(this);
        this.LJLILLLLZI = C4NV.LIZ(this.LJLIL);
        this.LJLJI = Hox.LJLLI.LIZ(this.LJLIL);
        ShakeEggVM shakeEggVM = this.LJLILLLLZI;
        if (shakeEggVM != null) {
            shakeEggVM.LJLIL.observe(this.LJLIL, new AObserverS78S0100000_10(this, 55));
            ShakeEggVM shakeEggVM2 = this.LJLILLLLZI;
            if (shakeEggVM2 != null) {
                shakeEggVM2.LJLL.observe(this.LJLIL, new AObserverS78S0100000_10(this, 56));
                return;
            } else {
                o.LJIJI("shakeEggVM");
                throw null;
            }
        }
        o.LJIJI("shakeEggVM");
        throw null;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onActivityDestroy() {
        C42625Go9.LIZJ(this);
    }

    public ShakeEgg(C29S c29s) {
        this.LJLIL = c29s;
        c29s.getLifecycle().addObserver(this);
        this.LJLJJI = new ArrayList();
        this.LJLLI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 634));
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 637));
        this.LJLLJ = C221108m2.LIZIZ(new AqS160S0100000_10(this, 632));
        this.LJLLLLLL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 635));
        this.LJLZ = C221108m2.LIZIZ(new AqS160S0100000_10(this, 631));
        this.LJZ = C221108m2.LIZIZ(new AqS160S0100000_10(this, 633));
        this.LJZI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 636));
        this.LLFF = new NLM(this);
    }

    public final boolean LJII(boolean z) {
        ShakeEggVM shakeEggVM = this.LJLILLLLZI;
        if (shakeEggVM != null) {
            if (!shakeEggVM.LJLILLLLZI) {
                return false;
            }
            Hox hox = this.LJLJI;
            if (hox != null) {
                if (!hox.vv0("For You")) {
                    return false;
                }
                if (!z && this.LJLIL.getLifecycle().getCurrentState() != Lifecycle.State.RESUMED) {
                    return false;
                }
                return true;
            }
            o.LJIJI("hox");
            throw null;
        }
        o.LJIJI("shakeEggVM");
        throw null;
    }

    public final void LJIIJ(boolean z) {
        ViewGroup viewGroup;
        this.LJLJJL = false;
        this.LJLJJLL = false;
        this.LJLJL = false;
        if (z) {
            ShakeEggVM shakeEggVM = this.LJLILLLLZI;
            if (shakeEggVM != null) {
                shakeEggVM.LJLJJLL = false;
                Fragment fragment = this.LJLLLL;
                if (fragment != null) {
                    FragmentManager supportFragmentManager = this.LJLIL.getSupportFragmentManager();
                    supportFragmentManager.getClass();
                    C1B3 c1b3 = new C1B3(supportFragmentManager);
                    c1b3.LJJI(fragment);
                    c1b3.LJI();
                }
                this.LJLLLL = null;
                SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLLL;
                if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
                    SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS);
                    ViewParent parent = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getParent();
                    if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                        C16880lQ.LJLLL(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, viewGroup);
                    }
                }
                this.LJLLL = null;
                return;
            }
            o.LJIJI("shakeEggVM");
            throw null;
        }
    }

    public final void LJIIJJI(NLL nll) {
        ITopViewAdEventLogger LJJIJ = TopViewAdEventLogger.LJJIJ();
        NMA.LIZ.getClass();
        C58653N0f c58653N0f = NMA.LJIL;
        ShakeEggVM shakeEggVM = this.LJLILLLLZI;
        AwemeRawAd awemeRawAd = null;
        if (shakeEggVM != null) {
            Aweme value = shakeEggVM.LJLIL.getValue();
            if (value != null) {
                awemeRawAd = value.getAwemeRawAd();
            }
            LJJIJ.LJIIIZ(c58653N0f, awemeRawAd, new AqS176S0100000_10(nll, 26));
            return;
        }
        o.LJIJI("shakeEggVM");
        throw null;
    }

    public final void LJIIL(boolean z) {
        C37A LIZIZ = LIZIZ();
        if (z) {
            LIZIZ.setTouchToGone(false);
            LIZIZ.setClickable(true);
            LIZIZ.setEnabled(true);
        } else {
            LIZIZ.setTouchToGone(true);
            LIZIZ.setClickable(false);
            LIZIZ.setEnabled(false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0110, code lost:
    
        if (r16 != null) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    @Override // android.hardware.SensorEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSensorChanged(android.hardware.SensorEvent r16) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ad.feed.shakeEgg.ShakeEgg.onSensorChanged(android.hardware.SensorEvent):void");
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void shakeJsb(C9CL event) {
        Object LIZ;
        CrossPlatformFragment crossPlatformFragment;
        MixActivityContainer mixActivityContainer;
        NMS nms;
        o.LJIIIZ(event, "event");
        Object opt = event.LJLIL.opt("key");
        if (opt == null) {
            return;
        }
        if (o.LJ(opt, "shake_eggs_lynx_ready")) {
            LJIIJJI(NLL.LYNX_READY);
            this.LJLJJLL = true;
            return;
        }
        if (o.LJ(opt, "shake_eggs_startPlay")) {
            long optLong = event.LJLIL.optLong("stayTime");
            LJIIJJI(NLL.START_PLAY);
            NHO nho = NHO.LIZIZ;
            ShakeEggVM shakeEggVM = this.LJLILLLLZI;
            if (shakeEggVM != null) {
                if (!nho.LIZ(shakeEggVM.LJLIL.getValue())) {
                    return;
                }
                try {
                    SensorManager sensorManager = (SensorManager) this.LJLZ.getValue();
                    if (sensorManager != null) {
                        C39187FZn c39187FZn = C39188FZo.LIZ;
                        C78862UxG LJJIIJ = C78857UxB.LJJIIJ(1476415492, "bpea-commerce_shake_egg_unregister_sensor");
                        c39187FZn.getClass();
                        C39187FZn.LIZLLL(sensorManager, this, LJJIIJ);
                    }
                } catch (Q0C unused) {
                }
                this.LLD = false;
                ShakeEggVM shakeEggVM2 = this.LJLILLLLZI;
                if (shakeEggVM2 != null) {
                    ShakeModel LIZIZ = nho.LIZIZ(shakeEggVM2.LJLIL.getValue());
                    if (LIZIZ != null) {
                        LIZIZ.setShaken(true);
                    }
                    this.LJLJL = true;
                    if (!LJII(true) || optLong == 0) {
                        return;
                    }
                    C37A LIZIZ2 = LIZIZ();
                    LJIIL(true);
                    LIZIZ2.setVisibility(0);
                    NMO nmo = (NMO) this.LJZ.getValue();
                    if (nmo != null) {
                        nmo.enable(true);
                    }
                    new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS46S0100000_10(this, 231), optLong);
                    return;
                }
                o.LJIJI("shakeEggVM");
                throw null;
            }
            o.LJIJI("shakeEggVM");
            throw null;
        }
        if (o.LJ(opt, "shake_eggs_lynx_finish")) {
            LJIIJJI(NLL.LYNX_FINISH);
            LIZLLL();
            return;
        }
        if (!o.LJ(opt, "shake_eggs_openlandingpage") || !LJII(true)) {
            return;
        }
        LJIIJJI(NLL.OPEN_LANDINGPAGE);
        try {
            LIZ = event.LJLIL.optString("web_url");
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = null;
        }
        String str = (String) LIZ;
        if (str == null) {
            return;
        }
        InterfaceC36571c5 interfaceC36571c5 = this.LJLLLL;
        AqS160S0100000_10 aqS160S0100000_10 = new AqS160S0100000_10(this, 62);
        if (interfaceC36571c5 == null) {
            return;
        }
        if (CommerceWebCrossToSparkExt.LIZJ()) {
            aqS160S0100000_10.invoke();
            if (!(interfaceC36571c5 instanceof NMS) || (nms = (NMS) interfaceC36571c5) == null) {
                return;
            }
            nms.loadUrl(str);
            return;
        }
        aqS160S0100000_10.invoke();
        if (!(interfaceC36571c5 instanceof CrossPlatformFragment) || (crossPlatformFragment = (CrossPlatformFragment) interfaceC36571c5) == null || (mixActivityContainer = crossPlatformFragment.LJLIL) == null) {
            return;
        }
        mixActivityContainer.LJJIIJ(str);
    }

    public final void LJIIIIZZ(Aweme aweme, boolean z) {
        List<String> geckoChannel;
        String str;
        LJ();
        LJIIJ(false);
        LJIIJJI(NLL.CHECK_GECKO_START);
        ShakeModel LIZIZ = NHO.LIZIZ.LIZIZ(aweme);
        if (LIZIZ != null && (geckoChannel = LIZIZ.getGeckoChannel()) != null) {
            for (String str2 : geckoChannel) {
                C58909NAb.LIZ.getClass();
                if (NH3.LIZIZ() != null) {
                    IAdLandPagePreloadService LJJI = AdLandPagePreloadServiceImpl.LJJI();
                    if (LJJI != null) {
                        str = LJJI.LJIIL("lynx_feed");
                    } else {
                        str = null;
                    }
                    if (!O3U.LIZ(str, str2)) {
                        return;
                    }
                }
            }
            if (C76800UCe.LIZ == null) {
                return;
            }
            LJIIJJI(NLL.CHECK_GECKO_SUCCESS);
            if (ShakeEggSetting.LIZ().loadDelay == 0) {
                LJIIIZ(aweme, z, this);
            } else if (C55511LqV.LJIIJ(aweme)) {
                new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS9S0210000_10(this, aweme, z, 1), ShakeEggSetting.LIZ().loadDelay);
            } else {
                LJIIIZ(aweme, z, this);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0261  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIIIZ(com.ss.android.ugc.aweme.feed.model.Aweme r24, boolean r25, com.ss.android.ugc.aweme.ad.feed.shakeEgg.ShakeEgg r26) {
        /*
            Method dump skipped, instructions count: 613
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ad.feed.shakeEgg.ShakeEgg.LJIIIZ(com.ss.android.ugc.aweme.feed.model.Aweme, boolean, com.ss.android.ugc.aweme.ad.feed.shakeEgg.ShakeEgg):void");
    }
}
