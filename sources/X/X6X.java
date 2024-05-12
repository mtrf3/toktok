package X;

import com.bytedance.ext_power_list.AssemSingleListViewModel;
import fjb.a;

/* JADX INFO: Add missing generic type declarations: [ITEM] */
@InterfaceC65848Psq(c = "com.bytedance.ext_power_list.AssemSingleListViewModel$refreshInner$2", f = "AssemSingleListViewModel.kt", l = {174}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class X6X<ITEM> extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super AbstractC57774Mlu<ITEM>>, Object> {
    public int LJLIL;
    public final /* synthetic */ AssemSingleListViewModel<ITEM, S, Cursor> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X6X(AssemSingleListViewModel<ITEM, S, Cursor> assemSingleListViewModel, InterfaceC67352kd<? super X6X> interfaceC67352kd) {
        super(1, interfaceC67352kd);
        this.LJLILLLLZI = assemSingleListViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new X6X(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        return ((a) create((InterfaceC67352kd) obj)).invokeSuspend(C76800UCe.LIZ);
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
            AssemSingleListViewModel<ITEM, S, Cursor> assemSingleListViewModel = this.LJLILLLLZI;
            this.LJLIL = 1;
            obj = assemSingleListViewModel.whenRefresh(this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }
}
