package com.bytedance.android.livesdk.comp.impl.game.linkmic.utils.feedback;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class GuestFeedbackSubmitResponse {

    @InterfaceC65349Pkn("err_code")
    public final int errorCode;

    @InterfaceC65349Pkn("feedback_id")
    public final String feedbackId;

    @InterfaceC65349Pkn("message")
    public final String message;

    /* JADX WARN: Multi-variable type inference failed */
    public GuestFeedbackSubmitResponse() {
        this(null, 0 == true ? 1 : 0, 0, 7, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GuestFeedbackSubmitResponse)) {
            return false;
        }
        GuestFeedbackSubmitResponse guestFeedbackSubmitResponse = (GuestFeedbackSubmitResponse) obj;
        return o.LJ(this.message, guestFeedbackSubmitResponse.message) && o.LJ(this.feedbackId, guestFeedbackSubmitResponse.feedbackId) && this.errorCode == guestFeedbackSubmitResponse.errorCode;
    }

    public final int hashCode() {
        String str = this.message;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.feedbackId;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.errorCode;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GuestFeedbackSubmitResponse(message=");
        LIZ.append(this.message);
        LIZ.append(", feedbackId=");
        LIZ.append(this.feedbackId);
        LIZ.append(", errorCode=");
        return b0.LIZJ(LIZ, this.errorCode, ')', LIZ);
    }

    public GuestFeedbackSubmitResponse(String str, String str2, int i) {
        this.message = str;
        this.feedbackId = str2;
        this.errorCode = i;
    }

    public /* synthetic */ GuestFeedbackSubmitResponse(String str, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? Integer.MAX_VALUE : i);
    }
}
