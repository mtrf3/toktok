package X;

/* renamed from: X.0dQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11920dQ {
    public static final /* synthetic */ int LIZIZ = 0;
    public final int LIZ;

    public static String LIZ(int i) {
        return i == 0 ? "Miter" : i == 1 ? "Round" : i == 2 ? "Bevel" : "Unknown";
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        return LIZ(this.LIZ);
    }

    public final boolean equals(Object obj) {
        int i = this.LIZ;
        if (!(obj instanceof C11920dQ) || i != ((C11920dQ) obj).LIZ) {
            return false;
        }
        return true;
    }
}
