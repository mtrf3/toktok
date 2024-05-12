package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DBT extends AbstractC39455Fe7 {
    public DBT() {
        this.LIZJ.LJIIIIZZ(2.18f, 7.17f);
        this.LIZJ.LIZJ(2.0f, 2.0f, false, true, 4.0f, 6.0f);
        C32856Cuy.LJJIJIIJI(this.LIZJ);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, 1.74f, 3.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIL(-20.0f, 35.0f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, -3.65f, -0.4f);
        this.LIZJ.LJII(16.22f, 25.0f);
        this.LIZJ.LJII(2.49f, 9.32f);
        this.LIZJ.LJIIIZ(2.0f, 2.0f, false, true, -0.31f, -2.15f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(18.2f, 17.72f);
        this.LIZJ.LJIIL(4.15f, 13.15f);
        this.LIZJ.LJII(40.55f, 10.0f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJI(8.41f);
        this.LIZJ.LJIIL(9.98f, 11.41f);
        this.LIZJ.LJIIL(11.71f, -7.2f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 1.38f, 0.32f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIL(1.04f, 1.7f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, -0.32f, 1.38f);
        this.LIZJ.LJII(20.38f, 24.9f);
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
