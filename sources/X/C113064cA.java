package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.4cA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C113064cA extends FrameLayout {
    public float[] LJLIL;
    public final Path LJLILLLLZI;

    public final float[] getCornerRadius() {
        return this.LJLIL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        canvas.clipPath(this.LJLILLLLZI);
        super.dispatchDraw(canvas);
    }

    public final void setCornerRadius(float[] fArr) {
        o.LJIIIZ(fArr, "<set-?>");
        this.LJLIL = fArr;
    }

    public void setRoundingParams(C4AH config) {
        o.LJIIIZ(config, "config");
        float f = config.LJLIL;
        float f2 = config.LJLILLLLZI;
        float f3 = config.LJLJI;
        float f4 = config.LJLJJI;
        this.LJLIL = new float[]{f, f, f2, f2, f3, f3, f4, f4};
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C113064cA(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C113064cA(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        this.LJLIL = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.LJLILLLLZI = new Path();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LJLILLLLZI.addRoundRect(new RectF(0.0f, 0.0f, getWidth(), getHeight()), this.LJLIL, Path.Direction.CW);
    }
}
