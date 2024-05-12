package webcast.api.bag;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.GiftPanelBanner;
import java.util.List;
import webcast.data.BagItem;

/* loaded from: classes6.dex */
public final class BagItemListResponse {

    @InterfaceC65349Pkn("data")
    public Data data;

    @InterfaceC65349Pkn("extra")
    public Extra extra;

    /* loaded from: classes6.dex */
    public static final class Data {

        @InterfaceC65349Pkn("items")
        public List<BagItem> items;

        @InterfaceC65349Pkn("page_instruction")
        public GiftPanelBanner pageInstruction;

        @InterfaceC65349Pkn("show_entrance")
        public boolean showEntrance;
    }

    /* loaded from: classes9.dex */
    public static final class Extra {
    }
}
