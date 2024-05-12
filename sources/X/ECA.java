package X;

import com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotVM;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotVM$clearCurShopTabUI$1", f = "CustomDotVM.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class ECA extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ CustomDotVM LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ECA(CustomDotVM customDotVM, InterfaceC67352kd<? super ECA> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = customDotVM;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new ECA(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.vv0(false, false, true, new ECB(null));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
