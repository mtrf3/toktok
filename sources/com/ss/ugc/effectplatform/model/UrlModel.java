package com.ss.ugc.effectplatform.model;

import X.C65352Pkq;
import X.ESU;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public class UrlModel implements AndroidParcelable {
    public static final Parcelable.Creator CREATOR = new ESU();
    public String md5;
    public String uri;
    public List<String> url_list;
    public List<String> url_prefix;
    public Integer url_sub_type;

    /* JADX WARN: Multi-variable type inference failed */
    public UrlModel() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        o.LJIIJ(parcel, "parcel");
        parcel.writeStringList(this.url_list);
        parcel.writeStringList(this.url_prefix);
        parcel.writeString(this.uri);
        parcel.writeString(this.md5);
        Integer num = this.url_sub_type;
        if (num != null) {
            parcel.writeInt(1);
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int hashCode = getUrl_list().hashCode() * 31;
        List<String> url_prefix = getUrl_prefix();
        int i4 = 0;
        if (url_prefix != null) {
            i = url_prefix.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 31;
        String uri = getUri();
        if (uri != null) {
            i2 = uri.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        String md5 = getMd5();
        if (md5 != null) {
            i3 = md5.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        Integer url_sub_type = getUrl_sub_type();
        if (url_sub_type != null) {
            i4 = url_sub_type.intValue();
        }
        return i7 + i4;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UrlModel(url_list=");
        LIZ.append(getUrl_list());
        LIZ.append(", url_sub_type=");
        LIZ.append(getUrl_sub_type());
        LIZ.append(", url_prefix=");
        LIZ.append(getUrl_prefix());
        LIZ.append(", uri=");
        LIZ.append(getUri());
        LIZ.append(", md5=");
        LIZ.append(getMd5());
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public String getMd5() {
        return this.md5;
    }

    public String getUri() {
        return this.uri;
    }

    public List<String> getUrl_list() {
        return this.url_list;
    }

    public List<String> getUrl_prefix() {
        return this.url_prefix;
    }

    public Integer getUrl_sub_type() {
        return this.url_sub_type;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || (!o.LJ(C65352Pkq.LIZ(getClass()), C65352Pkq.LIZ(obj.getClass())))) {
            return false;
        }
        UrlModel urlModel = (UrlModel) obj;
        if (!(!o.LJ(getUrl_list(), urlModel.getUrl_list())) && !(!o.LJ(getUrl_prefix(), urlModel.getUrl_prefix())) && !(!o.LJ(getUri(), urlModel.getUri())) && !(!o.LJ(getMd5(), urlModel.getMd5())) && !(!o.LJ(getUrl_sub_type(), urlModel.getUrl_sub_type()))) {
            return true;
        }
        return false;
    }

    public void setMd5(String str) {
        this.md5 = str;
    }

    public void setUri(String str) {
        this.uri = str;
    }

    public void setUrl_list(List<String> list) {
        o.LJIIJ(list, "<set-?>");
        this.url_list = list;
    }

    public void setUrl_prefix(List<String> list) {
        this.url_prefix = list;
    }

    public void setUrl_sub_type(Integer num) {
        this.url_sub_type = num;
    }

    public UrlModel(List<String> url_list, List<String> list, String str, String str2, Integer num) {
        o.LJIIJ(url_list, "url_list");
        this.url_list = url_list;
        this.url_prefix = list;
        this.uri = str;
        this.md5 = str2;
        this.url_sub_type = num;
    }

    public /* synthetic */ UrlModel(List list, List list2, String str, String str2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) == 0 ? num : null);
    }
}
