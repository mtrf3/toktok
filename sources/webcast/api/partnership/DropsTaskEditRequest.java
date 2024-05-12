package webcast.api.partnership;

import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes17.dex */
public final class DropsTaskEditRequest {

    @InterfaceC65349Pkn("drops_id")
    public String dropsId = "";

    @InterfaceC65349Pkn("edit_datas")
    public List<EditData> editDatas = new ArrayList();

    @InterfaceC65349Pkn("room_id")
    public String roomId = "";

    /* loaded from: classes17.dex */
    public static final class EditData {

        @InterfaceC65349Pkn("comment_times")
        public int commentTimes;

        @InterfaceC65349Pkn("status")
        public int status;

        @InterfaceC65349Pkn("total_num")
        public long totalNum;

        @InterfaceC65349Pkn("type")
        public int type;

        @InterfaceC65349Pkn("view_duration")
        public int viewDuration;

        @InterfaceC65349Pkn("task_id")
        public String taskId = "";

        @InterfaceC65349Pkn("gift_id")
        public String giftId = "";

        @InterfaceC65349Pkn("comment_content")
        public String commentContent = "";
    }
}
