package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.DAk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33438DAk extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33438DAk() {
        this.LIZJ.LJIIIIZZ(34.62f, 35.05f);
        this.LIZJ.LJIIIZ(74.43f, 74.43f, false, false, 9.11f, -9.71f);
        this.LIZJ.LJIIJ(3.84f, -4.82f, 3.17f, -11.75f, -1.19f, -16.1f);
        this.LIZJ.LIZJ(12.66f, 12.66f, false, false, 26.37f, 7.8f);
        this.LIZJ.LJIIJ(7.43f, 7.44f, 12.66f, 16.45f, 8.25f, 27.25f);
        this.LIZJ.LIZLLL();
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(5.46f, 9.24f);
        dij.LJ(1.1f, 13.59f, 0.43f, 20.52f, 4.26f, 25.34f);
        dij.LJ(9.5f, 31.9f, 14.5f, 36.62f, 22.53f, 42.0f);
        dij.LJIIJ(1.08f, 0.72f, 2.51f, 0.57f, 3.43f, -0.34f);
        dij.LJIIJ(10.48f, -10.49f, 7.33f, -22.5f, -2.6f, -32.43f);
        dij.LJIIIZ(12.66f, 12.66f, false, false, -17.9f, 0.0f);
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
