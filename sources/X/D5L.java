package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D5L extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D5L() {
        this.LIZJ.LJIIIIZZ(31.7f, 20.62f);
        C32856Cuy.Hk(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(-1.4f, -1.42f);
        C32856Cuy.yk(this.LIZJ);
        this.LIZJ.LJIIL(-5.17f, 5.17f);
        C32856Cuy.mk(this.LIZJ);
        this.LIZJ.LJIIL(-2.67f, -2.67f);
        C32856Cuy.ln(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIL(5.5f, 5.5f);
        C32856Cuy.Dk(this.LIZJ);
        this.LIZJ.LJIIL(8.0f, -8.0f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        C32856Cuy.ma(dij);
        dij.LJIIZILJ(Path.FillType.WINDING);
        this.LIZ.add(LIZ);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
    }
}
