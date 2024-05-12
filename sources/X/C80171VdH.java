package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.zhiliaoapp.musically.R;

/* renamed from: X.VdH, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80171VdH extends AbstractC80168VdE implements InterfaceC80161Vd7 {
    public int LJLJJI;
    public int LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public final boolean LJLJLLL;
    public final Path LJLL;
    public final Paint LJLLI;
    public int LJLLILLLL;
    public int LJLLJ;
    public int LJLLL;
    public int LJLLLL;
    public float LJLLLLLL;
    public float LJLZ;
    public final float LJZ;
    public float LJZI;
    public int LJZL;
    public final float LL;
    public final float LLD;
    public float LLF;
    public Animator LLFF;
    public final RectF LLFFF;

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Animator animator = this.LLFF;
        if (animator != null) {
            C16880lQ.LJLJJI(animator);
            this.LLFF.end();
            this.LLFF = null;
        }
    }

    @Override // X.AbstractC80168VdE, X.InterfaceC80178VdO
    public final boolean LJIILLIIL() {
        return this.LJLJLLL;
    }

    public C80171VdH(Context context) {
        super(context);
        this.LJLLL = -1;
        this.LLFFF = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.LJLILLLLZI = C80182VdS.LIZLLL;
        this.LJLL = new Path();
        Paint paint = new Paint();
        this.LJLLI = paint;
        paint.setAntiAlias(true);
        this.LJZ = InterpolatorC80153Vcz.LIZJ(7.0f);
        this.LL = InterpolatorC80153Vcz.LIZJ(20.0f);
        this.LLD = InterpolatorC80153Vcz.LIZJ(7.0f);
        paint.setStrokeWidth(InterpolatorC80153Vcz.LIZJ(3.0f));
        setMinimumHeight(InterpolatorC80153Vcz.LIZJ(100.0f));
        if (isInEditMode()) {
            this.LJLLILLLL = 1000;
            this.LLF = 1.0f;
            this.LJZL = 270;
        } else {
            this.LLF = 0.0f;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, new int[]{R.attr.bcb, R.attr.bcu, R.attr.bdo});
        this.LJLJLLL = obtainStyledAttributes.getBoolean(1, this.LJLJLLL);
        this.LJLJJI = obtainStyledAttributes.getColor(0, -1);
        this.LJLJL = true;
        this.LJLJJL = obtainStyledAttributes.getColor(2, -14540254);
        this.LJLJJLL = true;
        this.LJLJL = obtainStyledAttributes.hasValue(0);
        this.LJLJJLL = obtainStyledAttributes.hasValue(2);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i;
        float f;
        float f2;
        float f3;
        int width = getWidth();
        if (isInEditMode()) {
            i = getHeight();
        } else {
            i = this.LJLLLL;
        }
        this.LJLL.reset();
        this.LJLL.lineTo(0.0f, this.LJLLILLLL);
        Path path = this.LJLL;
        int i2 = this.LJLLL;
        float f4 = 2.0f;
        if (i2 >= 0) {
            f = i2;
        } else {
            f = width / 2.0f;
        }
        float f5 = width;
        path.quadTo(f, this.LJLLJ + r3, f5, this.LJLLILLLL);
        this.LJLL.lineTo(f5, 0.0f);
        this.LJLLI.setColor(this.LJLJJL);
        canvas.drawPath(this.LJLL, this.LJLLI);
        if (this.LJLLLLLL > 0.0f) {
            this.LJLLI.setColor(this.LJLJJI);
            float f6 = i;
            float f7 = f6 / InterpolatorC80153Vcz.LIZIZ;
            float f8 = 1.0f;
            float f9 = 7.0f;
            float f10 = (f5 * 1.0f) / 7.0f;
            float f11 = this.LJLZ;
            float f12 = f10 * f11;
            if (f11 > 1.0f) {
                f2 = ((f11 - 1.0f) * f10) / f11;
            } else {
                f2 = 0.0f;
            }
            float f13 = f12 - f2;
            if (f11 > 1.0f) {
                f3 = (((f11 - 1.0f) * f6) / 2.0f) / f11;
            } else {
                f3 = 0.0f;
            }
            float f14 = f6 - f3;
            int i3 = 0;
            do {
                float f15 = (i3 + f8) - 4.0f;
                float abs = (f8 - ((Math.abs(f15) / f9) * f4)) * 255.0f;
                this.LJLLI.setAlpha((int) ((1.0d - (1.0d / Math.pow((f7 / 800.0d) + 1.0d, 15.0d))) * this.LJLLLLLL * abs));
                float f16 = (1.0f - (1.0f / ((f7 / 10.0f) + 1.0f))) * this.LJZ;
                canvas.drawCircle((f13 * f15) + ((f5 / 2.0f) - (f16 / 2.0f)), f14 / 2.0f, f16, this.LJLLI);
                i3++;
                f8 = 1.0f;
                f9 = 7.0f;
                f4 = 2.0f;
            } while (i3 < 7);
            this.LJLLI.setAlpha(255);
        }
        if (this.LLFF != null || isInEditMode()) {
            float f17 = this.LL;
            float f18 = this.LLF;
            float f19 = f17 * f18;
            float f20 = this.LLD * f18;
            this.LJLLI.setColor(this.LJLJJI);
            this.LJLLI.setStyle(Paint.Style.FILL);
            float f21 = f5 / f4;
            float f22 = i / f4;
            canvas.drawCircle(f21, f22, f19, this.LJLLI);
            this.LJLLI.setStyle(Paint.Style.STROKE);
            float f23 = f20 + f19;
            canvas.drawCircle(f21, f22, f23, this.LJLLI);
            this.LJLLI.setColor((this.LJLJJL & 16777215) | 1426063360);
            this.LJLLI.setStyle(Paint.Style.FILL);
            this.LLFFF.set(f21 - f19, f22 - f19, f21 + f19, f19 + f22);
            canvas.drawArc(this.LLFFF, 270.0f, this.LJZL, true, this.LJLLI);
            this.LJLLI.setStyle(Paint.Style.STROKE);
            this.LLFFF.set(f21 - f23, f22 - f23, f21 + f23, f22 + f23);
            canvas.drawArc(this.LLFFF, 270.0f, this.LJZL, false, this.LJLLI);
            this.LJLLI.setStyle(Paint.Style.FILL);
        }
        if (this.LJZI > 0.0f) {
            this.LJLLI.setColor(this.LJLJJI);
            canvas.drawCircle(f5 / 2.0f, i / 2.0f, this.LJZI, this.LJLLI);
        }
        super.dispatchDraw(canvas);
    }

    @Override // X.AbstractC80168VdE, X.InterfaceC80178VdO
    public void setPrimaryColors(int... iArr) {
        if (iArr.length > 0 && !this.LJLJJLL) {
            this.LJLJJL = iArr[0];
            this.LJLJJLL = false;
        }
        if (iArr.length > 1 && !this.LJLJL) {
            this.LJLJJI = iArr[1];
            this.LJLJL = false;
        }
    }

    @Override // X.AbstractC80168VdE, X.InterfaceC80178VdO
    public final int LJIIIIZZ(C80164VdA c80164VdA, boolean z) {
        Animator animator = this.LLFF;
        if (animator != null) {
            C16880lQ.LJLJJI(animator);
            this.LLFF.end();
            this.LLFF = null;
        }
        int width = getWidth();
        int i = this.LJLLLL;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.LL, (float) Math.sqrt((i * i) + (width * width)));
        ofFloat.setDuration(400L);
        ofFloat.addUpdateListener(new C80177VdN(this, (byte) 3));
        ofFloat.start();
        return LiveChatShowDelayForHotLiveSetting.DEFAULT;
    }

    @Override // X.AbstractC80168VdE, X.InterfaceC80185VdV
    public final void LIZIZ(InterfaceC78979Uz9 interfaceC78979Uz9, EnumC80174VdK enumC80174VdK, EnumC80174VdK enumC80174VdK2) {
        int i = C80180VdQ.LIZ[enumC80174VdK2.ordinal()];
        if (i != 1 && i != 2) {
            return;
        }
        this.LJLLLLLL = 1.0f;
        this.LLF = 0.0f;
        this.LJZI = 0.0f;
    }

    @Override // X.AbstractC80168VdE, X.InterfaceC80178VdO
    public final void LJIILL(float f, int i, int i2) {
        this.LJLLL = i;
        invalidate();
    }

    @Override // X.AbstractC80168VdE, X.InterfaceC80178VdO
    public final void LJIJ(InterfaceC78979Uz9 interfaceC78979Uz9, int i, int i2) {
        this.LJLLILLLL = i - 1;
        this.LJLJLJ = false;
        InterpolatorC80153Vcz interpolatorC80153Vcz = new InterpolatorC80153Vcz(1);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.setInterpolator(interpolatorC80153Vcz);
        ofFloat.addUpdateListener(new C80177VdN(this, (byte) 2));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setInterpolator(interpolatorC80153Vcz);
        ofFloat2.addUpdateListener(new C80177VdN(this, (byte) 0));
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 360);
        ofInt.setDuration(720L);
        ofInt.setRepeatCount(-1);
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.addUpdateListener(new C80177VdN(this, (byte) 4));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(ofFloat, ofFloat2, ofInt);
        animatorSet.start();
        int i3 = this.LJLLJ;
        float f = i3;
        ValueAnimator ofInt2 = ValueAnimator.ofInt(i3, 0, -((int) (0.8f * f)), 0, -((int) (f * 0.4f)), 0);
        ofInt2.addUpdateListener(new C80177VdN(this, (byte) 1));
        ofInt2.setInterpolator(new InterpolatorC80153Vcz(1));
        ofInt2.setDuration(800L);
        ofInt2.start();
        this.LLFF = animatorSet;
    }

    @Override // X.AbstractC80168VdE, X.InterfaceC80178VdO
    public final void LJJIFFI(boolean z, float f, int i, int i2, int i3) {
        this.LJLLLL = i;
        if (z || this.LJLJLJ) {
            this.LJLJLJ = true;
            this.LJLLILLLL = Math.min(i2, i);
            this.LJLLJ = (int) (Math.max(0, i - i2) * 1.9f);
            this.LJLZ = f;
            invalidate();
        }
    }
}
