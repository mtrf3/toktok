package Y;

import X.AbstractC156316Bn;
import X.AnonymousClass584;
import X.C110614Vt;
import X.C1293955z;
import X.C1294856i;
import X.C1297357h;
import X.C1302459g;
import X.C130995Cd;
import X.C131015Cf;
import X.C132565Ie;
import X.C140355f5;
import X.C144855mL;
import X.C145045me;
import X.C146485oy;
import X.C151035wJ;
import X.C151065wM;
import X.C151085wO;
import X.C151885xg;
import X.C152335yP;
import X.C1545664u;
import X.C156306Bm;
import X.C157416Ft;
import X.C158326Jg;
import X.C158396Jn;
import X.C16880lQ;
import X.C1NS;
import X.C29701Eo;
import X.C45737HxF;
import X.C47261Igj;
import X.C51P;
import X.C52T;
import X.C52V;
import X.C54F;
import X.C58D;
import X.C59I;
import X.C5A2;
import X.C5UU;
import X.C61447O9r;
import X.C6G0;
import X.C6G2;
import X.C6G6;
import X.C6G9;
import X.C6IQ;
import X.C6JH;
import X.C6JI;
import X.C6QK;
import X.C6SL;
import X.C6SQ;
import X.C6SS;
import X.C6ST;
import X.C76800UCe;
import X.C78842Uww;
import X.C78949Uyf;
import X.C79057V0z;
import X.C8H9;
import X.EnumC160626Sc;
import X.InterfaceC151935xl;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.KL2;
import X.T5T;
import X.V0Q;
import X.ViewOnClickListenerC151455wz;
import X.ViewOnClickListenerC158316Jf;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.graphics.RectF;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.shortvideo.ui.ImagePublishPreviewActivity;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerTopicRepoApi$AddYoursSuggestTopic;
import com.ss.android.ugc.gamora.editorpro.EditorProScene;
import com.ss.android.ugc.gamora.editorpro.bottom.panel.AudioBeatsPanelFragment;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class ALAdapterS1S0100000_2 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 2:
                onAnimationCancel$0(this, animator);
                return;
            case 12:
                o.LJIIIZ(animator, "animation");
                return;
            case 15:
                onAnimationCancel$2(this, animator);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                onAnimationCancel$3(this, animator);
                return;
            case 20:
                onAnimationCancel$4(this, animator);
                return;
            case 22:
                onAnimationCancel$5(this, animator);
                return;
            case 23:
                onAnimationCancel$6(this, animator);
                return;
            case 28:
                onAnimationCancel$7(this, animator);
                return;
            case 30:
                onAnimationCancel$8(this, animator);
                return;
            case 31:
                onAnimationCancel$9(this, animator);
                return;
            case 42:
                onAnimationCancel$10(this, animator);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

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
                onAnimationEnd$6(this, animator);
                return;
            case 7:
                onAnimationEnd$7(this, animator);
                return;
            case 8:
                onAnimationEnd$8(this, animator);
                return;
            case 9:
                onAnimationEnd$9(this, animator);
                return;
            case 10:
                onAnimationEnd$10(this, animator);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onAnimationEnd$11(this, animator);
                return;
            case 12:
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
            case 14:
            case 30:
            case 31:
            case 35:
            case 36:
            case 42:
            case 45:
            default:
                super.onAnimationEnd(animator);
                return;
            case 15:
                onAnimationEnd$12(this, animator);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                onAnimationEnd$13(this, animator);
                return;
            case 17:
                onAnimationEnd$14(this, animator);
                return;
            case 18:
                onAnimationEnd$15(this, animator);
                return;
            case 19:
                onAnimationEnd$16(this, animator);
                return;
            case 20:
                onAnimationEnd$17(this, animator);
                return;
            case 21:
                onAnimationEnd$18(this, animator);
                return;
            case 22:
                onAnimationEnd$19(this, animator);
                return;
            case 23:
                onAnimationEnd$20(this, animator);
                return;
            case 24:
                onAnimationEnd$21(this, animator);
                return;
            case 25:
                onAnimationEnd$22(this, animator);
                return;
            case 26:
                onAnimationEnd$23(this, animator);
                return;
            case 27:
                onAnimationEnd$24(this, animator);
                return;
            case 28:
                onAnimationEnd$25(this, animator);
                return;
            case 29:
                onAnimationEnd$26(this, animator);
                return;
            case 32:
                onAnimationEnd$27(this, animator);
                return;
            case 33:
                onAnimationEnd$28(this, animator);
                return;
            case 34:
                onAnimationEnd$29(this, animator);
                return;
            case 37:
                onAnimationEnd$30(this, animator);
                return;
            case 38:
                onAnimationEnd$31(this, animator);
                return;
            case 39:
                onAnimationEnd$32(this, animator);
                return;
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                onAnimationEnd$33(this, animator);
                return;
            case 41:
                onAnimationEnd$34(this, animator);
                return;
            case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                onAnimationEnd$35(this, animator);
                return;
            case 44:
                onAnimationEnd$36(this, animator);
                return;
            case 46:
                onAnimationEnd$37(this, animator);
                return;
            case 47:
                onAnimationEnd$38(this, animator);
                return;
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                onAnimationEnd$39(this, animator);
                return;
            case C61447O9r.LJIIJ:
                onAnimationEnd$40(this, animator);
                return;
            case 50:
                onAnimationEnd$41(this, animator);
                return;
            case 51:
                onAnimationEnd$42(this, animator);
                return;
            case 52:
                onAnimationEnd$43(this, animator);
                return;
            case 53:
                onAnimationEnd$44(this, animator);
                return;
            case 54:
                onAnimationEnd$45(this, animator);
                return;
            case 55:
                onAnimationEnd$46(this, animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.$t) {
            case 12:
                onAnimationRepeat$0(this, animator);
                return;
            default:
                super.onAnimationRepeat(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 5:
                onAnimationStart$0(this, animator);
                return;
            case 6:
                onAnimationStart$1(this, animator);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onAnimationStart$2(this, animator);
                return;
            case 12:
                onAnimationStart$3(this, animator);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                onAnimationStart$4(this, animator);
                return;
            case 14:
                onAnimationStart$5(this, animator);
                return;
            case 20:
                onAnimationStart$6(this, animator);
                return;
            case 35:
                onAnimationStart$7(this, animator);
                return;
            case 36:
                onAnimationStart$8(this, animator);
                return;
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                onAnimationStart$9(this, animator);
                return;
            case 41:
                onAnimationStart$10(this, animator);
                return;
            case 42:
                onAnimationStart$11(this, animator);
                return;
            case 45:
                onAnimationStart$12(this, animator);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public ALAdapterS1S0100000_2(int i) {
        this.$t = i;
        this.l0 = null;
    }

    public ALAdapterS1S0100000_2(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationCancel$0(ALAdapterS1S0100000_2 aLAdapterS1S0100000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C29701Eo) aLAdapterS1S0100000_2.l0).removeAllAnimatorListeners();
    }

    public static final void onAnimationCancel$10(ALAdapterS1S0100000_2 aLAdapterS1S0100000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C1302459g c1302459g = (C1302459g) aLAdapterS1S0100000_2.l0;
        C59I.LIZ(c1302459g.LIZIZ, (int) (c1302459g.LJIIJJI - c1302459g.LJIIL), 0, true, false, 24);
    }

    public static final void onAnimationCancel$2(ALAdapterS1S0100000_2 aLAdapterS1S0100000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C130995Cd) aLAdapterS1S0100000_2.l0).LJLJJI.setAlpha(255);
        ((C130995Cd) aLAdapterS1S0100000_2.l0).invalidate();
    }

    public static final void onAnimationCancel$3(ALAdapterS1S0100000_2 aLAdapterS1S0100000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C131015Cf) aLAdapterS1S0100000_2.l0).invalidate();
    }

    public static final void onAnimationCancel$4(ALAdapterS1S0100000_2 aLAdapterS1S0100000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationCancel(animation);
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aLAdapterS1S0100000_2.l0;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(3);
        }
    }

    public static final void onAnimationCancel$5(ALAdapterS1S0100000_2 aLAdapterS1S0100000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C132565Ie) aLAdapterS1S0100000_2.l0).LJIIL().removeAllViews();
        C132565Ie c132565Ie = (C132565Ie) aLAdapterS1S0100000_2.l0;
        C16880lQ.LJLLL(c132565Ie.LJIILJJIL(), c132565Ie.LIZ);
        C132565Ie c132565Ie2 = (C132565Ie) aLAdapterS1S0100000_2.l0;
        C16880lQ.LJLLL(c132565Ie2.LJIIL(), c132565Ie2.LIZ);
    }

    public static final void onAnimationCancel$6(ALAdapterS1S0100000_2 aLAdapterS1S0100000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C132565Ie c132565Ie = (C132565Ie) aLAdapterS1S0100000_2.l0;
        C16880lQ.LJLLL(c132565Ie.LJIIL, c132565Ie.LIZ);
    }

    public static final void onAnimationCancel$7(ALAdapterS1S0100000_2 aLAdapterS1S0100000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationCancel(animation);
        ((C54F) aLAdapterS1S0100000_2.l0).LIZ().setVisibility(4);
    }

    public static final void onAnimationCancel$8(ALAdapterS1S0100000_2 aLAdapterS1S0100000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C5A2) aLAdapterS1S0100000_2.l0).LJJI = 0;
    }

    public static final void onAnimationCancel$9(ALAdapterS1S0100000_2 aLAdapterS1S0100000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C5A2) aLAdapterS1S0100000_2.l0).LIZLLL.setAlpha(1.0f);
        ((C5A2) aLAdapterS1S0100000_2.l0).LIZLLL.setTranslationX(0.0f);
        ((C5A2) aLAdapterS1S0100000_2.l0).LIZLLL.setTranslationY(0.0f);
    }

    public static final void onAnimationEnd$0(ALAdapterS1S0100000_2 aLAdapterS1S0100000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C6G0) aLAdapterS1S0100000_2.l0).LJLLI = C6G6.LIZ;
    }

    public static final void onAnimationEnd$1(ALAdapterS1S0100000_2 aLAdapterS1S0100000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C6G0 c6g0 = (C6G0) aLAdapterS1S0100000_2.l0;
        C157416Ft c157416Ft = c6g0.LJLJJI;
        if (c157416Ft != null) {
            T5T t5t = c157416Ft.LJLJI;
            if (t5t != null) {
                t5t.setFocusable(false);
                T5T t5t2 = c157416Ft.LJLJI;
                if (t5t2 != null) {
                    t5t2.setFocusableInTouchMode(false);
                } else {
                    o.LJIJI("questionEditText");
                    throw null;
                }
            } else {
                o.LJIJI("questionEditText");
                throw null;
            }
        }
        FrameLayout frameLayout = c6g0.LJLILLLLZI;
        if (frameLayout != null) {
            C16880lQ.LJLLLL(c6g0.LJLJJI, frameLayout);
            c6g0.LJLLI = C6G9.LIZ;
            C157416Ft c157416Ft2 = c6g0.LJLJJI;
            if (c157416Ft2 != null) {
                c157416Ft2.setTouchAble(false);
                c157416Ft2.setScaleX(1.0f);
                c157416Ft2.setScaleY(1.0f);
                c157416Ft2.setRotation(0.0f);
                c157416Ft2.setTranslationX(0.0f);
                c157416Ft2.setTranslationY(0.0f);
                c6g0.LJLJLJ = new C6G2(0.0f, 0.0f, 63);
            }
            InterfaceC88472Yns<C157416Ft, C76800UCe> onCompleteListener = ((C6G0) aLAdapterS1S0100000_2.l0).getOnCompleteListener();
            if (onCompleteListener != null) {
                onCompleteListener.invoke(((C6G0) aLAdapterS1S0100000_2.l0).LJLJJI);
            }
            C6G0 c6g02 = (C6G0) aLAdapterS1S0100000_2.l0;
            c6g02.LJLJJI = null;
            InputMethodManager inputMethodManager = (InputMethodManager) C16880lQ.LLILL(c6g02.getContext(), "input_method");
            Activity LJIILL = C78949Uyf.LJIILL(c6g02.getContext());
            if (LJIILL != null && inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(LJIILL.getWindow().getDecorView().getWindowToken(), 0);
            }
            ((C6G0) aLAdapterS1S0100000_2.l0).setVisibility(4);
            return;
        }
        o.LJIJI("rootViw");
        throw null;
    }

    public static final void onAnimationEnd$10(ALAdapterS1S0100000_2 aLAdapterS1S0100000_2, Animator animation) {
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro;
        o.LJIIIZ(animation, "animation");
        C140355f5 c140355f5 = (C140355f5) aLAdapterS1S0100000_2.l0;
        if (c140355f5 != null && (interfaceC65784Pro = c140355f5.LIZIZ) != null) {
            interfaceC65784Pro.invoke();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
    
        if (r1 <= r3) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onAnimationEnd$11(Y.ALAdapterS1S0100000_2 r8, android.animation.Animator r9) {
        /*
            java.lang.String r0 = "animation"
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            java.lang.Object r0 = r8.l0
            com.ss.android.ugc.gamora.editorpro.EditorProScene r0 = (com.ss.android.ugc.gamora.editorpro.EditorProScene) r0
            r0.onAnimEnd()
            java.lang.Object r0 = r8.l0
            com.ss.android.ugc.gamora.editorpro.EditorProScene r0 = (com.ss.android.ugc.gamora.editorpro.EditorProScene) r0
            com.ss.ugc.android.editor.core.EditorProContext r0 = r0.getEditorContext()
            com.bytedance.ies.nle.editor_jni.NLETrack r0 = r0.getMainTrack()
            r7 = 0
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r1 = r0.LJIILIIL(r7)
            if (r1 != 0) goto L20
            return
        L20:
            boolean r0 = X.C124574uj.LJJJJ(r1)
            if (r0 == 0) goto L5e
            long r5 = r1.getStartTime()
            long r3 = r1.getEndTime()
            java.lang.Object r0 = r8.l0
            com.ss.android.ugc.gamora.editorpro.EditorProScene r0 = (com.ss.android.ugc.gamora.editorpro.EditorProScene) r0
            long r1 = r0.seekPosition
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L5e
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto L5e
        L3c:
            java.lang.Object r0 = r8.l0
            com.ss.android.ugc.gamora.editorpro.EditorProScene r0 = (com.ss.android.ugc.gamora.editorpro.EditorProScene) r0
            r0.doAfterFirstFrame(r7)
            java.lang.Object r0 = r8.l0
            com.ss.android.ugc.gamora.editorpro.EditorProScene r0 = (com.ss.android.ugc.gamora.editorpro.EditorProScene) r0
            java.lang.Object r0 = r0.getUiActions()
            X.5Gh r0 = (X.C132075Gh) r0
            X.Pro<X.UCe> r0 = r0.LJLJJL
            r0.invoke()
            java.lang.Object r0 = r8.l0
            com.ss.android.ugc.gamora.editorpro.EditorProScene r0 = (com.ss.android.ugc.gamora.editorpro.EditorProScene) r0
            X.5Fy r1 = r0.getAnimationController()
            r0 = 0
            r1.LJFF = r0
            return
        L5e:
            r7 = 1
            goto L3c
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ALAdapterS1S0100000_2.onAnimationEnd$11(Y.ALAdapterS1S0100000_2, android.animation.Animator):void");
    }

    public static final void onAnimationEnd$12(ALAdapterS1S0100000_2 aLAdapterS1S0100000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C130995Cd c130995Cd = (C130995Cd) aLAdapterS1S0100000_2.l0;
        c130995Cd.LJLLLL = false;
        c130995Cd.LJLJJI.setAlpha(0);
        ((C130995Cd) aLAdapterS1S0100000_2.l0).invalidate();
    }

    public static final void onAnimationEnd$13(ALAdapterS1S0100000_2 aLAdapterS1S0100000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C131015Cf) aLAdapterS1S0100000_2.l0).invalidate();
    }

    public static final void onAnimationEnd$14(ALAdapterS1S0100000_2 aLAdapterS1S0100000_2, Animator animator) {
        super.onAnimationEnd(animator);
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZJ = Float.valueOf(KL2.LIZJ(((C45737HxF) aLAdapterS1S0100000_2.l0).getContext(), 4.0f));
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.dk);
        C45737HxF c45737HxF = (C45737HxF) aLAdapterS1S0100000_2.l0;
        c45737HxF.LJLJLJ.setBackground(c110614Vt.LIZ(c45737HxF.getContext()));
    }

    public static final void onAnimationEnd$15(ALAdapterS1S0100000_2 aLAdapterS1S0100000_2, Animator animator) {
        super.onAnimationEnd(animator);
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZJ = Float.valueOf(KL2.LIZJ(((C45737HxF) aLAdapterS1S0100000_2.l0).getContext(), 4.0f));
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.dm);
        C45737HxF c45737HxF = (C45737HxF) aLAdapterS1S0100000_2.l0;
        c45737HxF.LJLJLJ.setBackground(c110614Vt.LIZ(c45737HxF.getContext()));
        ((C45737HxF) aLAdapterS1S0100000_2.l0).getHandler().postDelayed(((C45737HxF) aLAdapterS1S0100000_2.l0).LJLLL, 3000L);
    }

    public static final void onAnimationEnd$16(ALAdapterS1S0100000_2 aLAdapterS1S0100000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ((C145045me) aLAdapterS1S0100000_2.l0).setAlpha(1.0f);
        ((C145045me) aLAdapterS1S0100000_2.l0).setVisibility(8);
    }

    public static final void onAnimationEnd$17(ALAdapterS1S0100000_2 aLAdapterS1S0100000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aLAdapterS1S0100000_2.l0;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(2);
        }
    }

    public static final void onAnimationEnd$18(ALAdapterS1S0100000_2 aLAdapterS1S0100000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ((C151085wO) aLAdapterS1S0100000_2.l0).setAlpha(1.0f);
        ((C151085wO) aLAdapterS1S0100000_2.l0).setVisibility(8);
    }

    public static final void onAnimationEnd$19(ALAdapterS1S0100000_2 aLAdapterS1S0100000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C132565Ie) aLAdapterS1S0100000_2.l0).LJIIL().removeAllViews();
        C132565Ie c132565Ie = (C132565Ie) aLAdapterS1S0100000_2.l0;
        C16880lQ.LJLLL(c132565Ie.LJIILJJIL(), c132565Ie.LIZ);
        C132565Ie c132565Ie2 = (C132565Ie) aLAdapterS1S0100000_2.l0;
        C16880lQ.LJLLL(c132565Ie2.LJIIL(), c132565Ie2.LIZ);
    }

    public static final void onAnimationEnd$2(ALAdapterS1S0100000_2 aLAdapterS1S0100000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C29701Eo) aLAdapterS1S0100000_2.l0).removeAllAnimatorListeners();
    }

    public static final void onAnimationEnd$20(ALAdapterS1S0100000_2 aLAdapterS1S0100000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C132565Ie c132565Ie = (C132565Ie) aLAdapterS1S0100000_2.l0;
        C16880lQ.LJLLL(c132565Ie.LJIIL, c132565Ie.LIZ);
    }

    public static final void onAnimationEnd$21(ALAdapterS1S0100000_2 aLAdapterS1S0100000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ((C132565Ie) aLAdapterS1S0100000_2.l0).LJIILLIIL();
    }

    public static final void onAnimationEnd$22(ALAdapterS1S0100000_2 aLAdapterS1S0100000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ((C132565Ie) aLAdapterS1S0100000_2.l0).LJIILLIIL();
    }

    public static final void onAnimationEnd$23(ALAdapterS1S0100000_2 aLAdapterS1S0100000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ((C132565Ie) aLAdapterS1S0100000_2.l0).LJIILLIIL();
    }

    public static final void onAnimationEnd$24(ALAdapterS1S0100000_2 aLAdapterS1S0100000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ((C132565Ie) aLAdapterS1S0100000_2.l0).LJIILLIIL();
    }

    public static final void onAnimationEnd$25(ALAdapterS1S0100000_2 aLAdapterS1S0100000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ((C54F) aLAdapterS1S0100000_2.l0).LIZ().setVisibility(4);
    }

    public static final void onAnimationEnd$26(ALAdapterS1S0100000_2 aLAdapterS1S0100000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        InterfaceC151935xl interfaceC151935xl = ((C151885xg) aLAdapterS1S0100000_2.l0).LJLL;
        if (interfaceC151935xl != null) {
            interfaceC151935xl.LIZ(0);
        }
    }

    public static final void onAnimationEnd$27(ALAdapterS1S0100000_2 aLAdapterS1S0100000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ((FrameLayout) aLAdapterS1S0100000_2.l0).setVisibility(8);
    }

    public static final void onAnimationEnd$28(ALAdapterS1S0100000_2 aLAdapterS1S0100000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C151035wJ.LIZ(((C152335yP) aLAdapterS1S0100000_2.l0).LIZ);
    }

    public static final void onAnimationEnd$29(ALAdapterS1S0100000_2 aLAdapterS1S0100000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C152335yP) aLAdapterS1S0100000_2.l0).LIZJ.setVisibility(4);
    }

    public static final void onAnimationEnd$3(ALAdapterS1S0100000_2 aLAdapterS1S0100000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((AbstractC156316Bn) aLAdapterS1S0100000_2.l0).setSearchListViewVisibility(0);
        ((AbstractC156316Bn) aLAdapterS1S0100000_2.l0).LJ();
    }

    public static final void onAnimationEnd$30(ALAdapterS1S0100000_2 aLAdapterS1S0100000_2, Animator animation) {
        C1297357h c1297357h;
        C1297357h c1297357h2;
        o.LJIIIZ(animation, "animation");
        C51P.LIZ(((AnonymousClass584) aLAdapterS1S0100000_2.l0).LIZIZ, false, false);
        C58D c58d = ((AnonymousClass584) aLAdapterS1S0100000_2.l0).LIZLLL;
        if (c58d != null && (c1297357h2 = (C1297357h) c58d.findViewById(R.id.gp3)) != null) {
            c1297357h2.setLongClickEnable(false);
        }
        C58D c58d2 = ((AnonymousClass584) aLAdapterS1S0100000_2.l0).LIZLLL;
        if (c58d2 == null || (c1297357h = (C1297357h) c58d2.findViewById(R.id.gp3)) == null) {
            return;
        }
        c1297357h.setSlotClickEnable(false);
    }

    public static final void onAnimationEnd$31(ALAdapterS1S0100000_2 aLAdapterS1S0100000_2, Animator animation) {
        C1297357h c1297357h;
        o.LJIIIZ(animation, "animation");
        C58D c58d = ((AnonymousClass584) aLAdapterS1S0100000_2.l0).LIZLLL;
        C1297357h c1297357h2 = null;
        if (c58d != null) {
            c1297357h2 = (C1297357h) c58d.findViewById(R.id.gp3);
        }
        if (c1297357h2 != null) {
            c1297357h2.setLongClickEnable(true);
        }
        C58D c58d2 = ((AnonymousClass584) aLAdapterS1S0100000_2.l0).LIZLLL;
        if (c58d2 != null && (c1297357h = (C1297357h) c58d2.findViewById(R.id.gp3)) != null) {
            c1297357h.setSlotClickEnable(true);
        }
        AnonymousClass584 anonymousClass584 = (AnonymousClass584) aLAdapterS1S0100000_2.l0;
        C52T c52t = anonymousClass584.LIZIZ;
        if (c52t != null) {
            c52t.Ua0(C52V.PLAY, true, false);
            c52t.Ua0(C52V.FULL_SCREEN, true, false);
            if (C79057V0z.LJIIJ(anonymousClass584.LJ)) {
                c52t.Ua0(C52V.UNDO, true, true);
            }
            c52t.Ua0(C52V.REDO, C79057V0z.LJIIIZ(anonymousClass584.LJ), true);
        }
    }

    public static final void onAnimationEnd$32(ALAdapterS1S0100000_2 aLAdapterS1S0100000_2, Animator animation) {
        ImageView imageView;
        o.LJIIIZ(animation, "animation");
        ((AnonymousClass584) aLAdapterS1S0100000_2.l0).LIZ.setVisibility(4);
        ((AnonymousClass584) aLAdapterS1S0100000_2.l0).LIZJ.setVisibility(4);
        C58D c58d = ((AnonymousClass584) aLAdapterS1S0100000_2.l0).LIZLLL;
        if (c58d == null || (imageView = (ImageView) c58d.findViewById(R.id.evq)) == null) {
            return;
        }
        imageView.setVisibility(4);
    }

    public static final void onAnimationEnd$33(ALAdapterS1S0100000_2 aLAdapterS1S0100000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C5UU) aLAdapterS1S0100000_2.l0).LJLIL = false;
    }

    public static final void onAnimationEnd$34(ALAdapterS1S0100000_2 aLAdapterS1S0100000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C5UU) aLAdapterS1S0100000_2.l0).LJLIL = false;
    }

    public static final void onAnimationEnd$35(ALAdapterS1S0100000_2 aLAdapterS1S0100000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C6QK) aLAdapterS1S0100000_2.l0).LJ.setVisibility(4);
    }

    public static final void onAnimationEnd$36(ALAdapterS1S0100000_2 aLAdapterS1S0100000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ((C6QK) aLAdapterS1S0100000_2.l0).LJ.setAlpha(1.0f);
    }

    public static final void onAnimationEnd$37(ALAdapterS1S0100000_2 aLAdapterS1S0100000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C158326Jg mChild = ((ViewOnClickListenerC158316Jf) aLAdapterS1S0100000_2.l0).getMChild();
        if (mChild != null) {
            C158396Jn c158396Jn = mChild.LJLJI;
            if (c158396Jn != null) {
                c158396Jn.setVisibility(0);
            } else {
                o.LJIJI("edLiveTitle");
                throw null;
            }
        }
        C158326Jg mChild2 = ((ViewOnClickListenerC158316Jf) aLAdapterS1S0100000_2.l0).getMChild();
        if (mChild2 != null) {
            mChild2.LIZLLL();
        }
        ViewOnClickListenerC158316Jf viewOnClickListenerC158316Jf = (ViewOnClickListenerC158316Jf) aLAdapterS1S0100000_2.l0;
        C158326Jg mChild3 = viewOnClickListenerC158316Jf.getMChild();
        o.LJI(mChild3);
        viewOnClickListenerC158316Jf.LIZJ(mChild3);
        C8H9 c8h9 = ((ViewOnClickListenerC158316Jf) aLAdapterS1S0100000_2.l0).LJLJI;
        if (c8h9 != null) {
            c8h9.setVisibility(0);
            ((ViewOnClickListenerC158316Jf) aLAdapterS1S0100000_2.l0).LIZ(0);
            ((ViewOnClickListenerC158316Jf) aLAdapterS1S0100000_2.l0).LJLJL = false;
            return;
        }
        o.LJIJI("liveCDHint");
        throw null;
    }

    public static final void onAnimationEnd$38(ALAdapterS1S0100000_2 aLAdapterS1S0100000_2, Animator p0) {
        o.LJIIIZ(p0, "p0");
        ((C1293955z) aLAdapterS1S0100000_2.l0).LIZIZ = null;
    }

    public static final void onAnimationEnd$39(ALAdapterS1S0100000_2 aLAdapterS1S0100000_2, Animator p0) {
        o.LJIIIZ(p0, "p0");
        ((C1293955z) aLAdapterS1S0100000_2.l0).LIZJ = null;
    }

    public static final void onAnimationEnd$4(ALAdapterS1S0100000_2 aLAdapterS1S0100000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((AbstractC156316Bn) aLAdapterS1S0100000_2.l0).setSearchListViewVisibility(0);
        ((AbstractC156316Bn) aLAdapterS1S0100000_2.l0).LJ();
    }

    public static final void onAnimationEnd$40(ALAdapterS1S0100000_2 aLAdapterS1S0100000_2, Animator p0) {
        o.LJIIIZ(p0, "p0");
        ((C1293955z) aLAdapterS1S0100000_2.l0).LJ = null;
    }

    public static final void onAnimationEnd$41(ALAdapterS1S0100000_2 aLAdapterS1S0100000_2, Animator p0) {
        o.LJIIIZ(p0, "p0");
        ((C1293955z) aLAdapterS1S0100000_2.l0).LIZLLL = null;
    }

    public static final void onAnimationEnd$42(ALAdapterS1S0100000_2 aLAdapterS1S0100000_2, Animator animation) {
        RectF LJFF;
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        C151065wM c151065wM = ((ViewOnClickListenerC151455wz) aLAdapterS1S0100000_2.l0).LLD;
        if (c151065wM != null && (LJFF = c151065wM.LJFF()) != null) {
            ((ViewOnClickListenerC151455wz) aLAdapterS1S0100000_2.l0).LLJJJ(LJFF);
        }
        ((ViewOnClickListenerC151455wz) aLAdapterS1S0100000_2.l0).LLIIII = null;
    }

    public static final void onAnimationEnd$43(ALAdapterS1S0100000_2 aLAdapterS1S0100000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        View view = ((C146485oy) aLAdapterS1S0100000_2.l0).mView;
        o.LJIIIIZZ(view, "view");
        C146485oy.LLJILJIL(view, false);
    }

    public static final void onAnimationEnd$44(ALAdapterS1S0100000_2 aLAdapterS1S0100000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        C6JI c6ji = (C6JI) aLAdapterS1S0100000_2.l0;
        c6ji.LJLLLLLL = null;
        C6JH c6jh = c6ji.LJLLJ;
        if (c6jh != null) {
            c6jh.LJFF();
        }
        C6JI c6ji2 = (C6JI) aLAdapterS1S0100000_2.l0;
        C6JH c6jh2 = c6ji2.LJLLJ;
        if (c6jh2 != null) {
            FrameLayout frameLayout = c6ji2.LJLIL;
            if (frameLayout != null) {
                C16880lQ.LJLLLL(c6jh2, frameLayout);
                c6jh2.setEditEnable(false);
                C6JH c6jh3 = c6ji2.LJLLJ;
                if (c6jh3 != null) {
                    c6jh3.setScaleX(1.0f);
                    c6jh3.setScaleY(1.0f);
                    c6jh3.setRotation(0.0f);
                    c6jh3.setTranslationX(0.0f);
                    c6jh3.setTranslationY(0.0f);
                    c6ji2.LJLJLLL = 0;
                    c6ji2.LJLJL = new C156306Bm(0);
                }
                InterfaceC88472Yns<? super C6JH, C76800UCe> interfaceC88472Yns = c6ji2.LJLJJI;
                if (interfaceC88472Yns != null) {
                    interfaceC88472Yns.invoke(c6ji2.LJLLJ);
                }
                c6ji2.LJLLJ = null;
            } else {
                o.LJIJI("container");
                throw null;
            }
        }
        ((C6JI) aLAdapterS1S0100000_2.l0).setVisibility(4);
    }

    public static final void onAnimationEnd$45(ALAdapterS1S0100000_2 aLAdapterS1S0100000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C6JH c6jh = ((C6JI) aLAdapterS1S0100000_2.l0).LJLLJ;
        if (c6jh != null) {
            c6jh.LIZ(R.id.d03).setVisibility(0);
            c6jh.LIZ(R.id.flo).setVisibility(0);
        }
    }

    public static final void onAnimationEnd$46(ALAdapterS1S0100000_2 aLAdapterS1S0100000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C6JH c6jh = ((C6JI) aLAdapterS1S0100000_2.l0).LJLLJ;
        if (c6jh != null) {
            c6jh.LIZ(R.id.d03).setVisibility(0);
            c6jh.LIZ(R.id.flo).setVisibility(0);
        }
    }

    public static final void onAnimationEnd$5(ALAdapterS1S0100000_2 aLAdapterS1S0100000_2, Animator animator) {
        ((C1545664u) aLAdapterS1S0100000_2.l0).LLIILZL = false;
    }

    public static final void onAnimationEnd$6(ALAdapterS1S0100000_2 aLAdapterS1S0100000_2, Animator animator) {
        ((C6IQ) aLAdapterS1S0100000_2.l0).LJZI = false;
    }

    public static final void onAnimationEnd$7(ALAdapterS1S0100000_2 aLAdapterS1S0100000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ViewOnClickListenerC158316Jf viewOnClickListenerC158316Jf = (ViewOnClickListenerC158316Jf) aLAdapterS1S0100000_2.l0;
        viewOnClickListenerC158316Jf.LJZI = null;
        viewOnClickListenerC158316Jf.getMChild();
        ((ViewOnClickListenerC158316Jf) aLAdapterS1S0100000_2.l0).LJII(false);
        ((ViewOnClickListenerC158316Jf) aLAdapterS1S0100000_2.l0).setVisibility(4);
        ((ViewOnClickListenerC158316Jf) aLAdapterS1S0100000_2.l0).LJLJJLL = false;
    }

    public static final void onAnimationEnd$8(ALAdapterS1S0100000_2 aLAdapterS1S0100000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ((ImagePublishPreviewActivity) aLAdapterS1S0100000_2.l0).LLILIL().setVisibility(8);
    }

    public static final void onAnimationEnd$9(ALAdapterS1S0100000_2 aLAdapterS1S0100000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ((C144855mL) aLAdapterS1S0100000_2.l0).getClass();
    }

    public static final void onAnimationRepeat$0(ALAdapterS1S0100000_2 aLAdapterS1S0100000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((AudioBeatsPanelFragment) aLAdapterS1S0100000_2.l0).LLD = 0.0f;
    }

    public static final void onAnimationStart$0(ALAdapterS1S0100000_2 aLAdapterS1S0100000_2, Animator animator) {
        ((C1545664u) aLAdapterS1S0100000_2.l0).LLIILZL = true;
    }

    public static final void onAnimationStart$1(ALAdapterS1S0100000_2 aLAdapterS1S0100000_2, Animator animator) {
        ((C6IQ) aLAdapterS1S0100000_2.l0).LJZI = true;
    }

    public static final void onAnimationStart$10(ALAdapterS1S0100000_2 aLAdapterS1S0100000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C5UU c5uu = (C5UU) aLAdapterS1S0100000_2.l0;
        c5uu.LJLIL = true;
        c5uu.LJLILLLLZI = false;
    }

    public static final void onAnimationStart$11(ALAdapterS1S0100000_2 aLAdapterS1S0100000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C1302459g c1302459g = (C1302459g) aLAdapterS1S0100000_2.l0;
        c1302459g.LJIIL = 0.0f;
        c1302459g.LJIIJJI = 0.0f;
    }

    public static final void onAnimationStart$12(ALAdapterS1S0100000_2 aLAdapterS1S0100000_2, Animator animation) {
        boolean z;
        int i;
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        List<AddYoursStickerTopicRepoApi$AddYoursSuggestTopic> list = ((C6SQ) aLAdapterS1S0100000_2.l0).LLF.get(EnumC160626Sc.RECOMMEND);
        List<AddYoursStickerTopicRepoApi$AddYoursSuggestTopic> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!(!z)) {
            list = null;
        }
        List<AddYoursStickerTopicRepoApi$AddYoursSuggestTopic> list3 = list;
        if (list3 != null) {
            C6SQ c6sq = (C6SQ) aLAdapterS1S0100000_2.l0;
            int i2 = c6sq.LLD;
            if (i2 < 0) {
                c6sq.LLD = C78842Uww.LJIJ(V0Q.Default, C47261Igj.LJJ(list3));
            } else {
                c6sq.LLD = (i2 + 1) % list3.size();
            }
            AddYoursStickerTopicRepoApi$AddYoursSuggestTopic addYoursStickerTopicRepoApi$AddYoursSuggestTopic = (AddYoursStickerTopicRepoApi$AddYoursSuggestTopic) ListProtector.get(list3, c6sq.LLD);
            C6SL LJIIJ = c6sq.LJLJJI.LJIIJ();
            if (LJIIJ != null) {
                C1NS<AddYoursStickerModel> c1ns = c6sq.LJLJL;
                if (c1ns != null) {
                    String topicText = c1ns.LJ.getTopicText();
                    String str = "";
                    if (topicText == null) {
                        topicText = "";
                    }
                    String text = addYoursStickerTopicRepoApi$AddYoursSuggestTopic.getText();
                    if (text == null) {
                        text = "";
                    }
                    String value = C6ST.ICON.getValue();
                    boolean z2 = C6SQ.LLIFFJFJJ;
                    C1NS<AddYoursStickerModel> c1ns2 = c6sq.LJLJL;
                    if (c1ns2 != null) {
                        String addYoursEnterMethod = c1ns2.LJ.getAddYoursEnterMethod();
                        if (addYoursEnterMethod != null) {
                            str = addYoursEnterMethod;
                        }
                        Integer type = addYoursStickerTopicRepoApi$AddYoursSuggestTopic.getType();
                        if (type != null) {
                            i = type.intValue();
                        } else {
                            i = 0;
                        }
                        LJIIJ.LJII(i, topicText, text, value, str, z2);
                    } else {
                        o.LJIJI("stateContainer");
                        throw null;
                    }
                } else {
                    o.LJIJI("stateContainer");
                    throw null;
                }
            }
            C1NS<AddYoursStickerModel> c1ns3 = c6sq.LJLJL;
            if (c1ns3 != null) {
                c1ns3.LJ(new AqS168S0100000_2(addYoursStickerTopicRepoApi$AddYoursSuggestTopic, 604));
                c6sq.setInputMode(C6SS.AUTO);
                c6sq.LLFFF = ((AddYoursStickerTopicRepoApi$AddYoursSuggestTopic) ListProtector.get(list3, c6sq.LLD)).getText();
                return;
            }
            o.LJIJI("stateContainer");
            throw null;
        }
    }

    public static final void onAnimationStart$2(ALAdapterS1S0100000_2 aLAdapterS1S0100000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((EditorProScene) aLAdapterS1S0100000_2.l0).getUiActions().LJLJJI.invoke();
    }

    public static final void onAnimationStart$3(ALAdapterS1S0100000_2 aLAdapterS1S0100000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((AudioBeatsPanelFragment) aLAdapterS1S0100000_2.l0).LLD = 0.0f;
    }

    public static final void onAnimationStart$4(ALAdapterS1S0100000_2 aLAdapterS1S0100000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C1294856i cursor$tools_camera_edit_release = ((C54F) aLAdapterS1S0100000_2.l0).getCursor$tools_camera_edit_release();
        if (cursor$tools_camera_edit_release != null) {
            cursor$tools_camera_edit_release.setVisibility(0);
        }
        super.onAnimationStart(animation);
    }

    public static final void onAnimationStart$5(ALAdapterS1S0100000_2 aLAdapterS1S0100000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C54F) aLAdapterS1S0100000_2.l0).LIZ().setVisibility(0);
        super.onAnimationStart(animation);
    }

    public static final void onAnimationStart$6(ALAdapterS1S0100000_2 aLAdapterS1S0100000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aLAdapterS1S0100000_2.l0;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(1);
        }
    }

    public static final void onAnimationStart$7(ALAdapterS1S0100000_2 aLAdapterS1S0100000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C152335yP) aLAdapterS1S0100000_2.l0).LIZJ.setVisibility(0);
    }

    public static final void onAnimationStart$8(ALAdapterS1S0100000_2 aLAdapterS1S0100000_2, Animator animation) {
        ImageView imageView;
        o.LJIIIZ(animation, "animation");
        ((AnonymousClass584) aLAdapterS1S0100000_2.l0).LIZ.setVisibility(0);
        ((AnonymousClass584) aLAdapterS1S0100000_2.l0).LIZJ.setVisibility(0);
        C58D c58d = ((AnonymousClass584) aLAdapterS1S0100000_2.l0).LIZLLL;
        if (c58d == null || (imageView = (ImageView) c58d.findViewById(R.id.evq)) == null) {
            return;
        }
        imageView.setVisibility(0);
    }

    public static final void onAnimationStart$9(ALAdapterS1S0100000_2 aLAdapterS1S0100000_2, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C5UU c5uu = (C5UU) aLAdapterS1S0100000_2.l0;
        c5uu.LJLIL = true;
        c5uu.LJLILLLLZI = true;
    }
}
