package X;

import Y.ALAdapterS3S0110000_12;
import Y.AUListenerS0S0100002_12;
import Y.AUListenerS99S0100000_12;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
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

/* renamed from: X.T4a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C74040T4a extends View {
    public Paint LJLIL;
    public int LJLILLLLZI;
    public RectF LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public float LJLJLJ;
    public float LJLJLLL;
    public float LJLL;
    public float LJLLI;
    public int LJLLILLLL;
    public int LJLLJ;
    public int LJLLL;
    public int LJLLLL;
    public int LJLLLLLL;
    public float LJLZ;
    public ValueAnimator LJZ;
    public AnimatorSet LJZI;
    public float LJZL;

    public final void LIZIZ() {
        this.LJLJJLL = false;
        ValueAnimator valueAnimator = this.LJZ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.LJZ = null;
        }
        AnimatorSet animatorSet = this.LJZI;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.LJZI = null;
        }
    }

    public final void LIZ() {
        if (!this.LJLJL) {
            this.LJLJJLL = true;
            return;
        }
        this.LJLJJLL = false;
        ValueAnimator valueAnimator = this.LJZ;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.LJZ.cancel();
        }
        AnimatorSet animatorSet = this.LJZI;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.LJZI.cancel();
        }
        float f = 360.0f;
        if (!this.LJLJJI) {
            float f2 = this.LJZL;
            this.LJLZ = f2;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f2 + 360.0f);
            this.LJZ = ofFloat;
            ofFloat.setDuration(this.LJLLLL);
            this.LJZ.setInterpolator(new DecelerateInterpolator(2.0f));
            this.LJZ.addUpdateListener(new AUListenerS99S0100000_12(this, 6));
            this.LJZ.start();
            return;
        }
        this.LJLL = 15.0f;
        this.LJZI = new AnimatorSet();
        AnimatorSet animatorSet2 = null;
        int i = 0;
        while (true) {
            int i2 = this.LJLLLLLL;
            if (i < i2) {
                float f3 = i;
                float f4 = (((i2 - 1) * f) / i2) + 15.0f;
                float LIZIZ = C06420Na.LIZIZ(f4, 15.0f, f3, -90.0f);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(15.0f, f4);
                ofFloat2.setDuration((this.LJLLL / this.LJLLLLLL) / 2);
                ofFloat2.setInterpolator(new DecelerateInterpolator(1.0f));
                ofFloat2.addUpdateListener(new AUListenerS99S0100000_12(this, 7));
                float f5 = this.LJLLLLLL;
                float f6 = (0.5f + f3) * 720.0f;
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat((f3 * 720.0f) / f5, f6 / f5);
                ofFloat3.setDuration((this.LJLLL / this.LJLLLLLL) / 2);
                ofFloat3.setInterpolator(new LinearInterpolator());
                ofFloat3.addUpdateListener(new AUListenerS99S0100000_12(this, 8));
                ValueAnimator ofFloat4 = ValueAnimator.ofFloat(LIZIZ, (LIZIZ + f4) - 15.0f);
                ofFloat4.setDuration((this.LJLLL / this.LJLLLLLL) / 2);
                ofFloat4.setInterpolator(new DecelerateInterpolator(1.0f));
                ofFloat4.addUpdateListener(new AUListenerS0S0100002_12(this, f4, LIZIZ, 0));
                float f7 = this.LJLLLLLL;
                ValueAnimator ofFloat5 = ValueAnimator.ofFloat(f6 / f7, ((f3 + 1.0f) * 720.0f) / f7);
                ofFloat5.setDuration((this.LJLLL / this.LJLLLLLL) / 2);
                ofFloat5.setInterpolator(new LinearInterpolator());
                ofFloat5.addUpdateListener(new AUListenerS99S0100000_12(this, 9));
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.play(ofFloat2).with(ofFloat3);
                animatorSet3.play(ofFloat4).with(ofFloat5).after(ofFloat3);
                AnimatorSet.Builder play = this.LJZI.play(animatorSet3);
                if (animatorSet2 != null) {
                    play.after(animatorSet2);
                }
                i++;
                f = 360.0f;
                animatorSet2 = animatorSet3;
            } else {
                this.LJZI.addListener(new ALAdapterS3S0110000_12(this, 2));
                this.LJZI.start();
                return;
            }
        }
    }

    public final void LIZLLL() {
        this.LJLIL.setColor(this.LJLLJ);
        this.LJLIL.setStyle(Paint.Style.STROKE);
        this.LJLIL.setStrokeWidth(this.LJLLILLLL);
        this.LJLIL.setStrokeCap(Paint.Cap.ROUND);
    }

    public final void LIZJ() {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        RectF rectF = this.LJLJI;
        int i = this.LJLLILLLL;
        int i2 = this.LJLILLLLZI;
        rectF.set(paddingLeft + i, paddingTop + i, (i2 - paddingLeft) - i, (i2 - paddingTop) - i);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LJLJL = true;
        if (this.LJLJJL || this.LJLJJLL) {
            LIZ();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LJLJL = false;
        LIZIZ();
    }

    public int getColor() {
        return this.LJLLJ;
    }

    public float getMaxProgress() {
        return this.LJLJLLL;
    }

    public float getProgress() {
        return this.LJLJLJ;
    }

    public int getThickness() {
        return this.LJLLILLLL;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        isInEditMode();
        float f = (this.LJLJLJ / this.LJLJLLL) * 360.0f;
        if (!this.LJLJJI) {
            canvas.drawArc(this.LJLJI, this.LJLZ, f, false, this.LJLIL);
        } else {
            canvas.drawArc(this.LJLJI, this.LJLZ + this.LJLLI, this.LJLL, false, this.LJLIL);
        }
    }

    public void setColor(int i) {
        this.LJLLJ = i;
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
        this.LJLJLLL = f;
        invalidate();
    }

    public void setProgress(float f) {
        this.LJLJLJ = f;
        invalidate();
    }

    public void setThickness(int i) {
        this.LJLLILLLL = i;
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

    public C74040T4a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.x4, R.attr.x6, R.attr.a88, R.attr.a89, R.attr.a8_, R.attr.a8a, R.attr.a8b, R.attr.a8c, R.attr.a8d, R.attr.a8e, R.attr.a8f, R.attr.a8g, R.attr.a8h, R.attr.b5n, R.attr.b5o, R.attr.b5p, R.attr.b5q, R.attr.b5s}, 0, 0);
        getResources();
        this.LJLJLJ = obtainStyledAttributes.getFloat(10, 0.0f);
        this.LJLJLLL = obtainStyledAttributes.getFloat(9, 100.0f);
        this.LJLLILLLL = obtainStyledAttributes.getDimensionPixelSize(12, C32151Nz.LJIILLIIL(4));
        this.LJLJJI = obtainStyledAttributes.getBoolean(8, false);
        this.LJLJJL = obtainStyledAttributes.getBoolean(2, false);
        float f = obtainStyledAttributes.getFloat(11, -90.0f);
        this.LJZL = f;
        this.LJLZ = f;
        int identifier = getContext().getResources().getIdentifier("colorAccent", "attr", getContext().getPackageName());
        if (obtainStyledAttributes.hasValue(7)) {
            this.LJLLJ = obtainStyledAttributes.getColor(7, C04330Ez.LIZIZ(getContext(), R.color.hk));
        } else if (identifier != 0) {
            TypedValue typedValue = new TypedValue();
            getContext().getTheme().resolveAttribute(identifier, typedValue, true);
            this.LJLLJ = typedValue.data;
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(new int[]{android.R.attr.colorAccent});
            this.LJLLJ = obtainStyledAttributes2.getColor(0, C04330Ez.LIZIZ(getContext(), R.color.hk));
            obtainStyledAttributes2.recycle();
        }
        this.LJLLL = obtainStyledAttributes.getInteger(3, LivePlayerResourceReleaseSetting.ENABLE);
        this.LJLLLL = obtainStyledAttributes.getInteger(5, 5000);
        obtainStyledAttributes.getInteger(6, LiveMaxRetainAlogMessageSizeSetting.DEFAULT);
        this.LJLLLLLL = obtainStyledAttributes.getInteger(4, 3);
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
