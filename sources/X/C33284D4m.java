package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D4m, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33284D4m extends AbstractC39455Fe7 {
    public C33284D4m() {
        this.LIZJ.LJIIIIZZ(22.7f, 2.44f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, 2.63f, 0.0f);
        this.LIZJ.LJIIL(19.63f, 17.05f);
        this.LIZJ.LIZJ(2.0f, 2.0f, false, true, 43.65f, 23.0f);
        C32856Cuy.K6(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, 1.0f);
        p.LJIILL(6.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(2.0f, 2.0f, false, true, -2.0f, 2.0f);
        p2.LJI(18.0f);
        p2.LJIIIZ(2.0f, 2.0f, false, true, -2.0f, -2.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIILL(-6.0f);
        p3.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        this.LIZJ.LJI(4.36f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, -1.31f, -3.51f);
        this.LIZJ.LJII(22.7f, 2.44f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(9.24f, 19.0f);
        C32856Cuy.u6(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIZ(2.0f, 2.0f, false, true, 2.0f, 2.0f);
        p4.LJIILL(6.0f);
        p4.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        C32856Cuy.Dd(this.LIZJ);
        C32856Cuy.x(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIJJI(8.37f);
        this.LIZJ.LJII(24.62f, 7.25f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, false, -1.29f, 0.0f);
        this.LIZJ.LJII(9.23f, 19.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(16.0f, 36.0f);
        C32856Cuy.N0(this.LIZJ);
        this.LIZJ.LJIIIIZZ(17.0f, 42.0f);
        C32856Cuy.aj(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
