package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.ies.dmt.ui.spi.DoubleColorBallAnimationViewExperimentService;
import com.ss.android.ugc.aweme.experiment.DoubleColorBallAnimationViewExperimentServiceImpl;
import com.zhiliaoapp.musically.R;

/* loaded from: classes13.dex */
public class T4V extends View {
    public int LJLIL;
    public int LJLILLLLZI;
    public Paint LJLJI;
    public final PorterDuffXfermode LJLJJI;
    public float LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public int LJLJLJ;
    public boolean LJLJLLL;
    public long LJLL;
    public int LJLLI;
    public float LJLLILLLL;
    public float LJLLJ;
    public float LJLLL;
    public float LJLLLL;
    public DoubleColorBallAnimationViewExperimentService LJLLLLLL;

    public T4V() {
        throw null;
    }

    public final void LIZJ() {
        this.LJLJLLL = false;
        this.LJLJL = false;
        this.LJLJJL = 0.0f;
    }

    public final void LIZ() {
        this.LJLL = -1L;
        if (this.LJLLI <= 0) {
            setProgressBarInfo(getContext().getResources().getDimensionPixelSize(R.dimen.ll));
        }
        int min = Math.min(getMeasuredHeight(), getMeasuredWidth());
        if (this.LJLLI > min && min > 0) {
            setProgressBarInfo(min);
        }
        if (this.LJLJI == null) {
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setDither(true);
            paint.setStyle(Paint.Style.FILL);
            this.LJLJI = paint;
        }
        this.LJLJL = true;
    }

    public final void LIZIZ() {
        LIZ();
        this.LJLJLLL = true;
        this.LJLJJLL = true;
        postInvalidate();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LIZJ();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        int i;
        int i2;
        long j;
        super.onDraw(canvas);
        if ((!this.LJLJLLL && this.LJLJJLL) || !this.LJLJL) {
            return;
        }
        boolean z = false;
        if (this.LJLJJLL) {
            long nanoTime = System.nanoTime() / 1000000;
            if (this.LJLL < 0) {
                this.LJLL = nanoTime;
            }
            float f3 = ((float) (nanoTime - this.LJLL)) / 400.0f;
            this.LJLJJL = f3;
            int i3 = (int) f3;
            if (((this.LJLJLJ + i3) & 1) == 1) {
                z = true;
            }
            this.LJLJJL = f3 - i3;
        }
        float f4 = this.LJLJJL;
        float f5 = f4 * 2.0f;
        if (f4 < 0.5d) {
            f = f5 * f4;
        } else {
            f = ((2.0f - f4) * f5) - 1.0f;
        }
        int i4 = this.LJLLI;
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, i4, i4, this.LJLJI, 31);
        float f6 = (this.LJLLLL * f) + this.LJLLL;
        if (f < 0.5d) {
            f2 = f * 2.0f;
        } else {
            f2 = 2.0f - (f * 2.0f);
        }
        float f7 = this.LJLLJ;
        float f8 = (0.25f * f2 * f7) + f7;
        Paint paint = this.LJLJI;
        if (z) {
            i = this.LJLILLLLZI;
        } else {
            i = this.LJLIL;
        }
        paint.setColor(i);
        canvas.drawCircle(f6, this.LJLLILLLL, f8, this.LJLJI);
        float f9 = this.LJLLI - f6;
        float f10 = this.LJLLJ;
        float f11 = f10 - ((f2 * 0.375f) * f10);
        Paint paint2 = this.LJLJI;
        if (z) {
            i2 = this.LJLIL;
        } else {
            i2 = this.LJLILLLLZI;
        }
        paint2.setColor(i2);
        this.LJLJI.setXfermode(this.LJLJJI);
        canvas.drawCircle(f9, this.LJLLILLLL, f11, this.LJLJI);
        this.LJLJI.setXfermode(null);
        canvas.restoreToCount(saveLayer);
        DoubleColorBallAnimationViewExperimentService doubleColorBallAnimationViewExperimentService = this.LJLLLLLL;
        if (doubleColorBallAnimationViewExperimentService != null && doubleColorBallAnimationViewExperimentService.LIZ()) {
            j = 32;
        } else {
            j = 17;
        }
        postInvalidateDelayed(j);
    }

    public void setCycleBias(int i) {
        this.LJLJLJ = i;
    }

    public void setProgress(float f) {
        if (!this.LJLJL) {
            LIZ();
        }
        this.LJLJJL = f;
        this.LJLJLLL = false;
        this.LJLJJLL = false;
        postInvalidate();
    }

    public void setProgressBarInfo(int i) {
        if (i > 0) {
            this.LJLLI = i;
            this.LJLLILLLL = i / 2.0f;
            float f = (i >> 1) * 0.32f;
            this.LJLLJ = f;
            float f2 = (i * 0.16f) + f;
            this.LJLLL = f2;
            this.LJLLLL = i - (f2 * 2.0f);
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

    public T4V(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        DoubleColorBallAnimationViewExperimentService doubleColorBallAnimationViewExperimentService;
        this.LJLJJI = new PorterDuffXfermode(PorterDuff.Mode.DARKEN);
        this.LJLJJLL = false;
        this.LJLJL = false;
        this.LJLJLJ = 0;
        this.LJLJLLL = false;
        this.LJLL = -1L;
        this.LJLLI = -1;
        this.LJLIL = AnonymousClass636.LJIIIIZZ(R.attr.eb, context);
        this.LJLILLLLZI = C04330Ez.LIZIZ(context, R.color.abt);
        Object LIZ = C58096Mr6.LIZ(DoubleColorBallAnimationViewExperimentService.class, false);
        if (LIZ != null) {
            doubleColorBallAnimationViewExperimentService = (DoubleColorBallAnimationViewExperimentService) LIZ;
        } else {
            if (C58096Mr6.q0 == null) {
                synchronized (DoubleColorBallAnimationViewExperimentService.class) {
                    if (C58096Mr6.q0 == null) {
                        C58096Mr6.q0 = new DoubleColorBallAnimationViewExperimentServiceImpl();
                    }
                }
            }
            doubleColorBallAnimationViewExperimentService = C58096Mr6.q0;
        }
        this.LJLLLLLL = doubleColorBallAnimationViewExperimentService;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int min = Math.min(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        if (this.LJLLI > min && min > 0) {
            setProgressBarInfo(min);
        }
    }
}
