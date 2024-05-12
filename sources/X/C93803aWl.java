package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.o;

/* renamed from: X.aWl, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93803aWl extends Drawable {
    public float LIZ;
    public float LIZIZ;
    public float LIZJ;
    public boolean LIZLLL;
    public final Paint LJ = new Paint();

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

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        if (this.LIZLLL) {
            canvas.drawCircle(this.LIZIZ, this.LIZJ, this.LIZ, this.LJ);
        }
    }
}
