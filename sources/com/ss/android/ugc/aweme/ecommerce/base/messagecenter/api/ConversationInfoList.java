package com.ss.android.ugc.aweme.ecommerce.base.messagecenter.api;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ConversationInfoList {
    public final int LIZ;

    @InterfaceC65349Pkn("conversationCoreInfos")
    public final List<ConversationInfo> conversationCoreInfos;

    @InterfaceC65349Pkn("hasMore")
    public final Boolean hasMore;

    @InterfaceC65349Pkn("nextCursor")
    public final Integer nextCursor;

    @InterfaceC65349Pkn("totalUnReadCount")
    public final Integer totalUnReadCount;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConversationInfoList)) {
            return false;
        }
        ConversationInfoList conversationInfoList = (ConversationInfoList) obj;
        return o.LJ(this.conversationCoreInfos, conversationInfoList.conversationCoreInfos) && o.LJ(this.hasMore, conversationInfoList.hasMore) && o.LJ(this.nextCursor, conversationInfoList.nextCursor) && o.LJ(this.totalUnReadCount, conversationInfoList.totalUnReadCount) && this.LIZ == conversationInfoList.LIZ;
    }

    public final int hashCode() {
        List<ConversationInfo> list = this.conversationCoreInfos;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.hasMore;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.nextCursor;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.totalUnReadCount;
        return ((hashCode3 + (num2 != null ? num2.hashCode() : 0)) * 31) + this.LIZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ConversationInfoList(conversationCoreInfos=");
        LIZ.append(this.conversationCoreInfos);
        LIZ.append(", hasMore=");
        LIZ.append(this.hasMore);
        LIZ.append(", nextCursor=");
        LIZ.append(this.nextCursor);
        LIZ.append(", totalUnReadCount=");
        LIZ.append(this.totalUnReadCount);
        LIZ.append(", role=");
        return b0.LIZJ(LIZ, this.LIZ, ')', LIZ);
    }

    public static ConversationInfoList LIZ(ConversationInfoList conversationInfoList, int i) {
        return new ConversationInfoList(conversationInfoList.conversationCoreInfos, conversationInfoList.hasMore, conversationInfoList.nextCursor, conversationInfoList.totalUnReadCount, i);
    }

    public ConversationInfoList(List<ConversationInfo> list, Boolean bool, Integer num, Integer num2, int i) {
        this.conversationCoreInfos = list;
        this.hasMore = bool;
        this.nextCursor = num;
        this.totalUnReadCount = num2;
        this.LIZ = i;
    }

    public /* synthetic */ ConversationInfoList(List list, Boolean bool, Integer num, Integer num2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : list, (i2 & 2) != 0 ? Boolean.FALSE : bool, (i2 & 4) != 0 ? null : num, (i2 & 8) == 0 ? num2 : null, i);
    }
}
