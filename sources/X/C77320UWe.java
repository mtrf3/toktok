package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.mota.runner.network.NetworkRunner$onNetworkStateChange$1", f = "NetworkRunner.kt", l = {132}, m = "invokeSuspend")
/* renamed from: X.UWe, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77320UWe extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ EnumC111404Yu LJLILLLLZI;
    public final /* synthetic */ C84563XGt LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C77320UWe(EnumC111404Yu enumC111404Yu, C84563XGt c84563XGt, InterfaceC67352kd<? super C77320UWe> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = enumC111404Yu;
        this.LJLJI = c84563XGt;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C77320UWe(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            if (this.LJLILLLLZI == EnumC111404Yu.AVAILABLE) {
                XK4 xk4 = this.LJLJI.LIZIZ;
                Boolean bool = Boolean.TRUE;
                this.LJLIL = 1;
                if (xk4.LJIIIZ(bool, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
