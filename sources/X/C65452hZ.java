package X;

import fjb.a;

@InterfaceC65848Psq(c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", f = "ChannelFlow.kt", l = {152}, m = "invokeSuspend")
/* renamed from: X.2hZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65452hZ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC64672gJ<Object>, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ AbstractC79763Bc<Object, Object> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65452hZ(AbstractC79763Bc<Object, Object> abstractC79763Bc, InterfaceC67352kd<? super C65452hZ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = abstractC79763Bc;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C65452hZ c65452hZ = new C65452hZ(this.LJLJI, interfaceC67352kd);
        c65452hZ.LJLILLLLZI = obj;
        return c65452hZ;
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
            InterfaceC64672gJ<? super Object> interfaceC64672gJ = (InterfaceC64672gJ) this.LJLILLLLZI;
            AbstractC79763Bc<Object, Object> abstractC79763Bc = this.LJLJI;
            this.LJLIL = 1;
            if (abstractC79763Bc.LIZLLL(interfaceC64672gJ, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC64672gJ<Object> interfaceC64672gJ, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC64672gJ, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
