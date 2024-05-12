package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D2f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33225D2f extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33225D2f() {
        this.LIZJ.LJIIIIZZ(0.54f, 24.0f);
        C32856Cuy.LLLLLLLZIL(this.LIZJ);
        this.LIZJ.LJIIIZ(21.0f, 21.0f, true, true, 7.43f, 16.03f);
        this.LIZJ.LJIIIZ(0.96f, 0.96f, false, true, -0.04f, -1.42f);
        C32856Cuy.u(this.LIZJ);
        this.LIZJ.LJIIJ(0.38f, -0.38f, 0.99f, -0.39f, 1.4f, -0.05f);
        this.LIZJ.LIZJ(16.0f, 16.0f, true, false, 10.0f, 24.0f);
        this.LIZJ.LJIIJJI(4.46f);
        this.LIZJ.LJIIIZ(0.5f, 0.5f, false, true, 0.39f, 0.81f);
        this.LIZJ.LJIIL(-6.57f, 8.21f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(1.0f, 1.0f, false, true, -1.56f, 0.0f);
        this.LIZJ.LJIIL(-6.57f, -8.2f);
        this.LIZJ.LIZJ(0.5f, 0.5f, false, true, 0.54f, 24.0f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(33.12f, 23.02f);
        dij.LJIIJ(0.75f, 0.44f, 0.75f, 1.52f, 0.0f, 1.95f);
        dij.LJIIL(-10.68f, 6.17f);
        dij.LJIIJ(-0.75f, 0.44f, -1.69f, -0.1f, -1.69f, -0.97f);
        dij.LJIJ(17.83f);
        C32856Cuy.km(dij);
        dij.LJIIZILJ(Path.FillType.WINDING);
        this.LIZ.add(LIZ);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(52.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
    }
}
