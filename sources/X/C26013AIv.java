package X;

import kotlin.jvm.internal.o;

/* renamed from: X.AIv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26013AIv implements InterfaceC57784Mm4 {
    public final C38683FGd LJLIL;
    public final java.util.Map<String, String> LJLILLLLZI;
    public final boolean LJLJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26013AIv)) {
            return false;
        }
        C26013AIv c26013AIv = (C26013AIv) obj;
        return o.LJ(this.LJLIL, c26013AIv.LJLIL) && o.LJ(this.LJLILLLLZI, c26013AIv.LJLILLLLZI) && this.LJLJI == c26013AIv.LJLJI;
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        java.util.Map<String, String> map = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        boolean z = this.LJLJI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchUserFeedbackItem(searchUserFeedback=");
        LIZ.append(this.LJLIL);
        LIZ.append(", mobParams=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", isNeedLine=");
        return C48339Iy7.LIZJ(LIZ, this.LJLJI, ')', LIZ);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    public C26013AIv(C38683FGd c38683FGd, java.util.Map<String, String> map, boolean z) {
        this.LJLIL = c38683FGd;
        this.LJLILLLLZI = map;
        this.LJLJI = z;
    }
}
