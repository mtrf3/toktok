package X;

import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JN2 extends F9E implements InterfaceC57784Mm4 {
    public final int LJLIL;
    public final String LJLILLLLZI;

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), this.LJLILLLLZI};
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    public JN2(int i, String sug) {
        o.LJIIIZ(sug, "sug");
        this.LJLIL = i;
        this.LJLILLLLZI = sug;
    }
}
