package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D5r, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33315D5r extends AbstractC39455Fe7 {
    public C33315D5r() {
        this.LIZJ.LJIILIIL(17.74f, 15.5f);
        this.LIZJ.LJIIL(0.68f, -6.6f);
        C32856Cuy.ui(this.LIZJ);
        C32856Cuy.Gb(this.LIZJ);
        this.LIZJ.LJIIL(0.68f, -6.6f);
        C32856Cuy.ui(this.LIZJ);
        C32856Cuy.Cd(this.LIZJ);
        this.LIZJ.LJIIJJI(-5.54f);
        this.LIZJ.LJIIL(-0.8f, 8.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJI(36.0f);
        p.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        C32856Cuy.bl(this.LIZJ);
        this.LIZJ.LJIIJJI(-5.64f);
        C32856Cuy.Fh(this.LIZJ);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIJJI(-7.98f);
        C32856Cuy.Fh(this.LIZJ);
        C32856Cuy.Mb(this.LIZJ);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIJJI(5.64f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIL(0.8f, -8.0f);
        C32856Cuy.K4(this.LIZJ);
        C32856Cuy.Ij(this.LIZJ);
        this.LIZJ.LJIIJJI(5.74f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(2.72f, 3.0f);
        this.LIZJ.LJIIL(-0.8f, 8.0f);
        C32856Cuy.Gb(this.LIZJ);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIL(0.8f, -8.0f);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIIJJI(-7.98f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.EVEN_ODD);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
