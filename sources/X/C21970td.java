package X;

/* renamed from: X.0td, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21970td {
    public static final C21970td LIZLLL = new C21970td();
    public final int LIZ = 1;
    public final int LIZIZ = 3;
    public final int LIZJ = 1;

    public final int hashCode() {
        return (((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ;
    }

    public final String toString() {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LineBreak(strategy=");
        LIZ.append((Object) C21920tY.LIZ(this.LIZ));
        LIZ.append(", strictness=");
        LIZ.append((Object) C21940ta.LIZ(this.LIZIZ));
        LIZ.append(", wordBreak=");
        int i = this.LIZJ;
        if (i == 1) {
            str = "WordBreak.None";
        } else if (i == 2) {
            str = "WordBreak.Phrase";
        } else {
            str = "Invalid";
        }
        LIZ.append((Object) str);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21970td)) {
            return false;
        }
        C21970td c21970td = (C21970td) obj;
        if (this.LIZ == c21970td.LIZ && this.LIZIZ == c21970td.LIZIZ && this.LIZJ == c21970td.LIZJ) {
            return true;
        }
        return false;
    }
}
