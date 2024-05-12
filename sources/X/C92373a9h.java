package X;

import kotlin.jvm.internal.o;

/* renamed from: X.a9h, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92373a9h extends F9E implements InterfaceC57784Mm4 {
    public final EnumC92002a3i LJLIL;
    public final String LJLILLLLZI;

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    public C92373a9h(EnumC92002a3i type, String str) {
        o.LJIIIZ(type, "type");
        this.LJLIL = type;
        this.LJLILLLLZI = str;
    }
}
