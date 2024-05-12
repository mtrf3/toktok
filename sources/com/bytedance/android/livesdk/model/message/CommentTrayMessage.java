package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public final class CommentTrayMessage extends CR6 {

    @InterfaceC65349Pkn("chat_time")
    public long chatTime;

    @InterfaceC65349Pkn("content")
    public String content;

    @InterfaceC65349Pkn("content_type")
    public long contentType;

    @InterfaceC65349Pkn("count")
    public long count;

    @InterfaceC65349Pkn("tray_id")
    public long trayId;

    public CommentTrayMessage() {
        this.type = EnumC31509CYf.COMMENT_TRAY_MESSAGE;
        this.content = "";
    }
}
