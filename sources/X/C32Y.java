package X;

import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel$onCreate$1", f = "BaseChatPanel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.32Y, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C32Y extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C32Y(InterfaceC67352kd<? super C32Y> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C32Y(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        IMService.createIIMServicebyMonsterPlugin(false).initActivityStatusMsgReceiveOptimization();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new C32Y(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
