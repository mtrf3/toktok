package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.X1D;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizJoinDirectResponse;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DirectJoinResult {
    public final BizJoinDirectResponse joinDirectResp;

    public static /* synthetic */ DirectJoinResult copy$default(DirectJoinResult directJoinResult, BizJoinDirectResponse bizJoinDirectResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            bizJoinDirectResponse = directJoinResult.joinDirectResp;
        }
        return directJoinResult.copy(bizJoinDirectResponse);
    }

    public final BizJoinDirectResponse component1() {
        return this.joinDirectResp;
    }

    public final DirectJoinResult copy(BizJoinDirectResponse bizJoinDirectResponse) {
        return new DirectJoinResult(bizJoinDirectResponse);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DirectJoinResult) && o.LJ(this.joinDirectResp, ((DirectJoinResult) obj).joinDirectResp);
    }

    public int hashCode() {
        BizJoinDirectResponse bizJoinDirectResponse = this.joinDirectResp;
        if (bizJoinDirectResponse == null) {
            return 0;
        }
        return bizJoinDirectResponse.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DirectJoinResult(joinDirectResp=");
        LIZ.append(this.joinDirectResp);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public DirectJoinResult(BizJoinDirectResponse bizJoinDirectResponse) {
        this.joinDirectResp = bizJoinDirectResponse;
    }
}
