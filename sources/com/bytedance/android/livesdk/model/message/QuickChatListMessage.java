package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import X.WM7;
import java.util.List;

/* loaded from: classes6.dex */
public final class QuickChatListMessage extends CR6 {

    @InterfaceC65349Pkn("content_list")
    public List<QuickChatContent> contentList;

    @InterfaceC65349Pkn("duration")
    public long duration;

    @InterfaceC65349Pkn("priority")
    public long priority;

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public String scene = "";

    public QuickChatListMessage() {
        this.type = EnumC31509CYf.QUICK_CHAT_LIST_MESSAGE;
    }
}
