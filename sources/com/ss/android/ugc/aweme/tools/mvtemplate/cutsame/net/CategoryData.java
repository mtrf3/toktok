package com.ss.android.ugc.aweme.tools.mvtemplate.cutsame.net;

import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class CategoryData {

    @InterfaceC65349Pkn("app_id")
    public final int appId;

    @InterfaceC65349Pkn("category_id")
    public final long categoryId;

    @InterfaceC65349Pkn("data_infos")
    public final DataListInfo dataInfos;

    @InterfaceC65349Pkn("icon_uri")
    public final String iconUri;

    @InterfaceC65349Pkn("name")
    public final String name;

    @InterfaceC65349Pkn("region_key")
    public final String regionKey;

    /* JADX WARN: Multi-variable type inference failed */
    public CategoryData() {
        this(0, null, 0L, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CategoryData)) {
            return false;
        }
        CategoryData categoryData = (CategoryData) obj;
        return this.appId == categoryData.appId && o.LJ(this.regionKey, categoryData.regionKey) && this.categoryId == categoryData.categoryId && o.LJ(this.name, categoryData.name) && o.LJ(this.iconUri, categoryData.iconUri) && o.LJ(this.dataInfos, categoryData.dataInfos);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CategoryData(appId=");
        LIZ.append(this.appId);
        LIZ.append(", regionKey=");
        LIZ.append(this.regionKey);
        LIZ.append(", categoryId=");
        LIZ.append(this.categoryId);
        LIZ.append(", name=");
        LIZ.append(this.name);
        LIZ.append(", iconUri=");
        LIZ.append(this.iconUri);
        LIZ.append(", dataInfos=");
        LIZ.append(this.dataInfos);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i = this.appId * 31;
        String str = this.regionKey;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int LIZJ = JBR.LIZJ(this.categoryId, (i + hashCode) * 31, 31);
        String str2 = this.name;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (LIZJ + hashCode2) * 31;
        String str3 = this.iconUri;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        DataListInfo dataListInfo = this.dataInfos;
        if (dataListInfo != null) {
            i2 = dataListInfo.hashCode();
        }
        return i4 + i2;
    }

    public CategoryData(int i, String str, long j, String str2, String str3, DataListInfo dataListInfo) {
        this.appId = i;
        this.regionKey = str;
        this.categoryId = j;
        this.name = str2;
        this.iconUri = str3;
        this.dataInfos = dataListInfo;
    }

    public /* synthetic */ CategoryData(int i, String str, long j, String str2, String str3, DataListInfo dataListInfo, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? 0L : j, (i2 & 8) != 0 ? "" : str2, (i2 & 16) == 0 ? str3 : "", (i2 & 32) != 0 ? null : dataListInfo);
    }
}
