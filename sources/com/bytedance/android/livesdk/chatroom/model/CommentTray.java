package com.bytedance.android.livesdk.chatroom.model;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CommentTray {

    @InterfaceC65349Pkn("content")
    public final String content;

    @InterfaceC65349Pkn("content_type")
    public final long contentType;

    @InterfaceC65349Pkn("count")
    public final long count;

    @InterfaceC65349Pkn("tray_id")
    public final long trayId;

    public CommentTray(long j, String content, long j2, long j3) {
        o.LJIIIZ(content, "content");
        this.trayId = j;
        this.content = content;
        this.contentType = j2;
        this.count = j3;
    }
}
