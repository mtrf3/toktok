package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D3n, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33259D3n extends AbstractC39455Fe7 {
    public final DIJ LJ;
    public final Paint LJFF;
    public final DIJ LJI;

    public C33259D3n() {
        DIJ LIZIZ = C0H1.LIZIZ();
        this.LJ = LIZIZ;
        C32856Cuy.L5(LIZIZ);
        LIZIZ.LJIIZILJ(Path.FillType.WINDING);
        C32856Cuy.x8(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.EVEN_ODD);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ2 = KMP.LIZIZ(this.LIZIZ, -12018177);
        this.LJFF = LIZIZ2;
        DIJ dij = new DIJ();
        this.LJI = dij;
        dij.LJIIIIZZ(15.25f, 26.0f);
        C32856Cuy.pg(dij);
        dij.LJIIIIZZ(24.25f, 26.0f);
        C32856Cuy.pg(dij);
        dij.LJIIIIZZ(32.75f, 26.0f);
        C32856Cuy.pg(dij);
        dij.LJIIZILJ(Path.FillType.EVEN_ODD);
        LIZIZ2.setStyle(Paint.Style.FILL);
        LIZIZ2.setColor(-1);
        this.LIZ.add(LIZIZ2);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.clipPath(this.LJ.LIZ);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJI.LIZ, this.LJFF);
    }
}
