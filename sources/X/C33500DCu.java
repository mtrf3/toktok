package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DCu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33500DCu extends AbstractC39455Fe7 {
    public C33500DCu() {
        this.LIZJ.LJIIIIZZ(5.08f, 10.65f);
        this.LIZJ.LJIIJ(0.14f, -0.31f, 0.44f, -0.5f, 0.78f, -0.5f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(34.28f);
        this.LIZJ.LJIIIZ(0.86f, 0.86f, false, true, 0.75f, 1.28f);
        this.LIZJ.LJIIL(-17.15f, 30.0f);
        this.LIZJ.LJIIIZ(0.86f, 0.86f, false, true, -1.56f, -0.17f);
        this.LIZJ.LJII(17.1f, 25.14f);
        this.LIZJ.LJII(5.21f, 11.56f);
        this.LIZJ.LJIIIZ(0.86f, 0.86f, false, true, -0.13f, -0.91f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(13.8f, 14.44f);
        this.LIZJ.LJIIL(4.35f, 13.78f);
        this.LIZJ.LJIIL(15.44f, -27.01f);
        this.LIZJ.LJI(7.75f);
        this.LIZJ.LJII(18.03f, 23.6f);
        this.LIZJ.LJIIL(10.95f, -6.74f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(0.5f, 0.5f, false, true, 0.69f, 0.17f);
        this.LIZJ.LJIIL(0.37f, 0.6f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(0.5f, 0.5f, false, true, -0.16f, 0.7f);
        this.LIZJ.LJIIL(-11.0f, 6.76f);
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
