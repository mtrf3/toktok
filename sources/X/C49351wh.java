package X;

/* renamed from: X.1wh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49351wh extends AbstractC65781Prl implements InterfaceC88471Ynr<Float, Float, Boolean> {
    public final /* synthetic */ InterfaceC70422pa LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ C31431Lf LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49351wh(InterfaceC70422pa interfaceC70422pa, boolean z, C31431Lf c31431Lf) {
        super(2);
        this.LJLIL = interfaceC70422pa;
        this.LJLILLLLZI = z;
        this.LJLJI = c31431Lf;
    }

    @Override // X.InterfaceC88471Ynr
    public final Boolean invoke(Float f, Float f2) {
        float floatValue = f.floatValue();
        XKX.LIZLLL(this.LJLIL, null, null, new C2CQ(this.LJLILLLLZI, this.LJLJI, f2.floatValue(), floatValue, null), 3);
        return Boolean.TRUE;
    }
}
