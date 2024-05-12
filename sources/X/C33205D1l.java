package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D1l, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33205D1l extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;
    public final Paint LJI;
    public final DIJ LJII;

    public C33205D1l() {
        this.LIZJ.LJIIIIZZ(12.12f, 18.34f);
        C32856Cuy.L4(this.LIZJ);
        this.LIZJ.LIZJ(9.0f, 9.0f, true, true, 11.04f, 23.8f);
        this.LIZJ.LJIIJ(-0.03f, -1.86f, 0.33f, -3.73f, 1.08f, -5.47f);
        this.LIZJ.LIZLLL();
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        this.LIZIZ.setColor(-1);
        this.LIZIZ.setAlpha(102);
        Paint paint = new Paint();
        this.LJ = paint;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        dij.LJIIIIZZ(21.57f, 7.63f);
        dij.LJIIIZ(13.0f, 13.0f, true, false, 18.38f, 18.39f);
        dij.LIZJ(13.0f, 13.0f, false, false, 21.57f, 7.63f);
        dij.LIZLLL();
        dij.LJIIZILJ(Path.FillType.WINDING);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
        Paint LIZ = C42193GhB.LIZ(this.LIZ, paint);
        this.LJI = LIZ;
        DIJ dij2 = new DIJ();
        this.LJII = dij2;
        dij2.LJIIIIZZ(18.84f, 11.62f);
        C32856Cuy.L4(dij2);
        dij2.LJIIL(-0.08f, 0.08f);
        dij2.LJIIIZ(9.0f, 9.0f, true, true, -12.65f, -12.8f);
        dij2.LJIIJ(-0.04f, -1.87f, 0.32f, -3.74f, 1.08f, -5.48f);
        dij2.LIZLLL();
        dij2.LJIIZILJ(Path.FillType.WINDING);
        LIZ.setStyle(Paint.Style.FILL);
        LIZ.setColor(-1);
        LIZ.setAlpha(153);
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
