package Y;

import X.C07820Sk;
import X.C264612c;
import X.C31481CXd;
import X.CX6;
import X.CX7;
import X.CXC;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.pin.widget.BaseCommentPinnedWidget;
import com.bytedance.android.livesdk.broadcast.interaction.toolbar.ToolbarButtonMoreDialog;
import com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessStartFragment;
import com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessToolbarWidget;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.microom.MicRoomUserInfoWidget;
import com.bytedance.android.livesdk.userinfowidget.ClearScreenUserInfoWidget;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class AUListenerS97S0200000_5 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public Object l0;
    public Object l1;

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
            default:
                return;
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS97S0200000_5 aUListenerS97S0200000_5, ValueAnimator valueAnimator) {
        ClearScreenUserInfoWidget clearScreenUserInfoWidget = (ClearScreenUserInfoWidget) aUListenerS97S0200000_5.l0;
        GradientDrawable gradientDrawable = (GradientDrawable) aUListenerS97S0200000_5.l1;
        clearScreenUserInfoWidget.getClass();
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ViewGroup.LayoutParams layoutParams = clearScreenUserInfoWidget.LLIIII.getLayoutParams();
        int i = (int) (floatValue * clearScreenUserInfoWidget.LLJLILLLLZIIL);
        layoutParams.height = i;
        if (i >= 0) {
            layoutParams.width = i;
            if (gradientDrawable != null) {
                gradientDrawable.setCornerRadius(i << 1);
            }
        }
        clearScreenUserInfoWidget.LLIIII.setLayoutParams(layoutParams);
    }

    public static final void onAnimationUpdate$1(AUListenerS97S0200000_5 aUListenerS97S0200000_5, ValueAnimator valueAnimator) {
        ClearScreenUserInfoWidget clearScreenUserInfoWidget = (ClearScreenUserInfoWidget) aUListenerS97S0200000_5.l0;
        GradientDrawable gradientDrawable = (GradientDrawable) aUListenerS97S0200000_5.l1;
        clearScreenUserInfoWidget.getClass();
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ViewGroup.LayoutParams layoutParams = clearScreenUserInfoWidget.LLIIII.getLayoutParams();
        int i = (int) (floatValue * clearScreenUserInfoWidget.LLJLIL);
        layoutParams.width = i;
        if (i <= clearScreenUserInfoWidget.LLJLILLLLZIIL) {
            layoutParams.height = i;
            if (gradientDrawable != null) {
                gradientDrawable.setCornerRadius(i >> 1);
            }
        }
        clearScreenUserInfoWidget.LLIIII.setLayoutParams(layoutParams);
    }

    public static final void onAnimationUpdate$10(AUListenerS97S0200000_5 aUListenerS97S0200000_5, ValueAnimator valueAnimator) {
        PointF pointF = (PointF) C264612c.LIZ(valueAnimator, "animator", "null cannot be cast to non-null type android.graphics.PointF");
        RectF rectF = ((CXC) aUListenerS97S0200000_5.l1).LIZIZ;
        float width = rectF.width() / 2;
        float f = pointF.x;
        rectF.left = f - width;
        float f2 = pointF.y;
        rectF.top = f2 - width;
        rectF.right = f + width;
        rectF.bottom = f2 + width;
        ((CX6) aUListenerS97S0200000_5.l0).invalidate();
    }

    public static final void onAnimationUpdate$11(AUListenerS97S0200000_5 aUListenerS97S0200000_5, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        CX7 cx7 = (CX7) aUListenerS97S0200000_5.l0;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        RectF rectF = cx7.LIZJ;
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        float f = (CX6.LJLJJL * floatValue) / 2;
        rectF.left = centerX - f;
        rectF.top = centerY - f;
        rectF.right = centerX + f;
        rectF.bottom = centerY + f;
        ((CX6) aUListenerS97S0200000_5.l1).invalidate();
    }

    public static final void onAnimationUpdate$12(AUListenerS97S0200000_5 aUListenerS97S0200000_5, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        CX7 cx7 = (CX7) aUListenerS97S0200000_5.l0;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        cx7.LIZIZ = ((Integer) animatedValue).intValue();
        ((CX6) aUListenerS97S0200000_5.l1).invalidate();
    }

    public static final void onAnimationUpdate$13(AUListenerS97S0200000_5 aUListenerS97S0200000_5, ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        View view = (View) aUListenerS97S0200000_5.l0;
        if (view != null) {
            Drawable drawable = (Drawable) aUListenerS97S0200000_5.l1;
            if (drawable instanceof GradientDrawable) {
                ((GradientDrawable) drawable).setColor(intValue);
            }
            C07820Sk.LJI(drawable, intValue);
            view.setBackground(drawable);
        }
    }

    public static final void onAnimationUpdate$14(AUListenerS97S0200000_5 aUListenerS97S0200000_5, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        C31481CXd c31481CXd = ((DrawGuessToolbarWidget) aUListenerS97S0200000_5.l0).LJLJI;
        if (c31481CXd != null) {
            Object animatedValue = ((ValueAnimator) aUListenerS97S0200000_5.l1).getAnimatedValue();
            o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            c31481CXd.setColor(((Integer) animatedValue).intValue());
            return;
        }
        o.LJIJI("colorButtonInnerView");
        throw null;
    }

    public static final void onAnimationUpdate$15(AUListenerS97S0200000_5 aUListenerS97S0200000_5, ValueAnimator it) {
        Float f;
        o.LJIIIZ(it, "it");
        View _$_findCachedViewById = ((DrawGuessStartFragment) aUListenerS97S0200000_5.l0)._$_findCachedViewById(R.id.a56);
        if (_$_findCachedViewById == null) {
            return;
        }
        Object animatedValue = ((ValueAnimator) aUListenerS97S0200000_5.l1).getAnimatedValue();
        if (!(animatedValue instanceof Float) || (f = (Float) animatedValue) == null) {
            return;
        }
        _$_findCachedViewById.setAlpha(f.floatValue());
    }

    public static final void onAnimationUpdate$16(AUListenerS97S0200000_5 aUListenerS97S0200000_5, ValueAnimator valueAnimator) {
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "animator", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        ViewGroup viewGroup = ((MicRoomUserInfoWidget) aUListenerS97S0200000_5.l0).LJLLL;
        o.LJI(viewGroup);
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        int i = (int) (floatValue * ((MicRoomUserInfoWidget) aUListenerS97S0200000_5.l0).LLIFFJFJJ);
        layoutParams.height = i;
        if (i >= 0) {
            layoutParams.width = i;
            ((GradientDrawable) aUListenerS97S0200000_5.l1).setCornerRadius(i << 1);
        }
        ViewGroup viewGroup2 = ((MicRoomUserInfoWidget) aUListenerS97S0200000_5.l0).LJLLL;
        o.LJI(viewGroup2);
        viewGroup2.setLayoutParams(layoutParams);
    }

    public static final void onAnimationUpdate$17(AUListenerS97S0200000_5 aUListenerS97S0200000_5, ValueAnimator valueAnimator) {
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "animator", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        ViewGroup viewGroup = ((MicRoomUserInfoWidget) aUListenerS97S0200000_5.l0).LJLLL;
        o.LJI(viewGroup);
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        MicRoomUserInfoWidget micRoomUserInfoWidget = (MicRoomUserInfoWidget) aUListenerS97S0200000_5.l0;
        int i = (int) (floatValue * micRoomUserInfoWidget.LLI);
        layoutParams.width = i;
        if (i <= micRoomUserInfoWidget.LLIFFJFJJ) {
            layoutParams.height = i;
            ((GradientDrawable) aUListenerS97S0200000_5.l1).setCornerRadius(i >> 1);
        }
        ViewGroup viewGroup2 = ((MicRoomUserInfoWidget) aUListenerS97S0200000_5.l0).LJLLL;
        o.LJI(viewGroup2);
        viewGroup2.setLayoutParams(layoutParams);
    }

    public static final void onAnimationUpdate$18(AUListenerS97S0200000_5 aUListenerS97S0200000_5, ValueAnimator valueAnimator) {
        int intValue = ((Integer) C264612c.LIZ(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Int")).intValue();
        View view = (View) aUListenerS97S0200000_5.l0;
        if (view != null) {
            Drawable wrappedDrawable = (Drawable) aUListenerS97S0200000_5.l1;
            o.LJIIIZ(wrappedDrawable, "wrappedDrawable");
            if (wrappedDrawable instanceof GradientDrawable) {
                ((GradientDrawable) wrappedDrawable).setColor(intValue);
            }
            C07820Sk.LJI(wrappedDrawable, intValue);
            view.setBackground(wrappedDrawable);
        }
    }

    public static final void onAnimationUpdate$2(AUListenerS97S0200000_5 aUListenerS97S0200000_5, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) aUListenerS97S0200000_5.l0;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        marginLayoutParams.topMargin = ((Integer) animatedValue).intValue();
        ((BaseCommentPinnedWidget) aUListenerS97S0200000_5.l1).LLFF().setLayoutParams((ViewGroup.MarginLayoutParams) aUListenerS97S0200000_5.l0);
        ((BaseCommentPinnedWidget) aUListenerS97S0200000_5.l1).LLFFF().setAlpha(1 - it.getAnimatedFraction());
    }

    public static final void onAnimationUpdate$3(AUListenerS97S0200000_5 aUListenerS97S0200000_5, ValueAnimator valueAnimator) {
        ((ViewGroup.LayoutParams) aUListenerS97S0200000_5.l0).height = ((Integer) C264612c.LIZ(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Int")).intValue();
        ((ViewGroup) aUListenerS97S0200000_5.l1).requestLayout();
    }

    public static final void onAnimationUpdate$4(AUListenerS97S0200000_5 aUListenerS97S0200000_5, ValueAnimator valueAnimator) {
        ((ViewGroup.LayoutParams) aUListenerS97S0200000_5.l0).height = ((Integer) C264612c.LIZ(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Int")).intValue();
        View _$_findCachedViewById = ((ToolbarButtonMoreDialog) aUListenerS97S0200000_5.l1)._$_findCachedViewById(R.id.ip_);
        if (_$_findCachedViewById != null) {
            _$_findCachedViewById.requestLayout();
        }
    }

    public static final void onAnimationUpdate$5(AUListenerS97S0200000_5 aUListenerS97S0200000_5, ValueAnimator animation) {
        Float f;
        Float f2;
        View view;
        View view2;
        o.LJIIIZ(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        Float f3 = null;
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            float floatValue = f.floatValue();
            View view3 = (View) aUListenerS97S0200000_5.l0;
            if (view3 != null) {
                f2 = Float.valueOf(view3.getAlpha());
            } else {
                f2 = null;
            }
            if (!o.LIZJ(f2, 1.0f) && (view2 = (View) aUListenerS97S0200000_5.l0) != null) {
                view2.setAlpha(floatValue);
            }
            View view4 = (View) aUListenerS97S0200000_5.l1;
            if (view4 != null) {
                f3 = Float.valueOf(view4.getAlpha());
            }
            if (o.LIZJ(f3, 0.0f) || (view = (View) aUListenerS97S0200000_5.l1) == null) {
                return;
            }
            view.setAlpha(1 - floatValue);
        }
    }

    public static final void onAnimationUpdate$6(AUListenerS97S0200000_5 aUListenerS97S0200000_5, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        CXC cxc = (CXC) aUListenerS97S0200000_5.l0;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        cxc.LIZIZ(((Float) animatedValue).floatValue());
        ((CX6) aUListenerS97S0200000_5.l1).invalidate();
    }

    public static final void onAnimationUpdate$7(AUListenerS97S0200000_5 aUListenerS97S0200000_5, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        CXC cxc = (CXC) aUListenerS97S0200000_5.l0;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        cxc.LIZIZ(((Float) animatedValue).floatValue());
        ((CX6) aUListenerS97S0200000_5.l1).invalidate();
    }

    public static final void onAnimationUpdate$8(AUListenerS97S0200000_5 aUListenerS97S0200000_5, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        CXC cxc = (CXC) aUListenerS97S0200000_5.l0;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        cxc.LIZLLL = ((Float) animatedValue).floatValue();
        ((CX6) aUListenerS97S0200000_5.l1).invalidate();
    }

    public static final void onAnimationUpdate$9(AUListenerS97S0200000_5 aUListenerS97S0200000_5, ValueAnimator it) {
        o.LJIIIZ(it, "it");
        CXC cxc = (CXC) aUListenerS97S0200000_5.l0;
        Object animatedValue = it.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        cxc.LIZLLL = ((Float) animatedValue).floatValue();
        ((CX6) aUListenerS97S0200000_5.l1).invalidate();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AUListenerS97S0200000_5(X.CXC r2, X.CX6 r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            switch(r4) {
                case 6: goto Le;
                case 7: goto Le;
                case 8: goto Le;
                case 9: goto Le;
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
        throw new UnsupportedOperationException("Method not decompiled: Y.AUListenerS97S0200000_5.<init>(X.CXC, X.CX6, int):void");
    }

    public AUListenerS97S0200000_5(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
