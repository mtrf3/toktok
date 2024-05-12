package com.ss.android.ugc.aweme.plugin.realtimefeedbackexperiment;

import X.InterfaceC65349Pkn;
import X.U26;
import X.X1D;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class RealtimeFeedbackInterceptor$RealtimeFeedbackModel$ContentParams {

    @InterfaceC65349Pkn("action_type")
    public final int actionType;

    @InterfaceC65349Pkn("item_id")
    public final String itemId;

    @InterfaceC65349Pkn("play_duration")
    public final Object playDuration;

    @InterfaceC65349Pkn("video_duration")
    public final Object videoDuration;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RealtimeFeedbackInterceptor$RealtimeFeedbackModel$ContentParams)) {
            return false;
        }
        RealtimeFeedbackInterceptor$RealtimeFeedbackModel$ContentParams realtimeFeedbackInterceptor$RealtimeFeedbackModel$ContentParams = (RealtimeFeedbackInterceptor$RealtimeFeedbackModel$ContentParams) obj;
        return o.LJ(this.itemId, realtimeFeedbackInterceptor$RealtimeFeedbackModel$ContentParams.itemId) && this.actionType == realtimeFeedbackInterceptor$RealtimeFeedbackModel$ContentParams.actionType && o.LJ(this.playDuration, realtimeFeedbackInterceptor$RealtimeFeedbackModel$ContentParams.playDuration) && o.LJ(this.videoDuration, realtimeFeedbackInterceptor$RealtimeFeedbackModel$ContentParams.videoDuration);
    }

    public final int hashCode() {
        String str = this.itemId;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.actionType) * 31;
        Object obj = this.playDuration;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.videoDuration;
        return hashCode2 + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ContentParams(itemId=");
        LIZ.append(this.itemId);
        LIZ.append(", actionType=");
        LIZ.append(this.actionType);
        LIZ.append(", playDuration=");
        LIZ.append(this.playDuration);
        LIZ.append(", videoDuration=");
        return U26.LIZJ(LIZ, this.videoDuration, ')', LIZ);
    }

    public RealtimeFeedbackInterceptor$RealtimeFeedbackModel$ContentParams(String str, int i, Object obj, Object obj2) {
        this.itemId = str;
        this.actionType = i;
        this.playDuration = obj;
        this.videoDuration = obj2;
    }
}
