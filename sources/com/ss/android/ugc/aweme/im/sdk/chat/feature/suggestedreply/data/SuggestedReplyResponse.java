package com.ss.android.ugc.aweme.im.sdk.chat.feature.suggestedreply.data;

import X.C78966Uyw;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SuggestedReplyResponse extends BaseResponse {

    @InterfaceC65349Pkn("biz_extra")
    public final Map<String, String> bizExtra;

    @InterfaceC65349Pkn("video_reply")
    public final List<SuggestedReply> reply;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SuggestedReplyResponse) {
            return C78966Uyw.LJIIIZ(((SuggestedReplyResponse) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final Object[] getObjects() {
        return new Object[]{this.reply, this.bizExtra};
    }

    public final int hashCode() {
        return Objects.hash(getObjects());
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return C78966Uyw.LJJJLL("SuggestedReplyResponse:%s,%s", getObjects());
    }

    public SuggestedReplyResponse(List<SuggestedReply> reply, Map<String, String> bizExtra) {
        o.LJIIIZ(reply, "reply");
        o.LJIIIZ(bizExtra, "bizExtra");
        this.reply = reply;
        this.bizExtra = bizExtra;
    }
}
