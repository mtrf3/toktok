package X;

import Y.AObserverS78S0100000_10;
import Y.ARunnableS46S0100000_10;
import android.animation.Animator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.ss.android.ugc.aweme.ad.feed.FeedBehaviourViewModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.model.AdBottomContainerInfoStruct;
import com.ss.android.ugc.aweme.commercialize.model.AdDefaultContainerInfoStruct;
import com.ss.android.ugc.aweme.commercialize.model.AdDescriptiveCTAStruct;
import com.ss.android.ugc.aweme.commercialize.model.AdFoldButtonInfoStruct;
import com.ss.android.ugc.aweme.commercialize.model.AdTopContainerInfoStruct;
import com.ss.android.ugc.aweme.commercialize.model.AnimationInfoStruct;
import com.ss.android.ugc.aweme.commercialize.video.IVideoPlayTaskManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.AqS192S0100000_10;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* renamed from: X.NRa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class ViewOnClickListenerC59350NRa implements NRY, View.OnClickListener {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLZ;
    public final InterfaceC59355NRf LJLIL;
    public final OF1 LJLILLLLZI = C1DF.LJJIFFI(this, NRZ.LJLIL);
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS157S0100000_7(this, 576));
    public final AdDescriptiveCTAStruct LJLJJI;
    public final C39289FbR LJLJJL;
    public final C59360NRk LJLJJLL;
    public final C59364NRo LJLJL;
    public final C59100NHk LJLJLJ;
    public final C59099NHj LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;
    public final NGR LJLLILLLL;
    public final NGA LJLLJ;
    public C59357NRh LJLLL;
    public InterfaceC59370NRu<? extends InterfaceC59369NRt> LJLLLL;
    public final C69082nQ LJLLLLLL;

    static {
        TBT tbt = new TBT(ViewOnClickListenerC59350NRa.class, "aweme", "getAweme()Lcom/ss/android/ugc/aweme/feed/model/Aweme;", 0);
        C65352Pkq.LIZ.getClass();
        LJLZ = new InterfaceC74236TBo[]{tbt};
    }

    @Override // X.InterfaceC59329NQf
    public final void LLIILZL() {
        AdDescriptiveCTAStruct adDescriptiveCTAStruct;
        this.LJLLI = false;
        InterfaceC59370NRu<? extends InterfaceC59369NRt> interfaceC59370NRu = this.LJLLLL;
        if (interfaceC59370NRu != null) {
            interfaceC59370NRu.LLLLZLL();
        }
        C59357NRh c59357NRh = this.LJLLL;
        if (c59357NRh != null) {
            Animator animator = c59357NRh.LJIIL;
            if (animator != null) {
                C59357NRh.LIZ(animator);
            }
            Animator animator2 = c59357NRh.LJIILIIL;
            if (animator2 != null) {
                C59357NRh.LIZ(animator2);
            }
            Animator animator3 = c59357NRh.LJIILJJIL;
            if (animator3 != null) {
                C59357NRh.LIZ(animator3);
            }
            Animator animator4 = c59357NRh.LJIILL;
            if (animator4 != null) {
                C59357NRh.LIZ(animator4);
            }
            Animator animator5 = c59357NRh.LJIILLIIL;
            if (animator5 != null) {
                C59357NRh.LIZ(animator5);
            }
            Animator animator6 = c59357NRh.LJIIZILJ;
            if (animator6 != null) {
                C59357NRh.LIZ(animator6);
            }
            Animator animator7 = c59357NRh.LJIJ;
            if (animator7 != null) {
                C59357NRh.LIZ(animator7);
            }
            Animator animator8 = c59357NRh.LJIJI;
            if (animator8 != null) {
                C59357NRh.LIZ(animator8);
            }
            Animator animator9 = c59357NRh.LJIJJ;
            if (animator9 != null) {
                C59357NRh.LIZ(animator9);
            }
            Animator animator10 = c59357NRh.LJIJJLI;
            if (animator10 != null) {
                C59357NRh.LIZ(animator10);
            }
            Animator animator11 = c59357NRh.LJIL;
            if (animator11 != null) {
                C59357NRh.LIZ(animator11);
            }
            Animator animator12 = c59357NRh.LJJ;
            if (animator12 != null) {
                C59357NRh.LIZ(animator12);
            }
            AbstractC59359NRj abstractC59359NRj = c59357NRh.LIZJ;
            if (abstractC59359NRj != null) {
                abstractC59359NRj.LIZLLL(new OSZ("stageName", "reset"));
            }
            AbstractC59359NRj abstractC59359NRj2 = c59357NRh.LIZLLL;
            if (abstractC59359NRj2 != null) {
                abstractC59359NRj2.LIZLLL(new OSZ("stageName", "reset"));
            }
        }
        if (this.LJLLILLLL.LJ) {
            this.LJLIL.LJIJ().LIZIZ(1.0f);
            this.LJLIL.LJIJ().LIZ(0);
            C59100NHk c59100NHk = this.LJLJLJ;
            if (c59100NHk != null) {
                C59363NRn.LIZJ(c59100NHk, 8);
            }
        }
        if (this.LJLLILLLL.LIZLLL && ((adDescriptiveCTAStruct = this.LJLJJI) == null || !adDescriptiveCTAStruct.getHideMusicDisc())) {
            C59362NRm LJIIZILJ = this.LJLIL.LJIIZILJ();
            LJIIZILJ.LJ(LJIIZILJ.LIZIZ());
            LJIIZILJ.LIZJ(1.0f);
            LJIIZILJ.LJFF(0);
        }
        if (this.LJLLILLLL.LJFF) {
            C59362NRm LJIIZILJ2 = this.LJLIL.LJIIZILJ();
            AqS176S0100000_10 aqS176S0100000_10 = new AqS176S0100000_10(this, 177);
            LJIIZILJ2.LIZLLL(1.0f, aqS176S0100000_10);
            LJIIZILJ2.LIZ(0, aqS176S0100000_10);
        }
        C59099NHj c59099NHj = this.LJLJLLL;
        if (c59099NHj != null) {
            C59363NRn.LIZJ(c59099NHj, 8);
        }
        C59360NRk c59360NRk = this.LJLJJLL;
        if (c59360NRk != null) {
            C59363NRn.LIZJ(c59360NRk, 8);
        }
        C59364NRo c59364NRo = this.LJLJL;
        if (c59364NRo != null) {
            c59364NRo.ur0(0.0f);
        }
        C59360NRk c59360NRk2 = this.LJLJJLL;
        if (c59360NRk2 != null) {
            c59360NRk2.LJJLIIIIJ(654311423);
        }
        NGR ngr = this.LJLLILLLL;
        ngr.getClass();
        ngr.LIZ = NGM.DATA_LOAD_FAIL;
        ngr.LIZIZ = true;
        ngr.LIZJ = false;
        ngr.LIZLLL = false;
        ngr.LJ = false;
        ngr.LJFF = false;
        ngr.LJI = false;
        ngr.LJII = false;
        this.LJLL = false;
        LIZIZ();
    }

    @Override // X.InterfaceC59329NQf
    public final void H6() {
        AdDescriptiveCTAStruct adDescriptiveCTAStruct;
        AdFoldButtonInfoStruct foldButton;
        AdDescriptiveCTAStruct adDescriptiveCTAStruct2 = this.LJLJJI;
        if (adDescriptiveCTAStruct2 != null && adDescriptiveCTAStruct2.getHideMusicDisc()) {
            this.LJLIL.LJIIZILJ().LJFF(8);
        }
        this.LJLLI = true;
        if (!this.LJLLILLLL.LIZIZ && (adDescriptiveCTAStruct = this.LJLJJI) != null && (foldButton = adDescriptiveCTAStruct.getFoldButton()) != null && foldButton.getShouldShow()) {
            NGA nga = this.LJLLJ;
            NG8.LIZ.getClass();
            nga.LJIILIIL(NG8.LJIIIIZZ);
        }
    }

    public final Aweme LIZ() {
        return (Aweme) this.LJLILLLLZI.LIZ(this, LJLZ[0]);
    }

    public final void LIZIZ() {
        NGM ngm;
        NGM ngm2;
        boolean z;
        AdDescriptiveCTAStruct adDescriptiveCTAStruct;
        AdFoldButtonInfoStruct foldButton;
        C59364NRo c59364NRo;
        C59100NHk c59100NHk = this.LJLJLJ;
        NGM ngm3 = null;
        if (c59100NHk != null) {
            ngm = c59100NHk.LJ();
        } else {
            ngm = null;
        }
        C59099NHj c59099NHj = this.LJLJLLL;
        if (c59099NHj != null) {
            ngm3 = c59099NHj.LJ();
        }
        NGR ngr = this.LJLLILLLL;
        if ((ngm == null || ngm == NGM.RENDER_SUCCESS) && (ngm3 == null || ngm3 == NGM.RENDER_SUCCESS)) {
            ngm2 = NGM.RENDER_SUCCESS;
        } else {
            ngm2 = NGM.DATA_LOAD_FAIL;
            if (ngm != ngm2 && ngm3 != ngm2) {
                ngm2 = NGM.LOAD_TIME_OUT;
            }
        }
        ngr.getClass();
        o.LJIIIZ(ngm2, "<set-?>");
        ngr.LIZ = ngm2;
        NGR ngr2 = this.LJLLILLLL;
        if (ngr2.LIZ != NGM.RENDER_SUCCESS) {
            z = true;
        } else {
            z = false;
        }
        ngr2.LIZIZ = z;
        if (!z && (adDescriptiveCTAStruct = this.LJLJJI) != null && (foldButton = adDescriptiveCTAStruct.getFoldButton()) != null && foldButton.getShouldShow() && (c59364NRo = this.LJLJL) != null) {
            C59363NRn.LIZJ(c59364NRo, 0);
        }
    }

    @Override // X.InterfaceC41000G7g
    public final void initialize() {
        C59357NRh c59357NRh;
        int i;
        Integer num;
        Integer num2;
        AdBottomContainerInfoStruct bottomContainer;
        AnimationInfoStruct animationInfo;
        AdTopContainerInfoStruct leftContainer;
        AdBottomContainerInfoStruct bottomContainer2;
        ((FeedBehaviourViewModel) this.LJLJI.getValue()).LJLIL.observe(this.LJLIL.getLifecycleOwner(), new AObserverS78S0100000_10(this, 44));
        ((FeedBehaviourViewModel) this.LJLJI.getValue()).LJLILLLLZI.observe(this.LJLIL.getLifecycleOwner(), new AObserverS78S0100000_10(this, 45));
        C59360NRk c59360NRk = this.LJLJJLL;
        C59364NRo c59364NRo = this.LJLJL;
        InterfaceC59370NRu<? extends InterfaceC59369NRt> interfaceC59370NRu = null;
        if (c59360NRk != null && c59364NRo != null) {
            c59357NRh = new C59357NRh(new C59356NRg(this, c59360NRk, c59364NRo));
        } else {
            c59357NRh = null;
        }
        this.LJLLL = c59357NRh;
        AdDescriptiveCTAStruct adDescriptiveCTAStruct = this.LJLJJI;
        if (adDescriptiveCTAStruct != null && (bottomContainer2 = adDescriptiveCTAStruct.getBottomContainer()) != null) {
            i = bottomContainer2.getShowSeconds();
        } else {
            i = 0;
        }
        AdDescriptiveCTAStruct adDescriptiveCTAStruct2 = this.LJLJJI;
        if (adDescriptiveCTAStruct2 != null && (leftContainer = adDescriptiveCTAStruct2.getLeftContainer()) != null) {
            num = Integer.valueOf(leftContainer.getShowSeconds());
        } else {
            num = null;
        }
        AdDescriptiveCTAStruct adDescriptiveCTAStruct3 = this.LJLJJI;
        if (adDescriptiveCTAStruct3 != null && (bottomContainer = adDescriptiveCTAStruct3.getBottomContainer()) != null && (animationInfo = bottomContainer.getAnimationInfo()) != null) {
            num2 = Integer.valueOf(animationInfo.getAnimationSeconds());
        } else {
            num2 = null;
        }
        C59357NRh c59357NRh2 = this.LJLLL;
        if (c59357NRh2 != null) {
            if (num == null) {
                if (num2 == null) {
                    interfaceC59370NRu = new C59354NRe(new C59353NRd(i, c59357NRh2, this));
                }
                interfaceC59370NRu = new C59361NRl(new C59351NRb(num, i, c59357NRh2, this));
            } else {
                if (num2 != null) {
                    interfaceC59370NRu = new C59358NRi(new C59352NRc(num, num2, c59357NRh2, this));
                }
                interfaceC59370NRu = new C59361NRl(new C59351NRb(num, i, c59357NRh2, this));
            }
        }
        this.LJLLLL = interfaceC59370NRu;
    }

    @Override // X.InterfaceC59329NQf
    public final void LLZ() {
        LLIILZL();
        C59364NRo c59364NRo = this.LJLJL;
        if (c59364NRo != null) {
            C59363NRn.LIZJ(c59364NRo, 8);
        }
        C59357NRh c59357NRh = this.LJLLL;
        if (c59357NRh != null) {
            Animator animator = c59357NRh.LJIIL;
            if (animator != null) {
                animator.cancel();
            }
            Animator animator2 = c59357NRh.LJIILIIL;
            if (animator2 != null) {
                animator2.cancel();
            }
            Animator animator3 = c59357NRh.LJIILJJIL;
            if (animator3 != null) {
                animator3.cancel();
            }
            Animator animator4 = c59357NRh.LJIILL;
            if (animator4 != null) {
                animator4.cancel();
            }
            Animator animator5 = c59357NRh.LJIILLIIL;
            if (animator5 != null) {
                animator5.cancel();
            }
            Animator animator6 = c59357NRh.LJIIZILJ;
            if (animator6 != null) {
                animator6.cancel();
            }
            Animator animator7 = c59357NRh.LJIJ;
            if (animator7 != null) {
                animator7.cancel();
            }
            Animator animator8 = c59357NRh.LJIJI;
            if (animator8 != null) {
                animator8.cancel();
            }
            Animator animator9 = c59357NRh.LJIJJ;
            if (animator9 != null) {
                animator9.cancel();
            }
            Animator animator10 = c59357NRh.LJIJJLI;
            if (animator10 != null) {
                animator10.cancel();
            }
            Animator animator11 = c59357NRh.LJIL;
            if (animator11 != null) {
                animator11.cancel();
            }
            Animator animator12 = c59357NRh.LJJ;
            if (animator12 != null) {
                animator12.cancel();
            }
        }
        C39289FbR c39289FbR = this.LJLJJL;
        c39289FbR.getClass();
        EventBus.LIZJ().LJIJ(c39289FbR);
    }

    @Override // X.InterfaceC59329NQf
    public final void onBind() {
        LIZIZ();
        if (this.LJLLILLLL.LIZIZ) {
            C69082nQ c69082nQ = this.LJLLLLLL;
            C59375NRz c59375NRz = new C59375NRz(this);
            c69082nQ.getClass();
            ((ArrayList) c69082nQ.LIZ).add(c59375NRz);
            XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ.plus(C79146V4k.LJIILIIL())), null, null, new C69072nP(c59375NRz, c69082nQ, null), 3);
        }
    }

    @Override // X.InterfaceC41034G8o
    public final /* bridge */ /* synthetic */ Object L9() {
        return this.LJLIL;
    }

    public ViewOnClickListenerC59350NRa(C214018ab c214018ab) {
        AdDescriptiveCTAStruct adDescriptiveCTAStruct;
        String str;
        C59360NRk c59360NRk;
        C59364NRo c59364NRo;
        AdTopContainerInfoStruct adTopContainerInfoStruct;
        C59100NHk c59100NHk;
        AdBottomContainerInfoStruct adBottomContainerInfoStruct;
        AwemeRawAd awemeRawAd;
        AdDescriptiveCTAStruct adDescriptiveCTA;
        AwemeRawAd awemeRawAd2;
        AdDescriptiveCTAStruct adDescriptiveCTA2;
        AdDefaultContainerInfoStruct defaultContainer;
        AwemeRawAd awemeRawAd3;
        this.LJLIL = c214018ab;
        Aweme LIZ = LIZ();
        C59099NHj c59099NHj = null;
        if (LIZ != null && (awemeRawAd3 = LIZ.getAwemeRawAd()) != null) {
            adDescriptiveCTAStruct = awemeRawAd3.getAdDescriptiveCTA();
        } else {
            adDescriptiveCTAStruct = null;
        }
        this.LJLJJI = adDescriptiveCTAStruct;
        C39289FbR c39289FbR = new C39289FbR();
        this.LJLJJL = c39289FbR;
        NGR ngr = new NGR(0);
        this.LJLLILLLL = ngr;
        this.LJLLJ = new NGA(LIZ(), ngr);
        this.LJLLLLLL = new C69082nQ();
        c39289FbR.LIZIZ();
        ViewGroup viewGroup = c214018ab.LJFF;
        if (adDescriptiveCTAStruct != null && (defaultContainer = adDescriptiveCTAStruct.getDefaultContainer()) != null) {
            str = defaultContainer.getButtonText();
        } else {
            str = null;
        }
        if (viewGroup != null && str != null) {
            C16880lQ.LJIIL(viewGroup, this);
            c59360NRk = new C59360NRk(new C59373NRx(this, str, viewGroup));
            c59360NRk.initialize();
            c59360NRk.LJJLIIIIJ(654311423);
            C59363NRn.LIZ(c59360NRk, -40);
        } else {
            c59360NRk = null;
        }
        this.LJLJJLL = c59360NRk;
        ViewGroup viewGroup2 = c214018ab.LJI;
        if (viewGroup2 != null) {
            C16880lQ.LJIIL(viewGroup2, this);
            c59364NRo = new C59364NRo(new NSH(viewGroup2));
        } else {
            c59364NRo = null;
        }
        this.LJLJL = c59364NRo;
        ViewGroup viewGroup3 = c214018ab.LIZLLL;
        Aweme LIZ2 = LIZ();
        Aweme LIZ3 = LIZ();
        if (LIZ3 != null && (awemeRawAd2 = LIZ3.getAwemeRawAd()) != null && (adDescriptiveCTA2 = awemeRawAd2.getAdDescriptiveCTA()) != null) {
            adTopContainerInfoStruct = adDescriptiveCTA2.getLeftContainer();
        } else {
            adTopContainerInfoStruct = null;
        }
        if (viewGroup3 != null && LIZ2 != null && adTopContainerInfoStruct != null) {
            c59100NHk = new C59100NHk(new C59101NHl(viewGroup3, LIZ2));
            c59100NHk.initialize();
        } else {
            c59100NHk = null;
        }
        this.LJLJLJ = c59100NHk;
        ViewGroup viewGroup4 = c214018ab.LJ;
        Aweme LIZ4 = LIZ();
        Aweme LIZ5 = LIZ();
        if (LIZ5 != null && (awemeRawAd = LIZ5.getAwemeRawAd()) != null && (adDescriptiveCTA = awemeRawAd.getAdDescriptiveCTA()) != null) {
            adBottomContainerInfoStruct = adDescriptiveCTA.getBottomContainer();
        } else {
            adBottomContainerInfoStruct = null;
        }
        if (viewGroup4 != null && LIZ4 != null && adBottomContainerInfoStruct != null) {
            c59099NHj = new C59099NHj(new C59102NHm(viewGroup4, LIZ4));
            c59099NHj.initialize();
        }
        this.LJLJLLL = c59099NHj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context;
        AwemeRawAd awemeRawAd;
        if (o.LJ(view, this.LJLIL.LIZJ())) {
            this.LJLLILLLL.LIZJ = true;
            NGA nga = this.LJLLJ;
            NG8.LIZ.getClass();
            nga.LJIILIIL(NG8.LJII);
            NGR ngr = this.LJLLILLLL;
            if (ngr.LJ || ngr.LJFF) {
                InterfaceC59370NRu<? extends InterfaceC59369NRt> interfaceC59370NRu = this.LJLLLL;
                if (interfaceC59370NRu != null) {
                    interfaceC59370NRu.qk();
                    return;
                }
                return;
            }
            InterfaceC59370NRu<? extends InterfaceC59369NRt> interfaceC59370NRu2 = this.LJLLLL;
            if (interfaceC59370NRu2 == null) {
                return;
            }
            interfaceC59370NRu2.H90();
            return;
        }
        if (!o.LJ(view, this.LJLIL.LJIIIZ())) {
            return;
        }
        V9W LJIJI = C73340SqO.LJIJI();
        ViewGroup LJIIIZ = this.LJLIL.LJIIIZ();
        if (LJIIIZ != null) {
            context = LJIIIZ.getContext();
        } else {
            context = null;
        }
        Aweme LIZ = LIZ();
        N4F n4f = N4F.LIZ;
        LJIJI.getClass();
        NOE.LJJIIJ(context, LIZ, 60, n4f);
        NGA nga2 = this.LJLLJ;
        NG8.LIZ.getClass();
        nga2.LJIILIIL(NG8.LJIIIZ);
        Aweme LIZ2 = LIZ();
        if (LIZ2 == null || (awemeRawAd = LIZ2.getAwemeRawAd()) == null) {
            return;
        }
        UrlModel clickTrackUrlList = awemeRawAd.getClickTrackUrlList();
        Long creativeId = awemeRawAd.getCreativeId();
        String logExtra = awemeRawAd.getLogExtra();
        new AqS192S0100000_10(awemeRawAd, 36);
        O8Y.LIZ("click", clickTrackUrlList, creativeId, logExtra);
    }

    @Override // X.InterfaceC59336NQm
    public final void sy(long j) {
        int i;
        AdBottomContainerInfoStruct bottomContainer;
        if (this.LJLL) {
            return;
        }
        this.LJLL = true;
        InterfaceC59370NRu<? extends InterfaceC59369NRt> interfaceC59370NRu = this.LJLLLL;
        if (interfaceC59370NRu != null) {
            interfaceC59370NRu.Fe0(j);
        }
        ARunnableS46S0100000_10 aRunnableS46S0100000_10 = new ARunnableS46S0100000_10(this, UserLevelGeckoUpdateSetting.DEFAULT);
        IVideoPlayTaskManager LIZIZ = this.LJLIL.LIZIZ();
        N68 LIZIZ2 = C1DD.LIZIZ("COMMERCE_REVAMP_COLOR_CHANGE_TASK_NAME", j);
        AdDescriptiveCTAStruct adDescriptiveCTAStruct = this.LJLJJI;
        if (adDescriptiveCTAStruct != null && (bottomContainer = adDescriptiveCTAStruct.getBottomContainer()) != null) {
            i = bottomContainer.getChangeColorSeconds();
        } else {
            i = 0;
        }
        LIZIZ2.LIZJ = i * 1000;
        LIZIZ2.LIZLLL = aRunnableS46S0100000_10;
        LIZIZ2.LJ = false;
        LIZIZ.LJLJLJ(LIZIZ2.LIZ());
    }
}
