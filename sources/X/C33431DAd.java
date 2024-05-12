package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DAd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33431DAd extends AbstractC39455Fe7 {
    public C33431DAd() {
        this.LIZJ.LJIIIIZZ(41.0f, 7.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        p.LJIILL(2.0f);
        p.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        p.LJI(7.0f);
        p.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIJ(8.0f);
        p2.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        C40084FoG.LJ(this.LIZJ, "p", 34.0f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIIZZ(41.0f, 17.0f);
        p3.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILL(2.0f);
        p4.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        p4.LJI(19.0f);
        p4.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        p4.LJIILL(-2.0f);
        p4.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        p4.LJIIJJI(22.0f);
        p4.LIZLLL();
        this.LIZJ.LJIIIIZZ(41.0f, 37.0f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        p5.LJIILL(2.0f);
        p5.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        p5.LJI(19.0f);
        p5.LJIIIZ(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        p5.LJIILL(-2.0f);
        p5.LJIIIZ(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        p5.LJIIJJI(22.0f);
        p5.LIZLLL();
        this.LIZJ.LJIIIIZZ(42.0f, 28.0f);
        C32856Cuy.j3(this.LIZJ);
        DIJ p6 = this.LIZJ;
        o.LJIIIZ(p6, "p");
        p6.LJIILL(2.0f);
        p6.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, 1.0f);
        p6.LJIIJJI(34.0f);
        p6.LJIIIZ(1.0f, 1.0f, false, false, 1.0f, -1.0f);
        p6.LJIILL(-2.0f);
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
