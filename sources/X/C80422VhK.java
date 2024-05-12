package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: X.VhK, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80422VhK extends C80418VhG {
    public final Paint LLFF;
    public final RectF LLFFF;
    public int LLFII;

    public C80422VhK() {
        this(null);
    }

    public C80422VhK(C80416VhE c80416VhE) {
        super(c80416VhE == null ? new C80416VhE() : c80416VhE);
        Paint paint = new Paint(1);
        this.LLFF = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.LLFFF = new RectF();
    }

    @Override // X.C80418VhG, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (callback instanceof View) {
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, null);
            }
        } else {
            this.LLFII = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null);
        }
        super.draw(canvas);
        canvas.drawRect(this.LLFFF, this.LLFF);
        if (!(getCallback() instanceof View)) {
            canvas.restoreToCount(this.LLFII);
        }
    }

    public final void LJIIZILJ(float f, float f2, float f3, float f4) {
        RectF rectF = this.LLFFF;
        if (f != rectF.left || f2 != rectF.top || f3 != rectF.right || f4 != rectF.bottom) {
            rectF.set(f, f2, f3, f4);
            invalidateSelf();
        }
    }
}
