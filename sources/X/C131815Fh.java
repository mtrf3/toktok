package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.5Fh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C131815Fh extends Drawable {
    public int LIZ;
    public final int LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;
    public final Paint LJ;
    public final RectF LJFF;
    public float LJI;

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

    public C131815Fh(Context context) {
        int i;
        o.LJIIIZ(context, "context");
        Integer LJI = C79045V0n.LJI(R.attr.da, context);
        if (LJI != null) {
            i = LJI.intValue();
        } else {
            i = 0;
        }
        this.LIZ = i;
        Integer LJI2 = C79045V0n.LJI(R.attr.d1, context);
        this.LIZIZ = LJI2 != null ? LJI2.intValue() : 0;
        this.LIZJ = C7MY.LIZIZ(24);
        this.LIZLLL = C7MY.LIZIZ(6);
        Paint paint = new Paint();
        this.LJ = paint;
        this.LJFF = new RectF();
        paint.setAntiAlias(true);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        float width = getBounds().width();
        float f = this.LIZJ / 2;
        float centerY = getBounds().centerY() - f;
        float centerY2 = getBounds().centerY() + f;
        this.LJ.setColor(this.LIZIZ);
        this.LJFF.set(0.0f, centerY, width, centerY2);
        RectF rectF = this.LJFF;
        float f2 = this.LIZLLL;
        canvas.drawRoundRect(rectF, f2, f2, this.LJ);
        this.LJ.setColor(this.LIZ);
        this.LJFF.set(0.0f, centerY, width * this.LJI, centerY2);
        RectF rectF2 = this.LJFF;
        float f3 = this.LIZLLL;
        canvas.drawRoundRect(rectF2, f3, f3, this.LJ);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        invalidateSelf();
        return onLevelChange;
    }
}
