package X;

import com.bytedance.android.livesdk.comp.impl.linkcore.api.LinkMicApi;
import com.bytedance.android.livesdk.model.message.linkcore.Player;
import kotlin.jvm.internal.o;
import tikcast.linkmic.controller.RechargeReq;

/* renamed from: X.U7q, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76682U7q<T, R> implements InterfaceC48038ItG {
    public final /* synthetic */ U7T LJLIL;
    public final /* synthetic */ long LJLILLLLZI;

    public C76682U7q(U7T u7t, long j) {
        this.LJLIL = u7t;
        this.LJLILLLLZI = j;
    }

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object it) {
        o.LJIIIZ(it, "it");
        C65814PsI.LIZ().getClass();
        LinkMicApi linkMicApi = (LinkMicApi) C65814PsI.LIZJ(LinkMicApi.class);
        RechargeReq rechargeReq = new RechargeReq();
        U7T u7t = this.LJLIL;
        long j = this.LJLILLLLZI;
        rechargeReq.channelId = u7t.LJI;
        rechargeReq.common = U7T.LJJIJIL(u7t, "compensate_reply_invite_message", 2);
        rechargeReq.myself = new Player(u7t.LJIL, u7t.LJIILIIL);
        rechargeReq.target = new Player(u7t.LJIL, j);
        rechargeReq.type = 2;
        return linkMicApi.recharge(rechargeReq);
    }
}
