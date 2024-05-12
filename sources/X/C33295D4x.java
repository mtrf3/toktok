package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D4x, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33295D4x extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33295D4x() {
        C32856Cuy.zo(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(29.14f, 12.0f);
        dij.LIZJ(5.75f, 5.75f, false, false, 35.0f, 17.64f);
        C32856Cuy.C1(dij);
        dij.LJIIIZ(10.0f, 10.0f, false, true, -5.86f, -1.9f);
        dij.LJIILL(7.85f);
        dij.LJIIJ(0.0f, 4.15f, -3.45f, 7.41f, -7.57f, 7.41f);
        dij.LIZJ(7.49f, 7.49f, false, true, 14.0f, 27.6f);
        dij.LJIIJ(0.0f, -4.16f, 3.44f, -7.42f, 7.57f, -7.42f);
        C32856Cuy.C1(dij);
        dij.LIZJ(3.5f, 3.5f, false, false, 18.0f, 27.6f);
        dij.LIZJ(3.5f, 3.5f, false, false, 21.57f, 31.0f);
        dij.LJIIIZ(3.5f, 3.5f, false, false, 3.57f, -3.4f);
        dij.LJIJ(12.0f);
        dij.LJIIJJI(4.0f);
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
