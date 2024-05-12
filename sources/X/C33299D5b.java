package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D5b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33299D5b extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33299D5b() {
        C32856Cuy.D3(this.LIZJ);
        this.LIZJ.LJIIJJI(18.18f);
        this.LIZJ.LJIIIZ(12.0f, 12.0f, false, true, -5.31f, -17.43f);
        this.LIZJ.LJ(22.37f, 27.2f, 20.75f, 27.0f, 19.0f, 27.0f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(42.0f, 34.0f);
        dij.LJIIIZ(8.0f, 8.0f, true, false, -3.94f, 6.9f);
        dij.LJIIL(4.82f, 4.8f);
        C32856Cuy.Zh(dij);
        dij.LJIIL(-4.82f, -4.82f);
        dij.LJ(41.6f, 36.87f, 42.0f, 35.48f, 42.0f, 34.0f);
        dij.LIZLLL();
        dij.LJIILIIL(-8.0f, -4.0f);
        dij.LJIIIZ(4.0f, 4.0f, true, true, 0.0f, 8.0f);
        dij.LJIIIZ(4.0f, 4.0f, false, true, 0.0f, -8.0f);
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
