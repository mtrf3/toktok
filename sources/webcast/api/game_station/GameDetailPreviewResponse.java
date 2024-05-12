package webcast.api.game_station;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.game.model.GameStationGameInfo;
import com.bytedance.android.livesdk.game.model.GameStationOuterActivityInfo;
import com.bytedance.android.livesdk.game.model.ItemInfo;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes17.dex */
public final class GameDetailPreviewResponse {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    /* loaded from: classes17.dex */
    public static final class ResponseData {

        @InterfaceC65349Pkn("game_info")
        public GameStationGameInfo gameInfo;

        @InterfaceC65349Pkn("activity_groups")
        public List<GameStationOuterActivityInfo> activityGroups = new ArrayList();

        @InterfaceC65349Pkn("related_videos")
        public List<ItemInfo> relatedVideos = new ArrayList();
    }
}
