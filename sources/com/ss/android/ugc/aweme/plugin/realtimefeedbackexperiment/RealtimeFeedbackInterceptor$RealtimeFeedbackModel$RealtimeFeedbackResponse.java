package com.ss.android.ugc.aweme.plugin.realtimefeedbackexperiment;

import X.C48339Iy7;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes6.dex */
public final class RealtimeFeedbackInterceptor$RealtimeFeedbackModel$RealtimeFeedbackResponse extends BaseResponse {

    @InterfaceC65349Pkn("stop")
    public final boolean stop;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RealtimeFeedbackInterceptor$RealtimeFeedbackModel$RealtimeFeedbackResponse) && this.stop == ((RealtimeFeedbackInterceptor$RealtimeFeedbackModel$RealtimeFeedbackResponse) obj).stop;
    }

    public final int hashCode() {
        boolean z = this.stop;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RealtimeFeedbackResponse(stop=");
        return C48339Iy7.LIZJ(LIZ, this.stop, ')', LIZ);
    }

    public RealtimeFeedbackInterceptor$RealtimeFeedbackModel$RealtimeFeedbackResponse(boolean z) {
        this.stop = z;
    }
}
