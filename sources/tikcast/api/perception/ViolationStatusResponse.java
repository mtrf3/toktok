package tikcast.api.perception;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.message.PerceptionDialogInfo;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;

/* loaded from: classes6.dex */
public final class ViolationStatusResponse {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    @InterfaceC65349Pkn("extra")
    public ResponseExtra extra;

    /* loaded from: classes6.dex */
    public static final class ResponseData {

        @InterfaceC65349Pkn("perception_dialog")
        public PerceptionDialogInfo perceptionDialog;

        @InterfaceC65349Pkn("punish_event")
        public PunishEventInfo punishEvent;

        @InterfaceC65349Pkn("status")
        public int status;
    }

    /* loaded from: classes6.dex */
    public static final class ResponseExtra {

        @InterfaceC65349Pkn("now")
        public long now;
    }
}
