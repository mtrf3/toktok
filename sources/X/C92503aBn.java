package X;

/* renamed from: X.aBn, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92503aBn extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ InterfaceC88472Yns LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92503aBn(InterfaceC88472Yns interfaceC88472Yns, boolean z) {
        super(0);
        this.LJLIL = interfaceC88472Yns;
        this.LJLILLLLZI = z;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.LJLIL.invoke(Boolean.valueOf(!this.LJLILLLLZI));
    }

    @Override // X.InterfaceC65784Pro
    public /* bridge */ /* synthetic */ C76800UCe invoke() {
        invoke2();
        return C76800UCe.LIZ;
    }
}
