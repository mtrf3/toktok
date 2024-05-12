package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D3d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33249D3d extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33249D3d() {
        C32856Cuy.bd(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ = KMP.LIZIZ(this.LIZIZ, -15483504);
        this.LJ = LIZIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(24.0f, 40.5f);
        dij.LJIIJ(0.88f, 0.0f, 14.0f, -11.43f, 14.0f, -19.1f);
        dij.LJIIJ(0.0f, -7.68f, -6.27f, -13.9f, -14.0f, -13.9f);
        dij.LJIILJJIL(-14.0f, 6.22f, -14.0f, 13.9f, true);
        dij.LJIIJ(0.0f, 7.67f, 13.13f, 19.1f, 14.0f, 19.1f);
        dij.LIZLLL();
        dij.LJIILIIL(0.0f, -14.76f);
        dij.LJIIJ(2.9f, 0.0f, 5.25f, -2.34f, 5.25f, -5.21f);
        dij.LIZJ(5.23f, 5.23f, false, false, 24.0f, 15.32f);
        dij.LJIIIZ(5.23f, 5.23f, false, false, -5.25f, 5.2f);
        dij.LIZJ(5.23f, 5.23f, false, false, 24.0f, 25.75f);
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
