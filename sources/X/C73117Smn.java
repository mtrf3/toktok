package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.util.AttributeSet;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.Smn, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73117Smn extends C47061t0 {
    public final Paint LLIIJI;
    public boolean LLIIJLIL;

    @Override // X.VA9, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
    }

    @Override // X.C47061t0, android.view.View
    public final void draw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        if (this.LLIIJLIL) {
            canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), this.LLIIJI);
            super.draw(canvas);
            canvas.restore();
            return;
        }
        super.draw(canvas);
    }

    public final void setGray(boolean z) {
        this.LLIIJLIL = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C73117Smn(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C73117Smn(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        Paint paint = new Paint();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        this.LLIIJI = paint;
    }
}
