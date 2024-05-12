package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.view.View;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.a3s, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92012a3s extends View {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final Paint LJLJI;
    public final PorterDuffXfermode LJLJJI;
    public float LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public long LJLJLLL;
    public int LJLL;
    public float LJLLI;
    public float LJLLILLLL;
    public float LJLLJ;
    public float LJLLL;
    public boolean LJLLLL;

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LJLJLJ = false;
        this.LJLJL = false;
        this.LJLJJL = 0.0f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92012a3s(Context context) {
        super(context, null, 0);
        o.LJIIIZ(context, "context");
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setStyle(Paint.Style.FILL);
        this.LJLJI = paint;
        this.LJLJJI = new PorterDuffXfermode(PorterDuff.Mode.DARKEN);
        this.LJLJLLL = -1L;
        this.LJLL = -1;
        this.LJLIL = ColorProtector.parseColor("#FE2C55");
        this.LJLILLLLZI = ColorProtector.parseColor("#25F4EE");
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        int i;
        int i2;
        boolean z;
        o.LJIIIZ(canvas, "canvas");
        super.onDraw(canvas);
        if ((!this.LJLJLJ && this.LJLJJLL) || !this.LJLJL) {
            return;
        }
        if (this.LJLJJLL) {
            long nanoTime = System.nanoTime() / 1000000;
            if (this.LJLJLLL < 0) {
                this.LJLJLLL = nanoTime;
            }
            float f3 = ((float) (nanoTime - this.LJLJLLL)) / 400.0f;
            this.LJLJJL = f3;
            int i3 = (int) f3;
            if ((i3 & 1) == 1) {
                z = true;
            } else {
                z = false;
            }
            this.LJLLLL = z;
            this.LJLJJL = f3 - i3;
        }
        float f4 = this.LJLJJL;
        if (f4 < 0.5d) {
            f = 2 * f4 * f4;
        } else {
            float f5 = 2;
            f = ((f5 * f4) * (f5 - f4)) - 1;
        }
        int i4 = this.LJLL;
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, i4, i4, this.LJLJI, 31);
        float f6 = (this.LJLLL * f) + this.LJLLJ;
        if (f < 0.5d) {
            f2 = f * 2.0f;
        } else {
            float f7 = 2;
            f2 = f7 - (f * f7);
        }
        float f8 = this.LJLLILLLL;
        float f9 = (0.25f * f2 * f8) + f8;
        Paint paint = this.LJLJI;
        if (this.LJLLLL) {
            i = this.LJLILLLLZI;
        } else {
            i = this.LJLIL;
        }
        paint.setColor(i);
        canvas.drawCircle(f6, this.LJLLI, f9, this.LJLJI);
        float f10 = this.LJLL - f6;
        float f11 = this.LJLLILLLL;
        float f12 = f11 - ((f2 * 0.375f) * f11);
        Paint paint2 = this.LJLJI;
        if (this.LJLLLL) {
            i2 = this.LJLIL;
        } else {
            i2 = this.LJLILLLLZI;
        }
        paint2.setColor(i2);
        this.LJLJI.setXfermode(this.LJLJJI);
        canvas.drawCircle(f10, this.LJLLI, f12, this.LJLJI);
        this.LJLJI.setXfermode(null);
        canvas.restoreToCount(saveLayer);
        postInvalidateDelayed(17L);
    }

    public final void setAnimating(boolean z) {
        this.LJLJLJ = z;
    }

    public final void setProgressBarInfo(int i) {
        if (i > 0) {
            this.LJLL = i;
            this.LJLLI = i / 2.0f;
            float f = (i >> 1) * 0.32f;
            this.LJLLILLLL = f;
            float f2 = (i * 0.16f) + f;
            this.LJLLJ = f2;
            this.LJLLL = i - (f2 * 2);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i != 0) {
            this.LJLJLJ = false;
            this.LJLJL = false;
            this.LJLJJL = 0.0f;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (size > size2) {
            size = size2;
        }
        if (1 <= size && size < this.LJLL) {
            setProgressBarInfo(size);
        }
    }
}
