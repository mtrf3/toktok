package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D7e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33354D7e extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33354D7e() {
        this.LIZJ.LJIIIIZZ(19.96f, 21.64f);
        this.LIZJ.LJ(19.73f, 23.54f, 18.5f, 25.0f, 17.0f, 25.0f);
        this.LIZJ.LJIIJ(-1.66f, 0.0f, -3.0f, -1.8f, -3.0f, -4.0f);
        this.LIZJ.LJIIJ(0.0f, -0.92f, 0.23f, -1.77f, 0.62f, -2.44f);
        this.LIZJ.LJIIL(-2.75f, -1.6f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, -0.37f, -1.36f);
        this.LIZJ.LJIIL(1.0f, -1.73f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, 1.37f, -0.37f);
        this.LIZJ.LJIIL(8.66f, 5.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIZ(1.0f, 1.0f, false, true, 0.36f, 1.37f);
        this.LIZJ.LJIIL(-1.0f, 1.73f);
        DIJ p2 = this.LIZJ;
        o.LJIIIZ(p2, "p");
        p2.LJIIIZ(1.0f, 1.0f, false, true, -1.36f, 0.36f);
        this.LIZJ.LJIIL(-0.57f, -0.32f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(34.0f, 21.0f);
        this.LIZJ.LJIIJ(0.0f, 2.2f, -1.34f, 4.0f, -3.0f, 4.0f);
        this.LIZJ.LJIIJ(-1.5f, 0.0f, -2.73f, -1.46f, -2.96f, -3.36f);
        this.LIZJ.LJIIL(-0.56f, 0.32f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, -1.37f, -0.36f);
        this.LIZJ.LJIIL(-1.0f, -1.73f);
        DIJ p3 = this.LIZJ;
        o.LJIIIZ(p3, "p");
        p3.LJIIIZ(1.0f, 1.0f, false, true, 0.37f, -1.37f);
        this.LIZJ.LJIIL(8.66f, -5.0f);
        DIJ p4 = this.LIZJ;
        o.LJIIIZ(p4, "p");
        p4.LJIIIZ(1.0f, 1.0f, false, true, 1.36f, 0.37f);
        this.LIZJ.LJIIL(1.0f, 1.73f);
        DIJ p5 = this.LIZJ;
        o.LJIIIZ(p5, "p");
        p5.LJIIIZ(1.0f, 1.0f, false, true, -0.36f, 1.36f);
        this.LIZJ.LJIIL(-2.76f, 1.6f);
        this.LIZJ.LJIIJ(0.39f, 0.67f, 0.62f, 1.52f, 0.62f, 2.44f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(24.0f, 27.0f);
        this.LIZJ.LJIIJ(-4.42f, 0.0f, -8.0f, 4.24f, -8.0f, 7.0f);
        this.LIZJ.LJIIJ(0.0f, 4.0f, 16.0f, 4.0f, 16.0f, 0.0f);
        this.LIZJ.LJIIJ(0.0f, -2.76f, -3.58f, -7.0f, -8.0f, -7.0f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        C32856Cuy.q5(dij);
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
