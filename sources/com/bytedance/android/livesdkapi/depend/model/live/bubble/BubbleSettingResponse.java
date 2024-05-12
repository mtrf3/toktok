package com.bytedance.android.livesdkapi.depend.model.live.bubble;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class BubbleSettingResponse implements Serializable {

    @InterfaceC65349Pkn("data")
    public BubbleSettingData data;

    @InterfaceC65349Pkn("extra")
    public BubbleSettingExtra extra;

    /* JADX WARN: Multi-variable type inference failed */
    public BubbleSettingResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BubbleSettingResponse copy$default(BubbleSettingResponse bubbleSettingResponse, BubbleSettingData bubbleSettingData, BubbleSettingExtra bubbleSettingExtra, int i, Object obj) {
        if ((i & 1) != 0) {
            bubbleSettingData = bubbleSettingResponse.data;
        }
        if ((i & 2) != 0) {
            bubbleSettingExtra = bubbleSettingResponse.extra;
        }
        return bubbleSettingResponse.copy(bubbleSettingData, bubbleSettingExtra);
    }

    public final BubbleSettingResponse copy(BubbleSettingData bubbleSettingData, BubbleSettingExtra bubbleSettingExtra) {
        return new BubbleSettingResponse(bubbleSettingData, bubbleSettingExtra);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BubbleSettingResponse)) {
            return false;
        }
        BubbleSettingResponse bubbleSettingResponse = (BubbleSettingResponse) obj;
        return o.LJ(this.data, bubbleSettingResponse.data) && o.LJ(this.extra, bubbleSettingResponse.extra);
    }

    public int hashCode() {
        BubbleSettingData bubbleSettingData = this.data;
        int hashCode = (bubbleSettingData == null ? 0 : bubbleSettingData.hashCode()) * 31;
        BubbleSettingExtra bubbleSettingExtra = this.extra;
        return hashCode + (bubbleSettingExtra != null ? bubbleSettingExtra.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BubbleSettingResponse(data=");
        LIZ.append(this.data);
        LIZ.append(", extra=");
        LIZ.append(this.extra);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final BubbleSettingData getData() {
        return this.data;
    }

    public final BubbleSettingExtra getExtra() {
        return this.extra;
    }

    public final void setData(BubbleSettingData bubbleSettingData) {
        this.data = bubbleSettingData;
    }

    public final void setExtra(BubbleSettingExtra bubbleSettingExtra) {
        this.extra = bubbleSettingExtra;
    }

    public BubbleSettingResponse(BubbleSettingData bubbleSettingData, BubbleSettingExtra bubbleSettingExtra) {
        this.data = bubbleSettingData;
        this.extra = bubbleSettingExtra;
    }

    public /* synthetic */ BubbleSettingResponse(BubbleSettingData bubbleSettingData, BubbleSettingExtra bubbleSettingExtra, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bubbleSettingData, (i & 2) != 0 ? null : bubbleSettingExtra);
    }
}
