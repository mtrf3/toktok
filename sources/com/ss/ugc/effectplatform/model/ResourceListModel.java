package com.ss.ugc.effectplatform.model;

import X.C36447ESd;
import X.C36448ESe;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public class ResourceListModel implements AndroidParcelable {
    public static final Parcelable.Creator CREATOR = new C36447ESd();
    public String icon_uri;
    public String params;
    public List<? extends ResourceListBean> resource_list;
    public List<String> url_prefix;

    /* JADX WARN: Multi-variable type inference failed */
    public ResourceListModel() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        o.LJIIJ(parcel, "parcel");
        List<? extends ResourceListBean> list = this.resource_list;
        parcel.writeInt(list.size());
        Iterator<? extends ResourceListBean> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), i);
        }
        parcel.writeStringList(this.url_prefix);
        parcel.writeString(this.icon_uri);
        parcel.writeString(this.params);
    }

    /* loaded from: classes7.dex */
    public static class ResourceListBean implements AndroidParcelable {
        public static final Parcelable.Creator CREATOR = new C36448ESe();
        public String name;
        public String resource_uri;
        public String value;

        /* JADX WARN: Multi-variable type inference failed */
        public ResourceListBean() {
            this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            o.LJIIJ(parcel, "parcel");
            parcel.writeString(this.name);
            parcel.writeString(this.value);
            parcel.writeString(this.resource_uri);
        }

        public String getName() {
            return this.name;
        }

        public String getResource_uri() {
            return this.resource_uri;
        }

        public String getValue() {
            return this.value;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setResource_uri(String str) {
            this.resource_uri = str;
        }

        public void setValue(String str) {
            this.value = str;
        }

        public ResourceListBean(String str, String str2, String str3) {
            this.name = str;
            this.value = str2;
            this.resource_uri = str3;
        }

        public /* synthetic */ ResourceListBean(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
        }
    }

    public String getIcon_uri() {
        return this.icon_uri;
    }

    public String getParams() {
        return this.params;
    }

    public List<ResourceListBean> getResource_list() {
        return this.resource_list;
    }

    public List<String> getUrl_prefix() {
        return this.url_prefix;
    }

    public void setIcon_uri(String str) {
        this.icon_uri = str;
    }

    public void setParams(String str) {
        this.params = str;
    }

    public void setResource_list(List<? extends ResourceListBean> list) {
        o.LJIIJ(list, "<set-?>");
        this.resource_list = list;
    }

    public void setUrl_prefix(List<String> list) {
        o.LJIIJ(list, "<set-?>");
        this.url_prefix = list;
    }

    public ResourceListModel(List<? extends ResourceListBean> resource_list, List<String> url_prefix, String str, String str2) {
        o.LJIIJ(resource_list, "resource_list");
        o.LJIIJ(url_prefix, "url_prefix");
        this.resource_list = resource_list;
        this.url_prefix = url_prefix;
        this.icon_uri = str;
        this.params = str2;
    }

    public /* synthetic */ ResourceListModel(List list, List list2, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? new ArrayList() : list2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2);
    }
}
