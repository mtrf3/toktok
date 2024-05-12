package X;

import defpackage.b0;

/* renamed from: X.3k9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C92533k9 extends AbstractC92543kA {
    public final int LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C92533k9) && this.LIZ == ((C92533k9) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SelectValue(value=");
        return b0.LIZJ(LIZ, this.LIZ, ')', LIZ);
    }

    public C92533k9(int i) {
        super(0);
        this.LIZ = i;
    }
}
