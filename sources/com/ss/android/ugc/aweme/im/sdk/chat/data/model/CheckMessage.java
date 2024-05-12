package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class CheckMessage {
    public static final Companion Companion = new Companion();

    @InterfaceC65349Pkn("media_mask")
    public Boolean mediaMask;

    @InterfaceC65349Pkn("raw_check_code")
    public int rawCheckCode;

    @InterfaceC65349Pkn("status_code")
    public int statusCode;

    @InterfaceC65349Pkn("status_msg")
    public StatusMsg statusMsg;

    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final SystemContent getContent(CheckMessage checkMessage) {
            StatusMsg statusMsg;
            if (checkMessage != null && (statusMsg = checkMessage.getStatusMsg()) != null) {
                return statusMsg.getMsgContent();
            }
            return null;
        }
    }

    /* loaded from: classes2.dex */
    public static final class StatusMsg {

        @InterfaceC65349Pkn("msg_content")
        public SystemContent msgContent;

        @InterfaceC65349Pkn("msg_type")
        public int msgType;

        public final SystemContent getMsgContent() {
            return this.msgContent;
        }

        public final int getMsgType() {
            return this.msgType;
        }

        public final void setMsgContent(SystemContent systemContent) {
            this.msgContent = systemContent;
        }

        public final void setMsgType(int i) {
            this.msgType = i;
        }
    }

    public final Boolean getMediaMask() {
        return this.mediaMask;
    }

    public final int getRawCheckCode() {
        return this.rawCheckCode;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final StatusMsg getStatusMsg() {
        return this.statusMsg;
    }

    public final void setMediaMask(Boolean bool) {
        this.mediaMask = bool;
    }

    public final void setRawCheckCode(int i) {
        this.rawCheckCode = i;
    }

    public final void setStatusCode(int i) {
        this.statusCode = i;
    }

    public final void setStatusMsg(StatusMsg statusMsg) {
        this.statusMsg = statusMsg;
    }
}
