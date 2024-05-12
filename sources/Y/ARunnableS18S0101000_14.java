package Y;

import X.AbstractViewOnTouchListenerC82865Wfd;
import X.ActivityC45651qj;
import X.AnonymousClass668;
import X.BJ9;
import X.C31418CUs;
import X.C32151Nz;
import X.C38809FKz;
import X.C38840FMe;
import X.C60003Ngl;
import X.C6Y5;
import X.C76800UCe;
import X.C79520VIu;
import X.C79646VNq;
import X.C79907VXr;
import X.C79915VXz;
import X.C80157Vd3;
import X.C80164VdA;
import X.C80844Vo8;
import X.C82467WYd;
import X.C82547WaV;
import X.C82890Wg2;
import X.C83374Wnq;
import X.C83550Wqg;
import X.C83551Wqh;
import X.C83621Wrp;
import X.C83681Wsn;
import X.C84092WzQ;
import X.C84095WzT;
import X.C84924XUq;
import X.CQW;
import X.CT0;
import X.EnumC80174VdK;
import X.EnumC84152X0y;
import X.GestureDetectorOnGestureListenerC81986WFq;
import X.InterfaceC47046IdG;
import X.InterfaceC65784Pro;
import X.InterfaceC79913VXx;
import X.InterfaceC82134WLi;
import X.InterfaceC83370Wnm;
import X.InterfaceC84052Wym;
import X.InterfaceC84927XUt;
import X.NJO;
import X.NQR;
import X.O6R;
import X.RunnableC80167VdD;
import X.SJ3;
import X.TMB;
import X.VOC;
import X.W5E;
import X.W5F;
import X.W5U;
import X.WGP;
import X.WO2;
import X.WO8;
import X.WOB;
import X.WOC;
import X.WOG;
import X.WOZ;
import X.WZJ;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Process;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget;
import com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment;
import com.bytedance.android.livesdk.dataChannel.PublicScreenNewMessageVisible;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.creativex.recorder.gesture.DefaultGesturePresenter;
import com.bytedance.ies.safemode.SmartProtected.state.QuietState;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.detail.AbstractDetailFragment;
import com.ss.android.ugc.aweme.shortvideo.cutmusic.RepeatMusicPlayer;
import com.ss.videoarch.strategy.LiveStrategyManager;
import com.zhiliaoapp.musically.R;
import e32.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS38S0001000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public class ARunnableS18S0101000_14 implements Runnable {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            case 8:
                run$8(this);
                return;
            case 9:
                run$9(this);
                return;
            case 10:
                run$10(this);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                run$11(this);
                return;
            case 12:
                run$12(this);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                run$13(this);
                return;
            case 14:
                run$14(this);
                return;
            case 15:
                run$15(this);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                run$16(this);
                return;
            case 17:
                run$17(this);
                return;
            case 18:
                run$18(this);
                return;
            case 19:
                run$19(this);
                return;
            case 20:
                run$20(this);
                return;
            case 21:
                run$21(this);
                return;
            case 22:
                run$22(this);
                return;
            case 23:
                run$23(this);
                return;
            case 24:
                run$24(this);
                return;
            case 25:
                run$25(this);
                return;
            case 26:
                run$26(this);
                return;
            case 27:
                run$27(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        synchronized (((EnumC84152X0y) this.l0).mStateLock) {
            if (((EnumC84152X0y) this.l0).mCameraInstance == null) {
                return;
            }
            boolean exposureCompensation = ((EnumC84152X0y) this.l0).mCameraInstance.setExposureCompensation(this.i1);
            EnumC84152X0y enumC84152X0y = (EnumC84152X0y) this.l0;
            if (enumC84152X0y.mFirstEC && exposureCompensation) {
                enumC84152X0y.mCameraEvent.LJIIIIZZ(115, 0, "exposure compensation");
                ((EnumC84152X0y) this.l0).mFirstEC = false;
            }
        }
    }

    public final void LIZ$1() {
        View view = ((C83374Wnq) this.l0).LJLLJ.mView;
        o.LJII(view, "null cannot be cast to non-null type android.widget.ScrollView");
        ((ScrollView) view).fullScroll(130);
        InterfaceC82134WLi interfaceC82134WLi = ((C83374Wnq) this.l0).LJLJJI;
        if (interfaceC82134WLi != null) {
            interfaceC82134WLi.cl(true, true);
        }
        InterfaceC83370Wnm interfaceC83370Wnm = ((C83374Wnq) this.l0).LJLJJL;
        if (interfaceC83370Wnm != null) {
            interfaceC83370Wnm.uU(O6R.LJJIIZ(C32151Nz.LJIIZILJ(20)) + (AnonymousClass668.LIZIZ().LJFF() - this.i1));
        }
    }

    public final void LIZ$2() {
        WOC woc;
        WOG wog = (WOG) this.l0;
        if (!wog.LJ && wog.LIZ.isPlaying()) {
            int currentPosition = ((WOG) this.l0).LIZ.getCurrentPosition();
            if (currentPosition < this.i1) {
                WOZ woz = ((WOG) this.l0).LIZJ;
                if (woz != null && (woc = (WOC) woz.LIZ.findSceneByTag("count_down")) != null) {
                    GestureDetectorOnGestureListenerC81986WFq gestureDetectorOnGestureListenerC81986WFq = woc.LJLIL;
                    if (gestureDetectorOnGestureListenerC81986WFq != null) {
                        gestureDetectorOnGestureListenerC81986WFq.setProgress(currentPosition);
                    } else {
                        o.LJIJI("volumeTapsView");
                        throw null;
                    }
                }
                ((WOG) this.l0).LIZIZ.post(this);
                return;
            }
            ((WOG) this.l0).LIZ.stop();
            ((WOG) this.l0).LIZ();
        }
    }

    public final void LIZ$3() {
        WOB wob;
        WO2 wo2 = (WO2) this.l0;
        if (!wo2.LJ && wo2.LIZ.isPlaying()) {
            int currentPosition = ((WO2) this.l0).LIZ.getCurrentPosition();
            if (currentPosition < this.i1) {
                WO8 wo8 = ((WO2) this.l0).LIZJ;
                if (wo8 != null && (wob = (WOB) wo8.LIZ.findSceneByTag("count_down")) != null) {
                    WGP wgp = wob.LJLILLLLZI;
                    if (wgp != null) {
                        wgp.setProgress(currentPosition);
                    } else {
                        o.LJIJI("volumeTapsView");
                        throw null;
                    }
                }
                ((WO2) this.l0).LIZIZ.post(this);
                return;
            }
            ((WO2) this.l0).LIZ.stop();
            ((WO2) this.l0).LIZ();
        }
    }

    public final void LIZ$4() {
        InterfaceC84052Wym interfaceC84052Wym = ((C84095WzT) this.l0).LIZ.LJIJ;
        if (interfaceC84052Wym != null) {
            interfaceC84052Wym.LIZ(this.i1);
        }
        C84092WzQ c84092WzQ = ((C84095WzT) this.l0).LIZ;
        c84092WzQ.LJIJ = null;
        if (c84092WzQ.LJJJJ) {
            c84092WzQ.LJIIJJI(1022, this.i1, "stopRecord in stopPreview!!");
            ((C84095WzT) this.l0).LIZ.LJJJJ = false;
        }
    }

    public final void LIZ$5() {
        c cVar = (c) this.l0;
        if (cVar.LJLLLL) {
            int currentItem = cVar.LLFZ.getCurrentItem();
            c cVar2 = (c) this.l0;
            cVar2.LLFZ.setCurrentItem((this.i1 + currentItem) - cVar2.LJIIIZ(currentItem), ((c) this.l0).LJZI);
        } else {
            cVar.LLF = Math.max(Math.min(cVar.LLF, ((CopyOnWriteArrayList) cVar.LLIIIILZ).size()), 0);
            c cVar3 = (c) this.l0;
            cVar3.LLFZ.setCurrentItem(cVar3.LLF, cVar3.LJZI);
        }
    }

    public final void LIZ$6() {
        Iterator<VOC> it = ((C79646VNq) this.l0).LJIILL.iterator();
        while (it.hasNext()) {
            VOC next = it.next();
            if (next.LIZ == this.i1) {
                ((C79646VNq) this.l0).LJIILL.remove(next);
                C79646VNq c79646VNq = (C79646VNq) this.l0;
                if (c79646VNq.LJIJ && c79646VNq.LJIILL.isEmpty()) {
                    ((C79646VNq) this.l0).LIZJ();
                    return;
                }
                return;
            }
        }
    }

    public final void LIZ$7() {
        C83550Wqg c83550Wqg = (C83550Wqg) this.l0;
        c83550Wqg.LIZLLL.getClass();
        c83550Wqg.LJII = 0;
        C83550Wqg c83550Wqg2 = (C83550Wqg) this.l0;
        int i = c83550Wqg2.LJII;
        if (i <= 0 && this.i1 == 1) {
            TMB tmb = C82890Wg2.LJFF;
            ActivityC45651qj activity = c83550Wqg2.LJFF;
            o.LJIIIIZZ(activity, "activity");
            TMB.LIZLLL(tmb, activity, activity.getResources().getString(R.string.pvn)).LIZ();
            return;
        }
        C83551Wqh c83551Wqh = c83550Wqg2.LIZ;
        if (c83551Wqh != null) {
            c83551Wqh.setMaxTextCount(i);
        }
    }

    public final void LIZ$8() {
        C80157Vd3 c80157Vd3;
        ValueAnimator LIZ;
        C80164VdA c80164VdA = ((RunnableC80167VdD) this.l0).LJLJJL;
        if (c80164VdA.LLIILII && this.i1 < 0) {
            c80157Vd3 = c80164VdA.LLJJJJLIIL.LJ(c80164VdA.LJLILLLLZI);
            if (c80157Vd3 != null) {
                c80157Vd3.onAnimationUpdate(ValueAnimator.ofInt(0, 0));
            }
        } else {
            c80157Vd3 = null;
        }
        ALAdapterS11S0100000_14 aLAdapterS11S0100000_14 = new ALAdapterS11S0100000_14(this, 60);
        RunnableC80167VdD runnableC80167VdD = (RunnableC80167VdD) this.l0;
        C80164VdA c80164VdA2 = runnableC80167VdD.LJLJJL;
        int i = c80164VdA2.LJLILLLLZI;
        if (i > 0) {
            LIZ = c80164VdA2.LLJL.LIZ(0);
        } else {
            if (c80157Vd3 != null || i == 0) {
                ValueAnimator valueAnimator = c80164VdA2.LLLFFI;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    ((RunnableC80167VdD) this.l0).LJLJJL.LLLFFI = null;
                }
                ((RunnableC80167VdD) this.l0).LJLJJL.LLJL.LIZIZ(0, false);
                ((RunnableC80167VdD) this.l0).LJLJJL.LLJL.LIZJ(EnumC80174VdK.None);
            } else if (runnableC80167VdD.LJLJI && c80164VdA2.LLIIIJ) {
                int i2 = -c80164VdA2.LLJJ;
                if (i >= i2) {
                    c80164VdA2.LJIILIIL(EnumC80174VdK.None);
                } else {
                    LIZ = c80164VdA2.LLJL.LIZ(i2);
                }
            } else {
                LIZ = c80164VdA2.LLJL.LIZ(0);
            }
            aLAdapterS11S0100000_14.onAnimationEnd(null);
        }
        if (LIZ != null) {
            LIZ.addListener(aLAdapterS11S0100000_14);
            return;
        }
        aLAdapterS11S0100000_14.onAnimationEnd(null);
    }

    public static final void run$0(ARunnableS18S0101000_14 aRunnableS18S0101000_14) {
        switch (aRunnableS18S0101000_14.i1) {
            case 0:
                ((AbsAudienceInteractionFragment) aRunnableS18S0101000_14.l0).lambda$preCreatePlayer$61();
                return;
            case 1:
                QuietState.LJIIIZ((QuietState) aRunnableS18S0101000_14.l0);
                return;
            case 2:
                W5U.LJIIJ((W5E) aRunnableS18S0101000_14.l0);
                return;
            default:
                InterfaceC65784Pro tmp0 = (InterfaceC65784Pro) aRunnableS18S0101000_14.l0;
                o.LJIIIZ(tmp0, "$tmp0");
                tmp0.invoke();
                return;
        }
    }

    public static final void run$1(ARunnableS18S0101000_14 aRunnableS18S0101000_14) {
        boolean LIZ;
        try {
            if (((EnumC84152X0y) aRunnableS18S0101000_14.l0).mCameraInstance != null) {
                ((EnumC84152X0y) aRunnableS18S0101000_14.l0).mCameraInstance.LLLLLLZ(aRunnableS18S0101000_14.i1);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$10(ARunnableS18S0101000_14 aRunnableS18S0101000_14) {
        boolean LIZ;
        try {
            int i = aRunnableS18S0101000_14.i1;
            if (i == 0) {
                ((C82467WYd) aRunnableS18S0101000_14.l0).LLJJ = 0;
            } else if (i > 0 && ((C82467WYd) aRunnableS18S0101000_14.l0).LLJJ == -1) {
                return;
            }
            ((C82467WYd) aRunnableS18S0101000_14.l0).LLJI(new AqS38S0001000_14(i, 12));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$11(ARunnableS18S0101000_14 aRunnableS18S0101000_14) {
        boolean LIZ;
        try {
            WZJ wzj = (WZJ) aRunnableS18S0101000_14.l0;
            int i = aRunnableS18S0101000_14.i1;
            RecyclerView recyclerView = wzj.LJLJLLL;
            if (recyclerView != null) {
                recyclerView.LJLIL(i);
            } else {
                o.LJIJI("bottomRecyclerView");
                throw null;
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$12(ARunnableS18S0101000_14 aRunnableS18S0101000_14) {
        boolean LIZ;
        try {
            aRunnableS18S0101000_14.LIZ$4();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$13(ARunnableS18S0101000_14 aRunnableS18S0101000_14) {
        boolean LIZ;
        try {
            InterfaceC84052Wym interfaceC84052Wym = ((C84095WzT) aRunnableS18S0101000_14.l0).LIZ.LJIIZILJ;
            if (interfaceC84052Wym != null) {
                interfaceC84052Wym.LIZ(aRunnableS18S0101000_14.i1);
            }
            ((C84095WzT) aRunnableS18S0101000_14.l0).LIZ.LJIIZILJ = null;
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$14(ARunnableS18S0101000_14 aRunnableS18S0101000_14) {
        boolean LIZ;
        try {
            ((LiveStrategyManager) aRunnableS18S0101000_14.l0).mHandler.removeMessages(aRunnableS18S0101000_14.i1);
            ((LiveStrategyManager) aRunnableS18S0101000_14.l0).mHandler.sendEmptyMessage(aRunnableS18S0101000_14.i1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$15(ARunnableS18S0101000_14 aRunnableS18S0101000_14) {
        boolean LIZ;
        try {
            aRunnableS18S0101000_14.LIZ$5();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$16(ARunnableS18S0101000_14 aRunnableS18S0101000_14) {
        switch (aRunnableS18S0101000_14.i1) {
            case 0:
                C31418CUs.LIZJ((ArrayList) aRunnableS18S0101000_14.l0, CQW.PUBLICSCREEN_MESSAGE_TYPE);
                return;
            case 1:
                ((DefaultGesturePresenter) aRunnableS18S0101000_14.l0).LJLL = true;
                return;
            case 2:
                NQR nqr = (NQR) aRunnableS18S0101000_14.l0;
                if (nqr != null) {
                    nqr.LIZJ();
                    return;
                }
                return;
            case 3:
                C38840FMe c38840FMe = (C38840FMe) aRunnableS18S0101000_14.l0;
                c38840FMe.getClass();
                c38840FMe.LJI = System.nanoTime() / 1000000;
                return;
            case 4:
                AbstractViewOnTouchListenerC82865Wfd abstractViewOnTouchListenerC82865Wfd = (AbstractViewOnTouchListenerC82865Wfd) aRunnableS18S0101000_14.l0;
                abstractViewOnTouchListenerC82865Wfd.LJIJJLI();
                abstractViewOnTouchListenerC82865Wfd.LJIJJ();
                return;
            default:
                ((C6Y5) aRunnableS18S0101000_14.l0).LJLIL.Jl();
                return;
        }
    }

    public static final void run$17(ARunnableS18S0101000_14 aRunnableS18S0101000_14) {
        boolean LIZ;
        try {
            ((C79520VIu) aRunnableS18S0101000_14.l0).LIZ(aRunnableS18S0101000_14.i1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$18(ARunnableS18S0101000_14 aRunnableS18S0101000_14) {
        C84924XUq c84924XUq = (C84924XUq) aRunnableS18S0101000_14.l0;
        int i = aRunnableS18S0101000_14.i1;
        InterfaceC84927XUt interfaceC84927XUt = c84924XUq.LIZLLL.LJ;
        if (interfaceC84927XUt != null) {
            interfaceC84927XUt.LLLLLLLLLL(i, false);
        }
    }

    public static final void run$19(ARunnableS18S0101000_14 aRunnableS18S0101000_14) {
        boolean LIZ;
        try {
            aRunnableS18S0101000_14.LIZ$6();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS18S0101000_14 aRunnableS18S0101000_14) {
        boolean LIZ;
        try {
            aRunnableS18S0101000_14.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$20(ARunnableS18S0101000_14 aRunnableS18S0101000_14) {
        boolean LIZ;
        try {
            aRunnableS18S0101000_14.LIZ$7();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$21(ARunnableS18S0101000_14 aRunnableS18S0101000_14) {
        switch (aRunnableS18S0101000_14.i1) {
            case 0:
                PublicScreenWidget publicScreenWidget = (PublicScreenWidget) aRunnableS18S0101000_14.l0;
                View view = publicScreenWidget.LJLJI;
                if ((view != null && view.getVisibility() == 0) || publicScreenWidget.LJLLILLLL == CT0.NORMAL) {
                    return;
                }
                TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
                translateAnimation.setDuration(100L);
                publicScreenWidget.LJLILLLLZI.startAnimation(translateAnimation);
                if (publicScreenWidget.LJLILLLLZI.getVisibility() != 0) {
                    publicScreenWidget.dataChannel.rv0(PublicScreenNewMessageVisible.class, Boolean.TRUE);
                }
                publicScreenWidget.LJLILLLLZI.setVisibility(0);
                return;
            case 1:
                BJ9.LJ((BJ9) aRunnableS18S0101000_14.l0);
                return;
            case 2:
                ((AbsAudienceInteractionFragment) aRunnableS18S0101000_14.l0).lambda$loadInitWidgetsP0$32();
                return;
            case 3:
                W5U.LJIIJ(((W5F) aRunnableS18S0101000_14.l0).LIZ());
                return;
            case 4:
                C79907VXr this$0 = (C79907VXr) aRunnableS18S0101000_14.l0;
                o.LJIIIZ(this$0, "this$0");
                NJO.LIZIZ.LIZIZ("CustomSelectTextView", "onStopSelect");
                InterfaceC79913VXx interfaceC79913VXx = this$0.LLFF;
                if (interfaceC79913VXx != null) {
                    interfaceC79913VXx.LJI();
                    return;
                }
                return;
            case 5:
                AbstractDetailFragment.vl((AbstractDetailFragment) aRunnableS18S0101000_14.l0);
                return;
            default:
                C83621Wrp.LLZZJLIL((C83621Wrp) aRunnableS18S0101000_14.l0);
                return;
        }
    }

    public static final void run$22(ARunnableS18S0101000_14 aRunnableS18S0101000_14) {
        switch (aRunnableS18S0101000_14.i1) {
            case 0:
                PublicScreenWidget publicScreenWidget = (PublicScreenWidget) aRunnableS18S0101000_14.l0;
                if (publicScreenWidget.LJLLI.LJJLIIIIJ() <= publicScreenWidget.LLIIII.LIZLLL()) {
                    publicScreenWidget.findViewById(R.id.lqj).setVisibility(0);
                    return;
                } else {
                    publicScreenWidget.findViewById(R.id.lqj).setVisibility(8);
                    return;
                }
            case 1:
                BJ9.LJFF((BJ9) aRunnableS18S0101000_14.l0);
                return;
            case 2:
                ((AbsAudienceInteractionFragment) aRunnableS18S0101000_14.l0).lambda$loadInitWidgetsP0$35();
                return;
            case 3:
                ((W5F) aRunnableS18S0101000_14.l0).LIZJ();
                return;
            case 4:
                C79907VXr this$0 = (C79907VXr) aRunnableS18S0101000_14.l0;
                o.LJIIIZ(this$0, "this$0");
                NJO.LIZIZ.LIZIZ("CustomSelectTextView", "onStartSelect");
                InterfaceC79913VXx interfaceC79913VXx = this$0.LLFF;
                if (interfaceC79913VXx != null) {
                    interfaceC79913VXx.LIZ();
                    return;
                }
                return;
            case 5:
                C83621Wrp.J((C83621Wrp) aRunnableS18S0101000_14.l0);
                return;
            default:
                aRunnableS18S0101000_14.l0.getClass();
                return;
        }
    }

    public static final void run$23(ARunnableS18S0101000_14 aRunnableS18S0101000_14) {
        switch (aRunnableS18S0101000_14.i1) {
            case 0:
                ((PublicScreenWidget) aRunnableS18S0101000_14.l0).LLIIL();
                return;
            case 1:
                BJ9.LJ((BJ9) aRunnableS18S0101000_14.l0);
                return;
            case 2:
                ((W5F) aRunnableS18S0101000_14.l0).LIZJ();
                return;
            case 3:
                InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aRunnableS18S0101000_14.l0;
                CopyOnWriteArrayList<InterfaceC65784Pro<C76800UCe>> copyOnWriteArrayList = C38809FKz.LIZIZ;
                if (copyOnWriteArrayList.contains(interfaceC65784Pro)) {
                    copyOnWriteArrayList.remove(interfaceC65784Pro);
                    interfaceC65784Pro.invoke();
                    return;
                }
                return;
            case 4:
                ((SJ3) aRunnableS18S0101000_14.l0).LLFZ = false;
                return;
            default:
                C82547WaV c82547WaV = (C82547WaV) aRunnableS18S0101000_14.l0;
                c82547WaV.LLJJ();
                c82547WaV.LJLLL = true;
                return;
        }
    }

    public static final void run$24(ARunnableS18S0101000_14 aRunnableS18S0101000_14) {
        switch (aRunnableS18S0101000_14.i1) {
            case 0:
                ((InterfaceC47046IdG) aRunnableS18S0101000_14.l0).onResult("");
                return;
            case 1:
                ((C79915VXz) aRunnableS18S0101000_14.l0).LJLIL.LJIL();
                return;
            default:
                Runnable runnable = (Runnable) aRunnableS18S0101000_14.l0;
                Process.setThreadPriority(10);
                runnable.run();
                return;
        }
    }

    public static final void run$25(ARunnableS18S0101000_14 aRunnableS18S0101000_14) {
        boolean LIZ;
        try {
            MediaPlayer mediaPlayer = ((RepeatMusicPlayer) aRunnableS18S0101000_14.l0).LJLIL;
            if (mediaPlayer != null) {
                if (mediaPlayer.isPlaying()) {
                    ((RepeatMusicPlayer) aRunnableS18S0101000_14.l0).LJLIL.pause();
                }
                ((RepeatMusicPlayer) aRunnableS18S0101000_14.l0).LIZ(aRunnableS18S0101000_14.i1);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$26(ARunnableS18S0101000_14 aRunnableS18S0101000_14) {
        boolean LIZ;
        try {
            ((C80844Vo8) aRunnableS18S0101000_14.l0).smoothScrollTo(aRunnableS18S0101000_14.i1 * C80844Vo8.LJZL, 0);
            ((C80844Vo8) aRunnableS18S0101000_14.l0).LJLLJ = System.currentTimeMillis();
            ((C80844Vo8) aRunnableS18S0101000_14.l0).LJLLLL = aRunnableS18S0101000_14.i1;
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$27(ARunnableS18S0101000_14 aRunnableS18S0101000_14) {
        boolean LIZ;
        try {
            aRunnableS18S0101000_14.LIZ$8();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS18S0101000_14 aRunnableS18S0101000_14) {
        boolean LIZ;
        try {
            aRunnableS18S0101000_14.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS18S0101000_14 aRunnableS18S0101000_14) {
        boolean LIZ;
        try {
            aRunnableS18S0101000_14.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS18S0101000_14 aRunnableS18S0101000_14) {
        boolean LIZ;
        try {
            WOC woc = (WOC) aRunnableS18S0101000_14.l0;
            if (woc.LJLZ == null) {
                Activity activity = woc.mActivity;
                if (activity != null) {
                    woc.LJLZ = new C60003Ngl(activity);
                } else {
                    return;
                }
            }
            WOC woc2 = (WOC) aRunnableS18S0101000_14.l0;
            C60003Ngl c60003Ngl = woc2.LJLZ;
            if (c60003Ngl != null) {
                Object[] objArr = new Object[1];
                int i = 3;
                if (aRunnableS18S0101000_14.i1 != 3) {
                    i = 10;
                }
                objArr[0] = Integer.valueOf(i);
                c60003Ngl.LIZIZ(0, LiveNetAdaptiveHurryTimeSetting.DEFAULT, woc2.getString(R.string.dwq, objArr));
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS18S0101000_14 aRunnableS18S0101000_14) {
        boolean LIZ;
        try {
            aRunnableS18S0101000_14.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(ARunnableS18S0101000_14 aRunnableS18S0101000_14) {
        boolean LIZ;
        try {
            WOB wob = (WOB) aRunnableS18S0101000_14.l0;
            if (wob.LJZI == null) {
                Activity activity = wob.mActivity;
                if (activity != null) {
                    wob.LJZI = new C60003Ngl(activity);
                } else {
                    return;
                }
            }
            WOB wob2 = (WOB) aRunnableS18S0101000_14.l0;
            C60003Ngl c60003Ngl = wob2.LJZI;
            if (c60003Ngl != null) {
                Object[] objArr = new Object[1];
                int i = 3;
                if (aRunnableS18S0101000_14.i1 != 3) {
                    i = 10;
                }
                objArr[0] = Integer.valueOf(i);
                c60003Ngl.LIZIZ(0, LiveNetAdaptiveHurryTimeSetting.DEFAULT, wob2.getString(R.string.dwq, objArr));
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$8(ARunnableS18S0101000_14 aRunnableS18S0101000_14) {
        ((InterfaceC84052Wym) aRunnableS18S0101000_14.l0).LIZ(aRunnableS18S0101000_14.i1);
    }

    public static final void run$9(ARunnableS18S0101000_14 aRunnableS18S0101000_14) {
        boolean LIZ;
        try {
            ((C83681Wsn) aRunnableS18S0101000_14.l0).LIZIZ.LIZ(aRunnableS18S0101000_14.i1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS18S0101000_14(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
