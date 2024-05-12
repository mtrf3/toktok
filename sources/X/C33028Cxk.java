package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.Cxk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33028Cxk extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;
    public final Paint LJI;
    public final DIJ LJII;

    public C33028Cxk() {
        C32856Cuy.yo(this.LIZJ);
        this.LIZJ.LJIIZILJ(Path.FillType.WINDING);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        this.LIZIZ.setColor(-119723);
        this.LIZIZ.setAlpha(96);
        Paint paint = new Paint();
        this.LJ = paint;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        C32856Cuy.Sh(dij);
        dij.LJIIZILJ(Path.FillType.WINDING);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-119723);
        Paint LIZ = C42193GhB.LIZ(this.LIZ, paint);
        this.LJI = LIZ;
        DIJ dij2 = new DIJ();
        this.LJII = dij2;
        dij2.LJIIIIZZ(40.0f, 9.8f);
        C32856Cuy.Rb(dij2);
        dij2.LJIIJ(-3.57f, 0.0f, -6.11f, 1.01f, -8.14f, 2.5f);
        dij2.LJIIIZ(22.18f, 22.18f, false, false, -4.55f, 4.8f);
        dij2.LJIIIZ(22.18f, 22.18f, false, false, 4.55f, 4.8f);
        dij2.LJIIIZ(13.16f, 13.16f, false, false, 8.14f, 2.5f);
        C32856Cuy.R6(dij2);
        C32856Cuy.LJJL(dij2);
        C32856Cuy.Rb(dij2);
        dij2.LJIIJ(-4.3f, 0.0f, -7.54f, -1.25f, -10.14f, -3.15f);
        dij2.LJIIJ(-1.85f, -1.35f, -3.33f, -3.0f, -4.63f, -4.67f);
        dij2.LJIIJ(-2.77f, 3.85f, -6.09f, 7.85f, -12.23f, 7.82f);
        C32856Cuy.LJJJI(dij2);
        dij2.LJIIJJI(7.26f);
        dij2.LJIIJ(4.73f, 0.02f, 7.05f, -3.06f, 10.1f, -7.3f);
        dij2.LJIIJ(-3.05f, -4.24f, -5.37f, -7.32f, -10.1f, -7.3f);
        C32856Cuy.LJJJI(dij2);
        dij2.LJIIJJI(7.25f);
        dij2.LJIIJ(6.14f, -0.03f, 9.46f, 3.97f, 12.23f, 7.82f);
        dij2.LJIIIZ(23.66f, 23.66f, false, true, 4.63f, -4.67f);
        dij2.LJIIJ(2.6f, -1.9f, 5.84f, -3.15f, 10.14f, -3.15f);
        C32856Cuy.R6(dij2);
        dij2.LJIJ(9.8f);
        dij2.LIZLLL();
        dij2.LJIIZILJ(Path.FillType.WINDING);
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
