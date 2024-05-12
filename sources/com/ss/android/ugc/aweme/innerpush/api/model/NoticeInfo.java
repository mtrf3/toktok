package com.ss.android.ugc.aweme.innerpush.api.model;

import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class NoticeInfo implements Serializable {

    @InterfaceC65349Pkn("create_time")
    public final Long createTime;

    @InterfaceC65349Pkn("type")
    public final Integer type;

    /* JADX WARN: Multi-variable type inference failed */
    public NoticeInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ NoticeInfo copy$default(NoticeInfo noticeInfo, Integer num, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            num = noticeInfo.type;
        }
        if ((i & 2) != 0) {
            l = noticeInfo.createTime;
        }
        return noticeInfo.copy(num, l);
    }

    public final NoticeInfo copy(Integer num, Long l) {
        return new NoticeInfo(num, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoticeInfo)) {
            return false;
        }
        NoticeInfo noticeInfo = (NoticeInfo) obj;
        return o.LJ(this.type, noticeInfo.type) && o.LJ(this.createTime, noticeInfo.createTime);
    }

    public int hashCode() {
        Integer num = this.type;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l = this.createTime;
        return hashCode + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NoticeInfo(type=");
        LIZ.append(this.type);
        LIZ.append(", createTime=");
        return JBR.LJ(LIZ, this.createTime, ')', LIZ);
    }

    public final Long getCreateTime() {
        return this.createTime;
    }

    public final Integer getType() {
        return this.type;
    }

    public NoticeInfo(Integer num, Long l) {
        this.type = num;
        this.createTime = l;
    }

    public /* synthetic */ NoticeInfo(Integer num, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : l);
    }
}
