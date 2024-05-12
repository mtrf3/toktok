package webcast.api.goody_bag;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.goody_bag.model.GoodyBagCommonSelected;

/* loaded from: classes17.dex */
public final class SendGoodyBagRequest {

    @InterfaceC65349Pkn("biz")
    public int biz;

    @InterfaceC65349Pkn("coin_param")
    public CoinGoodyBagParam coinParam;

    @InterfaceC65349Pkn("common_param")
    public GoodyBagCommonSelected commonParam;

    @InterfaceC65349Pkn("room_id")
    public String roomId = "";

    /* loaded from: classes17.dex */
    public static final class CoinGoodyBagParam {

        @InterfaceC65349Pkn("selected_total_coins")
        public int selectedTotalCoins;
    }
}
