package com.bytedance.android.live.liveinteract.multilive.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class ChannelMessage extends F9E {

    @InterfaceC65349Pkn("channel_id")
    public long channelId;

    @InterfaceC65349Pkn("layout_id")
    public String layoutId;

    @InterfaceC65349Pkn("layout_version")
    public int layout_version;

    @InterfaceC65349Pkn("report_type")
    public int reportType;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ChannelMessage() {
        /*
            r8 = this;
            r1 = 0
            r3 = 0
            r4 = 0
            r6 = 15
            r0 = r8
            r5 = r3
            r7 = r4
            r0.<init>(r1, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multilive.model.ChannelMessage.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.channelId), Integer.valueOf(this.reportType), this.layoutId, Integer.valueOf(this.layout_version)};
    }

    public ChannelMessage(long j, int i, String str, int i2) {
        this.channelId = j;
        this.reportType = i;
        this.layoutId = str;
        this.layout_version = i2;
    }

    public /* synthetic */ ChannelMessage(long j, int i, String str, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0L : j, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? null : str, (i3 & 8) != 0 ? 0 : i2);
    }
}
