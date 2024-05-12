package X;

import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftUserConsumeLayerSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveRandomGiftCapsuleGovernanceSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.CapsuleBizParams;
import com.bytedance.android.livesdk.model.message.CapsuleBizParamsRandomGift;
import com.bytedance.android.livesdk.model.message.CapsuleMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.CBv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30927CBv implements InterfaceC29848BnY {
    @Override // X.InterfaceC29848BnY
    public final void LJ(C29846BnW capsuleModel) {
        o.LJIIIZ(capsuleModel, "capsuleModel");
    }

    public static int LJII() {
        Object obj;
        String valueOf = String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
        java.util.Map map = (java.util.Map) DataChannelGlobal.LJLJJI.mv0(C29824BnA.class);
        if (map == null || (obj = map.get("anchor_id")) == null) {
            obj = 0;
        }
        return o.LJ(valueOf, obj) ? 1 : 0;
    }

    @Override // X.InterfaceC29848BnY
    public final void LIZ(C29846BnW capsuleModel) {
        o.LJIIIZ(capsuleModel, "capsuleModel");
    }

    @Override // X.InterfaceC29848BnY
    public final boolean LIZJ(C29846BnW capsuleModel) {
        Long l;
        Long l2;
        CapsuleBizParamsRandomGift capsuleBizParamsRandomGift;
        CapsuleBizParamsRandomGift capsuleBizParamsRandomGift2;
        Gift gift;
        Room room;
        o.LJIIIZ(capsuleModel, "capsuleModel");
        DataChannel dataChannel = capsuleModel.LJLIIL().LJIIIIZZ;
        Long l3 = null;
        if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
            l = Long.valueOf(room.getOwnerUserId());
            l2 = Long.valueOf(room.getId());
        } else {
            l = null;
            l2 = null;
        }
        CapsuleBizParams capsuleBizParams = ((CapsuleMessage) capsuleModel.LJIJJLI).bizParams;
        if (capsuleBizParams != null && (capsuleBizParamsRandomGift2 = capsuleBizParams.randomGift) != null && (gift = capsuleBizParamsRandomGift2.gift) != null) {
            l3 = Long.valueOf(gift.id);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(((CapsuleMessage) capsuleModel.LJIJJLI).schema);
        LIZ.append("&gift_id=");
        LIZ.append(l3);
        LIZ.append("&anchor_id=");
        LIZ.append(l);
        LIZ.append("&room_id=");
        LIZ.append(l2);
        ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(C16880lQ.LLLLL(capsuleModel.LJLIIL().LIZ), UriProtector.parse(new C32364Cn2(X1D.LIZIZ(LIZ)).LIZLLL()));
        CapsuleBizParams capsuleBizParams2 = ((CapsuleMessage) capsuleModel.LJIJJLI).bizParams;
        if (capsuleBizParams2 != null && (capsuleBizParamsRandomGift = capsuleBizParams2.randomGift) != null) {
            long j = capsuleBizParamsRandomGift.round;
            BZI LIZ2 = C28787BRn.LIZ("travel_gift_massage_click");
            LIZ2.LJIIZILJ();
            LIZ2.LJIJJ(Long.valueOf(j), "round");
            LIZ2.LJIJJ(Integer.valueOf(LJII()), "is_anchor");
            LIZ2.LJJIIJZLJL();
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC29848BnY
    public final void LIZLLL(C29846BnW capsuleModel) {
        CapsuleBizParamsRandomGift capsuleBizParamsRandomGift;
        o.LJIIIZ(capsuleModel, "capsuleModel");
        CapsuleBizParams capsuleBizParams = ((CapsuleMessage) capsuleModel.LJIJJLI).bizParams;
        if (capsuleBizParams != null && (capsuleBizParamsRandomGift = capsuleBizParams.randomGift) != null) {
            long j = capsuleBizParamsRandomGift.round;
            BZI LIZ = C28787BRn.LIZ("travel_gift_massage_show");
            LIZ.LJIIZILJ();
            LIZ.LJIJJ(Long.valueOf(j), "round");
            LIZ.LJIJJ(Integer.valueOf(LJII()), "is_anchor");
            LIZ.LJJIIJZLJL();
        }
    }

    @Override // X.InterfaceC29848BnY
    public final void LIZIZ(C29846BnW capsuleModel, java.util.Map<String, String> map) {
        o.LJIIIZ(capsuleModel, "capsuleModel");
    }

    @Override // X.InterfaceC29848BnY
    public final boolean LJFF(CQQ publicScreenContext, CapsuleMessage message) {
        boolean z;
        CapsuleBizParamsRandomGift capsuleBizParamsRandomGift;
        Gift gift;
        CapsuleBizParams capsuleBizParams;
        CapsuleBizParamsRandomGift capsuleBizParamsRandomGift2;
        o.LJIIIZ(publicScreenContext, "publicScreenContext");
        o.LJIIIZ(message, "message");
        LiveRandomGiftCapsuleGovernanceSetting liveRandomGiftCapsuleGovernanceSetting = LiveRandomGiftCapsuleGovernanceSetting.INSTANCE;
        if (liveRandomGiftCapsuleGovernanceSetting.randomGiftCapsuleDefault() || ((LJII() == 0 && liveRandomGiftCapsuleGovernanceSetting.randomGiftCapsuleRollOff()) || publicScreenContext.LJIIZILJ)) {
            return true;
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        if (C29306Beo.LJIIJJI(dataChannelGlobal) && (capsuleBizParams = message.bizParams) != null && (capsuleBizParamsRandomGift2 = capsuleBizParams.randomGift) != null && capsuleBizParamsRandomGift2.filterHost) {
            return true;
        }
        if (C29306Beo.LJIIJJI(dataChannelGlobal)) {
            return false;
        }
        if (LiveGiftUserConsumeLayerSetting.INSTANCE.getValue() < 3) {
            z = true;
        } else {
            z = false;
        }
        CapsuleBizParams capsuleBizParams2 = message.bizParams;
        if (capsuleBizParams2 == null || (capsuleBizParamsRandomGift = capsuleBizParams2.randomGift) == null || (gift = capsuleBizParamsRandomGift.gift) == null) {
            return true;
        }
        Gift findGiftById = ((IGiftService) CN1.LIZ(IGiftService.class)).findGiftById(gift.id);
        if (findGiftById == null || !findGiftById.isDisplayedOnPanel) {
            return true;
        }
        return z;
    }

    @Override // X.InterfaceC29848BnY
    public final void LJI(C29846BnW capsuleModel, java.util.Map<String, String> map) {
        o.LJIIIZ(capsuleModel, "capsuleModel");
    }
}
