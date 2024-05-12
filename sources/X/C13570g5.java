package X;

/* renamed from: X.0g5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13570g5 {
    public static final /* synthetic */ int LIZIZ = 0;
    public final int LIZ;

    public static String LIZ(int i) {
        return i == 0 ? "Normal" : i == 1 ? "Italic" : "Invalid";
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        return LIZ(this.LIZ);
    }

    public final boolean equals(Object obj) {
        int i = this.LIZ;
        if (!(obj instanceof C13570g5) || i != ((C13570g5) obj).LIZ) {
            return false;
        }
        return true;
    }
}
