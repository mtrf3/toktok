package X;

import com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotVM;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotVM$handleMessageReadEvent$1", f = "CustomDotVM.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class EHZ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ CustomDotVM LJLIL;
    public final /* synthetic */ C54262LRi LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EHZ(CustomDotVM customDotVM, C54262LRi c54262LRi, boolean z, InterfaceC67352kd<? super EHZ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = customDotVM;
        this.LJLILLLLZI = c54262LRi;
        this.LJLJI = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new EHZ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        CustomDotVM customDotVM = this.LJLIL;
        int i = this.LJLILLLLZI.LJLILLLLZI;
        customDotVM.getClass();
        int LJIILIIL = C54362LVe.LJIILIIL(210);
        int LJIILIIL2 = C54362LVe.LJIILIIL(214);
        if (i == -99999 && (LJIILIIL == 0 || LJIILIIL2 == 0)) {
            this.LJLIL.rv0(this.LJLJI);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
