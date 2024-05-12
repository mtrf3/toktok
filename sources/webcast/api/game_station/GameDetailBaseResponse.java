package webcast.api.game_station;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.game.model.GameStationAttributionInfo;
import com.bytedance.android.livesdk.game.model.GameStationGameInfo;
import com.bytedance.android.livesdk.game.model.GameStationOuterActivityInfo;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes17.dex */
public final class GameDetailBaseResponse {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    /* loaded from: classes17.dex */
    public static final class ResponseData {

        @InterfaceC65349Pkn("activity_groups")
        public List<GameStationOuterActivityInfo> activityGroups = new ArrayList();

        @InterfaceC65349Pkn("attribution_info")
        public GameStationAttributionInfo attributionInfo;

        @InterfaceC65349Pkn("game_info")
        public GameStationGameInfo gameInfo;
    }
}
