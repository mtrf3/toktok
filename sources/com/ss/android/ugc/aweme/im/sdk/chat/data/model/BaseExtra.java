package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.SystemContent;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class BaseExtra implements Serializable {

    @InterfaceC65349Pkn("status_code")
    public int statusCode;

    @InterfaceC65349Pkn("status_msg")
    public StatusMessage statusMsg;

    public static /* synthetic */ void getStatusCode$annotations() {
    }

    /* loaded from: classes2.dex */
    public static final class MessageContent {

        @InterfaceC65349Pkn("template")
        public SystemContent.Key[] template;

        @InterfaceC65349Pkn("tips")
        public String tips;

        public final SystemContent.Key[] getTemplate() {
            return this.template;
        }

        public final String getTips() {
            return this.tips;
        }

        public final void setTemplate(SystemContent.Key[] keyArr) {
            this.template = keyArr;
        }

        public final void setTips(String str) {
            this.tips = str;
        }
    }

    /* loaded from: classes2.dex */
    public static final class StatusMessage {

        @InterfaceC65349Pkn("msg_content")
        public MessageContent msgContent;

        @InterfaceC65349Pkn("msg_type")
        public int msgType;

        public final MessageContent getMsgContent() {
            return this.msgContent;
        }

        public final int getMsgType() {
            return this.msgType;
        }

        public final void setMsgContent(MessageContent messageContent) {
            this.msgContent = messageContent;
        }

        public final void setMsgType(int i) {
            this.msgType = i;
        }
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final StatusMessage getStatusMsg() {
        return this.statusMsg;
    }

    public final void setStatusCode(int i) {
        this.statusCode = i;
    }

    public final void setStatusMsg(StatusMessage statusMessage) {
        this.statusMsg = statusMessage;
    }
}
