package Y;

import X.AbstractC183947Ju;
import X.C177326xc;
import X.C183487Ia;
import X.C207768Dk;
import X.C208278Fj;
import X.C212808Wu;
import X.C264612c;
import X.C71Y;
import X.C78886Uxe;
import X.C80896Voy;
import X.C8FY;
import X.C8FZ;
import X.X1D;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.NowKeyboardFragment;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.CommentKeyboardMultiPanelAssem;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.CommentRepostCardAssem;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.RefactorKeyboardPanelV2;
import com.ss.android.ugc.aweme.comment.widget.CommentNestedLayout;
import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarDefaultAssem;
import com.ss.android.ugc.aweme.feed.assem.desc.LandscapeDescAssem;
import com.ss.android.ugc.aweme.feed.assem.ffpbutton.FollowButtonFFPAssem;
import com.ss.android.ugc.aweme.feed.assem.friendstab.GoToFriendsGuideAssem;
import com.ss.android.ugc.aweme.feed.assem.sharer.VideoExposeSharerInformationAssem;
import com.ss.android.ugc.aweme.nows.feed.caption.NowCollectionCellCaptionAssem;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class AUListenerS92S0100000_3 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public Object l0;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$t) {
            case 0:
                onAnimationUpdate$0(this, valueAnimator);
                return;
            case 1:
                onAnimationUpdate$1(this, valueAnimator);
                return;
            case 2:
                onAnimationUpdate$2(this, valueAnimator);
                return;
            case 3:
                onAnimationUpdate$3(this, valueAnimator);
                return;
            case 4:
                onAnimationUpdate$4(this, valueAnimator);
                return;
            case 5:
                onAnimationUpdate$5(this, valueAnimator);
                return;
            case 6:
                onAnimationUpdate$6(this, valueAnimator);
                return;
            case 7:
                onAnimationUpdate$7(this, valueAnimator);
                return;
            case 8:
                onAnimationUpdate$8(this, valueAnimator);
                return;
            case 9:
                onAnimationUpdate$9(this, valueAnimator);
                return;
            case 10:
                onAnimationUpdate$10(this, valueAnimator);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onAnimationUpdate$11(this, valueAnimator);
                return;
            case 12:
                onAnimationUpdate$12(this, valueAnimator);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                onAnimationUpdate$13(this, valueAnimator);
                return;
            case 14:
                onAnimationUpdate$14(this, valueAnimator);
                return;
            case 15:
                onAnimationUpdate$15(this, valueAnimator);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                onAnimationUpdate$16(this, valueAnimator);
                return;
            case 17:
                onAnimationUpdate$17(this, valueAnimator);
                return;
            case 18:
                onAnimationUpdate$18(this, valueAnimator);
                return;
            case 19:
                onAnimationUpdate$19(this, valueAnimator);
                return;
            case 20:
                onAnimationUpdate$20(this, valueAnimator);
                return;
            case 21:
                onAnimationUpdate$21(this, valueAnimator);
                return;
            case 22:
                onAnimationUpdate$22(this, valueAnimator);
                return;
            case 23:
                onAnimationUpdate$23(this, valueAnimator);
                return;
            case 24:
                onAnimationUpdate$24(this, valueAnimator);
                return;
            case 25:
                onAnimationUpdate$25(this, valueAnimator);
                return;
            case 26:
                onAnimationUpdate$26(this, valueAnimator);
                return;
            case 27:
                onAnimationUpdate$27(this, valueAnimator);
                return;
            case 28:
                onAnimationUpdate$28(this, valueAnimator);
                return;
            case 29:
                onAnimationUpdate$29(this, valueAnimator);
                return;
            case 30:
                onAnimationUpdate$30(this, valueAnimator);
                return;
            case 31:
                onAnimationUpdate$31(this, valueAnimator);
                return;
            case 32:
                onAnimationUpdate$32(this, valueAnimator);
                return;
            case 33:
                onAnimationUpdate$33(this, valueAnimator);
                return;
            case 34:
                onAnimationUpdate$34(this, valueAnimator);
                return;
            case 35:
                onAnimationUpdate$35(this, valueAnimator);
                return;
            case 36:
                onAnimationUpdate$36(this, valueAnimator);
                return;
            case 37:
                onAnimationUpdate$37(this, valueAnimator);
                return;
            case 38:
                onAnimationUpdate$38(this, valueAnimator);
                return;
            case 39:
                onAnimationUpdate$39(this, valueAnimator);
                return;
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                onAnimationUpdate$40(this, valueAnimator);
                return;
            default:
                return;
        }
    }

    public AUListenerS92S0100000_3(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationUpdate$0(AUListenerS92S0100000_3 aUListenerS92S0100000_3, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        TextView textView = (TextView) aUListenerS92S0100000_3.l0;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        textView.setScrollX(((Integer) animatedValue).intValue());
    }

    public static final void onAnimationUpdate$1(AUListenerS92S0100000_3 aUListenerS92S0100000_3, ValueAnimator it) {
        ViewGroup.LayoutParams layoutParams;
        o.LJIIIZ(it, "it");
        ViewGroup viewGroup = ((C177326xc) aUListenerS92S0100000_3.l0).LJIIJ;
        if (viewGroup != null) {
            layoutParams = viewGroup.getLayoutParams();
            if (layoutParams != null) {
                Object animatedValue = it.getAnimatedValue();
                o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                layoutParams.height = ((Integer) animatedValue).intValue();
            }
        } else {
            layoutParams = null;
        }
        ViewGroup viewGroup2 = ((C177326xc) aUListenerS92S0100000_3.l0).LJIIJ;
        if (viewGroup2 == null) {
            return;
        }
        viewGroup2.setLayoutParams(layoutParams);
    }

    public static final void onAnimationUpdate$10(AUListenerS92S0100000_3 aUListenerS92S0100000_3, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        ViewGroup.MarginLayoutParams marginLayoutParams = ((C212808Wu) aUListenerS92S0100000_3.l0).getMarginLayoutParams();
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        marginLayoutParams.bottomMargin = ((Integer) animatedValue).intValue();
        ((C212808Wu) aUListenerS92S0100000_3.l0).requestLayout();
    }

    public static final void onAnimationUpdate$11(AUListenerS92S0100000_3 aUListenerS92S0100000_3, ValueAnimator animation) {
        o.LJIIIZ(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        ViewGroup.LayoutParams layoutParams = ((NowCollectionCellCaptionAssem) aUListenerS92S0100000_3.l0).Z3().getLayoutParams();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        layoutParams.height = ((Integer) animatedValue).intValue();
        ((NowCollectionCellCaptionAssem) aUListenerS92S0100000_3.l0).Z3().requestLayout();
    }

    public static final void onAnimationUpdate$12(AUListenerS92S0100000_3 aUListenerS92S0100000_3, ValueAnimator valueAnimator) {
        o.LJIIIZ(valueAnimator, "valueAnimator");
        View view = (View) aUListenerS92S0100000_3.l0;
        o.LJII(valueAnimator.getAnimatedValue(), "null cannot be cast to non-null type kotlin.Int");
        view.setTranslationY(((Integer) r1).intValue());
    }

    public static final void onAnimationUpdate$13(AUListenerS92S0100000_3 aUListenerS92S0100000_3, ValueAnimator valueAnimator) {
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "valueAnimator", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        View upvoteTVContainer = ((C183487Ia) aUListenerS92S0100000_3.l0).LIZIZ.getUpvoteTVContainer();
        if (upvoteTVContainer == null) {
            return;
        }
        upvoteTVContainer.setAlpha(floatValue);
    }

    public static final void onAnimationUpdate$14(AUListenerS92S0100000_3 aUListenerS92S0100000_3, ValueAnimator valueAnimator) {
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "valueAnimator", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        View upvoteTVContainer = ((C183487Ia) aUListenerS92S0100000_3.l0).LIZ.getUpvoteTVContainer();
        if (upvoteTVContainer == null) {
            return;
        }
        upvoteTVContainer.setAlpha(1 - floatValue);
    }

    public static final void onAnimationUpdate$15(AUListenerS92S0100000_3 aUListenerS92S0100000_3, ValueAnimator valueAnimator) {
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "valueAnimator", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        View upvoteTVContainer = ((C183487Ia) aUListenerS92S0100000_3.l0).LIZIZ.getUpvoteTVContainer();
        if (upvoteTVContainer == null) {
            return;
        }
        upvoteTVContainer.setAlpha(floatValue);
    }

    public static final void onAnimationUpdate$16(AUListenerS92S0100000_3 aUListenerS92S0100000_3, ValueAnimator valueAnimator) {
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "valueAnimator", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        View upvoteTVContainer = ((C183487Ia) aUListenerS92S0100000_3.l0).LIZ.getUpvoteTVContainer();
        if (upvoteTVContainer == null) {
            return;
        }
        upvoteTVContainer.setAlpha(1 - floatValue);
    }

    public static final void onAnimationUpdate$17(AUListenerS92S0100000_3 aUListenerS92S0100000_3, ValueAnimator valueAnimator) {
        ((C183487Ia) aUListenerS92S0100000_3.l0).LIZ.setAlpha(((Float) C264612c.LIZ(valueAnimator, "valueAnimator", "null cannot be cast to non-null type kotlin.Float")).floatValue());
    }

    public static final void onAnimationUpdate$18(AUListenerS92S0100000_3 aUListenerS92S0100000_3, ValueAnimator valueAnimator) {
        ((C183487Ia) aUListenerS92S0100000_3.l0).LIZIZ.setAlpha(((Float) C264612c.LIZ(valueAnimator, "valueAnimator", "null cannot be cast to non-null type kotlin.Float")).floatValue());
    }

    public static final void onAnimationUpdate$19(AUListenerS92S0100000_3 aUListenerS92S0100000_3, ValueAnimator valueAnimator) {
        ((C183487Ia) aUListenerS92S0100000_3.l0).LIZ.setAlpha(1 - ((Float) C264612c.LIZ(valueAnimator, "valueAnimator", "null cannot be cast to non-null type kotlin.Float")).floatValue());
    }

    public static final void onAnimationUpdate$2(AUListenerS92S0100000_3 aUListenerS92S0100000_3, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        C80896Voy c80896Voy = (C80896Voy) aUListenerS92S0100000_3.l0;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        c80896Voy.setScrollY(((Integer) animatedValue).intValue());
    }

    public static final void onAnimationUpdate$20(AUListenerS92S0100000_3 aUListenerS92S0100000_3, ValueAnimator valueAnimator) {
        Float f;
        o.LJIIIZ(valueAnimator, "valueAnimator");
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            AbstractC183947Ju abstractC183947Ju = (AbstractC183947Ju) aUListenerS92S0100000_3.l0;
            f.floatValue();
            if (abstractC183947Ju == null) {
                return;
            }
            abstractC183947Ju.setAlpha(f.floatValue());
        }
    }

    public static final void onAnimationUpdate$21(AUListenerS92S0100000_3 aUListenerS92S0100000_3, ValueAnimator valueAnimator) {
        Float f;
        o.LJIIIZ(valueAnimator, "valueAnimator");
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            AbstractC183947Ju abstractC183947Ju = (AbstractC183947Ju) aUListenerS92S0100000_3.l0;
            f.floatValue();
            if (abstractC183947Ju == null) {
                return;
            }
            abstractC183947Ju.setAlpha(1 - f.floatValue());
        }
    }

    public static final void onAnimationUpdate$22(AUListenerS92S0100000_3 aUListenerS92S0100000_3, ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ((View) aUListenerS92S0100000_3.l0).getLayoutParams();
        marginLayoutParams.bottomMargin = intValue;
        ((View) aUListenerS92S0100000_3.l0).setLayoutParams(marginLayoutParams);
    }

    public static final void onAnimationUpdate$23(AUListenerS92S0100000_3 aUListenerS92S0100000_3, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        ViewGroup viewGroup = ((CommentRepostCardAssem) aUListenerS92S0100000_3.l0).LJLJJL;
        if (viewGroup != null) {
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            Object animatedValue = it.getAnimatedValue();
            o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            layoutParams.height = ((Integer) animatedValue).intValue();
            ViewGroup viewGroup2 = ((CommentRepostCardAssem) aUListenerS92S0100000_3.l0).LJLJJL;
            if (viewGroup2 != null) {
                viewGroup2.setLayoutParams(layoutParams);
                return;
            } else {
                o.LJIJI("upvoteCommentCard");
                throw null;
            }
        }
        o.LJIJI("upvoteCommentCard");
        throw null;
    }

    public static final void onAnimationUpdate$24(AUListenerS92S0100000_3 aUListenerS92S0100000_3, ValueAnimator valueAnimator) {
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        C8FZ c8fz = ((C8FY) aUListenerS92S0100000_3.l0).LJLJJLL;
        if (c8fz != null) {
            c8fz.LJIILLIIL = floatValue;
            c8fz.invalidateSelf();
        }
        ((C8FY) aUListenerS92S0100000_3.l0).LJLJL.invalidate();
    }

    public static final void onAnimationUpdate$25(AUListenerS92S0100000_3 aUListenerS92S0100000_3, ValueAnimator valueAnimator) {
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        ViewGroup.LayoutParams layoutParams = ((View) aUListenerS92S0100000_3.l0).getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = (int) floatValue;
        }
        ((View) aUListenerS92S0100000_3.l0).setLayoutParams(layoutParams);
    }

    public static final void onAnimationUpdate$26(AUListenerS92S0100000_3 aUListenerS92S0100000_3, ValueAnimator valueAnimator) {
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        RelationButton relationButton = ((FollowButtonFFPAssem) aUListenerS92S0100000_3.l0).LLFII;
        if (relationButton != null) {
            relationButton.setAlpha(floatValue);
        } else {
            o.LJIJI("relationButton");
            throw null;
        }
    }

    public static final void onAnimationUpdate$27(AUListenerS92S0100000_3 aUListenerS92S0100000_3, ValueAnimator valueAnimator) {
        int intValue = ((Integer) C264612c.LIZ(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Int")).intValue();
        RelationButton relationButton = ((FollowButtonFFPAssem) aUListenerS92S0100000_3.l0).LLFII;
        if (relationButton != null) {
            ViewGroup.LayoutParams layoutParams = relationButton.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = intValue;
                relationButton.setLayoutParams(layoutParams);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        o.LJIJI("relationButton");
        throw null;
    }

    public static final void onAnimationUpdate$28(AUListenerS92S0100000_3 aUListenerS92S0100000_3, ValueAnimator it) {
        Integer num;
        o.LJIIIZ(it, "it");
        Object animatedValue = it.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
            VideoExposeSharerInformationAssem videoExposeSharerInformationAssem = (VideoExposeSharerInformationAssem) aUListenerS92S0100000_3.l0;
            int intValue = num.intValue();
            View Y3 = videoExposeSharerInformationAssem.Y3();
            ViewGroup.LayoutParams layoutParams = videoExposeSharerInformationAssem.Y3().getLayoutParams();
            layoutParams.height = intValue;
            Y3.setLayoutParams(layoutParams);
        }
    }

    public static final void onAnimationUpdate$29(AUListenerS92S0100000_3 aUListenerS92S0100000_3, ValueAnimator anim) {
        float f;
        Float f2;
        o.LJIIIZ(anim, "anim");
        View containerView = ((GoToFriendsGuideAssem) aUListenerS92S0100000_3.l0).getContainerView();
        Object animatedValue = anim.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f2 = (Float) animatedValue) != null) {
            f = f2.floatValue();
        } else {
            f = 1.0f;
        }
        containerView.setAlpha(f);
    }

    public static final void onAnimationUpdate$3(AUListenerS92S0100000_3 aUListenerS92S0100000_3, ValueAnimator animation) {
        o.LJIIIZ(animation, "animation");
        if (animation.getAnimatedFraction() > 0.4f) {
            View view = ((NowKeyboardFragment) aUListenerS92S0100000_3.l0).getView();
            if (view != null) {
                view.setVisibility(0);
            }
            animation.cancel();
        }
    }

    public static final void onAnimationUpdate$30(AUListenerS92S0100000_3 aUListenerS92S0100000_3, ValueAnimator value) {
        o.LJIIIZ(value, "value");
        C208278Fj c208278Fj = (C208278Fj) aUListenerS92S0100000_3.l0;
        ViewGroup.LayoutParams layoutParams = c208278Fj.getLayoutParams();
        if (layoutParams != null) {
            Object animatedValue = value.getAnimatedValue();
            o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            layoutParams.height = ((Integer) animatedValue).intValue();
            c208278Fj.setLayoutParams(layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public static final void onAnimationUpdate$31(AUListenerS92S0100000_3 aUListenerS92S0100000_3, ValueAnimator valueAnimator) {
        int i;
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        View mCommentBgContainer = ((CommentNestedLayout) aUListenerS92S0100000_3.l0).getMCommentBgContainer();
        o.LJIIIIZZ(mCommentBgContainer, "mCommentBgContainer");
        CommentNestedLayout commentNestedLayout = (CommentNestedLayout) aUListenerS92S0100000_3.l0;
        float f = commentNestedLayout.LL;
        if (floatValue > f) {
            i = (int) f;
        } else {
            float f2 = commentNestedLayout.LJZL;
            if (floatValue < f2) {
                i = (int) f2;
            } else {
                i = (int) floatValue;
            }
        }
        C78886Uxe.LJJLIIIJ(i, mCommentBgContainer);
    }

    public static final void onAnimationUpdate$32(AUListenerS92S0100000_3 aUListenerS92S0100000_3, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        Object animatedValue = it.getAnimatedValue();
        TuxIconView tuxIconView = ((FeedAvatarDefaultAssem) aUListenerS92S0100000_3.l0).LLIFFJFJJ;
        if (tuxIconView != null) {
            o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            tuxIconView.setScaleX(((Float) animatedValue).floatValue());
            TuxIconView tuxIconView2 = ((FeedAvatarDefaultAssem) aUListenerS92S0100000_3.l0).LLIFFJFJJ;
            if (tuxIconView2 != null) {
                tuxIconView2.setScaleY(((Number) animatedValue).floatValue());
                return;
            } else {
                o.LJIJI("followIconView");
                throw null;
            }
        }
        o.LJIJI("followIconView");
        throw null;
    }

    public static final void onAnimationUpdate$33(AUListenerS92S0100000_3 aUListenerS92S0100000_3, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        Object animatedValue = it.getAnimatedValue();
        TuxIconView tuxIconView = ((FeedAvatarDefaultAssem) aUListenerS92S0100000_3.l0).LLIFFJFJJ;
        if (tuxIconView != null) {
            o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            tuxIconView.setScaleX(((Float) animatedValue).floatValue());
            TuxIconView tuxIconView2 = ((FeedAvatarDefaultAssem) aUListenerS92S0100000_3.l0).LLIFFJFJJ;
            if (tuxIconView2 != null) {
                tuxIconView2.setScaleY(((Number) animatedValue).floatValue());
                return;
            } else {
                o.LJIJI("followIconView");
                throw null;
            }
        }
        o.LJIJI("followIconView");
        throw null;
    }

    public static final void onAnimationUpdate$34(AUListenerS92S0100000_3 aUListenerS92S0100000_3, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        Object animatedValue = it.getAnimatedValue();
        TuxIconView tuxIconView = ((FeedAvatarDefaultAssem) aUListenerS92S0100000_3.l0).LLIFFJFJJ;
        if (tuxIconView != null) {
            o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            tuxIconView.setScaleX(((Float) animatedValue).floatValue());
            TuxIconView tuxIconView2 = ((FeedAvatarDefaultAssem) aUListenerS92S0100000_3.l0).LLIFFJFJJ;
            if (tuxIconView2 != null) {
                tuxIconView2.setScaleY(((Number) animatedValue).floatValue());
                return;
            } else {
                o.LJIJI("followIconView");
                throw null;
            }
        }
        o.LJIJI("followIconView");
        throw null;
    }

    public static final void onAnimationUpdate$35(AUListenerS92S0100000_3 aUListenerS92S0100000_3, ValueAnimator valueAnimator) {
        int intValue = ((Integer) C264612c.LIZ(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Int")).intValue();
        ViewGroup.LayoutParams layoutParams = ((View) aUListenerS92S0100000_3.l0).getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = intValue;
        ((View) aUListenerS92S0100000_3.l0).setLayoutParams(marginLayoutParams);
    }

    public static final void onAnimationUpdate$36(AUListenerS92S0100000_3 aUListenerS92S0100000_3, ValueAnimator valueAnimator) {
        ((View) aUListenerS92S0100000_3.l0).setBackgroundColor(((Integer) C264612c.LIZ(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Int")).intValue());
    }

    public static final void onAnimationUpdate$37(AUListenerS92S0100000_3 aUListenerS92S0100000_3, ValueAnimator valueAnimator) {
        ((View) aUListenerS92S0100000_3.l0).setBackgroundColor(((Integer) C264612c.LIZ(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Int")).intValue());
    }

    public static final void onAnimationUpdate$38(AUListenerS92S0100000_3 aUListenerS92S0100000_3, ValueAnimator animation) {
        o.LJIIIZ(animation, "animation");
        ((LandscapeDescAssem) aUListenerS92S0100000_3.l0).p4().setVisibility(0);
        Object animatedValue = animation.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        ((LandscapeDescAssem) aUListenerS92S0100000_3.l0).p4().setHeight(((Integer) animatedValue).intValue());
    }

    public static final void onAnimationUpdate$39(AUListenerS92S0100000_3 aUListenerS92S0100000_3, ValueAnimator it) {
        Float f;
        o.LJIIIZ(it, "it");
        C207768Dk c207768Dk = (C207768Dk) aUListenerS92S0100000_3.l0;
        Object animatedValue = it.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            c207768Dk.LJLJL = f.floatValue();
            ((C207768Dk) aUListenerS92S0100000_3.l0).invalidate();
        }
    }

    public static final void onAnimationUpdate$4(AUListenerS92S0100000_3 aUListenerS92S0100000_3, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("changeMultiPanelHeight animation height ");
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        LIZ.append(((Integer) animatedValue).intValue());
        C71Y.LIZ("KeyboardMultiPanelAssem", X1D.LIZIZ(LIZ));
        View containerView = ((CommentKeyboardMultiPanelAssem) aUListenerS92S0100000_3.l0).getContainerView();
        Object animatedValue2 = it.getAnimatedValue();
        o.LJII(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
        C78886Uxe.LJJLIIIJ(((Integer) animatedValue2).intValue(), containerView);
    }

    public static final void onAnimationUpdate$40(AUListenerS92S0100000_3 aUListenerS92S0100000_3, ValueAnimator valueAnimator) {
        int intValue = ((Integer) C264612c.LIZ(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Int")).intValue();
        View view = (View) aUListenerS92S0100000_3.l0;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = intValue;
            view.setLayoutParams(layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public static final void onAnimationUpdate$5(AUListenerS92S0100000_3 aUListenerS92S0100000_3, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setPanelTranslationY update translationY ");
        LIZ.append(it.getAnimatedValue());
        C71Y.LIZ("KeyboardPanelV2", X1D.LIZIZ(LIZ));
        View x3 = ((RefactorKeyboardPanelV2) aUListenerS92S0100000_3.l0).x3();
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        x3.setTranslationY(((Float) animatedValue).floatValue());
    }

    public static final void onAnimationUpdate$6(AUListenerS92S0100000_3 aUListenerS92S0100000_3, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        Object animatedValue = it.getAnimatedValue();
        TuxIconView tuxIconView = ((FeedAvatarDefaultAssem) aUListenerS92S0100000_3.l0).LLIFFJFJJ;
        if (tuxIconView != null) {
            o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            tuxIconView.setScaleX(((Float) animatedValue).floatValue());
            TuxIconView tuxIconView2 = ((FeedAvatarDefaultAssem) aUListenerS92S0100000_3.l0).LLIFFJFJJ;
            if (tuxIconView2 != null) {
                tuxIconView2.setScaleY(((Number) animatedValue).floatValue());
                return;
            } else {
                o.LJIJI("followIconView");
                throw null;
            }
        }
        o.LJIJI("followIconView");
        throw null;
    }

    public static final void onAnimationUpdate$7(AUListenerS92S0100000_3 aUListenerS92S0100000_3, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        Object animatedValue = it.getAnimatedValue();
        TuxIconView tuxIconView = ((FeedAvatarDefaultAssem) aUListenerS92S0100000_3.l0).LLIFFJFJJ;
        if (tuxIconView != null) {
            o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            tuxIconView.setScaleX(((Float) animatedValue).floatValue());
            TuxIconView tuxIconView2 = ((FeedAvatarDefaultAssem) aUListenerS92S0100000_3.l0).LLIFFJFJJ;
            if (tuxIconView2 != null) {
                tuxIconView2.setScaleY(((Number) animatedValue).floatValue());
                return;
            } else {
                o.LJIJI("followIconView");
                throw null;
            }
        }
        o.LJIJI("followIconView");
        throw null;
    }

    public static final void onAnimationUpdate$8(AUListenerS92S0100000_3 aUListenerS92S0100000_3, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        Object animatedValue = it.getAnimatedValue();
        TuxIconView tuxIconView = ((FeedAvatarDefaultAssem) aUListenerS92S0100000_3.l0).LLIFFJFJJ;
        if (tuxIconView != null) {
            o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            tuxIconView.setScaleX(((Float) animatedValue).floatValue());
            TuxIconView tuxIconView2 = ((FeedAvatarDefaultAssem) aUListenerS92S0100000_3.l0).LLIFFJFJJ;
            if (tuxIconView2 != null) {
                tuxIconView2.setScaleY(((Number) animatedValue).floatValue());
                return;
            } else {
                o.LJIJI("followIconView");
                throw null;
            }
        }
        o.LJIJI("followIconView");
        throw null;
    }

    public static final void onAnimationUpdate$9(AUListenerS92S0100000_3 aUListenerS92S0100000_3, ValueAnimator it) {
        Float f;
        o.LJIIIZ(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Integer num = null;
        if (animatedValue instanceof Float) {
            f = (Float) animatedValue;
        } else {
            f = null;
        }
        ViewGroup.LayoutParams layoutParams = ((View) aUListenerS92S0100000_3.l0).getLayoutParams();
        if (layoutParams != null) {
            if (f != null) {
                num = Integer.valueOf((int) f.floatValue());
            }
            layoutParams.height = num.intValue();
        }
        ((View) aUListenerS92S0100000_3.l0).setLayoutParams(layoutParams);
    }
}
