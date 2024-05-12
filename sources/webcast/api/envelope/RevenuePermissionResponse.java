package webcast.api.envelope;

import X.InterfaceC65349Pkn;
import java.util.Map;

/* loaded from: classes6.dex */
public final class RevenuePermissionResponse {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    /* loaded from: classes6.dex */
    public static final class ResponseData {

        @InterfaceC65349Pkn("envelope_permission")
        public Map<Long, Boolean> envelopePermission;

        @InterfaceC65349Pkn("goody_bag_permission")
        public Map<Long, Boolean> goodyBagPermission;
    }
}
