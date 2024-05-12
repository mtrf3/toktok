package com.ss.android.ugc.aweme.notification.creator.model.response;

import X.C08380Uo;
import X.C279017q;
import X.InterfaceC65349Pkn;
import X.MUG;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class NoticeTabModel implements Parcelable {
    public static final Parcelable.Creator<NoticeTabModel> CREATOR = new MUG();

    @InterfaceC65349Pkn("filter_options")
    public final List<NoticeFilterModel> filterOptionList;

    @InterfaceC65349Pkn("filter_type")
    public final int filterType;

    @InterfaceC65349Pkn("group")
    public final int group;
    public int index;

    @InterfaceC65349Pkn("is_all_tab")
    public final boolean isAllTab;

    @InterfaceC65349Pkn("is_default_landing")
    public final boolean isDefaultLanding;

    @InterfaceC65349Pkn("last_read_time")
    public final int lastReadTime;

    @InterfaceC65349Pkn("need_janus")
    public final boolean needCombineExtraData;

    @InterfaceC65349Pkn("sort_options")
    public final List<NoticeSortModel> sortOptionList;

    @InterfaceC65349Pkn("tab_id")
    public final int tabId;

    @InterfaceC65349Pkn("tab_text")
    public final String tabName;

    @InterfaceC65349Pkn("tracking_text")
    public final String trackingName;

    @InterfaceC65349Pkn("unread_count")
    public final int unReadCount;

    @InterfaceC65349Pkn("wall_time")
    public final int wallTime;

    public static /* synthetic */ NoticeTabModel copy$default(NoticeTabModel noticeTabModel, int i, int i2, String str, int i3, boolean z, boolean z2, List list, List list2, int i4, int i5, String str2, int i6, boolean z3, int i7, int i8, Object obj) {
        int i9 = i;
        int i10 = i2;
        String str3 = str;
        int i11 = i3;
        boolean z4 = z;
        boolean z5 = z2;
        List list3 = list;
        List list4 = list2;
        int i12 = i4;
        int i13 = i5;
        String str4 = str2;
        int i14 = i6;
        boolean z6 = z3;
        int i15 = i7;
        if ((i8 & 1) != 0) {
            i9 = noticeTabModel.tabId;
        }
        if ((i8 & 2) != 0) {
            i10 = noticeTabModel.group;
        }
        if ((i8 & 4) != 0) {
            str3 = noticeTabModel.tabName;
        }
        if ((i8 & 8) != 0) {
            i11 = noticeTabModel.unReadCount;
        }
        if ((i8 & 16) != 0) {
            z4 = noticeTabModel.isAllTab;
        }
        if ((i8 & 32) != 0) {
            z5 = noticeTabModel.isDefaultLanding;
        }
        if ((i8 & 64) != 0) {
            list3 = noticeTabModel.filterOptionList;
        }
        if ((i8 & 128) != 0) {
            list4 = noticeTabModel.sortOptionList;
        }
        if ((i8 & 256) != 0) {
            i12 = noticeTabModel.lastReadTime;
        }
        if ((i8 & 512) != 0) {
            i13 = noticeTabModel.wallTime;
        }
        if ((i8 & 1024) != 0) {
            str4 = noticeTabModel.trackingName;
        }
        if ((i8 & 2048) != 0) {
            i14 = noticeTabModel.filterType;
        }
        if ((i8 & 4096) != 0) {
            z6 = noticeTabModel.needCombineExtraData;
        }
        if ((i8 & FileUtils.BUFFER_SIZE) != 0) {
            i15 = noticeTabModel.index;
        }
        return noticeTabModel.copy(i9, i10, str3, i11, z4, z5, list3, list4, i12, i13, str4, i14, z6, i15);
    }

    public final NoticeTabModel copy(int i, int i2, String str, int i3, boolean z, boolean z2, List<NoticeFilterModel> list, List<NoticeSortModel> list2, int i4, int i5, String str2, int i6, boolean z3, int i7) {
        return new NoticeTabModel(i, i2, str, i3, z, z2, list, list2, i4, i5, str2, i6, z3, i7);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoticeTabModel)) {
            return false;
        }
        NoticeTabModel noticeTabModel = (NoticeTabModel) obj;
        return this.tabId == noticeTabModel.tabId && this.group == noticeTabModel.group && o.LJ(this.tabName, noticeTabModel.tabName) && this.unReadCount == noticeTabModel.unReadCount && this.isAllTab == noticeTabModel.isAllTab && this.isDefaultLanding == noticeTabModel.isDefaultLanding && o.LJ(this.filterOptionList, noticeTabModel.filterOptionList) && o.LJ(this.sortOptionList, noticeTabModel.sortOptionList) && this.lastReadTime == noticeTabModel.lastReadTime && this.wallTime == noticeTabModel.wallTime && o.LJ(this.trackingName, noticeTabModel.trackingName) && this.filterType == noticeTabModel.filterType && this.needCombineExtraData == noticeTabModel.needCombineExtraData && this.index == noticeTabModel.index;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int i = ((this.tabId * 31) + this.group) * 31;
        String str = this.tabName;
        int hashCode = (((i + (str == null ? 0 : str.hashCode())) * 31) + this.unReadCount) * 31;
        boolean z = this.isAllTab;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (hashCode + i2) * 31;
        boolean z2 = this.isDefaultLanding;
        int i4 = z2;
        if (z2 != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        List<NoticeFilterModel> list = this.filterOptionList;
        int hashCode2 = (i5 + (list == null ? 0 : list.hashCode())) * 31;
        List<NoticeSortModel> list2 = this.sortOptionList;
        int hashCode3 = (((((hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31) + this.lastReadTime) * 31) + this.wallTime) * 31;
        String str2 = this.trackingName;
        return ((((((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.filterType) * 31) + (this.needCombineExtraData ? 1 : 0)) * 31) + this.index;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("{tabId = ");
        LIZ.append(this.tabId);
        LIZ.append("} \n{tabName = ");
        LIZ.append(this.tabName);
        LIZ.append("} \n{unReadCount = ");
        LIZ.append(this.unReadCount);
        LIZ.append("} \n{lastReadTime = ");
        LIZ.append(this.lastReadTime);
        LIZ.append("} \n{wallTime = ");
        return C08380Uo.LIZ(LIZ, this.wallTime, "} \n", LIZ);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.tabId);
        out.writeInt(this.group);
        out.writeString(this.tabName);
        out.writeInt(this.unReadCount);
        out.writeInt(this.isAllTab ? 1 : 0);
        out.writeInt(this.isDefaultLanding ? 1 : 0);
        List<NoticeFilterModel> list = this.filterOptionList;
        if (list == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
            while (LIZIZ.hasNext()) {
                ((NoticeFilterModel) LIZIZ.next()).writeToParcel(out, i);
            }
        }
        List<NoticeSortModel> list2 = this.sortOptionList;
        if (list2 == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ2 = C279017q.LIZIZ(out, 1, list2);
            while (LIZIZ2.hasNext()) {
                ((NoticeSortModel) LIZIZ2.next()).writeToParcel(out, i);
            }
        }
        out.writeInt(this.lastReadTime);
        out.writeInt(this.wallTime);
        out.writeString(this.trackingName);
        out.writeInt(this.filterType);
        out.writeInt(this.needCombineExtraData ? 1 : 0);
        out.writeInt(this.index);
    }

    public NoticeTabModel(int i, int i2, String str, int i3, boolean z, boolean z2, List<NoticeFilterModel> list, List<NoticeSortModel> list2, int i4, int i5, String str2, int i6, boolean z3, int i7) {
        this.tabId = i;
        this.group = i2;
        this.tabName = str;
        this.unReadCount = i3;
        this.isAllTab = z;
        this.isDefaultLanding = z2;
        this.filterOptionList = list;
        this.sortOptionList = list2;
        this.lastReadTime = i4;
        this.wallTime = i5;
        this.trackingName = str2;
        this.filterType = i6;
        this.needCombineExtraData = z3;
        this.index = i7;
    }

    public /* synthetic */ NoticeTabModel(int i, int i2, String str, int i3, boolean z, boolean z2, List list, List list2, int i4, int i5, String str2, int i6, boolean z3, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i8 & 4) != 0 ? "" : str, i3, z, z2, list, list2, (i8 & 256) != 0 ? 0 : i4, (i8 & 512) != 0 ? 0 : i5, (i8 & 1024) != 0 ? null : str2, (i8 & 2048) != 0 ? 0 : i6, z3, i7);
    }
}
