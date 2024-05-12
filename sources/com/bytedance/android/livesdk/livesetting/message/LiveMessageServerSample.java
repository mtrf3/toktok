package com.bytedance.android.livesdk.livesetting.message;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class LiveMessageServerSample {

    @InterfaceC65349Pkn("anchor_ratio")
    public LiveMessageSampleType anchorRatio;

    @InterfaceC65349Pkn("audience_ratio")
    public LiveMessageSampleType audienceRatio;

    /* JADX WARN: Multi-variable type inference failed */
    public LiveMessageServerSample() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final LiveMessageSampleType getAnchorRatio() {
        return this.anchorRatio;
    }

    public final LiveMessageSampleType getAudienceRatio() {
        return this.audienceRatio;
    }

    public final void setAnchorRatio(LiveMessageSampleType liveMessageSampleType) {
        o.LJIIIZ(liveMessageSampleType, "<set-?>");
        this.anchorRatio = liveMessageSampleType;
    }

    public final void setAudienceRatio(LiveMessageSampleType liveMessageSampleType) {
        o.LJIIIZ(liveMessageSampleType, "<set-?>");
        this.audienceRatio = liveMessageSampleType;
    }

    public LiveMessageServerSample(LiveMessageSampleType anchorRatio, LiveMessageSampleType audienceRatio) {
        o.LJIIIZ(anchorRatio, "anchorRatio");
        o.LJIIIZ(audienceRatio, "audienceRatio");
        this.anchorRatio = anchorRatio;
        this.audienceRatio = audienceRatio;
    }

    public /* synthetic */ LiveMessageServerSample(LiveMessageSampleType liveMessageSampleType, LiveMessageSampleType liveMessageSampleType2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new LiveMessageSampleType(null, null, 3, null) : liveMessageSampleType, (i & 2) != 0 ? new LiveMessageSampleType(null, null, 3, null) : liveMessageSampleType2);
    }
}
