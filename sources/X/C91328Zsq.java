package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.o;

/* renamed from: X.Zsq, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91328Zsq extends Drawable {
    public final Paint LIZ;
    public EnumC91326Zso LIZIZ;
    public final /* synthetic */ C91476ZvE LIZJ;

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

    public final int LIZ() {
        int i = C91327Zsp.LIZ[this.LIZIZ.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3) {
                return this.LIZJ.LJLL;
            }
            throw new C162476Zf();
        }
        return this.LIZJ.LJLJLJ;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return LIZ();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return LIZ();
    }

    public C91328Zsq(C91476ZvE c91476ZvE) {
        this.LIZJ = c91476ZvE;
        Paint paint = new Paint();
        this.LIZ = paint;
        this.LIZIZ = EnumC91326Zso.NORMAL;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
        paint.setAntiAlias(true);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        canvas.drawCircle(getBounds().exactCenterX(), getBounds().exactCenterY(), LIZ() / 2.0f, this.LIZ);
    }
}
