package com.ss.android.ugc.aweme.ecommerce.service.vo;

import X.C1NE;
import X.C27769Av7;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ProductDetailsEpt implements Parcelable {
    public static final Parcelable.Creator<ProductDetailsEpt> CREATOR = new C27769Av7();

    @InterfaceC65349Pkn("content")
    public final List<String> content;

    @InterfaceC65349Pkn("text")
    public final String text;

    @InterfaceC65349Pkn("type")
    public final String type;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductDetailsEpt)) {
            return false;
        }
        ProductDetailsEpt productDetailsEpt = (ProductDetailsEpt) obj;
        return o.LJ(this.type, productDetailsEpt.type) && o.LJ(this.text, productDetailsEpt.text) && o.LJ(this.content, productDetailsEpt.content);
    }

    public final int hashCode() {
        String str = this.type;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.text;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.content;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.type);
        out.writeString(this.text);
        out.writeStringList(this.content);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProductDetailsEpt(type=");
        LIZ.append(this.type);
        LIZ.append(", text=");
        LIZ.append(this.text);
        LIZ.append(", content=");
        return C1NE.LIZIZ(LIZ, this.content, ')', LIZ);
    }

    public ProductDetailsEpt(String str, String str2, List<String> list) {
        this.type = str;
        this.text = str2;
        this.content = list;
    }
}
