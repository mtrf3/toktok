package X;

import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4kR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C118194kR implements InterfaceC57784Mm4 {
    public final List<String> LJLIL;
    public final String LJLILLLLZI;

    public C118194kR() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C118194kR)) {
            return false;
        }
        C118194kR c118194kR = (C118194kR) obj;
        return o.LJ(this.LJLIL, c118194kR.LJLIL) && o.LJ(this.LJLILLLLZI, c118194kR.LJLILLLLZI);
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public final int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        String str = this.LJLILLLLZI;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SupportIconsItem(icons=");
        LIZ.append(this.LJLIL);
        LIZ.append(", title=");
        return q.LIZIZ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    public C118194kR(List icons) {
        o.LJIIIZ(icons, "icons");
        this.LJLIL = icons;
        this.LJLILLLLZI = null;
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
