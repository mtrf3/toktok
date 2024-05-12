package com.ss.android.ugc.aweme.inbox.widget.multi;

import X.AbstractC56676MMe;
import X.C3ML;
import X.C56695MMx;
import X.C61878OQg;
import X.EnumC56696MMy;
import X.IRL;
import X.InterfaceC65349Pkn;
import X.MN2;
import android.graphics.drawable.Drawable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class ActivityPod extends AbstractC56676MMe {
    public final transient Drawable LJLIL;

    @InterfaceC65349Pkn("cache_time")
    public final long cacheTime;

    @InterfaceC65349Pkn("create_time")
    public final long createTime;

    @InterfaceC65349Pkn("data_type")
    public final EnumC56696MMy dataType;

    @InterfaceC65349Pkn("extra")
    public final String extra;

    @InterfaceC65349Pkn("new_notice_content")
    public final String newNoticeContent;

    @InterfaceC65349Pkn("new_notice_time")
    public final String newNoticeTime;

    @InterfaceC65349Pkn("read_point")
    public final RedPoint readPoint;

    @InterfaceC65349Pkn("show_arrow")
    public boolean showArrow;

    @InterfaceC65349Pkn("small_avatar_url")
    public final ActivityIcon smallAvatarUrl;

    @InterfaceC65349Pkn("title")
    public final List<String> title;

    public final String toString() {
        return "ActivityPod(dataType=" + this.dataType + ", title=" + this.title + ", smallAvatarUrl=" + this.smallAvatarUrl + ", newNoticeContent=" + this.newNoticeContent + ", readPoint=" + this.readPoint + ", newNoticeTime=" + this.newNoticeTime + ", showArrow=" + this.showArrow + ", cacheTime=" + this.cacheTime + ", extra=" + this.extra + ", iconDrawable=" + this.LJLIL + ", createTime=" + this.createTime + ')';
    }

    @Override // X.AbstractC56676MMe
    public final C3ML convertToInboxEntranceWrapper$awemenotice_release() {
        return new C3ML(getPriority$awemenotice_release(), this.createTime, this.type, isUnread(), this);
    }

    @Override // X.AbstractC56676MMe
    public final int getPriority$awemenotice_release() {
        int i = C56695MMx.LIZ[this.dataType.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return 100;
            }
        } else if (!IRL.LIZ()) {
            return 200;
        }
        return 0;
    }

    @Override // X.AbstractC56676MMe
    public final boolean isUnread() {
        if (this.readPoint.unreadCount > 0) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC56676MMe
    public final int hashCode() {
        int i;
        int hashCode = this.newNoticeContent.hashCode() + this.dataType.hashCode() + super.hashCode();
        ActivityIcon activityIcon = this.smallAvatarUrl;
        if (activityIcon != null) {
            i = activityIcon.hashCode();
        } else {
            i = 0;
        }
        return this.readPoint.hashCode() + hashCode + i;
    }

    @Override // X.AbstractC56676MMe
    public final long getLastNoticeTime$awemenotice_release() {
        return this.createTime;
    }

    @Override // X.AbstractC56676MMe
    public final boolean equals(Object obj) {
        if (super.equals(obj) && (obj instanceof ActivityPod)) {
            ActivityPod activityPod = (ActivityPod) obj;
            if (this.dataType == activityPod.dataType && o.LJ(this.newNoticeContent, activityPod.newNoticeContent) && o.LJ(this.smallAvatarUrl, activityPod.smallAvatarUrl) && o.LJ(this.readPoint, activityPod.readPoint) && o.LJ(this.newNoticeTime, activityPod.newNoticeTime)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.AbstractC56676MMe
    public final boolean isSameItem(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof ActivityPod) && this.dataType == ((ActivityPod) obj).dataType) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityPod(EnumC56696MMy dataType, List<String> title, ActivityIcon activityIcon, String newNoticeContent, RedPoint readPoint, String newNoticeTime, boolean z, long j, String extra, Drawable drawable, long j2) {
        super(0);
        o.LJIIIZ(dataType, "dataType");
        o.LJIIIZ(title, "title");
        o.LJIIIZ(newNoticeContent, "newNoticeContent");
        o.LJIIIZ(readPoint, "readPoint");
        o.LJIIIZ(newNoticeTime, "newNoticeTime");
        o.LJIIIZ(extra, "extra");
        this.dataType = dataType;
        this.title = title;
        this.smallAvatarUrl = activityIcon;
        this.newNoticeContent = newNoticeContent;
        this.readPoint = readPoint;
        this.newNoticeTime = newNoticeTime;
        this.showArrow = z;
        this.cacheTime = j;
        this.extra = extra;
        this.LJLIL = drawable;
        this.createTime = j2;
    }

    public ActivityPod(EnumC56696MMy enumC56696MMy, List list, ActivityIcon activityIcon, String str, RedPoint redPoint, String str2, boolean z, long j, String str3, Drawable drawable, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC56696MMy, (i & 2) != 0 ? C61878OQg.INSTANCE : list, (i & 4) != 0 ? null : activityIcon, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? new RedPoint(MN2.NONE, 0, 2, null) : redPoint, (i & 32) != 0 ? "" : str2, (i & 64) == 0 ? z : false, (i & 128) != 0 ? System.currentTimeMillis() : j, (i & 256) == 0 ? str3 : "", (i & 512) == 0 ? drawable : null, (i & 1024) != 0 ? 0L : j2);
    }
}
