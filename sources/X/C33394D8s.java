package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D8s, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33394D8s extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33394D8s() {
        this.LIZJ.LJIIIIZZ(15.95f, 9.0f);
        this.LIZJ.LJIIJ(1.91f, 0.0f, 3.74f, 0.36f, 5.42f, 1.01f);
        this.LIZJ.LJIIIZ(17.04f, 17.04f, false, false, -0.2f, 27.95f);
        this.LIZJ.LIZJ(14.95f, 14.95f, true, true, 15.95f, 9.0f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(31.95f, 38.9f);
        dij.LJIIIZ(14.95f, 14.95f, true, false, 0.0f, -29.9f);
        dij.LJIIIZ(14.95f, 14.95f, false, false, 0.0f, 29.9f);
        dij.LIZLLL();
        dij.LJIILIIL(3.45f, -21.74f);
        dij.LJIIJ(1.05f, 0.0f, 1.9f, 0.85f, 1.9f, 1.9f);
        C32856Cuy.V9(dij);
        dij.LJIIJ(0.0f, -1.04f, 0.85f, -1.89f, 1.9f, -1.89f);
        dij.LIZLLL();
        dij.LJIILIIL(-8.6f, 1.9f);
        dij.LJIIIZ(1.9f, 1.9f, false, true, 3.8f, 0.0f);
        C32856Cuy.V9(dij);
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
