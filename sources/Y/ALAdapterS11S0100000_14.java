package Y;

import X.AbstractC80872Voa;
import X.C0FH;
import X.C136865Ys;
import X.C152175y9;
import X.C16300kU;
import X.C16330kX;
import X.C16880lQ;
import X.C36922EeM;
import X.C61447O9r;
import X.C6QQ;
import X.C76800UCe;
import X.C79866VWc;
import X.C80003VaZ;
import X.C80164VdA;
import X.C80838Vo2;
import X.C80881Voj;
import X.C80883Vol;
import X.C80884Vom;
import X.C81019Vqx;
import X.C81147Vt1;
import X.C81150Vt4;
import X.C81227VuJ;
import X.C81266Vuw;
import X.C81291VvL;
import X.C81310Vve;
import X.C81400Vx6;
import X.C81581W0b;
import X.C81651W2t;
import X.C81658W3a;
import X.C81946WEc;
import X.C82000WGe;
import X.C82011WGp;
import X.C82308WSa;
import X.C82454WXq;
import X.C82553Wab;
import X.C82554Wac;
import X.C82567Wap;
import X.C82706Wd4;
import X.C82946Wgw;
import X.C82948Wgy;
import X.C83050Wic;
import X.C83093WjJ;
import X.C83101WjR;
import X.C83209WlB;
import X.EnumC80174VdK;
import X.HandlerC81148Vt2;
import X.HandlerC81149Vt3;
import X.InterfaceC65784Pro;
import X.InterfaceC80386Vgk;
import X.InterfaceC81151Vt5;
import X.InterfaceC81152Vt6;
import X.InterfaceC81662W3e;
import X.InterfaceC82570Was;
import X.InterfaceC82947Wgx;
import X.RunnableC80167VdD;
import X.RunnableC80173VdJ;
import X.TKH;
import X.ViewOnTouchListenerC81419VxP;
import X.W0F;
import X.W0G;
import X.WET;
import X.WEW;
import X.WEX;
import X.WEY;
import X.WLC;
import X.WN3;
import X.WNG;
import X.WNT;
import X.WPI;
import X.WPJ;
import X.WVO;
import X.WVP;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.transformation.ExpandableTransformationBehavior;
import com.ss.android.ugc.aweme.feed.assem.progressbar.VideoProgressBarAssem;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public class ALAdapterS11S0100000_14 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
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
                onAnimationEnd$5(this, animator);
                return;
            case 6:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
            case 50:
            case 52:
            default:
                super.onAnimationEnd(animator);
                return;
            case 7:
                onAnimationEnd$6(this, animator);
                return;
            case 8:
                onAnimationEnd$7(this, animator);
                return;
            case 9:
                onAnimationEnd$8(this, animator);
                return;
            case 10:
                onAnimationEnd$9(this, animator);
                return;
            case 12:
                onAnimationEnd$10(this, animator);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                onAnimationEnd$11(this, animator);
                return;
            case 14:
                onAnimationEnd$12(this, animator);
                return;
            case 15:
                onAnimationEnd$13(this, animator);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                onAnimationEnd$14(this, animator);
                return;
            case 17:
                onAnimationEnd$15(this, animator);
                return;
            case 18:
                onAnimationEnd$16(this, animator);
                return;
            case 19:
                onAnimationEnd$17(this, animator);
                return;
            case 20:
                onAnimationEnd$18(this, animator);
                return;
            case 21:
                onAnimationEnd$19(this, animator);
                return;
            case 22:
                onAnimationEnd$20(this, animator);
                return;
            case 23:
                onAnimationEnd$21(this, animator);
                return;
            case 24:
                onAnimationEnd$22(this, animator);
                return;
            case 25:
                onAnimationEnd$23(this, animator);
                return;
            case 26:
                onAnimationEnd$24(this, animator);
                return;
            case 27:
                onAnimationEnd$25(this, animator);
                return;
            case 28:
                onAnimationEnd$26(this, animator);
                return;
            case 29:
                onAnimationEnd$27(this, animator);
                return;
            case 30:
                onAnimationEnd$28(this, animator);
                return;
            case 31:
                onAnimationEnd$29(this, animator);
                return;
            case 32:
                onAnimationEnd$30(this, animator);
                return;
            case 33:
                onAnimationEnd$31(this, animator);
                return;
            case 34:
                onAnimationEnd$32(this, animator);
                return;
            case 35:
                onAnimationEnd$33(this, animator);
                return;
            case 36:
                onAnimationEnd$34(this, animator);
                return;
            case 37:
                onAnimationEnd$35(this, animator);
                return;
            case 38:
                onAnimationEnd$36(this, animator);
                return;
            case 39:
                onAnimationEnd$37(this, animator);
                return;
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                onAnimationEnd$38(this, animator);
                return;
            case 41:
                onAnimationEnd$39(this, animator);
                return;
            case 42:
                onAnimationEnd$40(this, animator);
                return;
            case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                onAnimationEnd$41(this, animator);
                return;
            case 44:
                onAnimationEnd$42(this, animator);
                return;
            case 45:
                onAnimationEnd$43(this, animator);
                return;
            case 46:
                onAnimationEnd$44(this, animator);
                return;
            case 47:
                onAnimationEnd$45(this, animator);
                return;
            case C61447O9r.LJIIJ:
                onAnimationEnd$46(this, animator);
                return;
            case 51:
                onAnimationEnd$47(this, animator);
                return;
            case 53:
                onAnimationEnd$48(this, animator);
                return;
            case 54:
                onAnimationEnd$49(this, animator);
                return;
            case 55:
                onAnimationEnd$50(this, animator);
                return;
            case 56:
                onAnimationEnd$51(this, animator);
                return;
            case 57:
                onAnimationEnd$52(this, animator);
                return;
            case 58:
                onAnimationEnd$53(this, animator);
                return;
            case 59:
                onAnimationEnd$54(this, animator);
                return;
            case 60:
                onAnimationEnd$55(this, animator);
                return;
            case 61:
                onAnimationEnd$56(this, animator);
                return;
            case BaseNotice.CREATOR /* 62 */:
                onAnimationEnd$57(this, animator);
                return;
            case 63:
                onAnimationEnd$58(this, animator);
                return;
            case 64:
                onAnimationEnd$59(this, animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.$t) {
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                onAnimationRepeat$0(this, animator);
                return;
            case 52:
                onAnimationRepeat$1(this, animator);
                return;
            case 53:
                onAnimationRepeat$2(this, animator);
                return;
            case 65:
                onAnimationRepeat$3(this, animator);
                return;
            default:
                super.onAnimationRepeat(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animator);
                return;
            case 1:
                onAnimationStart$1(this, animator);
                return;
            case 4:
                onAnimationStart$2(this, animator);
                return;
            case 5:
                onAnimationStart$3(this, animator);
                return;
            case 6:
                onAnimationStart$4(this, animator);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onAnimationStart$5(this, animator);
                return;
            case 32:
                onAnimationStart$6(this, animator);
                return;
            case 34:
                onAnimationStart$7(this, animator);
                return;
            case 50:
                onAnimationStart$8(this, animator);
                return;
            case 56:
                onAnimationStart$9(this, animator);
                return;
            case 57:
                onAnimationStart$10(this, animator);
                return;
            case BaseNotice.CREATOR /* 62 */:
                onAnimationStart$11(this, animator);
                return;
            case 63:
                onAnimationStart$12(this, animator);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public ALAdapterS11S0100000_14(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationEnd$0(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        C79866VWc c79866VWc = (C79866VWc) aLAdapterS11S0100000_14.l0;
        c79866VWc.LJLJI.setShader(c79866VWc.LJLJJI.getShader());
        C79866VWc c79866VWc2 = (C79866VWc) aLAdapterS11S0100000_14.l0;
        c79866VWc2.LJLJLLL = c79866VWc2.LJLJL;
        c79866VWc2.LJLL = c79866VWc2.LJLJLJ;
        c79866VWc2.LJLJJL = 0.0f;
        c79866VWc2.LJLLI = false;
        SharedPreferences.Editor edit = c79866VWc2.LJLLILLLL.edit();
        edit.putFloat("qr_code_background_sp_center_x", ((C79866VWc) aLAdapterS11S0100000_14.l0).LJLJLLL);
        edit.putFloat("qr_code_background_sp_center_y", ((C79866VWc) aLAdapterS11S0100000_14.l0).LJLL);
        edit.putInt("qr_code_background_sp_color_index", ((C79866VWc) aLAdapterS11S0100000_14.l0).LJLIL);
        edit.apply();
    }

    public static final void onAnimationEnd$1(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ARunnableS13S0210000_14 aRunnableS13S0210000_14 = (ARunnableS13S0210000_14) aLAdapterS11S0100000_14.l0;
        if (!aRunnableS13S0210000_14.z2) {
            ((C136865Ys) aRunnableS13S0210000_14.l1).setVisibility(8);
            ((C81266Vuw) ((ARunnableS13S0210000_14) aLAdapterS11S0100000_14.l0).l0).getClass();
            ((C81266Vuw) ((ARunnableS13S0210000_14) aLAdapterS11S0100000_14.l0).l0).LIZIZ();
        }
    }

    public static final void onAnimationEnd$10(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        View view = ((C82454WXq) aLAdapterS11S0100000_14.l0).LJLLILLLL;
        if (view != null) {
            view.setVisibility(8);
        } else {
            o.LJIJI("fakeFlashView");
            throw null;
        }
    }

    public static final void onAnimationEnd$11(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        WVP wvp = ((WVO) aLAdapterS11S0100000_14.l0).LJLIL;
        if (wvp != null) {
            wvp.setScaleX(1.0f);
            wvp.setScaleY(1.0f);
            wvp.setVisibility(8);
            WVP wvp2 = ((WVO) aLAdapterS11S0100000_14.l0).LJLIL;
            if (wvp2 != null) {
                Object parent = wvp2.getParent();
                o.LJII(parent, "null cannot be cast to non-null type android.view.View");
                ((View) parent).setAlpha(1.0f);
                return;
            }
            o.LJIJI("recordLayout");
            throw null;
        }
        o.LJIJI("recordLayout");
        throw null;
    }

    public static final void onAnimationEnd$12(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ((WLC) aLAdapterS11S0100000_14.l0).LLFZ.LJII(C76800UCe.LIZ);
    }

    public static final void onAnimationEnd$13(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animator) {
        super.onAnimationEnd(animator);
        ((C82000WGe) aLAdapterS11S0100000_14.l0).getClass();
    }

    public static final void onAnimationEnd$14(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animator) {
        super.onAnimationEnd(animator);
        ((C82000WGe) aLAdapterS11S0100000_14.l0).LLFF = null;
    }

    public static final void onAnimationEnd$15(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ((C82011WGp) aLAdapterS11S0100000_14.l0).LJIIJJI();
    }

    public static final void onAnimationEnd$16(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((W0G) ((ARunnableS50S0100000_14) aLAdapterS11S0100000_14.l0).l0).LJJLIIIJL(true);
    }

    public static final void onAnimationEnd$17(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((W0G) aLAdapterS11S0100000_14.l0).LJLLILLLL.run();
    }

    public static final void onAnimationEnd$18(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animator) {
        InterfaceC81662W3e interfaceC81662W3e = ((C81658W3a) aLAdapterS11S0100000_14.l0).LJLIL;
        if (interfaceC81662W3e != null) {
            interfaceC81662W3e.LIZ();
        }
    }

    public static final void onAnimationEnd$19(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C81227VuJ) aLAdapterS11S0100000_14.l0).setMTouchable(true);
        super.onAnimationEnd(animation);
    }

    public static final void onAnimationEnd$2(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animator) {
        ((BaseTransientBottomBar) aLAdapterS11S0100000_14.l0).LIZLLL();
    }

    public static final void onAnimationEnd$20(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animator) {
        super.onAnimationEnd(animator);
        ((C83209WlB) ((ARunnableS33S0200000_14) aLAdapterS11S0100000_14.l0).l1).LJLIL.LJFF();
        ((C83209WlB) ((ARunnableS33S0200000_14) aLAdapterS11S0100000_14.l0).l1).LJFF();
        ((InterfaceC82947Wgx) ((ARunnableS33S0200000_14) aLAdapterS11S0100000_14.l0).l0).LJFF();
    }

    public static final void onAnimationEnd$21(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animator) {
        super.onAnimationEnd(animator);
        ((C82553Wab) aLAdapterS11S0100000_14.l0).setVisibility(8);
    }

    public static final void onAnimationEnd$22(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animator) {
        super.onAnimationEnd(animator);
        C82554Wac c82554Wac = (C82554Wac) aLAdapterS11S0100000_14.l0;
        c82554Wac.LJLJL = false;
        InterfaceC82570Was interfaceC82570Was = c82554Wac.LJLL;
        if (interfaceC82570Was != null) {
            C82567Wap c82567Wap = (C82567Wap) interfaceC82570Was;
            c82567Wap.LIZ.LJLIL.setAlpha(1.0f);
            c82567Wap.LIZ.LJLILLLLZI.setAlpha(1.0f);
        }
    }

    public static final void onAnimationEnd$23(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ((C81019Vqx) aLAdapterS11S0100000_14.l0).LJLIL.LIZLLL.invoke();
    }

    public static final void onAnimationEnd$24(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        if (!C16330kX.LIZIZ(((C83050Wic) ((ARunnableS25S0300000_14) aLAdapterS11S0100000_14.l0).l0).LJLJJI)) {
            return;
        }
        TKH tkh = ((C83050Wic) ((ARunnableS25S0300000_14) aLAdapterS11S0100000_14.l0).l0).LJLIL;
        if (tkh != null) {
            tkh.LJFF();
        }
        InterfaceC82947Wgx interfaceC82947Wgx = (InterfaceC82947Wgx) ((ARunnableS25S0300000_14) aLAdapterS11S0100000_14.l0).l2;
        if (interfaceC82947Wgx != null) {
            interfaceC82947Wgx.LJFF();
        }
    }

    public static final void onAnimationEnd$25(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animator) {
        ((ExpandableTransformationBehavior) aLAdapterS11S0100000_14.l0).LIZIZ = null;
    }

    public static final void onAnimationEnd$26(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animation) {
        o.LJIIIZ(animation, "animation");
        if (o.LJ(((C81310Vve) aLAdapterS11S0100000_14.l0).LJII, animation)) {
            ((C81310Vve) aLAdapterS11S0100000_14.l0).LJII = null;
        }
    }

    public static final void onAnimationEnd$27(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animator) {
        ((HideBottomViewOnScrollBehavior) aLAdapterS11S0100000_14.l0).LIZJ = null;
    }

    public static final void onAnimationEnd$28(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animator) {
        super.onAnimationEnd(animator);
        ((C81291VvL) aLAdapterS11S0100000_14.l0).getClass();
    }

    public static final void onAnimationEnd$29(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animator) {
        ((ViewOnTouchListenerC81419VxP) aLAdapterS11S0100000_14.l0).LJI();
        ((ViewOnTouchListenerC81419VxP) aLAdapterS11S0100000_14.l0).invalidate();
    }

    public static final void onAnimationEnd$3(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animator) {
        ((BaseTransientBottomBar) aLAdapterS11S0100000_14.l0).LIZJ();
    }

    public static final void onAnimationEnd$30(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animator) {
        ((InterfaceC80386Vgk) aLAdapterS11S0100000_14.l0).LIZ();
    }

    public static final void onAnimationEnd$31(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animation) {
        o.LJIIIZ(animation, "animation");
        TKH tkh = ((C83093WjJ) ((ARunnableS33S0200000_14) aLAdapterS11S0100000_14.l0).l0).LJLIL;
        if (tkh != null) {
            tkh.LJFF();
        }
        InterfaceC82947Wgx interfaceC82947Wgx = (InterfaceC82947Wgx) ((ARunnableS33S0200000_14) aLAdapterS11S0100000_14.l0).l1;
        if (interfaceC82947Wgx != null) {
            interfaceC82947Wgx.LJFF();
        }
    }

    public static final void onAnimationEnd$32(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animation) {
        o.LJIIIZ(animation, "animation");
        WPJ wpj = (WPJ) aLAdapterS11S0100000_14.l0;
        FilterBean filterBean = wpj.LIZLLL;
        if (filterBean != null) {
            wpj.LIZJ = filterBean;
            wpj.LIZ.LIZ = 0.0f;
            WPI wpi = wpj.LIZIZ;
            if (wpi != null) {
                wpi.LIZ(filterBean);
            }
            WPJ wpj2 = (WPJ) aLAdapterS11S0100000_14.l0;
            wpj2.LJIIIZ.SX(false, wpj2.LIZJ, true, true);
        }
        ((WPJ) aLAdapterS11S0100000_14.l0).LIZ.LIZIZ = false;
    }

    public static final void onAnimationEnd$33(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((W0F) aLAdapterS11S0100000_14.l0).LJJLIIIJL(true);
    }

    public static final void onAnimationEnd$34(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((W0F) aLAdapterS11S0100000_14.l0).LJLLL.run();
    }

    public static final void onAnimationEnd$35(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C81581W0b) aLAdapterS11S0100000_14.l0).LJJLIIIJL(true);
    }

    public static final void onAnimationEnd$36(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animator) {
        super.onAnimationEnd(animator);
        WNG wng = ((WN3) aLAdapterS11S0100000_14.l0).LIZJ;
        if (!wng.LIZIZ) {
            wng.LIZIZ = true;
            wng.LIZ.run();
        }
        C16880lQ.LJLJLJ(aLAdapterS11S0100000_14, ((WN3) aLAdapterS11S0100000_14.l0).LIZIZ);
    }

    public static final void onAnimationEnd$37(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animation) {
        o.LJIIIZ(animation, "animation");
        InterfaceC81152Vt6 interfaceC81152Vt6 = ((C81147Vt1) aLAdapterS11S0100000_14.l0).LJLJJI;
        if (interfaceC81152Vt6 != null) {
            o.LJI(interfaceC81152Vt6);
            interfaceC81152Vt6.onHide();
            ((C81147Vt1) aLAdapterS11S0100000_14.l0).LJLJJL = null;
        }
    }

    public static final void onAnimationEnd$38(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animator) {
        super.onAnimationEnd(animator);
        ((C82000WGe) ((ARunnableS0S0600001_14) aLAdapterS11S0100000_14.l0).l5).LLD = null;
    }

    public static final void onAnimationEnd$39(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animator) {
        super.onAnimationEnd(animator);
        ((C82000WGe) ((ARunnableS0S0600001_14) aLAdapterS11S0100000_14.l0).l5).LLD = null;
    }

    public static final void onAnimationEnd$4(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animator) {
        ((BaseTransientBottomBar) aLAdapterS11S0100000_14.l0).LIZLLL();
    }

    public static final void onAnimationEnd$40(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animator) {
        super.onAnimationEnd(animator);
        ((C82000WGe) aLAdapterS11S0100000_14.l0).LLD = null;
    }

    public static final void onAnimationEnd$41(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C81150Vt4 c81150Vt4 = ((VideoProgressBarAssem) aLAdapterS11S0100000_14.l0).LLI;
        if (c81150Vt4 != null) {
            c81150Vt4.LIZ();
            C36922EeM.LIZLLL(4, "VoiceAdjust", "addVolume");
            HandlerC81149Vt3 handlerC81149Vt3 = c81150Vt4.LJLL;
            if (handlerC81149Vt3 != null) {
                handlerC81149Vt3.sendEmptyMessage(2);
            }
        }
    }

    public static final void onAnimationEnd$42(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C81150Vt4 c81150Vt4 = ((VideoProgressBarAssem) aLAdapterS11S0100000_14.l0).LLI;
        if (c81150Vt4 != null) {
            c81150Vt4.LIZ();
            C36922EeM.LIZLLL(4, "VoiceAdjust", "cutVolume");
            c81150Vt4.LJLL.sendEmptyMessage(3);
        }
    }

    public static final void onAnimationEnd$43(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ((C82011WGp) aLAdapterS11S0100000_14.l0).LLD = null;
    }

    public static final void onAnimationEnd$44(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ((C82011WGp) aLAdapterS11S0100000_14.l0).LJIIJJI();
        ((C82011WGp) aLAdapterS11S0100000_14.l0).LJLLJ.reset();
        C16300kU.LJIIJ((C82011WGp) aLAdapterS11S0100000_14.l0);
        ((C82011WGp) aLAdapterS11S0100000_14.l0).LLD = null;
    }

    public static final void onAnimationEnd$45(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ((C82011WGp) aLAdapterS11S0100000_14.l0).LJIIJJI();
    }

    public static final void onAnimationEnd$46(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animator) {
        super.onAnimationEnd(animator);
        ((C80881Voj) aLAdapterS11S0100000_14.l0).LIZJ();
        ((C80881Voj) aLAdapterS11S0100000_14.l0).LJIIJ.LIZ();
    }

    public static final void onAnimationEnd$47(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animator) {
        super.onAnimationEnd(animator);
        AbstractC80872Voa.LIZ((AbstractC80872Voa) aLAdapterS11S0100000_14.l0);
        AbstractC80872Voa abstractC80872Voa = (AbstractC80872Voa) aLAdapterS11S0100000_14.l0;
        List<C0FH> list = abstractC80872Voa.LJLJJLL;
        if (list != null && !abstractC80872Voa.LJLJL) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                ((C0FH) it.next()).LIZ();
            }
        }
    }

    public static final void onAnimationEnd$48(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animator) {
        super.onAnimationEnd(animator);
        C80884Vom c80884Vom = (C80884Vom) aLAdapterS11S0100000_14.l0;
        if (c80884Vom.LJIIIZ) {
            c80884Vom.LIZLLL.setRepeatCount(-1);
            ((C80884Vom) aLAdapterS11S0100000_14.l0).LJIIJ.LIZ();
            ((C80884Vom) aLAdapterS11S0100000_14.l0).LJIIIZ = false;
        }
    }

    public static final void onAnimationEnd$49(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animator) {
        super.onAnimationEnd(animator);
        ((C82948Wgy) ((ARunnableS33S0200000_14) aLAdapterS11S0100000_14.l0).l1).LJLIL.LJFF();
        ((C82948Wgy) ((ARunnableS33S0200000_14) aLAdapterS11S0100000_14.l0).l1).getClass();
        ((InterfaceC82947Wgx) ((ARunnableS33S0200000_14) aLAdapterS11S0100000_14.l0).l0).LJFF();
    }

    public static final void onAnimationEnd$5(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animator) {
        ((BaseTransientBottomBar) aLAdapterS11S0100000_14.l0).LIZJ();
    }

    public static final void onAnimationEnd$50(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animation) {
        o.LJIIIZ(animation, "animation");
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = ((C81400Vx6) aLAdapterS11S0100000_14.l0).LJLLILLLL;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public static final void onAnimationEnd$51(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animator) {
        WEW wew;
        WET wet = (WET) aLAdapterS11S0100000_14.l0;
        WEX wex = wet.LLJILJIL;
        if (wex != null && (wew = wex.LJ) != null && wet.LLILLL == 201) {
            wet.LLILZLL = (int) wew.LJLIL;
            wet.LLIZ = (int) wew.LJLILLLLZI;
            wet.LLILZ = (int) wew.LJLJI;
            wet.LLILZIL = (int) wew.LJLJJI;
        }
        if (wet.LLILLIZIL == 1 && wet.LLILLL == 202) {
            wet.LLILLIZIL = 0;
        }
        WEY wey = wet.LLJILJILJ;
        if (wey != null) {
            ((C81946WEc) wey).LIZ(wet.LLILLIZIL, wet.LLILLJJLI, wet.LLILLL);
        }
    }

    public static final void onAnimationEnd$52(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animator) {
        WET wet = (WET) aLAdapterS11S0100000_14.l0;
        WEY wey = wet.LLJILJILJ;
        if (wey != null) {
            ((C81946WEc) wey).LIZ(wet.LLILLIZIL, wet.LLILLJJLI, wet.LLILLL);
        }
        WET wet2 = (WET) aLAdapterS11S0100000_14.l0;
        if (wet2.LLILLIZIL == 1) {
            wet2.LLILLIZIL = 0;
        }
    }

    public static final void onAnimationEnd$53(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animator) {
        super.onAnimationEnd(animator);
        ((WNT) aLAdapterS11S0100000_14.l0).LIZ(1.0f);
    }

    public static final void onAnimationEnd$54(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animator) {
        EnumC80174VdK enumC80174VdK;
        EnumC80174VdK enumC80174VdK2;
        C80164VdA c80164VdA = (C80164VdA) aLAdapterS11S0100000_14.l0;
        c80164VdA.LLLFFI = null;
        if (c80164VdA.LJLILLLLZI == 0 && (enumC80174VdK = c80164VdA.LLJLIL) != (enumC80174VdK2 = EnumC80174VdK.None) && !enumC80174VdK.isOpening && !enumC80174VdK.isDragging) {
            c80164VdA.LJIILIIL(enumC80174VdK2);
            return;
        }
        EnumC80174VdK enumC80174VdK3 = c80164VdA.LLJLIL;
        if (enumC80174VdK3 == c80164VdA.LLJLILLLLZIIL) {
            return;
        }
        c80164VdA.setViceState(enumC80174VdK3);
    }

    public static final void onAnimationEnd$55(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animator) {
        RunnableC80167VdD runnableC80167VdD = (RunnableC80167VdD) ((ARunnableS18S0101000_14) aLAdapterS11S0100000_14.l0).l0;
        C80164VdA c80164VdA = runnableC80167VdD.LJLJJL;
        c80164VdA.LLJZIJLIL = false;
        if (runnableC80167VdD.LJLJI) {
            c80164VdA.LJIIZILJ(true);
        }
        C80164VdA c80164VdA2 = ((RunnableC80167VdD) ((ARunnableS18S0101000_14) aLAdapterS11S0100000_14.l0).l0).LJLJJL;
        if (c80164VdA2.LLJLIL == EnumC80174VdK.LoadFinish) {
            c80164VdA2.LJIILIIL(EnumC80174VdK.None);
        }
    }

    public static final void onAnimationEnd$56(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animator) {
        C80164VdA c80164VdA = ((RunnableC80173VdJ) aLAdapterS11S0100000_14.l0).LJLJJI;
        if (c80164VdA.LLLFFI != null) {
            c80164VdA.LLLFFI = null;
            EnumC80174VdK enumC80174VdK = c80164VdA.LLJLIL;
            EnumC80174VdK enumC80174VdK2 = EnumC80174VdK.ReleaseToRefresh;
            if (enumC80174VdK != enumC80174VdK2) {
                c80164VdA.LLJL.LIZJ(enumC80174VdK2);
            }
            ((RunnableC80173VdJ) aLAdapterS11S0100000_14.l0).LJLJJI.setStateRefreshing(!r0.LJLJI);
        }
    }

    public static final void onAnimationEnd$57(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C6QQ.LIZ(new AqS164S0100000_14(aLAdapterS11S0100000_14, 524));
    }

    public static final void onAnimationEnd$58(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C6QQ.LIZ(new AqS164S0100000_14(aLAdapterS11S0100000_14, 525));
    }

    public static final void onAnimationEnd$59(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animation) {
        o.LJIIIZ(animation, "animation");
        TKH tkh = ((C83101WjR) ((ARunnableS33S0200000_14) aLAdapterS11S0100000_14.l0).l0).LJLIL;
        if (tkh != null) {
            tkh.LJFF();
        }
        InterfaceC82947Wgx interfaceC82947Wgx = (InterfaceC82947Wgx) ((ARunnableS33S0200000_14) aLAdapterS11S0100000_14.l0).l1;
        if (interfaceC82947Wgx != null) {
            interfaceC82947Wgx.LJFF();
        }
    }

    public static final void onAnimationEnd$6(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animator) {
        InterfaceC81151Vt5 interfaceC81151Vt5 = ((C81150Vt4) aLAdapterS11S0100000_14.l0).LJLJJLL;
        if (interfaceC81151Vt5 != null) {
            interfaceC81151Vt5.onHide();
            ((C81150Vt4) aLAdapterS11S0100000_14.l0).LJLJL = null;
        }
    }

    public static final void onAnimationEnd$7(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animator) {
        super.onAnimationEnd(animator);
        ((C82946Wgw) ((ARunnableS33S0200000_14) aLAdapterS11S0100000_14.l0).l1).LJLIL.LJFF();
        ((C82946Wgw) ((ARunnableS33S0200000_14) aLAdapterS11S0100000_14.l0).l1).getClass();
        ((InterfaceC82947Wgx) ((ARunnableS33S0200000_14) aLAdapterS11S0100000_14.l0).l0).LJFF();
    }

    public static final void onAnimationEnd$8(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C81147Vt1 c81147Vt1 = ((C82706Wd4) aLAdapterS11S0100000_14.l0).LJLJJI;
        if (c81147Vt1 != null) {
            o.LJI(c81147Vt1);
            c81147Vt1.LIZ();
            C36922EeM.LIZLLL(4, "VoiceAdjust", "addVolume");
            HandlerC81148Vt2 handlerC81148Vt2 = c81147Vt1.LJLJLJ;
            o.LJI(handlerC81148Vt2);
            handlerC81148Vt2.sendEmptyMessage(2);
        }
    }

    public static final void onAnimationEnd$9(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C81147Vt1 c81147Vt1 = ((C82706Wd4) aLAdapterS11S0100000_14.l0).LJLJJI;
        if (c81147Vt1 != null) {
            o.LJI(c81147Vt1);
            c81147Vt1.LIZ();
            C36922EeM.LIZLLL(4, "VoiceAdjust", "cutVolume");
            HandlerC81148Vt2 handlerC81148Vt2 = c81147Vt1.LJLJLJ;
            o.LJI(handlerC81148Vt2);
            handlerC81148Vt2.sendEmptyMessage(3);
        }
    }

    public static final void onAnimationRepeat$0(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animator) {
        super.onAnimationRepeat(animator);
        C80881Voj c80881Voj = (C80881Voj) aLAdapterS11S0100000_14.l0;
        c80881Voj.LJII = (c80881Voj.LJII + 4) % c80881Voj.LJI.LIZJ.length;
    }

    public static final void onAnimationRepeat$1(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animator) {
        super.onAnimationRepeat(animator);
        C80883Vol c80883Vol = (C80883Vol) aLAdapterS11S0100000_14.l0;
        c80883Vol.LJI = (c80883Vol.LJI + 1) % c80883Vol.LJFF.LIZJ.length;
        c80883Vol.LJII = true;
    }

    public static final void onAnimationRepeat$2(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animator) {
        super.onAnimationRepeat(animator);
        C80884Vom c80884Vom = (C80884Vom) aLAdapterS11S0100000_14.l0;
        c80884Vom.LJI = (c80884Vom.LJI + 1) % c80884Vom.LJFF.LIZJ.length;
        c80884Vom.LJII = true;
    }

    public static final void onAnimationRepeat$3(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animation) {
        int i;
        boolean z;
        o.LJIIIZ(animation, "animation");
        super.onAnimationRepeat(animation);
        PagerAdapter adapter = ((C81651W2t) aLAdapterS11S0100000_14.l0).LJLILLLLZI.getAdapter();
        if (adapter != null) {
            i = adapter.getCount();
        } else {
            i = 0;
        }
        C81651W2t c81651W2t = (C81651W2t) aLAdapterS11S0100000_14.l0;
        if (!c81651W2t.LJLLJ || c81651W2t.getSceneContext() == null || i <= 0) {
            return;
        }
        C81651W2t c81651W2t2 = (C81651W2t) aLAdapterS11S0100000_14.l0;
        int i2 = c81651W2t2.LJLJI;
        int i3 = (i2 + 1) % i;
        if (i3 - 1 == i2) {
            z = true;
        } else {
            z = false;
        }
        c81651W2t2.LJLJI = i3;
        if (z) {
            C80838Vo2 c80838Vo2 = c81651W2t2.LJLJLJ;
            if (c80838Vo2 != null) {
                ValueAnimator ofInt = ValueAnimator.ofInt(0, c80838Vo2.LIZ.getWidth() - c80838Vo2.LIZ.getPaddingLeft());
                c80838Vo2.LIZJ = ofInt;
                if (ofInt != null) {
                    ofInt.addListener(new IDAListenerS81S0100000_14(c80838Vo2, 14));
                }
                ValueAnimator valueAnimator = c80838Vo2.LIZJ;
                if (valueAnimator != null) {
                    valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
                }
                ValueAnimator valueAnimator2 = c80838Vo2.LIZJ;
                if (valueAnimator2 != null) {
                    valueAnimator2.addUpdateListener(new AUListenerS74S0101000_14(c80838Vo2, 7));
                }
                ValueAnimator valueAnimator3 = c80838Vo2.LIZJ;
                if (valueAnimator3 != null) {
                    valueAnimator3.setDuration(800L);
                }
                if (c80838Vo2.LIZ.getChildCount() > 0) {
                    C152175y9 c152175y9 = c80838Vo2.LIZ;
                    if (!c152175y9.LLII) {
                        c152175y9.LLILL = true;
                        c152175y9.setScrollState(1);
                        c152175y9.LLIIIZ = 0.0f;
                        c152175y9.LLIIJLIL = 0.0f;
                        VelocityTracker velocityTracker = c152175y9.LLIILZL;
                        if (velocityTracker == null) {
                            c152175y9.LLIILZL = VelocityTracker.obtain();
                        } else {
                            velocityTracker.clear();
                        }
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
                        c152175y9.LLIILZL.addMovement(obtain);
                        obtain.recycle();
                        c152175y9.LLILLIZIL = uptimeMillis;
                    }
                }
                ValueAnimator valueAnimator4 = c80838Vo2.LIZJ;
                if (valueAnimator4 == null) {
                    return;
                }
                valueAnimator4.start();
                return;
            }
            o.LJIJI("dragHelper");
            throw null;
        }
        c81651W2t2.LJLILLLLZI.setCurrentItem(0, false);
    }

    public static final void onAnimationStart$0(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        ((C79866VWc) aLAdapterS11S0100000_14.l0).LJLLI = true;
    }

    public static final void onAnimationStart$1(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        ARunnableS13S0210000_14 aRunnableS13S0210000_14 = (ARunnableS13S0210000_14) aLAdapterS11S0100000_14.l0;
        if (aRunnableS13S0210000_14.z2) {
            ((C81266Vuw) aRunnableS13S0210000_14.l0).getClass();
            ((C136865Ys) ((ARunnableS13S0210000_14) aLAdapterS11S0100000_14.l0).l1).setVisibility(0);
        }
    }

    public static final void onAnimationStart$10(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animator) {
        WEY wey = ((WET) aLAdapterS11S0100000_14.l0).LLJILJILJ;
        if (wey != null) {
            ((C81946WEc) wey).LIZ.LJLL = true;
        }
    }

    public static final void onAnimationStart$11(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C82308WSa) aLAdapterS11S0100000_14.l0).LJII = true;
    }

    public static final void onAnimationStart$12(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C82308WSa) aLAdapterS11S0100000_14.l0).LJII = true;
    }

    public static final void onAnimationStart$2(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animator) {
        C80003VaZ c80003VaZ = (C80003VaZ) ((BaseTransientBottomBar) aLAdapterS11S0100000_14.l0).LIZLLL;
        c80003VaZ.LJLIL.setAlpha(0.0f);
        long j = 180;
        long j2 = 70;
        c80003VaZ.LJLIL.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        if (c80003VaZ.LJLILLLLZI.getVisibility() == 0) {
            c80003VaZ.LJLILLLLZI.setAlpha(0.0f);
            c80003VaZ.LJLILLLLZI.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        }
    }

    public static final void onAnimationStart$3(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animator) {
        C80003VaZ c80003VaZ = (C80003VaZ) ((BaseTransientBottomBar) aLAdapterS11S0100000_14.l0).LIZLLL;
        c80003VaZ.LJLIL.setAlpha(1.0f);
        long j = 180;
        long j2 = 0;
        c80003VaZ.LJLIL.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        if (c80003VaZ.LJLILLLLZI.getVisibility() == 0) {
            c80003VaZ.LJLILLLLZI.setAlpha(1.0f);
            c80003VaZ.LJLILLLLZI.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        }
    }

    public static final void onAnimationStart$4(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animator) {
        super.onAnimationStart(animator);
        ((C81150Vt4) aLAdapterS11S0100000_14.l0).LIZ();
    }

    public static final void onAnimationStart$5(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        ((C81147Vt1) aLAdapterS11S0100000_14.l0).LIZ();
    }

    public static final void onAnimationStart$6(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animator) {
        ((InterfaceC80386Vgk) aLAdapterS11S0100000_14.l0).LIZIZ();
    }

    public static final void onAnimationStart$7(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((WPJ) aLAdapterS11S0100000_14.l0).LIZ.LIZIZ = true;
    }

    public static final void onAnimationStart$8(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animator) {
        super.onAnimationStart(animator);
        AbstractC80872Voa abstractC80872Voa = (AbstractC80872Voa) aLAdapterS11S0100000_14.l0;
        List<C0FH> list = abstractC80872Voa.LJLJJLL;
        if (list != null && !abstractC80872Voa.LJLJL) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                it.next().getClass();
            }
        }
    }

    public static final void onAnimationStart$9(ALAdapterS11S0100000_14 aLAdapterS11S0100000_14, Animator animator) {
        WEY wey = ((WET) aLAdapterS11S0100000_14.l0).LLJILJILJ;
        if (wey != null) {
            ((C81946WEc) wey).LIZ.LJLL = true;
        }
    }

    public ALAdapterS11S0100000_14(BaseTransientBottomBar baseTransientBottomBar, int i, int i2) {
        this.$t = i2;
        this.l0 = baseTransientBottomBar;
    }
}
