package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.6cG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C164086cG extends SmartImageView {
    public final int LJLJLJ;
    public final int LJLJLLL;
    public final int LJLL;
    public final Paint LJLLI;
    public LinearGradient LJLLILLLL;

    @Override // X.VA9, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
    }

    @Override // X.VA9, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.LJLJLJ <= 0) {
            return;
        }
        int height = getHeight() - this.LJLJLJ;
        if (this.LJLLILLLL == null) {
            LinearGradient linearGradient = new LinearGradient(0.0f, height, 0.0f, getHeight(), new int[]{this.LJLJLLL, this.LJLL}, (float[]) null, Shader.TileMode.CLAMP);
            this.LJLLILLLL = linearGradient;
            this.LJLLI.setShader(linearGradient);
        }
        canvas.drawRect(0.0f, height, getWidth(), getHeight(), this.LJLLI);
    }

    public C164086cG(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C164086cG(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.LJLLI = new Paint();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.abn, R.attr.aoa, R.attr.bel});
        this.LJLJLLL = obtainStyledAttributes.getColor(2, 0);
        this.LJLL = obtainStyledAttributes.getColor(0, 0);
        this.LJLJLJ = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
    }
}
