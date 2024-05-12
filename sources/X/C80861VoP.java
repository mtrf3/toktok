package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.o;

/* renamed from: X.VoP, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80861VoP extends Drawable {
    public int LIZ = -16777216;
    public int LIZIZ = -16777216;
    public int LIZJ = -16777216;
    public float LIZLLL;
    public final Paint LJ;
    public final RectF LJFF;
    public float LJI;
    public float LJII;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public C80861VoP() {
        Paint paint = new Paint();
        this.LJ = paint;
        this.LJFF = new RectF();
        paint.setAntiAlias(true);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        float width = getBounds().width();
        float f = this.LIZLLL / 2;
        float centerY = getBounds().centerY() - f;
        float centerY2 = getBounds().centerY() + f;
        this.LJ.setColor(this.LIZJ);
        this.LJFF.set(0.0f, centerY, width, centerY2);
        canvas.drawRoundRect(this.LJFF, f, f, this.LJ);
        if (this.LJII > this.LJI) {
            this.LJ.setColor(this.LIZIZ);
            this.LJFF.set(this.LJI * width, centerY, this.LJII * width, centerY2);
            canvas.drawRoundRect(this.LJFF, f, f, this.LJ);
        }
        this.LJ.setColor(this.LIZ);
        this.LJFF.set(0.0f, centerY, width * this.LJI, centerY2);
        canvas.drawRoundRect(this.LJFF, f, f, this.LJ);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        invalidateSelf();
        return onLevelChange;
    }
}
