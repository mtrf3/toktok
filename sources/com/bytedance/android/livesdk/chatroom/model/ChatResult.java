package com.bytedance.android.livesdk.chatroom.model;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.common.Text;
import webcast.data.UserIdentity;

/* loaded from: classes6.dex */
public class ChatResult {

    @InterfaceC65349Pkn("background_image")
    public ImageModel background;

    @InterfaceC65349Pkn("comment_tray")
    public CommentTray commentTray;

    @InterfaceC65349Pkn("content")
    public String content;

    @InterfaceC65349Pkn("content_language")
    public String contentLanguage;

    @InterfaceC65349Pkn("display_text")
    public Text displayText;

    @InterfaceC65349Pkn("fullscreen_text_color")
    public String fullScreenTextColor;

    @InterfaceC65349Pkn("id")
    public long id;

    @InterfaceC65349Pkn("msg_id")
    public long msgId;

    @InterfaceC65349Pkn("user")
    public User user;

    @InterfaceC65349Pkn("user_identity")
    public UserIdentity userIdentity;

    public ImageModel getBackground() {
        return this.background;
    }

    public CommentTray getCommentTray() {
        return this.commentTray;
    }

    public String getContent() {
        return this.content;
    }

    public String getContentLanguage() {
        return this.contentLanguage;
    }

    public Text getDisplayText() {
        return this.displayText;
    }

    public String getFullScreenTextColor() {
        return this.fullScreenTextColor;
    }

    public long getId() {
        return this.id;
    }

    public long getMsgId() {
        return this.msgId;
    }

    public User getUser() {
        return this.user;
    }

    public void setBackground(ImageModel imageModel) {
        this.background = imageModel;
    }

    public void setCommentTray(CommentTray commentTray) {
        this.commentTray = commentTray;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setDisplayText(Text text) {
        this.displayText = text;
    }

    public void setFullScreenTextColor(String str) {
        this.fullScreenTextColor = str;
    }

    public void setId(long j) {
        this.id = j;
    }

    public void setMsgId(long j) {
        this.msgId = j;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
