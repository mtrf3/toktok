package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TBF extends View {
    public final Paint LJLIL;
    public int[] LJLILLLLZI;
    public final float[] LJLJI;
    public final float LJLJJI;
    public final RectF LJLJJL;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        RectF rectF = this.LJLJJL;
        float f = this.LJLJJI;
        float f2 = 2;
        rectF.set(f / f2, f / f2, getWidth() - (this.LJLJJI / f2), getHeight() - (this.LJLJJI / f2));
        canvas.drawOval(this.LJLJJL, this.LJLIL);
    }

    public final void setGradientColors(int[] newColors) {
        o.LJIIIZ(newColors, "newColors");
        this.LJLILLLLZI = newColors;
        this.LJLIL.setShader(new LinearGradient(0.0f, 0.0f, getWidth(), getHeight(), this.LJLILLLLZI, this.LJLJI, Shader.TileMode.CLAMP));
        invalidate();
        C0NB.LJIIIZ("redesign", "setGradientColors");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TBF(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C04560Fw.LIZ(context, "context", attributeSet, "attrs");
        Paint paint = new Paint();
        this.LJLIL = paint;
        this.LJLILLLLZI = new int[]{C15380j0.LIZIZ(R.color.acm), C15380j0.LIZIZ(R.color.acm)};
        this.LJLJI = new float[]{0.0f, 1.0f};
        float LIZ = C15380j0.LIZ(1.0f);
        this.LJLJJI = LIZ;
        this.LJLJJL = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(LIZ);
        paint.setAntiAlias(true);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        this.LJLIL.setShader(new LinearGradient(0.0f, 0.0f, i, i2, this.LJLILLLLZI, this.LJLJI, Shader.TileMode.CLAMP));
    }
}
