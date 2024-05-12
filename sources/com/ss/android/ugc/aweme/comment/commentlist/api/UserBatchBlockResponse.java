package com.ss.android.ugc.aweme.comment.commentlist.api;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import defpackage.s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class UserBatchBlockResponse extends BaseResponse {

    @InterfaceC65349Pkn("block_fail_toUserIds")
    public final String blockFailToUserIds;

    @InterfaceC65349Pkn("max_batch_size")
    public final Integer maxBatchSize;

    /* JADX WARN: Multi-variable type inference failed */
    public UserBatchBlockResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserBatchBlockResponse)) {
            return false;
        }
        UserBatchBlockResponse userBatchBlockResponse = (UserBatchBlockResponse) obj;
        return o.LJ(this.blockFailToUserIds, userBatchBlockResponse.blockFailToUserIds) && o.LJ(this.maxBatchSize, userBatchBlockResponse.maxBatchSize);
    }

    public final int hashCode() {
        String str = this.blockFailToUserIds;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.maxBatchSize;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UserBatchBlockResponse(blockFailToUserIds=");
        LIZ.append(this.blockFailToUserIds);
        LIZ.append(", maxBatchSize=");
        return s0.LIZJ(LIZ, this.maxBatchSize, ')', LIZ);
    }

    public UserBatchBlockResponse(String str, Integer num) {
        this.blockFailToUserIds = str;
        this.maxBatchSize = num;
    }

    public /* synthetic */ UserBatchBlockResponse(String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0 : num);
    }
}
