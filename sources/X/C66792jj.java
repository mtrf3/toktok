package X;

import com.ss.android.ugc.aweme.ecomsearch.videoinnerflow.ui.EcomSearchSwipeGuideUiComponent;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecomsearch.videoinnerflow.ui.EcomSearchSwipeGuideUiComponent$show$1$1$2", f = "EcomSearchSwipeGuideUiComponent.kt", l = {95}, m = "invokeSuspend")
/* renamed from: X.2jj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C66792jj extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ EcomSearchSwipeGuideUiComponent LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C66792jj(EcomSearchSwipeGuideUiComponent ecomSearchSwipeGuideUiComponent, InterfaceC67352kd<? super C66792jj> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = ecomSearchSwipeGuideUiComponent;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C66792jj(this.LJLILLLLZI, interfaceC67352kd);
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
            this.LJLIL = 1;
            if (C1JD.LIZJ(3000L, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        this.LJLILLLLZI.dismiss();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
