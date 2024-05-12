package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;

/* renamed from: X.5Fx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C131975Fx extends View {
    public Paint LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public float LJLJJL;
    public float LJLJJLL;
    public float LJLJL;
    public float LJLJLJ;
    public RectF LJLJLLL;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = this.LJLIL;
        if (paint == null || this.LJLJLLL == null) {
            return;
        }
        paint.setColor(this.LJLJJI);
        this.LJLJLLL.set(0.0f, 0.0f, this.LJLJJL, this.LJLJJLL);
        RectF rectF = this.LJLJLLL;
        float f = this.LJLJLJ;
        canvas.drawRoundRect(rectF, f, f, this.LJLIL);
        this.LJLIL.setColor(this.LJLILLLLZI);
        RectF rectF2 = this.LJLJLLL;
        float f2 = this.LJLJL;
        rectF2.set(f2 * 4.0f, 14.0f * f2, this.LJLJJL - (4.0f * f2), this.LJLJJLL - (f2 * 20.0f));
        RectF rectF3 = this.LJLJLLL;
        float f3 = this.LJLJLJ;
        canvas.drawRoundRect(rectF3, f3, f3, this.LJLIL);
        this.LJLIL.setColor(this.LJLJI);
        float f4 = this.LJLJL;
        float f5 = 27.0f * f4;
        float f6 = 9.0f * f4;
        RectF rectF4 = this.LJLJLLL;
        float f7 = this.LJLJJL;
        float f8 = this.LJLJJLL;
        rectF4.set((f7 - f5) / 2.0f, f8 - (((f4 * 20.0f) + f6) / 2.0f), (f7 + f5) / 2.0f, f8 - (((f4 * 20.0f) - f6) / 2.0f));
        float f9 = f6 / 2.0f;
        canvas.drawRoundRect(this.LJLJLLL, f9, f9, this.LJLIL);
    }

    public C131975Fx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLIL = new Paint();
        this.LJLJJI = Color.argb(191, 255, 255, 255);
        this.LJLILLLLZI = Color.argb(51, 0, 0, 0);
        this.LJLJI = Color.argb(38, 0, 0, 0);
        new Path();
        float applyDimension = TypedValue.applyDimension(1, 1.0f, context.getResources().getDisplayMetrics());
        this.LJLJL = applyDimension;
        this.LJLJLJ = applyDimension * 3.0f;
        this.LJLJLLL = new RectF();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LJLJJL = i;
        this.LJLJJLL = i2;
    }
}
