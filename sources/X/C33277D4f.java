package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D4f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33277D4f extends AbstractC39455Fe7 {
    public C33277D4f() {
        this.LIZJ.LJIIIIZZ(30.05f, 15.69f);
        C32856Cuy.LJJZZI(this.LIZJ);
        this.LIZJ.LJIIIZ(5.62f, 5.62f, false, false, -2.71f, -4.8f);
        this.LIZJ.LJIIJ(-1.58f, -0.96f, -3.37f, -0.03f, -4.11f, 1.66f);
        this.LIZJ.LJII(16.0f, 19.05f);
        C32856Cuy.LJLJLLL(this.LIZJ);
        C32856Cuy.Z4(this.LIZJ);
        this.LIZJ.LJIIJJI(21.16f);
        this.LIZJ.LJIIIZ(3.73f, 3.73f, false, false, 3.73f, -3.18f);
        this.LIZJ.LJIIL(2.57f, -17.88f);
        this.LIZJ.LJIIIZ(3.76f, 3.76f, false, false, -3.73f, -4.3f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(-9.68f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(0.5f, 0.5f, false, true, -0.5f, -0.5f);
        p2.LIZLLL();
        this.LIZJ.LJIIIIZZ(12.5f, 18.98f);
        C32856Cuy.Fm(this.LIZJ);
        this.LIZJ.LJIILL(21.57f);
        C32856Cuy.C5(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJI(9.2f);
        this.LIZJ.LJIIIZ(4.2f, 4.2f, false, true, -4.2f, -3.7f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIJ(22.9f);
        this.LIZJ.LJIIJ(0.28f, -2.15f, 2.1f, -3.94f, 4.2f, -3.9f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIJJI(3.3f);
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
