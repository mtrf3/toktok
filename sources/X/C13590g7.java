package X;

/* renamed from: X.0g7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13590g7 {
    public static final /* synthetic */ int LIZIZ = 0;
    public final int LIZ;

    public static String LIZ(int i) {
        return i == 0 ? "None" : i == 1 ? "All" : i == 2 ? "Weight" : i == 3 ? "Style" : "Invalid";
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        return LIZ(this.LIZ);
    }

    public final boolean equals(Object obj) {
        int i = this.LIZ;
        if (!(obj instanceof C13590g7) || i != ((C13590g7) obj).LIZ) {
            return false;
        }
        return true;
    }
}
