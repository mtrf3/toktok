package com.ss.android.ugc.aweme.kids.discovery.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class KDisocverDetailList extends BaseResponse {

    @InterfaceC65349Pkn("cursor")
    public int cursor;

    @InterfaceC65349Pkn("has_more")
    public int hasMore;

    @InterfaceC65349Pkn("aweme_details")
    public List<? extends Aweme> items;

    @InterfaceC65349Pkn("log_pb")
    public LogPbBean logPbBean;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public KDisocverDetailList() {
        /*
            r7 = this;
            r1 = 0
            r2 = 0
            r5 = 15
            r0 = r7
            r3 = r2
            r4 = r1
            r6 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.kids.discovery.model.KDisocverDetailList.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KDisocverDetailList)) {
            return false;
        }
        KDisocverDetailList kDisocverDetailList = (KDisocverDetailList) obj;
        return o.LJ(this.items, kDisocverDetailList.items) && this.cursor == kDisocverDetailList.cursor && this.hasMore == kDisocverDetailList.hasMore && o.LJ(this.logPbBean, kDisocverDetailList.logPbBean);
    }

    public final int hashCode() {
        List<? extends Aweme> list = this.items;
        int hashCode = (((((list == null ? 0 : list.hashCode()) * 31) + this.cursor) * 31) + this.hasMore) * 31;
        LogPbBean logPbBean = this.logPbBean;
        return hashCode + (logPbBean != null ? logPbBean.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("KDisocverDetailList(items=");
        LIZ.append(this.items);
        LIZ.append(", cursor=");
        LIZ.append(this.cursor);
        LIZ.append(", hasMore=");
        LIZ.append(this.hasMore);
        LIZ.append(", logPbBean=");
        LIZ.append(this.logPbBean);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public KDisocverDetailList(List<? extends Aweme> list, int i, int i2, LogPbBean logPbBean) {
        this.items = list;
        this.cursor = i;
        this.hasMore = i2;
        this.logPbBean = logPbBean;
    }

    public /* synthetic */ KDisocverDetailList(List list, int i, int i2, LogPbBean logPbBean, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : list, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? null : logPbBean);
    }
}
