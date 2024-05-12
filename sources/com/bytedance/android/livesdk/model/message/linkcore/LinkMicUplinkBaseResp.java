package com.bytedance.android.livesdk.model.message.linkcore;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public class LinkMicUplinkBaseResp {

    @InterfaceC65349Pkn("common_resp")
    public LinkMicCommonResp commonResp;

    /* JADX WARN: Multi-variable type inference failed */
    public LinkMicUplinkBaseResp() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public LinkMicUplinkBaseResp(LinkMicCommonResp linkMicCommonResp) {
        this.commonResp = linkMicCommonResp;
    }

    public /* synthetic */ LinkMicUplinkBaseResp(LinkMicCommonResp linkMicCommonResp, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : linkMicCommonResp);
    }
}
