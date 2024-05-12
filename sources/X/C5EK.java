package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;
import defpackage.a1;

/* renamed from: X.5EK, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5EK extends View {
    public final Paint LJLIL;
    public final RectF LJLILLLLZI;
    public final RectF LJLJI;

    public final RectF getRectL() {
        return this.LJLILLLLZI;
    }

    public final RectF getRectR() {
        return this.LJLJI;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (canvas != null) {
            canvas.drawArc(this.LJLILLLLZI, 19.0f, 231.0f, false, this.LJLIL);
            canvas.drawArc(this.LJLJI, 199.0f, 231.0f, false, this.LJLIL);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5EK(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        Paint paint = new Paint();
        this.LJLIL = paint;
        this.LJLILLLLZI = new RectF();
        this.LJLJI = new RectF();
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(KL2.LIZJ(context, 2.0f));
        paint.setColor(AnonymousClass636.LJIIIIZZ(R.attr.e5, context));
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        RectF rectF = this.LJLILLLLZI;
        rectF.left = O6R.LJJIIZ(C32151Nz.LJIIZILJ(1));
        rectF.right = AnonymousClass391.LIZ(36.2d);
        rectF.top = AnonymousClass391.LIZ(10.8d);
        rectF.bottom = AnonymousClass391.LIZ(46.8d);
        RectF rectF2 = this.LJLJI;
        rectF2.left = C7MY.LIZIZ(11);
        rectF2.right = C7MY.LIZIZ(47);
        rectF2.top = O6R.LJJIIZ(C32151Nz.LJIIZILJ(1));
        rectF2.bottom = C7MY.LIZIZ(36);
    }
}
