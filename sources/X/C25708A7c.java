package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.link.LinkPrivacyNoticeController$tryShowAsync$1", f = "LinkPrivacyNoticeController.kt", l = {99}, m = "invokeSuspend")
/* renamed from: X.A7c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25708A7c extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C25710A7e LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25708A7c(C25710A7e c25710A7e, InterfaceC67352kd<? super C25708A7c> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c25710A7e;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C25708A7c(this.LJLILLLLZI, interfaceC67352kd);
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
            C25710A7e c25710A7e = this.LJLILLLLZI;
            this.LJLIL = 1;
            if (c25710A7e.LIZJ(this) == enumC58928NAu) {
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
