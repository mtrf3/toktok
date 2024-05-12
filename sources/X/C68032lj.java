package X;

/* renamed from: X.2lj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C68032lj extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLILLLLZI;
    public final /* synthetic */ InterfaceC35811ar<Long> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C68032lj(long j, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC35811ar<Long> interfaceC35811ar) {
        super(0);
        this.LJLIL = j;
        this.LJLILLLLZI = interfaceC65784Pro;
        this.LJLJI = interfaceC35811ar;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.LJLJI.getValue().longValue() > this.LJLIL) {
            this.LJLJI.setValue(Long.valueOf(currentTimeMillis));
            this.LJLILLLLZI.invoke();
        }
    }

    @Override // X.InterfaceC65784Pro
    public /* bridge */ /* synthetic */ C76800UCe invoke() {
        invoke2();
        return C76800UCe.LIZ;
    }
}
