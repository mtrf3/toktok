package com.ss.android.ugc.aweme.notice.api.bean;

import X.C48339Iy7;
import X.EnumC54302LSw;
import X.InterfaceC65349Pkn;
import X.LVG;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class NoticeGroupAttrs {

    @InterfaceC65349Pkn("point_show_time")
    public final Long aliveDuration;

    @InterfaceC65349Pkn("clear_occasion")
    public LVG clearOccasion;

    @InterfaceC65349Pkn("is_from_notice")
    public final boolean isFromNotice;

    @InterfaceC65349Pkn("show_type")
    public EnumC54302LSw showType;

    /* JADX WARN: Multi-variable type inference failed */
    public NoticeGroupAttrs() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 15, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoticeGroupAttrs)) {
            return false;
        }
        NoticeGroupAttrs noticeGroupAttrs = (NoticeGroupAttrs) obj;
        return this.clearOccasion == noticeGroupAttrs.clearOccasion && this.showType == noticeGroupAttrs.showType && o.LJ(this.aliveDuration, noticeGroupAttrs.aliveDuration) && this.isFromNotice == noticeGroupAttrs.isFromNotice;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = (this.showType.hashCode() + (this.clearOccasion.hashCode() * 31)) * 31;
        Long l = this.aliveDuration;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        boolean z = this.isFromNotice;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NoticeGroupAttrs(clearOccasion=");
        LIZ.append(this.clearOccasion);
        LIZ.append(", showType=");
        LIZ.append(this.showType);
        LIZ.append(", aliveDuration=");
        LIZ.append(this.aliveDuration);
        LIZ.append(", isFromNotice=");
        return C48339Iy7.LIZJ(LIZ, this.isFromNotice, ')', LIZ);
    }

    public NoticeGroupAttrs(LVG clearOccasion, EnumC54302LSw showType, Long l, boolean z) {
        o.LJIIIZ(clearOccasion, "clearOccasion");
        o.LJIIIZ(showType, "showType");
        this.clearOccasion = clearOccasion;
        this.showType = showType;
        this.aliveDuration = l;
        this.isFromNotice = z;
    }

    public /* synthetic */ NoticeGroupAttrs(LVG lvg, EnumC54302LSw enumC54302LSw, Long l, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? LVG.Normal : lvg, (i & 2) != 0 ? EnumC54302LSw.ShowDefault : enumC54302LSw, (i & 4) != 0 ? null : l, (i & 8) != 0 ? true : z);
    }
}
