package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.5FQ, reason: invalid class name */
/* loaded from: classes3.dex */
public class C5FQ extends Drawable {
    public final int LIZ;
    public final int LIZIZ;
    public final Paint LIZJ;
    public final Paint LIZLLL;
    public final Path LJ;
    public final int LJFF;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.LIZLLL.getAlpha();
    }

    public int LIZJ() {
        return this.LJFF;
    }

    public static float LIZIZ(float f) {
        return C278817o.LIZ(f);
    }

    public float LIZ(float f) {
        return C32151Nz.LJIIZILJ(Float.valueOf(f)) + LIZJ();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        this.LJ.rewind();
        this.LJ.moveTo(LIZ(-13.5f), LIZIZ(49.0f));
        this.LJ.cubicTo(LIZ(-8.0f), LIZIZ(50.0f), LIZ(-8.0f), LIZIZ(50.0f), LIZ(-6.0f), LIZIZ(52.0f));
        this.LJ.lineTo(LIZ(-1.0f), LIZIZ(57.3f));
        this.LJ.cubicTo(LIZ(0.0f), LIZIZ(58.0f), LIZ(0.0f), LIZIZ(58.0f), LIZ(1.0f), LIZIZ(57.3f));
        this.LJ.lineTo(LIZ(6.0f), LIZIZ(52.0f));
        this.LJ.cubicTo(LIZ(8.0f), LIZIZ(50.0f), LIZ(8.0f), LIZIZ(50.0f), LIZ(13.5f), LIZIZ(49.0f));
        this.LJ.close();
        Float valueOf = Float.valueOf(4.0f);
        canvas.drawRoundRect(LIZIZ(4.0f), LIZIZ(4.0f), this.LIZ - O6R.LJJIIZ(C32151Nz.LJIIZILJ(valueOf)), this.LIZIZ - O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(12.0f))), LIZIZ(8.0f), LIZIZ(8.0f), this.LIZLLL);
        canvas.drawPath(this.LJ, this.LIZLLL);
        canvas.drawRoundRect(LIZIZ(4.0f), LIZIZ(4.0f), this.LIZ - O6R.LJJIIZ(C32151Nz.LJIIZILJ(valueOf)), this.LIZIZ - O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(11.8f))), LIZIZ(8.0f), LIZIZ(8.0f), this.LIZJ);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.LIZLLL.getAlpha() != i) {
            this.LIZLLL.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.LIZLLL.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public C5FQ(int i, int i2, Context context) {
        int i3;
        int i4;
        this.LIZ = i;
        this.LIZIZ = i2;
        Paint paint = new Paint(1);
        Integer LJI = C79045V0n.LJI(R.attr.ct, context);
        if (LJI != null) {
            i3 = LJI.intValue();
        } else {
            i3 = 0;
        }
        paint.setColor(i3);
        this.LIZJ = paint;
        Paint paint2 = new Paint(1);
        Integer LJI2 = C79045V0n.LJI(R.attr.ct, context);
        if (LJI2 != null) {
            i4 = LJI2.intValue();
        } else {
            i4 = 0;
        }
        paint2.setColor(i4);
        Integer LJI3 = C79045V0n.LJI(R.attr.dv, context);
        paint2.setShadowLayer(12.0f, 0.0f, 0.0f, LJI3 != null ? LJI3.intValue() : 0);
        this.LIZLLL = paint2;
        this.LJ = new Path();
        this.LJFF = i / 2;
    }
}
