package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.WFu, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C81990WFu {
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public Paint LJIIIIZZ;
    public Paint LJIIIZ;
    public float[] LJIIJ;
    public int LJIIJJI;
    public Paint LJIIL;
    public boolean LJIILIIL;

    public final Paint LIZ() {
        Paint paint = this.LJIIL;
        if (paint != null) {
            return paint;
        }
        o.LJIJI("centerLinePaint");
        throw null;
    }

    public final Paint LIZIZ() {
        Paint paint = this.LJIIIZ;
        if (paint != null) {
            return paint;
        }
        o.LJIJI("outerPaint");
        throw null;
    }

    public final Paint LIZJ() {
        Paint paint = this.LJIIIIZZ;
        if (paint != null) {
            return paint;
        }
        o.LJIJI("paint");
        throw null;
    }

    public C81990WFu() {
        this.LJIIJ = new float[0];
        this.LJIIJJI = -1;
        this.LJIILIIL = true;
    }

    public C81990WFu(Context context) {
        o.LJIIIZ(context, "context");
        this.LJIIJ = new float[0];
        this.LJIIJJI = -1;
        this.LJIILIIL = true;
        LIZLLL(context);
    }

    public final void LIZLLL(Context context) {
        o.LJIIIZ(context, "context");
        this.LJIIIIZZ = new Paint();
        LIZJ().setColor(this.LJIIJJI);
        LIZJ().setStyle(Paint.Style.FILL);
        LIZJ().setAntiAlias(true);
        this.LJIIIZ = new Paint();
        LIZIZ().setColor(this.LJIIJJI);
        LIZIZ().setStyle(Paint.Style.FILL);
        LIZIZ().setAntiAlias(true);
        LIZIZ().setAlpha(127);
        this.LJIIL = new Paint();
        LIZ().setColor(AnonymousClass636.LJIIIIZZ(R.attr.cv, context));
        LIZ().setStrokeWidth((int) KL2.LIZJ(context, 1.0f));
        LIZ().setStyle(Paint.Style.FILL);
        LIZ().setAntiAlias(true);
        this.LJII = (int) KL2.LIZJ(context, 3.0f);
        this.LIZIZ = (int) KL2.LIZJ(context, 3.0f);
        this.LIZJ = (int) KL2.LIZJ(context, 2.0f);
    }

    public void LJ(Canvas canvas) {
        Paint LIZJ;
        int i;
        o.LJIIIZ(canvas, "canvas");
        if (this.LJIILIIL) {
            float f = (this.LIZLLL / 2) + this.LJ;
            canvas.drawLine(0.0f, f, this.LIZ, f, LIZ());
        }
        int length = this.LJIIJ.length;
        for (int i2 = 0; i2 < length; i2++) {
            float f2 = this.LJIIJ[i2];
            int i3 = this.LIZLLL;
            int i4 = (int) (f2 * i3);
            int i5 = this.LIZJ;
            int i6 = this.LIZIZ;
            int i7 = (i5 + i6) * i2;
            int i8 = this.LJI;
            if (i8 > 0 && i8 > this.LJFF) {
                i6 = 0;
            }
            int i9 = i7 + i6;
            int i10 = i5 + i9;
            RectF rectF = new RectF(i9, ((i3 - i4) / 2) + this.LJ, i10, i4 + r1);
            float f3 = this.LJII;
            int i11 = this.LJI;
            if (i11 > 0 && i11 > (i = this.LJFF) && (i10 <= i || i9 >= i11)) {
                LIZJ = LIZIZ();
            } else {
                LIZJ = LIZJ();
            }
            canvas.drawRoundRect(rectF, f3, f3, LIZJ);
        }
    }

    public final void LJFF(int i) {
        this.LJIIJJI = i;
        LIZJ().setColor(i);
        LIZIZ().setColor(i);
    }

    public final void LJII(float[] fArr) {
        if (C81995WFz.LJ(fArr)) {
            if (fArr != null) {
                float[] copyOf = Arrays.copyOf(fArr, fArr.length);
                o.LJIIIIZZ(copyOf, "copyOf(this, size)");
                this.LJIIJ = copyOf;
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public final void LJI(int i, int i2) {
        this.LIZ = i;
        this.LIZLLL = i2 - (this.LJ * 2);
    }
}
