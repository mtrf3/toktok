package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes13.dex */
public final class FollowAndClaimVoucherRequest {

    @InterfaceC65349Pkn("author_id")
    public final Integer authorId;

    @InterfaceC65349Pkn("claim_scene")
    public final Integer claimScene;

    @InterfaceC65349Pkn("room_id")
    public final String roomId;

    @InterfaceC65349Pkn("source")
    public final Integer source;

    @InterfaceC65349Pkn("user_task_id")
    public final String userTaskId;

    @InterfaceC65349Pkn("voucher_type_id")
    public final String voucherTypeId;

    /* JADX WARN: Multi-variable type inference failed */
    public FollowAndClaimVoucherRequest() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    public FollowAndClaimVoucherRequest(String str, String str2, Integer num, String str3, Integer num2, Integer num3) {
        this.voucherTypeId = str;
        this.userTaskId = str2;
        this.authorId = num;
        this.roomId = str3;
        this.source = num2;
        this.claimScene = num3;
    }

    public /* synthetic */ FollowAndClaimVoucherRequest(String str, String str2, Integer num, String str3, Integer num2, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : num2, (i & 32) == 0 ? num3 : null);
    }
}
