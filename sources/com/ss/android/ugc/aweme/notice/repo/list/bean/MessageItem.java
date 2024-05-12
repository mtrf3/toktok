package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MessageItem {

    @InterfaceC65349Pkn("notice")
    public final NoticeItems notices;

    public static /* synthetic */ MessageItem copy$default(MessageItem messageItem, NoticeItems noticeItems, int i, Object obj) {
        if ((i & 1) != 0) {
            noticeItems = messageItem.notices;
        }
        return messageItem.copy(noticeItems);
    }

    public final MessageItem copy(NoticeItems noticeItems) {
        return new MessageItem(noticeItems);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MessageItem) && o.LJ(this.notices, ((MessageItem) obj).notices);
    }

    public int hashCode() {
        NoticeItems noticeItems = this.notices;
        if (noticeItems == null) {
            return 0;
        }
        return noticeItems.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MessageItem(notices=");
        LIZ.append(this.notices);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final NoticeItems getNotices() {
        return this.notices;
    }

    public MessageItem(NoticeItems noticeItems) {
        this.notices = noticeItems;
    }
}
