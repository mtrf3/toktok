package X;

import defpackage.b0;

/* renamed from: X.7Hm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C183347Hm extends AbstractC183357Hn {
    public final int LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C183347Hm) && this.LIZ == ((C183347Hm) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SelectValue(value=");
        return b0.LIZJ(LIZ, this.LIZ, ')', LIZ);
    }

    public C183347Hm(int i) {
        super(0);
        this.LIZ = i;
    }
}
