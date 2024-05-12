package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D5q, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33314D5q extends AbstractC39455Fe7 {
    public C33314D5q() {
        C32856Cuy.s7(this.LIZJ);
        this.LIZJ.LJIIJ(4.06f, 0.0f, 7.76f, 1.5f, 10.58f, 4.0f);
        C32856Cuy.Fg(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        p.LJIJ(4.0f);
        p.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        p.LJIIJJI(-2.0f);
        p.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, 1.0f);
        this.LIZJ.LJIILL(4.8f);
        this.LIZJ.LIZJ(20.0f, 20.0f, false, false, 4.14f, 26.34f);
        this.LIZJ.LJIIJ(0.06f, 0.55f, 0.58f, 0.92f, 1.12f, 0.83f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIL(1.98f, -0.34f);
        this.LIZJ.LJIIJ(0.54f, -0.09f, 0.9f, -0.6f, 0.85f, -1.15f);
        this.LIZJ.LIZJ(16.0f, 16.0f, false, true, 24.0f, 8.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(16.0f, 16.0f);
        this.LIZJ.LJIIJ(0.0f, -0.57f, -0.03f, -1.13f, -0.09f, -1.68f);
        this.LIZJ.LJIIJ(-0.05f, -0.55f, 0.31f, -1.06f, 0.85f, -1.15f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIL(1.98f, -0.34f);
        this.LIZJ.LJIIIZ(0.96f, 0.96f, false, true, 1.12f, 0.83f);
        this.LIZJ.LIZJ(20.0f, 20.0f, false, true, 11.0f, 39.2f);
        C32856Cuy.O(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJI(8.0f);
        p4.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        C32856Cuy.G9(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        p5.LJIIJJI(11.0f);
        p5.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        p5.LJIILL(2.0f);
        p5.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIJJI(-5.58f);
        this.LIZJ.LIZJ(16.0f, 16.0f, false, false, 40.0f, 24.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
