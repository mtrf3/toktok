package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.base.input.InputFormViewController$sendEvent$1", f = "InputFormViewController.kt", l = {105}, m = "invokeSuspend")
/* renamed from: X.NIk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59126NIk extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C71742SDq LJLILLLLZI;
    public final /* synthetic */ AbstractC71736SDk LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59126NIk(C71742SDq c71742SDq, AbstractC71736SDk abstractC71736SDk, InterfaceC67352kd<? super C59126NIk> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c71742SDq;
        this.LJLJI = abstractC71736SDk;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C59126NIk(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            XLL xll = this.LJLILLLLZI.LJLJLJ;
            AbstractC71736SDk abstractC71736SDk = this.LJLJI;
            this.LJLIL = 1;
            if (xll.emit(abstractC71736SDk, this) == enumC58928NAu) {
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
