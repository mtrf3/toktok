package X;

import com.bytedance.android.live.rank.impl.setting.NewRankSettingDialog;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;

/* renamed from: X.BJb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28567BJb implements BJT {
    public final /* synthetic */ C41071jL LIZ;
    public final /* synthetic */ boolean LIZIZ;
    public final /* synthetic */ NewRankSettingDialog LIZJ;
    public final /* synthetic */ BJW LIZLLL;

    @Override // X.BJT
    public final void onCancel() {
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Long, O] */
    @Override // X.BJT
    public final void LIZ() {
        BJW bjw;
        String str;
        String str2;
        String str3;
        RoomAuthStatus roomAuthStatus;
        this.LIZ.toggle();
        if (this.LIZIZ) {
            Room room = (Room) this.LIZJ.LJLIL.getValue();
            if (room != null && (roomAuthStatus = room.getRoomAuthStatus()) != null) {
                roomAuthStatus.setGiftRankSwitchStatus((int) this.LIZLLL.getValue());
            }
        } else {
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
            if (this.LIZ.isChecked()) {
                bjw = BJW.RANK_SWITCH_STATUS_ON;
            } else {
                bjw = BJW.RANK_SWITCH_STATUS_OFF;
            }
            ((C32537Cpp) dataChannelGlobal.gv0(C29025BaH.class)).LIZ = Long.valueOf(bjw.getValue());
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_live_rankings_setting_click");
        LIZ.LJIIZILJ();
        LIZ.LJIJJ(DataChannelGlobal.LJLJJI.mv0(C29033BaP.class), "enter_from");
        if (this.LIZLLL == BJW.RANK_SWITCH_STATUS_ON) {
            str = "open";
        } else {
            str = "close";
        }
        LIZ.LJIJJ(str, "ranking_status");
        if (this.LIZIZ) {
            str2 = "anchor";
        } else {
            str2 = "user";
        }
        LIZ.LJIJJ(str2, "user_type");
        LIZ.LJIJJ("gift_ranking", "rank_type");
        if (C29306Beo.LJJI()) {
            str3 = "live_take_page";
        } else {
            str3 = "live_take_detail";
        }
        LIZ.LJIIJJI(str3);
        LIZ.LJJIIJZLJL();
    }

    @Override // X.BJT
    public final void onFailed() {
        C30868C9o.LIZJ(R.string.mg2);
    }

    public C28567BJb(C41071jL c41071jL, boolean z, NewRankSettingDialog newRankSettingDialog, BJW bjw) {
        this.LIZ = c41071jL;
        this.LIZIZ = z;
        this.LIZJ = newRankSettingDialog;
        this.LIZLLL = bjw;
    }
}
