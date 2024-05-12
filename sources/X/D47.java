package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D47 extends AbstractC39455Fe7 {
    public D47() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(8.0f, 11.0f);
        C32856Cuy.Yg(this.LIZJ);
        C32856Cuy.V7(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(35.0f);
        C32856Cuy.yn(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJI(13.5f);
        this.LIZJ.LIZJ(5.5f, 5.5f, false, true, 8.0f, 36.5f);
        C32856Cuy.LLZLL(this.LIZJ);
        this.LIZJ.LJIILIIL(2.0f, 21.26f);
        this.LIZJ.LIZJ(5.48f, 5.48f, false, true, 13.5f, 31.0f);
        C32856Cuy.O6(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIJ(7.0f);
        p4.LJI(14.0f);
        C32856Cuy.rj(this.LIZJ);
        this.LIZJ.LJIILL(21.26f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(37.0f, 33.0f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJI(13.5f);
        this.LIZJ.LJIIIZ(3.5f, 3.5f, true, false, 0.0f, 7.0f);
        C32856Cuy.O6(this.LIZJ);
        C78269Unh.LIZJ(this.LIZJ, "p", -7.0f);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
