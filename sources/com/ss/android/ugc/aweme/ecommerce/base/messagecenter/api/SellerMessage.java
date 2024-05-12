package com.ss.android.ugc.aweme.ecommerce.base.messagecenter.api;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SellerMessage {

    @InterfaceC65349Pkn("content")
    public final String content;

    @InterfaceC65349Pkn("conversationId")
    public final Long conversationId;

    @InterfaceC65349Pkn("conversationShortId")
    public final Long conversationShortId;

    @InterfaceC65349Pkn("conversationType")
    public final Long conversationType;

    @InterfaceC65349Pkn("createTime")
    public final Long createTime;

    @InterfaceC65349Pkn("indexInConversation")
    public final Long indexInConversation;

    @InterfaceC65349Pkn("msgType")
    public final Integer msgType;

    @InterfaceC65349Pkn("sender")
    public final Long sender;

    @InterfaceC65349Pkn("serverMessageId")
    public final Long serverMessageId;

    @InterfaceC65349Pkn("status")
    public final Integer status;

    @InterfaceC65349Pkn("version")
    public final Integer version;

    /* JADX WARN: Multi-variable type inference failed */
    public SellerMessage() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 2047, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SellerMessage)) {
            return false;
        }
        SellerMessage sellerMessage = (SellerMessage) obj;
        return o.LJ(this.conversationType, sellerMessage.conversationType) && o.LJ(this.conversationId, sellerMessage.conversationId) && o.LJ(this.conversationShortId, sellerMessage.conversationShortId) && o.LJ(this.serverMessageId, sellerMessage.serverMessageId) && o.LJ(this.msgType, sellerMessage.msgType) && o.LJ(this.content, sellerMessage.content) && o.LJ(this.version, sellerMessage.version) && o.LJ(this.status, sellerMessage.status) && o.LJ(this.createTime, sellerMessage.createTime) && o.LJ(this.sender, sellerMessage.sender) && o.LJ(this.indexInConversation, sellerMessage.indexInConversation);
    }

    public final int hashCode() {
        Long l = this.conversationType;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.conversationId;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.conversationShortId;
        int hashCode3 = (hashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.serverMessageId;
        int hashCode4 = (hashCode3 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Integer num = this.msgType;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.content;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.version;
        int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.status;
        int hashCode8 = (hashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Long l5 = this.createTime;
        int hashCode9 = (hashCode8 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l6 = this.sender;
        int hashCode10 = (hashCode9 + (l6 == null ? 0 : l6.hashCode())) * 31;
        Long l7 = this.indexInConversation;
        return hashCode10 + (l7 != null ? l7.hashCode() : 0);
    }

    public final String toString() {
        return "SellerMessage(conversationType=" + this.conversationType + ", conversationId=" + this.conversationId + ", conversationShortId=" + this.conversationShortId + ", serverMessageId=" + this.serverMessageId + ", msgType=" + this.msgType + ", content=" + this.content + ", version=" + this.version + ", status=" + this.status + ", createTime=" + this.createTime + ", sender=" + this.sender + ", indexInConversation=" + this.indexInConversation + ')';
    }

    public SellerMessage(Long l, Long l2, Long l3, Long l4, Integer num, String str, Integer num2, Integer num3, Long l5, Long l6, Long l7) {
        this.conversationType = l;
        this.conversationId = l2;
        this.conversationShortId = l3;
        this.serverMessageId = l4;
        this.msgType = num;
        this.content = str;
        this.version = num2;
        this.status = num3;
        this.createTime = l5;
        this.sender = l6;
        this.indexInConversation = l7;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ SellerMessage(java.lang.Long r16, java.lang.Long r17, java.lang.Long r18, java.lang.Long r19, java.lang.Integer r20, java.lang.String r21, java.lang.Integer r22, java.lang.Integer r23, java.lang.Long r24, java.lang.Long r25, java.lang.Long r26, int r27, kotlin.jvm.internal.DefaultConstructorMarker r28) {
        /*
            r15 = this;
            r2 = r27
            r13 = r25
            r12 = r24
            r11 = r23
            r5 = r17
            r4 = r16
            r6 = r18
            r8 = r20
            r9 = r21
            r10 = r22
            r3 = r2 & 1
            r0 = 0
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            if (r3 == 0) goto L1f
            r4 = r7
        L1f:
            r0 = r2 & 2
            if (r0 == 0) goto L24
            r5 = r7
        L24:
            r0 = r2 & 4
            if (r0 == 0) goto L29
            r6 = r7
        L29:
            r0 = r2 & 8
            if (r0 == 0) goto L62
        L2d:
            r0 = r2 & 16
            r1 = 0
            if (r0 == 0) goto L36
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
        L36:
            r0 = r2 & 32
            r14 = 0
            if (r0 == 0) goto L3c
            r9 = r14
        L3c:
            r0 = r2 & 64
            if (r0 == 0) goto L44
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
        L44:
            r0 = r2 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L4c
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)
        L4c:
            r0 = r2 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L51
            r12 = r14
        L51:
            r0 = r2 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L56
            r13 = r14
        L56:
            r0 = r2 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L5f
        L5a:
            r3 = r15
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        L5f:
            r14 = r26
            goto L5a
        L62:
            r7 = r19
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.messagecenter.api.SellerMessage.<init>(java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Long, java.lang.Long, java.lang.Long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
