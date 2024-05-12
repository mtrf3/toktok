package com.bytedance.android.livesdk.impl.revenue.portal.model;

import X.C31012CFc;
import X.InterfaceC28808BSi;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.EnvelopePortalMessage;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class EnvelopPortal4FEModelSender implements InterfaceC28808BSi {

    @InterfaceC65349Pkn("portal_infos")
    public List<EnvelopePortalMessage.PortalInfo> portalInfos = new ArrayList();

    @InterfaceC65349Pkn("time_diff")
    public long timeDiff = C31012CFc.LIZIZ;

    @InterfaceC65349Pkn("entrance")
    public String entrance = "";
}
