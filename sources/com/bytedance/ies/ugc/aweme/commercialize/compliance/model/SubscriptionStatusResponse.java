package com.bytedance.ies.ugc.aweme.commercialize.compliance.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class SubscriptionStatusResponse extends BaseResponse implements Serializable {

    @InterfaceC65349Pkn("subscription_expire_timestamp")
    public Integer expireTimestamp;

    @InterfaceC65349Pkn("is_canceled")
    public final Boolean isCanceled;

    @InterfaceC65349Pkn("subscription_start_timestamp")
    public Integer startTimestamp;

    @InterfaceC65349Pkn("subscription_status")
    public Integer status;

    /* JADX WARN: Multi-variable type inference failed */
    public SubscriptionStatusResponse() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public final Integer getExpireTimestamp() {
        return this.expireTimestamp;
    }

    public final Integer getStartTimestamp() {
        return this.startTimestamp;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public final Boolean isCanceled() {
        return this.isCanceled;
    }

    public final void setExpireTimestamp(Integer num) {
        this.expireTimestamp = num;
    }

    public final void setStartTimestamp(Integer num) {
        this.startTimestamp = num;
    }

    public final void setStatus(Integer num) {
        this.status = num;
    }

    public SubscriptionStatusResponse(Integer num, Integer num2, Integer num3, Boolean bool) {
        this.status = num;
        this.startTimestamp = num2;
        this.expireTimestamp = num3;
        this.isCanceled = bool;
    }

    public /* synthetic */ SubscriptionStatusResponse(Integer num, Integer num2, Integer num3, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? 0 : num2, (i & 4) != 0 ? 0 : num3, (i & 8) != 0 ? Boolean.FALSE : bool);
    }
}
