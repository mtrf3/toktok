package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.zhiliaoapp.musically.R;

/* renamed from: X.LCj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C53873LCj extends View {
    public Paint LJLIL;
    public float LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public float LJLJJL;
    public float LJLJJLL;
    public int LJLJL;
    public Paint LJLJLJ;

    public C53873LCj(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLIL);
        canvas.drawCircle(this.LJLJI, this.LJLJJI, this.LJLJJLL, this.LJLJLJ);
    }

    public void setFraction(float f) {
        this.LJLJJLL = (this.LJLJL * f) + this.LJLJJL;
        this.LJLJLJ.setStrokeWidth((1.0f - f) * this.LJLILLLLZI);
        postInvalidate();
    }

    public void setSize(float f) {
        this.LJLJJLL = f;
        postInvalidate();
    }

    public void setStrokeWide(float f) {
        this.LJLJLJ.setStrokeWidth((1.0f - f) * this.LJLILLLLZI);
        postInvalidate();
    }

    public void setStrokeWidth(int i) {
        float f = i;
        this.LJLILLLLZI = f;
        this.LJLJLJ.setStrokeWidth(f);
        postInvalidate();
    }

    public C53873LCj(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void LIZ(int i, int i2) {
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 100.0f, 100.0f, i, i2, Shader.TileMode.MIRROR);
        this.LJLIL.setShader(linearGradient);
        this.LJLJLJ.setShader(linearGradient);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.LJLJI = getMeasuredWidth() / 2;
        this.LJLJJI = getMeasuredHeight() / 2;
        float measuredHeight = (getMeasuredHeight() / 2) - getPaddingBottom();
        this.LJLJJL = measuredHeight;
        this.LJLJJLL = measuredHeight;
        this.LJLJL = getPaddingBottom();
    }

    public C53873LCj(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.axr});
        this.LJLILLLLZI = (int) obtainStyledAttributes.getDimension(0, KL2.LIZJ(context, 1.5f));
        obtainStyledAttributes.recycle();
        this.LJLIL = new Paint();
        this.LJLIL.setShader(new LinearGradient(0.0f, 0.0f, 100.0f, 100.0f, ColorProtector.parseColor("#FF1764"), ColorProtector.parseColor("#ED3495"), Shader.TileMode.MIRROR));
        this.LJLIL.setAntiAlias(true);
        this.LJLIL.setDither(true);
        this.LJLIL.setStyle(Paint.Style.STROKE);
        this.LJLIL.setStrokeWidth(KL2.LIZJ(context, 1.0f));
        Paint paint = new Paint(this.LJLIL);
        this.LJLJLJ = paint;
        paint.setStrokeWidth(this.LJLILLLLZI);
    }
}
