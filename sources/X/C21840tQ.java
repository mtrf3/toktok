package X;

/* renamed from: X.0tQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21840tQ {
    public static final /* synthetic */ int LIZIZ = 0;
    public final int LIZ;

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        int i = this.LIZ;
        if (i == 1) {
            return "Touch";
        }
        if (i == 2) {
            return "Keyboard";
        }
        return "Error";
    }

    public final boolean equals(Object obj) {
        int i = this.LIZ;
        if (!(obj instanceof C21840tQ) || i != ((C21840tQ) obj).LIZ) {
            return false;
        }
        return true;
    }
}
