package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.pipo.checkout.solution.component.tux.toast.TuxToastKt$TuxToast$2", f = "TuxToast.kt", l = {80, 82}, m = "invokeSuspend")
/* renamed from: X.aM3, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93139aM3 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ C0Q5<Boolean> LJLJI;
    public final /* synthetic */ InterfaceC35811ar<Boolean> LJLJJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93139aM3(long j, C0Q5<Boolean> c0q5, InterfaceC35811ar<Boolean> interfaceC35811ar, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC67352kd<? super C93139aM3> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = j;
        this.LJLJI = c0q5;
        this.LJLJJI = interfaceC35811ar;
        this.LJLJJL = interfaceC65784Pro;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C93139aM3(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    this.LJLJJI.setValue(Boolean.FALSE);
                    this.LJLJJL.invoke();
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            long j = this.LJLILLLLZI;
            this.LJLIL = 1;
            if (C1JD.LIZJ(j, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        C0Q5<Boolean> c0q5 = this.LJLJI;
        c0q5.LIZIZ.setValue(Boolean.FALSE);
        this.LJLIL = 2;
        if (C1JD.LIZJ(300L, this) == enumC58928NAu) {
            return enumC58928NAu;
        }
        this.LJLJJI.setValue(Boolean.FALSE);
        this.LJLJJL.invoke();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
