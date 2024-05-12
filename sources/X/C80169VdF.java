package X;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.zhiliaoapp.musically.R;

/* renamed from: X.VdF, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80169VdF extends AbstractC80168VdE implements InterfaceC80186VdW {
    public boolean LJLJJI;
    public boolean LJLJJL;
    public final Paint LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public final float LJLJLLL;
    public long LJLL;
    public boolean LJLLI;
    public final TimeInterpolator LJLLILLLL;

    public C80169VdF(Context context) {
        super(context);
        this.LJLJL = -1118482;
        this.LJLJLJ = -1615546;
        this.LJLLILLLL = new AccelerateDecelerateInterpolator();
        setMinimumHeight(InterpolatorC80153Vcz.LIZJ(60.0f));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, new int[]{R.attr.bcc, R.attr.bcd, R.attr.bdn});
        Paint paint = new Paint();
        this.LJLJJLL = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        this.LJLILLLLZI = C80182VdS.LIZJ;
        this.LJLILLLLZI = C80182VdS.LJI[obtainStyledAttributes.getInt(1, 0)];
        if (obtainStyledAttributes.hasValue(2)) {
            int color = obtainStyledAttributes.getColor(2, 0);
            this.LJLJL = color;
            this.LJLJJI = true;
            if (!this.LJLLI) {
                paint.setColor(color);
            }
        }
        if (obtainStyledAttributes.hasValue(0)) {
            int color2 = obtainStyledAttributes.getColor(0, 0);
            this.LJLJLJ = color2;
            this.LJLJJL = true;
            if (this.LJLLI) {
                paint.setColor(color2);
            }
        }
        obtainStyledAttributes.recycle();
        this.LJLJLLL = InterpolatorC80153Vcz.LIZJ(4.0f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i;
        float f;
        int width = getWidth();
        int height = getHeight();
        float min = Math.min(width, height);
        float f2 = this.LJLJLLL;
        float f3 = (min - (f2 * 2.0f)) / 6.0f;
        float f4 = f3 * 2.0f;
        float f5 = (width / 2.0f) - (f2 + f4);
        float f6 = height / 2.0f;
        long currentTimeMillis = System.currentTimeMillis();
        int i2 = 0;
        do {
            i = i2 + 1;
            long j = (currentTimeMillis - this.LJLL) - (i * LiveTryModeCountDownThresholdSetting.DEFAULT);
            if (j > 0) {
                f = ((float) (j % 750)) / 750.0f;
            } else {
                f = 0.0f;
            }
            float interpolation = ((AccelerateDecelerateInterpolator) this.LJLLILLLL).getInterpolation(f);
            canvas.save();
            float f7 = i2;
            canvas.translate((this.LJLJLLL * f7) + (f4 * f7) + f5, f6);
            if (interpolation < 0.5d) {
                float f8 = 1.0f - ((interpolation * 2.0f) * 0.7f);
                canvas.scale(f8, f8);
            } else {
                float f9 = ((interpolation * 2.0f) * 0.7f) - 0.4f;
                canvas.scale(f9, f9);
            }
            canvas.drawCircle(0.0f, 0.0f, f3, this.LJLJJLL);
            canvas.restore();
            i2 = i;
        } while (i < 3);
        super.dispatchDraw(canvas);
        if (this.LJLLI) {
            invalidate();
        }
    }

    @Override // X.AbstractC80168VdE, X.InterfaceC80178VdO
    public void setPrimaryColors(int... iArr) {
        if (!this.LJLJJL && iArr.length > 1) {
            int i = iArr[0];
            this.LJLJLJ = i;
            this.LJLJJL = true;
            if (this.LJLLI) {
                this.LJLJJLL.setColor(i);
            }
            this.LJLJJL = false;
        }
        if (!this.LJLJJI) {
            if (iArr.length > 1) {
                int i2 = iArr[1];
                this.LJLJL = i2;
                this.LJLJJI = true;
                if (!this.LJLLI) {
                    this.LJLJJLL.setColor(i2);
                }
            } else if (iArr.length > 0) {
                int LJIIIZ = C07290Qj.LJIIIZ(-1711276033, iArr[0]);
                this.LJLJL = LJIIIZ;
                this.LJLJJI = true;
                if (!this.LJLLI) {
                    this.LJLJJLL.setColor(LJIIIZ);
                }
            }
            this.LJLJJI = false;
        }
    }

    @Override // X.AbstractC80168VdE, X.InterfaceC80178VdO
    public final int LJIIIIZZ(C80164VdA c80164VdA, boolean z) {
        this.LJLLI = false;
        this.LJLL = 0L;
        this.LJLJJLL.setColor(this.LJLJL);
        return 0;
    }

    @Override // X.AbstractC80168VdE, X.InterfaceC80178VdO
    public final void LJJI(InterfaceC78979Uz9 interfaceC78979Uz9, int i, int i2) {
        if (this.LJLLI) {
            return;
        }
        invalidate();
        this.LJLLI = true;
        this.LJLL = System.currentTimeMillis();
        this.LJLJJLL.setColor(this.LJLJLJ);
    }
}
