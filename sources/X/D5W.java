package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class D5W extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public D5W() {
        this.LIZJ.LIZ(24.0f, 24.0f, 24.0f, Path.Direction.CW);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ = KMP.LIZIZ(this.LIZIZ, -119723);
        this.LJ = LIZIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        C32856Cuy.R7(dij);
        dij.LJIIJ(0.1f, -0.04f, 0.14f, -0.03f, 0.16f, -0.02f);
        dij.LJIIJ(0.03f, 0.02f, 0.08f, 0.05f, 0.12f, 0.12f);
        dij.LJIIJ(0.04f, 0.06f, 0.05f, 0.12f, 0.04f, 0.16f);
        dij.LJIIJ(0.0f, 0.02f, -0.01f, 0.06f, -0.09f, 0.13f);
        C32856Cuy.LLLZIIL(dij);
        dij.LJIIZILJ(Path.FillType.WINDING);
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
