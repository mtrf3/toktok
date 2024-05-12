package com.ss.android.ugc.aweme.im.sdk.common.data.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import defpackage.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ConversationContentResponse extends BaseResponse {

    @InterfaceC65349Pkn("action")
    public final int action;

    @InterfaceC65349Pkn("content")
    public final String content;

    /* JADX WARN: Multi-variable type inference failed */
    public ConversationContentResponse() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConversationContentResponse)) {
            return false;
        }
        ConversationContentResponse conversationContentResponse = (ConversationContentResponse) obj;
        return o.LJ(this.content, conversationContentResponse.content) && this.action == conversationContentResponse.action;
    }

    public final int hashCode() {
        String str = this.content;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.action;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ConversationContentResponse(content=");
        LIZ.append(this.content);
        LIZ.append(", action=");
        return b0.LIZJ(LIZ, this.action, ')', LIZ);
    }

    public ConversationContentResponse(String str, int i) {
        this.content = str;
        this.action = i;
    }

    public /* synthetic */ ConversationContentResponse(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? 0 : i);
    }
}
