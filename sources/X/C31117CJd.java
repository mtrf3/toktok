package X;

import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.model.RoomAuthOffReasons;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.RoomLinkInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;

/* renamed from: X.CJd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31117CJd {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Room room, DataChannel dataChannel) {
        boolean z;
        RoomLinkInfo linkMicInfo;
        List<Long> list;
        EnumC31118CJe enumC31118CJe;
        RoomLinkInfo linkMicInfo2;
        List<Long> list2;
        RoomAuthStatus roomAuthStatus;
        RoomAuthOffReasons roomAuthOffReasons;
        RoomAuthStatus roomAuthStatus2;
        boolean z2 = true;
        int i = 0;
        if (room != null && (roomAuthStatus2 = room.getRoomAuthStatus()) != null && roomAuthStatus2.isEnableGift()) {
            z = true;
        } else {
            z = false;
        }
        Boolean bool = null;
        if (dataChannel != null) {
            bool = (Boolean) dataChannel.kv0(UserIsAnchorChannel.class);
        }
        boolean LJJIFFI = C29306Beo.LJJIFFI(bool);
        if (((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LIZ() <= 0) {
            z2 = false;
        }
        EnumC31154CKo LIZIZ = C31153CKn.LIZIZ(false, z2, z);
        String str = "anchor";
        if (LIZIZ == EnumC31154CKo.GREY) {
            IGiftService iGiftService = (IGiftService) CN1.LIZ(IGiftService.class);
            if (room == null || (roomAuthStatus = room.getRoomAuthStatus()) == null || (roomAuthOffReasons = roomAuthStatus.getRoomAuthOffReasons()) == null || (enumC31118CJe = roomAuthOffReasons.getUnAvailableClickReason()) == null) {
                enumC31118CJe = EnumC31118CJe.UNKNOWN;
            }
            if (!LJJIFFI) {
                str = "user";
            }
            if (room != null && (linkMicInfo2 = room.getLinkMicInfo()) != null && (list2 = linkMicInfo2.audienceIdList) != null) {
                i = list2.size();
            }
            iGiftService.monitorGiftIconShow(false, enumC31118CJe, str, "icon", i);
            return;
        }
        if (LIZIZ != EnumC31154CKo.SHOW) {
            return;
        }
        IGiftService iGiftService2 = (IGiftService) CN1.LIZ(IGiftService.class);
        EnumC31118CJe enumC31118CJe2 = EnumC31118CJe.UNKNOWN;
        if (!LJJIFFI) {
            str = "user";
        }
        if (room != null && (linkMicInfo = room.getLinkMicInfo()) != null && (list = linkMicInfo.audienceIdList) != null) {
            i = list.size();
        }
        iGiftService2.monitorGiftIconShow(true, enumC31118CJe2, str, "icon", i);
    }
}
