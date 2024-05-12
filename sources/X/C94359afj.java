package X;

/* renamed from: X.afj, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94359afj implements InterfaceC65462ha<Boolean> {
    public final /* synthetic */ InterfaceC65462ha LJLIL;
    public final /* synthetic */ C93972aZU LJLILLLLZI;
    public final /* synthetic */ C68322mC LJLJI;
    public final /* synthetic */ long LJLJJI;

    @Override // X.InterfaceC65462ha
    public final Object collect(InterfaceC64672gJ<? super Boolean> interfaceC64672gJ, InterfaceC67352kd interfaceC67352kd) {
        Object collect = this.LJLIL.collect(new C94358afi(interfaceC64672gJ, this.LJLILLLLZI, this.LJLJI, this.LJLJJI), interfaceC67352kd);
        if (collect == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return collect;
        }
        return C76800UCe.LIZ;
    }

    public C94359afj(InterfaceC65462ha interfaceC65462ha, C93972aZU c93972aZU, C68322mC c68322mC, long j) {
        this.LJLIL = interfaceC65462ha;
        this.LJLILLLLZI = c93972aZU;
        this.LJLJI = c68322mC;
        this.LJLJJI = j;
    }
}
