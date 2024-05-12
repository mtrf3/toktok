package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import webcast.im.CohostContent;

/* loaded from: classes14.dex */
public final class BusinessContent extends F9E {

    @InterfaceC65349Pkn("cohost_content")
    public CohostContent cohostContent;

    @InterfaceC65349Pkn("multi_live_content")
    public MultiLiveContent multiLiveContent;

    @InterfaceC65349Pkn("over_length")
    public long overLength;

    /* JADX WARN: Multi-variable type inference failed */
    public BusinessContent() {
        this(0L, null, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.overLength), this.multiLiveContent, this.cohostContent};
    }

    public BusinessContent(long j, MultiLiveContent multiLiveContent, CohostContent cohostContent) {
        this.overLength = j;
        this.multiLiveContent = multiLiveContent;
        this.cohostContent = cohostContent;
    }

    public /* synthetic */ BusinessContent(long j, MultiLiveContent multiLiveContent, CohostContent cohostContent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? null : multiLiveContent, (i & 4) != 0 ? null : cohostContent);
    }
}
