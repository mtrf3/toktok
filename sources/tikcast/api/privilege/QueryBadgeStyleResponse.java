package tikcast.api.privilege;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes17.dex */
public final class QueryBadgeStyleResponse {

    @InterfaceC65349Pkn("data")
    public Data data;

    /* loaded from: classes17.dex */
    public static final class Data {

        @InterfaceC65349Pkn("badge")
        public List<BadgeStruct> badge = new ArrayList();
    }
}
