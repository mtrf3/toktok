package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D4i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33280D4i extends AbstractC39455Fe7 {
    public C33280D4i() {
        this.LIZJ.LJIILIIL(17.94f, 16.5f);
        this.LIZJ.LJIIL(0.5f, -8.56f);
        C32856Cuy.xe(this.LIZJ);
        C32856Cuy.F0(this.LIZJ);
        this.LIZJ.LJIIL(0.5f, -8.56f);
        C32856Cuy.xe(this.LIZJ);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJI(38.0f);
        p.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        C32856Cuy.bl(this.LIZJ);
        this.LIZJ.LJIIJJI(-7.23f);
        this.LIZJ.LJIIL(-0.47f, 8.0f);
        C32856Cuy.Cd(this.LIZJ);
        this.LIZJ.LJIIJJI(-6.88f);
        C32856Cuy.Ag(this.LIZJ);
        C32856Cuy.LJIIIIZZ(this.LIZJ);
        C32856Cuy.Ag(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJI(10.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        C32856Cuy.Ij(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(7.3f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIL(0.46f, -8.0f);
        C32856Cuy.Mb(this.LIZJ);
        this.LIZJ.LJIIJJI(6.94f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(2.83f, 3.0f);
        this.LIZJ.LJIIL(-0.47f, 8.0f);
        C32856Cuy.F0(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIL(0.46f, -8.0f);
        C32856Cuy.X(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
