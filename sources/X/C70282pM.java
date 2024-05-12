package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.automessage.controller.LandAutoMsgReceiverToChatNode$collectToLandToChat$2$1", f = "LandAutoMsgReceiverToChatNode.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2pM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C70282pM extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ InterfaceC70262pK LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70282pM(InterfaceC70262pK interfaceC70262pK, InterfaceC67352kd<? super C70282pM> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = interfaceC70262pK;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C70282pM(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        ((C70292pN) this.LJLIL).LIZIZ.invoke();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
