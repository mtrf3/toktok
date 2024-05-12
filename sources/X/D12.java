package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D12 extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D12() {
        this.LIZJ.LJIIIIZZ(17.0f, 39.5f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJI(2.59f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, -0.9f, -1.43f);
        this.LIZJ.LJIIL(14.4f, -30.1f);
        this.LIZJ.LJIIJ(0.47f, -0.96f, 1.91f, -0.63f, 1.91f, 0.43f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(30.1f);
        C32856Cuy.Vl(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIIZZ(31.0f, 39.5f);
        this.LIZJ.LJIIJJI(14.41f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIZ(1.0f, 1.0f, false, false, 0.9f, -1.43f);
        this.LIZJ.LJIIL(-14.4f, -30.1f);
        this.LIZJ.LJIIJ(-0.47f, -0.96f, -1.91f, -0.63f, -1.91f, 0.43f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIILL(30.1f);
        C32856Cuy.Yl(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LIZIZ(new RectF(22.0f, 2.0f, 26.0f, 46.0f), 1.0f, 1.0f, Path.Direction.CW);
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
