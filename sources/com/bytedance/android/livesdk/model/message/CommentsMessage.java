package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;

/* loaded from: classes6.dex */
public class CommentsMessage extends CR6 {

    @InterfaceC65349Pkn("action_content")
    public String actionContent;

    @InterfaceC65349Pkn("action_type")
    public long actionType;

    @InterfaceC65349Pkn("back_ground")
    public ImageModel background;

    @InterfaceC65349Pkn("color")
    public String color;

    @InterfaceC65349Pkn("content")
    public String content;

    @InterfaceC65349Pkn("user")
    public User user;

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        return true;
    }

    public CommentsMessage() {
        this.type = EnumC31509CYf.COMMENT_IMAGE;
    }
}
