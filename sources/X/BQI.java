package X;

import android.view.ViewGroup;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.dataChannel.BroadcastEnableSubOnlyLiveEvent;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSubOnlyAllowMusicSetting;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class BQI<T> implements InterfaceC64592gB {
    public final /* synthetic */ Room LJLIL;
    public final /* synthetic */ C41071jL LJLILLLLZI;
    public final /* synthetic */ BIR LJLJI;
    public final /* synthetic */ ViewGroup LJLJJI;
    public final /* synthetic */ ViewGroup LJLJJL;
    public final /* synthetic */ ViewGroup LJLJJLL;
    public final /* synthetic */ DataChannel LJLJL;

    public BQI(Room room, C41071jL c41071jL, BIR bir, ViewGroup viewGroup, ViewGroup viewGroup2, ViewGroup viewGroup3, DataChannel dataChannel) {
        this.LJLIL = room;
        this.LJLILLLLZI = c41071jL;
        this.LJLJI = bir;
        this.LJLJJI = viewGroup;
        this.LJLJJL = viewGroup2;
        this.LJLJJLL = viewGroup3;
        this.LJLJL = dataChannel;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        boolean z;
        Long l;
        RoomAuthStatus roomAuthStatus;
        ViewGroup viewGroup;
        RoomAuthStatus roomAuthStatus2;
        RoomAuthStatus roomAuthStatus3;
        if (((BaseResponse) obj).statusCode == 0) {
            Room room = this.LJLIL;
            if (room != null && (roomAuthStatus3 = room.getRoomAuthStatus()) != null && roomAuthStatus3.chatSubOnly) {
                z = true;
            } else {
                z = false;
            }
            Boolean bool = null;
            if (z) {
                Room room2 = this.LJLIL;
                if (room2 != null && (roomAuthStatus2 = room2.getRoomAuthStatus()) != null) {
                    roomAuthStatus2.chatSubOnly = false;
                }
                C29232Bdc.LJIJ(false);
                C30868C9o.LIZJ(R.string.ofr);
            }
            InterfaceC30442Bx8.e3.LIZ(Boolean.TRUE);
            Room room3 = this.LJLIL;
            if (room3 != null) {
                room3.liveSubOnly = 1L;
            }
            BYI.LIZJ(BWZ.SUB_ONLY);
            C41071jL c41071jL = this.LJLILLLLZI;
            if (c41071jL != null) {
                c41071jL.setChecked(true);
            }
            this.LJLJI.LJIIJJI(this.LJLILLLLZI, false, BQJ.LJLIL);
            C29306Beo.LJJLJLI(this.LJLJJI);
            C29306Beo.LJJLJLI(this.LJLJJL);
            if (LiveSubOnlyAllowMusicSetting.getEnableAllowMusic() && (viewGroup = this.LJLJJLL) != null) {
                C29306Beo.LJJLJLI(viewGroup);
            }
            DataChannel dataChannel = this.LJLJL;
            if (dataChannel != null) {
                dataChannel.pv0(BroadcastEnableSubOnlyLiveEvent.class);
            }
            C72818Shy.LIZ(new C76052yf(System.currentTimeMillis(), null, "switch_sub_only_live"));
            long currentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            Room room4 = this.LJLIL;
            if (room4 != null) {
                l = Long.valueOf(room4.getId());
            } else {
                l = null;
            }
            jSONObject.put("room_id", String.valueOf(l));
            if (room4 != null && (roomAuthStatus = room4.getRoomAuthStatus()) != null) {
                bool = Boolean.valueOf(roomAuthStatus.isEnableGift());
            }
            jSONObject.put("gift_permission", bool);
            jSONObject.put("live_sub_only", C29232Bdc.LJIILIIL(room4));
            C72818Shy.LIZ(new C76052yf(currentTimeMillis, new C78528Urs(jSONObject), "anchor_center_response_room_info"));
            if (!((IEffectService) CN1.LIZ(IEffectService.class)).isAccompanimentPlaying()) {
                Boolean isBGMPlaying = ((IEffectService) CN1.LIZ(IEffectService.class)).isBGMPlaying();
                o.LJIIIIZZ(isBGMPlaying, "getService(IEffectServic…:class.java).isBGMPlaying");
                if (!isBGMPlaying.booleanValue()) {
                    return;
                }
            }
            IEffectService iEffectService = (IEffectService) CN1.LIZ(IEffectService.class);
            Boolean bool2 = Boolean.FALSE;
            iEffectService.pauseAccompanimentPlay(bool2);
            ((IEffectService) CN1.LIZ(IEffectService.class)).pauseBGM(bool2);
            C30868C9o.LJI(C15380j0.LJIILJJIL(R.string.o9y));
            BZI LIZ = C28787BRn.LIZ("livesdk_anchor_ksong_conflict_toast_show");
            LIZ.LJIILLIIL(this.LJLJL);
            LIZ.LJJIIJZLJL();
            return;
        }
        C41071jL c41071jL2 = this.LJLILLLLZI;
        if (c41071jL2 != null) {
            c41071jL2.setChecked(false);
        }
        this.LJLJI.LJIIJJI(this.LJLILLLLZI, true, null);
        C30868C9o.LIZJ(R.string.mg2);
    }
}
