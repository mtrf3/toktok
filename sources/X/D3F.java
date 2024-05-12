package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D3F extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;
    public final Paint LJI;
    public final DIJ LJII;
    public final Paint LJIIIIZZ;
    public final DIJ LJIIIZ;

    public D3F() {
        this.LIZJ.LIZ(24.0f, 24.0f, 22.0f, Path.Direction.CW);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ = KMP.LIZIZ(this.LIZIZ, -4965);
        this.LJ = LIZIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LIZ(24.0f, 24.0f, 17.0f, Path.Direction.CW);
        LIZIZ.setStyle(Paint.Style.FILL);
        LIZIZ.setColor(-340459);
        Paint LIZ = C42193GhB.LIZ(this.LIZ, LIZIZ);
        this.LJI = LIZ;
        DIJ dij2 = new DIJ();
        this.LJII = dij2;
        dij2.LJIIIIZZ(40.93f, 25.5f);
        dij2.LJIIIZ(17.0f, 17.0f, true, false, -33.87f, 0.0f);
        dij2.LJIIIZ(17.0f, 17.0f, false, true, 33.87f, 0.0f);
        dij2.LIZLLL();
        dij2.LJIIZILJ(Path.FillType.EVEN_ODD);
        LIZ.setStyle(Paint.Style.FILL);
        LIZ.setColor(-345067);
        Paint LIZ2 = C42193GhB.LIZ(this.LIZ, LIZ);
        this.LJIIIIZZ = LIZ2;
        DIJ dij3 = new DIJ();
        this.LJIIIZ = dij3;
        dij3.LJIIIIZZ(33.0f, 19.0f);
        dij3.LJIIIZ(5.03f, 5.03f, false, true, -5.06f, -5.0f);
        dij3.LJIIJJI(-3.38f);
        dij3.LJIILL(13.61f);
        dij3.LJIIIZ(3.07f, 3.07f, false, true, -3.1f, 3.06f);
        dij3.LJIIJ(-1.7f, 0.0f, -3.09f, -1.37f, -3.09f, -3.06f);
        dij3.LJIIIZ(3.07f, 3.07f, false, true, 3.94f, -2.94f);
        dij3.LJIILL(-3.4f);
        dij3.LIZJ(6.43f, 6.43f, false, false, 15.0f, 27.6f);
        dij3.LJIIJ(0.0f, 3.54f, 2.9f, 6.4f, 6.47f, 6.4f);
        dij3.LJIIIZ(6.43f, 6.43f, false, false, 6.47f, -6.39f);
        dij3.LJIILL(-6.94f);
        dij3.LIZJ(8.47f, 8.47f, false, false, 33.0f, 22.33f);
        dij3.LJIJ(19.0f);
        dij3.LIZLLL();
        dij3.LJIIZILJ(Path.FillType.WINDING);
        LIZ2.setStyle(Paint.Style.FILL);
        LIZ2.setColor(-68147);
        this.LIZ.add(LIZ2);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
        canvas.drawPath(this.LJII.LIZ, this.LJI);
        canvas.drawPath(this.LJIIIZ.LIZ, this.LJIIIIZZ);
    }
}
