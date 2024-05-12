package X;

import java.util.Arrays;

/* renamed from: X.Qc3, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67355Qc3 extends AbstractC67354Qc2 {
    public final String LIZ;
    public final byte[] LIZIZ;
    public final EnumC67357Qc5 LIZJ;

    public final int hashCode() {
        return ((((this.LIZ.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.LIZIZ)) * 1000003) ^ this.LIZJ.hashCode();
    }

    @Override // X.AbstractC67354Qc2
    public final String LIZIZ() {
        return this.LIZ;
    }

    @Override // X.AbstractC67354Qc2
    public final byte[] LIZJ() {
        return this.LIZIZ;
    }

    @Override // X.AbstractC67354Qc2
    public final EnumC67357Qc5 LIZLLL() {
        return this.LIZJ;
    }

    public final boolean equals(Object obj) {
        byte[] LIZJ;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC67354Qc2)) {
            return false;
        }
        AbstractC67354Qc2 abstractC67354Qc2 = (AbstractC67354Qc2) obj;
        if (this.LIZ.equals(abstractC67354Qc2.LIZIZ())) {
            byte[] bArr = this.LIZIZ;
            if (abstractC67354Qc2 instanceof C67355Qc3) {
                LIZJ = ((C67355Qc3) abstractC67354Qc2).LIZIZ;
            } else {
                LIZJ = abstractC67354Qc2.LIZJ();
            }
            if (Arrays.equals(bArr, LIZJ) && this.LIZJ.equals(abstractC67354Qc2.LIZLLL())) {
                return true;
            }
        }
        return false;
    }

    public C67355Qc3(String str, byte[] bArr, EnumC67357Qc5 enumC67357Qc5) {
        this.LIZ = str;
        this.LIZIZ = bArr;
        this.LIZJ = enumC67357Qc5;
    }
}
