package X;

/* renamed from: X.ZdZ, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public class C90381ZdZ {
    public volatile InterfaceC90712Ziu LIZ;
    public volatile AbstractC90364ZdI LIZIZ;

    public final int hashCode() {
        return 1;
    }

    static {
        if (C90411Ze3.LIZIZ == null) {
            synchronized (C90411Ze3.class) {
                if (C90411Ze3.LIZIZ == null) {
                    C90411Ze3.LIZIZ = C90411Ze3.LIZJ;
                }
            }
        }
    }

    public final AbstractC90364ZdI LIZ() {
        if (this.LIZIZ != null) {
            return this.LIZIZ;
        }
        synchronized (this) {
            if (this.LIZIZ != null) {
                return this.LIZIZ;
            }
            if (this.LIZ == null) {
                this.LIZIZ = AbstractC90364ZdI.zzb;
            } else {
                this.LIZIZ = this.LIZ.LJIIIZ();
            }
            return this.LIZIZ;
        }
    }

    public final void LIZIZ(InterfaceC90712Ziu interfaceC90712Ziu) {
        if (this.LIZ != null) {
            return;
        }
        synchronized (this) {
            if (this.LIZ == null) {
                try {
                    this.LIZ = interfaceC90712Ziu;
                    this.LIZIZ = AbstractC90364ZdI.zzb;
                } catch (C90365ZdJ unused) {
                    this.LIZ = interfaceC90712Ziu;
                    this.LIZIZ = AbstractC90364ZdI.zzb;
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C90381ZdZ)) {
            return false;
        }
        C90381ZdZ c90381ZdZ = (C90381ZdZ) obj;
        InterfaceC90712Ziu interfaceC90712Ziu = this.LIZ;
        InterfaceC90712Ziu interfaceC90712Ziu2 = c90381ZdZ.LIZ;
        if (interfaceC90712Ziu == null) {
            if (interfaceC90712Ziu2 != null) {
                LIZIZ(interfaceC90712Ziu2.LJIILIIL());
                return this.LIZ.equals(interfaceC90712Ziu2);
            }
            return LIZ().equals(c90381ZdZ.LIZ());
        }
        if (interfaceC90712Ziu2 == null) {
            c90381ZdZ.LIZIZ(interfaceC90712Ziu.LJIILIIL());
            return interfaceC90712Ziu.equals(c90381ZdZ.LIZ);
        }
        return interfaceC90712Ziu.equals(interfaceC90712Ziu2);
    }
}
