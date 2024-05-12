package X;

import java.util.Arrays;

/* renamed from: X.QcU, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67382QcU extends AbstractC67402Qco {
    public final Iterable<AbstractC67375QcN> LIZ;
    public final byte[] LIZIZ;

    public C67382QcU() {
        throw null;
    }

    public final int hashCode() {
        return ((this.LIZ.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BackendRequest{events=");
        LIZ.append(this.LIZ);
        LIZ.append(", extras=");
        LIZ.append(Arrays.toString(this.LIZIZ));
        LIZ.append("}");
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.AbstractC67402Qco
    public final Iterable<AbstractC67375QcN> LIZ() {
        return this.LIZ;
    }

    @Override // X.AbstractC67402Qco
    public final byte[] LIZIZ() {
        return this.LIZIZ;
    }

    public final boolean equals(Object obj) {
        byte[] LIZIZ;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC67402Qco)) {
            return false;
        }
        AbstractC67402Qco abstractC67402Qco = (AbstractC67402Qco) obj;
        if (this.LIZ.equals(abstractC67402Qco.LIZ())) {
            byte[] bArr = this.LIZIZ;
            if (abstractC67402Qco instanceof C67382QcU) {
                LIZIZ = ((C67382QcU) abstractC67402Qco).LIZIZ;
            } else {
                LIZIZ = abstractC67402Qco.LIZIZ();
            }
            if (Arrays.equals(bArr, LIZIZ)) {
                return true;
            }
        }
        return false;
    }

    public C67382QcU(Iterable iterable, byte[] bArr) {
        this.LIZ = iterable;
        this.LIZIZ = bArr;
    }
}
