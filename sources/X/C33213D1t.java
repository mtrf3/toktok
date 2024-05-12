package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D1t, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33213D1t extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33213D1t() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(24.0f, 7.5f);
        this.LIZJ.LJ(14.62f, 7.5f, 7.5f, 13.79f, 7.5f, 21.0f);
        this.LIZJ.LJIILLIIL(14.62f, 34.5f, 24.0f, 34.5f, true);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(3.5f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(3.98f);
        this.LIZJ.LJIIIZ(35.74f, 35.74f, false, false, 7.67f, -5.9f);
        this.LIZJ.LJIIJ(3.1f, -3.21f, 5.33f, -7.1f, 5.33f, -11.58f);
        this.LIZJ.LJIIJ(0.0f, -7.21f, -7.12f, -13.5f, -16.5f, -13.5f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(4.5f, 21.0f);
        this.LIZJ.LJIIJ(0.0f, -9.36f, 9.0f, -16.5f, 19.5f, -16.5f);
        this.LIZJ.LJIILLIIL(43.5f, 11.64f, 43.5f, 21.0f, true);
        this.LIZJ.LJIIJ(0.0f, 5.53f, -2.77f, 10.13f, -6.17f, 13.67f);
        this.LIZJ.LJIIIZ(40.15f, 40.15f, false, true, -10.66f, 7.67f);
        this.LIZJ.LIZJ(1.5f, 1.5f, false, true, 24.5f, 41.0f);
        C32856Cuy.LJJL(this.LIZJ);
        C32856Cuy.A6(this.LIZJ);
        this.LIZJ.LJ(13.5f, 37.5f, 4.5f, 30.36f, 4.5f, 21.0f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(17.0f, 21.5f);
        C32856Cuy.Q3(dij);
        dij.LJIIIIZZ(27.0f, 21.5f);
        C32856Cuy.Q3(dij);
        dij.LJIIIIZZ(37.0f, 21.5f);
        C32856Cuy.Q3(dij);
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
