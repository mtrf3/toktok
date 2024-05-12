package X;

import Y.IDfS132S0100000_12;
import com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuWidgetV2;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuWidgetV2$initSubscribe$8", f = "SkuWidgetV2.kt", l = {179}, m = "invokeSuspend")
/* renamed from: X.Rg9, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70157Rg9 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ SkuWidgetV2 LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70157Rg9(SkuWidgetV2 skuWidgetV2, InterfaceC67352kd<? super C70157Rg9> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = skuWidgetV2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C70157Rg9(this.LJLILLLLZI, interfaceC67352kd);
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
            XLL xll = this.LJLILLLLZI.getMViewModel().LL;
            IDfS132S0100000_12 iDfS132S0100000_12 = new IDfS132S0100000_12(this.LJLILLLLZI, 2);
            this.LJLIL = 1;
            if (xll.collect(iDfS132S0100000_12, this) == enumC58928NAu) {
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
