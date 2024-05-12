package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Pkb, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65337Pkb {
    public static final /* synthetic */ int LIZJ = 0;
    public final EnumC65342Pkg LIZ;
    public final InterfaceC65332PkW LIZIZ;

    static {
        new C65337Pkb(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C65337Pkb)) {
            return false;
        }
        C65337Pkb c65337Pkb = (C65337Pkb) obj;
        return this.LIZ == c65337Pkb.LIZ && o.LJ(this.LIZIZ, c65337Pkb.LIZIZ);
    }

    public final int hashCode() {
        EnumC65342Pkg enumC65342Pkg = this.LIZ;
        int hashCode = (enumC65342Pkg == null ? 0 : enumC65342Pkg.hashCode()) * 31;
        InterfaceC65332PkW interfaceC65332PkW = this.LIZIZ;
        return hashCode + (interfaceC65332PkW != null ? interfaceC65332PkW.hashCode() : 0);
    }

    public final String toString() {
        int i;
        EnumC65342Pkg enumC65342Pkg = this.LIZ;
        if (enumC65342Pkg == null || (i = C65343Pkh.LIZ[enumC65342Pkg.ordinal()]) == -1) {
            return "*";
        }
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("out ");
                    LIZ.append(this.LIZIZ);
                    return X1D.LIZIZ(LIZ);
                }
                throw new C162476Zf();
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("in ");
            LIZ2.append(this.LIZIZ);
            return X1D.LIZIZ(LIZ2);
        }
        return String.valueOf(this.LIZIZ);
    }

    public C65337Pkb(EnumC65342Pkg enumC65342Pkg, C65338Pkc c65338Pkc) {
        boolean z;
        boolean z2;
        String LIZIZ;
        this.LIZ = enumC65342Pkg;
        this.LIZIZ = c65338Pkc;
        if (enumC65342Pkg == null) {
            z = true;
        } else {
            z = false;
        }
        if (c65338Pkc == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z == z2) {
            return;
        }
        if (enumC65342Pkg == null) {
            LIZIZ = "Star projection must have no type specified.";
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("The projection variance ");
            LIZ.append(enumC65342Pkg);
            LIZ.append(" requires type to be specified.");
            LIZIZ = X1D.LIZIZ(LIZ);
        }
        LIZIZ.toString();
        throw new IllegalArgumentException(LIZIZ);
    }
}
