package X;

import com.bytedance.android.livesdk.livesetting.watchlive.LiveGameMultiStreamWatch;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreloadInteractionLayerSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import java.util.ArrayList;

/* renamed from: X.B6k, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28238B6k {
    public static ArrayList<String> LJFF(Room room) {
        if (room.getCover() != null && !C32151Nz.LJJIIJZLJL(room.getCover().getUrls())) {
            return new ArrayList<>(room.getCover().getUrls());
        }
        if (room.getOwner() != null && room.getOwner().getAvatarThumb() != null && !C32151Nz.LJJIIJZLJL(room.getOwner().getAvatarThumb().getUrls())) {
            return new ArrayList<>(room.getOwner().getAvatarThumb().getUrls());
        }
        return null;
    }

    public static void LIZ(Room room, EnterRoomConfig enterRoomConfig) {
        if (room != null && room.getOwner() != null && room.getOwner().getFollowInfo() != null) {
            enterRoomConfig.mRoomsData.followStatus = String.valueOf(room.getOwner().getFollowInfo().getFollowStatus());
        }
    }

    public static void LIZIZ(Room room, EnterRoomConfig enterRoomConfig) {
        if (room == null || room.getRoomAuthStatus() == null || room.getOwner() == null || !LivePreloadInteractionLayerSetting.INSTANCE.isEnableFeedRoomParse()) {
            return;
        }
        enterRoomConfig.mRoomsData.commerceStruct = room.getCommerceStruct();
        enterRoomConfig.mRoomsData.preLoadRoomInfo = GsonProtectorUtils.toJson(C09650Zl.LIZIZ, room);
    }

    public static EnterRoomConfig LIZJ(boolean z, Room room) {
        ArrayList<String> arrayList;
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        if (room != null) {
            enterRoomConfig.mRoomsData.roomId = room.getId();
            enterRoomConfig.mRoomsData.streamType = room.getStreamType();
            enterRoomConfig.mRoomsData.bgUrls = LJFF(room);
            enterRoomConfig.mLogData.requestId = room.getRequestId();
            enterRoomConfig.mLogData.logPb = room.getLog_pb();
            enterRoomConfig.mRoomsData.sourceType = room.getSourceType();
            EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
            if (room.blurredCover == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList<>(room.blurredCover.getUrls());
            }
            roomsData.gaussianBgUrls = arrayList;
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
            if (dataChannelGlobal.mv0(C29044Baa.class) != null) {
                Room room2 = (Room) dataChannelGlobal.mv0(C29044Baa.class);
                enterRoomConfig.mLogData.userFrom = room2.getUserFrom();
            }
            enterRoomConfig.mRoomsData.roomLabels = room.getLabels();
            LJ(room, enterRoomConfig);
            enterRoomConfig.mLogData.anchorId = String.valueOf(room.getOwnerUserId());
            if (z) {
                LIZIZ(room, enterRoomConfig);
                enterRoomConfig.mRoomsData.commerceStruct = room.getCommerceStruct();
            }
            LIZ(room, enterRoomConfig);
            enterRoomConfig.mRoomsData.hasCommerceGoods = Boolean.valueOf(room.hasCommerceGoods);
        }
        return enterRoomConfig;
    }

    public static void LIZLLL(Room room, EnterRoomConfig enterRoomConfig) {
        ArrayList<String> arrayList;
        if (room != null) {
            enterRoomConfig.mRoomsData.roomId = room.getId();
            enterRoomConfig.mRoomsData.streamType = room.getStreamType();
            enterRoomConfig.mRoomsData.bgUrls = LJFF(room);
            EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
            if (room.blurredCover == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList<>(room.blurredCover.getUrls());
            }
            roomsData.gaussianBgUrls = arrayList;
            enterRoomConfig.mLogData.requestId = room.getRequestId();
            enterRoomConfig.mLogData.logPb = room.getLog_pb();
            enterRoomConfig.mRoomsData.sourceType = room.getSourceType();
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
            if (dataChannelGlobal.mv0(C29044Baa.class) != null) {
                Room room2 = (Room) dataChannelGlobal.mv0(C29044Baa.class);
                enterRoomConfig.mLogData.userFrom = room2.getUserFrom();
            }
            enterRoomConfig.mRoomsData.roomLabels = room.getLabels();
            LJ(room, enterRoomConfig);
            enterRoomConfig.mLogData.anchorId = String.valueOf(room.getOwnerUserId());
            LIZ(room, enterRoomConfig);
        }
    }

    public static void LJ(Room room, EnterRoomConfig enterRoomConfig) {
        if (room.multiStreamScene == 1 && room.getExtraStreamData() != null && room.getExtraStreamDefaultQualitySdkKey() != null && LiveGameMultiStreamWatch.INSTANCE.isExperimentGroup()) {
            C78847Ux1.LJIILLIIL(room, enterRoomConfig);
        } else {
            C78847Ux1.LJIILL(room, enterRoomConfig);
        }
    }
}
