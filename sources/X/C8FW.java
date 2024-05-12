package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import android.text.style.LineHeightSpan;

/* renamed from: X.8FW, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8FW implements LeadingMarginSpan, LineHeightSpan {
    public final int LJLIL;

    public C8FW(int i) {
        this.LJLIL = i;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return 6 + this.LJLIL;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        if (i2 == ((Spanned) charSequence).getSpanEnd(this)) {
            int i5 = fontMetricsInt.descent;
            int i6 = 6 - (((i4 + i5) - fontMetricsInt.ascent) - i3);
            if (i6 > 0) {
                fontMetricsInt.descent = i5 + i6;
            }
            int i7 = fontMetricsInt.bottom;
            int i8 = 6 - (((i4 + i7) - fontMetricsInt.top) - i3);
            if (i8 > 0) {
                fontMetricsInt.bottom = i7 + i8;
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        if (!z) {
            return;
        }
        int lineTop = layout.getLineTop(layout.getLineForOffset(((Spanned) charSequence).getSpanStart(this)));
        if (i2 < 0) {
            i -= 6;
        }
        canvas.drawCircle(i + i2 + 6, ((i5 - lineTop) + i3) / 2.0f, 6, paint);
    }
}
