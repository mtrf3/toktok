package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.8I1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8I1 extends C2A8 {
    public final int LJLLLL;
    public int LJLLLLLL;
    public final int LJLZ;
    public final int LJZ;
    public final int LJZI;
    public final RectF LJZL;
    public final LinearGradient LL;
    public long LLD;
    public float LLF;

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        getPaint().setStyle(Paint.Style.FILL);
        getPaint().setColor(this.LJLZ);
        canvas.drawArc(this.LJZL, 270.0f, 360.0f - this.LLF, true, getPaint());
        getPaint();
        getPaint().setShader(this.LL);
        RectF rectF = this.LJZL;
        float f = this.LLF;
        canvas.drawArc(rectF, (360.0f - f) + 270.0f, f, true, getPaint());
        getPaint().setStyle(Paint.Style.STROKE);
        getPaint().setColor(this.LJLLLL);
        getPaint().setShader(null);
        getPaint().setStrokeWidth(this.LJZI);
        canvas.drawArc(this.LJZL, 0.0f, 360.0f, true, getPaint());
        super.onDraw(canvas);
    }

    public final void setRemainTime(long j) {
        float f = this.LLF;
        long j2 = this.LLD;
        if (j2 > 0 && j >= 0) {
            this.LLF = (((float) j) * 360.0f) / ((float) j2);
        }
        if (f == this.LLF) {
            return;
        }
        invalidate();
    }

    public final void setSolidColor(int i) {
        this.LJLLLLLL = i;
        invalidate();
    }

    public final void setTotalTime(long j) {
        this.LLD = j;
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8I1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLLLL = -16777216;
        this.LJLLLLLL = -1;
        this.LJLZ = -1;
        this.LL = new LinearGradient(0.0f, 0.0f, 0.0f, C15380j0.LIZ(12.0f), ColorProtector.parseColor("#3DFFE5"), ColorProtector.parseColor("#4FBEFF"), Shader.TileMode.CLAMP);
        this.LLF = 360.0f;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a38, R.attr.a39, R.attr.a3_, R.attr.a3a, R.attr.a3b});
            o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…howTimeStickerCircleView)");
            this.LJLLLL = obtainStyledAttributes.getColor(3, -16777216);
            this.LJLLLLLL = obtainStyledAttributes.getColor(2, this.LJLLLLLL);
            this.LJLZ = obtainStyledAttributes.getColor(1, -1);
            this.LJZ = obtainStyledAttributes.getDimensionPixelSize(0, this.LJZ);
            this.LJZI = obtainStyledAttributes.getDimensionPixelSize(4, this.LJZI);
            obtainStyledAttributes.recycle();
        }
        float f = this.LJZI;
        float f2 = (this.LJZ * 2) + r2 + 0.0f;
        this.LJZL = new RectF(f, f, f2, f2);
    }
}
