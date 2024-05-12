package com.bytedance.android.livesdk.envelope.model;

import X.C31012CFc;
import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class RedEnvelopeInfoModel4FE {

    @InterfaceC65349Pkn("list_response_timestamp")
    public long listResponseTimestamp;

    @InterfaceC65349Pkn("request_list_timestamp")
    public long requestListTimestamp;

    @InterfaceC65349Pkn("request_permission_timestamp")
    public long requestPermissionTimestamp;

    @InterfaceC65349Pkn("data_from")
    public String dataFrom = "";

    @InterfaceC65349Pkn("envelope_infos")
    public List<RedEnvelopeMessage4FE> envelopList = new ArrayList();

    @InterfaceC65349Pkn("time_diff")
    public long timeDiff = C31012CFc.LIZIZ;
}
