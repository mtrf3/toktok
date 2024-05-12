package com.bytedance.android.livesdkapi.depend.model.live.bubble;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class GetLiveBubbleResponse implements Serializable {

    @InterfaceC65349Pkn("data")
    public LiveBubbleData data;

    @InterfaceC65349Pkn("extra")
    public LiveBubbleExtra extra;

    /* JADX WARN: Multi-variable type inference failed */
    public GetLiveBubbleResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ GetLiveBubbleResponse copy$default(GetLiveBubbleResponse getLiveBubbleResponse, LiveBubbleData liveBubbleData, LiveBubbleExtra liveBubbleExtra, int i, Object obj) {
        if ((i & 1) != 0) {
            liveBubbleData = getLiveBubbleResponse.data;
        }
        if ((i & 2) != 0) {
            liveBubbleExtra = getLiveBubbleResponse.extra;
        }
        return getLiveBubbleResponse.copy(liveBubbleData, liveBubbleExtra);
    }

    public final GetLiveBubbleResponse copy(LiveBubbleData liveBubbleData, LiveBubbleExtra liveBubbleExtra) {
        return new GetLiveBubbleResponse(liveBubbleData, liveBubbleExtra);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetLiveBubbleResponse)) {
            return false;
        }
        GetLiveBubbleResponse getLiveBubbleResponse = (GetLiveBubbleResponse) obj;
        return o.LJ(this.data, getLiveBubbleResponse.data) && o.LJ(this.extra, getLiveBubbleResponse.extra);
    }

    public int hashCode() {
        LiveBubbleData liveBubbleData = this.data;
        int hashCode = (liveBubbleData == null ? 0 : liveBubbleData.hashCode()) * 31;
        LiveBubbleExtra liveBubbleExtra = this.extra;
        return hashCode + (liveBubbleExtra != null ? liveBubbleExtra.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GetLiveBubbleResponse(data=");
        LIZ.append(this.data);
        LIZ.append(", extra=");
        LIZ.append(this.extra);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final LiveBubbleData getData() {
        return this.data;
    }

    public final LiveBubbleExtra getExtra() {
        return this.extra;
    }

    public final void setData(LiveBubbleData liveBubbleData) {
        this.data = liveBubbleData;
    }

    public final void setExtra(LiveBubbleExtra liveBubbleExtra) {
        this.extra = liveBubbleExtra;
    }

    public GetLiveBubbleResponse(LiveBubbleData liveBubbleData, LiveBubbleExtra liveBubbleExtra) {
        this.data = liveBubbleData;
        this.extra = liveBubbleExtra;
    }

    public /* synthetic */ GetLiveBubbleResponse(LiveBubbleData liveBubbleData, LiveBubbleExtra liveBubbleExtra, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : liveBubbleData, (i & 2) != 0 ? null : liveBubbleExtra);
    }
}
