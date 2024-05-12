package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.X1D;
import defpackage.b0;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class LayoutInfo {
    public final String businessId;
    public final String layoutId;
    public final String layoutType;
    public final int version;

    public static /* synthetic */ LayoutInfo copy$default(LayoutInfo layoutInfo, String str, String str2, String str3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = layoutInfo.businessId;
        }
        if ((i2 & 2) != 0) {
            str2 = layoutInfo.layoutType;
        }
        if ((i2 & 4) != 0) {
            str3 = layoutInfo.layoutId;
        }
        if ((i2 & 8) != 0) {
            i = layoutInfo.version;
        }
        return layoutInfo.copy(str, str2, str3, i);
    }

    public final LayoutInfo copy(String str, String str2, String str3, int i) {
        return new LayoutInfo(str, str2, str3, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LayoutInfo)) {
            return false;
        }
        LayoutInfo layoutInfo = (LayoutInfo) obj;
        return o.LJ(this.businessId, layoutInfo.businessId) && o.LJ(this.layoutType, layoutInfo.layoutType) && o.LJ(this.layoutId, layoutInfo.layoutId) && this.version == layoutInfo.version;
    }

    public int hashCode() {
        String str = this.businessId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.layoutType;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.layoutId;
        return ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.version;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LayoutInfo(businessId=");
        LIZ.append(this.businessId);
        LIZ.append(", layoutType=");
        LIZ.append(this.layoutType);
        LIZ.append(", layoutId=");
        LIZ.append(this.layoutId);
        LIZ.append(", version=");
        return b0.LIZJ(LIZ, this.version, ')', LIZ);
    }

    public final String getBusinessId() {
        return this.businessId;
    }

    public final String getLayoutId() {
        return this.layoutId;
    }

    public final String getLayoutType() {
        return this.layoutType;
    }

    public final int getVersion() {
        return this.version;
    }

    public LayoutInfo(String str, String str2, String str3, int i) {
        this.businessId = str;
        this.layoutType = str2;
        this.layoutId = str3;
        this.version = i;
    }
}
