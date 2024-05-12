package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import kotlin.jvm.internal.o;

/* renamed from: X.8FC, reason: invalid class name */
/* loaded from: classes4.dex */
public class C8FC<T extends View> extends ReplacementSpan {
    public final T LJLIL;
    public int LJLILLLLZI;

    public C8FC(T t) {
        this.LJLIL = t;
        t.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        Context context = t.getContext();
        o.LJIIIIZZ(context, "view.context");
        t.setLayoutDirection(C26338AVi.LIZJ(context) ? 1 : 0);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        o.LJIIIZ(paint, "paint");
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(10000, LiveLayoutPreloadThreadPriority.DEFAULT);
        this.LJLIL.measure(makeMeasureSpec, makeMeasureSpec);
        T t = this.LJLIL;
        t.layout(0, 0, t.getMeasuredWidth(), this.LJLIL.getMeasuredHeight());
        return this.LJLIL.getMeasuredWidth() + this.LJLILLLLZI;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int i6;
        o.LJIIIZ(canvas, "canvas");
        o.LJIIIZ(paint, "paint");
        if (C26338AVi.LIZLLL(this.LJLIL)) {
            i6 = this.LJLILLLLZI;
        } else {
            i6 = 0;
        }
        float f2 = f + i6;
        float measuredHeight = (((i5 - i3) - this.LJLIL.getMeasuredHeight()) / 2.0f) + i3;
        canvas.translate(f2, measuredHeight);
        this.LJLIL.draw(canvas);
        canvas.translate(-f2, -measuredHeight);
    }
}
