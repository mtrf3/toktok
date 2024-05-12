package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D4z, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33297D4z extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33297D4z() {
        this.LIZJ.LJIIIIZZ(62.9f, 60.35f);
        this.LIZJ.LJIIJ(2.8f, -1.9f, 4.1f, -4.2f, 4.1f, -6.35f);
        this.LIZJ.LJIIJ(0.0f, -2.16f, -1.3f, -4.46f, -4.1f, -6.35f);
        this.LIZJ.LJIIJ(-2.79f, -1.89f, -6.8f, -3.15f, -11.4f, -3.15f);
        this.LIZJ.LJIIJ(-4.6f, 0.0f, -8.61f, 1.26f, -11.4f, 3.15f);
        this.LIZJ.LJIIJ(-2.8f, 1.9f, -4.1f, 4.2f, -4.1f, 6.35f);
        this.LIZJ.LJIIJ(0.0f, 2.16f, 1.3f, 4.46f, 4.1f, 6.35f);
        this.LIZJ.LJIIJ(2.79f, 1.89f, 6.8f, 3.15f, 11.4f, 3.15f);
        this.LIZJ.LJIIJ(4.6f, 0.0f, 8.61f, -1.26f, 11.4f, -3.15f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIIIZZ(51.5f, 66.5f);
        this.LIZJ.LJ(41.28f, 66.5f, 33.0f, 60.9f, 33.0f, 54.0f);
        this.LIZJ.LJIILJJIL(8.28f, -12.5f, 18.5f, -12.5f, true);
        this.LIZJ.LJIILLIIL(70.0f, 47.1f, 70.0f, 54.0f, true);
        this.LIZJ.LJIILJJIL(-8.28f, 12.5f, -18.5f, 12.5f, true);
        this.LIZJ.LIZLLL();
        C32856Cuy.d8(this.LIZJ);
        Paint LIZ = DIX.LIZ(this.LIZJ, Path.FillType.WINDING);
        this.LJ = LIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(51.5f, 57.0f);
        C32856Cuy.hk(dij);
        dij.LJIILIIL(0.0f, 3.0f);
        C32856Cuy.td(dij);
        dij.LJIIZILJ(Path.FillType.WINDING);
        this.LIZ.add(LIZ);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(72.0f, 72.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
    }
}
