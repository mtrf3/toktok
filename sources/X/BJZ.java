package X;

import com.bytedance.android.live.rank.impl.setting.AnchorRankingSettingFragment;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public final class BJZ implements BJT {
    public final /* synthetic */ AnchorRankingSettingFragment LIZ;
    public final /* synthetic */ BJW LIZIZ;

    @Override // X.BJT
    public final void onCancel() {
    }

    @Override // X.BJT
    public final void LIZ() {
        String str;
        String str2;
        RoomAuthStatus roomAuthStatus;
        ((C011602u) this.LIZ._$_findCachedViewById(R.id.dqr)).toggle();
        Room Il = this.LIZ.Il();
        if (Il != null && (roomAuthStatus = Il.getRoomAuthStatus()) != null) {
            roomAuthStatus.gamerankingswitch = (int) this.LIZIZ.getValue();
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_live_rankings_setting_click");
        LIZ.LJIIZILJ();
        LIZ.LJIJJ(DataChannelGlobal.LJLJJI.mv0(C29033BaP.class), "enter_from");
        if (this.LIZIZ == BJW.RANK_SWITCH_STATUS_ON) {
            str = "open";
        } else {
            str = "close";
        }
        LIZ.LJIJJ(str, "ranking_status");
        LIZ.LJIJJ("anchor", "user_type");
        LIZ.LJIJJ("game_ranking", "rank_type");
        if (C29306Beo.LJJI()) {
            str2 = "live_take_page";
        } else {
            str2 = "live_take_detail";
        }
        LIZ.LJIIJJI(str2);
        LIZ.LJJIIJZLJL();
    }

    @Override // X.BJT
    public final void onFailed() {
        C30868C9o.LIZJ(R.string.mg2);
    }

    public BJZ(AnchorRankingSettingFragment anchorRankingSettingFragment, BJW bjw) {
        this.LIZ = anchorRankingSettingFragment;
        this.LIZIZ = bjw;
    }
}
