package X;

/* renamed from: X.0cx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11630cx {
    public static final /* synthetic */ int LIZIZ = 0;
    public final int LIZ;

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        int i = this.LIZ;
        if (i == 0) {
            return "NonZero";
        }
        if (i == 1) {
            return "EvenOdd";
        }
        return "Unknown";
    }

    public final boolean equals(Object obj) {
        int i = this.LIZ;
        if (!(obj instanceof C11630cx) || i != ((C11630cx) obj).LIZ) {
            return false;
        }
        return true;
    }
}
