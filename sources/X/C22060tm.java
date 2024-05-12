package X;

/* renamed from: X.0tm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22060tm {
    public static final /* synthetic */ int LIZIZ = 0;
    public final int LIZ;

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        int i = this.LIZ;
        if (i == 1) {
            return "Left";
        }
        if (i == 2) {
            return "Right";
        }
        if (i == 3) {
            return "Center";
        }
        if (i == 4) {
            return "Justify";
        }
        if (i == 5) {
            return "Start";
        }
        if (i == 6) {
            return "End";
        }
        return "Invalid";
    }

    public final boolean equals(Object obj) {
        int i = this.LIZ;
        if (!(obj instanceof C22060tm) || i != ((C22060tm) obj).LIZ) {
            return false;
        }
        return true;
    }
}
