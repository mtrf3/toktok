package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class BizApplyResponseData extends F9E {

    @InterfaceC65349Pkn("link_type_permission")
    public long linkTypePermission;

    @InterfaceC65349Pkn("perception_info")
    public PerceptionMessage perceptionInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public BizApplyResponseData() {
        this(0L, null, 3, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.linkTypePermission), this.perceptionInfo};
    }

    public BizApplyResponseData(long j, PerceptionMessage perceptionMessage) {
        this.linkTypePermission = j;
        this.perceptionInfo = perceptionMessage;
    }

    public /* synthetic */ BizApplyResponseData(long j, PerceptionMessage perceptionMessage, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? null : perceptionMessage);
    }
}
