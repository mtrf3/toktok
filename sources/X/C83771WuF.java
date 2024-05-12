package X;

/* renamed from: X.WuF, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83771WuF implements InterfaceC84052Wym {
    public final /* synthetic */ InterfaceC67352kd LIZ;
    public final /* synthetic */ InterfaceC70422pa LIZIZ;

    public C83771WuF(C84654XKg c84654XKg, InterfaceC70422pa interfaceC70422pa) {
        this.LIZ = c84654XKg;
        this.LIZIZ = interfaceC70422pa;
    }

    @Override // X.InterfaceC84052Wym
    public final void LIZ(int i) {
        if (C48841JEv.LJIILLIIL(this.LIZIZ)) {
            InterfaceC67352kd interfaceC67352kd = this.LIZ;
            Integer valueOf = Integer.valueOf(i);
            C3C5.m7constructorimpl(valueOf);
            interfaceC67352kd.resumeWith(valueOf);
        }
    }
}
