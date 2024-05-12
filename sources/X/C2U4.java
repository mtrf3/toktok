package X;

/* renamed from: X.2U4, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2U4 extends F9E implements InterfaceC57784Mm4 {
    public final boolean LJLIL;

    public C2U4() {
        this(0);
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL)};
    }

    public C2U4(int i) {
        this.LJLIL = true;
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return interfaceC57784Mm4 instanceof C2U4;
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return interfaceC57784Mm4 instanceof C2U4;
    }
}
