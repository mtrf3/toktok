package Y;

import X.AbstractC32698CsQ;
import X.C0NB;
import X.C15380j0;
import X.C15650jR;
import X.C16880lQ;
import X.C29306Beo;
import X.C29701Eo;
import X.C29722BlW;
import X.C29727Blb;
import X.C29746Blu;
import X.C29747Blv;
import X.C29750Bly;
import X.C29779BmR;
import X.C30001Bq1;
import X.C30002Bq2;
import X.C30003Bq3;
import X.C30743C4t;
import X.C30744C4u;
import X.C31165CKz;
import X.C32537Cpp;
import X.C32727Cst;
import X.C56414MCc;
import X.C68322mC;
import X.C73943T0h;
import X.C78996UzQ;
import X.CX6;
import X.CXC;
import X.EnumC29732Blg;
import X.KL2;
import X.X1D;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget;
import com.bytedance.android.livesdk.like.widget.SelfLikeViewOptimizedWidget;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.microom.MicRoomUserInfoWidget;
import com.bytedance.android.livesdk.userinfowidget.ClearScreenUserInfoWidget;
import com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class ALAdapterS4S0200000_5 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                onAnimationCancel$0(this, animator);
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
            case 14:
            case 15:
            case 19:
            default:
                super.onAnimationEnd(animator);
                return;
            case 5:
                onAnimationEnd$3(this, animator);
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
            case 12:
                onAnimationEnd$10(this, animator);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
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
            case 20:
                onAnimationEnd$15(this, animator);
                return;
            case 21:
                onAnimationEnd$16(this, animator);
                return;
            case 22:
                onAnimationEnd$17(this, animator);
                return;
            case 23:
                onAnimationEnd$18(this, animator);
                return;
            case 24:
                onAnimationEnd$19(this, animator);
                return;
            case 25:
                onAnimationEnd$20(this, animator);
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
            case 3:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 20:
            case 24:
            default:
                super.onAnimationStart(animator);
                return;
            case 2:
                onAnimationStart$1(this, animator);
                return;
            case 4:
                onAnimationStart$2(this, animator);
                return;
            case 5:
                onAnimationStart$3(this, animator);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onAnimationStart$4(this, animator);
                return;
            case 12:
                onAnimationStart$5(this, animator);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                onAnimationStart$6(this, animator);
                return;
            case 14:
                onAnimationStart$7(this, animator);
                return;
            case 15:
                onAnimationStart$8(this, animator);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                onAnimationStart$9(this, animator);
                return;
            case 17:
                onAnimationStart$10(this, animator);
                return;
            case 18:
                onAnimationStart$11(this, animator);
                return;
            case 19:
                onAnimationStart$12(this, animator);
                return;
            case 21:
                onAnimationStart$13(this, animator);
                return;
            case 22:
                onAnimationStart$14(this, animator);
                return;
            case 23:
                onAnimationStart$15(this, animator);
                return;
            case 25:
                onAnimationStart$16(this, animator);
                return;
        }
    }

    public static final void onAnimationCancel$0(ALAdapterS4S0200000_5 aLAdapterS4S0200000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationCancel(animation);
        ((C56414MCc) aLAdapterS4S0200000_5.l0).LIZJ();
    }

    public static final void onAnimationEnd$0(ALAdapterS4S0200000_5 aLAdapterS4S0200000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ((ConstraintProperty) aLAdapterS4S0200000_5.l0).visibility(8);
        C73943T0h LIZ = C73943T0h.LIZ();
        C30744C4u c30744C4u = (C30744C4u) aLAdapterS4S0200000_5.l1;
        LIZ.LIZIZ(new C30743C4t(c30744C4u.LIZ, c30744C4u.LIZIZ));
    }

    public static final void onAnimationEnd$1(ALAdapterS4S0200000_5 aLAdapterS4S0200000_5, Animator animator) {
        super.onAnimationEnd(animator);
        ((C29727Blb) aLAdapterS4S0200000_5.l1).LIZ(EnumC29732Blg.FANS_CLUB_UNJOIN_ANIM);
    }

    public static final void onAnimationEnd$10(ALAdapterS4S0200000_5 aLAdapterS4S0200000_5, Animator animator) {
        ViewGroup.LayoutParams layoutParams = ((ClearScreenUserInfoWidget) aLAdapterS4S0200000_5.l1).LLIIII.getLayoutParams();
        layoutParams.width = -2;
        layoutParams.height = -2;
        ((ClearScreenUserInfoWidget) aLAdapterS4S0200000_5.l1).LLIIII.setLayoutParams(layoutParams);
        GradientDrawable gradientDrawable = (GradientDrawable) aLAdapterS4S0200000_5.l0;
        if (gradientDrawable != null) {
            gradientDrawable.setCornerRadius(C15380j0.LIZ(18.0f));
        }
        C29727Blb c29727Blb = ((ClearScreenUserInfoWidget) aLAdapterS4S0200000_5.l1).LLJILJILJ;
        if (c29727Blb.LJIIL == EnumC29732Blg.FOLLOW_ANIM && c29727Blb.LJIIIIZZ()) {
            if (!((ClearScreenUserInfoWidget) aLAdapterS4S0200000_5.l1).LLJILJILJ.LJIILIIL()) {
                ((ClearScreenUserInfoWidget) aLAdapterS4S0200000_5.l1).LLJILJILJ.LIZ(EnumC29732Blg.UNSUBSCRIBE);
            } else {
                ((ClearScreenUserInfoWidget) aLAdapterS4S0200000_5.l1).LLJILJILJ.LIZ(EnumC29732Blg.SUBSCRIBED);
            }
        }
        C29306Beo.LJJLJLI(((ClearScreenUserInfoWidget) aLAdapterS4S0200000_5.l1).LLIIII);
    }

    public static final void onAnimationEnd$11(ALAdapterS4S0200000_5 aLAdapterS4S0200000_5, Animator animator) {
        AnimatedDrawable2 animatedDrawable2;
        if (!((LiveRoomUserInfoWidget) aLAdapterS4S0200000_5.l1).isDestroyed && (animatedDrawable2 = (AnimatedDrawable2) aLAdapterS4S0200000_5.l0) != null) {
            animatedDrawable2.start();
        }
    }

    public static final void onAnimationEnd$12(ALAdapterS4S0200000_5 aLAdapterS4S0200000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ((C56414MCc) aLAdapterS4S0200000_5.l0).LIZJ();
    }

    public static final void onAnimationEnd$13(ALAdapterS4S0200000_5 aLAdapterS4S0200000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ViewGroup viewGroup = ((MicRoomUserInfoWidget) aLAdapterS4S0200000_5.l0).LJLLL;
        o.LJI(viewGroup);
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        layoutParams.width = -2;
        layoutParams.height = -2;
        ViewGroup viewGroup2 = ((MicRoomUserInfoWidget) aLAdapterS4S0200000_5.l0).LJLLL;
        o.LJI(viewGroup2);
        viewGroup2.setLayoutParams(layoutParams);
        ((GradientDrawable) aLAdapterS4S0200000_5.l1).setCornerRadius(C15380j0.LIZ(18.0f));
        C29727Blb c29727Blb = ((MicRoomUserInfoWidget) aLAdapterS4S0200000_5.l0).LLFFF;
        o.LJI(c29727Blb);
        if (c29727Blb.LJIIL == EnumC29732Blg.FOLLOW_ANIM) {
            C29727Blb c29727Blb2 = ((MicRoomUserInfoWidget) aLAdapterS4S0200000_5.l0).LLFFF;
            o.LJI(c29727Blb2);
            if (c29727Blb2.LJIIIIZZ()) {
                C29727Blb c29727Blb3 = ((MicRoomUserInfoWidget) aLAdapterS4S0200000_5.l0).LLFFF;
                o.LJI(c29727Blb3);
                if (!c29727Blb3.LJIILIIL()) {
                    C29727Blb c29727Blb4 = ((MicRoomUserInfoWidget) aLAdapterS4S0200000_5.l0).LLFFF;
                    o.LJI(c29727Blb4);
                    c29727Blb4.LIZ(EnumC29732Blg.UNSUBSCRIBE);
                } else {
                    C29727Blb c29727Blb5 = ((MicRoomUserInfoWidget) aLAdapterS4S0200000_5.l0).LLFFF;
                    o.LJI(c29727Blb5);
                    c29727Blb5.LIZ(EnumC29732Blg.SUBSCRIBED);
                }
            }
        }
        C29306Beo.LJJLJLI(((MicRoomUserInfoWidget) aLAdapterS4S0200000_5.l0).LJLLL);
    }

    public static final void onAnimationEnd$14(ALAdapterS4S0200000_5 aLAdapterS4S0200000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ViewGroup viewGroup = ((MicRoomUserInfoWidget) aLAdapterS4S0200000_5.l0).LJLLL;
        o.LJI(viewGroup);
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        layoutParams.width = -2;
        layoutParams.height = -2;
        ViewGroup viewGroup2 = ((MicRoomUserInfoWidget) aLAdapterS4S0200000_5.l0).LJLLL;
        o.LJI(viewGroup2);
        viewGroup2.setLayoutParams(layoutParams);
        ((GradientDrawable) aLAdapterS4S0200000_5.l1).setCornerRadius(C15380j0.LIZ(13.5f));
        C29727Blb c29727Blb = ((MicRoomUserInfoWidget) aLAdapterS4S0200000_5.l0).LLFFF;
        if (c29727Blb != null) {
            o.LJI(c29727Blb);
            c29727Blb.LJ();
        }
        C29306Beo.LJI(((MicRoomUserInfoWidget) aLAdapterS4S0200000_5.l0).LJLLL);
    }

    public static final void onAnimationEnd$15(ALAdapterS4S0200000_5 aLAdapterS4S0200000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ((C29746Blu) aLAdapterS4S0200000_5.l0).LJIJJLI((C29750Bly) aLAdapterS4S0200000_5.l1);
        C29746Blu c29746Blu = (C29746Blu) aLAdapterS4S0200000_5.l0;
        c29746Blu.LJIILL(false, c29746Blu.LJJIJ);
        ((C29746Blu) aLAdapterS4S0200000_5.l0).LJIJJ(EnumC29732Blg.FANS_CLUB_JOINED);
        ((C29746Blu) aLAdapterS4S0200000_5.l0).LIZLLL = (C29750Bly) aLAdapterS4S0200000_5.l1;
    }

    public static final void onAnimationEnd$16(ALAdapterS4S0200000_5 aLAdapterS4S0200000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        C31165CKz c31165CKz = ((C29746Blu) aLAdapterS4S0200000_5.l0).LJIJ;
        if (c31165CKz != null) {
            c31165CKz.setTranslationY(0.0f);
        }
        C31165CKz c31165CKz2 = ((C29746Blu) aLAdapterS4S0200000_5.l0).LJIIZILJ;
        if (c31165CKz2 != null) {
            c31165CKz2.setTranslationY(0.0f);
        }
        KL2.LJIILLIIL(8, ((C29746Blu) aLAdapterS4S0200000_5.l0).LJIJ);
        KL2.LJIILLIIL(0, ((C29746Blu) aLAdapterS4S0200000_5.l0).LJIIZILJ);
        C29746Blu c29746Blu = (C29746Blu) aLAdapterS4S0200000_5.l0;
        c29746Blu.LIZLLL = (C29750Bly) aLAdapterS4S0200000_5.l1;
        c29746Blu.LJIJJ(EnumC29732Blg.FANS_CLUB_JOINED);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0041, code lost:
    
        if (r0 != null) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onAnimationEnd$17(Y.ALAdapterS4S0200000_5 r2, android.animation.Animator r3) {
        /*
            java.lang.String r0 = "animation"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            super.onAnimationEnd(r3)
            java.lang.Object r0 = r2.l0
            X.2mC r0 = (X.C68322mC) r0
            T r0 = r0.element
            if (r0 == 0) goto L4a
            com.bytedance.android.livesdk.livesetting.level.FansEntranceResConfig r0 = (com.bytedance.android.livesdk.livesetting.level.FansEntranceResConfig) r0
            java.lang.String r0 = r0.geckoChannel
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L4a
            java.lang.Object r0 = r2.l0
            X.2mC r0 = (X.C68322mC) r0
            T r0 = r0.element
            com.bytedance.android.livesdk.livesetting.level.FansEntranceResConfig r0 = (com.bytedance.android.livesdk.livesetting.level.FansEntranceResConfig) r0
            if (r0 == 0) goto L4d
            java.lang.String r0 = r0.entranceLottieFileName
        L26:
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L4a
            java.lang.Object r3 = r2.l1
            X.Blu r3 = (X.C29746Blu) r3
            java.lang.Object r0 = r2.l0
            X.2mC r0 = (X.C68322mC) r0
            T r0 = r0.element
            com.bytedance.android.livesdk.livesetting.level.FansEntranceResConfig r0 = (com.bytedance.android.livesdk.livesetting.level.FansEntranceResConfig) r0
            java.lang.String r2 = ""
            if (r0 == 0) goto L40
            java.lang.String r1 = r0.entranceLottieFileName
            if (r1 != 0) goto L43
        L40:
            r1 = r2
            if (r0 == 0) goto L47
        L43:
            java.lang.String r0 = r0.geckoChannel
            if (r0 != 0) goto L4b
        L47:
            r3.LJIILLIIL(r1, r2)
        L4a:
            return
        L4b:
            r2 = r0
            goto L47
        L4d:
            r0 = 0
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ALAdapterS4S0200000_5.onAnimationEnd$17(Y.ALAdapterS4S0200000_5, android.animation.Animator):void");
    }

    public static final void onAnimationEnd$18(ALAdapterS4S0200000_5 aLAdapterS4S0200000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        C31165CKz c31165CKz = ((C29746Blu) aLAdapterS4S0200000_5.l0).LJJI;
        if (c31165CKz != null) {
            c31165CKz.setTranslationY(0.0f);
        }
        ((C29746Blu) aLAdapterS4S0200000_5.l0).LJIL(true);
        KL2.LJIILLIIL(8, ((C29746Blu) aLAdapterS4S0200000_5.l0).LJJI);
        C29746Blu c29746Blu = (C29746Blu) aLAdapterS4S0200000_5.l0;
        c29746Blu.LIZLLL = (C29750Bly) aLAdapterS4S0200000_5.l1;
        C29747Blv c29747Blv = c29746Blu.LJJIJ;
        if (c29747Blv != null) {
            c29747Blv.LIZ();
        }
    }

    public static final void onAnimationEnd$19(ALAdapterS4S0200000_5 aLAdapterS4S0200000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C29701Eo) aLAdapterS4S0200000_5.l0).removeAnimatorListener(aLAdapterS4S0200000_5);
        C29779BmR c29779BmR = (C29779BmR) aLAdapterS4S0200000_5.l1;
        C29701Eo c29701Eo = (C29701Eo) aLAdapterS4S0200000_5.l0;
        c29779BmR.getClass();
        c29701Eo.setVisibility(4);
        if (c29779BmR.LIZ.size() >= 5) {
            C16880lQ.LJLLL(c29701Eo, c29779BmR.LIZIZ.LIZLLL);
        } else {
            c29779BmR.LIZ.add(c29701Eo);
        }
    }

    public static final void onAnimationEnd$2(ALAdapterS4S0200000_5 aLAdapterS4S0200000_5, Animator animator) {
        ViewGroup.LayoutParams layoutParams = ((C29727Blb) aLAdapterS4S0200000_5.l1).LIZLLL.getLayoutParams();
        layoutParams.width = -2;
        layoutParams.height = -2;
        ((C29727Blb) aLAdapterS4S0200000_5.l1).LIZLLL.setLayoutParams(layoutParams);
        GradientDrawable gradientDrawable = (GradientDrawable) aLAdapterS4S0200000_5.l0;
        if (gradientDrawable != null) {
            gradientDrawable.setCornerRadius(C15380j0.LIZ(13.5f));
        }
        ((C29727Blb) aLAdapterS4S0200000_5.l1).LIZ(EnumC29732Blg.FOLLOWED);
    }

    public static final void onAnimationEnd$20(ALAdapterS4S0200000_5 aLAdapterS4S0200000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ((ConstraintProperty) aLAdapterS4S0200000_5.l1).translationX(0.0f);
    }

    public static final void onAnimationEnd$3(ALAdapterS4S0200000_5 aLAdapterS4S0200000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        Iterator it = ((List) aLAdapterS4S0200000_5.l1).iterator();
        while (it.hasNext()) {
            C29306Beo.LJI((View) it.next());
        }
    }

    public static final void onAnimationEnd$4(ALAdapterS4S0200000_5 aLAdapterS4S0200000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C29701Eo) aLAdapterS4S0200000_5.l0).removeAnimatorListener(aLAdapterS4S0200000_5);
        ((C30001Bq1) aLAdapterS4S0200000_5.l1).LIZIZ((C29701Eo) aLAdapterS4S0200000_5.l0);
    }

    public static final void onAnimationEnd$5(ALAdapterS4S0200000_5 aLAdapterS4S0200000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((CX6) aLAdapterS4S0200000_5.l0).LJLJI.remove((CXC) aLAdapterS4S0200000_5.l1);
    }

    public static final void onAnimationEnd$6(ALAdapterS4S0200000_5 aLAdapterS4S0200000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        if (((C30003Bq3) aLAdapterS4S0200000_5.l0).LJLJI.contains((C30002Bq2) aLAdapterS4S0200000_5.l1)) {
            ((C30003Bq3) aLAdapterS4S0200000_5.l0).LJLJI.remove((C30002Bq2) aLAdapterS4S0200000_5.l1);
            ((C30003Bq3) aLAdapterS4S0200000_5.l0).LJLILLLLZI.LIZ((C30002Bq2) aLAdapterS4S0200000_5.l1);
            C30003Bq3 c30003Bq3 = (C30003Bq3) aLAdapterS4S0200000_5.l0;
            C30002Bq2 c30002Bq2 = (C30002Bq2) aLAdapterS4S0200000_5.l1;
            c30003Bq3.getClass();
            ImageView imageView = c30002Bq2.LIZ;
            if (C78996UzQ.LJJIIJZLJL(imageView)) {
                C78996UzQ.LJI();
            }
            c30003Bq3.removeView(imageView);
        }
    }

    public static final void onAnimationEnd$7(ALAdapterS4S0200000_5 aLAdapterS4S0200000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((CX6) aLAdapterS4S0200000_5.l0).LJLJI.remove((CXC) aLAdapterS4S0200000_5.l1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onAnimationEnd$8(ALAdapterS4S0200000_5 aLAdapterS4S0200000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        if (((SelfLikeViewOptimizedWidget) aLAdapterS4S0200000_5.l0).LJLL.contains(((C68322mC) aLAdapterS4S0200000_5.l1).element)) {
            ((ImageView) ((C68322mC) aLAdapterS4S0200000_5.l1).element).setVisibility(8);
            if (!((SelfLikeViewOptimizedWidget) aLAdapterS4S0200000_5.l0).LJLJLLL.LIZ(((C68322mC) aLAdapterS4S0200000_5.l1).element)) {
                FrameLayout frameLayout = ((SelfLikeViewOptimizedWidget) aLAdapterS4S0200000_5.l0).LJLIL;
                if (frameLayout != null) {
                    C16880lQ.LJLLLL((View) ((C68322mC) aLAdapterS4S0200000_5.l1).element, frameLayout);
                } else {
                    o.LJIJI("tapLottieContainer");
                    throw null;
                }
            }
            ((SelfLikeViewOptimizedWidget) aLAdapterS4S0200000_5.l0).LJLL.remove(((C68322mC) aLAdapterS4S0200000_5.l1).element);
        }
    }

    public static final void onAnimationEnd$9(ALAdapterS4S0200000_5 aLAdapterS4S0200000_5, Animator animator) {
        ViewGroup.LayoutParams layoutParams = ((ClearScreenUserInfoWidget) aLAdapterS4S0200000_5.l1).LLIIII.getLayoutParams();
        layoutParams.width = -2;
        layoutParams.height = -2;
        ((ClearScreenUserInfoWidget) aLAdapterS4S0200000_5.l1).LLIIII.setLayoutParams(layoutParams);
        GradientDrawable gradientDrawable = (GradientDrawable) aLAdapterS4S0200000_5.l0;
        if (gradientDrawable != null) {
            gradientDrawable.setCornerRadius(C15380j0.LIZ(13.5f));
        }
        C29727Blb c29727Blb = ((ClearScreenUserInfoWidget) aLAdapterS4S0200000_5.l1).LLJILJILJ;
        if (c29727Blb != null) {
            c29727Blb.LJ();
        }
        C29306Beo.LJI(((ClearScreenUserInfoWidget) aLAdapterS4S0200000_5.l1).LLIIII);
    }

    public static final void onAnimationStart$0(ALAdapterS4S0200000_5 aLAdapterS4S0200000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        C73943T0h LIZ = C73943T0h.LIZ();
        C30744C4u c30744C4u = (C30744C4u) aLAdapterS4S0200000_5.l0;
        LIZ.LIZIZ(new C30743C4t(c30744C4u.LIZ, c30744C4u.LIZIZ));
        ((ConstraintProperty) aLAdapterS4S0200000_5.l1).visibility(0);
    }

    public static final void onAnimationStart$1(ALAdapterS4S0200000_5 aLAdapterS4S0200000_5, Animator animator) {
        KL2.LJIILLIIL(0, (View) aLAdapterS4S0200000_5.l0);
    }

    public static final void onAnimationStart$10(ALAdapterS4S0200000_5 aLAdapterS4S0200000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C29306Beo.LJIIIZ(((MicRoomUserInfoWidget) aLAdapterS4S0200000_5.l0).LJLLL);
        C29727Blb c29727Blb = ((MicRoomUserInfoWidget) aLAdapterS4S0200000_5.l0).LLFFF;
        if (c29727Blb != null) {
            o.LJI(c29727Blb);
            c29727Blb.LJ();
        }
    }

    public static final void onAnimationStart$11(ALAdapterS4S0200000_5 aLAdapterS4S0200000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C29306Beo.LJIIIZ(((MicRoomUserInfoWidget) aLAdapterS4S0200000_5.l0).LJLLL);
    }

    public static final void onAnimationStart$12(ALAdapterS4S0200000_5 aLAdapterS4S0200000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        C15650jR.LIZ().LJIIIZ(((C29750Bly) aLAdapterS4S0200000_5.l0).LIZJ).LJIIJJI(((C29746Blu) aLAdapterS4S0200000_5.l1).LJIILL);
        KL2.LJIILLIIL(0, ((C29746Blu) aLAdapterS4S0200000_5.l1).LJIILL);
        C31165CKz c31165CKz = ((C29746Blu) aLAdapterS4S0200000_5.l1).LJIIZILJ;
        if (c31165CKz != null) {
            c31165CKz.setText(String.valueOf(((C29750Bly) aLAdapterS4S0200000_5.l0).LIZ));
        }
        C31165CKz c31165CKz2 = ((C29746Blu) aLAdapterS4S0200000_5.l1).LJIIZILJ;
        if (c31165CKz2 != null) {
            c31165CKz2.LJJIJLIJ(C15380j0.LIZIZ(R.color.abc));
        }
        C31165CKz c31165CKz3 = ((C29746Blu) aLAdapterS4S0200000_5.l1).LJIIZILJ;
        if (c31165CKz3 != null) {
            String str = ((C29750Bly) aLAdapterS4S0200000_5.l0).LJI;
            if (str == null) {
                str = "#FFFFA25F";
            }
            c31165CKz3.setTextColor(C15380j0.LIZJ(0, str));
        }
        C29746Blu c29746Blu = (C29746Blu) aLAdapterS4S0200000_5.l1;
        c29746Blu.LIZLLL = (C29750Bly) aLAdapterS4S0200000_5.l0;
        c29746Blu.LJIJJ(EnumC29732Blg.FANS_CLUB_JOINED);
    }

    public static final void onAnimationStart$13(ALAdapterS4S0200000_5 aLAdapterS4S0200000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        KL2.LJIILLIIL(0, ((C29746Blu) aLAdapterS4S0200000_5.l0).LJIIZILJ);
    }

    public static final void onAnimationStart$14(ALAdapterS4S0200000_5 aLAdapterS4S0200000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
    }

    public static final void onAnimationStart$15(ALAdapterS4S0200000_5 aLAdapterS4S0200000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
    }

    public static final void onAnimationStart$16(ALAdapterS4S0200000_5 aLAdapterS4S0200000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        C73943T0h LIZ = C73943T0h.LIZ();
        C30744C4u c30744C4u = (C30744C4u) aLAdapterS4S0200000_5.l0;
        LIZ.LIZIZ(new C30743C4t(c30744C4u.LIZ, c30744C4u.LIZIZ));
        ((ConstraintProperty) aLAdapterS4S0200000_5.l1).visibility(0);
    }

    public static final void onAnimationStart$2(ALAdapterS4S0200000_5 aLAdapterS4S0200000_5, Animator animator) {
        super.onAnimationStart(animator);
        ((CommentWidget) aLAdapterS4S0200000_5.l1).LJLJL.setVisibility(0);
        ((CommentWidget) aLAdapterS4S0200000_5.l1).LJLJL.setAlpha(0.0f);
        ((View) aLAdapterS4S0200000_5.l0).setAlpha(0.0f);
        ((View) aLAdapterS4S0200000_5.l0).setScaleX(0.0f);
        ((View) aLAdapterS4S0200000_5.l0).setScaleY(0.0f);
        ((View) aLAdapterS4S0200000_5.l0).setVisibility(0);
    }

    public static final void onAnimationStart$3(ALAdapterS4S0200000_5 aLAdapterS4S0200000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        for (View view : (List) aLAdapterS4S0200000_5.l0) {
            if (view != null) {
                view.setAlpha(0.0f);
            }
            C29306Beo.LJJLJLI(view);
        }
    }

    public static final void onAnimationStart$4(ALAdapterS4S0200000_5 aLAdapterS4S0200000_5, Animator animator) {
        C29306Beo.LJIIIZ(((ClearScreenUserInfoWidget) aLAdapterS4S0200000_5.l1).LLIIII);
    }

    public static final void onAnimationStart$5(ALAdapterS4S0200000_5 aLAdapterS4S0200000_5, Animator animator) {
        C29306Beo.LJIIIZ(((ClearScreenUserInfoWidget) aLAdapterS4S0200000_5.l1).LLIIII);
        C29727Blb c29727Blb = ((ClearScreenUserInfoWidget) aLAdapterS4S0200000_5.l1).LLJILJILJ;
        if (c29727Blb != null) {
            c29727Blb.LJ();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Boolean, O] */
    public static final void onAnimationStart$6(ALAdapterS4S0200000_5 aLAdapterS4S0200000_5, Animator animator) {
        DataChannel dataChannel = ((LiveRoomUserInfoWidget) aLAdapterS4S0200000_5.l1).dataChannel;
        if (dataChannel != null) {
            ((C32537Cpp) dataChannel.gv0(C29722BlW.class)).LIZ = Boolean.TRUE;
        }
    }

    public static final void onAnimationStart$7(ALAdapterS4S0200000_5 aLAdapterS4S0200000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        String str = ((C32727Cst) aLAdapterS4S0200000_5.l0).LLIIJLIL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setGiftLockAndAnim() -> reset anim flag 1st ");
        LIZ.append(((AbstractC32698CsQ) aLAdapterS4S0200000_5.l1).LIZJ());
        C0NB.LJIIIZ(str, X1D.LIZIZ(LIZ));
        ((AbstractC32698CsQ) aLAdapterS4S0200000_5.l1).LJIIIZ = false;
    }

    public static final void onAnimationStart$8(ALAdapterS4S0200000_5 aLAdapterS4S0200000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        String str = ((C32727Cst) aLAdapterS4S0200000_5.l0).LLIIJLIL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setGiftLockAndAnim() -> reset anim flag subsequent ");
        LIZ.append(((AbstractC32698CsQ) aLAdapterS4S0200000_5.l1).LIZJ());
        C0NB.LJIIIZ(str, X1D.LIZIZ(LIZ));
        ((AbstractC32698CsQ) aLAdapterS4S0200000_5.l1).LJIIIZ = false;
    }

    public static final void onAnimationStart$9(ALAdapterS4S0200000_5 aLAdapterS4S0200000_5, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        if (((C56414MCc) aLAdapterS4S0200000_5.l0).LIZ(((C32727Cst) aLAdapterS4S0200000_5.l1).LJLJJLL) != null) {
            ((C56414MCc) aLAdapterS4S0200000_5.l0).LIZIZ(false);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ALAdapterS4S0200000_5(X.C30744C4u r2, com.bytedance.ies.sdk.widgets.ConstraintProperty r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            switch(r4) {
                case 0: goto Le;
                case 25: goto Le;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
        La:
            r0.<init>()
            return
        Le:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ALAdapterS4S0200000_5.<init>(X.C4u, com.bytedance.ies.sdk.widgets.ConstraintProperty, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ALAdapterS4S0200000_5(X.C29750Bly r2, X.C29746Blu r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            switch(r4) {
                case 19: goto Le;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
        La:
            r0.<init>()
            return
        Le:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ALAdapterS4S0200000_5.<init>(X.Bly, X.Blu, int):void");
    }

    public ALAdapterS4S0200000_5(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l0 = obj2;
    }
}
