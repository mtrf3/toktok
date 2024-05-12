package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Czy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33166Czy extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33166Czy() {
        this.LIZJ.LJIILIIL(22.38f, 31.95f);
        this.LIZJ.LJIIL(-2.8f, -2.8f);
        C32856Cuy.G4(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(5.0f, 39.0f);
        C32856Cuy.In(dij);
        dij.LJIJ(15.14f);
        dij.LJIIIZ(4.0f, 4.0f, false, false, -1.78f, -3.33f);
        C32856Cuy.v4(dij);
        dij.LIZJ(4.0f, 4.0f, false, false, 5.0f, 15.08f);
        dij.LJIJ(39.0f);
        dij.LIZLLL();
        dij.LJIILIIL(3.8f, 0.0f);
        dij.LJIJ(17.8f);
        dij.LJIIJJI(30.4f);
        C32856Cuy.M9(dij);
        dij.LJIIIZ(0.2f, 0.2f, false, true, -0.2f, 0.2f);
        C32856Cuy.LLLLLZIL(dij);
        dij.LJIIIZ(0.2f, 0.2f, false, true, -0.2f, -0.2f);
        dij.LIZLLL();
        dij.LJIIIIZZ(31.4f, 9.83f);
        dij.LJII(37.65f, 14.0f);
        dij.LJI(10.2f);
        dij.LJIIL(5.95f, -4.16f);
        dij.LJIIIZ(0.2f, 0.2f, false, true, 0.11f, -0.04f);
        dij.LJI(31.3f);
        dij.LJIIIZ(0.2f, 0.2f, false, true, 0.11f, 0.03f);
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
