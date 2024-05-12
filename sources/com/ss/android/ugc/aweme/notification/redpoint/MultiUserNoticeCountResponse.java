package com.ss.android.ugc.aweme.notification.redpoint;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class MultiUserNoticeCountResponse extends BaseResponse {

    @InterfaceC65349Pkn("data")
    public List<NoticeList> noticeLists;

    /* JADX WARN: Multi-variable type inference failed */
    public MultiUserNoticeCountResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MultiUserNoticeCountResponse) && o.LJ(this.noticeLists, ((MultiUserNoticeCountResponse) obj).noticeLists);
    }

    public final int hashCode() {
        List<NoticeList> list = this.noticeLists;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MultiUserNoticeCountResponse(noticeLists=");
        return C1NE.LIZIZ(LIZ, this.noticeLists, ')', LIZ);
    }

    public MultiUserNoticeCountResponse(List<NoticeList> list) {
        this.noticeLists = list;
    }

    public /* synthetic */ MultiUserNoticeCountResponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
