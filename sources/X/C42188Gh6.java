package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import kotlin.jvm.internal.o;

/* renamed from: X.Gh6, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42188Gh6 extends ReplacementSpan {
    public final int LJLIL;

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        o.LJIIIZ(canvas, "canvas");
        o.LJIIIZ(paint, "paint");
    }

    public C42188Gh6(int i) {
        this.LJLIL = i;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        o.LJIIIZ(paint, "paint");
        return this.LJLIL;
    }
}