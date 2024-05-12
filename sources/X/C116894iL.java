package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.4iL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C116894iL extends LinearLayout {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public final ArrayList<ImageView> LJLJJLL;
    public final int LJLJL;
    public final int LJLJLJ;
    public final float LJLJLLL;

    public final void LIZ(int i) {
        if (i < this.LJLJJLL.size()) {
            ((View) ListProtector.get(this.LJLJJLL, i)).setScaleX(1.0f);
            ((View) ListProtector.get(this.LJLJJLL, i)).setScaleY(1.0f);
        }
    }

    public final void LIZIZ(boolean z) {
        int i;
        int i2;
        AnimatorSet animatorSet = new AnimatorSet();
        if (z) {
            i = (-this.LJLILLLLZI) - this.LJLIL;
        } else {
            i = this.LJLILLLLZI + this.LJLIL;
        }
        int i3 = this.LJLJJL;
        for (int i4 = 0; i4 < i3; i4++) {
            Animator[] animatorArr = new Animator[1];
            Object obj = ListProtector.get(this.LJLJJLL, i4);
            float[] fArr = new float[2];
            fArr[0] = ((View) ListProtector.get(this.LJLJJLL, i4)).getTranslationX();
            float translationX = ((View) ListProtector.get(this.LJLJJLL, i4)).getTranslationX();
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            if (C26338AVi.LIZJ(context)) {
                i2 = -i;
            } else {
                i2 = i;
            }
            fArr[1] = translationX + i2;
            animatorArr[0] = ObjectAnimator.ofFloat(obj, "translationX", fArr);
            animatorSet.playTogether(animatorArr);
        }
        animatorSet.setDuration(this.LJLJLJ);
        animatorSet.start();
    }

    public final void LIZLLL(int i) {
        if (i < this.LJLJJLL.size()) {
            ((View) ListProtector.get(this.LJLJJLL, i)).setScaleX(this.LJLJLLL);
            ((View) ListProtector.get(this.LJLJJLL, i)).setScaleY(this.LJLJLLL);
        }
    }

    public final void LJ(int i) {
        if (i >= 0 && i < this.LJLJJLL.size()) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ListProtector.get(this.LJLJJLL, i), "scaleX", this.LJLJLLL, 1.0f);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(ListProtector.get(this.LJLJJLL, i), "scaleY", this.LJLJLLL, 1.0f);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(ofFloat).with(ofFloat2);
            animatorSet.setDuration(this.LJLJLJ);
            animatorSet.start();
        }
    }

    public final void LJFF(int i) {
        if (i >= 0 && i < this.LJLJJLL.size()) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ListProtector.get(this.LJLJJLL, i), "scaleX", 1.0f, this.LJLJLLL);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(ListProtector.get(this.LJLJJLL, i), "scaleY", 1.0f, this.LJLJLLL);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(ofFloat).with(ofFloat2);
            animatorSet.setDuration(this.LJLJLJ);
            animatorSet.start();
        }
    }

    public final void setCount(int i) {
        int i2;
        int i3;
        if (i == this.LJLJJL) {
            return;
        }
        if (i <= 1) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        removeAllViews();
        this.LJLJJLL.clear();
        this.LJLJJI = 0;
        this.LJLJI = 0;
        this.LJLJJL = i;
        if (i >= 5) {
            i2 = this.LJLIL * 5;
            i3 = this.LJLILLLLZI * 4;
        } else {
            i2 = (i - 1) * this.LJLILLLLZI;
            i3 = this.LJLIL * i;
        }
        getLayoutParams().width = i3 + i2;
        int i4 = 0;
        do {
            int i5 = this.LJLIL;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i5, i5);
            if (i4 > 0) {
                Context context = getContext();
                o.LJIIIIZZ(context, "context");
                if (C26338AVi.LIZJ(context)) {
                    layoutParams.setMargins(0, 0, this.LJLILLLLZI, 0);
                } else {
                    layoutParams.setMargins(this.LJLILLLLZI, 0, 0, 0);
                }
            }
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(this.LJLJL);
            imageView.setLayoutParams(layoutParams);
            addView(imageView);
            this.LJLJJLL.add(imageView);
            i4++;
        } while (i4 < i);
        LIZJ(0, 0);
        if (i <= 5) {
            return;
        }
        LIZLLL(4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0079, code lost:
    
        if (r9 >= 0) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setSelectedIndex(int r9) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C116894iL.setSelectedIndex(int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C116894iL(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLIL = O6R.LJJIIZ(C32151Nz.LJIIZILJ(6));
        this.LJLILLLLZI = O6R.LJJIIZ(C32151Nz.LJIIZILJ(6));
        this.LJLJJLL = new ArrayList<>();
        this.LJLJL = R.drawable.adk;
        this.LJLJLJ = 200;
        this.LJLJLLL = 0.6f;
    }

    public final void LIZJ(int i, int i2) {
        TransitionDrawable transitionDrawable;
        if (i >= 0 && i < this.LJLJJLL.size()) {
            Drawable drawable = ((ImageView) ListProtector.get(this.LJLJJLL, i)).getDrawable();
            if ((drawable instanceof TransitionDrawable) && (transitionDrawable = (TransitionDrawable) drawable) != null) {
                transitionDrawable.startTransition(i2);
            }
        }
    }

    public final void LJI(int i, int i2) {
        TransitionDrawable transitionDrawable;
        if (i >= 0 && i < this.LJLJJLL.size()) {
            Drawable drawable = ((ImageView) ListProtector.get(this.LJLJJLL, i)).getDrawable();
            if ((drawable instanceof TransitionDrawable) && (transitionDrawable = (TransitionDrawable) drawable) != null) {
                transitionDrawable.reverseTransition(i2);
            }
        }
    }
}
