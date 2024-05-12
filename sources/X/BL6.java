package X;

import com.bytedance.android.livesdk.livesetting.feed.GameLiveBottomBarSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveGameBottomBarEntrance;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;

/* loaded from: classes6.dex */
public final class BL6 {
    public static final String[] LIZ = LiveGameBottomBarEntrance.INSTANCE.getValue();
    public static final java.util.Set<String> LIZIZ = C77275UUl.LJ("related_live_refresh", "related_live_loadmore");

    public static final boolean LIZ(EnterRoomConfig enterRoomConfig) {
        if (!GameLiveBottomBarSetting.INSTANCE.isEnable() || enterRoomConfig == null) {
            return false;
        }
        String[] strArr = LIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(enterRoomConfig.mRoomsData.enterFromMerge);
        LIZ2.append('_');
        LIZ2.append(enterRoomConfig.mRoomsData.enterMethod);
        return ORY.LJJIJIIJIL(X1D.LIZIZ(LIZ2), strArr);
    }

    public static final boolean LIZIZ(String str) {
        if (!GameLiveBottomBarSetting.INSTANCE.isEnable() || str == null) {
            return false;
        }
        return ORY.LJJIJIIJIL(str, LIZ);
    }
}
