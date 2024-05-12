package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D3m, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33258D3m extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33258D3m() {
        this.LIZJ.LIZ(24.0f, 24.0f, 18.0f, Path.Direction.CW);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ = KMP.LIZIZ(this.LIZIZ, -14625300);
        this.LJ = LIZIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(33.84f, 17.9f);
        dij.LJIIJ(0.88f, 0.89f, 0.88f, 2.31f, 0.0f, 3.2f);
        dij.LJII(23.72f, 31.21f);
        dij.LJIIJ(-0.88f, 0.87f, -2.3f, 0.87f, -3.19f, 0.0f);
        dij.LJIIL(-6.37f, -6.38f);
        dij.LJIIIZ(2.25f, 2.25f, true, true, 3.18f, -3.18f);
        dij.LJIIL(4.79f, 4.78f);
        dij.LJIIL(8.53f, -8.53f);
        dij.LJIIJ(0.88f, -0.88f, 2.3f, -0.88f, 3.18f, 0.0f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.EVEN_ODD);
        LIZIZ.setStyle(Paint.Style.FILL);
        LIZIZ.setColor(-1);
        this.LIZ.add(LIZIZ);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
    }
}
