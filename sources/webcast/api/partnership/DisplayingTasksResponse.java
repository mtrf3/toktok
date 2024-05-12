package webcast.api.partnership;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.game.model.BriefGameTask;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes17.dex */
public final class DisplayingTasksResponse {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    /* loaded from: classes17.dex */
    public static final class ResponseData {

        @InterfaceC65349Pkn("game_tasks")
        public List<BriefGameTask> gameTasks = new ArrayList();
    }
}
