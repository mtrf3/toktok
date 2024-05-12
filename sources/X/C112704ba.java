package X;

import kotlin.jvm.internal.o;

/* renamed from: X.4ba, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C112704ba {
    public final String LIZ;
    public final InterfaceC65784Pro<C76800UCe> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C112704ba)) {
            return false;
        }
        C112704ba c112704ba = (C112704ba) obj;
        return o.LJ(this.LIZ, c112704ba.LIZ) && o.LJ(this.LIZIZ, c112704ba.LIZIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LIZIZ;
        return hashCode + (interfaceC65784Pro != null ? interfaceC65784Pro.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CustomTextAndClick(text=");
        LIZ.append(this.LIZ);
        LIZ.append(", click=");
        return C06540Nm.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C112704ba(String str, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LIZ = str;
        this.LIZIZ = interfaceC65784Pro;
    }
}
