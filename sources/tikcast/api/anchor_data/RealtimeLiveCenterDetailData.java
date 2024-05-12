package tikcast.api.anchor_data;

import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;
import webcast.data.RealtimeLiveCenterBaseData;
import webcast.data.RealtimeLiveCenterShopData;
import webcast.data.RealtimeLiveCenterTips;
import webcast.data.RealtimeViolationRecord;

/* loaded from: classes14.dex */
public final class RealtimeLiveCenterDetailData {

    @InterfaceC65349Pkn("base_info")
    public RealtimeLiveCenterBaseData baseInfo;

    @InterfaceC65349Pkn("shop_info")
    public RealtimeLiveCenterShopData shopInfo;

    @InterfaceC65349Pkn("tips_info")
    public RealtimeLiveCenterTips tipsInfo;

    @InterfaceC65349Pkn("room_id")
    public String roomId = "";

    @InterfaceC65349Pkn("violation_records")
    public List<RealtimeViolationRecord> violationRecords = new ArrayList();
}
