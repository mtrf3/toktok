package X;

import android.view.ViewGroup;
import com.bytedance.android.livesdk.broadcast.video.VideoWidget;
import com.bytedance.android.livesdk.dataChannel.BeforeStickerSelectedEvent;
import com.bytedance.android.livesdk.dataChannel.StickerCancelChannel;
import com.bytedance.android.livesdk.dataChannel.StickerSelectedEvent;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.HashMap;

/* renamed from: X.BxU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C30464BxU implements InterfaceC30494Bxy {
    public String LIZ = "";
    public final /* synthetic */ VideoWidget LIZIZ;

    @Override // X.InterfaceC30494Bxy
    public final void onDestroy() {
        this.LIZIZ.liveEffectPalletHandler.onDestroy();
    }

    public C30464BxU(VideoWidget videoWidget) {
        this.LIZIZ = videoWidget;
    }

    @Override // X.InterfaceC30494Bxy
    public final void LIZ(String str) {
        this.LIZIZ.liveEffectPalletHandler.LIZ(str);
    }

    @Override // X.InterfaceC30494Bxy
    public final void LIZIZ(LiveEffect liveEffect) {
        this.LIZIZ.reportStickerChange(liveEffect);
        if (this.LIZIZ.liveEffectPalletHandler.LJFF(liveEffect)) {
            this.LIZIZ.liveEffectPalletHandler.LIZIZ(liveEffect);
        } else {
            this.LIZIZ.liveEffectPalletHandler.LIZLLL();
            if (!LiveEffect.equals(this.LIZIZ.mSelectedSticker, liveEffect)) {
                C19680pw c19680pw = new C19680pw(liveEffect, C0TY.LIZIZ, this.LIZ, false);
                DataChannel dataChannel = this.LIZIZ.dataChannel;
                if (dataChannel != null) {
                    dataChannel.qv0(StickerSelectedEvent.class, c19680pw);
                }
            }
        }
        this.LIZIZ.mSelectedSticker = liveEffect;
        C29702BlC LIZ = C18230nb.LIZ("ttlive_change_sticker");
        LIZ.LJ("broadcast");
        LIZ.LIZIZ(Long.valueOf(liveEffect.effectId), "select_sticker_id");
        LIZ.LIZLLL("select_sticker_name", liveEffect.getName());
        LIZ.LJIIIZ();
        HashMap hashMap = new HashMap();
        hashMap.put("id", String.valueOf(liveEffect.effectId));
        hashMap.put("name", liveEffect.getName());
        B4U.LIZ().LJJIFFI("sticker", hashMap);
        C04510Fr.LIZ.put("sticker_id", String.valueOf(liveEffect.effectId));
        C31014CFe.LJFF(String.valueOf(liveEffect.effectId));
        C31014CFe.LJI(liveEffect.getResourceId());
        C29702BlC LIZ2 = C18230nb.LIZ("ttlive_broadcast_action_all");
        LIZ2.LJII("action", "change_sticker");
        LIZ2.LJI(Long.valueOf(liveEffect.effectId), "action_id");
        LIZ2.LJI(Long.valueOf(this.LIZIZ.getUserId()), "user_id");
        LIZ2.LJI(Long.valueOf(this.LIZIZ.getRoomId()), "room_id");
        LIZ2.LJIIIZ();
    }

    @Override // X.InterfaceC30494Bxy
    public final void LIZJ(String str) {
        this.LIZIZ.liveEffectPalletHandler.LJ(null, str);
    }

    @Override // X.InterfaceC30494Bxy
    public final void LIZLLL(LiveEffect liveEffect) {
        C19680pw c19680pw = new C19680pw(liveEffect, C0TY.LIZIZ, this.LIZ, false);
        DataChannel dataChannel = this.LIZIZ.dataChannel;
        if (dataChannel != null) {
            dataChannel.qv0(BeforeStickerSelectedEvent.class, c19680pw);
        }
    }

    @Override // X.InterfaceC30494Bxy
    public final void LJ(ViewGroup viewGroup) {
        this.LIZIZ.liveEffectPalletHandler.LJI(viewGroup, false);
    }

    @Override // X.InterfaceC30494Bxy
    public final void LJFF(LiveEffect liveEffect) {
        this.LIZIZ.reportStickerChange(null);
        C30355Bvj.LIZJ().LIZLLL(C0TY.LIZIZ);
        VideoWidget videoWidget = this.LIZIZ;
        videoWidget.mSelectedSticker = null;
        if (videoWidget.liveEffectPalletHandler.LJFF(liveEffect)) {
            this.LIZIZ.liveEffectPalletHandler.LIZLLL();
        }
        B4U.LIZ().LJJII("sticker");
        C04510Fr.LIZ.remove("sticker_id");
        C31014CFe.LJFF("");
        C31014CFe.LJI("");
        this.LIZIZ.dataChannel.qv0(StickerCancelChannel.class, liveEffect);
    }

    @Override // X.InterfaceC30494Bxy
    public final int LJI(String str, String str2) {
        long j;
        InterfaceC21020s6 interfaceC21020s6 = this.LIZIZ.mLiveStream;
        if (interfaceC21020s6 != null && interfaceC21020s6.getVideoFilterMgr() != null) {
            int customEffect = this.LIZIZ.mLiveStream.getVideoFilterMgr().setCustomEffect(str, str2);
            Room room = this.LIZIZ.mRoom;
            if (room != null) {
                j = room.getId();
            } else {
                j = 0;
            }
            C30495Bxz.LIZ.LIZ(new C30517ByL(j, ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId(), str2));
            return customEffect;
        }
        return -1;
    }

    @Override // X.InterfaceC30494Bxy
    public final void LJII(String str, String str2) {
        int i;
        this.LIZ = str;
        Boolean bool = (Boolean) this.LIZIZ.dataChannel.kv0(C55032Dz.class);
        BZI LIZ = C28787BRn.LIZ("livesdk_pm_live_sticker_tab_change");
        LIZ.LJIILLIIL(this.LIZIZ.dataChannel);
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        LIZ.LJIJJ(dataChannelGlobal.mv0(C55012Dx.class), "enter_from");
        LIZ.LJIJJ(dataChannelGlobal.mv0(C2E4.class), "banner_id");
        LIZ.LJIJJ(dataChannelGlobal.mv0(C2E5.class), "banner_from");
        LIZ.LJIJJ(str2, "tab");
        if (bool != null && bool.booleanValue()) {
            i = 1;
        } else {
            i = 0;
        }
        UFE.LIZIZ(i, LIZ, "is_new_anchor_guide");
    }
}
