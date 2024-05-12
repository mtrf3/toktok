package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.5hM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C141765hM extends AppCompatImageView {
    public int LJLIL;
    public int LJLILLLLZI;
    public final Paint LJLJI;
    public final float LJLJJI;
    public RectF LJLJJL;

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C141765hM(Context context) {
        super(context);
        a1.LJFF(context, "context");
        this.LJLIL = 0;
        this.LJLILLLLZI = 0;
        Paint paint = new Paint();
        this.LJLJI = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        float LIZJ = KL2.LIZJ(getContext(), 2);
        this.LJLJJI = LIZJ;
        paint.setStrokeWidth(LIZJ);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        super.onDraw(canvas);
        RectF rectF = this.LJLJJL;
        o.LJI(rectF);
        float f = this.LJLJJI;
        canvas.drawRoundRect(rectF, f, f, this.LJLJI);
    }

    public final void setColor(int i) {
        this.LJLJI.setColor(i);
    }

    public final void setStrokeWidth(int i) {
        this.LJLJI.setStrokeWidth(i);
    }

    public final void LIZ(int i, int i2) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        float f = this.LJLJJI;
        float f2 = 2;
        this.LJLJJL = new RectF(f / f2, f / f2, i - (f / f2), i2 - (f / f2));
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(this.LJLIL, this.LJLILLLLZI);
    }
}
