package X;

import Y.ARunnableS42S0100000_6;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.SeekBar;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.VuU, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81238VuU extends C02Z implements SeekBar.OnSeekBarChangeListener {
    public final C81240VuW LJLILLLLZI;
    public final C81236VuS LJLJI;
    public SeekBar.OnSeekBarChangeListener LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public Float LJLJLJ;
    public boolean LJLJLLL;
    public int LJLL;
    public boolean LJLLI;
    public final ValueAnimator LJLLILLLL;
    public final ValueAnimator LJLLJ;

    public final boolean getCanDrag() {
        return this.LJLJLLL;
    }

    public final boolean getEnableClickToSeek() {
        return this.LJLJL;
    }

    public final boolean getHasActionMove() {
        return this.LJLJJL;
    }

    public final Float getMDownEventRawX() {
        return this.LJLJLJ;
    }

    public final boolean getMPauseStatus() {
        return this.LJLJJLL;
    }

    public final ValueAnimator getProcessAnimator() {
        return this.LJLLILLLL;
    }

    public final int getRealWidth() {
        return this.LJLL;
    }

    public final ValueAnimator getThumbnailAnimator() {
        return this.LJLLJ;
    }

    public final float LIZIZ(int i) {
        float f;
        int max;
        if (Build.VERSION.SDK_INT >= 26) {
            max = getMax() - getMin();
            if (max <= 0) {
                return 0.0f;
            }
            f = (i - getMin()) * 1.0f;
        } else {
            if (getMax() <= 0) {
                return 0.0f;
            }
            f = i * 1.0f;
            max = getMax();
        }
        return f / max;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        if (this.LJLJJL) {
            return true;
        }
        return super.canScrollHorizontally(i);
    }

    @Override // X.C02Z, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.LJLL != (getWidth() - getPaddingLeft()) - getPaddingRight() || this.LJLLI) {
            post(new ARunnableS42S0100000_6(this, 112));
        }
        float LIZIZ = LIZIZ(getProgress());
        float LIZIZ2 = LIZIZ(getSecondaryProgress());
        C81236VuS c81236VuS = this.LJLJI;
        c81236VuS.LJIIIZ = LIZIZ;
        c81236VuS.LJIIJ = LIZIZ2;
        this.LJLILLLLZI.LJIIIZ = LIZIZ;
        super.onDraw(canvas);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.LJLJJI;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStartTrackingTouch(seekBar);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        requestLayout();
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.LJLJJI;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStopTrackingTouch(seekBar);
        }
    }

    @Override // android.widget.AbsSeekBar, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Integer num;
        if (motionEvent != null) {
            num = Integer.valueOf(motionEvent.getAction());
        } else {
            num = null;
        }
        if (num != null) {
            if (num.intValue() == 0) {
                this.LJLJJL = false;
                this.LJLJLJ = Float.valueOf(motionEvent.getRawX());
                super.onTouchEvent(motionEvent);
            } else if (num.intValue() == 2) {
                Float f = this.LJLJLJ;
                if (f != null && Math.abs(f.floatValue() - motionEvent.getRawX()) > 10.0f) {
                    this.LJLJJL = true;
                    super.onTouchEvent(motionEvent);
                }
            } else if (num.intValue() == 1) {
                if (this.LJLJJL || this.LJLJJLL || this.LJLJL) {
                    super.onTouchEvent(motionEvent);
                } else {
                    onStartTrackingTouch(this);
                    onStopTrackingTouch(this);
                }
                this.LJLJJL = false;
            } else if (num.intValue() == 3) {
                super.onTouchEvent(motionEvent);
                this.LJLJJL = false;
            }
        }
        return true;
    }

    public final void setCanDrag(boolean z) {
        this.LJLJLLL = z;
    }

    public final void setCustomOnSeekBarChangeListener(SeekBar.OnSeekBarChangeListener l) {
        o.LJIIIZ(l, "l");
        this.LJLJJI = l;
    }

    public final void setEnableClickToSeek(boolean z) {
        this.LJLJL = z;
    }

    public final void setHasActionMove(boolean z) {
        this.LJLJJL = z;
    }

    public final void setMDownEventRawX(Float f) {
        this.LJLJLJ = f;
    }

    public final void setMPauseStatus(boolean z) {
        this.LJLJJLL = z;
    }

    public final void setPauseStatus(boolean z) {
        this.LJLJJLL = z;
    }

    @Override // android.widget.ProgressBar
    public void setProgress(int i) {
        if (this.LJLJJL) {
            return;
        }
        super.setProgress(i);
    }

    public final void setRealWidth(int i) {
        this.LJLL = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81238VuU(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.b_h);
        a1.LJFF(context, "context");
        C81240VuW c81240VuW = new C81240VuW();
        this.LJLILLLLZI = c81240VuW;
        C81236VuS c81236VuS = new C81236VuS(c81240VuW);
        this.LJLJI = c81236VuS;
        this.LJLJLLL = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        o.LJIIIIZZ(ofFloat, "ofFloat(0f, 1f)");
        this.LJLLILLLL = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        o.LJIIIIZZ(ofFloat2, "ofFloat(0f, 1f)");
        this.LJLLJ = ofFloat2;
        setOnSeekBarChangeListener(this);
        setThumb(new DIV());
        setProgressDrawable(c81236VuS);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.LJLILLLLZI.LJIIIIZZ = getMeasuredHeight();
    }

    public static float LIZ(ValueAnimator valueAnimator, float f, float f2) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        return (((Float) animatedValue).floatValue() * (f2 - f)) + f;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.LJLJJI;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onProgressChanged(seekBar, i, z);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int paddingRight = (i - getPaddingRight()) - getPaddingLeft();
        this.LJLL = paddingRight;
        this.LJLILLLLZI.LJIIJ = paddingRight;
        this.LJLLI = false;
    }

    public static /* synthetic */ void LIZLLL(C81238VuU c81238VuU, Integer num, Integer num2, Float f, Float f2, boolean z, int i) {
        boolean z2 = z;
        Float f3 = f2;
        Float f4 = f;
        Integer num3 = num;
        Integer num4 = num2;
        if ((i & 1) != 0) {
            num3 = null;
        }
        if ((i & 2) != 0) {
            num4 = null;
        }
        if ((i & 4) != 0) {
            f4 = null;
        }
        if ((i & 8) != 0) {
            f3 = null;
        }
        if ((i & 64) != 0) {
            z2 = false;
        }
        c81238VuU.LIZJ(num3, num4, f4, f3, null, 0.0f, z2);
    }

    public final void LIZJ(Integer num, Integer num2, Float f, Float f2, Integer num3, float f3, boolean z) {
        boolean z2;
        C81236VuS c81236VuS = this.LJLJI;
        float f4 = c81236VuS.LJ;
        float f5 = c81236VuS.LJFF;
        float f6 = c81236VuS.LJI;
        if (num != null) {
            int intValue = num.intValue();
            C81236VuS c81236VuS2 = this.LJLJI;
            if (c81236VuS2.LIZIZ != intValue) {
                z2 = true;
            } else {
                z2 = false;
            }
            c81236VuS2.LIZIZ = intValue;
        } else {
            z2 = false;
        }
        if (num2 != null) {
            int intValue2 = num2.intValue();
            C81236VuS c81236VuS3 = this.LJLJI;
            if (c81236VuS3.LIZLLL != intValue2) {
                z2 = true;
            }
            c81236VuS3.LIZLLL = intValue2;
        }
        if (num3 != null) {
            int intValue3 = num3.intValue();
            C81236VuS c81236VuS4 = this.LJLJI;
            if (c81236VuS4.LIZJ != intValue3) {
                z2 = true;
            }
            c81236VuS4.LIZJ = intValue3;
        }
        if (f != null) {
            float floatValue = f.floatValue();
            C81236VuS c81236VuS5 = this.LJLJI;
            if (c81236VuS5.LJ != floatValue) {
                z2 = true;
            }
            c81236VuS5.LJ = floatValue;
        }
        if (f2 != null) {
            float floatValue2 = f2.floatValue();
            C81236VuS c81236VuS6 = this.LJLJI;
            if (c81236VuS6.LJFF != floatValue2) {
                z2 = true;
            }
            c81236VuS6.LJFF = floatValue2;
        }
        C81236VuS c81236VuS7 = this.LJLJI;
        if (c81236VuS7.LJI != f3) {
            z2 = true;
        }
        c81236VuS7.LJI = f3;
        if (z2) {
            requestLayout();
            if (z) {
                this.LJLLILLLL.removeAllUpdateListeners();
                this.LJLLILLLL.setInterpolator(C55953Lxd.LJIIJ());
                this.LJLLILLLL.setDuration(100L);
                this.LJLLILLLL.addUpdateListener(new C81237VuT(this, f5, f2, f4, f, f6, f3));
                this.LJLLILLLL.start();
                return;
            }
            this.LJLLI = true;
            invalidate();
        }
    }

    public static void LJ(C81238VuU c81238VuU, Float f, Float f2, Float f3, Integer num, float f4, boolean z, int i) {
        boolean z2;
        boolean z3;
        float f5 = f4;
        Float f6 = f3;
        Float f7 = f;
        Float f8 = f2;
        Integer num2 = null;
        if ((i & 1) != 0) {
            f7 = null;
        }
        if ((i & 2) != 0) {
            f8 = null;
        }
        if ((i & 4) != 0) {
            f6 = null;
        }
        if ((i & 8) == 0) {
            num2 = num;
        }
        if ((i & 256) != 0) {
            f5 = 0.0f;
        }
        if ((i & 512) != 0) {
            z = false;
        }
        C81240VuW c81240VuW = c81238VuU.LJLILLLLZI;
        float f9 = c81240VuW.LJIIJJI;
        float f10 = c81240VuW.LJFF;
        float f11 = c81240VuW.LJ;
        float f12 = c81240VuW.LJI;
        if (f7 != null) {
            float floatValue = f7.floatValue();
            C81240VuW c81240VuW2 = c81238VuU.LJLILLLLZI;
            if (c81240VuW2.LJ == floatValue) {
                z3 = true;
            } else {
                z3 = false;
            }
            z2 = !z3;
            c81240VuW2.LJ = floatValue;
        } else {
            z2 = false;
        }
        if (f8 != null) {
            float floatValue2 = f8.floatValue();
            C81240VuW c81240VuW3 = c81238VuU.LJLILLLLZI;
            if (c81240VuW3.LJFF != floatValue2) {
                z2 = true;
            }
            c81240VuW3.LJFF = floatValue2;
        }
        if (f6 != null) {
            float floatValue3 = f6.floatValue();
            C81240VuW c81240VuW4 = c81238VuU.LJLILLLLZI;
            if (c81240VuW4.LJI != floatValue3) {
                z2 = true;
            }
            c81240VuW4.LJI = floatValue3;
        }
        if (num2 != null) {
            int intValue = num2.intValue();
            C81240VuW c81240VuW5 = c81238VuU.LJLILLLLZI;
            if (c81240VuW5.LIZIZ != intValue) {
                z2 = true;
            }
            c81240VuW5.LIZIZ = intValue;
        }
        C81240VuW c81240VuW6 = c81238VuU.LJLILLLLZI;
        if (c81240VuW6.LJIIJJI != f5) {
            z2 = true;
        }
        c81240VuW6.LJIIJJI = f5;
        if (z2) {
            if (z) {
                c81238VuU.LJLLJ.removeAllUpdateListeners();
                c81238VuU.LJLLJ.setInterpolator(C55953Lxd.LJIIJ());
                c81238VuU.LJLLJ.setDuration(100L);
                c81238VuU.LJLLJ.addUpdateListener(new C81242VuY(c81238VuU, f9, f5, f10, f8, f11, f7, f12, f6));
                c81238VuU.LJLLJ.start();
                return;
            }
            c81238VuU.LJLLI = true;
            c81238VuU.invalidate();
        }
    }
}
