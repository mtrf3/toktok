package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.pipo.checkout.element.elements.FormsKt$Forms$3$1$1", f = "Forms.kt", l = {189}, m = "invokeSuspend")
/* renamed from: X.aLC, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93086aLC extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C31431Lf LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93086aLC(C31431Lf c31431Lf, int i, InterfaceC67352kd<? super C93086aLC> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c31431Lf;
        this.LJLJI = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C93086aLC(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            C31431Lf c31431Lf = this.LJLILLLLZI;
            int LJ = c31431Lf.LJ() + this.LJLJI;
            this.LJLIL = 1;
            if (C31431Lf.LIZLLL(c31431Lf, LJ, this) == enumC58928NAu) {
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
