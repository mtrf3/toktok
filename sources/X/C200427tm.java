package X;

import kotlin.jvm.internal.o;

/* renamed from: X.7tm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C200427tm implements InterfaceC87283bg {
    public final InterfaceC65784Pro<Long> LJLIL;

    public C200427tm() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C200427tm) && o.LJ(this.LJLIL, ((C200427tm) obj).LJLIL);
    }

    public final int hashCode() {
        InterfaceC65784Pro<Long> interfaceC65784Pro = this.LJLIL;
        if (interfaceC65784Pro == null) {
            return 0;
        }
        return interfaceC65784Pro.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SimpleDiggHierarchyData(infoProvider=");
        return C06540Nm.LIZJ(LIZ, this.LJLIL, ')', LIZ);
    }

    public C200427tm(InterfaceC65784Pro<Long> interfaceC65784Pro) {
        this.LJLIL = interfaceC65784Pro;
    }
}
