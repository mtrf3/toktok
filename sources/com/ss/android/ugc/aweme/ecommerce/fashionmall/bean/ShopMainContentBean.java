package com.ss.android.ugc.aweme.ecommerce.fashionmall.bean;

import X.C48339Iy7;
import X.C56020Lyi;
import X.C79062V1e;
import X.EnumC56002LyQ;
import X.EnumC56059LzL;
import X.X1D;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class ShopMainContentBean {
    public EnumC56059LzL dataFrom;
    public boolean isDataFromCache;
    public boolean itemHasLoaded;
    public String logId;
    public String lynxData;
    public RecyclerView recyclerView;
    public String tabId;
    public C56020Lyi viewHierarchyData;
    public EnumC56002LyQ viewType;

    public static /* synthetic */ ShopMainContentBean copy$default(ShopMainContentBean shopMainContentBean, EnumC56002LyQ enumC56002LyQ, boolean z, String str, String str2, EnumC56059LzL enumC56059LzL, RecyclerView recyclerView, String str3, C56020Lyi c56020Lyi, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            enumC56002LyQ = shopMainContentBean.viewType;
        }
        if ((i & 2) != 0) {
            z = shopMainContentBean.itemHasLoaded;
        }
        if ((i & 4) != 0) {
            str = shopMainContentBean.tabId;
        }
        if ((i & 8) != 0) {
            str2 = shopMainContentBean.lynxData;
        }
        if ((i & 16) != 0) {
            enumC56059LzL = shopMainContentBean.dataFrom;
        }
        if ((i & 32) != 0) {
            recyclerView = shopMainContentBean.recyclerView;
        }
        if ((i & 64) != 0) {
            str3 = shopMainContentBean.logId;
        }
        if ((i & 128) != 0) {
            c56020Lyi = shopMainContentBean.viewHierarchyData;
        }
        if ((i & 256) != 0) {
            z2 = shopMainContentBean.isDataFromCache;
        }
        return shopMainContentBean.copy(enumC56002LyQ, z, str, str2, enumC56059LzL, recyclerView, str3, c56020Lyi, z2);
    }

    public final ShopMainContentBean copy(EnumC56002LyQ viewType, boolean z, String tabId, String str, EnumC56059LzL dataFrom, RecyclerView recyclerView, String logId, C56020Lyi c56020Lyi, boolean z2) {
        o.LJIIIZ(viewType, "viewType");
        o.LJIIIZ(tabId, "tabId");
        o.LJIIIZ(dataFrom, "dataFrom");
        o.LJIIIZ(logId, "logId");
        return new ShopMainContentBean(viewType, z, tabId, str, dataFrom, recyclerView, logId, c56020Lyi, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopMainContentBean)) {
            return false;
        }
        ShopMainContentBean shopMainContentBean = (ShopMainContentBean) obj;
        return this.viewType == shopMainContentBean.viewType && this.itemHasLoaded == shopMainContentBean.itemHasLoaded && o.LJ(this.tabId, shopMainContentBean.tabId) && o.LJ(this.lynxData, shopMainContentBean.lynxData) && this.dataFrom == shopMainContentBean.dataFrom && o.LJ(this.recyclerView, shopMainContentBean.recyclerView) && o.LJ(this.logId, shopMainContentBean.logId) && o.LJ(this.viewHierarchyData, shopMainContentBean.viewHierarchyData) && this.isDataFromCache == shopMainContentBean.isDataFromCache;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.viewType.hashCode() * 31;
        boolean z = this.itemHasLoaded;
        int i = 1;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int LJ = C79062V1e.LJ(this.tabId, (hashCode3 + i2) * 31, 31);
        String str = this.lynxData;
        int i3 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode4 = (this.dataFrom.hashCode() + ((LJ + hashCode) * 31)) * 31;
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = recyclerView.hashCode();
        }
        int LJ2 = C79062V1e.LJ(this.logId, (hashCode4 + hashCode2) * 31, 31);
        C56020Lyi c56020Lyi = this.viewHierarchyData;
        if (c56020Lyi != null) {
            i3 = c56020Lyi.hashCode();
        }
        int i4 = (LJ2 + i3) * 31;
        if (!this.isDataFromCache) {
            i = 0;
        }
        return i4 + i;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShopMainContentBean(viewType=");
        LIZ.append(this.viewType);
        LIZ.append(", itemHasLoaded=");
        LIZ.append(this.itemHasLoaded);
        LIZ.append(", tabId=");
        LIZ.append(this.tabId);
        LIZ.append(", lynxData=");
        LIZ.append(this.lynxData);
        LIZ.append(", dataFrom=");
        LIZ.append(this.dataFrom);
        LIZ.append(", recyclerView=");
        LIZ.append(this.recyclerView);
        LIZ.append(", logId=");
        LIZ.append(this.logId);
        LIZ.append(", viewHierarchyData=");
        LIZ.append(this.viewHierarchyData);
        LIZ.append(", isDataFromCache=");
        return C48339Iy7.LIZJ(LIZ, this.isDataFromCache, ')', LIZ);
    }

    public final EnumC56059LzL getDataFrom() {
        return this.dataFrom;
    }

    public final boolean getItemHasLoaded() {
        return this.itemHasLoaded;
    }

    public final String getLogId() {
        return this.logId;
    }

    public final String getLynxData() {
        return this.lynxData;
    }

    public final RecyclerView getRecyclerView() {
        return this.recyclerView;
    }

    public final String getTabId() {
        return this.tabId;
    }

    public final C56020Lyi getViewHierarchyData() {
        return this.viewHierarchyData;
    }

    public final EnumC56002LyQ getViewType() {
        return this.viewType;
    }

    public final boolean isDataFromCache() {
        return this.isDataFromCache;
    }

    public final void setDataFrom(EnumC56059LzL enumC56059LzL) {
        o.LJIIIZ(enumC56059LzL, "<set-?>");
        this.dataFrom = enumC56059LzL;
    }

    public final void setDataFromCache(boolean z) {
        this.isDataFromCache = z;
    }

    public final void setItemHasLoaded(boolean z) {
        this.itemHasLoaded = z;
    }

    public final void setLogId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.logId = str;
    }

    public final void setLynxData(String str) {
        this.lynxData = str;
    }

    public final void setRecyclerView(RecyclerView recyclerView) {
        this.recyclerView = recyclerView;
    }

    public final void setTabId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.tabId = str;
    }

    public final void setViewHierarchyData(C56020Lyi c56020Lyi) {
        this.viewHierarchyData = c56020Lyi;
    }

    public final void setViewType(EnumC56002LyQ enumC56002LyQ) {
        o.LJIIIZ(enumC56002LyQ, "<set-?>");
        this.viewType = enumC56002LyQ;
    }

    public ShopMainContentBean(EnumC56002LyQ viewType, boolean z, String tabId, String str, EnumC56059LzL dataFrom, RecyclerView recyclerView, String logId, C56020Lyi c56020Lyi, boolean z2) {
        o.LJIIIZ(viewType, "viewType");
        o.LJIIIZ(tabId, "tabId");
        o.LJIIIZ(dataFrom, "dataFrom");
        o.LJIIIZ(logId, "logId");
        this.viewType = viewType;
        this.itemHasLoaded = z;
        this.tabId = tabId;
        this.lynxData = str;
        this.dataFrom = dataFrom;
        this.recyclerView = recyclerView;
        this.logId = logId;
        this.viewHierarchyData = c56020Lyi;
        this.isDataFromCache = z2;
    }

    public /* synthetic */ ShopMainContentBean(EnumC56002LyQ enumC56002LyQ, boolean z, String str, String str2, EnumC56059LzL enumC56059LzL, RecyclerView recyclerView, String str3, C56020Lyi c56020Lyi, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC56002LyQ, (i & 2) != 0 ? false : z, (i & 4) != 0 ? CardStruct.IStatusCode.DEFAULT : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? EnumC56059LzL.PREFETCH : enumC56059LzL, (i & 32) != 0 ? null : recyclerView, (i & 64) != 0 ? "" : str3, (i & 128) == 0 ? c56020Lyi : null, (i & 256) == 0 ? z2 : false);
    }
}
