package webcast.api.game;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.game.model.FeedItemInfo;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes17.dex */
public final class GetGameVideoListResponse {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    @InterfaceC65349Pkn("extra")
    public FeedExtra extra;

    /* loaded from: classes17.dex */
    public static final class ResponseData {

        @InterfaceC65349Pkn("items")
        public List<FeedItemInfo> items = new ArrayList();
    }
}
