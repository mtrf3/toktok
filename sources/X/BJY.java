package X;

import com.bytedance.android.live.rank.impl.setting.AnchorRankingSettingFragment;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public final class BJY implements BJT {
    public final /* synthetic */ AnchorRankingSettingFragment LIZ;
    public final /* synthetic */ BJW LIZIZ;

    @Override // X.BJT
    public final void onCancel() {
    }

    @Override // X.BJT
    public final void LIZ() {
        String str;
        Room room;
        RoomAuthStatus roomAuthStatus;
        ((C011602u) this.LIZ._$_findCachedViewById(R.id.cko)).toggle();
        Room Il = this.LIZ.Il();
        Long l = null;
        if (Il != null && (roomAuthStatus = Il.getRoomAuthStatus()) != null) {
            roomAuthStatus.ecRankSwitchStatus = (int) this.LIZIZ.getValue();
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_live_sale_rankings_setting_click");
        LIZ.LJIIZILJ();
        LIZ.LJIJJ(DataChannelGlobal.LJLJJI.mv0(C29033BaP.class), "enter_from");
        if (this.LIZIZ == BJW.RANK_SWITCH_STATUS_ON) {
            str = "open";
        } else {
            str = "close";
        }
        LIZ.LJIJJ(str, "status");
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this.LIZ);
        if (LJIILIIL != null && (room = (Room) LJIILIIL.kv0(RoomChannel.class)) != null) {
            l = Long.valueOf(room.getOwnerUserId());
        }
        LIZ.LJIJJ(l, "author_id");
        LIZ.LJJIIJZLJL();
    }

    @Override // X.BJT
    public final void onFailed() {
        C30868C9o.LIZJ(R.string.mg2);
    }

    public BJY(AnchorRankingSettingFragment anchorRankingSettingFragment, BJW bjw) {
        this.LIZ = anchorRankingSettingFragment;
        this.LIZIZ = bjw;
    }
}
