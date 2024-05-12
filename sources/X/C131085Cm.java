package X;

import Y.ARunnableS38S0100000_2;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import defpackage.a1;

/* renamed from: X.5Cm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C131085Cm extends View {
    public final Paint LJLIL;
    public final long LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;
    public final int LJLJJLL;
    public final RectF LJLJL;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        long j;
        float height;
        super.onDraw(canvas);
        int width = (getWidth() - this.LJLJJI) / (this.LJLJJL - 1);
        long currentTimeMillis = (System.currentTimeMillis() - this.LJLILLLLZI) % this.LJLJI;
        int i = this.LJLJJL;
        float f = 0.0f;
        for (int i2 = 0; i2 < i; i2++) {
            if (currentTimeMillis < 0) {
                j = this.LJLJI + currentTimeMillis;
            } else {
                j = currentTimeMillis;
            }
            if (j < this.LJLJI / 2) {
                height = (0.5f - ((((float) j) * 1.0f) / this.LJLJI)) * (getHeight() - this.LJLJJLL);
            } else {
                height = (((((float) j) * 1.0f) / this.LJLJI) - 0.5f) * (getHeight() - this.LJLJJLL);
            }
            if (canvas != null) {
                RectF rectF = this.LJLJL;
                rectF.set(f, height, this.LJLJJI + f, getHeight() - height);
                int i3 = this.LJLJJI;
                canvas.drawRoundRect(rectF, i3 / 2.0f, i3 / 2.0f, this.LJLIL);
            }
            f += width;
            currentTimeMillis -= 100;
        }
        postDelayed(new ARunnableS38S0100000_2(this, 60), 50L);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C131085Cm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        Paint paint = new Paint(1);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        this.LJLIL = paint;
        this.LJLILLLLZI = System.currentTimeMillis();
        this.LJLJI = 600;
        this.LJLJJI = C7MY.LIZIZ(2);
        this.LJLJJL = 6;
        this.LJLJJLL = AnonymousClass391.LIZ(4.5d);
        this.LJLJL = new RectF();
    }
}
