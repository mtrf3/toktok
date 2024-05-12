package X;

import Y.ALAdapterS3S0110000_12;
import Y.AUListenerS0S0100002_12;
import Y.AUListenerS99S0100000_12;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.player.LivePlayerResourceReleaseSetting;
import com.zhiliaoapp.musically.R;

/* renamed from: X.T4b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C74041T4b extends View {
    public Paint LJLIL;
    public int LJLILLLLZI;
    public RectF LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public float LJLJJLL;
    public float LJLJL;
    public float LJLJLJ;
    public float LJLJLLL;
    public int LJLL;
    public int LJLLI;
    public int LJLLILLLL;
    public int LJLLJ;
    public int LJLLL;
    public float LJLLLL;
    public ValueAnimator LJLLLLLL;
    public AnimatorSet LJLZ;
    public float LJZ;

    public final void LIZ() {
        ValueAnimator valueAnimator = this.LJLLLLLL;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.LJLLLLLL.cancel();
        }
        AnimatorSet animatorSet = this.LJLZ;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.LJLZ.cancel();
        }
        float f = 360.0f;
        if (!this.LJLJJI) {
            float f2 = this.LJZ;
            this.LJLLLL = f2;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f2 + 360.0f);
            this.LJLLLLLL = ofFloat;
            ofFloat.setDuration(this.LJLLJ);
            this.LJLLLLLL.setInterpolator(new DecelerateInterpolator(2.0f));
            this.LJLLLLLL.addUpdateListener(new AUListenerS99S0100000_12(this, 5));
            this.LJLLLLLL.start();
            return;
        }
        this.LJLJLJ = 15.0f;
        this.LJLZ = new AnimatorSet();
        AnimatorSet animatorSet2 = null;
        int i = 0;
        while (true) {
            int i2 = this.LJLLL;
            if (i < i2) {
                float f3 = i;
                float f4 = (((i2 - 1) * f) / i2) + 15.0f;
                float LIZIZ = C06420Na.LIZIZ(f4, 15.0f, f3, -90.0f);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(15.0f, f4);
                ofFloat2.setDuration((this.LJLLILLLL / this.LJLLL) / 2);
                ofFloat2.setInterpolator(new DecelerateInterpolator(1.0f));
                ofFloat2.addUpdateListener(new AUListenerS99S0100000_12(this, 23));
                float f5 = this.LJLLL;
                float f6 = (0.5f + f3) * 720.0f;
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat((f3 * 720.0f) / f5, f6 / f5);
                ofFloat3.setDuration((this.LJLLILLLL / this.LJLLL) / 2);
                ofFloat3.setInterpolator(new LinearInterpolator());
                ofFloat3.addUpdateListener(new AUListenerS99S0100000_12(this, 24));
                ValueAnimator ofFloat4 = ValueAnimator.ofFloat(LIZIZ, (LIZIZ + f4) - 15.0f);
                ofFloat4.setDuration((this.LJLLILLLL / this.LJLLL) / 2);
                ofFloat4.setInterpolator(new DecelerateInterpolator(1.0f));
                ofFloat4.addUpdateListener(new AUListenerS0S0100002_12(this, f4, LIZIZ, 2));
                float f7 = this.LJLLL;
                ValueAnimator ofFloat5 = ValueAnimator.ofFloat(f6 / f7, ((f3 + 1.0f) * 720.0f) / f7);
                ofFloat5.setDuration((this.LJLLILLLL / this.LJLLL) / 2);
                ofFloat5.setInterpolator(new LinearInterpolator());
                ofFloat5.addUpdateListener(new AUListenerS99S0100000_12(this, 25));
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.play(ofFloat2).with(ofFloat3);
                animatorSet3.play(ofFloat4).with(ofFloat5).after(ofFloat3);
                AnimatorSet.Builder play = this.LJLZ.play(animatorSet3);
                if (animatorSet2 != null) {
                    play.after(animatorSet2);
                }
                i++;
                f = 360.0f;
                animatorSet2 = animatorSet3;
            } else {
                this.LJLZ.addListener(new ALAdapterS3S0110000_12(this, 1));
                this.LJLZ.start();
                return;
            }
        }
    }

    public final void LIZIZ() {
        ValueAnimator valueAnimator = this.LJLLLLLL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.LJLLLLLL = null;
        }
        AnimatorSet animatorSet = this.LJLZ;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.LJLZ = null;
        }
    }

    public final void LIZLLL() {
        this.LJLIL.setColor(this.LJLLI);
        this.LJLIL.setStyle(Paint.Style.STROKE);
        this.LJLIL.setStrokeWidth(this.LJLL);
        this.LJLIL.setStrokeCap(Paint.Cap.ROUND);
    }

    public final void LIZJ() {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        RectF rectF = this.LJLJI;
        int i = this.LJLL;
        int i2 = this.LJLILLLLZI;
        rectF.set(paddingLeft + i, paddingTop + i, (i2 - paddingLeft) - i, (i2 - paddingTop) - i);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.LJLJJL) {
            LIZ();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LIZIZ();
    }

    public int getColor() {
        return this.LJLLI;
    }

    public float getMaxProgress() {
        return this.LJLJL;
    }

    public float getProgress() {
        return this.LJLJJLL;
    }

    public int getThickness() {
        return this.LJLL;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        isInEditMode();
        float f = (this.LJLJJLL / this.LJLJL) * 360.0f;
        if (!this.LJLJJI) {
            canvas.drawArc(this.LJLJI, this.LJLLLL, f, false, this.LJLIL);
        } else {
            canvas.drawArc(this.LJLJI, this.LJLLLL + this.LJLJLLL, this.LJLJLJ, false, this.LJLIL);
        }
    }

    public void setColor(int i) {
        this.LJLLI = i;
        LIZLLL();
        invalidate();
    }

    public void setIndeterminate(boolean z) {
        if (this.LJLJJI != z) {
            this.LJLJJI = z;
            LIZ();
        }
    }

    public void setMaxProgress(float f) {
        this.LJLJL = f;
        invalidate();
    }

    public void setProgress(float f) {
        this.LJLJJLL = f;
        invalidate();
    }

    public void setThickness(int i) {
        this.LJLL = i;
        LIZLLL();
        LIZJ();
        invalidate();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        int visibility = getVisibility();
        super.setVisibility(i);
        if (i != visibility) {
            if (i == 0) {
                LIZ();
            } else {
                if (i != 8 && i != 4) {
                    return;
                }
                LIZIZ();
            }
        }
    }

    public C74041T4b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.a88, R.attr.a89, R.attr.a8_, R.attr.a8a, R.attr.a8b, R.attr.a8c, R.attr.a8d, R.attr.a8e, R.attr.a8f, R.attr.a8g, R.attr.a8h}, 0, 0);
        int argb = Color.argb(255, 33, 150, 243);
        this.LJLJJLL = obtainStyledAttributes.getFloat(8, 0.0f);
        this.LJLJL = obtainStyledAttributes.getFloat(7, 100.0f);
        this.LJLL = obtainStyledAttributes.getDimensionPixelSize(10, (int) KL2.LIZJ(getContext(), 2.0f));
        this.LJLJJI = obtainStyledAttributes.getBoolean(6, false);
        this.LJLJJL = obtainStyledAttributes.getBoolean(0, false);
        float f = obtainStyledAttributes.getFloat(9, -90.0f);
        this.LJZ = f;
        this.LJLLLL = f;
        int identifier = getContext().getResources().getIdentifier("colorAccent", "attr", getContext().getPackageName());
        if (obtainStyledAttributes.hasValue(5)) {
            this.LJLLI = obtainStyledAttributes.getColor(5, argb);
        } else if (identifier != 0) {
            TypedValue typedValue = new TypedValue();
            getContext().getTheme().resolveAttribute(identifier, typedValue, true);
            this.LJLLI = typedValue.data;
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(new int[]{android.R.attr.colorAccent});
            this.LJLLI = obtainStyledAttributes2.getColor(0, argb);
            obtainStyledAttributes2.recycle();
        }
        this.LJLLILLLL = obtainStyledAttributes.getInteger(1, LivePlayerResourceReleaseSetting.ENABLE);
        this.LJLLJ = obtainStyledAttributes.getInteger(3, 5000);
        obtainStyledAttributes.getInteger(4, LiveMaxRetainAlogMessageSizeSetting.DEFAULT);
        this.LJLLL = obtainStyledAttributes.getInteger(2, 3);
        obtainStyledAttributes.recycle();
        this.LJLIL = new Paint(1);
        LIZLLL();
        this.LJLJI = new RectF();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int measuredWidth = getMeasuredWidth() - paddingRight;
        int measuredHeight = getMeasuredHeight() - paddingBottom;
        if (measuredWidth >= measuredHeight) {
            measuredWidth = measuredHeight;
        }
        this.LJLILLLLZI = measuredWidth;
        setMeasuredDimension(paddingRight + measuredWidth, measuredWidth + paddingBottom);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i >= i2) {
            i = i2;
        }
        this.LJLILLLLZI = i;
        LIZJ();
    }
}
