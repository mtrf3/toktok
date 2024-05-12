package X;

import java.text.BreakIterator;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.1he, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C40021he extends AbstractC283019e {
    public static C40021he LIZLLL;
    public BreakIterator LIZJ;

    public C40021he(Locale locale) {
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        o.LJIIIIZZ(wordInstance, "getWordInstance(locale)");
        this.LIZJ = wordInstance;
    }

    @Override // X.C04X
    public final int[] LIZ(int i) {
        if (LIZLLL().length() <= 0 || i >= LIZLLL().length()) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        while (!LJI(i) && (!LJI(i) || (i != 0 && LJI(i - 1)))) {
            BreakIterator breakIterator = this.LIZJ;
            if (breakIterator != null) {
                i = breakIterator.following(i);
                if (i == -1) {
                    return null;
                }
            } else {
                o.LJIJI("impl");
                throw null;
            }
        }
        BreakIterator breakIterator2 = this.LIZJ;
        if (breakIterator2 != null) {
            int following = breakIterator2.following(i);
            if (following == -1 || !LJFF(following)) {
                return null;
            }
            return LIZJ(i, following);
        }
        o.LJIJI("impl");
        throw null;
    }

    @Override // X.C04X
    public final int[] LIZIZ(int i) {
        int length = LIZLLL().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        while (i > 0 && !LJI(i - 1) && !LJFF(i)) {
            BreakIterator breakIterator = this.LIZJ;
            if (breakIterator != null) {
                i = breakIterator.preceding(i);
                if (i == -1) {
                    return null;
                }
            } else {
                o.LJIJI("impl");
                throw null;
            }
        }
        BreakIterator breakIterator2 = this.LIZJ;
        if (breakIterator2 != null) {
            int preceding = breakIterator2.preceding(i);
            if (preceding == -1 || !LJI(preceding) || (preceding != 0 && LJI(preceding - 1))) {
                return null;
            }
            return LIZJ(preceding, i);
        }
        o.LJIJI("impl");
        throw null;
    }

    public final void LJ(String text) {
        o.LJIIIZ(text, "text");
        this.LIZ = text;
        BreakIterator breakIterator = this.LIZJ;
        if (breakIterator != null) {
            breakIterator.setText(text);
        } else {
            o.LJIJI("impl");
            throw null;
        }
    }

    public final boolean LJFF(int i) {
        if (i > 0 && LJI(i - 1) && (i == LIZLLL().length() || !LJI(i))) {
            return true;
        }
        return false;
    }

    public final boolean LJI(int i) {
        if (i >= 0 && i < LIZLLL().length()) {
            return Character.isLetterOrDigit(LIZLLL().codePointAt(i));
        }
        return false;
    }
}
