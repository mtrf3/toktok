package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.o;

/* renamed from: X.D7j, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33359D7j extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33359D7j() {
        this.LIZJ.LIZ(24.0f, 24.0f, 24.0f, Path.Direction.CW);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        Paint LIZIZ = KMP.LIZIZ(this.LIZIZ, -119723);
        this.LJ = LIZIZ;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        C32856Cuy.m4(dij);
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