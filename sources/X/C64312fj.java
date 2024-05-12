package X;

import android.app.Activity;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.slark.event.Event$showToast$1", f = "Event.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2fj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64312fj extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ String LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C64312fj(String str, InterfaceC67352kd<? super C64312fj> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C64312fj(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        Activity LIZIZ = FKM.LIZIZ();
        if (LIZIZ != null) {
            String str = this.LJLIL;
            C26045AKb c26045AKb = new C26045AKb(LIZIZ);
            c26045AKb.LJIIIZ(str);
            c26045AKb.LIZ(true);
            c26045AKb.LIZLLL(5000L);
            c26045AKb.LJIIJ();
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
