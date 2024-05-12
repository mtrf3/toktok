package webcast.api.sub;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.subscribe.model.SubOnlyLiveInfo;
import com.bytedance.android.livesdk.subscribe.model.SubscribingInfo;

/* loaded from: classes6.dex */
public final class GetUserSubInfoResponse {

    @InterfaceC65349Pkn("data")
    public Data data;

    /* loaded from: classes6.dex */
    public static final class Data {

        @InterfaceC65349Pkn("scenario_text")
        public String scenarioText = "";

        @InterfaceC65349Pkn("sub_only_live_info")
        public SubOnlyLiveInfo subOnlyLiveInfo;

        @InterfaceC65349Pkn("sub_scenario")
        public int subScenario;

        @InterfaceC65349Pkn("subscribing")
        public SubscribingInfo subscribing;

        @InterfaceC65349Pkn("user_buy_gift_sub_auth")
        public boolean userBuyGiftSubAuth;
    }
}
