package X;

import kotlin.jvm.internal.o;

/* renamed from: X.ZrF, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91229ZrF {
    public final InterfaceC91418ZuI LIZ;
    public final InterfaceC91227ZrD LIZIZ;
    public final C91419ZuJ LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C91229ZrF)) {
            return false;
        }
        C91229ZrF c91229ZrF = (C91229ZrF) obj;
        return o.LJ(this.LIZ, c91229ZrF.LIZ) && o.LJ(this.LIZIZ, c91229ZrF.LIZIZ) && o.LJ(this.LIZJ, c91229ZrF.LIZJ);
    }

    public final int hashCode() {
        InterfaceC91418ZuI interfaceC91418ZuI = this.LIZ;
        int hashCode = (interfaceC91418ZuI == null ? 0 : interfaceC91418ZuI.hashCode()) * 31;
        InterfaceC91227ZrD interfaceC91227ZrD = this.LIZIZ;
        return ((hashCode + (interfaceC91227ZrD != null ? interfaceC91227ZrD.hashCode() : 0)) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MediaSessionConfig(coverLoader=");
        LIZ.append(this.LIZ);
        LIZ.append(", backgroundHelper=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", notification=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C91229ZrF(C91501Zvd c91501Zvd, C91434ZuY c91434ZuY, C91419ZuJ c91419ZuJ) {
        this.LIZ = c91501Zvd;
        this.LIZIZ = c91434ZuY;
        this.LIZJ = c91419ZuJ;
    }
}
