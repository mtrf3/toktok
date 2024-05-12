package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D6S extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D6S() {
        this.LIZJ.LJIILIIL(31.41f, 22.59f);
        this.LIZJ.LJIIL(-9.29f, -9.3f);
        C32856Cuy.ln(this.LIZJ);
        this.LIZJ.LJII(27.17f, 24.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(-7.88f, 7.88f);
        C32856Cuy.Df(this.LIZJ);
        C32856Cuy.G(this.LIZJ);
        C32856Cuy.P5(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        C32856Cuy.Sg(dij);
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
