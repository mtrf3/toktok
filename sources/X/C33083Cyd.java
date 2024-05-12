package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cyd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33083Cyd extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33083Cyd() {
        this.LIZJ.LJIILIIL(14.45f, 19.18f);
        this.LIZJ.LJIIL(-5.3f, 5.3f);
        this.LIZJ.LIZJ(10.0f, 10.0f, true, false, 23.3f, 38.64f);
        C32856Cuy.ai(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(-0.7f, -0.71f);
        C32856Cuy.A5(this.LIZJ);
        this.LIZJ.LJIIL(-5.31f, 5.3f);
        this.LIZJ.LIZJ(8.0f, 8.0f, true, true, 10.56f, 25.9f);
        C32856Cuy.ai(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIL(-0.7f, -0.7f);
        C32856Cuy.A5(this.LIZJ);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(33.55f, 28.37f);
        C32856Cuy.LLJJJIL(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIL(-0.7f, -0.7f);
        C32856Cuy.LLJJIJIL(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIL(5.3f, -5.3f);
        this.LIZJ.LJIIIZ(8.0f, 8.0f, false, false, -11.32f, -11.32f);
        C32856Cuy.Ng(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIL(-0.72f, -0.7f);
        p5.LJIIIZ(0.5f, 0.5f, false, true, 0.0f, -0.7f);
        this.LIZJ.LJIIL(5.3f, -5.31f);
        this.LIZJ.LJIIIZ(10.0f, 10.0f, true, true, 14.15f, 14.14f);
        Q7L.LIZLLL(this.LIZJ, "p", -5.3f, 5.3f);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(17.99f, 28.37f);
        C32856Cuy.LLJJIII(dij);
        dij.LJIIL(0.7f, 0.7f);
        dij.LJIIJ(0.2f, 0.2f, 0.52f, 0.2f, 0.71f, 0.0f);
        dij.LJIIL(10.61f, -10.6f);
        C32856Cuy.d2(dij);
        dij.LJIIL(-10.61f, 10.6f);
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
