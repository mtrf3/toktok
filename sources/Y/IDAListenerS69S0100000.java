package Y;

import X.BZI;
import X.C04590Fz;
import X.C04740Go;
import X.C05960Lg;
import X.C0KV;
import X.C0NB;
import X.C12U;
import X.C16880lQ;
import X.C28787BRn;
import X.C29306Beo;
import X.C29701Eo;
import X.C2H2;
import X.C30031Fv;
import X.C45101pq;
import X.C87277YNd;
import X.ChoreographerFrameCallbackC30341Ha;
import X.InterfaceC266512v;
import android.animation.Animator;
import com.bytedance.android.live.broadcast.game.partnership.widget.GamePartnershipAudienceEntranceWidget;
import com.bytedance.android.live.broadcast.speeddetector.GamePreparationNetworkSpeedDetectionDialog;
import com.bytedance.android.live.common.keyboard.MeasureLinearLayout;
import com.bytedance.android.live.effect.livegoal.LiveGoalBackgroundDialogFragment;
import com.bytedance.android.live.kyc.KYCCameraActivity;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public class IDAListenerS69S0100000 implements Animator.AnimatorListener {
    public final int $t;
    public Object l0;

    public static final void onAnimationCancel$17(IDAListenerS69S0100000 iDAListenerS69S0100000, Animator animator) {
    }

    public static final void onAnimationCancel$2(IDAListenerS69S0100000 iDAListenerS69S0100000, Animator animator) {
    }

    public static final void onAnimationCancel$4(IDAListenerS69S0100000 iDAListenerS69S0100000, Animator animator) {
    }

    public static final void onAnimationEnd$2(IDAListenerS69S0100000 iDAListenerS69S0100000, Animator animator) {
    }

    public static final void onAnimationRepeat$17(IDAListenerS69S0100000 iDAListenerS69S0100000, Animator animator) {
    }

    public static final void onAnimationRepeat$2(IDAListenerS69S0100000 iDAListenerS69S0100000, Animator animator) {
    }

    public static final void onAnimationRepeat$4(IDAListenerS69S0100000 iDAListenerS69S0100000, Animator animator) {
    }

    public static final void onAnimationStart$17(IDAListenerS69S0100000 iDAListenerS69S0100000, Animator animator) {
    }

    public static final void onAnimationStart$4(IDAListenerS69S0100000 iDAListenerS69S0100000, Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationCancel$0(this, animator);
                return;
            case 1:
                onAnimationCancel$1(this, animator);
                return;
            case 2:
                onAnimationCancel$2(this, animator);
                return;
            case 3:
                o.LJIIIZ(animator, "p0");
                return;
            case 4:
                onAnimationCancel$4(this, animator);
                return;
            case 5:
                o.LJIIIZ(animator, "animator");
                return;
            case 6:
                o.LJIIIZ(animator, "animator");
                return;
            case 7:
                onAnimationCancel$7(this, animator);
                return;
            case 8:
                onAnimationCancel$8(this, animator);
                return;
            case 9:
                o.LJIIIZ(animator, "animator");
                return;
            case 10:
                o.LJIIIZ(animator, "animation");
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                o.LJIIIZ(animator, "animation");
                return;
            case 12:
                o.LJIIIZ(animator, "animation");
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                o.LJIIIZ(animator, "animator");
                return;
            case 14:
                o.LJIIIZ(animator, "animator");
                return;
            case 15:
                o.LJIIIZ(animator, "animation");
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                o.LJIIIZ(animator, "animation");
                return;
            case 17:
                onAnimationCancel$17(this, animator);
                return;
            default:
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator);
                return;
            case 1:
                onAnimationEnd$1(this, animator);
                return;
            case 2:
                onAnimationEnd$2(this, animator);
                return;
            case 3:
                onAnimationEnd$3(this, animator);
                return;
            case 4:
                onAnimationEnd$4(this, animator);
                return;
            case 5:
                o.LJIIIZ(animator, "animator");
                return;
            case 6:
                onAnimationEnd$6(this, animator);
                return;
            case 7:
                onAnimationEnd$7(this, animator);
                return;
            case 8:
                onAnimationEnd$8(this, animator);
                return;
            case 9:
                o.LJIIIZ(animator, "animator");
                return;
            case 10:
                o.LJIIIZ(animator, "animation");
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                o.LJIIIZ(animator, "animation");
                return;
            case 12:
                onAnimationEnd$12(this, animator);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                onAnimationEnd$13(this, animator);
                return;
            case 14:
                onAnimationEnd$14(this, animator);
                return;
            case 15:
                onAnimationEnd$15(this, animator);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                onAnimationEnd$16(this, animator);
                return;
            case 17:
                onAnimationEnd$17(this, animator);
                return;
            default:
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.$t) {
            case 0:
                o.LJIIIZ(animator, "animator");
                return;
            case 1:
                o.LJIIIZ(animator, "animator");
                return;
            case 2:
                onAnimationRepeat$2(this, animator);
                return;
            case 3:
                o.LJIIIZ(animator, "p0");
                return;
            case 4:
                onAnimationRepeat$4(this, animator);
                return;
            case 5:
                o.LJIIIZ(animator, "animator");
                return;
            case 6:
                o.LJIIIZ(animator, "animator");
                return;
            case 7:
                o.LJIIIZ(animator, "animation");
                return;
            case 8:
                onAnimationRepeat$8(this, animator);
                return;
            case 9:
                onAnimationRepeat$9(this, animator);
                return;
            case 10:
                o.LJIIIZ(animator, "animation");
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                o.LJIIIZ(animator, "animation");
                return;
            case 12:
                o.LJIIIZ(animator, "animation");
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                o.LJIIIZ(animator, "animator");
                return;
            case 14:
                o.LJIIIZ(animator, "animator");
                return;
            case 15:
                o.LJIIIZ(animator, "animation");
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                o.LJIIIZ(animator, "animation");
                return;
            case 17:
                onAnimationRepeat$17(this, animator);
                return;
            default:
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 0:
                o.LJIIIZ(animator, "animator");
                return;
            case 1:
                o.LJIIIZ(animator, "animator");
                return;
            case 2:
                onAnimationStart$2(this, animator);
                return;
            case 3:
                o.LJIIIZ(animator, "p0");
                return;
            case 4:
                onAnimationStart$4(this, animator);
                return;
            case 5:
                onAnimationStart$5(this, animator);
                return;
            case 6:
                o.LJIIIZ(animator, "animator");
                return;
            case 7:
                onAnimationStart$7(this, animator);
                return;
            case 8:
                onAnimationStart$8(this, animator);
                return;
            case 9:
                o.LJIIIZ(animator, "animator");
                return;
            case 10:
                onAnimationStart$10(this, animator);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onAnimationStart$11(this, animator);
                return;
            case 12:
                o.LJIIIZ(animator, "animation");
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                o.LJIIIZ(animator, "animator");
                return;
            case 14:
                o.LJIIIZ(animator, "animator");
                return;
            case 15:
                o.LJIIIZ(animator, "animation");
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                onAnimationStart$16(this, animator);
                return;
            case 17:
                onAnimationStart$17(this, animator);
                return;
            default:
                return;
        }
    }

    public IDAListenerS69S0100000(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationCancel$0(IDAListenerS69S0100000 iDAListenerS69S0100000, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((C04590Fz) iDAListenerS69S0100000.l0).LJII = null;
    }

    public static final void onAnimationCancel$1(IDAListenerS69S0100000 iDAListenerS69S0100000, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((C04590Fz) iDAListenerS69S0100000.l0).LJI = null;
    }

    public static final void onAnimationCancel$7(IDAListenerS69S0100000 iDAListenerS69S0100000, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C29701Eo c29701Eo = ((KYCCameraActivity) iDAListenerS69S0100000.l0).LJLILLLLZI;
        if (c29701Eo == null) {
            return;
        }
        c29701Eo.setVisibility(8);
    }

    public static final void onAnimationCancel$8(IDAListenerS69S0100000 iDAListenerS69S0100000, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C0NB.LJIIIZ("GamePreparationNetworkSpeedDetectionDialog", "onAnimationCancel");
        GamePreparationNetworkSpeedDetectionDialog gamePreparationNetworkSpeedDetectionDialog = (GamePreparationNetworkSpeedDetectionDialog) iDAListenerS69S0100000.l0;
        gamePreparationNetworkSpeedDetectionDialog.LLIIIJ = true;
        if (!gamePreparationNetworkSpeedDetectionDialog.isHidden()) {
            ((GamePreparationNetworkSpeedDetectionDialog) iDAListenerS69S0100000.l0).isDetached();
        }
    }

    public static final void onAnimationEnd$0(IDAListenerS69S0100000 iDAListenerS69S0100000, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((C04590Fz) iDAListenerS69S0100000.l0).LJII = null;
    }

    public static final void onAnimationEnd$1(IDAListenerS69S0100000 iDAListenerS69S0100000, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((C04590Fz) iDAListenerS69S0100000.l0).LJI = null;
    }

    public static final void onAnimationEnd$12(IDAListenerS69S0100000 iDAListenerS69S0100000, Animator animation) {
        InterfaceC266512v interfaceC266512v;
        o.LJIIIZ(animation, "animation");
        ((C12U) iDAListenerS69S0100000.l0).LJIIL.setAlpha(1.0f);
        ((C12U) iDAListenerS69S0100000.l0).LJIIJ();
        if (((C12U) iDAListenerS69S0100000.l0).LJIILJJIL() == null && (interfaceC266512v = ((C12U) iDAListenerS69S0100000.l0).LIZLLL) != null) {
            interfaceC266512v.LJJIJIIJI(false);
        }
        ((C12U) iDAListenerS69S0100000.l0).LIZ();
        ((C12U) iDAListenerS69S0100000.l0).LJJIII = false;
    }

    public static final void onAnimationEnd$13(IDAListenerS69S0100000 iDAListenerS69S0100000, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((C12U) iDAListenerS69S0100000.l0).LIZ();
        if (((C12U) iDAListenerS69S0100000.l0).LJIILJJIL() != null) {
            ((C12U) iDAListenerS69S0100000.l0).LIZLLL();
        }
    }

    public static final void onAnimationEnd$14(IDAListenerS69S0100000 iDAListenerS69S0100000, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((C12U) iDAListenerS69S0100000.l0).LIZ();
    }

    public static final void onAnimationEnd$15(IDAListenerS69S0100000 iDAListenerS69S0100000, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C12U) iDAListenerS69S0100000.l0).LJIJI();
        ((C12U) iDAListenerS69S0100000.l0).LJ.LIZLLL();
        C12U c12u = (C12U) iDAListenerS69S0100000.l0;
        C45101pq c45101pq = c12u.LIZ.LIZ;
        c12u.LJ.LIZ.LLLLZLLIL(c45101pq.LJLJJL - c12u.LJJIFFI, c45101pq.LJLJJLL - c12u.LJJII);
        ((C12U) iDAListenerS69S0100000.l0).LJIIL();
    }

    public static final void onAnimationEnd$16(IDAListenerS69S0100000 iDAListenerS69S0100000, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C2H2) iDAListenerS69S0100000.l0).LJLLJ = false;
    }

    public static final void onAnimationEnd$17(IDAListenerS69S0100000 iDAListenerS69S0100000, Animator animator) {
        ((MeasureLinearLayout) iDAListenerS69S0100000.l0).LJLJJL = false;
    }

    public static final void onAnimationEnd$3(IDAListenerS69S0100000 iDAListenerS69S0100000, Animator p0) {
        o.LJIIIZ(p0, "p0");
        C87277YNd.LJJIIZ(((C30031Fv) iDAListenerS69S0100000.l0).LJLJLJ);
    }

    public static final void onAnimationEnd$4(IDAListenerS69S0100000 iDAListenerS69S0100000, Animator animator) {
        C0KV c0kv = (C0KV) iDAListenerS69S0100000.l0;
        c0kv.LLILLL = true;
        c0kv.LJFF();
        C16880lQ.LJLLI(((C0KV) iDAListenerS69S0100000.l0).LLIIJI, iDAListenerS69S0100000);
    }

    public static final void onAnimationEnd$6(IDAListenerS69S0100000 iDAListenerS69S0100000, Animator animator) {
        o.LJIIIZ(animator, "animator");
        C29306Beo.LJI(((C05960Lg) iDAListenerS69S0100000.l0).getFavoriteTextView());
    }

    public static final void onAnimationEnd$7(IDAListenerS69S0100000 iDAListenerS69S0100000, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C29701Eo c29701Eo = ((KYCCameraActivity) iDAListenerS69S0100000.l0).LJLILLLLZI;
        if (c29701Eo == null) {
            return;
        }
        c29701Eo.setVisibility(8);
    }

    public static final void onAnimationEnd$8(IDAListenerS69S0100000 iDAListenerS69S0100000, Animator animation) {
        Animator animator;
        o.LJIIIZ(animation, "animation");
        C0NB.LJIIIZ("GamePreparationNetworkSpeedDetectionDialog", "onAnimationEnd");
        if (((GamePreparationNetworkSpeedDetectionDialog) iDAListenerS69S0100000.l0).isHidden() || ((GamePreparationNetworkSpeedDetectionDialog) iDAListenerS69S0100000.l0).isDetached()) {
            return;
        }
        GamePreparationNetworkSpeedDetectionDialog gamePreparationNetworkSpeedDetectionDialog = (GamePreparationNetworkSpeedDetectionDialog) iDAListenerS69S0100000.l0;
        if (gamePreparationNetworkSpeedDetectionDialog.LLIIIJ || (animator = gamePreparationNetworkSpeedDetectionDialog.LLF) == null) {
            return;
        }
        animator.start();
    }

    public static final void onAnimationRepeat$8(IDAListenerS69S0100000 iDAListenerS69S0100000, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C0NB.LJIIIZ("GamePreparationNetworkSpeedDetectionDialog", "onAnimationRepeat");
    }

    public static final void onAnimationRepeat$9(IDAListenerS69S0100000 iDAListenerS69S0100000, Animator animator) {
        o.LJIIIZ(animator, "animator");
        ((LiveGoalBackgroundDialogFragment) iDAListenerS69S0100000.l0).vl();
    }

    public static final void onAnimationStart$10(IDAListenerS69S0100000 iDAListenerS69S0100000, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C29701Eo c29701Eo = ((GamePartnershipAudienceEntranceWidget) iDAListenerS69S0100000.l0).LJLILLLLZI;
        if (c29701Eo != null) {
            c29701Eo.setVisibility(4);
        }
    }

    public static final void onAnimationStart$11(IDAListenerS69S0100000 iDAListenerS69S0100000, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C29701Eo c29701Eo = ((GamePartnershipAudienceEntranceWidget) iDAListenerS69S0100000.l0).LJLIL;
        if (c29701Eo != null) {
            c29701Eo.setVisibility(4);
        }
    }

    public static final void onAnimationStart$16(IDAListenerS69S0100000 iDAListenerS69S0100000, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C2H2) iDAListenerS69S0100000.l0).LJLLJ = true;
    }

    public static final void onAnimationStart$2(IDAListenerS69S0100000 iDAListenerS69S0100000, Animator animator) {
        float LIZJ;
        C04740Go c04740Go = (C04740Go) iDAListenerS69S0100000.l0;
        c04740Go.LJZL = true;
        ChoreographerFrameCallbackC30341Ha choreographerFrameCallbackC30341Ha = c04740Go.LJLJI;
        if (choreographerFrameCallbackC30341Ha.LJLJI > 0.0f) {
            LIZJ = choreographerFrameCallbackC30341Ha.LIZLLL();
        } else {
            LIZJ = choreographerFrameCallbackC30341Ha.LIZJ();
        }
        c04740Go.LL = LIZJ;
    }

    public static final void onAnimationStart$5(IDAListenerS69S0100000 iDAListenerS69S0100000, Animator animator) {
        o.LJIIIZ(animator, "animator");
        C29306Beo.LJJLJLI(((C05960Lg) iDAListenerS69S0100000.l0).getFavoriteTextView());
        BZI LIZ = C28787BRn.LIZ("livesdk_live_sticker_favorite_motion_guide");
        LIZ.LJIILLIIL(((C05960Lg) iDAListenerS69S0100000.l0).LJLL);
        LIZ.LJJIIJZLJL();
    }

    public static final void onAnimationStart$7(IDAListenerS69S0100000 iDAListenerS69S0100000, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C29701Eo c29701Eo = ((KYCCameraActivity) iDAListenerS69S0100000.l0).LJLILLLLZI;
        if (c29701Eo == null) {
            return;
        }
        c29701Eo.setVisibility(0);
    }

    public static final void onAnimationStart$8(IDAListenerS69S0100000 iDAListenerS69S0100000, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C0NB.LJIIIZ("GamePreparationNetworkSpeedDetectionDialog", "onAnimationStart");
    }
}
