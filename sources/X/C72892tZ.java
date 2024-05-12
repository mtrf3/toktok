package X;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.iescore.depend.NetworkDependImpl$checkIfNetworkIsStillUnavailableManually$1$1$1", f = "NetworkDependImpl.kt", l = {166}, m = "invokeSuspend")
/* renamed from: X.2tZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72892tZ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;

    public C72892tZ(InterfaceC67352kd<? super C72892tZ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C72892tZ(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            C76482zM c76482zM = C76482zM.LIZ;
            this.LJLIL = 1;
            if (c76482zM.LIZIZ(this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new C72892tZ(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
