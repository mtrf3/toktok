package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.Dwj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35513Dwj implements InterfaceC57784Mm4 {
    public final String LJLIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C35513Dwj) && o.LJ(this.LJLIL, ((C35513Dwj) obj).LJLIL);
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public final int hashCode() {
        String str = this.LJLIL;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FilterTitleItem(title=");
        return q.LIZIZ(LIZ, this.LJLIL, ')', LIZ);
    }

    public C35513Dwj(String str) {
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