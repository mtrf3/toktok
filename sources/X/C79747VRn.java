package X;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.text.style.LineHeightSpan;

/* renamed from: X.VRn, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79747VRn implements LineHeightSpan {
    public final int LJLIL;
    public final boolean LJLILLLLZI;

    public final int hashCode() {
        return this.LJLIL + 31;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C79747VRn) || this.LJLIL != ((C79747VRn) obj).LJLIL) {
            return false;
        }
        return true;
    }

    public C79747VRn(float f, boolean z) {
        this.LJLIL = (int) Math.ceil(f);
        this.LJLILLLLZI = z;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        if (this.LJLILLLLZI) {
            int i5 = fontMetricsInt.descent;
            int i6 = fontMetricsInt.ascent;
            int i7 = i5 - i6;
            int i8 = this.LJLIL;
            int i9 = (i8 - i7) / 2;
            int i10 = (i8 - i9) - i7;
            int i11 = fontMetricsInt.bottom;
            int i12 = fontMetricsInt.top;
            int i13 = i11 - i12;
            int i14 = (i8 - i13) / 2;
            int i15 = i6 - i9;
            fontMetricsInt.ascent = i15;
            int i16 = i5 + i10;
            fontMetricsInt.descent = i16;
            int i17 = i12 - i14;
            fontMetricsInt.top = i17;
            int i18 = i11 + ((i8 - i14) - i13);
            fontMetricsInt.bottom = i18;
            if (i16 < 0) {
                fontMetricsInt.ascent = i15 - i16;
                fontMetricsInt.descent = 0;
            }
            int i19 = fontMetricsInt.ascent;
            if (i19 > 0) {
                fontMetricsInt.descent -= i19;
                fontMetricsInt.ascent = 0;
            }
            if (i18 < 0) {
                fontMetricsInt.top = i17 - i18;
                fontMetricsInt.bottom = 0;
            }
            int i20 = fontMetricsInt.top;
            if (i20 > 0) {
                fontMetricsInt.bottom -= i20;
                fontMetricsInt.top = 0;
            }
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (C79748VRo c79748VRo : (C79748VRo[]) spannableStringBuilder.getSpans(i, i2, C79748VRo.class)) {
                c79748VRo.getClass();
                int i21 = fontMetricsInt.ascent;
                int i22 = c79748VRo.LJLJI;
                if (i21 > i22) {
                    fontMetricsInt.ascent = i22;
                }
                int i23 = fontMetricsInt.descent;
                int i24 = i22 + c79748VRo.LJLJJLL;
                if (i23 < i24) {
                    fontMetricsInt.descent = i24;
                }
            }
            for (AbstractC79742VRi abstractC79742VRi : (AbstractC79742VRi[]) spannableStringBuilder.getSpans(i, i2, AbstractC79742VRi.class)) {
                abstractC79742VRi.getClass();
                int i25 = fontMetricsInt.ascent;
                int i26 = abstractC79742VRi.LJLJI;
                if (i25 > i26) {
                    fontMetricsInt.ascent = i26;
                }
                int i27 = fontMetricsInt.descent;
                int i28 = i26 + abstractC79742VRi.LJLJJLL;
                if (i27 < abstractC79742VRi.LJLLI + i28) {
                    fontMetricsInt.descent = i28;
                }
            }
            return;
        }
        int i29 = fontMetricsInt.descent;
        int i30 = this.LJLIL;
        if (i29 > i30) {
            int min = Math.min(i30, i29);
            fontMetricsInt.descent = min;
            fontMetricsInt.bottom = min;
            fontMetricsInt.ascent = 0;
            fontMetricsInt.top = 0;
            return;
        }
        int i31 = fontMetricsInt.ascent;
        if ((-i31) + i29 > i30) {
            fontMetricsInt.bottom = i29;
            int i32 = (-i30) + i29;
            fontMetricsInt.ascent = i32;
            fontMetricsInt.top = i32;
            return;
        }
        int i33 = fontMetricsInt.bottom;
        if ((-i31) + i33 > i30) {
            fontMetricsInt.top = i31;
            fontMetricsInt.bottom = i31 + i30;
            return;
        }
        if ((-fontMetricsInt.top) + i33 > i30) {
            fontMetricsInt.top = i33 - i30;
            return;
        }
        int round = Math.round((i30 - ((-r1) + i33)) / 2.0f);
        int round2 = Math.round((this.LJLIL - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2.0f);
        fontMetricsInt.top -= round;
        fontMetricsInt.bottom += round;
        fontMetricsInt.ascent -= round2;
        fontMetricsInt.descent += round2;
    }
}
