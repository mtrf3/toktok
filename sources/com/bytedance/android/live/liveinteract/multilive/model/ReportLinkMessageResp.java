package com.bytedance.android.live.liveinteract.multilive.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.message.linkcore.LinkMicCommonResp;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class ReportLinkMessageResp extends F9E {

    @InterfaceC65349Pkn("common_resp")
    public LinkMicCommonResp commonResp;

    @InterfaceC65349Pkn("interval")
    public long interval;

    /* JADX WARN: Multi-variable type inference failed */
    public ReportLinkMessageResp() {
        this(null, 0L, 3, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.commonResp, Long.valueOf(this.interval)};
    }

    public ReportLinkMessageResp(LinkMicCommonResp linkMicCommonResp, long j) {
        this.commonResp = linkMicCommonResp;
        this.interval = j;
    }

    public /* synthetic */ ReportLinkMessageResp(LinkMicCommonResp linkMicCommonResp, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : linkMicCommonResp, (i & 2) != 0 ? 0L : j);
    }
}
