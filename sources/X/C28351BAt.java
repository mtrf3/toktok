package X;

import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.rank.OnlineAudienceGiftGuideSetting;
import com.bytedance.android.livesdk.rank.impl.view.AudienceListGiftGuideDialog;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.BAt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28351BAt extends AbstractViewOnClickListenerC28292B8m {
    public final /* synthetic */ AudienceListGiftGuideDialog LJLJJL;

    @Override // X.AbstractViewOnClickListenerC28292B8m
    public final void LIZ() {
        long j;
        String str;
        Room room;
        LiveMode streamType;
        Room room2;
        Room room3;
        AudienceListGiftGuideDialog audienceListGiftGuideDialog = this.LJLJJL;
        audienceListGiftGuideDialog.getClass();
        ((IGiftService) CN1.LIZ(IGiftService.class)).sendGiftInternal(audienceListGiftGuideDialog.getContext(), new C15940ju(OnlineAudienceGiftGuideSetting.INSTANCE.getValue().giftId, 1, new C40627Fx1(), 0, "top2_empty_slot_page", true, 0, 0));
        this.LJLJJL.dismiss();
        AudienceListGiftGuideDialog audienceListGiftGuideDialog2 = this.LJLJJL;
        DataChannel dataChannel = audienceListGiftGuideDialog2.dataChannel;
        int i = audienceListGiftGuideDialog2.LJLJJLL;
        BZI LIZ = C28787BRn.LIZ("livesdk_top2_empty_slot_page_send_click");
        LIZ.LJIJJ(BJM.LJFF(), "enter_from_merge");
        LIZ.LJIJJ(BJM.LJIIIIZZ(), "enter_method");
        long j2 = 0;
        if (dataChannel != null && (room3 = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
            j = room3.getOwnerUserId();
        } else {
            j = 0;
        }
        LIZ.LJIJJ(Long.valueOf(j), "anchor_id");
        if (dataChannel != null && (room2 = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
            j2 = room2.getId();
        }
        LIZ.LJIJJ(Long.valueOf(j2), "room_id");
        if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null && (streamType = room.getStreamType()) != null) {
            str = C28509BGv.LIZ(streamType);
        } else {
            str = "";
        }
        LIZ.LJIJJ(str, "live_type");
        LIZ.LJIJJ(BJM.LIZLLL(), "action_type");
        if (C29306Beo.LJIIJ(dataChannel)) {
            LIZ.LJIJJ("null", "user_rank");
        } else {
            LIZ.LJIJJ(Long.valueOf(UCH.LJ()), "user_rank");
        }
        LIZ.LJIJJ(Integer.valueOf(i + 1), "slot_rank");
        LIZ.LJJIIJZLJL();
    }

    public C28351BAt(AudienceListGiftGuideDialog audienceListGiftGuideDialog) {
        this.LJLJJL = audienceListGiftGuideDialog;
    }
}
