package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class LinkLayerRTCMessageP2PParam extends F9E {

    @InterfaceC65349Pkn("interact_id")
    public String linkMicId;

    /* JADX WARN: Multi-variable type inference failed */
    public LinkLayerRTCMessageP2PParam() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ LinkLayerRTCMessageP2PParam copy$default(LinkLayerRTCMessageP2PParam linkLayerRTCMessageP2PParam, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = linkLayerRTCMessageP2PParam.linkMicId;
        }
        return linkLayerRTCMessageP2PParam.copy(str);
    }

    public final LinkLayerRTCMessageP2PParam copy(String linkMicId) {
        o.LJIIIZ(linkMicId, "linkMicId");
        return new LinkLayerRTCMessageP2PParam(linkMicId);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.linkMicId};
    }

    public final String getLinkMicId() {
        return this.linkMicId;
    }

    public LinkLayerRTCMessageP2PParam(String linkMicId) {
        o.LJIIIZ(linkMicId, "linkMicId");
        this.linkMicId = linkMicId;
    }

    public final void setLinkMicId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.linkMicId = str;
    }

    public /* synthetic */ LinkLayerRTCMessageP2PParam(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
