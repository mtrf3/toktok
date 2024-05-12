package X;

import android.app.Activity;
import com.zhiliaoapp.musically.R;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.fashionmall.vm.ShopMainViewModel$loadRemoteData$2$6", f = "ShopMainViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2xn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75512xn extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C75512xn(InterfaceC67352kd<? super C75512xn> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C75512xn(interfaceC67352kd);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        try {
            Activity LIZIZ = FKM.LIZIZ();
            if (LIZIZ != null) {
                C26045AKb c26045AKb = new C26045AKb(LIZIZ);
                c26045AKb.LJIIIZ(C16880lQ.LLLLJI(FKM.LIZ()).getString(R.string.f3g));
                c26045AKb.LJIIJ();
            } else {
                LIZIZ = null;
            }
            C3C5.m7constructorimpl(LIZIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return C76800UCe.LIZ;
    }
}
