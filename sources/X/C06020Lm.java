package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import kotlin.jvm.internal.o;

/* renamed from: X.0Lm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C06020Lm extends LinearLayout {
    public final ArrayList<View> LJLIL;
    public final ArrayList<ValueAnimator> LJLILLLLZI;
    public final Random LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;
    public final int LJLJJLL;
    public final int LJLJL;
    public final int LJLJLJ;
    public final int LJLJLLL;
    public final long LJLL;

    public final int getViewAnimatorHeight() {
        float nextInt = this.LJLJI.nextInt(10) / 10.0f;
        double d = nextInt;
        if (d > 0.9d) {
            return this.LJLJJI;
        }
        if (d < 0.2d) {
            return this.LJLJJL;
        }
        int i = this.LJLJJI;
        int i2 = (int) (((i - r2) * nextInt) + this.LJLJJL);
        if (i2 <= i) {
            return i2;
        }
        return i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06020Lm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray obtainStyledAttributes;
        a1.LJFF(context, "context");
        this.LJLIL = new ArrayList<>();
        this.LJLILLLLZI = new ArrayList<>();
        this.LJLJI = new Random();
        if (attributeSet != null && (obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.bws, R.attr.bwt, R.attr.bwu, R.attr.bwv, R.attr.bww, R.attr.bwx, R.attr.bx1})) != null) {
            this.LJLJJI = (int) obtainStyledAttributes.getDimension(4, KL2.LIZJ(context, 24.0f));
            this.LJLJJL = (int) obtainStyledAttributes.getDimension(5, KL2.LIZJ(context, 4.0f));
            this.LJLJJLL = (int) obtainStyledAttributes.getDimension(3, KL2.LIZJ(context, 4.0f));
            this.LJLJL = (int) obtainStyledAttributes.getDimension(6, KL2.LIZJ(context, 2.0f));
            this.LJLJLJ = (int) obtainStyledAttributes.getDimension(1, KL2.LIZJ(context, 1.0f));
            this.LJLJLLL = obtainStyledAttributes.getInt(2, 13);
            this.LJLL = obtainStyledAttributes.getInt(0, 600);
            obtainStyledAttributes.recycle();
        }
        int i = this.LJLJLLL;
        for (int i2 = 0; i2 < i; i2++) {
            final View view = new View(context);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.LJLJL, this.LJLJJL);
            int i3 = this.LJLJJLL >> 1;
            layoutParams.setMargins(i3, 0, i3, 0);
            view.setLayoutParams(layoutParams);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(this.LJLJLJ);
            gradientDrawable.setColor(-1);
            view.setBackground(gradientDrawable);
            this.LJLIL.add(view);
            addView(view);
            ArrayList<ValueAnimator> arrayList = this.LJLILLLLZI;
            final ValueAnimator ofInt = ValueAnimator.ofInt(1, 2);
            ofInt.setRepeatCount(-1);
            ofInt.setDuration(this.LJLL);
            ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(view) { // from class: X.0Lk
                public final View LJLIL;

                {
                    this.LJLIL = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator animation) {
                    o.LJIIIZ(animation, "animation");
                    View view2 = this.LJLIL;
                    ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                    Object animatedValue = animation.getAnimatedValue();
                    o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                    layoutParams2.height = ((Integer) animatedValue).intValue();
                    view2.requestLayout();
                }
            });
            ofInt.addListener(new AnimatorListenerAdapter(this, ofInt) { // from class: X.0Lj
                public final C06020Lm LJLIL;
                public final ValueAnimator LJLILLLLZI;

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animation) {
                    o.LJIIIZ(animation, "animation");
                    ValueAnimator valueAnimator = this.LJLILLLLZI;
                    int viewAnimatorHeight = this.LJLIL.getViewAnimatorHeight();
                    int i4 = this.LJLIL.LJLJJL;
                    valueAnimator.setIntValues(i4, viewAnimatorHeight, i4);
                }

                {
                    o.LJIIIZ(this, "waveView");
                    this.LJLIL = this;
                    this.LJLILLLLZI = ofInt;
                }
            });
            arrayList.add(ofInt);
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View changedView, int i) {
        o.LJIIIZ(changedView, "changedView");
        if (i != 0) {
            Iterator<ValueAnimator> it = this.LJLILLLLZI.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
        }
    }
}
