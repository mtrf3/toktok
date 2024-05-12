package X;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextPaint;
import android.text.style.LineHeightSpan;
import kotlin.jvm.internal.o;

/* renamed from: X.8FU, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8FU implements LineHeightSpan.WithDensity {
    public final int LJLIL;
    public final Rect LJLILLLLZI = new Rect();
    public boolean LJLJI;

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
    }

    public C8FU(int i) {
        this.LJLIL = i;
    }

    @Override // android.text.style.LineHeightSpan.WithDensity
    public final void chooseHeight(CharSequence text, int i, int i2, int i3, int i4, Paint.FontMetricsInt fm, TextPaint paint) {
        o.LJIIIZ(text, "text");
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(paint, "paint");
        if (Build.VERSION.SDK_INT >= 29) {
            paint.getTextBounds(text, i, i2, this.LJLILLLLZI);
        } else {
            paint.getTextBounds(text.toString(), i, i2, this.LJLILLLLZI);
        }
        Rect rect = this.LJLILLLLZI;
        int max = Math.max(-(rect.top - fm.ascent), rect.bottom - fm.descent);
        int i5 = fm.descent;
        int i6 = fm.ascent;
        int i7 = i5 - i6;
        int i8 = (max * 2) + i7;
        int i9 = this.LJLIL;
        if (i8 < i9) {
            double d = (i9 - i7) / 2.0f;
            fm.top = i6 - ((int) Math.ceil(d));
            int floor = fm.descent + ((int) Math.floor(d));
            fm.bottom = floor;
            fm.ascent = fm.top;
            fm.descent = floor;
            return;
        }
        if (i8 < i9 * 1.5f) {
            fm.top = Math.min(this.LJLILLLLZI.top, i6);
            int max2 = Math.max(this.LJLILLLLZI.bottom, fm.descent);
            fm.bottom = max2;
            fm.ascent = fm.top;
            fm.descent = max2;
            return;
        }
        double d2 = ((i9 * 1.5f) - i7) / 2.0f;
        fm.top = i6 - ((int) Math.ceil(d2));
        int floor2 = fm.descent + ((int) Math.floor(d2));
        fm.bottom = floor2;
        fm.ascent = fm.top;
        fm.descent = floor2;
    }
}
