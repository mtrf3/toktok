package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.8I2, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8I2 extends C2A8 {
    public final int LJLLLL;
    public int LJLLLLLL;
    public final int LJLZ;
    public final int LJZ;
    public final int LJZI;
    public final RectF LJZL;
    public long LL;
    public float LLD;

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        getPaint().setStyle(Paint.Style.FILL);
        getPaint().setColor(this.LJLZ);
        canvas.drawArc(this.LJZL, 270.0f, 360.0f - this.LLD, true, getPaint());
        getPaint().setColor(this.LJLLLLLL);
        RectF rectF = this.LJZL;
        float f = this.LLD;
        canvas.drawArc(rectF, (360.0f - f) + 270.0f, f, true, getPaint());
        getPaint().setStyle(Paint.Style.STROKE);
        getPaint().setColor(this.LJLLLL);
        getPaint().setStrokeWidth(this.LJZI);
        canvas.drawArc(this.LJZL, 0.0f, 360.0f, true, getPaint());
        super.onDraw(canvas);
    }

    public final void setRemainTime(long j) {
        float f = this.LLD;
        long j2 = this.LL;
        if (j2 > 0 && j >= 0) {
            this.LLD = (((float) j) * 360.0f) / ((float) j2);
        }
        if (f == this.LLD) {
            return;
        }
        invalidate();
    }

    public final void setSolidColor(int i) {
        this.LJLLLLLL = i;
        invalidate();
    }

    public final void setTotalTime(long j) {
        this.LL = j;
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8I2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLLLL = -16777216;
        this.LJLLLLLL = -1;
        this.LJLZ = -1;
        this.LLD = 360.0f;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a38, R.attr.a39, R.attr.a3_, R.attr.a3a, R.attr.a3b});
            o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…le.TimeStickerCircleView)");
            this.LJLLLL = obtainStyledAttributes.getColor(3, -16777216);
            this.LJLLLLLL = obtainStyledAttributes.getColor(2, this.LJLLLLLL);
            this.LJLZ = obtainStyledAttributes.getColor(1, -1);
            this.LJZ = obtainStyledAttributes.getDimensionPixelSize(0, this.LJZ);
            this.LJZI = obtainStyledAttributes.getDimensionPixelSize(4, this.LJZI);
            obtainStyledAttributes.recycle();
        }
        float f = this.LJZI;
        float f2 = (this.LJZ * 2) + r1 + 0.0f;
        this.LJZL = new RectF(f, f, f2, f2);
    }
}
