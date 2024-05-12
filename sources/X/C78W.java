package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.78W, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C78W implements InterfaceC57784Mm4 {
    public final String LJLIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C78W) && o.LJ(this.LJLIL, ((C78W) obj).LJLIL);
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public final int hashCode() {
        return this.LJLIL.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LocationServicesHeaderItem(title=");
        return q.LIZIZ(LIZ, this.LJLIL, ')', LIZ);
    }

    public C78W(String str) {
        this.LJLIL = str;
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }
}
