package X;

import Y.IDfS132S0100000_12;
import com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuWidget;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuWidget$initSubscribe$7", f = "SkuWidget.kt", l = {131}, m = "invokeSuspend")
/* renamed from: X.RgA, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70158RgA extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ SkuWidget LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70158RgA(SkuWidget skuWidget, InterfaceC67352kd<? super C70158RgA> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = skuWidget;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C70158RgA(this.LJLILLLLZI, interfaceC67352kd);
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
            IDfS132S0100000_12 iDfS132S0100000_12 = new IDfS132S0100000_12(this.LJLILLLLZI, 1);
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
