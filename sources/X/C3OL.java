package X;

import com.ss.android.ugc.aweme.im.sdk.common.data.manager.keva.IMCriticalFlowKeva;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.data.manager.keva.IMCriticalFlowKeva$storeShowChatListTimeStamp$1", f = "IMCriticalFlowKeva.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3OL, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3OL extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ long LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3OL(long j, InterfaceC67352kd<? super C3OL> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = j;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3OL(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        IMCriticalFlowKeva iMCriticalFlowKeva = IMCriticalFlowKeva.LIZ;
        iMCriticalFlowKeva.LIZJ().storeLong("show_chat_list_performance", this.LJLIL);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
