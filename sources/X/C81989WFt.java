package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import kotlin.jvm.internal.o;

/* renamed from: X.WFt, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81989WFt extends C81990WFu {
    public final Context LJIILJJIL;
    public double LJIILL;
    public boolean LJIILLIIL;
    public final RectF LJIIZILJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81989WFt(Context context) {
        super(context);
        o.LJIIIZ(context, "context");
        this.LJIILJJIL = context;
        this.LJIILL = 0.25d;
        this.LJIIZILJ = new RectF();
    }

    @Override // X.C81990WFu
    public final void LJ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        this.LJIILL = 0.25d;
        if (this.LJIILLIIL) {
            super.LJ(canvas);
            return;
        }
        int LIZJ = (int) KL2.LIZJ(this.LJIILJJIL, 4.0f);
        this.LIZJ = LIZJ;
        int i = this.LIZ - (LIZJ * 15);
        this.LIZIZ = i / 16;
        int i2 = (i % 16) / 2;
        int i3 = 0;
        do {
            double d = 0.75d - this.LJIILL;
            int i4 = this.LIZLLL;
            int i5 = (int) (i4 * d);
            this.LJIILL = d;
            int i6 = this.LIZJ;
            int i7 = this.LIZIZ;
            int i8 = (i6 + i7) * i3;
            int i9 = this.LJI;
            if (i9 > 0 && i9 > this.LJFF) {
                i7 = 0;
            }
            int i10 = i8 + i7;
            if (i3 == 0) {
                i10 += i2;
            }
            int i11 = ((i4 - i5) / 2) + this.LJ;
            RectF rectF = this.LJIIZILJ;
            rectF.left = i10;
            rectF.top = i11;
            rectF.right = i6 + i10;
            rectF.bottom = i5 + i11;
            float f = this.LJII;
            canvas.drawRoundRect(rectF, f, f, LIZJ());
            i3++;
        } while (i3 < 15);
    }
}
