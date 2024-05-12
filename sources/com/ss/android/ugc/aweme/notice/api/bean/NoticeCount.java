package com.ss.android.ugc.aweme.notice.api.bean;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class NoticeCount {

    @InterfaceC65349Pkn("point_show_time")
    public final Long aliveDuration;

    @InterfaceC65349Pkn("clear_occasion")
    public Integer clearOccasion;

    @InterfaceC65349Pkn("count")
    public int count;

    @InterfaceC65349Pkn("extra")
    public NoticeCountExtra extra;

    @InterfaceC65349Pkn("group")
    public int group;

    @InterfaceC65349Pkn("show_type")
    public Integer showType;

    public static /* synthetic */ NoticeCount copy$default(NoticeCount noticeCount, int i, int i2, Integer num, Long l, Integer num2, NoticeCountExtra noticeCountExtra, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = noticeCount.count;
        }
        if ((i3 & 2) != 0) {
            i2 = noticeCount.group;
        }
        if ((i3 & 4) != 0) {
            num = noticeCount.showType;
        }
        if ((i3 & 8) != 0) {
            l = noticeCount.aliveDuration;
        }
        if ((i3 & 16) != 0) {
            num2 = noticeCount.clearOccasion;
        }
        if ((i3 & 32) != 0) {
            noticeCountExtra = noticeCount.extra;
        }
        return noticeCount.copy(i, i2, num, l, num2, noticeCountExtra);
    }

    public final NoticeCount copy(int i, int i2, Integer num, Long l, Integer num2, NoticeCountExtra noticeCountExtra) {
        return new NoticeCount(i, i2, num, l, num2, noticeCountExtra);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoticeCount)) {
            return false;
        }
        NoticeCount noticeCount = (NoticeCount) obj;
        return this.count == noticeCount.count && this.group == noticeCount.group && o.LJ(this.showType, noticeCount.showType) && o.LJ(this.aliveDuration, noticeCount.aliveDuration) && o.LJ(this.clearOccasion, noticeCount.clearOccasion) && o.LJ(this.extra, noticeCount.extra);
    }

    public int hashCode() {
        int i = ((this.count * 31) + this.group) * 31;
        Integer num = this.showType;
        int hashCode = (i + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.aliveDuration;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num2 = this.clearOccasion;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        NoticeCountExtra noticeCountExtra = this.extra;
        return hashCode3 + (noticeCountExtra != null ? noticeCountExtra.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NoticeCount(count=");
        LIZ.append(this.count);
        LIZ.append(", group=");
        LIZ.append(this.group);
        LIZ.append(", showType=");
        LIZ.append(this.showType);
        LIZ.append(", aliveDuration=");
        LIZ.append(this.aliveDuration);
        LIZ.append(", clearOccasion=");
        LIZ.append(this.clearOccasion);
        LIZ.append(", extra=");
        LIZ.append(this.extra);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final Long getAliveDuration() {
        return this.aliveDuration;
    }

    public final Integer getClearOccasion() {
        return this.clearOccasion;
    }

    public final int getCount() {
        return this.count;
    }

    public final NoticeCountExtra getExtra() {
        return this.extra;
    }

    public final int getGroup() {
        return this.group;
    }

    public final Integer getShowType() {
        return this.showType;
    }

    public final void setClearOccasion(Integer num) {
        this.clearOccasion = num;
    }

    public final void setCount(int i) {
        this.count = i;
    }

    public final void setExtra(NoticeCountExtra noticeCountExtra) {
        this.extra = noticeCountExtra;
    }

    public final void setGroup(int i) {
        this.group = i;
    }

    public final void setShowType(Integer num) {
        this.showType = num;
    }

    public NoticeCount(int i, int i2, Integer num, Long l, Integer num2, NoticeCountExtra noticeCountExtra) {
        this.count = i;
        this.group = i2;
        this.showType = num;
        this.aliveDuration = l;
        this.clearOccasion = num2;
        this.extra = noticeCountExtra;
    }

    public /* synthetic */ NoticeCount(int i, int i2, Integer num, Long l, Integer num2, NoticeCountExtra noticeCountExtra, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, num, (i3 & 8) != 0 ? 0L : l, num2, noticeCountExtra);
    }
}
