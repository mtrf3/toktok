package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.tux.input.TuxTextView;
import kotlin.jvm.internal.o;

/* renamed from: X.74J, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C74J {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(AYZ.INSTANCE);

    public static final void LIZ(TextView bodyTextView) {
        o.LJIIIZ(bodyTextView, "bodyTextView");
        C62822Ol8 c62822Ol8 = LIZ;
        if (c62822Ol8.getValue() != null) {
            C71Y.LIZ("CommentUIRevampUtils", "set new font");
            bodyTextView.setTypeface((Typeface) c62822Ol8.getValue());
        } else {
            C71Y.LIZ("CommentUIRevampUtils", "mediumFontFace is null");
        }
    }

    public static final void LIZJ(AppCompatTextView view) {
        o.LJIIIZ(view, "view");
        if (((Number) C74M.LIZ.getValue()).intValue() == 1) {
            return;
        }
        view.setTextSize(2, 15.0f);
    }

    public static final void LIZLLL(C2064988n mRootView) {
        o.LJIIIZ(mRootView, "mRootView");
        mRootView.setPaddingRelative(mRootView.getPaddingStart(), mRootView.getPaddingTop(), mRootView.getPaddingEnd(), O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)));
    }

    public static final void LJ(TuxTextView mRootView) {
        o.LJIIIZ(mRootView, "mRootView");
        ViewGroup.LayoutParams layoutParams = mRootView.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int LIZIZ = C7MY.LIZIZ(4);
            int LIZIZ2 = C7MY.LIZIZ(4);
            int marginStart = marginLayoutParams.getMarginStart();
            int marginEnd = marginLayoutParams.getMarginEnd();
            marginLayoutParams.setMarginStart(marginStart);
            marginLayoutParams.topMargin = LIZIZ;
            marginLayoutParams.setMarginEnd(marginEnd);
            marginLayoutParams.bottomMargin = LIZIZ2;
            mRootView.setLayoutParams(layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public static final void LIZIZ(FrameLayout view, boolean z) {
        int i;
        o.LJIIIZ(view, "view");
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    public static final void LJFF(int i, final View view, boolean z) {
        float f;
        o.LJIIIZ(view, "view");
        float f2 = 12.0f;
        if (i != 2) {
            if (i != 3) {
                f = 4.0f;
                f2 = 10.0f;
            } else {
                f = 8.0f;
            }
        } else {
            f = 2.0f;
        }
        int LIZJ = (int) KL2.LIZJ(view.getContext(), f);
        int LIZJ2 = (int) KL2.LIZJ(view.getContext(), f2);
        if (LIZJ != view.getPaddingTop()) {
            if (z) {
                Animator ofInt = ObjectAnimator.ofInt(new Object(view) { // from class: X.74K
                    public final View LIZ;

                    {
                        o.LJIIIZ(view, "view");
                        this.LIZ = view;
                    }
                }, "paddingTop", view.getPaddingTop(), LIZJ);
                Animator ofInt2 = ObjectAnimator.ofInt(new Object(view) { // from class: X.74K
                    public final View LIZ;

                    {
                        o.LJIIIZ(view, "view");
                        this.LIZ = view;
                    }
                }, "paddingBottom", view.getPaddingBottom(), LIZJ2);
                if (ofInt == null) {
                    ofInt = ofInt2;
                    if (ofInt2 == null) {
                        return;
                    }
                } else if (ofInt2 != null) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ofInt, ofInt2);
                    ofInt = animatorSet;
                }
                ofInt.setDuration(250L);
                ofInt.start();
                return;
            }
            view.setPaddingRelative(view.getPaddingStart(), LIZJ, view.getPaddingEnd(), LIZJ2);
        }
    }
}
