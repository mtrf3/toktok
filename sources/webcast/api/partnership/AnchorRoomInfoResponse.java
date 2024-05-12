package webcast.api.partnership;

import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class AnchorRoomInfoResponse {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    /* loaded from: classes6.dex */
    public static final class DropsInfo {

        @InterfaceC65349Pkn("has_sign")
        public boolean hasSign;

        @InterfaceC65349Pkn("show_drops")
        public boolean showDrops;

        @InterfaceC65349Pkn("drops_id_list")
        public List<Long> dropsIdList = new ArrayList();

        @InterfaceC65349Pkn("promoting_drops_id")
        public String promotingDropsId = "";

        @InterfaceC65349Pkn("promoting_drops_name")
        public String promotingDropsName = "";
    }

    /* loaded from: classes6.dex */
    public static final class PartnershipInfo {

        @InterfaceC65349Pkn("has_sign")
        public boolean hasSign;

        @InterfaceC65349Pkn("show_partnership")
        public boolean showPartnership;
    }

    /* loaded from: classes6.dex */
    public static final class ResponseData {

        @InterfaceC65349Pkn("drops_info")
        public DropsInfo dropsInfo;

        @InterfaceC65349Pkn("live_take_decouple")
        public boolean liveTakeDecouple;

        @InterfaceC65349Pkn("partnership_info")
        public PartnershipInfo partnershipInfo;
    }
}
