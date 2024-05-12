package X;

/* renamed from: X.0dM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11880dM {
    public static final /* synthetic */ int LIZIZ = 0;
    public final int LIZ;

    public static String LIZ(int i) {
        return i == 0 ? "Butt" : i == 1 ? "Round" : i == 2 ? "Square" : "Unknown";
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        return LIZ(this.LIZ);
    }

    public final boolean equals(Object obj) {
        int i = this.LIZ;
        if (!(obj instanceof C11880dM) || i != ((C11880dM) obj).LIZ) {
            return false;
        }
        return true;
    }
}
