package com.ss.android.ugc.aweme.request_combine.model;

import X.C78966Uyw;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeList;
import com.ss.android.ugc.aweme.request_combine.BaseCombineMode;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class NoticeCountCombineModel extends BaseCombineMode {

    @InterfaceC65349Pkn("body")
    public NoticeList noticeList;

    public static /* synthetic */ NoticeCountCombineModel copy$default(NoticeCountCombineModel noticeCountCombineModel, NoticeList noticeList, int i, Object obj) {
        if ((i & 1) != 0) {
            noticeList = noticeCountCombineModel.noticeList;
        }
        return noticeCountCombineModel.copy(noticeList);
    }

    private Object[] getObjects() {
        return new Object[]{this.noticeList};
    }

    public final NoticeCountCombineModel copy(NoticeList noticeList) {
        o.LJIIIZ(noticeList, "noticeList");
        return new NoticeCountCombineModel(noticeList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NoticeCountCombineModel) {
            return C78966Uyw.LJIIIZ(((NoticeCountCombineModel) obj).getObjects(), getObjects());
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(getObjects());
    }

    public String toString() {
        return C78966Uyw.LJJJLL("NoticeCountCombineModel:%s", getObjects());
    }

    public final NoticeList getNoticeList() {
        return this.noticeList;
    }

    public NoticeCountCombineModel(NoticeList noticeList) {
        o.LJIIIZ(noticeList, "noticeList");
        this.noticeList = noticeList;
    }

    public final void setNoticeList(NoticeList noticeList) {
        o.LJIIIZ(noticeList, "<set-?>");
        this.noticeList = noticeList;
    }
}
