package X;

import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.inbox.InboxFragment$onViewCreated$1$4", f = "InboxFragment.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.32W, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C32W extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C32W(InterfaceC67352kd<? super C32W> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C32W(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        IMService.createIIMServicebyMonsterPlugin(false).initActivityStatusMsgReceiveOptimization();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new C32W(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
