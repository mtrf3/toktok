package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.mt.protector.impl.color.ColorProtector;

/* renamed from: X.5US, reason: invalid class name */
/* loaded from: classes3.dex */
public class C5US extends View {
    public final Paint LJLIL;
    public final int[] LJLILLLLZI;
    public final float[] LJLJI;

    public int[] LIZ() {
        return new int[]{ColorProtector.parseColor("#00000000"), ColorProtector.parseColor("#80000000"), ColorProtector.parseColor("#b3000000"), ColorProtector.parseColor("#cc000000"), ColorProtector.parseColor("#e6000000")};
    }

    public float[] LIZIZ() {
        return new float[]{0.0f, 0.13f, 0.22f, 0.31f, 0.55f};
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.LJLIL.setShader(new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, this.LJLILLLLZI, this.LJLJI, Shader.TileMode.CLAMP));
        canvas.drawPaint(this.LJLIL);
    }

    public C5US(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C5US(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint();
        this.LJLIL = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.LJLILLLLZI = LIZ();
        this.LJLJI = LIZIZ();
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }
}
