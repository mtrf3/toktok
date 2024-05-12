package X;

/* renamed from: X.aiq, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94552aiq extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ C94550aio LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94552aiq(C94550aio c94550aio, boolean z) {
        super(0);
        this.LJLIL = c94550aio;
        this.LJLILLLLZI = z;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        InterfaceC88472Yns interfaceC88472Yns = this.LJLIL.LJLILLLLZI;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Boolean.valueOf(this.LJLILLLLZI));
        }
        return C76800UCe.LIZ;
    }
}
