package X;

import defpackage.b0;

/* renamed from: X.Vck, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80138Vck implements Comparable<C80138Vck> {
    public int LJLIL;
    public int LJLILLLLZI;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Order{order=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", index=");
        return b0.LIZJ(LIZ, this.LJLIL, '}', LIZ);
    }

    @Override // java.lang.Comparable
    public final int compareTo(C80138Vck c80138Vck) {
        C80138Vck c80138Vck2 = c80138Vck;
        int i = this.LJLILLLLZI;
        int i2 = c80138Vck2.LJLILLLLZI;
        if (i != i2) {
            return i - i2;
        }
        return this.LJLIL - c80138Vck2.LJLIL;
    }
}
