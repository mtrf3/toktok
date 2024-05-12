package X;

/* renamed from: X.0gE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C13660gE {
    public static final byte[] LJ = new byte[1792];
    public final CharSequence LIZ;
    public final int LIZIZ;
    public int LIZJ;
    public char LIZLLL;

    static {
        int i = 0;
        do {
            LJ[i] = Character.getDirectionality(i);
            i++;
        } while (i < 1792);
    }

    public final byte LIZ() {
        char charAt = this.LIZ.charAt(this.LIZJ - 1);
        this.LIZLLL = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(this.LIZ, this.LIZJ);
            this.LIZJ -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.LIZJ--;
        char c = this.LIZLLL;
        if (c < 1792) {
            return LJ[c];
        }
        return Character.getDirectionality(c);
    }

    public C13660gE(CharSequence charSequence) {
        this.LIZ = charSequence;
        this.LIZIZ = charSequence.length();
    }
}
