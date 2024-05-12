package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.AqS162S0200000_15;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YAT extends Drawable {
    public final float LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final int LIZLLL;
    public final float LJ;
    public final float LJFF;
    public final float LJI;
    public final float LJII;
    public final Paint LJIIIIZZ;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [T, X.YAN] */
    /* JADX WARN: Type inference failed for: r0v24, types: [T, X.YAO] */
    /* JADX WARN: Type inference failed for: r10v0, types: [T, X.YAR] */
    /* JADX WARN: Type inference failed for: r8v0, types: [T, X.YAS] */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas c) {
        o.LJIIIZ(c, "c");
        Paint paint = this.LJIIIIZZ;
        paint.setColor(this.LIZLLL);
        paint.setStrokeWidth(this.LIZJ);
        float height = (getBounds().height() * 2) + (getBounds().width() * 2);
        float f = this.LJ;
        float f2 = this.LJII;
        float f3 = this.LJFF;
        float f4 = this.LJI;
        float f5 = 2;
        float f6 = ((((((f + f2) + f3) + f4) * 3.1415927f) / 2.0f) + (height - ((((f + f2) + f3) + f4) * f5))) - ((this.LIZJ / f5) * 8);
        float f7 = this.LIZ + this.LIZIZ;
        C76732zl c76732zl = new C76732zl();
        int i = (int) (f6 / f7);
        if (i < 1) {
            i = 1;
        }
        c76732zl.element = i;
        float f8 = this.LIZ;
        float f9 = f8 / (this.LIZIZ + f8);
        float f10 = (f6 / i) * f9;
        float f11 = (1.0f - f9) * (f6 / i);
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = YAN.U;
        C68322mC c68322mC2 = new C68322mC();
        c68322mC2.element = YAO.LINE;
        C56K c56k = new C56K();
        c56k.element = f10;
        C68322mC c68322mC3 = new C68322mC();
        float f12 = this.LIZJ;
        c68322mC3.element = new YAS((f12 / f5) + this.LJ, f12 / f5);
        C68322mC c68322mC4 = new C68322mC();
        float width = getBounds().width();
        float f13 = this.LIZJ;
        float f14 = this.LJFF;
        c68322mC4.element = new YAR((width - (f13 / f5)) - f14, (f13 / f5) + f14, f14, 4.712389f);
        YAP yap = new YAP(f11, f10, c, this, c56k, c76732zl, c68322mC3, c68322mC, c68322mC2);
        YAQ yaq = new YAQ(f11, f10, c, this, c56k, c76732zl, c68322mC4, c68322mC2, c68322mC);
        while (c76732zl.element > 0) {
            switch ((YAN) c68322mC.element) {
                case U:
                    yap.invoke(new AqS181S0100000_15(this, 307), new AqS181S0100000_15(this, 308), new AqS162S0200000_15(c68322mC4, (C68322mC<YAR>) this, (YAT) 93));
                    break;
                case UR:
                    yaq.invoke(Float.valueOf(6.2831855f), new AqS162S0200000_15(c68322mC3, (C68322mC<YAR>) this, (YAT) 94));
                    break;
                case R:
                    yap.invoke(new AqS181S0100000_15(this, 309), new AqS181S0100000_15(this, 310), new AqS162S0200000_15(c68322mC4, (C68322mC<YAR>) this, (YAT) 95));
                    break;
                case DR:
                    yaq.invoke(Float.valueOf(1.5707964f), new AqS162S0200000_15(c68322mC3, (C68322mC<YAR>) this, (YAT) 96));
                    break;
                case D:
                    yap.invoke(new AqS181S0100000_15(this, 303), new AqS181S0100000_15(this, 304), new AqS162S0200000_15(c68322mC4, (C68322mC<YAR>) this, (YAT) 89));
                    break;
                case DL:
                    yaq.invoke(Float.valueOf(3.1415927f), new AqS162S0200000_15(c68322mC3, (C68322mC<YAR>) this, (YAT) 90));
                    break;
                case L:
                    yap.invoke(new AqS181S0100000_15(this, 305), new AqS181S0100000_15(this, 306), new AqS162S0200000_15(c68322mC4, (C68322mC<YAR>) this, (YAT) 91));
                    break;
                case UL:
                    yaq.invoke(Float.valueOf(4.712389f), new AqS162S0200000_15(c68322mC3, (C68322mC<YAR>) this, (YAT) 92));
                    break;
            }
        }
    }

    public final void LIZ(Canvas canvas, YAR yar, YAR yar2) {
        float f = yar.LIZ;
        float f2 = yar.LIZJ;
        float f3 = yar.LIZIZ;
        float f4 = yar.LIZLLL;
        float f5 = 180;
        canvas.drawArc(f - f2, f3 - f2, f + f2, f3 + f2, (f4 * f5) / 3.1415927f, ((yar2.LIZLLL - f4) * f5) / 3.1415927f, false, this.LJIIIIZZ);
    }

    public YAT(float f, float f2, float f3, int i, float f4, float f5, float f6, float f7) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = f3;
        this.LIZLLL = i;
        this.LJ = f4;
        this.LJFF = f5;
        this.LJI = f6;
        this.LJII = f7;
        Paint paint = new Paint();
        paint.setStrokeWidth(30.0f);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.LJIIIIZZ = paint;
    }
}
