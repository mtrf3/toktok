package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C1NE;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class SystemNoticeData {
    public final List<NoticeChannelInfo> channelList;
    public final MusNotice notice;

    /* JADX WARN: Multi-variable type inference failed */
    public SystemNoticeData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SystemNoticeData copy$default(SystemNoticeData systemNoticeData, MusNotice musNotice, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            musNotice = systemNoticeData.notice;
        }
        if ((i & 2) != 0) {
            list = systemNoticeData.channelList;
        }
        return systemNoticeData.copy(musNotice, list);
    }

    public final SystemNoticeData copy(MusNotice musNotice, List<NoticeChannelInfo> list) {
        return new SystemNoticeData(musNotice, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SystemNoticeData)) {
            return false;
        }
        SystemNoticeData systemNoticeData = (SystemNoticeData) obj;
        return o.LJ(this.notice, systemNoticeData.notice) && o.LJ(this.channelList, systemNoticeData.channelList);
    }

    public int hashCode() {
        MusNotice musNotice = this.notice;
        int hashCode = (musNotice == null ? 0 : musNotice.hashCode()) * 31;
        List<NoticeChannelInfo> list = this.channelList;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SystemNoticeData(notice=");
        LIZ.append(this.notice);
        LIZ.append(", channelList=");
        return C1NE.LIZIZ(LIZ, this.channelList, ')', LIZ);
    }

    public final List<NoticeChannelInfo> getChannelList() {
        return this.channelList;
    }

    public final MusNotice getNotice() {
        return this.notice;
    }

    public SystemNoticeData(MusNotice musNotice, List<NoticeChannelInfo> list) {
        this.notice = musNotice;
        this.channelList = list;
    }

    public /* synthetic */ SystemNoticeData(MusNotice musNotice, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : musNotice, (i & 2) != 0 ? null : list);
    }
}
