package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D0f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33173D0f extends AbstractC39455Fe7 {
    public C33173D0f() {
        C32856Cuy.d8(this.LIZJ);
        this.LIZJ.LJIIIIZZ(46.0f, 45.0f);
        C32856Cuy.p3(this.LIZJ);
        C32856Cuy.LJLJJI(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(4.0f, 4.0f, false, false, 4.0f, 4.0f);
        p.LJIIJJI(24.0f);
        p.LJIIIZ(4.0f, 4.0f, false, false, 4.0f, -4.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIJ(49.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(4.0f, 4.0f, false, false, -4.0f, -4.0f);
        p3.LJIIJJI(-4.0f);
        C32856Cuy.LJJLJLI(this.LIZJ);
        this.LIZJ.LJIIIZ(8.0f, 8.0f, true, false, -16.0f, 0.0f);
        C78269Unh.LIZJ(this.LIZJ, "p", 4.0f);
        this.LIZJ.LJIILIIL(-4.0f, 3.0f);
        C32856Cuy.V7(this.LIZJ);
        C32856Cuy.LJLJJI(this.LIZJ);
        C32856Cuy.yn(this.LIZJ);
        C32856Cuy.T6(this.LIZJ);
        C32856Cuy.xn(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIJ(49.0f);
        C32856Cuy.Wl(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIILIIL(7.0f, -3.0f);
        C32856Cuy.LJJLJLI(this.LIZJ);
        this.LIZJ.LJIIIZ(5.0f, 5.0f, false, true, 10.0f, 0.0f);
        C32856Cuy.C1(this.LIZJ);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJI(49.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(72.0f, 72.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
