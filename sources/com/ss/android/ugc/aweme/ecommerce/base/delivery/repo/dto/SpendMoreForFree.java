package com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto;

import X.C26961Ai5;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SpendMoreForFree implements Parcelable {
    public static final Parcelable.Creator<SpendMoreForFree> CREATOR = new C26961Ai5();

    @InterfaceC65349Pkn("text")
    public final String contentText;

    @InterfaceC65349Pkn("head_text")
    public final String headText;

    @InterfaceC65349Pkn("schema")
    public final String schema;

    /* JADX WARN: Multi-variable type inference failed */
    public SpendMoreForFree() {
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
        if (!(obj instanceof SpendMoreForFree)) {
            return false;
        }
        SpendMoreForFree spendMoreForFree = (SpendMoreForFree) obj;
        return o.LJ(this.headText, spendMoreForFree.headText) && o.LJ(this.schema, spendMoreForFree.schema) && o.LJ(this.contentText, spendMoreForFree.contentText);
    }

    public final int hashCode() {
        String str = this.headText;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.schema;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.contentText;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.headText);
        out.writeString(this.schema);
        out.writeString(this.contentText);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SpendMoreForFree(headText=");
        LIZ.append(this.headText);
        LIZ.append(", schema=");
        LIZ.append(this.schema);
        LIZ.append(", contentText=");
        return q.LIZIZ(LIZ, this.contentText, ')', LIZ);
    }

    public SpendMoreForFree(String str, String str2, String str3) {
        this.headText = str;
        this.schema = str2;
        this.contentText = str3;
    }

    public /* synthetic */ SpendMoreForFree(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
