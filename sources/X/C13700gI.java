package X;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;

/* renamed from: X.0gI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13700gI {
    public final TextPaint LIZ;
    public final TextDirectionHeuristic LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final PrecomputedText.Params LJ;

    public final int hashCode() {
        if (Build.VERSION.SDK_INT >= 24) {
            return Objects.hash(Float.valueOf(this.LIZ.getTextSize()), Float.valueOf(this.LIZ.getTextScaleX()), Float.valueOf(this.LIZ.getTextSkewX()), Float.valueOf(this.LIZ.getLetterSpacing()), Integer.valueOf(this.LIZ.getFlags()), this.LIZ.getTextLocales(), this.LIZ.getTypeface(), Boolean.valueOf(this.LIZ.isElegantTextHeight()), this.LIZIZ, Integer.valueOf(this.LIZJ), Integer.valueOf(this.LIZLLL));
        }
        return Objects.hash(Float.valueOf(this.LIZ.getTextSize()), Float.valueOf(this.LIZ.getTextScaleX()), Float.valueOf(this.LIZ.getTextSkewX()), Float.valueOf(this.LIZ.getLetterSpacing()), Integer.valueOf(this.LIZ.getFlags()), this.LIZ.getTextLocale(), this.LIZ.getTypeface(), Boolean.valueOf(this.LIZ.isElegantTextHeight()), this.LIZIZ, Integer.valueOf(this.LIZJ), Integer.valueOf(this.LIZLLL));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("textSize=");
        LIZ.append(this.LIZ.getTextSize());
        sb.append(X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(", textScaleX=");
        LIZ2.append(this.LIZ.getTextScaleX());
        sb.append(X1D.LIZIZ(LIZ2));
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(", textSkewX=");
        LIZ3.append(this.LIZ.getTextSkewX());
        sb.append(X1D.LIZIZ(LIZ3));
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append(", letterSpacing=");
        LIZ4.append(this.LIZ.getLetterSpacing());
        sb.append(X1D.LIZIZ(LIZ4));
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append(", elegantTextHeight=");
        LIZ5.append(this.LIZ.isElegantTextHeight());
        sb.append(X1D.LIZIZ(LIZ5));
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            StringBuilder LIZ6 = X1D.LIZ();
            LIZ6.append(", textLocale=");
            LIZ6.append(this.LIZ.getTextLocales());
            sb.append(X1D.LIZIZ(LIZ6));
        } else {
            StringBuilder LIZ7 = X1D.LIZ();
            LIZ7.append(", textLocale=");
            LIZ7.append(this.LIZ.getTextLocale());
            sb.append(X1D.LIZIZ(LIZ7));
        }
        StringBuilder LIZ8 = X1D.LIZ();
        LIZ8.append(", typeface=");
        LIZ8.append(this.LIZ.getTypeface());
        sb.append(X1D.LIZIZ(LIZ8));
        if (i >= 26) {
            StringBuilder LIZ9 = X1D.LIZ();
            LIZ9.append(", variationSettings=");
            LIZ9.append(this.LIZ.getFontVariationSettings());
            sb.append(X1D.LIZIZ(LIZ9));
        }
        StringBuilder LIZ10 = X1D.LIZ();
        LIZ10.append(", textDir=");
        LIZ10.append(this.LIZIZ);
        sb.append(X1D.LIZIZ(LIZ10));
        StringBuilder LIZ11 = X1D.LIZ();
        LIZ11.append(", breakStrategy=");
        LIZ11.append(this.LIZJ);
        sb.append(X1D.LIZIZ(LIZ11));
        StringBuilder LIZ12 = X1D.LIZ();
        LIZ12.append(", hyphenationFrequency=");
        LIZ12.append(this.LIZLLL);
        sb.append(X1D.LIZIZ(LIZ12));
        sb.append("}");
        return sb.toString();
    }

    public C13700gI(PrecomputedText.Params params) {
        this.LIZ = params.getTextPaint();
        this.LIZIZ = params.getTextDirection();
        this.LIZJ = params.getBreakStrategy();
        this.LIZLLL = params.getHyphenationFrequency();
        this.LJ = Build.VERSION.SDK_INT < 29 ? null : params;
    }

    public final boolean LIZ(C13700gI c13700gI) {
        int i = Build.VERSION.SDK_INT;
        if ((i >= 23 && (this.LIZJ != c13700gI.LIZJ || this.LIZLLL != c13700gI.LIZLLL)) || this.LIZ.getTextSize() != c13700gI.LIZ.getTextSize() || this.LIZ.getTextScaleX() != c13700gI.LIZ.getTextScaleX() || this.LIZ.getTextSkewX() != c13700gI.LIZ.getTextSkewX() || this.LIZ.getLetterSpacing() != c13700gI.LIZ.getLetterSpacing() || !TextUtils.equals(this.LIZ.getFontFeatureSettings(), c13700gI.LIZ.getFontFeatureSettings()) || this.LIZ.getFlags() != c13700gI.LIZ.getFlags()) {
            return false;
        }
        if (i >= 24) {
            if (!this.LIZ.getTextLocales().equals(c13700gI.LIZ.getTextLocales())) {
                return false;
            }
        } else if (!this.LIZ.getTextLocale().equals(c13700gI.LIZ.getTextLocale())) {
            return false;
        }
        if (this.LIZ.getTypeface() == null) {
            if (c13700gI.LIZ.getTypeface() != null) {
                return false;
            }
            return true;
        }
        if (!this.LIZ.getTypeface().equals(c13700gI.LIZ.getTypeface())) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13700gI)) {
            return false;
        }
        C13700gI c13700gI = (C13700gI) obj;
        if (LIZ(c13700gI) && this.LIZIZ == c13700gI.LIZIZ) {
            return true;
        }
        return false;
    }

    public C13700gI(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.LJ = new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
        } else {
            this.LJ = null;
        }
        this.LIZ = textPaint;
        this.LIZIZ = textDirectionHeuristic;
        this.LIZJ = i;
        this.LIZLLL = i2;
    }
}
