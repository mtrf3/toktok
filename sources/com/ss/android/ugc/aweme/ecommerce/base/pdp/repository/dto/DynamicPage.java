package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C1FJ;
import X.C279017q;
import X.InterfaceC65349Pkn;
import X.RXB;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class DynamicPage implements Parcelable {
    public static final Parcelable.Creator<DynamicPage> CREATOR = new RXB();

    @InterfaceC65349Pkn("bottom_navigation")
    public final BottomNavigation bottomNav;

    @InterfaceC65349Pkn("bricks")
    public final List<BrickInfo> bricks;

    @InterfaceC65349Pkn("common_data")
    public final CommonData commonData;

    @InterfaceC65349Pkn("header_navigation")
    public final HeaderNavigation headerNav;

    @InterfaceC65349Pkn("page_name")
    public final Integer pageName;

    @InterfaceC65349Pkn("tabs")
    public final List<Tab> tabs;

    @InterfaceC65349Pkn("version")
    public final String version;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DynamicPage)) {
            return false;
        }
        DynamicPage dynamicPage = (DynamicPage) obj;
        return o.LJ(this.version, dynamicPage.version) && o.LJ(this.bricks, dynamicPage.bricks) && o.LJ(this.pageName, dynamicPage.pageName) && o.LJ(this.tabs, dynamicPage.tabs) && o.LJ(this.commonData, dynamicPage.commonData) && o.LJ(this.headerNav, dynamicPage.headerNav) && o.LJ(this.bottomNav, dynamicPage.bottomNav);
    }

    public final int hashCode() {
        String str = this.version;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<BrickInfo> list = this.bricks;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.pageName;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        List<Tab> list2 = this.tabs;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        CommonData commonData = this.commonData;
        int hashCode5 = (hashCode4 + (commonData == null ? 0 : commonData.hashCode())) * 31;
        HeaderNavigation headerNavigation = this.headerNav;
        int hashCode6 = (hashCode5 + (headerNavigation == null ? 0 : headerNavigation.hashCode())) * 31;
        BottomNavigation bottomNavigation = this.bottomNav;
        return hashCode6 + (bottomNavigation != null ? bottomNavigation.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DynamicPage(version=");
        LIZ.append(this.version);
        LIZ.append(", bricks=");
        LIZ.append(this.bricks);
        LIZ.append(", pageName=");
        LIZ.append(this.pageName);
        LIZ.append(", tabs=");
        LIZ.append(this.tabs);
        LIZ.append(", commonData=");
        LIZ.append(this.commonData);
        LIZ.append(", headerNav=");
        LIZ.append(this.headerNav);
        LIZ.append(", bottomNav=");
        LIZ.append(this.bottomNav);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.version);
        List<BrickInfo> list = this.bricks;
        if (list == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
            while (LIZIZ.hasNext()) {
                ((BrickInfo) LIZIZ.next()).writeToParcel(out, i);
            }
        }
        Integer num = this.pageName;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        List<Tab> list2 = this.tabs;
        if (list2 == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ2 = C279017q.LIZIZ(out, 1, list2);
            while (LIZIZ2.hasNext()) {
                ((Tab) LIZIZ2.next()).writeToParcel(out, i);
            }
        }
        CommonData commonData = this.commonData;
        if (commonData == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            commonData.writeToParcel(out, i);
        }
        HeaderNavigation headerNavigation = this.headerNav;
        if (headerNavigation == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            headerNavigation.writeToParcel(out, i);
        }
        BottomNavigation bottomNavigation = this.bottomNav;
        if (bottomNavigation == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            bottomNavigation.writeToParcel(out, i);
        }
    }

    public DynamicPage(String str, List<BrickInfo> list, Integer num, List<Tab> list2, CommonData commonData, HeaderNavigation headerNavigation, BottomNavigation bottomNavigation) {
        this.version = str;
        this.bricks = list;
        this.pageName = num;
        this.tabs = list2;
        this.commonData = commonData;
        this.headerNav = headerNavigation;
        this.bottomNav = bottomNavigation;
    }

    public /* synthetic */ DynamicPage(String str, List list, Integer num, List list2, CommonData commonData, HeaderNavigation headerNavigation, BottomNavigation bottomNavigation, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, num, list2, (i & 16) != 0 ? null : commonData, (i & 32) != 0 ? null : headerNavigation, (i & 64) == 0 ? bottomNavigation : null);
    }
}
