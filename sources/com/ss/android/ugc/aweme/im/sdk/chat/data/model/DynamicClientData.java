package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class DynamicClientData {

    @InterfaceC65349Pkn("card_info")
    public final CardInfo cardInfo;

    @InterfaceC65349Pkn("conversation_info")
    public final ConversationInfo conversationInfo;

    @InterfaceC65349Pkn("message_info")
    public final MessageInfo messageInfo;

    @InterfaceC65349Pkn("ui_location_type")
    public final int uiLocationType;

    public static /* synthetic */ DynamicClientData copy$default(DynamicClientData dynamicClientData, ConversationInfo conversationInfo, MessageInfo messageInfo, int i, CardInfo cardInfo, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            conversationInfo = dynamicClientData.conversationInfo;
        }
        if ((i2 & 2) != 0) {
            messageInfo = dynamicClientData.messageInfo;
        }
        if ((i2 & 4) != 0) {
            i = dynamicClientData.uiLocationType;
        }
        if ((i2 & 8) != 0) {
            cardInfo = dynamicClientData.cardInfo;
        }
        return dynamicClientData.copy(conversationInfo, messageInfo, i, cardInfo);
    }

    public final DynamicClientData copy(ConversationInfo conversationInfo, MessageInfo messageInfo, int i, CardInfo cardInfo) {
        return new DynamicClientData(conversationInfo, messageInfo, i, cardInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DynamicClientData)) {
            return false;
        }
        DynamicClientData dynamicClientData = (DynamicClientData) obj;
        return o.LJ(this.conversationInfo, dynamicClientData.conversationInfo) && o.LJ(this.messageInfo, dynamicClientData.messageInfo) && this.uiLocationType == dynamicClientData.uiLocationType && o.LJ(this.cardInfo, dynamicClientData.cardInfo);
    }

    public int hashCode() {
        ConversationInfo conversationInfo = this.conversationInfo;
        int hashCode = (conversationInfo == null ? 0 : conversationInfo.hashCode()) * 31;
        MessageInfo messageInfo = this.messageInfo;
        int hashCode2 = (((hashCode + (messageInfo == null ? 0 : messageInfo.hashCode())) * 31) + this.uiLocationType) * 31;
        CardInfo cardInfo = this.cardInfo;
        return hashCode2 + (cardInfo != null ? cardInfo.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DynamicClientData(conversationInfo=");
        LIZ.append(this.conversationInfo);
        LIZ.append(", messageInfo=");
        LIZ.append(this.messageInfo);
        LIZ.append(", uiLocationType=");
        LIZ.append(this.uiLocationType);
        LIZ.append(", cardInfo=");
        LIZ.append(this.cardInfo);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final CardInfo getCardInfo() {
        return this.cardInfo;
    }

    public final ConversationInfo getConversationInfo() {
        return this.conversationInfo;
    }

    public final MessageInfo getMessageInfo() {
        return this.messageInfo;
    }

    public final int getUiLocationType() {
        return this.uiLocationType;
    }

    public DynamicClientData(ConversationInfo conversationInfo, MessageInfo messageInfo, int i, CardInfo cardInfo) {
        this.conversationInfo = conversationInfo;
        this.messageInfo = messageInfo;
        this.uiLocationType = i;
        this.cardInfo = cardInfo;
    }

    public /* synthetic */ DynamicClientData(ConversationInfo conversationInfo, MessageInfo messageInfo, int i, CardInfo cardInfo, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(conversationInfo, (i2 & 2) != 0 ? null : messageInfo, i, cardInfo);
    }
}
