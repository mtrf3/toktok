package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D4b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33273D4b extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33273D4b() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(24.0f, 44.0f);
        this.LIZJ.LJIIJ(8.92f, 0.0f, 16.15f, -7.12f, 16.15f, -15.9f);
        this.LIZJ.LJ(40.15f, 16.77f, 26.3f, 2.0f, 26.3f, 2.0f);
        this.LIZJ.LJIIL(-8.08f, 12.49f);
        this.LIZJ.LJIIL(-2.3f, -4.54f);
        this.LIZJ.LJIILLIIL(7.84f, 17.89f, 7.84f, 28.1f, false);
        this.LIZJ.LJ(7.84f, 36.88f, 15.07f, 44.0f, 23.99f, 44.0f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ = KMP.LIZIZ(this.LIZIZ, -119723);
        this.LJ = LIZIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(17.53f, 30.38f);
        dij.LJIIJ(0.0f, -3.96f, 6.46f, -12.23f, 6.46f, -12.23f);
        dij.LJIILJJIL(6.46f, 8.27f, 6.46f, 12.23f, true);
        dij.LJIIJ(0.0f, 3.95f, -2.89f, 7.16f, -6.46f, 7.16f);
        dij.LJIILJJIL(-6.46f, -3.2f, -6.46f, -7.16f, true);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.WINDING);
        LIZIZ.setStyle(Paint.Style.FILL);
        LIZIZ.setColor(-18056);
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
