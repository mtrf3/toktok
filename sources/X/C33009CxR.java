package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CxR, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33009CxR extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33009CxR() {
        this.LIZJ.LJIIIIZZ(30.75f, 21.67f);
        this.LIZJ.LJIIIZ(2.5f, 2.5f, false, false, 0.0f, -4.34f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(-9.0f, -5.2f);
        C32856Cuy.Rm(this.LIZJ);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(22.0f, 16.9f);
        this.LIZJ.LJIIL(4.5f, 2.6f);
        this.LIZJ.LJIIL(-4.5f, 2.6f);
        C78269Unh.LIZJ(this.LIZJ, "p", -5.2f);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(7.0f, 11.0f);
        dij.LJIIIZ(7.0f, 7.0f, false, true, 7.0f, -7.0f);
        C32856Cuy.LJJ(dij);
        C32856Cuy.wm(dij);
        dij.LJIILL(36.0f);
        dij.LJIIIZ(2.0f, 2.0f, false, true, -2.0f, 2.0f);
        dij.LJI(13.5f);
        dij.LJIIIZ(6.5f, 6.5f, false, true, -6.48f, -7.0f);
        C32856Cuy.LLLLLLZZ(dij);
        C32856Cuy.LLZLL(dij);
        dij.LJIILIIL(4.0f, 20.5f);
        dij.LJIIJ(0.77f, -0.32f, 1.61f, -0.5f, 2.5f, -0.5f);
        C32856Cuy.O6(dij);
        C32856Cuy.LLZZZIL(dij);
        dij.LJIILL(20.5f);
        dij.LIZLLL();
        dij.LJIIIIZZ(37.0f, 35.0f);
        dij.LJI(13.5f);
        dij.LJIIIZ(2.5f, 2.5f, false, false, 0.0f, 5.0f);
        C32856Cuy.O6(dij);
        C32856Cuy.g1(dij);
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
