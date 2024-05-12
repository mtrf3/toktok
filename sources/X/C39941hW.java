package X;

import java.text.BreakIterator;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.1hW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39941hW extends AbstractC283019e {
    public static C39941hW LIZLLL;
    public BreakIterator LIZJ;

    public C39941hW(Locale locale) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance(locale);
        o.LJIIIIZZ(characterInstance, "getCharacterInstance(locale)");
        this.LIZJ = characterInstance;
    }

    @Override // X.C04X
    public final int[] LIZ(int i) {
        int length = LIZLLL().length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        do {
            BreakIterator breakIterator = this.LIZJ;
            if (breakIterator != null) {
                if (!breakIterator.isBoundary(i)) {
                    BreakIterator breakIterator2 = this.LIZJ;
                    if (breakIterator2 != null) {
                        i = breakIterator2.following(i);
                    } else {
                        o.LJIJI("impl");
                        throw null;
                    }
                } else {
                    BreakIterator breakIterator3 = this.LIZJ;
                    if (breakIterator3 != null) {
                        int following = breakIterator3.following(i);
                        if (following == -1) {
                            return null;
                        }
                        return LIZJ(i, following);
                    }
                    o.LJIJI("impl");
                    throw null;
                }
            } else {
                o.LJIJI("impl");
                throw null;
            }
        } while (i != -1);
        return null;
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
        do {
            BreakIterator breakIterator = this.LIZJ;
            if (breakIterator != null) {
                if (!breakIterator.isBoundary(i)) {
                    BreakIterator breakIterator2 = this.LIZJ;
                    if (breakIterator2 != null) {
                        i = breakIterator2.preceding(i);
                    } else {
                        o.LJIJI("impl");
                        throw null;
                    }
                } else {
                    BreakIterator breakIterator3 = this.LIZJ;
                    if (breakIterator3 != null) {
                        int preceding = breakIterator3.preceding(i);
                        if (preceding == -1) {
                            return null;
                        }
                        return LIZJ(preceding, i);
                    }
                    o.LJIJI("impl");
                    throw null;
                }
            } else {
                o.LJIJI("impl");
                throw null;
            }
        } while (i != -1);
        return null;
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
}
