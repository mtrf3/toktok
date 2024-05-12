package X;

/* renamed from: X.QCq, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66620QCq implements InterfaceC65160Phk, Cloneable {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final InterfaceC49552Jca[] LJLJI;

    @Override // X.InterfaceC65160Phk
    public final InterfaceC49552Jca[] getParameters() {
        return (InterfaceC49552Jca[]) this.LJLJI.clone();
    }

    public final int hashCode() {
        int LJIIJ = C1GE.LJIIJ(C1GE.LJIIJ(17, this.LJLIL), this.LJLILLLLZI);
        int i = 0;
        while (true) {
            InterfaceC49552Jca[] interfaceC49552JcaArr = this.LJLJI;
            if (i < interfaceC49552JcaArr.length) {
                LJIIJ = C1GE.LJIIJ(LJIIJ, interfaceC49552JcaArr[i]);
                i++;
            } else {
                return LJIIJ;
            }
        }
    }

    public final String toString() {
        C66622QCs c66622QCs = new C66622QCs(64);
        c66622QCs.LIZIZ(this.LJLIL);
        if (this.LJLILLLLZI != null) {
            c66622QCs.LIZIZ("=");
            c66622QCs.LIZIZ(this.LJLILLLLZI);
        }
        for (int i = 0; i < this.LJLJI.length; i++) {
            c66622QCs.LIZIZ("; ");
            c66622QCs.LIZIZ(String.valueOf(this.LJLJI[i]));
        }
        return c66622QCs.toString();
    }

    public final Object clone() {
        return super.clone();
    }

    @Override // X.InterfaceC65160Phk
    public final String getName() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC65160Phk
    public final String getValue() {
        return this.LJLILLLLZI;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC65160Phk)) {
            return false;
        }
        C66620QCq c66620QCq = (C66620QCq) obj;
        if (!this.LJLIL.equals(c66620QCq.LJLIL)) {
            return false;
        }
        String str = this.LJLILLLLZI;
        String str2 = c66620QCq.LJLILLLLZI;
        if (str == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str.equals(str2)) {
            return false;
        }
        InterfaceC49552Jca[] interfaceC49552JcaArr = this.LJLJI;
        InterfaceC49552Jca[] interfaceC49552JcaArr2 = c66620QCq.LJLJI;
        if (interfaceC49552JcaArr == null) {
            if (interfaceC49552JcaArr2 != null) {
                return false;
            }
        } else {
            if (interfaceC49552JcaArr2 == null || interfaceC49552JcaArr.length != interfaceC49552JcaArr2.length) {
                return false;
            }
            for (int i = 0; i < interfaceC49552JcaArr.length; i++) {
                InterfaceC49552Jca interfaceC49552Jca = interfaceC49552JcaArr[i];
                InterfaceC49552Jca interfaceC49552Jca2 = interfaceC49552JcaArr2[i];
                if (interfaceC49552Jca == null) {
                    if (interfaceC49552Jca2 != null) {
                        return false;
                    }
                } else if (!interfaceC49552Jca.equals(interfaceC49552Jca2)) {
                    return false;
                }
            }
        }
        return true;
    }

    public C66620QCq(String str, String str2, InterfaceC49552Jca[] interfaceC49552JcaArr) {
        if (str != null) {
            this.LJLIL = str;
            this.LJLILLLLZI = str2;
            if (interfaceC49552JcaArr != null) {
                this.LJLJI = interfaceC49552JcaArr;
                return;
            } else {
                this.LJLJI = new InterfaceC49552Jca[0];
                return;
            }
        }
        throw new IllegalArgumentException("Name may not be null");
    }
}
