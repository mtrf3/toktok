package X;

import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: X.VRo, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79748VRo extends AbstractC79752VRs {
    public int LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
    }

    public C79748VRo() {
        if (this.LJLJJL) {
            this.LJLIL = 1;
        } else {
            this.LJLIL = 0;
        }
        this.LJLILLLLZI = 0.0f;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        int i3;
        float f;
        int i4;
        if (fontMetricsInt != null) {
            if (fontMetricsInt.descent == fontMetricsInt.ascent) {
                fontMetricsInt.ascent = paint.getFontMetricsInt().ascent;
                fontMetricsInt.descent = paint.getFontMetricsInt().descent;
            }
            if (this.LJLJJL) {
                if (this.LJLIL == 1 && (i4 = this.LJLJLJ) != 0) {
                    this.LJLJI = -i4;
                } else {
                    this.LJLJI = (int) LIZ(-this.LJLJJLL, 0.0f);
                }
            } else {
                int i5 = fontMetricsInt.descent;
                int i6 = fontMetricsInt.ascent;
                int i7 = i5 - i6;
                int i8 = this.LJLJJLL;
                switch (this.LJLIL) {
                    case 1:
                        i6 = -i8;
                        break;
                    case 2:
                        i3 = i5 - i8;
                        f = i7 * 0.1f;
                        i6 = i3 - ((int) f);
                        break;
                    case 3:
                        i6 += (int) (i7 * 0.1f);
                        break;
                    case 4:
                    case 5:
                        break;
                    case 6:
                    default:
                        i6 = AnonymousClass030.LIZJ(i7, i8, 2, i6);
                        break;
                    case 7:
                    case 8:
                        i6 = i5 - i8;
                        break;
                    case 9:
                        i3 = -i8;
                        f = this.LJLILLLLZI;
                        i6 = i3 - ((int) f);
                        break;
                }
                this.LJLJI = i6;
            }
            int i9 = fontMetricsInt.ascent;
            int i10 = this.LJLJI;
            if (i9 > i10) {
                fontMetricsInt.ascent = i10;
            }
            int i11 = fontMetricsInt.descent;
            int i12 = this.LJLJJLL;
            if (i11 < i10 + i12) {
                fontMetricsInt.descent = i10 + i12;
            }
            int i13 = fontMetricsInt.top;
            int i14 = fontMetricsInt.ascent;
            if (i13 > i14) {
                fontMetricsInt.top = i14;
            }
            int i15 = fontMetricsInt.bottom;
            int i16 = fontMetricsInt.descent;
            if (i15 < i16) {
                fontMetricsInt.bottom = i16;
            }
        }
        return this.LJLJL;
    }
}
