package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.util.AttributeSet;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class G4P extends C47121t6 {
    public final Paint LJLLLL;
    public boolean LJLLLLLL;

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        if (this.LJLLLLLL) {
            canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), this.LJLLLL);
            super.draw(canvas);
            canvas.restore();
            return;
        }
        super.draw(canvas);
    }

    public final void setGray(boolean z) {
        this.LJLLLLLL = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G4P(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        Paint paint = new Paint();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        this.LJLLLL = paint;
    }
}
