package com.ss.android.ugc.aweme.ecommerce.base.messagecenter.api;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ConversationResponse {

    @InterfaceC65349Pkn("shop_buyer_data")
    public final ConversationInfoList buyerData;

    @InterfaceC65349Pkn("code")
    public final Integer code;

    @InterfaceC65349Pkn("shop_creator_data")
    public final ConversationInfoList creatorData;

    @InterfaceC65349Pkn("message")
    public final String message;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConversationResponse)) {
            return false;
        }
        ConversationResponse conversationResponse = (ConversationResponse) obj;
        return o.LJ(this.code, conversationResponse.code) && o.LJ(this.message, conversationResponse.message) && o.LJ(this.creatorData, conversationResponse.creatorData) && o.LJ(this.buyerData, conversationResponse.buyerData);
    }

    public final int hashCode() {
        Integer num = this.code;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.message;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ConversationInfoList conversationInfoList = this.creatorData;
        int hashCode3 = (hashCode2 + (conversationInfoList == null ? 0 : conversationInfoList.hashCode())) * 31;
        ConversationInfoList conversationInfoList2 = this.buyerData;
        return hashCode3 + (conversationInfoList2 != null ? conversationInfoList2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ConversationResponse(code=");
        LIZ.append(this.code);
        LIZ.append(", message=");
        LIZ.append(this.message);
        LIZ.append(", creatorData=");
        LIZ.append(this.creatorData);
        LIZ.append(", buyerData=");
        LIZ.append(this.buyerData);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public ConversationResponse(Integer num, String str, ConversationInfoList conversationInfoList, ConversationInfoList conversationInfoList2) {
        this.code = num;
        this.message = str;
        this.creatorData = conversationInfoList;
        this.buyerData = conversationInfoList2;
    }

    public /* synthetic */ ConversationResponse(Integer num, String str, ConversationInfoList conversationInfoList, ConversationInfoList conversationInfoList2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, str, (i & 4) != 0 ? null : conversationInfoList, (i & 8) != 0 ? null : conversationInfoList2);
    }
}
