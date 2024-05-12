package X;

import kotlin.jvm.internal.o;

/* renamed from: X.aRW, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93478aRW {
    public final String LIZ;
    public final int LIZIZ;
    public final InterfaceC65784Pro<C76800UCe> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C93478aRW)) {
            return false;
        }
        C93478aRW c93478aRW = (C93478aRW) obj;
        return o.LJ(this.LIZ, c93478aRW.LIZ) && this.LIZIZ == c93478aRW.LIZIZ && o.LJ(this.LIZJ, c93478aRW.LIZJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.LIZIZ) * 31;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LIZJ;
        return hashCode + (interfaceC65784Pro != null ? interfaceC65784Pro.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CheckData(text=");
        LIZ.append(this.LIZ);
        LIZ.append(", style=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", clickCallback=");
        LIZ.append(this.LIZJ);
        LIZ.append(")");
        return X1D.LIZIZ(LIZ);
    }

    public C93478aRW(int i, String str, InterfaceC65784Pro interfaceC65784Pro) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = interfaceC65784Pro;
    }
}
