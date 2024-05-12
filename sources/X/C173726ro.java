package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.6ro, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C173726ro extends View {
    public final float LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public final float LJLJJI;
    public final float LJLJJL;
    public final Paint LJLJJLL;
    public SweepGradient LJLJL;
    public final RectF LJLJLJ;
    public float LJLJLLL;

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return (int) KL2.LIZJ(getContext(), 25.0f);
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return (int) KL2.LIZJ(getContext(), 25.0f);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.LJLJL == null) {
            SweepGradient sweepGradient = new SweepGradient(0.0f, getMeasuredHeight(), this.LJLILLLLZI, this.LJLJI);
            this.LJLJL = sweepGradient;
            this.LJLJJLL.setShader(sweepGradient);
        }
        float f = this.LJLIL / 2;
        RectF rectF = this.LJLJLJ;
        rectF.left = f;
        rectF.top = f;
        rectF.right = getMeasuredWidth() - f;
        this.LJLJLJ.bottom = getMeasuredHeight() - f;
        float f2 = this.LJLJLLL;
        if (f2 <= this.LJLJJL && canvas != null) {
            canvas.drawArc(this.LJLJLJ, this.LJLJJI, f2, false, this.LJLJJLL);
        }
    }

    public final void setProgressForegroundColor(List<String> colorList) {
        o.LJIIIZ(colorList, "colorList");
        try {
            if (colorList.size() > 1) {
                this.LJLILLLLZI = Color.parseColor((String) ListProtector.get(colorList, 0));
                this.LJLJI = Color.parseColor((String) ListProtector.get(colorList, 1));
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C173726ro(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
        this.LJLJJI = -90.0f;
        Paint paint = new Paint(1);
        this.LJLJJLL = paint;
        this.LJLJLJ = new RectF();
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.b63, R.attr.b64, R.attr.b65, R.attr.b67, R.attr.b68, R.attr.b6_}, 0, 0);
        try {
            float dimension = obtainStyledAttributes.getDimension(5, 0.0f);
            this.LJLIL = dimension;
            this.LJLILLLLZI = obtainStyledAttributes.getColor(4, 0);
            this.LJLJI = obtainStyledAttributes.getColor(3, 0);
            obtainStyledAttributes.getInteger(0, 0);
            obtainStyledAttributes.recycle();
            paint.setStrokeWidth(dimension);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            this.LJLJJI = -90.0f;
            this.LJLJJL = 360.0f;
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int i3 = 0;
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    size = 0;
                }
            } else {
                size = getPaddingRight() + getPaddingLeft() + getSuggestedMinimumWidth();
            }
        } else {
            size = Math.max(getPaddingRight() + getPaddingLeft() + getSuggestedMinimumWidth(), size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 0) {
                if (mode2 == 1073741824) {
                    i3 = size2;
                }
            } else {
                i3 = getPaddingBottom() + getPaddingTop() + getSuggestedMinimumHeight();
            }
        } else {
            i3 = Math.min(getPaddingBottom() + getPaddingTop() + getSuggestedMinimumHeight(), size2);
        }
        setMeasuredDimension(size, i3);
    }
}
