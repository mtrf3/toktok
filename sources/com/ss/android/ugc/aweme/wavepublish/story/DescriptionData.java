package com.ss.android.ugc.aweme.wavepublish.story;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DescriptionData implements Serializable {

    @InterfaceC65349Pkn("product")
    public String product;

    @InterfaceC65349Pkn("prop_list")
    public String propList;

    /* JADX WARN: Multi-variable type inference failed */
    public DescriptionData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DescriptionData copy$default(DescriptionData descriptionData, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = descriptionData.product;
        }
        if ((i & 2) != 0) {
            str2 = descriptionData.propList;
        }
        return descriptionData.copy(str, str2);
    }

    public final DescriptionData copy(String str, String str2) {
        return new DescriptionData(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DescriptionData)) {
            return false;
        }
        DescriptionData descriptionData = (DescriptionData) obj;
        return o.LJ(this.product, descriptionData.product) && o.LJ(this.propList, descriptionData.propList);
    }

    public int hashCode() {
        String str = this.product;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.propList;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DescriptionData(product=");
        LIZ.append(this.product);
        LIZ.append(", propList=");
        return q.LIZIZ(LIZ, this.propList, ')', LIZ);
    }

    public final String getProduct() {
        return this.product;
    }

    public final String getPropList() {
        return this.propList;
    }

    public final void setProduct(String str) {
        this.product = str;
    }

    public final void setPropList(String str) {
        this.propList = str;
    }

    public DescriptionData(String str, String str2) {
        this.product = str;
        this.propList = str2;
    }

    public /* synthetic */ DescriptionData(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
