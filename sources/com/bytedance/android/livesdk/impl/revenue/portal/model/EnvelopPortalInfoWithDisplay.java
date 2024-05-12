package com.bytedance.android.livesdk.impl.revenue.portal.model;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.EnvelopePortalMessage;

/* loaded from: classes6.dex */
public final class EnvelopPortalInfoWithDisplay {

    @InterfaceC65349Pkn("anchor_avatar")
    public ImageModel anchorAvatar;

    @InterfaceC65349Pkn("anchor_display_id")
    public String anchorDisplayId;

    @InterfaceC65349Pkn("anchor_id")
    public String anchorId;

    @InterfaceC65349Pkn("room_id")
    public String roomId;

    @InterfaceC65349Pkn("portal_info")
    public EnvelopePortalMessage.PortalInfo portalInfo = new EnvelopePortalMessage.PortalInfo();

    @InterfaceC65349Pkn("display")
    public int display = 1;
}
