package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cwr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C32973Cwr extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;
    public final Paint LJI;
    public final DIJ LJII;

    public C32973Cwr() {
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIIIZZ(34.0f, 6.0f);
        C32856Cuy.D0(this.LIZJ);
        C32856Cuy.ki(this.LIZJ);
        this.LIZJ.LJIILL(24.26f);
        this.LIZJ.LJIIIZ(1.0f, 1.0f, false, true, -1.5f, 0.86f);
        this.LIZJ.LJII(34.0f, 31.14f);
        DIK.LIZIZ(this.LIZJ, "p", 6.0f);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ = KMP.LIZIZ(this.LIZIZ, -79405);
        this.LJ = LIZIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(4.0f, 14.0f);
        C32856Cuy.Ce(dij);
        C32856Cuy.LJJIFFI(dij);
        C32856Cuy.mi(dij);
        dij.LJIILL(31.09f);
        dij.LJIIJ(0.0f, 0.84f, -0.92f, 1.36f, -1.64f, 0.93f);
        dij.LJII(19.0f, 35.0f);
        dij.LJII(5.51f, 43.1f);
        dij.LIZJ(1.0f, 1.0f, false, true, 4.0f, 42.22f);
        dij.LJIJ(14.0f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.WINDING);
        LIZIZ.setStyle(Paint.Style.FILL);
        LIZIZ.setColor(-119723);
        Paint LIZ = C42193GhB.LIZ(this.LIZ, LIZIZ);
        this.LJI = LIZ;
        DIJ dij2 = new DIJ();
        this.LJII = dij2;
        dij2.LJIIIIZZ(14.0f, 16.15f);
        dij2.LJIIJ(0.0f, -0.9f, 0.99f, -1.45f, 1.76f, -0.98f);
        dij2.LJIIL(9.68f, 5.85f);
        dij2.LJIIJ(0.75f, 0.44f, 0.75f, 1.52f, 0.0f, 1.96f);
        dij2.LJIIL(-9.68f, 5.85f);
        dij2.LJIIIZ(1.16f, 1.16f, false, true, -1.76f, -0.98f);
        dij2.LJIILL(-11.7f);
        dij2.LIZLLL();
        dij2.LJIIZILJ(Path.FillType.EVEN_ODD);
        LIZ.setStyle(Paint.Style.FILL);
        LIZ.setColor(-1);
        this.LIZ.add(LIZ);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
        canvas.drawPath(this.LJII.LIZ, this.LJI);
    }
}
