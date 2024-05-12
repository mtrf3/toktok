package X;

import com.bytedance.android.live.liveinteract.multimatch.clientai.CoHostFriendNoticeService;
import com.bytedance.android.livesdk.livesetting.clientai.CohostNoticeStrategySettings;
import org.json.JSONObject;

/* renamed from: X.Cjl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32161Cjl extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ CoHostFriendNoticeService LJLIL;
    public final /* synthetic */ long LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32161Cjl(CoHostFriendNoticeService coHostFriendNoticeService, long j) {
        super(0);
        this.LJLIL = coHostFriendNoticeService;
        this.LJLILLLLZI = j;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        InterfaceC22790ux interfaceC22790ux = (InterfaceC22790ux) this.LJLIL.LJLJI.getValue();
        C22820v0 c22820v0 = new C22820v0(false, new JSONObject().putOpt("room_id", Long.valueOf(this.LJLILLLLZI)).putOpt("type", "execution").putOpt("notice_strategy_group", Integer.valueOf(CohostNoticeStrategySettings.INSTANCE.getGetStickValue())));
        CoHostFriendNoticeService coHostFriendNoticeService = this.LJLIL;
        long j = this.LJLILLLLZI;
        coHostFriendNoticeService.getClass();
        interfaceC22790ux.LIZJ(new C22810uz("live_cohost_friend_notice_optimize_strategy", c22820v0, new C32153Cjd(coHostFriendNoticeService, j), (C35201Zs) null, 24));
        return C76800UCe.LIZ;
    }
}
