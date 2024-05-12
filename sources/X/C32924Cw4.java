package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cw4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32924Cw4 extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C32924Cw4() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(8.0f, 10.5f);
        C32856Cuy.LJIJJ(this.LIZJ);
        C32856Cuy.X4(this.LIZJ);
        C32856Cuy.G9(this.LIZJ);
        C32856Cuy.e9(this.LIZJ);
        C32856Cuy.LLLLLZ(this.LIZJ);
        this.LIZJ.LIZJ(4.5f, 4.5f, false, true, 3.5f, 33.0f);
        C32856Cuy.m9(this.LIZJ);
        this.LIZJ.LIZJ(4.5f, 4.5f, false, true, 8.0f, 10.5f);
        this.LIZJ.LIZLLL();
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIIZZ(31.5f, 15.0f);
        C32856Cuy.m8(this.LIZJ);
        C32856Cuy.LLLLLZ(this.LIZJ);
        C32856Cuy.Xj(this.LIZJ);
        C32856Cuy.LJLJL(this.LIZJ);
        C32856Cuy.Ej(this.LIZJ);
        C32856Cuy.LJIJJ(this.LIZJ);
        C32856Cuy.Bl(this.LIZJ);
        DIK.LIZIZ(this.LIZJ, "p", 15.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILIIL(11.0f, 14.05f);
        C32856Cuy.p2(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(15.81f, 27.93f);
        dij.LJIILL(-7.84f);
        dij.LJIIIZ(0.6f, 0.6f, false, true, 0.92f, -0.5f);
        dij.LJII(23.0f, 23.5f);
        dij.LJIIIZ(0.6f, 0.6f, false, true, 0.0f, 1.02f);
        dij.LJIIL(-6.27f, 3.92f);
        dij.LJIIIZ(0.6f, 0.6f, false, true, -0.92f, -0.51f);
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
