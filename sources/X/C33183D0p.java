package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D0p, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33183D0p extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33183D0p() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(4.0f, 19.0f);
        C32856Cuy.le(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LIZJ(2.0f, 2.0f, false, true, 25.0f, 6.38f);
        C32856Cuy.Pn(this.LIZJ);
        C32856Cuy.LLLLLLZZ(this.LIZJ);
        C32856Cuy.vl(this.LIZJ);
        this.LIZJ.LIZJ(6.0f, 6.0f, false, true, 11.15f, 20.0f);
        C32856Cuy.LLLLLZ(this.LIZJ);
        C32856Cuy.x3(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIIZZ(31.03f, 18.38f);
        p3.LJIIIZ(1.1f, 1.1f, false, true, 0.04f, -1.45f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIL(1.41f, -1.41f);
        this.LIZJ.LJIIIZ(0.94f, 0.94f, false, true, 1.4f, 0.02f);
        this.LIZJ.LJIIIZ(13.12f, 13.12f, false, true, 0.0f, 16.92f);
        this.LIZJ.LJIIIZ(0.94f, 0.94f, false, true, -1.4f, 0.03f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIL(-1.41f, -1.42f);
        p5.LJIIIZ(1.1f, 1.1f, false, true, -0.04f, -1.45f);
        p5.LJIIJ(2.6f, -3.24f, 2.6f, -8.0f, 0.0f, -11.24f);
        p5.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(37.43f, 37.44f);
        dij.LJIIJ(-0.39f, -0.4f, -0.38f, -1.03f, -0.02f, -1.44f);
        dij.LJIIIZ(18.17f, 18.17f, false, false, 0.0f, -24.0f);
        dij.LJIIIZ(1.04f, 1.04f, false, true, 0.02f, -1.43f);
        C32856Cuy.t(dij);
        dij.LJIIIZ(0.97f, 0.97f, false, true, 1.4f, 0.02f);
        dij.LJIIIZ(22.2f, 22.2f, false, true, 0.0f, 29.67f);
        dij.LJIIJ(-0.38f, 0.4f, -1.01f, 0.4f, -1.4f, 0.01f);
        dij.LJIIL(-1.42f, -1.41f);
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
