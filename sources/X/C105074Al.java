package X;

import kotlin.jvm.internal.o;

/* renamed from: X.4Al, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C105074Al {
    public final EnumC105154At LIZ;
    public final Object LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C105074Al)) {
            return false;
        }
        C105074Al c105074Al = (C105074Al) obj;
        return this.LIZ == c105074Al.LIZ && o.LJ(this.LIZIZ, c105074Al.LIZIZ);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        Object obj = this.LIZIZ;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SwitchPanelEvent(panelType=");
        LIZ.append(this.LIZ);
        LIZ.append(", payload=");
        return U26.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C105074Al(EnumC105154At panelType, Object obj) {
        o.LJIIIZ(panelType, "panelType");
        this.LIZ = panelType;
        this.LIZIZ = obj;
    }
}
