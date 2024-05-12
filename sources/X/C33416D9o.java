package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D9o, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33416D9o extends AbstractC39455Fe7 {
    public C33416D9o() {
        this.LIZJ.LJIIIIZZ(20.14f, 7.3f);
        C32856Cuy.A3(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJ(0.71f, 0.0f, 1.29f, 0.58f, 1.29f, 1.3f);
        this.LIZJ.LJIILL(32.4f);
        C32856Cuy.a2(this.LIZJ);
        this.LIZJ.LJIIIZ(1.3f, 1.3f, false, true, -1.29f, -1.3f);
        this.LIZJ.LJIJ(7.3f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(6.0f, 16.37f);
        C32856Cuy.A3(this.LIZJ);
        this.LIZJ.LJIIJ(0.7f, 0.0f, 1.28f, 0.58f, 1.28f, 1.3f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIJ(39.7f);
        this.LIZJ.LJIIJ(0.0f, 0.72f, -0.57f, 1.3f, -1.28f, 1.3f);
        this.LIZJ.LJI(7.29f);
        this.LIZJ.LIZJ(1.3f, 1.3f, false, true, 6.0f, 39.7f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIJ(16.37f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(34.29f, 21.56f);
        this.LIZJ.LJIIJ(0.0f, -0.72f, 0.57f, -1.3f, 1.28f, -1.3f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJJI(5.14f);
        p4.LJIIJ(0.71f, 0.0f, 1.29f, 0.58f, 1.29f, 1.3f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIJ(39.7f);
        C32856Cuy.a2(this.LIZJ);
        this.LIZJ.LJIIIZ(1.3f, 1.3f, false, true, -1.28f, -1.3f);
        this.LIZJ.LJIJ(21.56f);
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
