package tikcast.api.perception;

import X.InterfaceC65349Pkn;
import X.WM7;
import com.bytedance.android.livesdk.model.message.PerceptionDialogInfo;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class MultiViolationStatusResponse {

    @InterfaceC65349Pkn("data")
    public List<ViolationData> data = new ArrayList();

    @InterfaceC65349Pkn("extra")
    public ResponseExtra extra;

    /* loaded from: classes6.dex */
    public static final class ResponseExtra {

        @InterfaceC65349Pkn("now")
        public long now;
    }

    /* loaded from: classes6.dex */
    public static final class ViolationData {

        @InterfaceC65349Pkn("end_time")
        public long endTime;

        @InterfaceC65349Pkn("perception_dialog")
        public PerceptionDialogInfo perceptionDialog;

        @InterfaceC65349Pkn("punish_event")
        public PunishEventInfo punishEvent;

        @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
        public int scene;

        @InterfaceC65349Pkn("status")
        public int status;
    }
}
