package com.ss.android.ugc.aweme.inbox.widget.multi;

import X.AbstractC56676MMe;
import X.C3ML;
import X.C47135Ieh;
import X.EnumC56697MMz;
import X.InterfaceC65349Pkn;
import X.MN2;
import X.X1D;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class ActivityNoticePod extends AbstractC56676MMe {

    @InterfaceC65349Pkn("cache_time")
    public final long cacheTime;

    @InterfaceC65349Pkn("icon")
    public final ActivityIcon icon;

    @InterfaceC65349Pkn("notice_list")
    public final List<MusNotice> noticeList;

    @InterfaceC65349Pkn("red_point")
    public final RedPoint redPoint;

    @InterfaceC65349Pkn("see_more_type")
    public final EnumC56697MMz seeMoreType;

    /* JADX WARN: Multi-variable type inference failed */
    public ActivityNoticePod() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0L, 31, 0 == true ? 1 : 0);
    }

    @Override // X.AbstractC56676MMe
    public final boolean isUnread() {
        return false;
    }

    @Override // X.AbstractC56676MMe
    public final C3ML convertToInboxEntranceWrapper$awemenotice_release() {
        return new C3ML(LiveChatShowDelayForHotLiveSetting.DEFAULT, 0L, this.type, false, this);
    }

    @Override // X.AbstractC56676MMe
    public final int hashCode() {
        int i;
        int hashCode = this.seeMoreType.hashCode() + this.redPoint.hashCode() + super.hashCode();
        ActivityIcon activityIcon = this.icon;
        if (activityIcon != null) {
            i = activityIcon.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ActivityNoticePod(noticeList=");
        LIZ.append(this.noticeList);
        LIZ.append(", redPoint=");
        LIZ.append(this.redPoint);
        LIZ.append(", seeMoreType=");
        LIZ.append(this.seeMoreType);
        LIZ.append(", icon=");
        LIZ.append(this.icon);
        LIZ.append(", cacheTime=");
        return C47135Ieh.LIZIZ(LIZ, this.cacheTime, ')', LIZ);
    }

    @Override // X.AbstractC56676MMe
    public final boolean equals(Object obj) {
        if (super.equals(obj) && (obj instanceof ActivityNoticePod)) {
            ActivityNoticePod activityNoticePod = (ActivityNoticePod) obj;
            if (o.LJ(this.redPoint, activityNoticePod.redPoint) && this.seeMoreType == activityNoticePod.seeMoreType && o.LJ(this.icon, activityNoticePod.icon) && o.LJ(this.noticeList, activityNoticePod.noticeList)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ActivityNoticePod(List<? extends MusNotice> list, RedPoint redPoint, EnumC56697MMz seeMoreType, ActivityIcon activityIcon, long j) {
        super(20);
        o.LJIIIZ(redPoint, "redPoint");
        o.LJIIIZ(seeMoreType, "seeMoreType");
        this.noticeList = list;
        this.redPoint = redPoint;
        this.seeMoreType = seeMoreType;
        this.icon = activityIcon;
        this.cacheTime = j;
    }

    public /* synthetic */ ActivityNoticePod(List list, RedPoint redPoint, EnumC56697MMz enumC56697MMz, ActivityIcon activityIcon, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? new RedPoint(MN2.NONE, 0, 2, null) : redPoint, (i & 4) != 0 ? EnumC56697MMz.NONE : enumC56697MMz, (i & 8) == 0 ? activityIcon : null, (i & 16) != 0 ? System.currentTimeMillis() : j);
    }
}
