package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D1h, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33201D1h extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33201D1h() {
        this.LIZJ.LJIIIIZZ(24.0f, 38.0f);
        this.LIZJ.LJIIIZ(12.0f, 12.0f, false, false, 11.96f, -11.0f);
        this.LIZJ.LJIIJ(0.04f, -0.55f, -0.4f, -1.0f, -0.96f, -1.0f);
        C32856Cuy.o6(this.LIZJ);
        this.LIZJ.LJIIJ(-0.55f, 0.0f, -1.0f, 0.45f, -0.96f, 1.0f);
        this.LIZJ.LIZJ(12.0f, 12.0f, false, false, 24.0f, 38.0f);
        this.LIZJ.LIZLLL();
        C32856Cuy.K0(this.LIZJ);
        this.LIZJ.LJIIIZ(8.0f, 8.0f, false, true, -6.93f, -4.0f);
        this.LIZJ.LJIIJJI(13.86f);
        this.LIZJ.LIZJ(8.0f, 8.0f, false, true, 24.0f, 34.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(18.38f, 20.06f);
        this.LIZJ.LJIIJ(0.3f, 0.45f, 0.73f, 0.94f, 1.29f, 0.94f);
        C32856Cuy.x6(this.LIZJ);
        this.LIZJ.LJIIJ(0.55f, 0.0f, 1.01f, -0.45f, 0.9f, -1.0f);
        this.LIZJ.LJIIIZ(5.0f, 5.0f, false, false, -9.8f, 0.0f);
        this.LIZJ.LJIIJ(-0.11f, 0.55f, 0.35f, 1.0f, 0.9f, 1.0f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(1.33f);
        this.LIZJ.LJIIJ(0.56f, 0.0f, 0.98f, -0.49f, 1.3f, -0.94f);
        this.LIZJ.LJIIIZ(1.66f, 1.66f, false, true, 2.75f, 0.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(33.67f, 21.0f);
        this.LIZJ.LJIIJ(-0.56f, 0.0f, -0.98f, -0.49f, -1.3f, -0.94f);
        this.LIZJ.LJIIIZ(1.66f, 1.66f, false, false, -2.75f, 0.0f);
        this.LIZJ.LJIIJ(-0.3f, 0.45f, -0.73f, 0.94f, -1.29f, 0.94f);
        C32856Cuy.D6(this.LIZJ);
        this.LIZJ.LJIIJ(-0.55f, 0.0f, -1.01f, -0.45f, -0.9f, -1.0f);
        this.LIZJ.LJIIIZ(5.0f, 5.0f, false, true, 9.8f, 0.0f);
        this.LIZJ.LJIIJ(0.11f, 0.55f, -0.35f, 1.0f, -0.9f, 1.0f);
        this.LIZJ.LJIIJJI(-1.33f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(44.0f, 24.0f);
        dij.LJIIIZ(20.0f, 20.0f, true, true, -40.0f, 0.0f);
        dij.LJIIIZ(20.0f, 20.0f, false, true, 40.0f, 0.0f);
        dij.LIZLLL();
        C32856Cuy.LJJIJIL(dij);
        C32856Cuy.LLLLII(dij);
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
