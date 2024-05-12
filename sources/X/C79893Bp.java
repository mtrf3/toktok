package X;

import fjb.a;

@InterfaceC65848Psq(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$sendBlocking$1", f = "Channels.kt", l = {57}, m = "invokeSuspend")
/* renamed from: X.3Bp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C79893Bp extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C3T4<Object> LJLILLLLZI;
    public final /* synthetic */ Object LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C79893Bp(C3T4<Object> c3t4, Object obj, InterfaceC67352kd<? super C79893Bp> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c3t4;
        this.LJLJI = obj;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C79893Bp(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            C3T4<Object> c3t4 = this.LJLILLLLZI;
            Object obj2 = this.LJLJI;
            this.LJLIL = 1;
            if (c3t4.LJIIIZ(obj2, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
