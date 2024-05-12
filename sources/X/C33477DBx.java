package X;

import android.graphics.Canvas;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DBx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33477DBx extends AbstractC39455Fe7 {
    public C33477DBx() {
        this.LIZJ.LJIIIIZZ(25.5f, 17.0f);
        this.LIZJ.LJIIIZ(7.5f, 7.5f, true, true, -15.0f, 0.0f);
        this.LIZJ.LJIIIZ(7.5f, 7.5f, false, true, 15.0f, 0.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(7.1f, 34.8f);
        this.LIZJ.LJ(8.8f, 30.21f, 12.82f, 27.0f, 18.0f, 27.0f);
        this.LIZJ.LJIIJ(5.18f, 0.0f, 9.21f, 3.22f, 10.9f, 7.79f);
        this.LIZJ.LJIIJ(0.4f, 1.12f, -0.29f, 2.21f, -1.4f, 2.21f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(-19.0f);
        this.LIZJ.LJIIJ(-1.11f, 0.0f, -1.8f, -1.1f, -1.4f, -2.2f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(40.63f, 37.0f);
        C32856Cuy.J6(this.LIZJ);
        this.LIZJ.LJIIJ(-0.77f, -2.84f, -1.99f, -5.4f, -3.86f, -7.23f);
        this.LIZJ.LIZJ(9.41f, 9.41f, false, true, 33.0f, 28.5f);
        this.LIZJ.LJIIJ(4.24f, 0.0f, 7.54f, 2.4f, 8.91f, 6.51f);
        this.LIZJ.LJIIJ(0.34f, 1.0f, -0.37f, 1.99f, -1.28f, 1.99f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(33.0f, 26.5f);
        C32856Cuy.Xa(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
    }
}
