package X;

import kotlin.jvm.internal.o;

/* renamed from: X.4jF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C117454jF {
    public final String LIZ;
    public final C46104I7o LIZIZ;
    public final InterfaceC88472Yns<Boolean, C76800UCe> LIZJ;

    public C117454jF() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C117454jF)) {
            return false;
        }
        C117454jF c117454jF = (C117454jF) obj;
        return o.LJ(this.LIZ, c117454jF.LIZ) && o.LJ(this.LIZIZ, c117454jF.LIZIZ) && o.LJ(this.LIZJ, c117454jF.LIZJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        C46104I7o c46104I7o = this.LIZIZ;
        int hashCode2 = (hashCode + (c46104I7o == null ? 0 : c46104I7o.hashCode())) * 31;
        InterfaceC88472Yns<Boolean, C76800UCe> interfaceC88472Yns = this.LIZJ;
        return hashCode2 + (interfaceC88472Yns != null ? interfaceC88472Yns.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AccountShareConfig(uri=");
        LIZ.append(this.LIZ);
        LIZ.append(", dataModel=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", listener=");
        return C249109q6.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C117454jF(String str, C46104I7o c46104I7o, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        this.LIZ = str;
        this.LIZIZ = c46104I7o;
        this.LIZJ = interfaceC88472Yns;
    }
}
