package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D7s, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33368D7s extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33368D7s() {
        this.LIZJ.LJIILIIL(21.52f, 21.54f);
        this.LIZJ.LJIIL(8.34f, -3.4f);
        this.LIZJ.LJIIL(-3.4f, 8.35f);
        this.LIZJ.LJIIL(-8.65f, 3.7f);
        this.LIZJ.LJIIL(3.7f, -8.65f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        C32856Cuy.Ci(dij);
        dij.LJIILIIL(10.9f, -29.65f);
        dij.LJIIIZ(2.5f, 2.5f, false, false, -3.25f, -3.25f);
        dij.LJII(19.63f, 18.0f);
        dij.LIZJ(3.0f, 3.0f, false, false, 18.0f, 19.58f);
        dij.LJIIL(-5.35f, 12.47f);
        dij.LJIIIZ(2.5f, 2.5f, false, false, 3.29f, 3.29f);
        dij.LJII(28.4f, 30.0f);
        dij.LJIIIZ(3.0f, 3.0f, false, false, 1.6f, -1.63f);
        dij.LJIIL(4.9f, -12.02f);
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
