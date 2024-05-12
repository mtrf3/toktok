package com.ss.android.ugc.tiktok.addyours.model;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import com.ss.android.ugc.aweme.addyours.model.AddYoursTopic;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class AddYoursCollectionTopicsResp extends BaseResponse {

    @InterfaceC65349Pkn("cursor")
    public final long cursor;

    @InterfaceC65349Pkn("has_more")
    public final boolean hasMore;

    @InterfaceC65349Pkn("topic_list")
    public final List<AddYoursTopic> topicList;

    /* JADX WARN: Multi-variable type inference failed */
    public AddYoursCollectionTopicsResp() {
        this(false, 0L, null, 7, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddYoursCollectionTopicsResp)) {
            return false;
        }
        AddYoursCollectionTopicsResp addYoursCollectionTopicsResp = (AddYoursCollectionTopicsResp) obj;
        return this.hasMore == addYoursCollectionTopicsResp.hasMore && this.cursor == addYoursCollectionTopicsResp.cursor && o.LJ(this.topicList, addYoursCollectionTopicsResp.topicList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final int hashCode() {
        int hashCode;
        boolean z = this.hasMore;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int LIZJ = JBR.LIZJ(this.cursor, r0 * 31, 31);
        List<AddYoursTopic> list = this.topicList;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return LIZJ + hashCode;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AddYoursCollectionTopicsResp(hasMore=");
        LIZ.append(this.hasMore);
        LIZ.append(", cursor=");
        LIZ.append(this.cursor);
        LIZ.append(", topicList=");
        return C1NE.LIZIZ(LIZ, this.topicList, ')', LIZ);
    }

    public AddYoursCollectionTopicsResp(boolean z, long j, List<AddYoursTopic> list) {
        this.hasMore = z;
        this.cursor = j;
        this.topicList = list;
    }

    public /* synthetic */ AddYoursCollectionTopicsResp(boolean z, long j, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? null : list);
    }
}
