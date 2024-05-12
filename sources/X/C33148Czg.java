package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Czg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33148Czg extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33148Czg() {
        this.LIZJ.LJIIIIZZ(29.0f, 13.19f);
        this.LIZJ.LIZJ(2.0f, 2.0f, false, false, 31.84f, 16.0f);
        this.LIZJ.LJIIL(7.18f, -7.17f);
        this.LIZJ.LIZJ(2.0f, 2.0f, false, false, 36.18f, 6.0f);
        this.LIZJ.LJIIL(-7.17f, 7.18f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(31.66f, 7.7f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, -0.71f, -1.7f);
        C32856Cuy.h5(dij);
        dij.LJIJ(13.1f);
        dij.LJIIIZ(1.0f, 1.0f, false, false, -1.7f, -0.72f);
        dij.LJIIL(-5.05f, 5.05f);
        dij.LJIIIZ(4.0f, 4.0f, true, true, -5.66f, -5.66f);
        C279417u.LIZIZ(dij, 4.07f, -4.06f, 14.0f, 23.0f);
        C32856Cuy.x(dij);
        C32856Cuy.F0(dij);
        dij.LJIIIZ(2.0f, 2.0f, true, true, 0.0f, 4.0f);
        C32856Cuy.LJIIIIZZ(dij);
        dij.LJIIIZ(2.0f, 2.0f, false, true, -2.0f, -2.0f);
        dij.LIZLLL();
        dij.LJIILIIL(2.0f, 6.0f);
        C32856Cuy.LJIILIIL(dij);
        dij.LJIIIZ(2.0f, 2.0f, true, true, 0.0f, 4.0f);
        C32856Cuy.s6(dij);
        dij.LJIIIZ(2.0f, 2.0f, false, true, 0.0f, -4.0f);
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
