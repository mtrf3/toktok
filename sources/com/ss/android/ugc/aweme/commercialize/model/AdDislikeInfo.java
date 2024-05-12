package com.ss.android.ugc.aweme.commercialize.model;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class AdDislikeInfo implements Serializable {

    @InterfaceC65349Pkn("sub_categories")
    public final List<AdDislikeReasonModel> categoryList;

    @InterfaceC65349Pkn("enable_sub_category")
    public final int enable;

    /* JADX WARN: Multi-variable type inference failed */
    public AdDislikeInfo() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AdDislikeInfo copy$default(AdDislikeInfo adDislikeInfo, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = adDislikeInfo.enable;
        }
        if ((i2 & 2) != 0) {
            list = adDislikeInfo.categoryList;
        }
        return adDislikeInfo.copy(i, list);
    }

    public final AdDislikeInfo copy(int i, List<AdDislikeReasonModel> list) {
        return new AdDislikeInfo(i, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdDislikeInfo)) {
            return false;
        }
        AdDislikeInfo adDislikeInfo = (AdDislikeInfo) obj;
        return this.enable == adDislikeInfo.enable && o.LJ(this.categoryList, adDislikeInfo.categoryList);
    }

    public int hashCode() {
        int i = this.enable * 31;
        List<AdDislikeReasonModel> list = this.categoryList;
        return i + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AdDislikeInfo(enable=");
        LIZ.append(this.enable);
        LIZ.append(", categoryList=");
        return C1NE.LIZIZ(LIZ, this.categoryList, ')', LIZ);
    }

    public final List<AdDislikeReasonModel> getCategoryList() {
        return this.categoryList;
    }

    public final int getEnable() {
        return this.enable;
    }

    public AdDislikeInfo(int i, List<AdDislikeReasonModel> list) {
        this.enable = i;
        this.categoryList = list;
    }

    public /* synthetic */ AdDislikeInfo(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : list);
    }
}
