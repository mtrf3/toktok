package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import kotlin.jvm.internal.o;

/* renamed from: X.4cD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C113094cD extends RelativeLayout {
    public float[] LJLIL;
    public final Path LJLILLLLZI;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C113094cD(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        canvas.clipPath(this.LJLILLLLZI);
        super.dispatchDraw(canvas);
    }

    public final void setRoundingParams(C4AH config) {
        o.LJIIIZ(config, "config");
        float f = config.LJLIL;
        float f2 = config.LJLILLLLZI;
        float f3 = config.LJLJI;
        float f4 = config.LJLJJI;
        this.LJLIL = new float[]{f, f, f2, f2, f3, f3, f4, f4};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C113094cD(android.content.Context r2, android.util.AttributeSet r3, int r4) {
        /*
            r1 = this;
            r0 = r4 & 2
            if (r0 == 0) goto L5
            r3 = 0
        L5:
            java.lang.String r0 = "context"
            defpackage.a1.LJFF(r2, r0)
            r0 = 0
            r1.<init>(r2, r3, r0)
            r0 = 8
            float[] r0 = new float[r0]
            r0 = {x0020: FILL_ARRAY_DATA , data: [0, 0, 0, 0, 0, 0, 0, 0} // fill-array
            r1.LJLIL = r0
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r1.LJLILLLLZI = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113094cD.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LJLILLLLZI.addRoundRect(new RectF(0.0f, 0.0f, getWidth(), getHeight()), this.LJLIL, Path.Direction.CW);
    }
}
