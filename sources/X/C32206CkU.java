package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.o;

/* renamed from: X.CkU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32206CkU extends C32207CkV {
    public int LJLJI;
    public int LJLJJI;
    public final float[] LJLJJL;
    public float LJLJJLL;
    public final Path LJLJL;
    public final Paint LJLJLJ;
    public final RectF LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32206CkU(Drawable drawable) {
        super(drawable);
        o.LJIIIZ(drawable, "drawable");
        this.LJLJJL = new float[8];
        Path path = new Path();
        this.LJLJL = path;
        Paint paint = new Paint(1);
        this.LJLJLJ = paint;
        this.LJLJLLL = new RectF();
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(paint2.getStrokeWidth());
        paint2.setColor(-1);
        new RectF();
        path.setFillType(Path.FillType.INVERSE_WINDING);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-16777216);
    }

    @Override // X.C32207CkV, android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        o.LJIIIZ(paint, "paint");
        return super.getSize(paint, charSequence, i, i2, fontMetricsInt) + this.LJLJI + this.LJLJJI;
    }

    @Override // X.C32207CkV, android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        boolean z;
        o.LJIIIZ(canvas, "canvas");
        o.LJIIIZ(paint, "paint");
        boolean LIZ = CCJ.LIZ(C15380j0.LIZLLL());
        if (this.LJLJI > 0 && LIZ) {
            canvas.save();
            canvas.translate(this.LJLJI, 0.0f);
            z = true;
        } else {
            z = false;
        }
        if (this.LJLJJI > 0 && !LIZ) {
            canvas.save();
            canvas.translate(this.LJLJJI, 0.0f);
            z = true;
        }
        float LIZ2 = C32207CkV.LIZ(i4, paint.getFontMetricsInt(), getDrawable());
        if (this.LJLJJLL > 0.0f) {
            canvas.saveLayer(f, LIZ2, f + getDrawable().getBounds().width(), LIZ2 + getDrawable().getBounds().height(), null);
        }
        super.draw(canvas, charSequence, i, i2, f, i3, i4, i5, paint);
        if (this.LJLJJLL > 0.0f) {
            this.LJLJLLL.set(f, LIZ2, getDrawable().getBounds().width() + f, getDrawable().getBounds().height() + LIZ2);
            this.LJLJL.reset();
            this.LJLJL.addRoundRect(this.LJLJLLL, this.LJLJJL, Path.Direction.CW);
            canvas.drawPath(this.LJLJL, this.LJLJLJ);
            canvas.restore();
        }
        if (z) {
            canvas.restore();
        }
    }
}
