package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import kotlin.jvm.internal.o;

/* renamed from: X.CyW, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33076CyW extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;
    public final Paint LJI;
    public final DIJ LJII;
    public final Paint LJIIIIZZ;
    public final DIJ LJIIIZ;

    public C33076CyW() {
        C32856Cuy.S8(this.LIZJ);
        this.LIZJ.LJIIJ(-1.71f, 0.87f, -3.95f, 0.87f, -8.43f, 0.87f);
        DIJ p = this.LIZJ;
        o.LJIIIZ(p, "p");
        p.LJIIJJI(-9.9f);
        p.LJIIJ(-4.48f, 0.0f, -6.72f, 0.0f, -8.43f, -0.87f);
        p.LJIIIZ(8.0f, 8.0f, false, true, -3.5f, -3.5f);
        p.LJ(10.0f, 31.93f, 10.0f, 29.68f, 10.0f, 25.2f);
        p.LJIILL(-2.4f);
        p.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.EVEN_ODD);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ = KMP.LIZIZ(this.LIZIZ, -381588);
        this.LJ = LIZIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        C32856Cuy.Z7(dij);
        dij.LJIIZILJ(Path.FillType.EVEN_ODD);
        LIZIZ.setStyle(Paint.Style.FILL);
        LIZIZ.setColor(-14625300);
        Paint LIZ = C42193GhB.LIZ(this.LIZ, LIZIZ);
        this.LJI = LIZ;
        DIJ dij2 = new DIJ();
        this.LJII = dij2;
        dij2.LIZIZ(new RectF(6.0f, 10.0f, 42.0f, 38.0f), 8.0f, 8.0f, Path.Direction.CW);
        LIZ.setStyle(Paint.Style.FILL);
        LIZ.setColor(-16777216);
        Paint LIZ2 = C42193GhB.LIZ(this.LIZ, LIZ);
        this.LJIIIIZZ = LIZ2;
        DIJ dij3 = new DIJ();
        this.LJIIIZ = dij3;
        C32856Cuy.O7(dij3);
        dij3.LJIIZILJ(Path.FillType.EVEN_ODD);
        LIZ2.setStyle(Paint.Style.FILL);
        LIZ2.setColor(-1);
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
