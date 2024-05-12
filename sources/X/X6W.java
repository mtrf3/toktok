package X;

import fjb.a;

/* JADX INFO: Add missing generic type declarations: [ITEM] */
@InterfaceC65848Psq(c = "com.bytedance.ext_power_list.AssemSingleListViewModel$loadPage$2$pageValue$1", f = "AssemSingleListViewModel.kt", l = {108}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class X6W<ITEM> extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super AbstractC57774Mlu<ITEM>>, Object> {
    public int LJLIL;
    public final /* synthetic */ InterfaceC88472Yns<InterfaceC67352kd<? super AbstractC57774Mlu<ITEM>>, Object> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public X6W(InterfaceC88472Yns<? super InterfaceC67352kd<? super AbstractC57774Mlu<ITEM>>, ? extends Object> interfaceC88472Yns, InterfaceC67352kd<? super X6W> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = interfaceC88472Yns;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new X6W(this.LJLILLLLZI, interfaceC67352kd);
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
            InterfaceC88472Yns<InterfaceC67352kd<? super AbstractC57774Mlu<ITEM>>, Object> interfaceC88472Yns = this.LJLILLLLZI;
            this.LJLIL = 1;
            obj = interfaceC88472Yns.invoke(this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, Object obj) {
        return ((a) create(interfaceC70422pa, (InterfaceC67352kd) obj)).invokeSuspend(C76800UCe.LIZ);
    }
}
