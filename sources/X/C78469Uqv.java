package X;

import com.bytedance.android.livesdk.livesetting.watchlive.LiveGameMultiStreamWatch;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.LiveStreamUrlExtra;
import com.ss.android.ugc.aweme.follow.presenter.RoomStruct;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Uqv, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78469Uqv {
    public static final List<EnterRoomConfig> LIZ(List<? extends Aweme> list, InterfaceC78468Uqu interfaceC78468Uqu) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        for (Aweme aweme : list) {
            EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
            LIZJ(aweme, enterRoomConfig);
            if (interfaceC78468Uqu != null) {
                interfaceC78468Uqu.LIZIZ(aweme, enterRoomConfig);
                interfaceC78468Uqu.LIZ(aweme, enterRoomConfig);
                interfaceC78468Uqu.LIZJ(enterRoomConfig);
            }
            arrayList.add(enterRoomConfig);
        }
        return arrayList;
    }

    public static void LIZIZ(LiveRoomStruct liveRoomStruct, EnterRoomConfig enterRoomConfig) {
        boolean z;
        if (liveRoomStruct != null) {
            EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
            roomsData.roomId = liveRoomStruct.id;
            roomsData.userId = String.valueOf(liveRoomStruct.userId);
            enterRoomConfig.mRoomsData.hasCommerceGoods = Boolean.valueOf(liveRoomStruct.hasCommerceGoods);
            if (liveRoomStruct.multiStreamScene == 1) {
                z = true;
            } else {
                z = false;
            }
            LiveStreamUrlExtra.SrConfig srConfig = null;
            if (z && liveRoomStruct.getLiveStudioExtraStreamData() != null && liveRoomStruct.getLiveStudioExtraStreamDefaultQualitySdkKey() != null && LiveGameMultiStreamWatch.INSTANCE.isExperimentGroup()) {
                String liveStudioExtraStreamData = liveRoomStruct.getLiveStudioExtraStreamData();
                String liveStudioExtraStreamDefaultQualitySdkKey = liveRoomStruct.getLiveStudioExtraStreamDefaultQualitySdkKey();
                int ordinal = RoomStruct.getStreamType(liveRoomStruct).ordinal();
                LiveStreamUrlExtra liveStudioStreamUrlExtra = liveRoomStruct.getLiveStudioStreamUrlExtra();
                if (liveStudioStreamUrlExtra != null) {
                    srConfig = liveStudioStreamUrlExtra.getSrConfig();
                }
                C78857UxB.LJIILIIL(enterRoomConfig, liveStudioExtraStreamData, liveStudioExtraStreamDefaultQualitySdkKey, ordinal, srConfig, liveRoomStruct.getOptions());
                return;
            }
            String multiStreamData = liveRoomStruct.getMultiStreamData();
            String multiStreamDefaultQualitySdkKey = liveRoomStruct.getMultiStreamDefaultQualitySdkKey();
            int ordinal2 = RoomStruct.getStreamType(liveRoomStruct).ordinal();
            LiveStreamUrlExtra streamUrlExtra = liveRoomStruct.getStreamUrlExtra();
            if (streamUrlExtra != null) {
                srConfig = streamUrlExtra.getSrConfig();
            }
            C78857UxB.LJIILIIL(enterRoomConfig, multiStreamData, multiStreamDefaultQualitySdkKey, ordinal2, srConfig, liveRoomStruct.getOptions());
        }
    }

    public static void LIZJ(Aweme aweme, EnterRoomConfig enterRoomConfig) {
        o.LJIIIZ(enterRoomConfig, "enterRoomConfig");
        if (aweme != null) {
            LIZIZ(aweme.getNewLiveRoomData(), enterRoomConfig);
        }
    }

    public static EnterRoomConfig LIZLLL(long j, String str, String str2) {
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
        roomsData.roomId = j;
        EnterRoomConfig.TimeStamp timeStamp = roomsData.timeStamps;
        if (timeStamp != null) {
            timeStamp.enterRoomStarTimeReal = System.currentTimeMillis();
        }
        EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.mRoomsData;
        roomsData2.enterFromMerge = str;
        roomsData2.enterMethod = str2;
        roomsData2.enterRoomScene = "outside_with_feed";
        return enterRoomConfig;
    }
}
