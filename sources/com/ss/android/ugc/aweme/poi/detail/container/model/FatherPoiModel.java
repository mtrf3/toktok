package com.ss.android.ugc.aweme.poi.detail.container.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class FatherPoiModel implements Serializable {

    @InterfaceC65349Pkn("id")
    public final String id;

    @InterfaceC65349Pkn("keyword")
    public final String keyword;

    @InterfaceC65349Pkn("schema")
    public final String schema;

    public static /* synthetic */ FatherPoiModel copy$default(FatherPoiModel fatherPoiModel, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fatherPoiModel.keyword;
        }
        if ((i & 2) != 0) {
            str2 = fatherPoiModel.schema;
        }
        if ((i & 4) != 0) {
            str3 = fatherPoiModel.id;
        }
        return fatherPoiModel.copy(str, str2, str3);
    }

    public final FatherPoiModel copy(String str, String str2, String str3) {
        return new FatherPoiModel(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FatherPoiModel)) {
            return false;
        }
        FatherPoiModel fatherPoiModel = (FatherPoiModel) obj;
        return o.LJ(this.keyword, fatherPoiModel.keyword) && o.LJ(this.schema, fatherPoiModel.schema) && o.LJ(this.id, fatherPoiModel.id);
    }

    public int hashCode() {
        String str = this.keyword;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.schema;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.id;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FatherPoiModel(keyword=");
        LIZ.append(this.keyword);
        LIZ.append(", schema=");
        LIZ.append(this.schema);
        LIZ.append(", id=");
        return q.LIZIZ(LIZ, this.id, ')', LIZ);
    }

    public final String getId() {
        return this.id;
    }

    public final String getKeyword() {
        return this.keyword;
    }

    public final String getSchema() {
        return this.schema;
    }

    public FatherPoiModel(String str, String str2, String str3) {
        this.keyword = str;
        this.schema = str2;
        this.id = str3;
    }
}
