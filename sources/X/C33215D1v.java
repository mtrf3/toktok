package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D1v, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33215D1v extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33215D1v() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(24.0f, 6.0f);
        this.LIZJ.LJIIIZ(18.0f, 18.0f, true, true, 0.0f, 36.0f);
        this.LIZJ.LJIIIZ(18.0f, 18.0f, false, true, 0.0f, -36.0f);
        this.LIZJ.LIZLLL();
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILIIL(22.0f, 18.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(22.0f, 22.0f, true, false, -44.0f, 0.0f);
        p3.LJIIIZ(22.0f, 22.0f, false, false, 44.0f, 0.0f);
        p3.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIILIIL(21.59f, 24.41f);
        dij.LJIIL(-6.24f, -6.23f);
        C32856Cuy.a3(dij);
        dij.LJIIJ(0.2f, -0.2f, 0.52f, -0.2f, 0.71f, 0.0f);
        dij.LJIIL(6.23f, 6.24f);
        dij.LJIIL(6.24f, -6.24f);
        C32856Cuy.g9(dij);
        dij.LJIIL(2.12f, 2.12f);
        dij.LJIIJ(0.2f, 0.2f, 0.2f, 0.52f, 0.0f, 0.71f);
        dij.LJIIL(-6.23f, 6.23f);
        dij.LJIIL(6.23f, 6.24f);
        C32856Cuy.LLIILZL(dij);
        C32856Cuy.Ja(dij);
        C32856Cuy.D5(dij);
        dij.LJIIL(-6.24f, -6.23f);
        dij.LJIIL(-6.23f, 6.23f);
        dij.LJIIIZ(0.5f, 0.5f, false, true, -0.7f, 0.0f);
        dij.LJIIL(-2.13f, -2.12f);
        C32856Cuy.B5(dij);
        dij.LJIIL(6.24f, -6.24f);
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
