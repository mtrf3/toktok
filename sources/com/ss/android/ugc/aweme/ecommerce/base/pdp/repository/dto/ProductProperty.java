package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C1NE;
import X.C26724AeG;
import X.C279017q;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ProductProperty implements Parcelable {
    public static final Parcelable.Creator<ProductProperty> CREATOR = new C26724AeG();

    @InterfaceC65349Pkn("items")
    public final List<ProductPropertyItem> propItems;

    @InterfaceC65349Pkn("schema")
    public final String schema;

    @InterfaceC65349Pkn("title")
    public final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public ProductProperty() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductProperty)) {
            return false;
        }
        ProductProperty productProperty = (ProductProperty) obj;
        return o.LJ(this.title, productProperty.title) && o.LJ(this.schema, productProperty.schema) && o.LJ(this.propItems, productProperty.propItems);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.schema;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<ProductPropertyItem> list = this.propItems;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProductProperty(title=");
        LIZ.append(this.title);
        LIZ.append(", schema=");
        LIZ.append(this.schema);
        LIZ.append(", propItems=");
        return C1NE.LIZIZ(LIZ, this.propItems, ')', LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.title);
        out.writeString(this.schema);
        List<ProductPropertyItem> list = this.propItems;
        if (list == null) {
            out.writeInt(0);
            return;
        }
        Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
        while (LIZIZ.hasNext()) {
            ((ProductPropertyItem) LIZIZ.next()).writeToParcel(out, i);
        }
    }

    public ProductProperty(String str, String str2, List<ProductPropertyItem> list) {
        this.title = str;
        this.schema = str2;
        this.propItems = list;
    }

    public /* synthetic */ ProductProperty(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list);
    }
}
