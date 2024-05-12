package X;

import kotlin.jvm.internal.o;

/* renamed from: X.7BO, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7BO implements InterfaceC57784Mm4 {
    public final C7BP LJLIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7BO) && o.LJ(this.LJLIL, ((C7BO) obj).LJLIL);
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public final int hashCode() {
        C7BP c7bp = this.LJLIL;
        if (c7bp == null) {
            return 0;
        }
        return c7bp.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FeedTaggedEditItem(param=");
        LIZ.append(this.LJLIL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C7BO(C7BP c7bp) {
        this.LJLIL = c7bp;
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
