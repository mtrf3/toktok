package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import android.text.style.LineHeightSpan;
import kotlin.jvm.internal.o;

/* renamed from: X.8FX, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8FX implements LeadingMarginSpan, LineHeightSpan {
    public final Bitmap LJLIL;
    public final int LJLILLLLZI;

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return this.LJLIL.getWidth() + this.LJLILLLLZI;
    }

    public C8FX(Bitmap bitmap, int i) {
        this.LJLIL = bitmap;
        this.LJLILLLLZI = i;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence text, int i, int i2, int i3, int i4, Paint.FontMetricsInt fm) {
        o.LJIIIZ(text, "text");
        o.LJIIIZ(fm, "fm");
        if (i2 == ((Spanned) text).getSpanEnd(this)) {
            int height = this.LJLIL.getHeight();
            int i5 = fm.descent;
            int i6 = height - (((i4 + i5) - fm.ascent) - i3);
            if (i6 > 0) {
                fm.descent = i5 + i6;
            }
            int i7 = fm.bottom;
            int i8 = height - (((i4 + i7) - fm.top) - i3);
            if (i8 > 0) {
                fm.bottom = i7 + i8;
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas c, Paint p, int i, int i2, int i3, int i4, int i5, CharSequence text, int i6, int i7, boolean z, Layout layout) {
        o.LJIIIZ(c, "c");
        o.LJIIIZ(p, "p");
        o.LJIIIZ(text, "text");
        o.LJIIIZ(layout, "layout");
        if (!z) {
            return;
        }
        int lineTop = layout.getLineTop(layout.getLineForOffset(((Spanned) text).getSpanStart(this)));
        if (i2 < 0) {
            i -= this.LJLIL.getWidth();
        }
        c.drawBitmap(this.LJLIL, i, (((i5 - lineTop) + i3) / 2.0f) - (this.LJLIL.getHeight() / 2.0f), p);
    }
}
