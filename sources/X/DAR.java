package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DAR extends AbstractC39455Fe7 {
    public DAR() {
        this.LIZJ.LJIIIIZZ(25.71f, 13.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(7.0f, 7.0f, false, false, -13.42f, 0.0f);
        p.LJI(5.14f);
        this.LIZJ.LJ(4.51f, 13.0f, 4.0f, 13.45f, 4.0f, 14.0f);
        C32856Cuy.cd(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(7.15f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(7.0f, 7.0f, false, false, 13.42f, 0.0f);
        this.LIZJ.LJIIJJI(17.15f);
        C32856Cuy.b9(this.LIZJ);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJI(25.7f);
        this.LIZJ.LIZLLL();
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIIIZZ(22.0f, 15.0f);
        C32856Cuy.rh(this.LIZJ);
        this.LIZJ.LJIILIIL(13.71f, 16.0f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIIZ(7.0f, 7.0f, false, false, -13.42f, 0.0f);
        p6.LJI(5.14f);
        this.LIZJ.LJ(4.51f, 31.0f, 4.0f, 31.45f, 4.0f, 32.0f);
        C32856Cuy.cd(this.LIZJ);
        this.LIZJ.LJI(22.3f);
        DIJ p7 = this.LIZJ;
        o.LJIIIZ(p7, "p");
        p7.LJIIIZ(7.0f, 7.0f, false, false, 13.42f, 0.0f);
        DIJ p9 = this.LIZJ;
        o.LJIIIZ(p9, "p");
        p9.LJIIJJI(7.15f);
        C32856Cuy.b9(this.LIZJ);
        this.LIZJ.LJI(35.7f);
        this.LIZJ.LIZLLL();
        DIJ p10 = this.LIZJ;
        o.LJIIIZ(p10, "p");
        p10.LJIIIIZZ(32.0f, 33.0f);
        C32856Cuy.rh(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
