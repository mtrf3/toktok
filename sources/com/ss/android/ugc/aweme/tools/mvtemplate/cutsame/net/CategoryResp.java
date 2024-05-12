package com.ss.android.ugc.aweme.tools.mvtemplate.cutsame.net;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class CategoryResp extends BaseUgcResp {

    @InterfaceC65349Pkn("data")
    public final CategoryData data;

    /* JADX WARN: Multi-variable type inference failed */
    public CategoryResp() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CategoryResp) && o.LJ(this.data, ((CategoryResp) obj).data);
    }

    public final int hashCode() {
        CategoryData categoryData = this.data;
        if (categoryData == null) {
            return 0;
        }
        return categoryData.hashCode();
    }

    @Override // com.ss.android.ugc.effectmanager.common.model.BaseNetResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CategoryResp data = ");
        LIZ.append(this.data);
        LIZ.append(", status_code = ");
        LIZ.append(this.status_code);
        LIZ.append(", msg = ");
        LIZ.append(this.message);
        LIZ.append(", log_id = ");
        LIZ.append(this.logId);
        return X1D.LIZIZ(LIZ);
    }

    public CategoryResp(CategoryData categoryData) {
        this.data = categoryData;
    }

    public /* synthetic */ CategoryResp(CategoryData categoryData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : categoryData);
    }
}
