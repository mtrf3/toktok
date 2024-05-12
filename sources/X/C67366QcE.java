package X;

import java.util.Arrays;

/* renamed from: X.QcE, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67366QcE {
    public final C67365QcD LIZ;
    public final byte[] LIZIZ;

    public final int hashCode() {
        return ((this.LIZ.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EncodedPayload{encoding=");
        LIZ.append(this.LIZ);
        LIZ.append(", bytes=[...]}");
        return X1D.LIZIZ(LIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C67366QcE)) {
            return false;
        }
        C67366QcE c67366QcE = (C67366QcE) obj;
        if (!this.LIZ.equals(c67366QcE.LIZ)) {
            return false;
        }
        return Arrays.equals(this.LIZIZ, c67366QcE.LIZIZ);
    }

    public C67366QcE(C67365QcD c67365QcD, byte[] bArr) {
        if (c67365QcD != null) {
            if (bArr != null) {
                this.LIZ = c67365QcD;
                this.LIZIZ = bArr;
                return;
            }
            throw new NullPointerException("bytes is null");
        }
        throw new NullPointerException("encoding is null");
    }
}
