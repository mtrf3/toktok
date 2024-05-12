package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* renamed from: X.0KS, reason: invalid class name */
/* loaded from: classes.dex */
public class C0KS extends LinearLayout {
    public int LJLIL;
    public final Paint LJLILLLLZI;
    public final GradientDrawable LJLJI;
    public int LJLJJI;
    public float LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public ValueAnimator LJLJLLL;
    public final /* synthetic */ C0KV LJLL;

    public final void LIZJ() {
        int i;
        View childAt = getChildAt(this.LJLJJI);
        int i2 = -1;
        if (childAt != null && childAt.getWidth() > 0) {
            i2 = childAt.getLeft();
            i = childAt.getRight();
            C0KV c0kv = this.LJLL;
            if (!c0kv.LLIIII && (childAt instanceof C0KU)) {
                LIZIZ((C0KU) childAt, c0kv.LJLJI);
                RectF rectF = this.LJLL.LJLJI;
                i2 = (int) rectF.left;
                i = (int) rectF.right;
            }
            if (this.LJLJJL > 0.0f && this.LJLJJI < getChildCount() - 1) {
                View childAt2 = getChildAt(this.LJLJJI + 1);
                int left = childAt2.getLeft();
                int right = childAt2.getRight();
                C0KV c0kv2 = this.LJLL;
                if (!c0kv2.LLIIII && (childAt2 instanceof C0KU)) {
                    LIZIZ((C0KU) childAt2, c0kv2.LJLJI);
                    RectF rectF2 = this.LJLL.LJLJI;
                    left = (int) rectF2.left;
                    right = (int) rectF2.right;
                }
                float f = this.LJLJJL;
                float f2 = left * f;
                float f3 = 1.0f - f;
                i2 = (int) ((i2 * f3) + f2);
                i = (int) ((f3 * i) + (right * f));
            }
        } else {
            i = -1;
        }
        if (i2 != this.LJLJL || i != this.LJLJLJ) {
            this.LJLJL = i2;
            this.LJLJLJ = i;
            C16300kU.LJIIJ(this);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        Drawable drawable = this.LJLL.LJLZ;
        int i2 = 0;
        if (drawable != null) {
            i = drawable.getIntrinsicHeight();
        } else {
            i = 0;
        }
        int i3 = this.LJLIL;
        if (i3 >= 0) {
            i = i3;
        }
        int i4 = this.LJLL.LLI;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        i = 0;
                    } else {
                        i = getHeight();
                    }
                }
            } else {
                i2 = (getHeight() - i) / 2;
                i = (getHeight() + i) / 2;
            }
        } else {
            i2 = getHeight() - i;
            i = getHeight();
        }
        int i5 = this.LJLJL;
        if (i5 >= 0 && this.LJLJLJ > i5) {
            Drawable drawable2 = this.LJLL.LJLZ;
            if (drawable2 == null) {
                drawable2 = this.LJLJI;
            }
            Drawable LJFF = C07840Sm.LJFF(drawable2);
            LJFF.setBounds(this.LJLJL, i2, this.LJLJLJ, i);
            Paint paint = this.LJLILLLLZI;
            if (paint != null) {
                if (Build.VERSION.SDK_INT == 21) {
                    LJFF.setColorFilter(paint.getColor(), PorterDuff.Mode.SRC_IN);
                } else {
                    C07820Sk.LJI(LJFF, paint.getColor());
                }
            }
            LJFF.draw(canvas);
        }
        super.draw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (Build.VERSION.SDK_INT < 23 && this.LJLJJLL != i) {
            requestLayout();
            this.LJLJJLL = i;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KS(C0KV c0kv, Context context) {
        super(context);
        this.LJLL = c0kv;
        this.LJLJJI = -1;
        this.LJLJJLL = -1;
        this.LJLJL = -1;
        this.LJLJLJ = -1;
        setWillNotDraw(false);
        this.LJLILLLLZI = new Paint();
        this.LJLJI = new GradientDrawable();
    }

    public final void LIZ(final int i, int i2) {
        ValueAnimator valueAnimator = this.LJLJLLL;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.LJLJLLL.cancel();
        }
        View childAt = getChildAt(i);
        if (childAt == null) {
            LIZJ();
            return;
        }
        final int left = childAt.getLeft();
        final int right = childAt.getRight();
        C0KV c0kv = this.LJLL;
        if (!c0kv.LLIIII && (childAt instanceof C0KU)) {
            LIZIZ((C0KU) childAt, c0kv.LJLJI);
            RectF rectF = this.LJLL.LJLJI;
            left = (int) rectF.left;
            right = (int) rectF.right;
        }
        final int i3 = this.LJLJL;
        final int i4 = this.LJLJLJ;
        if (i3 == left && i4 == right) {
            return;
        }
        ValueAnimator valueAnimator2 = new ValueAnimator();
        this.LJLJLLL = valueAnimator2;
        valueAnimator2.setInterpolator(C80237VeL.LIZIZ);
        valueAnimator2.setDuration(i2);
        valueAnimator2.setFloatValues(0.0f, 1.0f);
        valueAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0KQ
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                float animatedFraction = valueAnimator3.getAnimatedFraction();
                C0KS c0ks = C0KS.this;
                int LIZ = C80237VeL.LIZ(animatedFraction, i3, left);
                int LIZ2 = C80237VeL.LIZ(animatedFraction, i4, right);
                if (LIZ != c0ks.LJLJL || LIZ2 != c0ks.LJLJLJ) {
                    c0ks.LJLJL = LIZ;
                    c0ks.LJLJLJ = LIZ2;
                    C16300kU.LJIIJ(c0ks);
                }
            }
        });
        valueAnimator2.addListener(new AnimatorListenerAdapter() { // from class: X.0KR
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                C0KS c0ks = C0KS.this;
                c0ks.LJLJJI = i;
                c0ks.LJLJJL = 0.0f;
            }
        });
        valueAnimator2.start();
    }

    public final void LIZIZ(C0KU c0ku, RectF rectF) {
        int contentWidth = c0ku.getContentWidth();
        if (contentWidth < this.LJLL.LJIIIIZZ(24)) {
            contentWidth = this.LJLL.LJIIIIZZ(24);
        }
        int right = (c0ku.getRight() + c0ku.getLeft()) / 2;
        int i = contentWidth / 2;
        rectF.set(right - i, 0.0f, right + i, 0.0f);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int childCount = getChildCount();
        if (childCount == 0) {
            super.onMeasure(i, i2);
            return;
        }
        if (this.LJLL.LLILIL) {
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i4).getLayoutParams();
                layoutParams.width = -2;
                layoutParams.height = -1;
            }
            this.LJLL.LLILIL = false;
        }
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            i5 += getChildAt(i6).getMeasuredWidth();
        }
        int i7 = measuredWidth - i5;
        if (i7 <= 0) {
            return;
        }
        int i8 = measuredWidth / childCount;
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getMeasuredWidth() < i8) {
                arrayList.add(childAt);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        int size = i7 / arrayList.size();
        int size2 = i7 - (arrayList.size() * size);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            View view = (View) ListProtector.get(arrayList, i10);
            if (size2 > 0) {
                size2--;
                i3 = 1;
            } else {
                i3 = 0;
            }
            view.getLayoutParams().width = view.getMeasuredWidth() + i3 + size;
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ValueAnimator valueAnimator = this.LJLJLLL;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.LJLJLLL.cancel();
            LIZ(this.LJLJJI, Math.round((1.0f - this.LJLJLLL.getAnimatedFraction()) * ((float) this.LJLJLLL.getDuration())));
            return;
        }
        LIZJ();
    }
}
