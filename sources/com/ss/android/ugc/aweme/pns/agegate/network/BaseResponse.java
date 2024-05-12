package com.ss.android.ugc.aweme.pns.agegate.network;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSFeedbackModel;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes16.dex */
public class BaseResponse implements Serializable {

    @InterfaceC65349Pkn("feedback")
    public final PNSFeedbackModel ageGateFeedback;

    @InterfaceC65349Pkn("status_code")
    public final int status_code;

    @InterfaceC65349Pkn("status_msg")
    public final String status_msg;

    /* JADX WARN: Multi-variable type inference failed */
    public BaseResponse() {
        this(0, null, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public final PNSFeedbackModel getAgeGateFeedback() {
        return this.ageGateFeedback;
    }

    public final int getStatus_code() {
        return this.status_code;
    }

    public final String getStatus_msg() {
        return this.status_msg;
    }

    public BaseResponse(int i, String str, PNSFeedbackModel pNSFeedbackModel) {
        this.status_code = i;
        this.status_msg = str;
        this.ageGateFeedback = pNSFeedbackModel;
    }

    public /* synthetic */ BaseResponse(int i, String str, PNSFeedbackModel pNSFeedbackModel, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? null : pNSFeedbackModel);
    }
}
