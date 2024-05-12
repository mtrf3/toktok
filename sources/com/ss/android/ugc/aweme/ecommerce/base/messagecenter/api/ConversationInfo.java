package com.ss.android.ugc.aweme.ecommerce.base.messagecenter.api;

import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ConversationInfo {

    @InterfaceC65349Pkn("clickUrl")
    public final String clickUrl;

    @InterfaceC65349Pkn("conId")
    public final Long conId;

    @InterfaceC65349Pkn("conShortId")
    public final Long conShortId;

    @InterfaceC65349Pkn("conversationType")
    public final Integer conversationType;

    @InterfaceC65349Pkn("createTime")
    public final Long createTime;

    @InterfaceC65349Pkn("imageUrl")
    public final String imageUrl;

    @InterfaceC65349Pkn("isBlock")
    public final Boolean isBlock;

    @InterfaceC65349Pkn("messages")
    public final List<SellerMessage> messages;

    @InterfaceC65349Pkn("modifyTime")
    public final Long modifyTime;

    @InterfaceC65349Pkn("name")
    public final String name;

    @InterfaceC65349Pkn("selling")
    public final StoreSellingPoint selling;

    @InterfaceC65349Pkn("status")
    public final Integer status;

    @InterfaceC65349Pkn("unReadCount")
    public final Integer unReadCount;

    /* JADX WARN: Multi-variable type inference failed */
    public ConversationInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 8191, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConversationInfo)) {
            return false;
        }
        ConversationInfo conversationInfo = (ConversationInfo) obj;
        return o.LJ(this.conShortId, conversationInfo.conShortId) && o.LJ(this.status, conversationInfo.status) && o.LJ(this.createTime, conversationInfo.createTime) && o.LJ(this.modifyTime, conversationInfo.modifyTime) && o.LJ(this.conversationType, conversationInfo.conversationType) && o.LJ(this.conId, conversationInfo.conId) && o.LJ(this.messages, conversationInfo.messages) && o.LJ(this.unReadCount, conversationInfo.unReadCount) && o.LJ(this.isBlock, conversationInfo.isBlock) && o.LJ(this.imageUrl, conversationInfo.imageUrl) && o.LJ(this.clickUrl, conversationInfo.clickUrl) && o.LJ(this.name, conversationInfo.name) && o.LJ(this.selling, conversationInfo.selling);
    }

    public final int hashCode() {
        Long l = this.conShortId;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Integer num = this.status;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Long l2 = this.createTime;
        int hashCode3 = (hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.modifyTime;
        int hashCode4 = (hashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Integer num2 = this.conversationType;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l4 = this.conId;
        int hashCode6 = (hashCode5 + (l4 == null ? 0 : l4.hashCode())) * 31;
        List<SellerMessage> list = this.messages;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num3 = this.unReadCount;
        int hashCode8 = (hashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool = this.isBlock;
        int hashCode9 = (hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.imageUrl;
        int hashCode10 = (hashCode9 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.clickUrl;
        int hashCode11 = (hashCode10 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        int hashCode12 = (hashCode11 + (str3 == null ? 0 : str3.hashCode())) * 31;
        StoreSellingPoint storeSellingPoint = this.selling;
        return hashCode12 + (storeSellingPoint != null ? storeSellingPoint.hashCode() : 0);
    }

    public final String toString() {
        return "ConversationInfo(conShortId=" + this.conShortId + ", status=" + this.status + ", createTime=" + this.createTime + ", modifyTime=" + this.modifyTime + ", conversationType=" + this.conversationType + ", conId=" + this.conId + ", messages=" + this.messages + ", unReadCount=" + this.unReadCount + ", isBlock=" + this.isBlock + ", imageUrl=" + this.imageUrl + ", clickUrl=" + this.clickUrl + ", name=" + this.name + ", selling=" + this.selling + ')';
    }

    public ConversationInfo(Long l, Integer num, Long l2, Long l3, Integer num2, Long l4, List<SellerMessage> list, Integer num3, Boolean bool, String str, String str2, String str3, StoreSellingPoint storeSellingPoint) {
        this.conShortId = l;
        this.status = num;
        this.createTime = l2;
        this.modifyTime = l3;
        this.conversationType = num2;
        this.conId = l4;
        this.messages = list;
        this.unReadCount = num3;
        this.isBlock = bool;
        this.imageUrl = str;
        this.clickUrl = str2;
        this.name = str3;
        this.selling = storeSellingPoint;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ ConversationInfo(java.lang.Long r18, java.lang.Integer r19, java.lang.Long r20, java.lang.Long r21, java.lang.Integer r22, java.lang.Long r23, java.util.List r24, java.lang.Integer r25, java.lang.Boolean r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, com.ss.android.ugc.aweme.ecommerce.base.messagecenter.api.StoreSellingPoint r30, int r31, kotlin.jvm.internal.DefaultConstructorMarker r32) {
        /*
            r17 = this;
            r1 = r31
            r15 = r29
            r14 = r28
            r13 = r27
            r12 = r26
            r11 = r25
            r5 = r19
            r4 = r18
            r6 = r20
            r7 = r21
            r8 = r22
            r10 = r24
            r0 = r1 & 1
            r2 = 0
            java.lang.Long r9 = java.lang.Long.valueOf(r2)
            if (r0 == 0) goto L23
            r4 = r9
        L23:
            r0 = r1 & 2
            r2 = 0
            if (r0 == 0) goto L2c
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
        L2c:
            r0 = r1 & 4
            if (r0 == 0) goto L31
            r6 = r9
        L31:
            r0 = r1 & 8
            if (r0 == 0) goto L36
            r7 = r9
        L36:
            r0 = r1 & 16
            if (r0 == 0) goto L3e
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
        L3e:
            r0 = r1 & 32
            if (r0 == 0) goto L77
        L42:
            r0 = r1 & 64
            r16 = 0
            if (r0 == 0) goto L4a
            r10 = r16
        L4a:
            r0 = r1 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L52
            java.lang.Integer r11 = java.lang.Integer.valueOf(r2)
        L52:
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L58
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
        L58:
            r0 = r1 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L5e
            r13 = r16
        L5e:
            r0 = r1 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L64
            r14 = r16
        L64:
            r0 = r1 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L6a
            r15 = r16
        L6a:
            r0 = r1 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L74
        L6e:
            r3 = r17
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        L74:
            r16 = r30
            goto L6e
        L77:
            r9 = r23
            goto L42
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.messagecenter.api.ConversationInfo.<init>(java.lang.Long, java.lang.Integer, java.lang.Long, java.lang.Long, java.lang.Integer, java.lang.Long, java.util.List, java.lang.Integer, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.ecommerce.base.messagecenter.api.StoreSellingPoint, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
