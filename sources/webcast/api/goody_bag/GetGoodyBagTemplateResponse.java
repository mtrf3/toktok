package webcast.api.goody_bag;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.goody_bag.model.GoodyBagCommonSelected;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes17.dex */
public final class GetGoodyBagTemplateResponse {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    /* loaded from: classes16.dex */
    public static final class CoinTemplate {

        @InterfaceC65349Pkn("total_coin")
        public int totalCoin;

        @InterfaceC65349Pkn("total_coin_options")
        public List<Integer> totalCoinOptions = new ArrayList();
    }

    /* loaded from: classes17.dex */
    public static final class CommonTemplate {

        @InterfaceC65349Pkn("common_selected")
        public GoodyBagCommonSelected commonSelected;

        @InterfaceC65349Pkn("winner_headcount_options")
        public List<Integer> winnerHeadcountOptions = new ArrayList();

        @InterfaceC65349Pkn("participate_method_options")
        public List<Integer> participateMethodOptions = new ArrayList();

        @InterfaceC65349Pkn("countdown_minute_options")
        public List<Integer> countdownMinuteOptions = new ArrayList();
    }

    /* loaded from: classes17.dex */
    public static final class PreCheckResult {

        @InterfaceC65349Pkn("i18n_prompts")
        public String i18nPrompts = "";

        @InterfaceC65349Pkn("status_code")
        public int statusCode;
    }

    /* loaded from: classes17.dex */
    public static final class ResponseData {

        @InterfaceC65349Pkn("coin_template")
        public CoinTemplate coinTemplate;

        @InterfaceC65349Pkn("common_template")
        public CommonTemplate commonTemplate;

        @InterfaceC65349Pkn("result")
        public PreCheckResult result;
    }
}
