package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D6l, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33335D6l extends AbstractC39455Fe7 {
    public C33335D6l() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(8.0f, 7.0f);
        C32856Cuy.Q4(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(34.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(5.0f, 5.0f, false, true, -5.0f, 5.0f);
        p3.LJI(13.0f);
        p3.LJIIIZ(5.0f, 5.0f, false, true, -5.0f, -5.0f);
        C32856Cuy.R9(this.LIZJ);
        C32856Cuy.Kn(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILL(34.0f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        p5.LJIIJJI(22.0f);
        p5.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIJ(7.0f);
        p6.LJIIIZ(1.0f, 1.0f, false, false, -1.0f, -1.0f);
        C32856Cuy.LLLLIILLL(this.LIZJ);
        this.LIZJ.LJIILIIL(5.0f, 4.0f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        p7.LJIIJJI(10.0f);
        p7.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        p7.LJIILL(2.0f);
        p7.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        p7.LJI(19.0f);
        p7.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        p7.LJIILL(-2.0f);
        p7.LIZLLL();
        this.LIZJ.LJIILIIL(6.0f, 29.0f);
        C32856Cuy.hk(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
