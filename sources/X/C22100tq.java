package X;

/* renamed from: X.0tq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22100tq {
    public static final /* synthetic */ int LIZIZ = 0;
    public final int LIZ;

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        int i = this.LIZ;
        if (i == 1) {
            return "Ltr";
        }
        if (i == 2) {
            return "Rtl";
        }
        if (i == 3) {
            return "Content";
        }
        if (i == 4) {
            return "ContentOrLtr";
        }
        if (i == 5) {
            return "ContentOrRtl";
        }
        return "Invalid";
    }

    public final boolean equals(Object obj) {
        int i = this.LIZ;
        if (!(obj instanceof C22100tq) || i != ((C22100tq) obj).LIZ) {
            return false;
        }
        return true;
    }
}
