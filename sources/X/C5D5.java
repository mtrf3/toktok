package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5D5, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5D5 extends Drawable {
    public final C5AP LIZ;
    public final Context LIZIZ;
    public int LIZJ;
    public final int LIZLLL;
    public final Paint LJ;
    public final C62822Ol8 LJFF;
    public final ShapeDrawable LJI;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    public final float LIZ() {
        if (this.LIZ == C5AP.LEFT) {
            return C32151Nz.LJIIZILJ(8);
        }
        return 0.0f;
    }

    public final float LIZIZ() {
        if (this.LIZ == C5AP.LEFT) {
            return 0.0f;
        }
        return C32151Nz.LJIIZILJ(8);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        o.LJIIIZ(canvas, "canvas");
        this.LJI.setBounds(getBounds());
        this.LJI.draw(canvas);
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY();
        if (this.LIZ == C5AP.LEFT) {
            i = this.LIZLLL;
        } else {
            i = -this.LIZLLL;
        }
        Drawable drawable = (Drawable) this.LJFF.getValue();
        int i2 = this.LIZJ / 2;
        drawable.setBounds((centerX - i2) + i, centerY - i2, centerX + i2 + i, i2 + centerY);
        boolean LIZ = C68E.LIZ(this.LIZIZ);
        if (LIZ) {
            canvas.save();
            canvas.translate(this.LIZJ, 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        ((SY9) this.LJFF.getValue()).draw(canvas);
        if (LIZ) {
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.LJ.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.LJ.setColorFilter(colorFilter);
    }

    public C5D5(C5AP type, ActivityC45651qj context) {
        o.LJIIIZ(type, "type");
        o.LJIIIZ(context, "context");
        this.LIZ = type;
        this.LIZIZ = context;
        C32151Nz.LJIIZILJ(8);
        this.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(22));
        this.LIZLLL = C7MY.LIZIZ(1);
        Paint LIZIZ = C6D8.LIZIZ(true);
        LIZIZ.setStyle(Paint.Style.STROKE);
        this.LJ = LIZIZ;
        this.LJFF = C221108m2.LIZIZ(new AqS152S0100000_2(this, 1012));
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{LIZ(), LIZ(), LIZIZ(), LIZIZ(), LIZIZ(), LIZIZ(), LIZ(), LIZ()}, null, null));
        Integer LJI = C79045V0n.LJI(R.attr.dj, context);
        if (LJI != null) {
            shapeDrawable.getPaint().setColor(LJI.intValue());
        }
        this.LJI = shapeDrawable;
    }
}
