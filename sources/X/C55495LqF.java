package X;

import Y.AObserverS77S0100000_9;
import android.R;
import android.view.View;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.IMainAdScene;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.viewModel.AdHomePageDataVM;
import com.bytedance.ies.ugc.aweme.commercialize.splash.core.SplashAdServiceImpl;
import com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.ad.feed.shakeEgg.ShakeEggSetting;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: X.LqF, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55495LqF implements IMainAdScene {
    public C55449LpV LIZ;
    public InterfaceC55496LqG LIZIZ;
    public C29S LIZJ;
    public N56 LIZLLL;
    public C55497LqH LJ;
    public InterfaceC55505LqP LJFF;
    public boolean LJI;
    public ScrollSwitchStateManager LJII;
    public HomePageDataViewModel LJIIIIZZ;
    public AdHomePageDataVM LJIIIZ;
    public final C62822Ol8 LJIIJ = C221108m2.LIZIZ(N59.LJLIL);
    public final AObserverS77S0100000_9 LJIIJJI = new AObserverS77S0100000_9(this, 92);

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.IMainAdScene
    public final void onResume() {
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.IMainAdScene
    public final void onDestroy() {
        C55497LqH c55497LqH = this.LJ;
        if (c55497LqH != null) {
            C55509LqT.LIZ.LIZIZ(c55497LqH);
        }
        N56 n56 = this.LIZLLL;
        if (n56 != null) {
            synchronized (C55502LqM.LIZ) {
                List<InterfaceC55513LqX> list = C55502LqM.LIZIZ;
                if (((ArrayList) list).contains(n56)) {
                    ((ArrayList) list).remove(n56);
                }
            }
        }
        EventBus.LIZJ().LJIJ(this);
        C55511LqV.LJIILIIL = false;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.IMainAdScene
    public final void onPause() {
        InterfaceC55496LqG interfaceC55496LqG = this.LIZIZ;
        if (interfaceC55496LqG != null) {
            InterfaceC36571c5 curFragment = interfaceC55496LqG.getCurFragment();
            boolean z = true;
            if (curFragment == null) {
                C55511LqV.LJI = true;
                return;
            }
            C18I c18i = this.LIZJ;
            if (c18i != null) {
                if (!(c18i instanceof InterfaceC55452LpY) || !((InterfaceC55452LpY) c18i).mainPageOnFeed() || !(curFragment instanceof InterfaceC54054LJi) || !((InterfaceC54054LJi) curFragment).Oe()) {
                    z = false;
                }
                C55511LqV.LJI = z;
                return;
            }
            o.LJIJI("mActivity");
            throw null;
        }
        o.LJIJI("mainAdSceneCallBack");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0091, code lost:
    
        if (r1 <= 4.5f) goto L37;
     */
    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.IMainAdScene
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate() {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55495LqF.onCreate():void");
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.IMainAdScene, X.InterfaceC48872JGa
    public final void init(JGV adSceneDepend) {
        o.LJIIIZ(adSceneDepend, "adSceneDepend");
        C55449LpV c55449LpV = (C55449LpV) adSceneDepend;
        this.LIZ = c55449LpV;
        InterfaceC48875JGd interfaceC48875JGd = c55449LpV.LIZ;
        o.LJII(interfaceC48875JGd, "null cannot be cast to non-null type com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.IMainAdSceneCallBack");
        this.LIZIZ = (InterfaceC55496LqG) interfaceC48875JGd;
        C55449LpV c55449LpV2 = this.LIZ;
        if (c55449LpV2 != null) {
            C29S c29s = c55449LpV2.LIZIZ;
            o.LJI(c29s);
            this.LIZJ = c29s;
            ISplashAdService LJJI = SplashAdServiceImpl.LJJI();
            C29S c29s2 = this.LIZJ;
            if (c29s2 != null) {
                this.LJFF = LJJI.LJII(c29s2);
                if (!ShakeEggSetting.LIZ().closeShakeEgg) {
                    NHO nho = NHO.LIZIZ;
                    C29S c29s3 = this.LIZJ;
                    if (c29s3 != null) {
                        nho.LIZJ(c29s3);
                        return;
                    } else {
                        o.LJIJI("mActivity");
                        throw null;
                    }
                }
                return;
            }
            o.LJIJI("mActivity");
            throw null;
        }
        o.LJIJI("mainAdDepend");
        throw null;
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onAwesomeSplashEvent(C55008LiO event) {
        o.LJIIIZ(event, "event");
        AdHomePageDataVM adHomePageDataVM = this.LJIIIZ;
        if (adHomePageDataVM != null) {
            adHomePageDataVM.LJLILLLLZI.setValue(event);
            if (event.LJLIL == 4) {
                AdHomePageDataVM adHomePageDataVM2 = this.LJIIIZ;
                if (adHomePageDataVM2 != null) {
                    adHomePageDataVM2.LJLIL = false;
                } else {
                    o.LJIJI("adHomePageDataVM");
                    throw null;
                }
            }
            C29S c29s = this.LIZJ;
            if (c29s != null) {
                View findViewById = c29s.findViewById(R.id.content);
                if (event.LJLIL == 1) {
                    InterfaceC55505LqP interfaceC55505LqP = this.LJFF;
                    if (interfaceC55505LqP != null) {
                        interfaceC55505LqP.LIZ();
                        C29S c29s2 = this.LIZJ;
                        if (c29s2 != null) {
                            View decorView = c29s2.getWindow().getDecorView();
                            C29S c29s3 = this.LIZJ;
                            if (c29s3 != null) {
                                decorView.setBackgroundColor(C78609UtB.LJJJ(com.zhiliaoapp.musically.R.attr.ed, c29s3));
                                findViewById.setAlpha(0.0f);
                            } else {
                                o.LJIJI("mActivity");
                                throw null;
                            }
                        } else {
                            o.LJIJI("mActivity");
                            throw null;
                        }
                    } else {
                        o.LJIJI("mSplashLoadMaskHelper");
                        throw null;
                    }
                } else {
                    findViewById.setAlpha(1.0f);
                    AdHomePageDataVM adHomePageDataVM3 = this.LJIIIZ;
                    if (adHomePageDataVM3 != null) {
                        adHomePageDataVM3.LJLJJI.setValue(Boolean.TRUE);
                    } else {
                        o.LJIJI("adHomePageDataVM");
                        throw null;
                    }
                }
                int i = event.LJLIL;
                if (i == 2) {
                    C18I c18i = this.LIZJ;
                    if (c18i != null) {
                        ((InterfaceC55452LpY) c18i).setVpEnableDispatchTouchEventCheck(false);
                    } else {
                        o.LJIJI("mActivity");
                        throw null;
                    }
                } else if (i == 4 && C63081OpJ.LLIIII(event.LJLILLLLZI)) {
                    InterfaceC55496LqG interfaceC55496LqG = this.LIZIZ;
                    if (interfaceC55496LqG != null) {
                        interfaceC55496LqG.LJJJJJL();
                    } else {
                        o.LJIJI("mainAdSceneCallBack");
                        throw null;
                    }
                }
                if (event.LJLIL == 4) {
                    ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("AwesomeSplash", "onAwesomeSplashEvent is AwesomeSplashEvent.GONE");
                    if (this.LJI) {
                        this.LJI = false;
                        C18I c18i2 = this.LIZJ;
                        if (c18i2 != null) {
                            ((InterfaceC55452LpY) c18i2).splashOverShowMandatoryLoginPage();
                            return;
                        } else {
                            o.LJIJI("mActivity");
                            throw null;
                        }
                    }
                    return;
                }
                if (!C63081OpJ.LLIIII(event.LJLILLLLZI)) {
                    return;
                }
                this.LJI = true;
                return;
            }
            o.LJIJI("mActivity");
            throw null;
        }
        o.LJIJI("adHomePageDataVM");
        throw null;
    }

    @QD3
    public final void onSplashAdEvent(C9G5 c9g5) {
        if (c9g5 != null && c9g5.LJLIL == 0) {
            AdHomePageDataVM adHomePageDataVM = this.LJIIIZ;
            if (adHomePageDataVM != null) {
                adHomePageDataVM.LJLIL = false;
                C18I c18i = this.LIZJ;
                if (c18i != null) {
                    ((InterfaceC55452LpY) c18i).splashOverShowMandatoryLoginPage();
                    return;
                } else {
                    o.LJIJI("mActivity");
                    throw null;
                }
            }
            o.LJIJI("adHomePageDataVM");
            throw null;
        }
    }

    @QD3
    public final void onTabChangeEvent(C209108Io event) {
        o.LJIIIZ(event, "event");
        if (!o.LJ(event.LJLILLLLZI, "HOME")) {
            C55511LqV.LIZ().LJIIIZ();
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.IMainAdScene
    public final void onVideoPageChangeEvent(Aweme aweme, boolean z) {
        o.LJIIIZ(aweme, "aweme");
        NT2 nt2 = NT2.LIZ;
        C29S c29s = this.LIZJ;
        if (c29s != null) {
            nt2.LJJJJJL(c29s, aweme, z, false);
        } else {
            o.LJIJI("mActivity");
            throw null;
        }
    }

    public final void LJJIIZI(InterfaceC65784Pro interfaceC65784Pro, String str, String str2) {
        if ((o.LJ("background_ad", str) || o.LJ("result_ad_bg", str)) && o.LJ("replay", str2)) {
            interfaceC65784Pro.invoke();
            return;
        }
        if ((o.LJ("background_ad", str) || o.LJ("draw_ad", str)) && o.LJ("othershow", str2)) {
            interfaceC65784Pro.invoke();
        } else if ((o.LJ("draw_ad", str) || o.LJ("result_ad", str)) && ((java.util.Set) this.LJIIJ.getValue()).contains(str2)) {
            interfaceC65784Pro.invoke();
        }
    }
}
