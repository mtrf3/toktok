package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.LifecycleOwner;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.6Qc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C160106Qc extends FrameLayout {
    public C1NS<C6QX> LJLIL;
    public LifecycleOwner LJLILLLLZI;
    public ImageView LJLJI;
    public View LJLJJI;
    public View LJLJJL;
    public View LJLJJLL;
    public View LJLJL;
    public AnimatorSet LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C160106Qc(Context context) {
        super(context, null, 0);
        a1.LJFF(context, "context");
    }

    public final void LIZ(final View view, final boolean z) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        AnimatorSet.Builder play;
        AnimatorSet.Builder with;
        AnimatorSet animatorSet = this.LJLJLJ;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z) {
            view.setVisibility(0);
        }
        if (C16330kX.LIZJ(view) && !view.isLayoutRequested()) {
            this.LJLJLJ = new AnimatorSet();
            float[] fArr = new float[2];
            float f6 = 1.0f;
            if (z) {
                f = 0.0f;
            } else {
                f = 1.0f;
            }
            fArr[0] = f;
            if (z) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            fArr[1] = f2;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", fArr);
            float[] fArr2 = new float[2];
            if (z) {
                f3 = 0.0f;
            } else {
                f3 = 1.0f;
            }
            fArr2[0] = f3;
            if (z) {
                f4 = 1.0f;
            } else {
                f4 = 0.0f;
            }
            fArr2[1] = f4;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleX", fArr2);
            float[] fArr3 = new float[2];
            if (z) {
                f5 = 0.0f;
            } else {
                f5 = 1.0f;
            }
            fArr3[0] = f5;
            if (!z) {
                f6 = 0.0f;
            }
            fArr3[1] = f6;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "scaleY", fArr3);
            AnimatorSet animatorSet2 = this.LJLJLJ;
            if (animatorSet2 != null) {
                animatorSet2.setDuration(300L);
            }
            AnimatorSet animatorSet3 = this.LJLJLJ;
            if (animatorSet3 != null && (play = animatorSet3.play(ofFloat)) != null && (with = play.with(ofFloat2)) != null) {
                with.with(ofFloat3);
            }
            AnimatorSet animatorSet4 = this.LJLJLJ;
            if (animatorSet4 != null) {
                animatorSet4.addListener(new C160126Qe(view, this, z));
            }
            AnimatorSet animatorSet5 = this.LJLJLJ;
            if (animatorSet5 != null) {
                animatorSet5.start();
                return;
            }
            return;
        }
        view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.6Qd
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                float f7;
                float f8;
                float f9;
                float f10;
                float f11;
                AnimatorSet.Builder play2;
                AnimatorSet.Builder with2;
                o.LJIIIZ(view2, "view");
                view2.removeOnLayoutChangeListener(this);
                this.LJLJLJ = new AnimatorSet();
                View view3 = view;
                float[] fArr4 = new float[2];
                boolean z2 = z;
                float f12 = 0.0f;
                if (z2) {
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f;
                }
                fArr4[0] = f7;
                if (z2) {
                    f8 = 1.0f;
                } else {
                    f8 = 0.0f;
                }
                fArr4[1] = f8;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view3, "alpha", fArr4);
                View view4 = view;
                float[] fArr5 = new float[2];
                boolean z3 = z;
                if (z3) {
                    f9 = 0.0f;
                } else {
                    f9 = 1.0f;
                }
                fArr5[0] = f9;
                if (z3) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                fArr5[1] = f10;
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view4, "scaleX", fArr5);
                View view5 = view;
                float[] fArr6 = new float[2];
                boolean z4 = z;
                if (z4) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                fArr6[0] = f11;
                if (z4) {
                    f12 = 1.0f;
                }
                fArr6[1] = f12;
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(view5, "scaleY", fArr6);
                AnimatorSet animatorSet6 = this.LJLJLJ;
                if (animatorSet6 != null) {
                    animatorSet6.setDuration(300L);
                }
                AnimatorSet animatorSet7 = this.LJLJLJ;
                if (animatorSet7 != null && (play2 = animatorSet7.play(ofFloat4)) != null && (with2 = play2.with(ofFloat5)) != null) {
                    with2.with(ofFloat6);
                }
                AnimatorSet animatorSet8 = this.LJLJLJ;
                if (animatorSet8 != null) {
                    animatorSet8.addListener(new C160126Qe(view, this, z));
                }
                AnimatorSet animatorSet9 = this.LJLJLJ;
                if (animatorSet9 != null) {
                    animatorSet9.start();
                }
            }
        });
    }
}
