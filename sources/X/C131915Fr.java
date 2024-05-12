package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import defpackage.a1;

/* renamed from: X.5Fr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C131915Fr extends FrameLayout {
    public final C62822Ol8 LJLIL;
    public final int[] LJLILLLLZI;
    public final float[] LJLJI;
    public final RectF LJLJJI;

    private final Paint getPaint() {
        return (Paint) this.LJLIL.getValue();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (canvas != null) {
            canvas.drawRect(this.LJLJJI, getPaint());
        }
        super.onDraw(canvas);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C131915Fr(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        setWillNotDraw(false);
        this.LJLIL = C221108m2.LIZIZ(C131925Fs.LJLIL);
        this.LJLILLLLZI = new int[]{ColorProtector.parseColor("#00000000"), ColorProtector.parseColor("#4D000000"), ColorProtector.parseColor("#66000000"), ColorProtector.parseColor("#4D000000"), ColorProtector.parseColor("#00000000")};
        this.LJLJI = new float[]{0.0f, 0.08f, 0.53f, 0.92f, 1.0f};
        this.LJLJJI = new RectF();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LJLJJI.set(0.0f, 0.0f, i, i2);
        getPaint().setShader(new LinearGradient(0.0f, 0.0f, this.LJLJJI.width(), 0.0f, this.LJLILLLLZI, this.LJLJI, Shader.TileMode.CLAMP));
    }
}
