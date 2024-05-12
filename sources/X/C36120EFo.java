package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.im.core.internal.receivebuffer.SingleInboxMessageReceiveBuffer$moveToProcessingStateFrom$2", f = "SingleInboxMessageReceiveBuffer.kt", l = {260}, m = "invokeSuspend")
/* renamed from: X.EFo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36120EFo extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C63420Oum LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36120EFo(C63420Oum c63420Oum, InterfaceC67352kd<? super C36120EFo> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c63420Oum;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C36120EFo(this.LJLILLLLZI, interfaceC67352kd);
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
            C63420Oum c63420Oum = this.LJLILLLLZI;
            this.LJLIL = 1;
            if (c63420Oum.LJIIIZ(this) == enumC58928NAu) {
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
