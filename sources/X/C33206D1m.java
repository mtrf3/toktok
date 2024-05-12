package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D1m, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33206D1m extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33206D1m() {
        this.LIZJ.LJIIIIZZ(29.62f, 16.27f);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, false, -0.19f, -0.68f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(-0.86f, -0.5f);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, false, -0.69f, 0.18f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIL(-9.5f, 16.46f);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, false, 0.19f, 0.68f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIL(0.86f, 0.5f);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, false, 0.69f, -0.18f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIL(9.5f, -16.46f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(10.0f, 10.0f);
        C32856Cuy.qn(dij);
        C32856Cuy.V3(dij);
        dij.LJI(14.0f);
        dij.LJIIIZ(4.0f, 4.0f, false, true, -4.0f, -4.0f);
        dij.LJIJ(10.0f);
        dij.LIZLLL();
        C32856Cuy.nc(dij);
        C32856Cuy.LJLLL(dij);
        C32856Cuy.Nd(dij);
        dij.LJIJ(10.0f);
        dij.LJIIIZ(2.0f, 2.0f, false, false, -2.0f, -2.0f);
        C32856Cuy.LLLLIL(dij);
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
