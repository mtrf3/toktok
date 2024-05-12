package X;

import kotlin.jvm.internal.o;

/* renamed from: X.8kE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C219988kE extends F9E implements InterfaceC57784Mm4 {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final boolean LJLJI;
    public final C220108kQ LJLJJI;

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), Integer.valueOf(this.LJLILLLLZI), Boolean.valueOf(this.LJLJI), this.LJLJJI};
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    public C219988kE(int i, int i2, boolean z, C220108kQ c220108kQ) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = z;
        this.LJLJJI = c220108kQ;
    }
}
