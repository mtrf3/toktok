package com.ss.android.ugc.now.interaction;

import X.InterfaceC65349Pkn;
import X.InterfaceC87283bg;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NowFeedMobHierarchyData implements InterfaceC87283bg, Serializable {

    @InterfaceC65349Pkn("enter_from")
    public final String enterFrom;

    @InterfaceC65349Pkn("enter_position")
    public final String enterPosition;

    @InterfaceC65349Pkn("is_blue_v_user")
    public final int isBlueVUser;

    @InterfaceC65349Pkn("is_new_page")
    public final int isNewPage;

    @InterfaceC65349Pkn("is_now_clear")
    public Integer isNowClear;

    @InterfaceC65349Pkn("now_feed_type")
    public final Integer nowFeedType;

    @InterfaceC65349Pkn("now_scene")
    public final String nowScene;

    @InterfaceC65349Pkn("now_tab_enter_method")
    public final String nowTabEnterMethod;

    @InterfaceC65349Pkn("previous_page")
    public final String previousPage;

    public static /* synthetic */ NowFeedMobHierarchyData copy$default(NowFeedMobHierarchyData nowFeedMobHierarchyData, String str, int i, String str2, Integer num, Integer num2, int i2, String str3, String str4, String str5, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = nowFeedMobHierarchyData.enterFrom;
        }
        if ((i3 & 2) != 0) {
            i = nowFeedMobHierarchyData.isBlueVUser;
        }
        if ((i3 & 4) != 0) {
            str2 = nowFeedMobHierarchyData.enterPosition;
        }
        if ((i3 & 8) != 0) {
            num = nowFeedMobHierarchyData.isNowClear;
        }
        if ((i3 & 16) != 0) {
            num2 = nowFeedMobHierarchyData.nowFeedType;
        }
        if ((i3 & 32) != 0) {
            i2 = nowFeedMobHierarchyData.isNewPage;
        }
        if ((i3 & 64) != 0) {
            str3 = nowFeedMobHierarchyData.previousPage;
        }
        if ((i3 & 128) != 0) {
            str4 = nowFeedMobHierarchyData.nowTabEnterMethod;
        }
        if ((i3 & 256) != 0) {
            str5 = nowFeedMobHierarchyData.nowScene;
        }
        return nowFeedMobHierarchyData.copy(str, i, str2, num, num2, i2, str3, str4, str5);
    }

    public final NowFeedMobHierarchyData copy(String enterFrom, int i, String str, Integer num, Integer num2, int i2, String str2, String str3, String str4) {
        o.LJIIIZ(enterFrom, "enterFrom");
        return new NowFeedMobHierarchyData(enterFrom, i, str, num, num2, i2, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NowFeedMobHierarchyData)) {
            return false;
        }
        NowFeedMobHierarchyData nowFeedMobHierarchyData = (NowFeedMobHierarchyData) obj;
        return o.LJ(this.enterFrom, nowFeedMobHierarchyData.enterFrom) && this.isBlueVUser == nowFeedMobHierarchyData.isBlueVUser && o.LJ(this.enterPosition, nowFeedMobHierarchyData.enterPosition) && o.LJ(this.isNowClear, nowFeedMobHierarchyData.isNowClear) && o.LJ(this.nowFeedType, nowFeedMobHierarchyData.nowFeedType) && this.isNewPage == nowFeedMobHierarchyData.isNewPage && o.LJ(this.previousPage, nowFeedMobHierarchyData.previousPage) && o.LJ(this.nowTabEnterMethod, nowFeedMobHierarchyData.nowTabEnterMethod) && o.LJ(this.nowScene, nowFeedMobHierarchyData.nowScene);
    }

    public int hashCode() {
        int hashCode = ((this.enterFrom.hashCode() * 31) + this.isBlueVUser) * 31;
        String str = this.enterPosition;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.isNowClear;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.nowFeedType;
        int hashCode4 = (((hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31) + this.isNewPage) * 31;
        String str2 = this.previousPage;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.nowTabEnterMethod;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.nowScene;
        return hashCode6 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NowFeedMobHierarchyData(enterFrom=");
        LIZ.append(this.enterFrom);
        LIZ.append(", isBlueVUser=");
        LIZ.append(this.isBlueVUser);
        LIZ.append(", enterPosition=");
        LIZ.append(this.enterPosition);
        LIZ.append(", isNowClear=");
        LIZ.append(this.isNowClear);
        LIZ.append(", nowFeedType=");
        LIZ.append(this.nowFeedType);
        LIZ.append(", isNewPage=");
        LIZ.append(this.isNewPage);
        LIZ.append(", previousPage=");
        LIZ.append(this.previousPage);
        LIZ.append(", nowTabEnterMethod=");
        LIZ.append(this.nowTabEnterMethod);
        LIZ.append(", nowScene=");
        return q.LIZIZ(LIZ, this.nowScene, ')', LIZ);
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getEnterPosition() {
        return this.enterPosition;
    }

    public final Integer getNowFeedType() {
        return this.nowFeedType;
    }

    public final String getNowScene() {
        return this.nowScene;
    }

    public final String getNowTabEnterMethod() {
        return this.nowTabEnterMethod;
    }

    public final String getPreviousPage() {
        return this.previousPage;
    }

    public final int isBlueVUser() {
        return this.isBlueVUser;
    }

    public final int isNewPage() {
        return this.isNewPage;
    }

    public final Integer isNowClear() {
        return this.isNowClear;
    }

    public final void setNowClear(Integer num) {
        this.isNowClear = num;
    }

    public NowFeedMobHierarchyData(String enterFrom, int i, String str, Integer num, Integer num2, int i2, String str2, String str3, String str4) {
        o.LJIIIZ(enterFrom, "enterFrom");
        this.enterFrom = enterFrom;
        this.isBlueVUser = i;
        this.enterPosition = str;
        this.isNowClear = num;
        this.nowFeedType = num2;
        this.isNewPage = i2;
        this.previousPage = str2;
        this.nowTabEnterMethod = str3;
        this.nowScene = str4;
    }

    public /* synthetic */ NowFeedMobHierarchyData(String str, int i, String str2, Integer num, Integer num2, int i2, String str3, String str4, String str5, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? "" : str2, (i3 & 8) != 0 ? 1 : num, num2, (i3 & 32) != 0 ? 0 : i2, (i3 & 64) != 0 ? null : str3, (i3 & 128) != 0 ? null : str4, (i3 & 256) == 0 ? str5 : null);
    }
}
