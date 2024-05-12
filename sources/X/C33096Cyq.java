package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cyq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33096Cyq extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33096Cyq() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(9.0f, 4.0f);
        p.LJIIIZ(5.0f, 5.0f, false, false, -5.0f, 5.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(19.0f);
        C32856Cuy.oi(this.LIZJ);
        this.LIZJ.LJIIJJI(16.6f);
        this.LIZJ.LJIILL(-8.6f);
        this.LIZJ.LJIIIZ(4.0f, 4.0f, false, true, 3.44f, -3.97f);
        this.LIZJ.LJII(37.0f, 19.3f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIJ(9.0f);
        p3.LJIIIZ(5.0f, 5.0f, false, false, -5.0f, -5.0f);
        p3.LJI(9.0f);
        p3.LIZLLL();
        this.LIZJ.LJIILIIL(16.57f, 14.73f);
        this.LIZJ.LJIIIZ(0.84f, 0.84f, false, false, 0.0f, -1.46f);
        this.LIZJ.LJII(17.3f, 12.6f);
        this.LIZJ.LJIIJ(-0.58f, -0.32f, -1.3f, 0.09f, -1.3f, 0.74f);
        this.LIZJ.LJIILL(9.3f);
        this.LIZJ.LJIIJ(0.0f, 0.65f, 0.72f, 1.06f, 1.3f, 0.74f);
        this.LIZJ.LJIIL(8.27f, -4.66f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.EVEN_ODD);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(22.0f, 41.0f);
        C32856Cuy.ji(dij);
        dij.LJIIJJI(1.6f);
        dij.LJIJ(24.4f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, 0.86f, -1.0f);
        dij.LJIIL(15.4f, -2.2f);
        dij.LJIIIZ(1.0f, 1.0f, false, true, 1.14f, 1.0f);
        C32856Cuy.M9(dij);
        dij.LJIIIZ(5.0f, 5.0f, true, true, -5.0f, -5.0f);
        dij.LJIIJJI(1.6f);
        dij.LJIILL(-8.04f);
        dij.LJII(32.0f, 27.48f);
        C32856Cuy.N9(dij);
        dij.LJIIIZ(5.0f, 5.0f, false, true, -10.0f, 0.0f);
        dij.LIZLLL();
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
