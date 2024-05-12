package com.ss.android.ugc.aweme.notice.api.bean;

import X.EnumC54358LVa;
import X.InterfaceC65349Pkn;
import X.LVZ;

/* loaded from: classes10.dex */
public class NoticeCountMessage extends LVZ {

    @InterfaceC65349Pkn("author_id")
    public long authorId;

    @InterfaceC65349Pkn("item_id")
    public long itemId;

    @InterfaceC65349Pkn("msg_id")
    public String msgId;

    @InterfaceC65349Pkn("count")
    public int noticeCount;

    @InterfaceC65349Pkn("notify_group")
    public int noticeGroup;

    @InterfaceC65349Pkn("type")
    public int noticeType;

    @InterfaceC65349Pkn("push_type")
    public String pushType;

    @InterfaceC65349Pkn("content")
    public StrangerNoticeMessage strangerMessage;

    public NoticeCountMessage() {
        this.msgType = EnumC54358LVa.NOTICE;
    }
}
