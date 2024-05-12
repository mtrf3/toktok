package com.ss.ugc.effectplatform.model;

import X.C65352Pkq;
import X.ESX;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public class DiffEffect implements AndroidParcelable {
    public static final Parcelable.Creator CREATOR = new ESX();
    public UrlModel base_url;
    public UrlModel diff_url;
    public String extra;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        o.LJIIJ(parcel, "parcel");
        parcel.writeParcelable(this.diff_url, i);
        parcel.writeParcelable(this.base_url, i);
        parcel.writeString(this.extra);
    }

    public int hashCode() {
        int i;
        int hashCode = (getBase_url().hashCode() + (getDiff_url().hashCode() * 31)) * 31;
        String extra = getExtra();
        if (extra != null) {
            i = extra.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DiffEffect(diff_url=");
        LIZ.append(getDiff_url());
        LIZ.append(", base_url=");
        LIZ.append(getBase_url());
        LIZ.append(", extra=");
        LIZ.append(getExtra());
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public UrlModel getBase_url() {
        return this.base_url;
    }

    public UrlModel getDiff_url() {
        return this.diff_url;
    }

    public String getExtra() {
        return this.extra;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || (!o.LJ(C65352Pkq.LIZ(getClass()), C65352Pkq.LIZ(obj.getClass())))) {
            return false;
        }
        DiffEffect diffEffect = (DiffEffect) obj;
        if (!(!o.LJ(getDiff_url(), diffEffect.getDiff_url())) && !(!o.LJ(getBase_url(), diffEffect.getBase_url())) && !(!o.LJ(getExtra(), diffEffect.getExtra()))) {
            return true;
        }
        return false;
    }

    public void setBase_url(UrlModel urlModel) {
        o.LJIIJ(urlModel, "<set-?>");
        this.base_url = urlModel;
    }

    public void setDiff_url(UrlModel urlModel) {
        o.LJIIJ(urlModel, "<set-?>");
        this.diff_url = urlModel;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public DiffEffect(UrlModel diff_url, UrlModel base_url, String str) {
        o.LJIIJ(diff_url, "diff_url");
        o.LJIIJ(base_url, "base_url");
        this.diff_url = diff_url;
        this.base_url = base_url;
        this.extra = str;
    }

    public /* synthetic */ DiffEffect(UrlModel urlModel, UrlModel urlModel2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(urlModel, urlModel2, (i & 4) != 0 ? null : str);
    }
}
