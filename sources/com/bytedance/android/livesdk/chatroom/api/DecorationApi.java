package com.bytedance.android.livesdk.chatroom.api;

import X.AbstractC73672Svk;
import X.C28467BFf;
import X.E8L;
import X.E8M;
import X.InterfaceC195727mC;
import X.InterfaceC195747mE;
import X.InterfaceC195757mF;
import X.InterfaceC36228EJs;
import X.InterfaceC36229EJt;
import X.InterfaceC64985Pev;
import com.bytedance.android.livesdk.chatroom.model.RoomDonationInfo;
import com.bytedance.android.livesdk.model.StickerCheckResponse;
import com.bytedance.android.livesdk.model.StickersSetResponse;
import com.bytedance.android.livesdkapi.depend.model.live.DonationTokenModel;
import java.util.Map;

/* loaded from: classes6.dex */
public interface DecorationApi {
    @E8M("/webcast/room/stickers/check/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<StickerCheckResponse>> checkEditable(@InterfaceC64985Pev("sticker_id_list") String str);

    @E8M
    AbstractC73672Svk<DonationTokenModel> createDonateSession(@InterfaceC195747mE String str, @InterfaceC195727mC SessionCreationReq sessionCreationReq);

    @E8M("/webcast/room/token_create/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<DonationTokenModel>> createDonateToken(@InterfaceC36229EJt Map<String, Object> map);

    @E8M("/webcast/room/stickers/del/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<Object>> deleteRoomStickers(@InterfaceC64985Pev("sticker_id") long j, @InterfaceC64985Pev("room_id") long j2);

    @E8L("/webcast/ranklist/donation/")
    AbstractC73672Svk<C28467BFf<RoomDonationInfo>> getRoomDonationInfo(@InterfaceC36228EJs Map<String, Object> map);

    @E8M("/webcast/room/decoration/set/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<Object>> setDecoration(@InterfaceC64985Pev("room_id") long j, @InterfaceC64985Pev("type") int i, @InterfaceC36229EJt Map<String, String> map);

    @E8M("/webcast/room/stickers/set/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<StickersSetResponse>> setRoomStickers(@InterfaceC36229EJt Map<String, Object> map);
}
