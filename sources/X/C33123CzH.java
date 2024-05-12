package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.CzH, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33123CzH extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33123CzH() {
        this.LIZJ.LJIIIIZZ(24.0f, 5.6f);
        this.LIZJ.LIZJ(2.3f, 2.3f, true, false, 24.0f, 1.0f);
        this.LIZJ.LJIIIZ(2.3f, 2.3f, false, false, 0.0f, 4.6f);
        this.LIZJ.LIZLLL();
        C32856Cuy.LLLLLLIL(this.LIZJ);
        this.LIZJ.LJIIIZ(2.3f, 2.3f, true, false, 0.0f, -4.6f);
        this.LIZJ.LJIIIZ(2.3f, 2.3f, false, false, 0.0f, 4.6f);
        this.LIZJ.LIZLLL();
        C32856Cuy.dg(this.LIZJ);
        this.LIZJ.LJIIIIZZ(29.8f, 44.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(2.3f, 2.3f, true, false, 4.25f, -1.76f);
        this.LIZJ.LIZJ(2.3f, 2.3f, false, false, 29.8f, 44.0f);
        this.LIZJ.LIZLLL();
        C32856Cuy.Tl(this.LIZJ);
        this.LIZJ.LJIIIIZZ(4.0f, 29.8f);
        this.LIZJ.LJIIIZ(2.3f, 2.3f, true, false, 1.76f, 4.25f);
        this.LIZJ.LIZJ(2.3f, 2.3f, false, false, 4.0f, 29.8f);
        this.LIZJ.LIZLLL();
        C32856Cuy.Hd(this.LIZJ);
        this.LIZJ.LJIIIIZZ(10.99f, 40.26f);
        C32856Cuy.Wj(this.LIZJ);
        C32856Cuy.h4(this.LIZJ);
        C32856Cuy.Ia(this.LIZJ);
        this.LIZJ.LJIIIIZZ(2.75f, 15.2f);
        this.LIZJ.LIZJ(2.3f, 2.3f, true, false, 7.0f, 16.96f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(2.3f, 2.3f, false, false, -4.25f, -1.76f);
        p2.LIZLLL();
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIIZZ(24.0f, 37.5f);
        this.LIZJ.LJIIJ(1.7f, 0.0f, 3.33f, -0.32f, 4.83f, -0.89f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIL(-3.24f, -3.24f);
        this.LIZJ.LIZJ(9.5f, 9.5f, false, true, 14.63f, 22.4f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIL(-3.24f, -3.24f);
        this.LIZJ.LIZJ(13.5f, 13.5f, false, false, 24.0f, 37.5f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(34.86f, 32.03f);
        dij.LJIIIZ(13.5f, 13.5f, false, false, -18.88f, -18.88f);
        dij.LJII(7.11f, 4.28f);
        C32856Cuy.LLLJ(dij);
        dij.LJIIL(-8.85f, -8.85f);
        dij.LIZLLL();
        dij.LJIIIIZZ(18.85f, 16.02f);
        dij.LJIIIZ(9.5f, 9.5f, false, true, 13.14f, 13.14f);
        dij.LJII(18.84f, 16.01f);
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
