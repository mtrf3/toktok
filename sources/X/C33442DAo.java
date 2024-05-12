package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DAo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33442DAo extends AbstractC39455Fe7 {
    public C33442DAo() {
        this.LIZJ.LJIIIIZZ(46.0f, 24.13f);
        this.LIZJ.LIZJ(22.07f, 22.07f, false, false, 24.0f, 2.0f);
        this.LIZJ.LJ(11.85f, 2.0f, 2.0f, 11.91f, 2.0f, 24.13f);
        this.LIZJ.LIZJ(22.1f, 22.1f, false, false, 20.56f, 46.0f);
        this.LIZJ.LJIJ(30.53f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(-5.58f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(-6.4f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(5.58f);
        this.LIZJ.LJIILL(-4.87f);
        this.LIZJ.LJIIJ(0.0f, -5.55f, 3.29f, -8.61f, 8.31f, -8.61f);
        this.LIZJ.LJIIJ(2.4f, 0.0f, 4.93f, 0.43f, 4.93f, 0.43f);
        this.LIZJ.LJIILL(5.45f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJJI(-2.78f);
        this.LIZJ.LJIIJ(-2.73f, 0.0f, -3.58f, 1.7f, -3.58f, 3.45f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIILL(4.15f);
        C32856Cuy.o0(this.LIZJ);
        this.LIZJ.LJIIL(-0.98f, 6.4f);
        this.LIZJ.LJIIJJI(-5.12f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIJ(46.0f);
        this.LIZJ.LIZJ(22.1f, 22.1f, false, false, 46.0f, 24.13f);
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
