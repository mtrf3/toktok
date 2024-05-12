package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DAp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33443DAp extends AbstractC39455Fe7 {
    public C33443DAp() {
        this.LIZJ.LJIIIIZZ(40.7f, 20.14f);
        this.LIZJ.LJIIJ(0.72f, 0.0f, 1.3f, 0.58f, 1.3f, 1.29f);
        C32856Cuy.h3(this.LIZJ);
        this.LIZJ.LIZJ(1.3f, 1.3f, false, true, 6.0f, 26.57f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(-5.14f);
        this.LIZJ.LJIIJ(0.0f, -0.71f, 0.58f, -1.29f, 1.3f, -1.29f);
        this.LIZJ.LJIIJJI(33.4f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(40.63f, 6.0f);
        this.LIZJ.LJIIJ(0.72f, 0.0f, 1.37f, 0.58f, 1.37f, 1.29f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(5.14f);
        this.LIZJ.LJIIJ(0.0f, 0.7f, -0.65f, 1.28f, -1.37f, 1.28f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJI(7.3f);
        this.LIZJ.LIZJ(1.3f, 1.3f, false, true, 6.0f, 12.43f);
        this.LIZJ.LJIJ(7.29f);
        this.LIZJ.LJ(6.0f, 6.58f, 6.58f, 6.0f, 7.3f, 6.0f);
        this.LIZJ.LJIIJJI(33.33f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(26.44f, 34.29f);
        this.LIZJ.LJIIJ(0.72f, 0.0f, 1.3f, 0.57f, 1.3f, 1.28f);
        C32856Cuy.h3(this.LIZJ);
        this.LIZJ.LIZJ(1.3f, 1.3f, false, true, 6.0f, 40.71f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIILL(-5.14f);
        this.LIZJ.LJIIJ(0.0f, -0.7f, 0.58f, -1.28f, 1.3f, -1.28f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIJJI(19.14f);
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
