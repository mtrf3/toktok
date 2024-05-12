package X;

import kotlin.jvm.internal.o;

/* renamed from: X.a19, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91843a19 {
    public final InterfaceC91758Zzm LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final InterfaceC65784Pro<C76800UCe> LJ;
    public final String LJFF;
    public final InterfaceC65784Pro<C76800UCe> LJI;

    public C91843a19() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C91843a19)) {
            return false;
        }
        C91843a19 c91843a19 = (C91843a19) obj;
        return o.LJ(this.LIZ, c91843a19.LIZ) && o.LJ(this.LIZIZ, c91843a19.LIZIZ) && o.LJ(this.LIZJ, c91843a19.LIZJ) && o.LJ(this.LIZLLL, c91843a19.LIZLLL) && o.LJ(this.LJ, c91843a19.LJ) && o.LJ(this.LJFF, c91843a19.LJFF) && o.LJ(this.LJI, c91843a19.LJI);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        int hashCode3 = (((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31;
        String str3 = this.LJFF;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJI;
        return hashCode4 + (interfaceC65784Pro != null ? interfaceC65784Pro.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DialogProvider(controller=");
        LIZ.append(this.LIZ);
        LIZ.append(", title=");
        LIZ.append((Object) this.LIZIZ);
        LIZ.append(", message=");
        LIZ.append((Object) this.LIZJ);
        LIZ.append(", primaryActionText=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", primaryAction=");
        LIZ.append(this.LJ);
        LIZ.append(", secondaryActionText=");
        LIZ.append((Object) this.LJFF);
        LIZ.append(", secondaryAction=");
        LIZ.append(this.LJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C91843a19(C92158a6E c92158a6E, String str, String str2, String str3, InterfaceC65784Pro interfaceC65784Pro) {
        this.LIZ = c92158a6E;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = interfaceC65784Pro;
        this.LJFF = null;
        this.LJI = null;
    }
}
