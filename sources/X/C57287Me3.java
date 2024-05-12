package X;

/* renamed from: X.Me3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57287Me3 implements InterfaceC65462ha<C199857sr> {
    public final /* synthetic */ InterfaceC65462ha LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ C57285Me1 LJLJI;

    @Override // X.InterfaceC65462ha
    public final Object collect(InterfaceC64672gJ<? super C199857sr> interfaceC64672gJ, InterfaceC67352kd interfaceC67352kd) {
        Object collect = this.LJLIL.collect(new C57291Me7(interfaceC64672gJ, this.LJLILLLLZI, this.LJLJI), interfaceC67352kd);
        if (collect == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return collect;
        }
        return C76800UCe.LIZ;
    }

    public C57287Me3(InterfaceC65462ha interfaceC65462ha, long j, C57285Me1 c57285Me1) {
        this.LJLIL = interfaceC65462ha;
        this.LJLILLLLZI = j;
        this.LJLJI = c57285Me1;
    }
}
