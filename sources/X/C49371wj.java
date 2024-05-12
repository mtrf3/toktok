package X;

/* renamed from: X.1wj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49371wj extends AbstractC65781Prl implements InterfaceC88472Yns<C10370av, C76800UCe> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ InterfaceC24760y8<InterfaceC65784Pro<C76800UCe>> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49371wj(InterfaceC24760y8 interfaceC24760y8, boolean z) {
        super(1);
        this.LJLIL = z;
        this.LJLILLLLZI = interfaceC24760y8;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C10370av c10370av) {
        if (this.LJLIL) {
            this.LJLILLLLZI.getValue().invoke();
        }
        return C76800UCe.LIZ;
    }
}
