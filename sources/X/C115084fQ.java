package X;

import com.bytedance.common.wschannel.model.WsChannelMsg;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.iescore.depend.WsDependImpl$sendMsg$2", f = "WsDependImpl.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.4fQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C115084fQ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ WsChannelMsg LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C115084fQ(WsChannelMsg wsChannelMsg, InterfaceC67352kd<? super C115084fQ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = wsChannelMsg;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C115084fQ(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C67128QWe.LIZIZ.LIZLLL(this.LJLIL);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
