package X;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import kotlin.jvm.internal.o;

/* renamed from: X.0b9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10510b9 implements LineHeightSpan {
    public final float LJLIL;
    public final int LJLILLLLZI = 0;
    public final int LJLJI;
    public final boolean LJLJJI;
    public final boolean LJLJJL;
    public final float LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public int LJLL;
    public int LJLLI;
    public int LJLLILLLL;

    public C10510b9(float f, float f2, int i, boolean z, boolean z2) {
        this.LJLIL = f;
        this.LJLJI = i;
        this.LJLJJI = z;
        this.LJLJJL = z2;
        this.LJLJJLL = f2;
        if ((0.0f <= f2 && f2 <= 1.0f) || f2 == -1.0f) {
            return;
        }
        "topRatio should be in [0..1] range or -1".toString();
        throw new IllegalStateException("topRatio should be in [0..1] range or -1");
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence text, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        boolean z;
        boolean z2;
        int i5;
        int i6;
        double ceil;
        o.LJIIIZ(text, "text");
        o.LJIIIZ(fontMetricsInt, "fontMetricsInt");
        if (fontMetricsInt.descent - fontMetricsInt.ascent <= 0) {
            return;
        }
        if (i == this.LJLILLLLZI) {
            z = true;
        } else {
            z = false;
        }
        if (i2 == this.LJLJI) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            if (z2 && this.LJLJJI && this.LJLJJL) {
                return;
            }
            int ceil2 = (int) Math.ceil(this.LJLIL);
            int i7 = ceil2 - (fontMetricsInt.descent - fontMetricsInt.ascent);
            float f = this.LJLJJLL;
            if (f == -1.0f) {
                f = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
            }
            if (i7 <= 0) {
                ceil = Math.ceil(i7 * f);
            } else {
                ceil = Math.ceil((1.0f - f) * i7);
            }
            int i8 = fontMetricsInt.descent;
            int i9 = ((int) ceil) + i8;
            this.LJLJLLL = i9;
            int i10 = i9 - ceil2;
            this.LJLJLJ = i10;
            if (this.LJLJJI) {
                i10 = fontMetricsInt.ascent;
            }
            this.LJLJL = i10;
            if (this.LJLJJL) {
                i9 = i8;
            }
            this.LJLL = i9;
            this.LJLLI = fontMetricsInt.ascent - i10;
            this.LJLLILLLL = i9 - i8;
            i5 = this.LJLJL;
        } else {
            i5 = this.LJLJLJ;
        }
        fontMetricsInt.ascent = i5;
        if (z2) {
            i6 = this.LJLL;
        } else {
            i6 = this.LJLJLLL;
        }
        fontMetricsInt.descent = i6;
    }
}
