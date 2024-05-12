package com.bytedance.android.live.liveinteract.multihost.core.model;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class MHJoinReplyBizContent {

    @InterfaceC65349Pkn("source_type")
    public int sourceType;

    public MHJoinReplyBizContent() {
        this(0, 1, null);
    }

    public MHJoinReplyBizContent(int i) {
        this.sourceType = i;
    }

    public /* synthetic */ MHJoinReplyBizContent(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
