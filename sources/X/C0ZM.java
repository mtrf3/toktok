package X;

import defpackage.b0;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.0ZM, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0ZM {
    public final CharSequence LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final BreakIterator LIZLLL;

    public final void LIZ(int i) {
        int i2 = this.LIZIZ;
        if (i <= this.LIZJ && i2 <= i) {
            return;
        }
        StringBuilder LJ = C7MY.LJ("Invalid offset: ", i, ". Valid range is [");
        LJ.append(this.LIZIZ);
        LJ.append(" , ");
        String LIZJ = b0.LIZJ(LJ, this.LIZJ, ']', LJ);
        LIZJ.toString();
        throw new IllegalArgumentException(LIZJ);
    }

    public final boolean LIZIZ(int i) {
        int i2 = this.LIZIZ + 1;
        if (i <= this.LIZJ && i2 <= i && Character.isLetterOrDigit(Character.codePointBefore(this.LIZ, i))) {
            return true;
        }
        return false;
    }

    public final boolean LIZJ(int i) {
        int i2 = this.LIZIZ + 1;
        if (i > this.LIZJ || i2 > i) {
            return false;
        }
        return C0ZL.LIZ(Character.codePointBefore(this.LIZ, i));
    }

    public final boolean LIZLLL(int i) {
        int i2 = this.LIZIZ;
        if (i < this.LIZJ && i2 <= i && Character.isLetterOrDigit(Character.codePointAt(this.LIZ, i))) {
            return true;
        }
        return false;
    }

    public final boolean LJ(int i) {
        int i2 = this.LIZIZ;
        if (i >= this.LIZJ || i2 > i) {
            return false;
        }
        return C0ZL.LIZ(Character.codePointAt(this.LIZ, i));
    }

    public C0ZM(CharSequence charSequence, int i, Locale locale) {
        this.LIZ = charSequence;
        if (charSequence.length() >= 0) {
            if (i >= 0 && i <= charSequence.length()) {
                BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
                o.LJIIIIZZ(wordInstance, "getWordInstance(locale)");
                this.LIZLLL = wordInstance;
                this.LIZIZ = Math.max(0, -50);
                this.LIZJ = Math.min(charSequence.length(), i + 50);
                wordInstance.setText(new C0XE(i, charSequence));
                return;
            }
            "input end index is outside the CharSequence".toString();
            throw new IllegalArgumentException("input end index is outside the CharSequence");
        }
        "input start index is outside the CharSequence".toString();
        throw new IllegalArgumentException("input start index is outside the CharSequence");
    }
}
