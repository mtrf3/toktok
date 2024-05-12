package X;

/* renamed from: X.0tc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21960tc {
    public static final /* synthetic */ int LIZIZ = 0;
    public final int LIZ;

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        int i = this.LIZ;
        if (i == 1) {
            return "WordBreak.None";
        }
        if (i == 2) {
            return "WordBreak.Phrase";
        }
        return "Invalid";
    }

    public final boolean equals(Object obj) {
        int i = this.LIZ;
        if (!(obj instanceof C21960tc) || i != ((C21960tc) obj).LIZ) {
            return false;
        }
        return true;
    }
}
