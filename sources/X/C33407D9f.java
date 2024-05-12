package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D9f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33407D9f extends AbstractC39455Fe7 {
    public C33407D9f() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(34.0f, 6.0f);
        this.LIZJ.LJIILL(28.17f);
        C32856Cuy.ee(this.LIZJ);
        this.LIZJ.LJII(38.0f, 34.17f);
        C32856Cuy.bb(this.LIZJ);
        C32856Cuy.j4(this.LIZJ);
        C32856Cuy.kf(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(23.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        p2.LJIILL(-2.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        p2.LJI(5.0f);
        p2.LIZLLL();
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIIZZ(4.0f, 33.0f);
        p3.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJJI(17.0f);
        p4.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIILL(2.0f);
        p5.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        p5.LJI(5.0f);
        p5.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        p5.LJIILL(-2.0f);
        p5.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
