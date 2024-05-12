package X;

import com.bytedance.pipo.checkout.sdk.viewmodel.PIViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.pipo.checkout.sdk.pages.BindPaymentMethodNavKt$BindPaymentMethodNav$1", f = "BindPaymentMethodNav.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.aLY, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93108aLY extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C92083a51 LJLIL;
    public final /* synthetic */ C92204a6y LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ PIViewModel LJLJJL;
    public final /* synthetic */ String LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93108aLY(C92083a51 c92083a51, C92204a6y c92204a6y, String str, String str2, PIViewModel pIViewModel, String str3, InterfaceC67352kd<? super C93108aLY> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c92083a51;
        this.LJLILLLLZI = c92204a6y;
        this.LJLJI = str;
        this.LJLJJI = str2;
        this.LJLJJL = pIViewModel;
        this.LJLJJLL = str3;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C93108aLY(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC91961a33 LIZ;
        C141335gf.LIZJ(obj);
        C91943a2l.LIZIZ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, C92243a7b.LIZ, new C93169aMX(this.LJLJJL.getEventSender()), null);
        String str = this.LJLJJLL;
        if (str != null && (LIZ = C91867a1X.LIZ(this.LJLILLLLZI, str)) != null) {
            C91943a2l.LIZJ(LIZ);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
