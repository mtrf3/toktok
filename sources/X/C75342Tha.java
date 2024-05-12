package X;

import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.gift.rank.MultiGuestGiftContributeRankDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.LiveShowEndEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.show.guest.LiveShowGuestWidget;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLeaveGiftRankIsUSRegionSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* renamed from: X.Tha, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75342Tha implements InterfaceC76578U3q {
    public final /* synthetic */ LiveShowGuestWidget LIZ;

    @Override // X.InterfaceC76578U3q
    public final void LIZ() {
        FragmentManager fragmentManager;
        String str;
        U35 LIZ = TQA.LIZ();
        if (LIZ != null && LIZ.LIZ() && !MultiGuestLeaveGiftRankIsUSRegionSetting.INSTANCE.isInUS()) {
            LiveShowGuestWidget liveShowGuestWidget = this.LIZ;
            liveShowGuestWidget.getClass();
            Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            if (room != null) {
                User LJ = ((C29374Bfu) B83.LIZ().LIZIZ()).LJ();
                EnumC74877Ta5 enumC74877Ta5 = EnumC74877Ta5.LIVE_SHOW_END;
                U35 LIZ2 = TQA.LIZ();
                Long l = null;
                if (LIZ2 != null) {
                    l = LIZ2.LJIIJ();
                }
                MultiGuestGiftContributeRankDialog LIZ3 = C74876Ta4.LIZ(LJ, room, enumC74877Ta5, l);
                DataChannel dataChannel = liveShowGuestWidget.dataChannel;
                if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.kv0(C29494Bhq.class)) != null) {
                    LIZ3.show(fragmentManager, LiveShowGuestWidget.class.getName());
                    java.util.Map LIZLLL = C76548U2m.LIZLLL();
                    U35 LIZ4 = TQA.LIZ();
                    if (LIZ4 == null || (str = Long.valueOf(LIZ4.LJI(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId())).toString()) == null) {
                        str = CardStruct.IStatusCode.DEFAULT;
                    }
                    LIZLLL.put("charm_value", str);
                    C76548U2m.LJIIZILJ("livesdk_guest_liveshow_ranking_show", LIZLLL);
                }
            }
        }
        this.LIZ.dataChannel.qv0(LiveShowEndEvent.class, C76800UCe.LIZ);
        this.LIZ.LJLZ();
    }

    public C75342Tha(LiveShowGuestWidget liveShowGuestWidget) {
        this.LIZ = liveShowGuestWidget;
    }
}
