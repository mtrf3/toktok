package Y;

import X.AbstractC77108UOa;
import X.AbstractC77394UZa;
import X.C018905p;
import X.C0NB;
import X.C0NE;
import X.C15490jB;
import X.C16880lQ;
import X.C28733BPl;
import X.C29306Beo;
import X.C29701Eo;
import X.C30922CBq;
import X.C47061t0;
import X.C56414MCc;
import X.C61447O9r;
import X.C75023TcR;
import X.C75422Tis;
import X.C75425Tiv;
import X.C75838Tpa;
import X.C76260TwO;
import X.C76414Tys;
import X.C76477Tzt;
import X.C76624U5k;
import X.C76636U5w;
import X.C76900UGa;
import X.C76923UGx;
import X.C77869UhF;
import X.C77870UhG;
import X.C77871UhH;
import X.CMV;
import X.CN1;
import X.EnumC76178Tv4;
import X.U15;
import X.U1X;
import X.U2A;
import X.U46;
import X.UC8;
import X.UCA;
import X.UGR;
import X.UGS;
import X.UGV;
import X.UOS;
import X.UYH;
import X.UZZ;
import X.ViewOnClickListenerC76430Tz8;
import X.X1D;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.liveinteract.match.business.event.BattleMvpStarAnimationStartEvent;
import com.bytedance.android.live.liveinteract.match.business.event.BattleStateChannel;
import com.bytedance.android.live.liveinteract.multihost.biz.view.InteractionTitleLayout;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.MatchItemAssem;
import com.bytedance.android.live.liveinteract.multimatch.ui.MatchCountDownAssem;
import com.bytedance.android.live.shorttouch.service.IShortTouchService;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class ALAdapterS10S0100000_13 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 2:
                onAnimationCancel$0(this, animator);
                return;
            case 19:
                onAnimationCancel$1(this, animator);
                return;
            case 24:
                onAnimationCancel$2(this, animator);
                return;
            case 34:
                onAnimationCancel$3(this, animator);
                return;
            case 39:
                onAnimationCancel$4(this, animator);
                return;
            case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                onAnimationCancel$5(this, animator);
                return;
            case 45:
                onAnimationCancel$6(this, animator);
                return;
            case 47:
                onAnimationCancel$7(this, animator);
                return;
            case 52:
                onAnimationCancel$8(this, animator);
                return;
            case 54:
                onAnimationCancel$9(this, animator);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 1:
                onAnimationEnd$0(this, animator);
                return;
            case 2:
                onAnimationEnd$1(this, animator);
                return;
            case 3:
                onAnimationEnd$2(this, animator);
                return;
            case 4:
                onAnimationEnd$3(this, animator);
                return;
            case 5:
            case 12:
            case 14:
            case 25:
            case 28:
            default:
                super.onAnimationEnd(animator);
                return;
            case 6:
                onAnimationEnd$4(this, animator);
                return;
            case 7:
                onAnimationEnd$5(this, animator);
                return;
            case 8:
                onAnimationEnd$6(this, animator);
                return;
            case 9:
                onAnimationEnd$7(this, animator);
                return;
            case 10:
                onAnimationEnd$8(this, animator);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onAnimationEnd$9(this, animator);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                onAnimationEnd$10(this, animator);
                return;
            case 15:
                onAnimationEnd$11(this, animator);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                onAnimationEnd$12(this, animator);
                return;
            case 17:
                onAnimationEnd$13(this, animator);
                return;
            case 18:
                onAnimationEnd$14(this, animator);
                return;
            case 19:
                onAnimationEnd$15(this, animator);
                return;
            case 20:
                onAnimationEnd$16(this, animator);
                return;
            case 21:
                onAnimationEnd$17(this, animator);
                return;
            case 22:
                onAnimationEnd$18(this, animator);
                return;
            case 23:
                onAnimationEnd$19(this, animator);
                return;
            case 24:
                onAnimationEnd$20(this, animator);
                return;
            case 26:
                onAnimationEnd$21(this, animator);
                return;
            case 27:
                onAnimationEnd$22(this, animator);
                return;
            case 29:
                onAnimationEnd$23(this, animator);
                return;
            case 30:
                onAnimationEnd$24(this, animator);
                return;
            case 31:
                onAnimationEnd$25(this, animator);
                return;
            case 32:
                onAnimationEnd$26(this, animator);
                return;
            case 33:
                onAnimationEnd$27(this, animator);
                return;
            case 34:
                onAnimationEnd$28(this, animator);
                return;
            case 35:
                onAnimationEnd$29(this, animator);
                return;
            case 36:
                onAnimationEnd$30(this, animator);
                return;
            case 37:
                onAnimationEnd$31(this, animator);
                return;
            case 38:
                onAnimationEnd$32(this, animator);
                return;
            case 39:
                onAnimationEnd$33(this, animator);
                return;
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                onAnimationEnd$34(this, animator);
                return;
            case 41:
                onAnimationEnd$35(this, animator);
                return;
            case 42:
                onAnimationEnd$36(this, animator);
                return;
            case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                onAnimationEnd$37(this, animator);
                return;
            case 44:
                onAnimationEnd$38(this, animator);
                return;
            case 45:
                onAnimationEnd$39(this, animator);
                return;
            case 46:
                onAnimationEnd$40(this, animator);
                return;
            case 47:
                onAnimationEnd$41(this, animator);
                return;
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                onAnimationEnd$42(this, animator);
                return;
            case C61447O9r.LJIIJ:
                onAnimationEnd$43(this, animator);
                return;
            case 50:
                onAnimationEnd$44(this, animator);
                return;
            case 51:
                onAnimationEnd$45(this, animator);
                return;
            case 52:
                onAnimationEnd$46(this, animator);
                return;
            case 53:
                onAnimationEnd$47(this, animator);
                return;
            case 54:
                onAnimationEnd$48(this, animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animator);
                return;
            case 2:
                onAnimationStart$1(this, animator);
                return;
            case 3:
                onAnimationStart$2(this, animator);
                return;
            case 5:
                onAnimationStart$3(this, animator);
                return;
            case 8:
                onAnimationStart$4(this, animator);
                return;
            case 12:
                onAnimationStart$5(this, animator);
                return;
            case 14:
                onAnimationStart$6(this, animator);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                onAnimationStart$7(this, animator);
                return;
            case 23:
                onAnimationStart$8(this, animator);
                return;
            case 25:
                onAnimationStart$9(this, animator);
                return;
            case 28:
                onAnimationStart$10(this, animator);
                return;
            case 34:
                onAnimationStart$11(this, animator);
                return;
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                onAnimationStart$12(this, animator);
                return;
            case 50:
                onAnimationStart$13(this, animator);
                return;
            case 51:
                onAnimationStart$14(this, animator);
                return;
            case 52:
                onAnimationStart$15(this, animator);
                return;
            case 53:
                onAnimationStart$16(this, animator);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public ALAdapterS10S0100000_13(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationCancel$0(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationCancel(animation);
        UC8 uc8 = (UC8) aLAdapterS10S0100000_13.l0;
        uc8.LJLLI = UCA.SHOW;
        uc8.LJJIFFI().sendEmptyMessageDelayed(((UC8) aLAdapterS10S0100000_13.l0).LJLLILLLL, 2000L);
    }

    public static final void onAnimationCancel$1(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animator) {
        super.onAnimationCancel(animator);
        ((C77869UhF) aLAdapterS10S0100000_13.l0).setLayerType(0, null);
    }

    public static final void onAnimationCancel$2(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationCancel(animation);
        ((C56414MCc) ((U2A) aLAdapterS10S0100000_13.l0).LIZ(R.id.dt8)).LIZJ();
        ((C56414MCc) ((U2A) aLAdapterS10S0100000_13.l0).LIZ(R.id.dt8)).setVisibility(8);
        ((ImageView) ((U2A) aLAdapterS10S0100000_13.l0).LIZ(R.id.fou)).setVisibility(0);
        ((U2A) aLAdapterS10S0100000_13.l0).LIZ(R.id.dtb).setVisibility(8);
    }

    public static final void onAnimationCancel$3(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationCancel(animation);
        ((C56414MCc) ((U2A) aLAdapterS10S0100000_13.l0).LIZ(R.id.dt8)).LIZJ();
    }

    public static final void onAnimationCancel$4(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationCancel(animation);
        ConstraintLayout constraintLayout = ((U1X) aLAdapterS10S0100000_13.l0).LJLZ;
        if (constraintLayout == null) {
            return;
        }
        constraintLayout.setVisibility(8);
    }

    public static final void onAnimationCancel$5(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C75422Tis) aLAdapterS10S0100000_13.l0).getClass();
    }

    public static final void onAnimationCancel$6(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animator) {
        super.onAnimationCancel(animator);
        ((C77870UhG) aLAdapterS10S0100000_13.l0).setLayerType(0, null);
    }

    public static final void onAnimationCancel$7(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animator) {
        super.onAnimationCancel(animator);
        ((C77871UhH) aLAdapterS10S0100000_13.l0).setLayerType(0, null);
    }

    public static final void onAnimationCancel$8(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((ViewOnClickListenerC76430Tz8) aLAdapterS10S0100000_13.l0).getTeamMateEffectEnterLayout().setVisibility(8);
        ((ViewOnClickListenerC76430Tz8) aLAdapterS10S0100000_13.l0).getTeamMateEffectEnterLayout().setAlpha(1.0f);
    }

    public static final void onAnimationCancel$9(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationCancel(animation);
        ((C76260TwO) aLAdapterS10S0100000_13.l0).LJIILJJIL = false;
    }

    public static final void onAnimationEnd$0(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ((ConstraintProperty) aLAdapterS10S0100000_13.l0).visibility(8);
    }

    public static final void onAnimationEnd$1(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        UC8 uc8 = (UC8) aLAdapterS10S0100000_13.l0;
        uc8.LJLLI = UCA.SHOW;
        uc8.LJJIFFI().sendEmptyMessageDelayed(((UC8) aLAdapterS10S0100000_13.l0).LJLLILLLL, 2000L);
    }

    public static final void onAnimationEnd$10(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ((C76414Tys) aLAdapterS10S0100000_13.l0).LJFF();
    }

    public static final void onAnimationEnd$11(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animator) {
        UGR ugr = (UGR) aLAdapterS10S0100000_13.l0;
        ugr.LJLJLLL = 0.85f;
        ugr.LJLILLLLZI = false;
    }

    public static final void onAnimationEnd$12(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((View) aLAdapterS10S0100000_13.l0).setScaleX(1.0f);
        ((View) aLAdapterS10S0100000_13.l0).setScaleY(1.0f);
    }

    public static final void onAnimationEnd$13(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animator) {
        UGV ugv = (UGV) aLAdapterS10S0100000_13.l0;
        ugv.LJLJLLL = 0.85f;
        ugv.LJLILLLLZI = false;
    }

    public static final void onAnimationEnd$14(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animator) {
        ((C76923UGx) aLAdapterS10S0100000_13.l0).LLII = true;
        super.onAnimationEnd(animator);
    }

    public static final void onAnimationEnd$15(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animator) {
        super.onAnimationEnd(animator);
        ((C77869UhF) aLAdapterS10S0100000_13.l0).setLayerType(0, null);
    }

    public static final void onAnimationEnd$16(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animator) {
        UGS ugs = (UGS) aLAdapterS10S0100000_13.l0;
        ugs.LJLL = 1.0f;
        ugs.LJLILLLLZI = false;
    }

    public static final void onAnimationEnd$17(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animator) {
        C76900UGa c76900UGa = (C76900UGa) aLAdapterS10S0100000_13.l0;
        c76900UGa.LJLJLLL = 0.85f;
        c76900UGa.LJLILLLLZI = false;
    }

    public static final void onAnimationEnd$18(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        UYH uyh = (UYH) aLAdapterS10S0100000_13.l0;
        FrameLayout frameLayout = uyh.LJLILLLLZI;
        if (frameLayout != null) {
            C16880lQ.LJLLLL(uyh.LJLJI, frameLayout);
        }
    }

    public static final void onAnimationEnd$19(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        View LIZ = ((U2A) aLAdapterS10S0100000_13.l0).LIZ(R.id.j1m);
        if (LIZ == null) {
            return;
        }
        LIZ.setVisibility(8);
    }

    public static final void onAnimationEnd$2(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        C0NB.LIZ("end width end");
        ((C76414Tys) aLAdapterS10S0100000_13.l0).LIZ(R.id.mcp).setVisibility(8);
    }

    public static final void onAnimationEnd$20(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ((ImageView) ((U2A) aLAdapterS10S0100000_13.l0).LIZ(R.id.fou)).setVisibility(0);
        ((C56414MCc) ((U2A) aLAdapterS10S0100000_13.l0).LIZ(R.id.dt8)).LIZJ();
        ((C56414MCc) ((U2A) aLAdapterS10S0100000_13.l0).LIZ(R.id.dt8)).setVisibility(8);
        ((U2A) aLAdapterS10S0100000_13.l0).LIZ(R.id.dtb).setVisibility(8);
    }

    public static final void onAnimationEnd$21(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ((C56414MCc) ((U2A) aLAdapterS10S0100000_13.l0).LIZ(R.id.dt8)).LIZ((C47061t0) ((U2A) aLAdapterS10S0100000_13.l0).LIZ(R.id.fou));
        ((C56414MCc) ((U2A) aLAdapterS10S0100000_13.l0).LIZ(R.id.dt8)).setVisibility(0);
    }

    public static final void onAnimationEnd$22(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        DataChannel dataChannel = ((U1X) aLAdapterS10S0100000_13.l0).LJLJJLL;
        if (dataChannel != null) {
            dataChannel.pv0(BattleMvpStarAnimationStartEvent.class);
        }
    }

    public static final void onAnimationEnd$23(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ((U2A) aLAdapterS10S0100000_13.l0).LIZ(R.id.dtb).setVisibility(8);
    }

    public static final void onAnimationEnd$24(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        C29701Eo c29701Eo = ((C76477Tzt) aLAdapterS10S0100000_13.l0).LJLIL;
        if (c29701Eo == null) {
            return;
        }
        c29701Eo.setVisibility(8);
    }

    public static final void onAnimationEnd$25(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        C29701Eo c29701Eo = ((C76477Tzt) aLAdapterS10S0100000_13.l0).LJLIL;
        if (c29701Eo != null) {
            c29701Eo.setVisibility(0);
        }
        C29701Eo c29701Eo2 = ((C76477Tzt) aLAdapterS10S0100000_13.l0).LJLIL;
        if (c29701Eo2 != null) {
            C15490jB.LJIIJJI(c29701Eo2, "tiktok_live_match_redesign_resource", "ttlive_match_star_lottie.zip", true, null);
        }
        C76477Tzt c76477Tzt = (C76477Tzt) aLAdapterS10S0100000_13.l0;
        C29701Eo c29701Eo3 = c76477Tzt.LJLIL;
        if (c29701Eo3 != null) {
            c29701Eo3.addAnimatorListener(new ALAdapterS10S0100000_13(c76477Tzt, 30));
        }
    }

    public static final void onAnimationEnd$26(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        C29701Eo c29701Eo = ((C76477Tzt) aLAdapterS10S0100000_13.l0).LJLILLLLZI;
        if (c29701Eo == null) {
            return;
        }
        c29701Eo.setVisibility(8);
    }

    public static final void onAnimationEnd$27(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        C29701Eo c29701Eo = ((C76477Tzt) aLAdapterS10S0100000_13.l0).LJLILLLLZI;
        if (c29701Eo != null) {
            c29701Eo.setVisibility(0);
        }
        C29701Eo c29701Eo2 = ((C76477Tzt) aLAdapterS10S0100000_13.l0).LJLILLLLZI;
        if (c29701Eo2 != null) {
            C15490jB.LJIIJJI(c29701Eo2, "tiktok_live_match_redesign_resource", "ttlive_match_star_lottie.zip", true, null);
        }
        C76477Tzt c76477Tzt = (C76477Tzt) aLAdapterS10S0100000_13.l0;
        C29701Eo c29701Eo3 = c76477Tzt.LJLILLLLZI;
        if (c29701Eo3 != null) {
            c29701Eo3.addAnimatorListener(new ALAdapterS10S0100000_13(c76477Tzt, 32));
        }
    }

    public static final void onAnimationEnd$28(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ((C56414MCc) ((U2A) aLAdapterS10S0100000_13.l0).LIZ(R.id.dt8)).LIZJ();
    }

    public static final void onAnimationEnd$29(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        C29701Eo c29701Eo = ((C76477Tzt) aLAdapterS10S0100000_13.l0).LJLJI;
        if (c29701Eo != null) {
            c29701Eo.setVisibility(8);
        }
        ((C76477Tzt) aLAdapterS10S0100000_13.l0).setVisibility(8);
    }

    public static final void onAnimationEnd$3(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((View) aLAdapterS10S0100000_13.l0).setVisibility(8);
    }

    public static final void onAnimationEnd$30(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        C29701Eo c29701Eo = ((C76477Tzt) aLAdapterS10S0100000_13.l0).LJLJI;
        if (c29701Eo != null) {
            c29701Eo.setVisibility(0);
        }
        C29701Eo c29701Eo2 = ((C76477Tzt) aLAdapterS10S0100000_13.l0).LJLJI;
        if (c29701Eo2 != null) {
            C15490jB.LJIIJJI(c29701Eo2, "tiktok_live_match_redesign_resource", "ttlive_match_star_lottie.zip", true, null);
        }
        C76477Tzt c76477Tzt = (C76477Tzt) aLAdapterS10S0100000_13.l0;
        C29701Eo c29701Eo3 = c76477Tzt.LJLJI;
        if (c29701Eo3 != null) {
            c29701Eo3.addAnimatorListener(new ALAdapterS10S0100000_13(c76477Tzt, 35));
        }
    }

    public static final void onAnimationEnd$31(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        C75838Tpa victoryLapActivityListener = ((U46) aLAdapterS10S0100000_13.l0).getVictoryLapActivityListener();
        if (victoryLapActivityListener != null) {
            victoryLapActivityListener.LIZJ(0, false);
        }
        C29306Beo.LJI(((U46) aLAdapterS10S0100000_13.l0).LIZ(R.id.bdy));
        C29306Beo.LJI(((U46) aLAdapterS10S0100000_13.l0).LIZ(R.id.fbv));
    }

    public static final void onAnimationEnd$32(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ((U46) aLAdapterS10S0100000_13.l0).LJIILJJIL();
    }

    public static final void onAnimationEnd$33(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ConstraintLayout constraintLayout = ((U1X) aLAdapterS10S0100000_13.l0).LJLZ;
        if (constraintLayout == null) {
            return;
        }
        constraintLayout.setVisibility(8);
    }

    public static final void onAnimationEnd$34(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        C75425Tiv c75425Tiv = (C75425Tiv) aLAdapterS10S0100000_13.l0;
        ViewGroup viewGroup = c75425Tiv.LJFF;
        if (viewGroup != null) {
            viewGroup.post(new ARunnableS49S0100000_13(c75425Tiv, 133));
        }
    }

    public static final void onAnimationEnd$35(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        C75425Tiv c75425Tiv = (C75425Tiv) aLAdapterS10S0100000_13.l0;
        ViewGroup viewGroup = c75425Tiv.LJFF;
        if (viewGroup != null) {
            viewGroup.post(new ARunnableS49S0100000_13(c75425Tiv, 134));
        }
    }

    public static final void onAnimationEnd$36(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        C75425Tiv c75425Tiv = (C75425Tiv) aLAdapterS10S0100000_13.l0;
        ViewGroup viewGroup = c75425Tiv.LJFF;
        if (viewGroup != null) {
            viewGroup.post(new ARunnableS49S0100000_13(c75425Tiv, 135));
        }
    }

    public static final void onAnimationEnd$37(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C75422Tis) aLAdapterS10S0100000_13.l0).getClass();
    }

    public static final void onAnimationEnd$38(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animation) {
        Object obj;
        o.LJIIIZ(animation, "animation");
        DataChannel dataChannel = ((MatchItemAssem) aLAdapterS10S0100000_13.l0).LJLLI;
        if (dataChannel != null) {
            obj = dataChannel.kv0(BattleStateChannel.class);
        } else {
            obj = null;
        }
        if (obj != EnumC76178Tv4.START) {
            C0NB.LJ("MatchItemAssem", "battle state not start");
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("waiting List size End  = ");
        LIZ.append(((MatchItemAssem) aLAdapterS10S0100000_13.l0).LLFII.isEmpty());
        C0NB.LIZIZ("MatchItemAssem", X1D.LIZIZ(LIZ));
        MatchItemAssem matchItemAssem = (MatchItemAssem) aLAdapterS10S0100000_13.l0;
        matchItemAssem.LLFFF = false;
        if (!matchItemAssem.LLFII.isEmpty()) {
            ((MatchItemAssem) aLAdapterS10S0100000_13.l0).U3("Animation end");
        }
    }

    public static final void onAnimationEnd$39(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animator) {
        super.onAnimationEnd(animator);
        ((C77870UhG) aLAdapterS10S0100000_13.l0).setLayerType(0, null);
    }

    public static final void onAnimationEnd$4(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C29306Beo.LJI(((U46) aLAdapterS10S0100000_13.l0).LIZ(R.id.dhk));
        C29306Beo.LJI(((U46) aLAdapterS10S0100000_13.l0).LIZ(R.id.dhl));
    }

    public static final void onAnimationEnd$40(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        AbstractC77108UOa abstractC77108UOa = (AbstractC77108UOa) aLAdapterS10S0100000_13.l0;
        abstractC77108UOa.getClass();
        ((IShortTouchService) CN1.LIZ(IShortTouchService.class)).sX(UOS.ID, abstractC77108UOa.LJIIIZ);
    }

    public static final void onAnimationEnd$41(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animator) {
        super.onAnimationEnd(animator);
        ((C77871UhH) aLAdapterS10S0100000_13.l0).setLayerType(0, null);
    }

    public static final void onAnimationEnd$42(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        C0NB.LIZ("end width end");
        CMV cmv = ((MatchCountDownAssem) aLAdapterS10S0100000_13.l0).LJLJL;
        if (cmv != null) {
            cmv.setVisibility(8);
        } else {
            o.LJIJI("tvPKOnlyGiftTip");
            throw null;
        }
    }

    public static final void onAnimationEnd$43(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ConstraintProperty constraintProperty = (ConstraintProperty) aLAdapterS10S0100000_13.l0;
        constraintProperty.margin(7, 0);
        constraintProperty.apply();
    }

    public static final void onAnimationEnd$44(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ((ConstraintProperty) aLAdapterS10S0100000_13.l0).alpha(1.0f);
        ((ConstraintProperty) aLAdapterS10S0100000_13.l0).translationY(0.0f);
    }

    public static final void onAnimationEnd$45(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ((ConstraintProperty) aLAdapterS10S0100000_13.l0).alpha(1.0f);
        ((ConstraintProperty) aLAdapterS10S0100000_13.l0).translationY(0.0f);
    }

    public static final void onAnimationEnd$46(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((ViewOnClickListenerC76430Tz8) aLAdapterS10S0100000_13.l0).getTeamMateEffectEnterLayout().setVisibility(8);
        ((ViewOnClickListenerC76430Tz8) aLAdapterS10S0100000_13.l0).getTeamMateEffectEnterLayout().setAlpha(1.0f);
    }

    public static final void onAnimationEnd$47(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        AbstractC77394UZa abstractC77394UZa = (AbstractC77394UZa) aLAdapterS10S0100000_13.l0;
        if (abstractC77394UZa.LJLLL) {
            UZZ uzz = abstractC77394UZa.LJLJJLL.LJ;
        }
        abstractC77394UZa.LJLLL = false;
    }

    public static final void onAnimationEnd$48(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ((C76260TwO) aLAdapterS10S0100000_13.l0).LJIILJJIL = false;
    }

    public static final void onAnimationEnd$5(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        U46.LJIIJJI(((U46) aLAdapterS10S0100000_13.l0).LIZ(R.id.ga8));
        U46.LJIIJJI(((U46) aLAdapterS10S0100000_13.l0).LIZ(R.id.g71));
        C75838Tpa victoryLapActivityListener = ((U46) aLAdapterS10S0100000_13.l0).getVictoryLapActivityListener();
        if (victoryLapActivityListener != null) {
            victoryLapActivityListener.LIZJ(0, false);
        }
        C75838Tpa victoryLapActivityListener2 = ((U46) aLAdapterS10S0100000_13.l0).getVictoryLapActivityListener();
        if (victoryLapActivityListener2 != null) {
            victoryLapActivityListener2.LIZ("Fixed_icon");
        }
    }

    public static final void onAnimationEnd$6(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ImageView imageView = ((C76624U5k) aLAdapterS10S0100000_13.l0).LJLJI;
        if (imageView != null) {
            imageView.setVisibility(4);
        } else {
            o.LJIJI("rematchSweepView");
            throw null;
        }
    }

    public static final void onAnimationEnd$7(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((U15) aLAdapterS10S0100000_13.l0).removeAnimatorListener(aLAdapterS10S0100000_13);
        super.onAnimationEnd(animation);
        C75023TcR c75023TcR = C75023TcR.LIZLLL;
        c75023TcR.LIZJ("key_animationend");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("key_monitor_finish_");
        LIZ.append("ApplyDetailMonitor");
        c75023TcR.LIZJ(X1D.LIZIZ(LIZ));
        if (!C30922CBq.LIZIZ || c75023TcR.LIZ) {
            return;
        }
        c75023TcR.LIZ = true;
        if (c75023TcR.LIZIZ.size() != 0 && c75023TcR.LIZJ.containsKey(c75023TcR.LIZIZ.get(0))) {
            try {
                Long l = c75023TcR.LIZJ.get(c75023TcR.LIZIZ.get(0));
                if (l == null) {
                    l = 0L;
                }
                long longValue = l.longValue();
                Map<String, Long> LIZ2 = c75023TcR.LIZ();
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(c75023TcR.hashCode());
                LIZ3.append(" total cost ms");
                LIZ2.put(X1D.LIZIZ(LIZ3), Long.valueOf(System.currentTimeMillis() - longValue));
                C28733BPl.LJIILIIL().LIZIZ("ApplyDetailMonitor", LIZ2);
            } catch (Throwable th) {
                C28733BPl LJIILIIL = C28733BPl.LJIILIIL();
                String th2 = th.toString();
                LJIILIIL.getClass();
                C0NE.LIZLLL("ApplyDetailMonitor", th2);
            }
        }
        c75023TcR.LIZJ.clear();
        c75023TcR.LIZIZ.clear();
    }

    public static final void onAnimationEnd$8(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        C29306Beo.LJJLIIIJJI((C76636U5w) aLAdapterS10S0100000_13.l0, false);
    }

    public static final void onAnimationEnd$9(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ((InteractionTitleLayout) aLAdapterS10S0100000_13.l0).I3();
    }

    public static final void onAnimationStart$0(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        ((ConstraintProperty) aLAdapterS10S0100000_13.l0).visibility(0);
    }

    public static final void onAnimationStart$1(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        ((UC8) aLAdapterS10S0100000_13.l0).LJLLI = UCA.SHOWING;
        UC8.LJLZ++;
    }

    public static final void onAnimationStart$10(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        ((U2A) aLAdapterS10S0100000_13.l0).LIZ(R.id.dtb).setVisibility(0);
    }

    public static final void onAnimationStart$11(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        ((C56414MCc) ((U2A) aLAdapterS10S0100000_13.l0).LIZ(R.id.dt8)).LIZIZ(false);
    }

    public static final void onAnimationStart$12(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        C0NB.LIZ(" end width start");
    }

    public static final void onAnimationStart$13(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        ((ConstraintProperty) aLAdapterS10S0100000_13.l0).translationY(0.0f);
    }

    public static final void onAnimationStart$14(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        ((ConstraintProperty) aLAdapterS10S0100000_13.l0).translationY(0.0f);
    }

    public static final void onAnimationStart$15(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((ViewOnClickListenerC76430Tz8) aLAdapterS10S0100000_13.l0).getTeamMateEffectEnterLayout().setVisibility(0);
        ((ViewOnClickListenerC76430Tz8) aLAdapterS10S0100000_13.l0).getTeamMateEffectEnterLayout().setAlpha(1.0f);
    }

    public static final void onAnimationStart$16(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        ((AbstractC77394UZa) aLAdapterS10S0100000_13.l0).LJLLL = true;
    }

    public static final void onAnimationStart$2(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        C0NB.LIZ(" end width start");
    }

    public static final void onAnimationStart$3(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ViewGroup.LayoutParams layoutParams = ((View) aLAdapterS10S0100000_13.l0).getLayoutParams();
        o.LJIIIIZZ(layoutParams, "card.layoutParams");
        if (layoutParams instanceof C018905p) {
            C018905p c018905p = (C018905p) layoutParams;
            c018905p.startToEnd = -1;
            c018905p.endToEnd = 0;
        }
        ((View) aLAdapterS10S0100000_13.l0).setLayoutParams(layoutParams);
    }

    public static final void onAnimationStart$4(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ImageView imageView = ((C76624U5k) aLAdapterS10S0100000_13.l0).LJLJI;
        if (imageView != null) {
            imageView.setVisibility(0);
        } else {
            o.LJIJI("rematchSweepView");
            throw null;
        }
    }

    public static final void onAnimationStart$5(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        C47061t0 c47061t0 = ((InteractionTitleLayout) aLAdapterS10S0100000_13.l0).LL;
        if (c47061t0 != null) {
            c47061t0.setVisibility(0);
        }
        LinearLayout linearLayout = ((InteractionTitleLayout) aLAdapterS10S0100000_13.l0).LJLLILLLL;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
            C47061t0 c47061t02 = ((InteractionTitleLayout) aLAdapterS10S0100000_13.l0).LL;
            if (c47061t02 == null) {
                return;
            }
            c47061t02.setAlpha(0.0f);
            return;
        }
        o.LJIJI("topicPairTitleLayout");
        throw null;
    }

    public static final void onAnimationStart$6(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        ((ImageView) ((C76414Tys) aLAdapterS10S0100000_13.l0).LIZ(R.id.f5b)).setVisibility(0);
        ((C76414Tys) aLAdapterS10S0100000_13.l0).LIZ(R.id.fna).setVisibility(8);
        ((C76414Tys) aLAdapterS10S0100000_13.l0).LIZ(R.id.f5b).setAlpha(0.0f);
    }

    public static final void onAnimationStart$7(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((View) aLAdapterS10S0100000_13.l0).setScaleX(1.0f);
        ((View) aLAdapterS10S0100000_13.l0).setScaleY(1.0f);
    }

    public static final void onAnimationStart$8(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
    }

    public static final void onAnimationStart$9(ALAdapterS10S0100000_13 aLAdapterS10S0100000_13, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        View LIZ = ((U2A) aLAdapterS10S0100000_13.l0).LIZ(R.id.j1m);
        if (LIZ == null) {
            return;
        }
        LIZ.setVisibility(0);
    }
}
