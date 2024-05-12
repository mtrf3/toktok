package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class BizApplyParams extends F9E {

    @InterfaceC65349Pkn("anchor_id")
    public long anchorId;

    @InterfaceC65349Pkn("follow")
    public boolean follow;

    @InterfaceC65349Pkn("link_type")
    public long linkType;

    @InterfaceC65349Pkn("user_return_type")
    public int userReturnType;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BizApplyParams() {
        /*
            r9 = this;
            r1 = 0
            r5 = 0
            r7 = 15
            r8 = 0
            r0 = r9
            r3 = r1
            r6 = r5
            r0.<init>(r1, r3, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizApplyParams.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.linkType), Long.valueOf(this.anchorId), Integer.valueOf(this.userReturnType), Boolean.valueOf(this.follow)};
    }

    public BizApplyParams(long j, long j2, int i, boolean z) {
        this.linkType = j;
        this.anchorId = j2;
        this.userReturnType = i;
        this.follow = z;
    }

    public /* synthetic */ BizApplyParams(long j, long j2, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) == 0 ? j2 : 0L, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? false : z);
    }
}
