package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.7WZ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7WZ implements InterfaceC57784Mm4 {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;

    public C7WZ() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7WZ)) {
            return false;
        }
        C7WZ c7wz = (C7WZ) obj;
        return o.LJ(this.LJLIL, c7wz.LJLIL) && o.LJ(this.LJLILLLLZI, c7wz.LJLILLLLZI) && o.LJ(this.LJLJI, c7wz.LJLJI);
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public final int hashCode() {
        String str = this.LJLIL;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJLJI;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PoiCollectItem(poiName=");
        LIZ.append(this.LJLIL);
        LIZ.append(", poiAddress=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", poiId=");
        return q.LIZIZ(LIZ, this.LJLJI, ')', LIZ);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    public C7WZ(String str, String str2, String str3) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
    }
}
