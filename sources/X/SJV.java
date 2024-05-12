package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Region;
import android.util.AttributeSet;
import defpackage.a1;

/* loaded from: classes13.dex */
public final class SJV extends C119624mk {
    public final Path LJLLLLLL;

    @Override // X.VA9, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
    }

    @Override // X.C72433Sbl, X.VA9, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (canvas != null) {
            canvas.save();
            canvas.clipPath(this.LJLLLLLL, Region.Op.DIFFERENCE);
            super.onDraw(canvas);
            canvas.restore();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SJV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        Path path = new Path();
        this.LJLLLLLL = path;
        float LJIIZILJ = C32151Nz.LJIIZILJ(9);
        float LJIIZILJ2 = C32151Nz.LJIIZILJ(16);
        float LJIIZILJ3 = C32151Nz.LJIIZILJ(12);
        float LJIIZILJ4 = C32151Nz.LJIIZILJ(28);
        if (C26338AVi.LIZJ(context)) {
            path.addCircle((LJIIZILJ4 - LJIIZILJ2) - LJIIZILJ, LJIIZILJ3 + LJIIZILJ, LJIIZILJ, Path.Direction.CCW);
        } else {
            path.addCircle(LJIIZILJ2 + LJIIZILJ, LJIIZILJ3 + LJIIZILJ, LJIIZILJ, Path.Direction.CCW);
        }
    }
}
