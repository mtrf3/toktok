package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ReplacementSpan;
import kotlin.jvm.internal.o;

/* renamed from: X.8FR, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8FR extends ReplacementSpan {
    public int LJLIL;
    public int LJLILLLLZI;
    public Rect LJLJI;
    public final int LJLJJI;
    public final Paint.FontMetricsInt LJLJJL = new Paint.FontMetricsInt();
    public final Drawable LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;

    public final void LIZLLL() {
        Rect rect;
        int i;
        Drawable drawable = this.LJLJJLL;
        if (drawable != null) {
            rect = drawable.getBounds();
        } else {
            rect = null;
        }
        this.LJLJI = rect;
        int i2 = 0;
        if (rect != null) {
            i = rect.width();
        } else {
            i = 0;
        }
        this.LJLIL = i;
        Rect rect2 = this.LJLJI;
        if (rect2 != null) {
            i2 = rect2.height();
        }
        this.LJLILLLLZI = i2;
    }

    public final int LIZ(Paint.FontMetricsInt fontMetricsInt) {
        int i;
        int i2 = this.LJLJJI;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    i = this.LJLILLLLZI;
                } else {
                    int i3 = fontMetricsInt.descent;
                    int i4 = fontMetricsInt.ascent;
                    return AnonymousClass030.LIZJ(i3 - i4, this.LJLILLLLZI, 2, i4);
                }
            } else {
                i = this.LJLILLLLZI;
            }
            return -i;
        }
        return fontMetricsInt.descent - this.LJLILLLLZI;
    }

    public C8FR(Drawable drawable, int i) {
        this.LJLJJLL = drawable;
        this.LJLJJI = i;
        LIZLLL();
    }

    public final void LIZIZ(int i, int i2, boolean z) {
        if (z) {
            this.LJLJL = i2;
            this.LJLJLJ = i;
        } else {
            this.LJLJL = i;
            this.LJLJLJ = i2;
        }
    }

    public static /* synthetic */ void LIZJ(C8FR c8fr, boolean z, int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        c8fr.LIZIZ(i, i2, z);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        int i3;
        o.LJIIIZ(paint, "paint");
        int i4 = this.LJLJL + this.LJLJLJ;
        LIZLLL();
        if (fontMetricsInt == null) {
            i3 = this.LJLIL;
        } else {
            int LIZ = LIZ(fontMetricsInt);
            int i5 = this.LJLILLLLZI + LIZ;
            if (LIZ < fontMetricsInt.ascent) {
                fontMetricsInt.ascent = LIZ;
            }
            if (LIZ < fontMetricsInt.top) {
                fontMetricsInt.top = LIZ;
            }
            if (i5 > fontMetricsInt.descent) {
                fontMetricsInt.descent = i5;
            }
            if (i5 > fontMetricsInt.bottom) {
                fontMetricsInt.bottom = i5;
            }
            i3 = this.LJLIL;
        }
        return i3 + i4;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        o.LJIIIZ(canvas, "canvas");
        o.LJIIIZ(paint, "paint");
        paint.getFontMetricsInt(this.LJLJJL);
        int i6 = this.LJLJJI;
        if (i6 != 2) {
            if (i6 != 3) {
                i3 = LIZ(this.LJLJJL) + i4;
            }
        } else {
            i3 = ((i5 + i3) - this.LJLILLLLZI) / 2;
        }
        float f2 = f + this.LJLJL;
        float f3 = i3;
        canvas.translate(f2, f3);
        Drawable drawable = this.LJLJJLL;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        canvas.translate(-f2, -f3);
    }
}
