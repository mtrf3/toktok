package X;

/* renamed from: X.20t, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C515920t extends AbstractC65781Prl implements InterfaceC88471Ynr<Float, Float, Boolean> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ InterfaceC70422pa LJLILLLLZI;
    public final /* synthetic */ InterfaceC13170fR LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C515920t(boolean z, InterfaceC70422pa interfaceC70422pa, InterfaceC13170fR interfaceC13170fR) {
        super(2);
        this.LJLIL = z;
        this.LJLILLLLZI = interfaceC70422pa;
        this.LJLJI = interfaceC13170fR;
    }

    @Override // X.InterfaceC88471Ynr
    public final Boolean invoke(Float f, Float f2) {
        float floatValue = f.floatValue();
        float floatValue2 = f2.floatValue();
        if (this.LJLIL) {
            floatValue = floatValue2;
        }
        XKX.LIZLLL(this.LJLILLLLZI, null, null, new C2EB(this.LJLJI, floatValue, null), 3);
        return Boolean.TRUE;
    }
}
