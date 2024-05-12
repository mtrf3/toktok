package com.ss.android.ugc.aweme.notification.bean;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class LiveNoticeMessageResponse extends BaseResponse {

    @InterfaceC65349Pkn("data")
    public final LiveMessage liveMessage;

    /* JADX WARN: Multi-variable type inference failed */
    public LiveNoticeMessageResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ LiveNoticeMessageResponse copy$default(LiveNoticeMessageResponse liveNoticeMessageResponse, LiveMessage liveMessage, int i, Object obj) {
        if ((i & 1) != 0) {
            liveMessage = liveNoticeMessageResponse.liveMessage;
        }
        return liveNoticeMessageResponse.copy(liveMessage);
    }

    public final LiveNoticeMessageResponse copy(LiveMessage liveMessage) {
        return new LiveNoticeMessageResponse(liveMessage);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LiveNoticeMessageResponse) && o.LJ(this.liveMessage, ((LiveNoticeMessageResponse) obj).liveMessage);
    }

    public int hashCode() {
        LiveMessage liveMessage = this.liveMessage;
        if (liveMessage == null) {
            return 0;
        }
        return liveMessage.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LiveNoticeMessageResponse(liveMessage=");
        LIZ.append(this.liveMessage);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public LiveNoticeMessageResponse(LiveMessage liveMessage) {
        this.liveMessage = liveMessage;
    }

    public /* synthetic */ LiveNoticeMessageResponse(LiveMessage liveMessage, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : liveMessage);
    }
}
