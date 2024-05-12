package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;
import tikcast.linkmic.common.LinkMicAdContent;

/* loaded from: classes14.dex */
public final class LinkMicAdMessage extends CR6 {

    @InterfaceC65349Pkn("link_ad_contents")
    public List<LinkMicAdContent> linkAdContents;

    @InterfaceC65349Pkn("message_type")
    public int messageType;

    public LinkMicAdMessage() {
        this.type = EnumC31509CYf.LINK_MIC_AD_MESSAGE;
        this.linkAdContents = new ArrayList();
    }
}
