package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.8pd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C223338pd extends View {
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

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C223338pd(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    public final void LIZJ() {
        this.LJLJLJ = false;
        this.LJLJL = false;
        this.LJLJJL = 0.0f;
    }

    public final void LIZ() {
        this.LJLJLLL = -1L;
        if (this.LJLL <= 0) {
            setProgressBarInfo(O6R.LJJIIZ(C32151Nz.LJIIZILJ(36)));
        }
        int measuredHeight = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        if (measuredHeight > measuredWidth) {
            measuredHeight = measuredWidth;
        }
        if (1 <= measuredHeight && measuredHeight < this.LJLL) {
            setProgressBarInfo(measuredHeight);
        }
        this.LJLJL = true;
    }

    public final void LIZIZ() {
        LIZ();
        this.LJLJLJ = true;
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
            f = ((f5 - f4) * (f5 * f4)) - 1;
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
            LIZJ();
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

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C223338pd(android.content.Context r3, android.util.AttributeSet r4, int r5) {
        /*
            r2 = this;
            r0 = r5 & 2
            if (r0 == 0) goto L5
            r4 = 0
        L5:
            java.lang.String r0 = "context"
            defpackage.a1.LJFF(r3, r0)
            r0 = 0
            r2.<init>(r3, r4, r0)
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r0 = 1
            r1.setAntiAlias(r0)
            r1.setDither(r0)
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r1.setStyle(r0)
            r2.LJLJI = r1
            android.graphics.PorterDuffXfermode r1 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.DARKEN
            r1.<init>(r0)
            r2.LJLJJI = r1
            r0 = -1
            r2.LJLJLLL = r0
            r0 = -1
            r2.LJLL = r0
            java.lang.String r0 = "#FE2C55"
            int r0 = com.bytedance.mt.protector.impl.color.ColorProtector.parseColor(r0)
            r2.LJLIL = r0
            java.lang.String r0 = "#25F4EE"
            int r0 = com.bytedance.mt.protector.impl.color.ColorProtector.parseColor(r0)
            r2.LJLILLLLZI = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C223338pd.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
