package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Tyf, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76401Tyf implements C33Q {
    public final String LJLIL;
    public final InterfaceC76404Tyi LJLILLLLZI;
    public final C76402Tyg LJLJI;

    public C76401Tyf() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C76401Tyf)) {
            return false;
        }
        C76401Tyf c76401Tyf = (C76401Tyf) obj;
        return o.LJ(this.LJLIL, c76401Tyf.LJLIL) && o.LJ(this.LJLILLLLZI, c76401Tyf.LJLILLLLZI) && o.LJ(this.LJLJI, c76401Tyf.LJLJI);
    }

    public final int hashCode() {
        String str = this.LJLIL;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        InterfaceC76404Tyi interfaceC76404Tyi = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (interfaceC76404Tyi == null ? 0 : interfaceC76404Tyi.hashCode())) * 31;
        C76402Tyg c76402Tyg = this.LJLJI;
        return hashCode2 + (c76402Tyg != null ? c76402Tyg.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InteractionTitleState(currentContent=");
        LIZ.append(this.LJLIL);
        LIZ.append(", contentType=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", switchAnimConfig=");
        LIZ.append(this.LJLJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C76401Tyf(String str, InterfaceC76404Tyi interfaceC76404Tyi, C76402Tyg c76402Tyg) {
        this.LJLIL = str;
        this.LJLILLLLZI = interfaceC76404Tyi;
        this.LJLJI = c76402Tyg;
    }

    public static C76401Tyf LIZ(C76401Tyf c76401Tyf, InterfaceC76404Tyi interfaceC76404Tyi, C76402Tyg c76402Tyg) {
        String str = c76401Tyf.LJLIL;
        c76401Tyf.getClass();
        return new C76401Tyf(str, interfaceC76404Tyi, c76402Tyg);
    }
}
