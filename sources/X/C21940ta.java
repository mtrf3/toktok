package X;

/* renamed from: X.0ta, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21940ta {
    public static final /* synthetic */ int LIZIZ = 0;
    public final int LIZ;

    public static String LIZ(int i) {
        return i == 1 ? "Strictness.None" : i == 2 ? "Strictness.Loose" : i == 3 ? "Strictness.Normal" : i == 4 ? "Strictness.Strict" : "Invalid";
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        return LIZ(this.LIZ);
    }

    public final boolean equals(Object obj) {
        int i = this.LIZ;
        if (!(obj instanceof C21940ta) || i != ((C21940ta) obj).LIZ) {
            return false;
        }
        return true;
    }
}
