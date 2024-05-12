package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CzG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33122CzG extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33122CzG() {
        this.LIZJ.LJIIIIZZ(14.5f, 6.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJI(32.0f);
        p.LJIIIZ(8.0f, 8.0f, false, true, 8.0f, 8.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(19.5f);
        C32856Cuy.Yb(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIJ(14.0f);
        p3.LJIIIZ(6.0f, 6.0f, false, false, -6.0f, -6.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJI(14.5f);
        C32856Cuy.Ul(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(13.0f, 12.0f);
        dij.LJIIIZ(4.0f, 4.0f, false, false, -4.0f, 4.0f);
        dij.LJIILL(25.0f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, 1.56f, 0.83f);
        dij.LJIIL(10.94f, -7.5f);
        dij.LJIIL(10.94f, 7.5f);
        dij.LIZJ(1.0f, 1.0f, false, false, 34.0f, 41.0f);
        dij.LJIJ(16.0f);
        dij.LJIIIZ(4.0f, 4.0f, false, false, -4.0f, -4.0f);
        C32856Cuy.LLLLIILLL(dij);
        C32856Cuy.LLIZ(dij);
        C32856Cuy.LJIIZILJ(dij);
        C32856Cuy.wm(dij);
        dij.LJIILL(23.1f);
        dij.LJIIL(-9.93f, -6.8f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, -1.14f, 0.0f);
        dij.LJII(11.0f, 39.1f);
        dij.LJIJ(16.0f);
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
