package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multilive.model.ListByTypeResponse;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TUO extends AbstractC65781Prl implements InterfaceC88472Yns<ListByTypeResponse.GiftScoreAppliedUser, Boolean> {
    public static final TUO LJLIL = new TUO();

    public TUO() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(ListByTypeResponse.GiftScoreAppliedUser giftScoreAppliedUser) {
        Long l;
        InterfaceC29405BgP LIZIZ;
        User user;
        ListByTypeResponse.GiftScoreAppliedUser giftScoreAppliedUser2 = giftScoreAppliedUser;
        o.LJIIIZ(giftScoreAppliedUser2, "giftScoreAppliedUser");
        LinkPlayerInfo linkPlayerInfo = giftScoreAppliedUser2.listUser;
        Long l2 = null;
        if (linkPlayerInfo != null && (user = linkPlayerInfo.mUser) != null) {
            l = Long.valueOf(user.getId());
        } else {
            l = null;
        }
        B83 LIZ = B83.LIZ();
        if (LIZ != null && (LIZIZ = LIZ.LIZIZ()) != null) {
            l2 = Long.valueOf(LIZIZ.getCurrentUserId());
        }
        return Boolean.valueOf(o.LJ(l, l2));
    }
}
