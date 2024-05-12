package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DBb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33455DBb extends AbstractC39455Fe7 {
    public C33455DBb() {
        this.LIZJ.LJIIIIZZ(41.7f, 15.66f);
        this.LIZJ.LJIILL(-5.41f);
        this.LIZJ.LJII(35.0f, 13.67f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIILL(-0.2f);
        this.LIZJ.LJ(35.0f, 11.3f, 33.41f, 10.0f, 31.11f, 10.0f);
        this.LIZJ.LJI(9.89f);
        this.LIZJ.LJ(7.47f, 10.0f, 6.0f, 11.3f, 6.0f, 13.46f);
        this.LIZJ.LJIILL(5.47f);
        this.LIZJ.LJIIL(9.37f, 4.72f);
        this.LIZJ.LJII(6.0f, 28.4f);
        this.LIZJ.LJIILL(5.46f);
        this.LIZJ.LJ(6.0f, 36.0f, 7.47f, 37.3f, 9.9f, 37.3f);
        this.LIZJ.LJIIJJI(21.2f);
        this.LIZJ.LJIIJ(2.3f, 0.0f, 3.9f, -1.3f, 3.9f, -3.42f);
        this.LIZJ.LJIILL(-0.28f);
        this.LIZJ.LJIIL(6.7f, 3.46f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIILL(-5.5f);
        this.LIZJ.LJIIL(-15.57f, -7.9f);
        this.LIZJ.LJIIL(15.56f, -7.99f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(20.72f, 26.34f);
        this.LIZJ.LJIIL(11.5f, 5.86f);
        this.LIZJ.LJI(9.19f);
        this.LIZJ.LJIIL(11.55f, -5.86f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(11.42f, -11.25f);
        this.LIZJ.LJIIL(-11.42f, 5.83f);
        this.LIZJ.LJIIL(-11.55f, -5.83f);
        this.LIZJ.LJIIJJI(22.97f);
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
