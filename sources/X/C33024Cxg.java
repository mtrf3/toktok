package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cxg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33024Cxg extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33024Cxg() {
        this.LIZJ.LJIIIIZZ(12.0f, 19.0f);
        C32856Cuy.H8(this.LIZJ);
        this.LIZJ.LJIIIZ(11.0f, 11.0f, false, false, 22.0f, 0.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(-4.0f);
        p.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        p.LJIIJJI(2.0f);
        p.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        p.LJIILL(4.0f);
        this.LIZJ.LJIIIZ(15.0f, 15.0f, false, true, -13.0f, 14.87f);
        C32856Cuy.LLJLL(this.LIZJ);
        C32856Cuy.LLIIII(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(-3.13f);
        this.LIZJ.LIZJ(15.0f, 15.0f, false, true, 9.0f, 24.0f);
        C32856Cuy.i3(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(16.0f, 14.0f);
        dij.LJIIIZ(8.0f, 8.0f, true, true, 16.0f, 0.0f);
        C32856Cuy.LJLIIIL(dij);
        dij.LJIIIZ(8.0f, 8.0f, true, true, -16.0f, 0.0f);
        dij.LJIJ(14.0f);
        dij.LIZLLL();
        dij.LJIILIIL(8.34f, 0.33f);
        dij.LJIIIZ(0.6f, 0.6f, false, true, 0.33f, 0.33f);
        dij.LJIIL(0.78f, 1.96f);
        dij.LJIIJ(0.2f, 0.5f, 0.9f, 0.5f, 1.1f, 0.0f);
        dij.LJIIL(0.78f, -1.96f);
        dij.LJIIIZ(0.6f, 0.6f, false, true, 0.33f, -0.33f);
        dij.LJIIL(1.96f, -0.78f);
        dij.LJIIJ(0.5f, -0.2f, 0.5f, -0.9f, 0.0f, -1.1f);
        dij.LJIIL(-1.96f, -0.78f);
        dij.LJIIIZ(0.6f, 0.6f, false, true, -0.33f, -0.33f);
        dij.LJIIL(-0.78f, -1.96f);
        dij.LJIIIZ(0.6f, 0.6f, false, false, -1.1f, 0.0f);
        dij.LJIIL(-0.78f, 1.96f);
        dij.LJIIIZ(0.6f, 0.6f, false, true, -0.33f, 0.33f);
        dij.LJIIL(-1.96f, 0.78f);
        dij.LJIIJ(-0.5f, 0.2f, -0.5f, 0.9f, 0.0f, 1.1f);
        I9A.LIZIZ(dij, 1.96f, 0.78f, -4.0f, 6.62f);
        dij.LJIIL(0.68f, 1.72f);
        dij.LJIIJ(0.17f, 0.44f, 0.8f, 0.44f, 0.96f, 0.0f);
        dij.LJIIL(0.68f, -1.72f);
        dij.LJIIIZ(0.52f, 0.52f, false, true, 0.3f, -0.29f);
        dij.LJIIL(1.71f, -0.68f);
        dij.LJIIIZ(0.52f, 0.52f, false, false, 0.0f, -0.96f);
        dij.LJIIL(-1.72f, -0.68f);
        dij.LJIIIZ(0.52f, 0.52f, false, true, -0.29f, -0.3f);
        dij.LJIIL(-0.68f, -1.71f);
        dij.LJIIIZ(0.52f, 0.52f, false, false, -0.96f, 0.0f);
        dij.LJIIL(-0.68f, 1.72f);
        dij.LJIIIZ(0.52f, 0.52f, false, true, -0.3f, 0.29f);
        dij.LJIIL(-1.71f, 0.68f);
        dij.LJIIIZ(0.52f, 0.52f, false, false, 0.0f, 0.96f);
        dij.LJIIL(1.72f, 0.68f);
        dij.LJIIJ(0.13f, 0.05f, 0.24f, 0.16f, 0.29f, 0.3f);
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
