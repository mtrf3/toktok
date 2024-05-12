package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* loaded from: classes13.dex */
public class T4X extends View {
    public int LJLIL;
    public int LJLILLLLZI;
    public Paint LJLJI;
    public final PorterDuffXfermode LJLJJI;
    public boolean LJLJJL;
    public long LJLJJLL;
    public int LJLJL;
    public float LJLJLJ;
    public float LJLJLLL;
    public float LJLL;
    public float LJLLI;

    public final void LIZIZ() {
        if (!C82894Wg6.LIZIZ.LIZIZ()) {
            setLayerType(1, null);
        }
        this.LJLJJLL = -1L;
        if (this.LJLJL <= 0) {
            setProgressBarInfo(getContext().getResources().getDimensionPixelSize(R.dimen.a8s));
        }
        int min = Math.min(getMeasuredHeight(), getMeasuredWidth());
        if (this.LJLJL > min && min > 0) {
            setProgressBarInfo(min);
        }
        if (this.LJLJI == null) {
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setDither(true);
            paint.setStyle(Paint.Style.FILL);
            this.LJLJI = paint;
        }
        this.LJLJJL = true;
        postInvalidate();
    }

    public final void LIZJ() {
        if (!C82894Wg6.LIZIZ.LIZIZ()) {
            setLayerType(0, null);
        }
        this.LJLJJL = false;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getVisibility() == 0) {
            LIZIZ();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LIZJ();
    }

    public final void LIZ(Context context) {
        this.LJLIL = C04330Ez.LIZIZ(context, R.color.un);
        this.LJLILLLLZI = C04330Ez.LIZIZ(context, R.color.uo);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        int i;
        int i2;
        super.onDraw(canvas);
        if (!this.LJLJJL) {
            return;
        }
        long nanoTime = System.nanoTime() / 1000000;
        if (this.LJLJJLL < 0) {
            this.LJLJJLL = nanoTime;
        }
        float f3 = ((float) (nanoTime - this.LJLJJLL)) / 400.0f;
        int i3 = (int) f3;
        boolean z = true;
        if ((i3 & 1) != 1) {
            z = false;
        }
        float f4 = f3 - i3;
        float f5 = f4 * 2.0f;
        if (f4 < 0.5d) {
            f = f5 * f4;
        } else {
            f = ((2.0f - f4) * f5) - 1.0f;
        }
        int i4 = this.LJLJL;
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, i4, i4, this.LJLJI, 31);
        float f6 = (this.LJLLI * f) + this.LJLL;
        if (f < 0.5d) {
            f2 = f * 2.0f;
        } else {
            f2 = 2.0f - (f * 2.0f);
        }
        float f7 = this.LJLJLLL;
        float f8 = (0.25f * f2 * f7) + f7;
        Paint paint = this.LJLJI;
        if (z) {
            i = this.LJLILLLLZI;
        } else {
            i = this.LJLIL;
        }
        paint.setColor(i);
        canvas.drawCircle(f6, this.LJLJLJ, f8, this.LJLJI);
        float f9 = this.LJLJL - f6;
        float f10 = this.LJLJLLL;
        float f11 = f10 - ((f2 * 0.375f) * f10);
        Paint paint2 = this.LJLJI;
        if (z) {
            i2 = this.LJLIL;
        } else {
            i2 = this.LJLILLLLZI;
        }
        paint2.setColor(i2);
        this.LJLJI.setXfermode(this.LJLJJI);
        canvas.drawCircle(f9, this.LJLJLJ, f11, this.LJLJI);
        this.LJLJI.setXfermode(null);
        canvas.restoreToCount(saveLayer);
        postInvalidateDelayed(17L);
    }

    public void setProgressBarInfo(int i) {
        if (i > 0) {
            this.LJLJL = i;
            this.LJLJLJ = i / 2.0f;
            float f = (i >> 1) * 0.32f;
            this.LJLJLLL = f;
            float f2 = (i * 0.16f) + f;
            this.LJLL = f2;
            this.LJLLI = i - (f2 * 2.0f);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            LIZIZ();
        } else {
            LIZJ();
        }
    }

    public T4X(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLJJI = new PorterDuffXfermode(PorterDuff.Mode.DARKEN);
        this.LJLJJL = false;
        this.LJLJJLL = -1L;
        this.LJLJL = -1;
        LIZ(context);
        LIZ(context);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int min = Math.min(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        if (this.LJLJL > min && min > 0) {
            setProgressBarInfo(min);
        }
    }
}
