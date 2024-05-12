package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DBg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33460DBg extends AbstractC39455Fe7 {
    public C33460DBg() {
        this.LIZJ.LJIIIIZZ(2.63f, 7.38f);
        this.LIZJ.LIZJ(1.5f, 1.5f, false, true, 4.0f, 6.5f);
        C32856Cuy.LJJIJIIJI(this.LIZJ);
        this.LIZJ.LJIIIZ(1.5f, 1.5f, false, true, 1.3f, 2.24f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(-20.0f, 35.0f);
        this.LIZJ.LJIIIZ(1.5f, 1.5f, false, true, -2.73f, -0.29f);
        this.LIZJ.LJIIL(-5.9f, -18.7f);
        this.LIZJ.LJII(2.86f, 9.0f);
        this.LIZJ.LJIIIZ(1.5f, 1.5f, false, true, -0.24f, -1.61f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(17.15f, 17.28f);
        this.LIZJ.LJIIL(4.62f, 14.62f);
        this.LIZJ.LJII(41.42f, 9.5f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJI(7.3f);
        this.LIZJ.LJIIL(10.98f, 12.56f);
        this.LIZJ.LJIIL(12.5f, -7.7f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(0.5f, 0.5f, false, true, 0.69f, 0.17f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIL(1.04f, 1.7f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIIZ(0.5f, 0.5f, false, true, -0.16f, 0.7f);
        this.LIZJ.LJIIL(-12.58f, 7.73f);
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
