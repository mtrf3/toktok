package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D7r, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33367D7r extends AbstractC39455Fe7 {
    public C33367D7r() {
        this.LIZJ.LJIIIIZZ(18.95f, 32.37f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(6.98f);
        this.LIZJ.LJIIIZ(5.62f, 5.62f, false, false, 2.71f, 4.82f);
        this.LIZJ.LJIIJ(1.58f, 0.95f, 3.37f, 0.02f, 4.11f, -1.67f);
        this.LIZJ.LJII(33.0f, 29.0f);
        C32856Cuy.e(this.LIZJ);
        C32856Cuy.LLJJIJI(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJI(11.34f);
        this.LIZJ.LJIIIZ(3.73f, 3.73f, false, false, -3.73f, 3.18f);
        this.LIZJ.LJII(5.04f, 27.56f);
        this.LIZJ.LJIIIZ(3.76f, 3.76f, false, false, 3.73f, 4.3f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(9.68f);
        C32856Cuy.Fm(this.LIZJ);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(36.5f, 29.07f);
        C32856Cuy.LLJJJ(this.LIZJ);
        C32856Cuy.e(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJ(0.0f, -0.27f, 0.22f, -0.5f, 0.5f, -0.5f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIJJI(3.3f);
        this.LIZJ.LJIIIZ(4.2f, 4.2f, false, true, 4.2f, 3.7f);
        this.LIZJ.LJIILL(14.96f);
        this.LIZJ.LJIIJ(-0.28f, 2.15f, -2.1f, 3.95f, -4.2f, 3.9f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIJJI(-3.3f);
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
