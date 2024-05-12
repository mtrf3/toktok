package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D8y, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33400D8y extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33400D8y() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(24.0f, 40.5f);
        this.LIZJ.LJIIIZ(16.5f, 16.5f, true, false, 0.0f, -33.0f);
        this.LIZJ.LJIIIZ(16.5f, 16.5f, false, false, 0.0f, 33.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIILIIL(4.43f, -14.54f);
        this.LIZJ.LJIIJ(-0.12f, 0.6f, -0.49f, 1.12f, -1.01f, 1.44f);
        this.LIZJ.LJIIL(-8.88f, 5.37f);
        this.LIZJ.LJIIIZ(0.65f, 0.65f, false, true, -0.98f, -0.69f);
        this.LIZJ.LJIIL(2.01f, -10.18f);
        this.LIZJ.LJIIJ(0.12f, -0.6f, 0.49f, -1.12f, 1.01f, -1.44f);
        this.LIZJ.LJIIL(8.88f, -5.37f);
        this.LIZJ.LJIIIZ(0.65f, 0.65f, false, true, 0.98f, 0.69f);
        this.LIZJ.LJIIL(-2.01f, 10.18f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.EVEN_ODD);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIILIIL(21.92f, 26.89f);
        dij.LJIIL(3.4f, -2.05f);
        dij.LJIIL(0.76f, -3.9f);
        dij.LJIIL(-3.4f, 2.06f);
        dij.LJIIL(-0.76f, 3.89f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.WINDING);
        this.LIZ.add(LIZ);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
    }
}
