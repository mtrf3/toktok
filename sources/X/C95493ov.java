package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3ov, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C95493ov extends F9E implements InterfaceC57784Mm4 {
    public final EnumC95523oy LJLIL;
    public final InterfaceC88472Yns<Boolean, C76800UCe> LJLILLLLZI;
    public final InterfaceC65784Pro<C76800UCe> LJLJI;

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI};
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C95493ov(EnumC95523oy type, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        o.LJIIIZ(type, "type");
        this.LJLIL = type;
        this.LJLILLLLZI = interfaceC88472Yns;
        this.LJLJI = interfaceC65784Pro;
    }
}
