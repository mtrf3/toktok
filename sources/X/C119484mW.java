package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import defpackage.a1;

/* renamed from: X.4mW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C119484mW extends View {
    public int LJLIL;
    public boolean LJLILLLLZI;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(this.LJLIL);
        paint.setAntiAlias(true);
        if (this.LJLILLLLZI) {
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(2)));
            if (canvas != null) {
                canvas.drawCircle(O6R.LJJIIZ(C32151Nz.LJIIZILJ(22)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(22)), C7MY.LIZIZ(19), paint);
            }
        }
        paint.setStyle(Paint.Style.FILL);
        if (canvas != null) {
            canvas.drawCircle(O6R.LJJIIZ(C32151Nz.LJIIZILJ(22)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(22)), C7MY.LIZIZ(16), paint);
        }
    }

    public final void setNeedRing(boolean z) {
        this.LJLILLLLZI = z;
    }

    public final void setPaintColor(int i) {
        this.LJLIL = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C119484mW(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLIL = -1;
    }
}
