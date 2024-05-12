package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.6XC, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6XC extends View {
    public final float LJLIL;
    public final float LJLILLLLZI;
    public final float LJLJI;
    public final float LJLJJI;
    public final float LJLJJL;
    public final long LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public Paint LJLJLLL;
    public final PorterDuffXfermode LJLL;
    public float LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLJ;
    public int LJLLL;
    public boolean LJLLLL;
    public long LJLLLLLL;
    public int LJLZ;
    public float LJZ;
    public float LJZI;
    public float LJZL;
    public float LL;

    public final void LIZ() {
        this.LJLLLLLL = -1L;
        if (this.LJLZ <= 0) {
            Context context = getContext();
            o.LJFF(context, "context");
            setProgressBarInfo(context.getResources().getDimensionPixelSize(R.dimen.wb));
        }
        int min = Math.min(getMeasuredHeight(), getMeasuredWidth());
        if (this.LJLZ > min && min > 0) {
            setProgressBarInfo(min);
        }
        if (this.LJLJLLL == null) {
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setDither(true);
            paint.setStyle(Paint.Style.FILL);
            this.LJLJLLL = paint;
        }
        this.LJLLJ = true;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LJLLLL = false;
        this.LJLLJ = false;
        this.LJLLI = 0.0f;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        int i;
        int i2;
        o.LJIIJ(canvas, "canvas");
        super.onDraw(canvas);
        if ((!this.LJLLLL && this.LJLLILLLL) || !this.LJLLJ) {
            return;
        }
        boolean z = false;
        if (this.LJLLILLLL) {
            long nanoTime = System.nanoTime() / 1000000;
            if (this.LJLLLLLL < 0) {
                this.LJLLLLLL = nanoTime;
            }
            float f3 = ((float) (nanoTime - this.LJLLLLLL)) / this.LJLJJL;
            this.LJLLI = f3;
            int i3 = (int) f3;
            if (((this.LJLLL + i3) & 1) == 1) {
                z = true;
            }
            this.LJLLI = f3 - i3;
        } else {
            z = false;
        }
        float f4 = this.LJLLI;
        if (f4 < 0.5d) {
            f = 2 * f4 * f4;
        } else {
            float f5 = 2;
            f = ((f5 - f4) * (f5 * f4)) - 1;
        }
        int i4 = this.LJLZ;
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, i4, i4, this.LJLJLLL, 31);
        float f6 = (this.LL * f) + this.LJZL;
        if (f < 0.5d) {
            f2 = f * 2.0f;
        } else {
            float f7 = 2;
            f2 = f7 - (f * f7);
        }
        float f8 = this.LJLIL * f2;
        float f9 = this.LJZI;
        float f10 = (f8 * f9) + f9;
        Paint paint = this.LJLJLLL;
        if (paint != null) {
            if (z) {
                i = this.LJLJLJ;
            } else {
                i = this.LJLJL;
            }
            paint.setColor(i);
            float f11 = this.LJZ;
            Paint paint2 = this.LJLJLLL;
            if (paint2 != null) {
                canvas.drawCircle(f6, f11, f10, paint2);
                float f12 = this.LJLZ - f6;
                float f13 = this.LJZI;
                float f14 = f13 - ((f2 * this.LJLILLLLZI) * f13);
                Paint paint3 = this.LJLJLLL;
                if (paint3 != null) {
                    if (z) {
                        i2 = this.LJLJL;
                    } else {
                        i2 = this.LJLJLJ;
                    }
                    paint3.setColor(i2);
                    Paint paint4 = this.LJLJLLL;
                    if (paint4 != null) {
                        paint4.setXfermode(this.LJLL);
                        float f15 = this.LJZ;
                        Paint paint5 = this.LJLJLLL;
                        if (paint5 != null) {
                            canvas.drawCircle(f12, f15, f14, paint5);
                            Paint paint6 = this.LJLJLLL;
                            if (paint6 != null) {
                                paint6.setXfermode(null);
                                canvas.restoreToCount(saveLayer);
                                postInvalidateDelayed(this.LJLJJLL);
                                return;
                            }
                            o.LJIIZILJ();
                            throw null;
                        }
                        o.LJIIZILJ();
                        throw null;
                    }
                    o.LJIIZILJ();
                    throw null;
                }
                o.LJIIZILJ();
                throw null;
            }
            o.LJIIZILJ();
            throw null;
        }
        o.LJIIZILJ();
        throw null;
    }

    public final void setCycleBias(int i) {
        this.LJLLL = i;
    }

    public final void setProgress(float f) {
        if (!this.LJLLJ) {
            LIZ();
        }
        this.LJLLI = f;
        this.LJLLLL = false;
        this.LJLLILLLL = false;
        postInvalidate();
    }

    public final void setProgressBarInfo(int i) {
        if (i > 0) {
            this.LJLZ = i;
            this.LJZ = i / 2.0f;
            float f = (i >> 1) * this.LJLJJI;
            this.LJZI = f;
            float f2 = (this.LJLJI * i) + f;
            this.LJZL = f2;
            this.LL = i - (f2 * 2);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            LIZ();
            this.LJLLLL = true;
            this.LJLLILLLL = true;
            postInvalidate();
            return;
        }
        this.LJLLLL = false;
        this.LJLLJ = false;
        this.LJLLI = 0.0f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6XC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        o.LJIIJ(context, "context");
        this.LJLIL = 0.25f;
        this.LJLILLLLZI = 0.375f;
        this.LJLJI = 0.16f;
        this.LJLJJI = 0.32f;
        this.LJLJJL = 400.0f;
        this.LJLJJLL = 17L;
        this.LJLL = new PorterDuffXfermode(PorterDuff.Mode.XOR);
        this.LJLLLLLL = -1L;
        this.LJLZ = -1;
        this.LJLJL = C04330Ez.LIZIZ(context, R.color.lq);
        this.LJLJLJ = C04330Ez.LIZIZ(context, R.color.lr);
        this.LJLJL = C04330Ez.LIZIZ(context, R.color.lq);
        this.LJLJLJ = C04330Ez.LIZIZ(context, R.color.lr);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int min = Math.min(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        if (this.LJLZ > min && min > 0) {
            setProgressBarInfo(min);
        }
    }
}
