package X;

/* renamed from: X.0tY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21920tY {
    public static final /* synthetic */ int LIZIZ = 0;
    public final int LIZ;

    public static String LIZ(int i) {
        return i == 1 ? "Strategy.Simple" : i == 2 ? "Strategy.HighQuality" : i == 3 ? "Strategy.Balanced" : "Invalid";
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        return LIZ(this.LIZ);
    }

    public final boolean equals(Object obj) {
        int i = this.LIZ;
        if (!(obj instanceof C21920tY) || i != ((C21920tY) obj).LIZ) {
            return false;
        }
        return true;
    }
}
