package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C69677RWf;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class Favorite implements Parcelable {
    public static final Parcelable.Creator<Favorite> CREATOR = new C69677RWf();

    @InterfaceC65349Pkn("favorite_schema_link")
    public final String favoriteSchemaLink;

    @InterfaceC65349Pkn("favorite_text")
    public final String favoriteText;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Favorite)) {
            return false;
        }
        Favorite favorite = (Favorite) obj;
        return o.LJ(this.favoriteText, favorite.favoriteText) && o.LJ(this.favoriteSchemaLink, favorite.favoriteSchemaLink);
    }

    public final int hashCode() {
        String str = this.favoriteText;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.favoriteSchemaLink;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.favoriteText);
        out.writeString(this.favoriteSchemaLink);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Favorite(favoriteText=");
        LIZ.append(this.favoriteText);
        LIZ.append(", favoriteSchemaLink=");
        return q.LIZIZ(LIZ, this.favoriteSchemaLink, ')', LIZ);
    }

    public Favorite(String str, String str2) {
        this.favoriteText = str;
        this.favoriteSchemaLink = str2;
    }
}
