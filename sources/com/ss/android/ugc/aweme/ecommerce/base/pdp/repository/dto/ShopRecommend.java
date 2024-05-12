package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C27742Aug;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ShopRecommend implements Parcelable {
    public static final Parcelable.Creator<ShopRecommend> CREATOR = new C27742Aug();

    @InterfaceC65349Pkn("enter_name")
    public final String enterName;

    @InterfaceC65349Pkn("enter_schema")
    public final String enterSchema;

    @InterfaceC65349Pkn("is_recommend")
    public final Boolean isRecommend;

    @InterfaceC65349Pkn("model_title")
    public final String modelTitle;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopRecommend)) {
            return false;
        }
        ShopRecommend shopRecommend = (ShopRecommend) obj;
        return o.LJ(this.isRecommend, shopRecommend.isRecommend) && o.LJ(this.modelTitle, shopRecommend.modelTitle) && o.LJ(this.enterName, shopRecommend.enterName) && o.LJ(this.enterSchema, shopRecommend.enterSchema);
    }

    public final int hashCode() {
        Boolean bool = this.isRecommend;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.modelTitle;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.enterName;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.enterSchema;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        int i2;
        o.LJIIIZ(out, "out");
        Boolean bool = this.isRecommend;
        if (bool == null) {
            i2 = 0;
        } else {
            out.writeInt(1);
            i2 = bool.booleanValue();
        }
        out.writeInt(i2);
        out.writeString(this.modelTitle);
        out.writeString(this.enterName);
        out.writeString(this.enterSchema);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShopRecommend(isRecommend=");
        LIZ.append(this.isRecommend);
        LIZ.append(", modelTitle=");
        LIZ.append(this.modelTitle);
        LIZ.append(", enterName=");
        LIZ.append(this.enterName);
        LIZ.append(", enterSchema=");
        return q.LIZIZ(LIZ, this.enterSchema, ')', LIZ);
    }

    public ShopRecommend(Boolean bool, String str, String str2, String str3) {
        this.isRecommend = bool;
        this.modelTitle = str;
        this.enterName = str2;
        this.enterSchema = str3;
    }
}
