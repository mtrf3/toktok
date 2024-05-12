package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.5GC, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5GC extends View {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final Paint LJLJI;
    public float LJLJJI;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int height;
        o.LJIIIZ(canvas, "canvas");
        super.onDraw(canvas);
        if (getWidth() < getHeight()) {
            height = getWidth();
        } else {
            height = getHeight();
        }
        float f = height;
        float f2 = 2;
        float width = ((getWidth() - f) / f2) + (C32151Nz.LJIIZILJ(Float.valueOf(3.0f)) / f2);
        float LJIIZILJ = (C32151Nz.LJIIZILJ(Float.valueOf(3.0f)) / f2) + ((getHeight() - f) / f2);
        float LJIIZILJ2 = (width + f) - C32151Nz.LJIIZILJ(Float.valueOf(3.0f));
        float LJIIZILJ3 = (f + LJIIZILJ) - C32151Nz.LJIIZILJ(Float.valueOf(3.0f));
        float f3 = (this.LJLJJI / 100.0f) * 360.0f;
        this.LJLJI.setColor(this.LJLIL);
        canvas.drawArc(width, LJIIZILJ, LJIIZILJ2, LJIIZILJ3, -90.0f, 360.0f, false, this.LJLJI);
        this.LJLJI.setColor(this.LJLILLLLZI);
        canvas.drawArc(width, LJIIZILJ, LJIIZILJ2, LJIIZILJ3, -90.0f, f3, false, this.LJLJI);
    }

    public final void setProgress(float f) {
        if (f < 0.0f) {
            this.LJLJJI = 0.0f;
        } else if (f > 100.0f) {
            this.LJLJJI = 100.0f;
        } else {
            this.LJLJJI = f;
        }
        postInvalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5GC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.jt);
        a1.LJFF(context, "context");
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(C32151Nz.LJIIZILJ(Float.valueOf(3.0f)));
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.LJLJI = paint;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.bqk, R.attr.bql}, R.attr.jt, 0);
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…rogress, defStyleAttr, 0)");
        int color = obtainStyledAttributes.getColor(1, 0);
        int color2 = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        this.LJLIL = color;
        this.LJLILLLLZI = color2;
    }
}
