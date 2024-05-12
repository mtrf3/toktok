package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserApplyPermission;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserApplySettings;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserSettings;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes14.dex */
public final class TYJ {
    public static final ConcurrentHashMap<Long, Integer> LIZ = new ConcurrentHashMap<>();

    public static String LIZ(MultiGuestDataHolder multiGuestDataHolder) {
        if (LIZJ(multiGuestDataHolder) <= 0) {
            return CardStruct.IStatusCode.DEFAULT;
        }
        return "1";
    }

    public static long LIZJ(MultiGuestDataHolder multiGuestDataHolder) {
        MultiLiveUserSettings multiLiveUserSettings;
        MultiLiveUserApplySettings multiLiveUserApplySettings;
        MultiLiveUserApplyPermission multiLiveUserApplyPermission;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings;
        if (multiGuestDataHolder != null && (multiLiveAnchorPanelSettings = multiGuestDataHolder.LJIIJ) != null) {
            return multiLiveAnchorPanelSettings.applierSortGiftScoreThreshold;
        }
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null && (multiLiveUserSettings = room.multiLiveUserSettings) != null && (multiLiveUserApplySettings = multiLiveUserSettings.multiLiveUserApplySettings) != null && (multiLiveUserApplyPermission = multiLiveUserApplySettings.multiLiveUserApplyPermission) != null) {
            return multiLiveUserApplyPermission.applierSortGiftScoreThreshold;
        }
        return 0L;
    }

    public static String LIZIZ(MultiGuestDataHolder multiGuestDataHolder, long j) {
        long LIZJ = LIZJ(multiGuestDataHolder);
        if (LIZJ > 0) {
            if (LIZJ > j) {
                return "under_threshold";
            }
            if (1 <= LIZJ && LIZJ <= j) {
                return "meet_threshold";
            }
        }
        return "close_mode";
    }
}
