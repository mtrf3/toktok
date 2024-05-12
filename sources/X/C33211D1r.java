package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D1r, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33211D1r extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33211D1r() {
        this.LIZJ.LJIIIIZZ(23.6f, 33.3f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJ(-0.56f, 0.0f, -0.84f, 0.0f, -1.05f, -0.1f);
        p.LJIIIZ(1.0f, 1.0f, false, true, -0.44f, -0.44f);
        p.LJIIJ(-0.11f, -0.21f, -0.11f, -0.5f, -0.11f, -1.05f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(-5.4f);
        C32856Cuy.vb(this.LIZJ);
        this.LIZJ.LJIIJ(-0.56f, 0.0f, -0.84f, 0.0f, -1.05f, -0.11f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(1.0f, 1.0f, false, true, -0.44f, -0.44f);
        this.LIZJ.LJIIJ(-0.11f, -0.21f, -0.11f, -0.5f, -0.11f, -1.06f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILL(-0.8f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIJ(0.0f, -0.56f, 0.0f, -0.84f, 0.1f, -1.05f);
        p5.LJIIIZ(1.0f, 1.0f, false, true, 0.45f, -0.44f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIJ(0.21f, -0.1f, 0.49f, -0.1f, 1.05f, -0.1f);
        C32856Cuy.y6(this.LIZJ);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIILL(-5.4f);
        this.LIZJ.LJIIJ(0.0f, -0.57f, 0.0f, -0.85f, 0.1f, -1.06f);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJIIIZ(1.0f, 1.0f, false, true, 0.45f, -0.44f);
        p9.LJIIJ(0.21f, -0.1f, 0.49f, -0.1f, 1.05f, -0.1f);
        DIJ p10 = this.LIZJ;
        o.LJIIIZ(p10, "p");
        p10.LJIIJJI(0.8f);
        p10.LJIIJ(0.56f, 0.0f, 0.84f, 0.0f, 1.05f, 0.1f);
        p10.LJIIIZ(1.0f, 1.0f, false, true, 0.44f, 0.44f);
        this.LIZJ.LJIIJ(0.11f, 0.21f, 0.11f, 0.5f, 0.11f, 1.06f);
        DIJ p11 = this.LIZJ;
        o.LJIIIZ(p11, "p");
        p11.LJIILL(5.4f);
        C32856Cuy.m0(this.LIZJ);
        DIJ p12 = this.LIZJ;
        o.LJIIIZ(p12, "p");
        p12.LJIIJ(0.56f, 0.0f, 0.84f, 0.0f, 1.05f, 0.1f);
        p12.LJIIIZ(1.0f, 1.0f, false, true, 0.44f, 0.44f);
        this.LIZJ.LJIIJ(0.11f, 0.21f, 0.11f, 0.5f, 0.11f, 1.05f);
        DIJ p13 = this.LIZJ;
        o.LJIIIZ(p13, "p");
        p13.LJIILL(0.8f);
        C32856Cuy.yi(this.LIZJ);
        C32856Cuy.C6(this.LIZJ);
        DIJ p14 = this.LIZJ;
        o.LJIIIZ(p14, "p");
        p14.LJIILL(5.4f);
        C32856Cuy.yi(this.LIZJ);
        DIJ p15 = this.LIZJ;
        o.LJIIIZ(p15, "p");
        p15.LJIIJJI(-0.8f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        C32856Cuy.Z2(dij);
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
