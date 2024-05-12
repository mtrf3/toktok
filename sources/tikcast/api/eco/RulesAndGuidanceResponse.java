package tikcast.api.eco;

import X.InterfaceC65349Pkn;

/* loaded from: classes17.dex */
public final class RulesAndGuidanceResponse {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    @InterfaceC65349Pkn("extra")
    public ResponseExtra extra;

    /* loaded from: classes17.dex */
    public static final class ResponseData {

        @InterfaceC65349Pkn("banner_area")
        public RulesAndGuidanceBannerArea bannerArea;

        @InterfaceC65349Pkn("check_bubble")
        public CheckBubble checkBubble;

        @InterfaceC65349Pkn("config")
        public RulesAndGuidanceConfig config;

        @InterfaceC65349Pkn("content_area")
        public RulesAndGuidanceContentArea contentArea;

        @InterfaceC65349Pkn("function_area")
        public RulesAndGuidanceFunctionArea functionArea;
    }

    /* loaded from: classes17.dex */
    public static final class ResponseExtra {

        @InterfaceC65349Pkn("now")
        public long now;
    }
}
