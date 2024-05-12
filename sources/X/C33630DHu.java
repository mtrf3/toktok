package X;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import kotlin.jvm.internal.o;

/* renamed from: X.DHu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33630DHu extends AbstractC39455Fe7 {
    public final Paint LJ;
    public final DIJ LJFF;

    public C33630DHu() {
        LinearGradient linearGradient = new LinearGradient(-17.5f, -40.5f, 24.0f, 48.0f, new int[]{-3342098, -65188}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.LIZJ.LIZ(24.0f, 24.0f, 24.0f, Path.Direction.CW);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        this.LIZIZ.setShader(linearGradient);
        Paint paint = new Paint();
        this.LJ = paint;
        DIJ dij = new DIJ();
        this.LJFF = dij;
        C32856Cuy.m4(dij);
        dij.LJIIZILJ(Path.FillType.EVEN_ODD);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
        this.LIZ.add(paint);
    }

    @Override // X.AbstractC39455Fe7
    public final void LIZ(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
    }
}
