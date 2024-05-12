package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C279017q;
import X.InterfaceC65349Pkn;
import X.RVT;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RecommendInfo implements Parcelable {
    public static final Parcelable.Creator<RecommendInfo> CREATOR = new RVT();

    @InterfaceC65349Pkn("full_vap_schema")
    public String fullVapSchema;

    @InterfaceC65349Pkn("recommend_extra")
    public final Map<String, String> recommendExtra;

    @InterfaceC65349Pkn("recommend_products")
    public final List<ProductBase> recommendProducts;

    @InterfaceC65349Pkn("recommend_title")
    public final String recommendTitle;

    @InterfaceC65349Pkn("vap_schema")
    public String vapSchema;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendInfo)) {
            return false;
        }
        RecommendInfo recommendInfo = (RecommendInfo) obj;
        return o.LJ(this.recommendProducts, recommendInfo.recommendProducts) && o.LJ(this.recommendTitle, recommendInfo.recommendTitle) && o.LJ(this.recommendExtra, recommendInfo.recommendExtra) && o.LJ(this.fullVapSchema, recommendInfo.fullVapSchema) && o.LJ(this.vapSchema, recommendInfo.vapSchema);
    }

    public final int hashCode() {
        List<ProductBase> list = this.recommendProducts;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.recommendTitle;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, String> map = this.recommendExtra;
        int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        String str2 = this.fullVapSchema;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.vapSchema;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RecommendInfo(recommendProducts=");
        LIZ.append(this.recommendProducts);
        LIZ.append(", recommendTitle=");
        LIZ.append(this.recommendTitle);
        LIZ.append(", recommendExtra=");
        LIZ.append(this.recommendExtra);
        LIZ.append(", fullVapSchema=");
        LIZ.append(this.fullVapSchema);
        LIZ.append(", vapSchema=");
        return q.LIZIZ(LIZ, this.vapSchema, ')', LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        List<ProductBase> list = this.recommendProducts;
        if (list == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
            while (LIZIZ.hasNext()) {
                ((ProductBase) LIZIZ.next()).writeToParcel(out, i);
            }
        }
        out.writeString(this.recommendTitle);
        Map<String, String> map = this.recommendExtra;
        if (map == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                out.writeString(entry.getKey());
                out.writeString(entry.getValue());
            }
        }
        out.writeString(this.fullVapSchema);
        out.writeString(this.vapSchema);
    }

    public RecommendInfo(List<ProductBase> list, String str, Map<String, String> map, String str2, String str3) {
        this.recommendProducts = list;
        this.recommendTitle = str;
        this.recommendExtra = map;
        this.fullVapSchema = str2;
        this.vapSchema = str3;
    }
}
