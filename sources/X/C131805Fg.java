package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.5Fg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C131805Fg extends Drawable {
    public final int LIZ;
    public final int LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;
    public final float LJ;
    public final SY9 LJFF;
    public final Paint LJI;
    public final RectF LJII;
    public boolean LJIIIIZZ;
    public float LJIIIZ;

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
        float width = getBounds().width();
        float f = 2;
        float f2 = this.LIZJ / f;
        float centerY = getBounds().centerY() - f2;
        float centerY2 = getBounds().centerY() + f2;
        this.LJI.setColor(this.LIZIZ);
        this.LJII.set(0.0f, centerY, width, centerY2);
        RectF rectF = this.LJII;
        float f3 = this.LIZLLL;
        canvas.drawRoundRect(rectF, f3, f3, this.LJI);
        this.LJI.setColor(this.LIZ);
        this.LJII.set(0.0f, centerY, width * this.LJIIIZ, centerY2);
        float f4 = this.LIZLLL;
        Path path = new Path();
        path.addRoundRect(this.LJII, new float[]{f4, f4, 0.0f, 0.0f, 0.0f, 0.0f, f4, f4}, Path.Direction.CW);
        if (this.LJIIIZ < 0.98f) {
            canvas.drawPath(path, this.LJI);
        } else {
            RectF rectF2 = this.LJII;
            float f5 = this.LIZLLL;
            canvas.drawRoundRect(rectF2, f5, f5, this.LJI);
        }
        int LIZIZ = C7MY.LIZIZ(16);
        int i = (int) (this.LJ / f);
        this.LJFF.setBounds(LIZIZ, getBounds().centerY() - i, ((int) this.LJ) + LIZIZ, getBounds().centerY() + i);
        this.LJFF.setAlpha(100);
        if (this.LJIIIIZZ) {
            canvas.save();
            canvas.translate(this.LJFF.getBounds().width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.LJFF.draw(canvas);
        if (this.LJIIIIZZ) {
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        invalidateSelf();
        return onLevelChange;
    }

    public C131805Fg(Context context, AttributeSet attributeSet) {
        o.LJIIIZ(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.b2c, R.attr.b2d, R.attr.b2e, R.attr.b2f, R.attr.b2g, R.attr.b2h, R.attr.b2i, R.attr.b2j, R.attr.b2k, R.attr.b2l, R.attr.b2m, R.attr.b2n, R.attr.b2o, R.attr.b2p, R.attr.b2q});
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…eable.NewProgressSeekBar)");
        this.LIZ = obtainStyledAttributes.getColor(3, R.attr.cq);
        this.LIZIZ = obtainStyledAttributes.getColor(2, R.attr.d1);
        this.LIZJ = obtainStyledAttributes.getDimension(4, C7MY.LIZIZ(46));
        this.LIZLLL = obtainStyledAttributes.getDimension(5, C7MY.LIZIZ(8));
        this.LJ = obtainStyledAttributes.getDimension(1, C7MY.LIZIZ(20));
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = obtainStyledAttributes.getResourceId(0, 0);
        c2068389v.LJ = Integer.valueOf(R.attr.dm);
        this.LJFF = c2068389v.LIZ(context);
        Paint paint = new Paint();
        this.LJI = paint;
        this.LJII = new RectF();
        paint.setAntiAlias(true);
    }
}
