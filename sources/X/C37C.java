package X;

import fjb.a;
import org.greenrobot.eventbus.EventBus;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.controller.core.SessionListManagerV2$subscribe$1", f = "SessionListManagerV2.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.37C, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C37C extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C82253Kr LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37C(C82253Kr c82253Kr, InterfaceC67352kd<? super C37C> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c82253Kr;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C37C(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        EventBus.LIZJ().LJIILJJIL(this.LJLIL);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
