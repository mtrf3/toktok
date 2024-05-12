package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* renamed from: X.0KD, reason: invalid class name */
/* loaded from: classes.dex */
public class C0KD extends View {
    public boolean LJLIL;
    public Paint LJLILLLLZI;
    public float LJLJI;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.LJLIL) {
            canvas.save();
            canvas.drawRect(0.0f, 0.0f, getWidth(), this.LJLJI, this.LJLILLLLZI);
        }
    }

    public void setShadowed(boolean z) {
        if (this.LJLIL != z) {
            this.LJLIL = z;
            invalidate();
        }
    }

    public C0KD(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.LJLILLLLZI == null) {
            this.LJLJI = getHeight();
            Paint paint = new Paint(1);
            this.LJLILLLLZI = paint;
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, this.LJLJI, 0, C259910h.LIZIZ(R.attr.ax0, getContext()), Shader.TileMode.CLAMP));
        }
    }
}
