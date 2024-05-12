package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MessageResponse extends BaseResponse {

    @InterfaceC65349Pkn("messages")
    public final MessageItem item;

    @InterfaceC65349Pkn("log_pb")
    public final LogPbBean mLogPbBean;

    /* JADX WARN: Multi-variable type inference failed */
    public MessageResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ MessageResponse copy$default(MessageResponse messageResponse, MessageItem messageItem, LogPbBean logPbBean, int i, Object obj) {
        if ((i & 1) != 0) {
            messageItem = messageResponse.item;
        }
        if ((i & 2) != 0) {
            logPbBean = messageResponse.mLogPbBean;
        }
        return messageResponse.copy(messageItem, logPbBean);
    }

    public final MessageResponse copy(MessageItem messageItem, LogPbBean logPbBean) {
        return new MessageResponse(messageItem, logPbBean);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageResponse)) {
            return false;
        }
        MessageResponse messageResponse = (MessageResponse) obj;
        return o.LJ(this.item, messageResponse.item) && o.LJ(this.mLogPbBean, messageResponse.mLogPbBean);
    }

    public int hashCode() {
        MessageItem messageItem = this.item;
        int hashCode = (messageItem == null ? 0 : messageItem.hashCode()) * 31;
        LogPbBean logPbBean = this.mLogPbBean;
        return hashCode + (logPbBean != null ? logPbBean.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MessageResponse(item=");
        LIZ.append(this.item);
        LIZ.append(", mLogPbBean=");
        LIZ.append(this.mLogPbBean);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final MessageItem getItem() {
        return this.item;
    }

    public final LogPbBean getMLogPbBean() {
        return this.mLogPbBean;
    }

    public MessageResponse(MessageItem messageItem, LogPbBean logPbBean) {
        this.item = messageItem;
        this.mLogPbBean = logPbBean;
    }

    public /* synthetic */ MessageResponse(MessageItem messageItem, LogPbBean logPbBean, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : messageItem, (i & 2) != 0 ? null : logPbBean);
    }
}
