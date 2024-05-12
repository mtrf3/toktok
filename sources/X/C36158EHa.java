package X;

import com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.CustomDotVM;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.CustomDotVM$handleMessageReadEvent$1", f = "CustomDotVM.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.EHa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36158EHa extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ CustomDotVM LJLIL;
    public final /* synthetic */ C54262LRi LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36158EHa(CustomDotVM customDotVM, C54262LRi c54262LRi, boolean z, InterfaceC67352kd<? super C36158EHa> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = customDotVM;
        this.LJLILLLLZI = c54262LRi;
        this.LJLJI = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C36158EHa(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            CustomDotVM customDotVM2 = this.LJLIL;
            boolean z = this.LJLJI;
            customDotVM2.getClass();
            customDotVM2.lv0(new EC2(z, customDotVM2, null), z, false);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
