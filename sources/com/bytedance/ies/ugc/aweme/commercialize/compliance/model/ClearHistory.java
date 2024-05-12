package com.bytedance.ies.ugc.aweme.commercialize.compliance.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class ClearHistory extends BaseResponse implements Serializable {

    @InterfaceC65349Pkn("submitted_time")
    public Integer submittedTime;

    /* JADX WARN: Multi-variable type inference failed */
    public ClearHistory() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final Integer getSubmittedTime() {
        return this.submittedTime;
    }

    public ClearHistory(Integer num) {
        this.submittedTime = num;
    }

    public final void setSubmittedTime(Integer num) {
        this.submittedTime = num;
    }

    public /* synthetic */ ClearHistory(Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num);
    }
}
