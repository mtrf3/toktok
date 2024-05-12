package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D9I extends AbstractC39455Fe7 {
    public D9I() {
        this.LIZJ.LJIIIIZZ(43.08f, 13.5f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJ(0.0f, -0.55f, -0.43f, -1.0f, -0.98f, -1.0f);
        C32856Cuy.B6(this.LIZJ);
        this.LIZJ.LIZJ(6.86f, 6.86f, false, false, 18.6f, 8.0f);
        this.LIZJ.LJIIIZ(6.86f, 6.86f, false, false, -6.4f, 4.5f);
        C32856Cuy.tm(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(7.3f);
        C32856Cuy.LLLZIL(this.LIZJ);
        this.LIZJ.LJIIJJI(17.1f);
        C32856Cuy.He(this.LIZJ);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(34.8f, 35.5f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(7.3f);
        C32856Cuy.He(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIJ(0.0f, -0.55f, -0.43f, -1.0f, -0.98f, -1.0f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIJJI(-7.3f);
        this.LIZJ.LJIIIZ(6.86f, 6.86f, false, false, -6.4f, -4.5f);
        this.LIZJ.LJIIIZ(6.86f, 6.86f, false, false, -6.4f, 4.5f);
        C32856Cuy.tm(this.LIZJ);
        C32856Cuy.y6(this.LIZJ);
        C32856Cuy.LLLZIL(this.LIZJ);
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
