package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D8j, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33385D8j extends AbstractC39455Fe7 {
    public C33385D8j() {
        C32856Cuy.rl(this.LIZJ);
        this.LIZJ.LJIIIIZZ(3.89f, 16.02f);
        this.LIZJ.LJIIIZ(2.5f, 2.5f, false, false, -1.3f, 4.83f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(3.87f, 1.04f);
        this.LIZJ.LJIIIZ(2.5f, 2.5f, true, false, 1.3f, -4.83f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIL(-3.87f, -1.04f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(0.83f, 30.21f);
        this.LIZJ.LJIIIZ(2.5f, 2.5f, false, true, 1.76f, -3.06f);
        this.LIZJ.LJIIL(3.87f, -1.04f);
        this.LIZJ.LJIIIZ(2.5f, 2.5f, false, true, 1.3f, 4.83f);
        this.LIZJ.LJIIL(-3.87f, 1.04f);
        this.LIZJ.LIZJ(2.5f, 2.5f, false, true, 0.83f, 30.2f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(7.04f, 37.43f);
        this.LIZJ.LJIIIZ(2.5f, 2.5f, true, false, 3.53f, 3.54f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIL(2.83f, -2.83f);
        this.LIZJ.LJIIIZ(2.5f, 2.5f, true, false, -3.54f, -3.54f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIL(-2.82f, 2.83f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(17.8f, 47.17f);
        this.LIZJ.LJIIIZ(2.5f, 2.5f, false, true, -1.78f, -3.06f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIL(1.04f, -3.86f);
        this.LIZJ.LJIIIZ(2.5f, 2.5f, false, true, 4.83f, 1.3f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIL(-1.04f, 3.86f);
        this.LIZJ.LJIIIZ(2.5f, 2.5f, false, true, -3.06f, 1.76f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(27.15f, 45.4f);
        this.LIZJ.LJIIIZ(2.5f, 2.5f, false, false, 4.83f, -1.29f);
        this.LIZJ.LJIIL(-1.04f, -3.86f);
        this.LIZJ.LJIIIZ(2.5f, 2.5f, false, false, -4.83f, 1.3f);
        this.LIZJ.LJIIL(1.04f, 3.86f);
        this.LIZJ.LIZLLL();
        C32856Cuy.ql(this.LIZJ);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIIIIZZ(33.0f, 25.73f);
        p7.LJIIIZ(2.0f, 2.0f, false, false, 0.0f, -3.46f);
        p7.LJIIL(-12.0f, -6.93f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, false, -2.46f, 0.37f);
        this.LIZJ.LJII(7.74f, 4.9f);
        C32856Cuy.yk(this.LIZJ);
        this.LIZJ.LJII(4.91f, 6.32f);
        C32856Cuy.Ik(this.LIZJ);
        this.LIZJ.LJIIL(35.35f, 35.35f);
        C32856Cuy.xd(this.LIZJ);
        this.LIZJ.LJIIL(-12.9f, -12.9f);
        this.LIZJ.LJII(33.0f, 25.73f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(18.0f, 30.93f);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJIILL(-5.1f);
        this.LIZJ.LJIIL(5.43f, 5.43f);
        this.LIZJ.LJIIL(-2.43f, 1.4f);
        DIJ p10 = this.LIZJ;
        o.LJIIIZ(p10, "p");
        p10.LJIIIZ(2.0f, 2.0f, false, true, -3.0f, -1.73f);
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
