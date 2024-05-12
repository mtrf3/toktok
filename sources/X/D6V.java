package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D6V extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D6V() {
        this.LIZJ.LJIIIIZZ(14.7f, 23.3f);
        C32856Cuy.pk(this.LIZJ);
        this.LIZJ.LJII(22.0f, 29.16f);
        C32856Cuy.H7(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(-9.3f, 9.3f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(2.0f, 2.0f, false, true, -2.82f, 0.0f);
        p2.LJIIL(-9.3f, -9.3f);
        p2.LJIIIZ(1.0f, 1.0f, false, true, 0.0f, -1.41f);
        p2.LJIIL(1.42f, -1.42f);
        this.LIZJ.LIZLLL();
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
