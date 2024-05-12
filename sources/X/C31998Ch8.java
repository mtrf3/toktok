package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.watchlive.InboxSameFlowSetting;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.inbox.response.InboxLiveNotice;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Ch8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31998Ch8 {
    public static ArrayList<Long> LIZ = new ArrayList<>();
    public static String LIZIZ = "";

    public static void LIZ(Context context, InboxLiveNotice inboxLiveNotice, int i, String anchorId) {
        User user;
        String str;
        String str2;
        String str3;
        int i2;
        String str4;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(anchorId, "anchorId");
        if (inboxLiveNotice != null && (user = inboxLiveNotice.getUser()) != null) {
            long j = user.roomId;
            User user2 = inboxLiveNotice.getUser();
            if (user2 != null) {
                str = user2.roomData;
            } else {
                str = null;
            }
            EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
            enterRoomConfig.mLogData.anchorId = anchorId;
            EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
            User user3 = inboxLiveNotice.getUser();
            if (user3 == null || (str2 = user3.getUid()) == null) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            roomsData.userId = str2;
            EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.mRoomsData;
            roomsData2.enterType = "click";
            roomsData2.roomId = j;
            roomsData2.enterFromMerge = "message";
            roomsData2.enterMethod = "live_cover";
            EnterRoomConfig.LogData logData = enterRoomConfig.mLogData;
            logData.anchorType = "click";
            logData.positionOutsideLiveRoom = i;
            User user4 = inboxLiveNotice.getUser();
            if (user4 == null || (str3 = user4.getRequestId()) == null) {
                str3 = "";
            }
            logData.requestId = str3;
            EnterRoomConfig.RoomsData roomsData3 = enterRoomConfig.mRoomsData;
            roomsData3.windowMode = "full_screen";
            roomsData3.isFresh = inboxLiveNotice.isFresh();
            User user5 = inboxLiveNotice.getUser();
            if (user5 != null) {
                i2 = user5.getFollowStatus();
            } else {
                i2 = 0;
            }
            EnterRoomConfig.RoomsData roomsData4 = enterRoomConfig.mRoomsData;
            if (i2 >= 0 && i2 < 3) {
                str4 = String.valueOf(i2);
            } else {
                str4 = "3";
            }
            roomsData4.followStatus = str4;
            if (C30746C4w.LIZ()) {
                C30746C4w.LIZJ(inboxLiveNotice.getRoomInfo(), enterRoomConfig);
            }
            if (InboxSameFlowSetting.INSTANCE.getEnable()) {
                enterRoomConfig.mRoomsData.forceUseMultiListProvider = true;
                if (!C79004UzY.LJJIFFI(LIZ)) {
                    long[] jArr = new long[LIZ.size()];
                    int size = LIZ.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        Object obj = ListProtector.get(LIZ, i3);
                        o.LJIIIIZZ(obj, "roomIdList[i]");
                        jArr[i3] = ((Number) obj).longValue();
                    }
                    enterRoomConfig.mRoomsData.roomIds = jArr;
                }
                if (!TextUtils.isEmpty(LIZIZ)) {
                    enterRoomConfig.mRoomsData.roomInfoList = LIZIZ;
                }
                LiveOuterService.LJJJLL().LJIILL().LJIILL(context, enterRoomConfig, str);
                return;
            }
            LiveOuterService.LJJJLL().LJIILL().LJIILL(context, enterRoomConfig, str);
        }
    }
}
