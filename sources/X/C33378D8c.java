package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D8c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33378D8c extends AbstractC39455Fe7 {
    public C33378D8c() {
        this.LIZJ.LJIIIIZZ(21.9f, 7.38f);
        this.LIZJ.LJIILL(19.86f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(-6.73f, -6.73f);
        C32856Cuy.Ge(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIL(-1.73f, 1.73f);
        this.LIZJ.LJIIIZ(0.88f, 0.88f, false, false, 0.0f, 1.24f);
        this.LIZJ.LJIIL(11.18f, 11.18f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJ(0.34f, 0.35f, 0.9f, 0.35f, 1.24f, 0.0f);
        this.LIZJ.LJII(35.8f, 23.48f);
        this.LIZJ.LJIIIZ(0.88f, 0.88f, false, false, 0.0f, -1.24f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIL(-1.73f, -1.73f);
        C32856Cuy.Ge(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIL(-6.73f, 6.73f);
        this.LIZJ.LJIJ(7.38f);
        this.LIZJ.LJIIJ(0.0f, -0.49f, -0.4f, -0.88f, -0.87f, -0.88f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIJJI(-2.45f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIIJ(-0.49f, 0.0f, -0.88f, 0.4f, -0.88f, 0.88f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(10.88f, 37.13f);
        this.LIZJ.LJIIJ(-0.49f, 0.0f, -0.88f, 0.39f, -0.88f, 0.87f);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJIILL(2.63f);
        this.LIZJ.LJIIJ(0.0f, 0.48f, 0.4f, 0.87f, 0.88f, 0.87f);
        this.LIZJ.LJIIJJI(26.24f);
        this.LIZJ.LJIIJ(0.49f, 0.0f, 0.88f, -0.4f, 0.88f, -0.87f);
        C32856Cuy.L9(this.LIZJ);
        DIJ p10 = this.LIZJ;
        o.LJIIIZ(p10, "p");
        p10.LJIIJ(0.0f, -0.48f, -0.4f, -0.87f, -0.88f, -0.87f);
        this.LIZJ.LJI(10.89f);
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
