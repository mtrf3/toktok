package X;

import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelViewModel$sendUncheckedSpecData$1", f = "SkuPanelViewModel.kt", l = {295}, m = "invokeSuspend")
/* renamed from: X.ReU, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70054ReU extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ SkuPanelViewModel LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70054ReU(SkuPanelViewModel skuPanelViewModel, String str, InterfaceC67352kd<? super C70054ReU> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = skuPanelViewModel;
        this.LJLJI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C70054ReU(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            SkuPanelViewModel skuPanelViewModel = this.LJLILLLLZI;
            XLL xll = skuPanelViewModel.LL;
            C70067Reh c70067Reh = new C70067Reh(this.LJLJI, skuPanelViewModel.LJZI);
            this.LJLIL = 1;
            if (xll.emit(c70067Reh, this) == enumC58928NAu) {
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
