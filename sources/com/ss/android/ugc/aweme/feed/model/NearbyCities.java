package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

/* loaded from: classes16.dex */
public class NearbyCities implements Parcelable {
    public static final Parcelable.Creator<NearbyCities> CREATOR = new Parcelable.Creator<NearbyCities>() { // from class: com.ss.android.ugc.aweme.feed.model.NearbyCities.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public NearbyCities createFromParcel(Parcel parcel) {
            return new NearbyCities(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public NearbyCities[] newArray(int i) {
            return new NearbyCities[i];
        }
    };
    public List<CityBean> all;
    public CityBean current;
    public List<CityBean> hot;
    public List<CityBean> old;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* loaded from: classes16.dex */
    public static class CityBean implements Comparable<CityBean>, Parcelable {
        public static final Parcelable.Creator<CityBean> CREATOR = new Parcelable.Creator<CityBean>() { // from class: com.ss.android.ugc.aweme.feed.model.NearbyCities.CityBean.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public CityBean createFromParcel(Parcel parcel) {
                return new CityBean(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public CityBean[] newArray(int i) {
                return new CityBean[i];
            }
        };

        @InterfaceC65349Pkn("ad_code")
        public String adCode;

        @InterfaceC65349Pkn("cn_pinyin")
        public String cnPinyin;
        public String code;

        @InterfaceC65349Pkn("code_local")
        public String codeLocal;

        @InterfaceC65349Pkn("country")
        public String country;

        @InterfaceC65349Pkn("country_code")
        public String countryCode;

        @InterfaceC65349Pkn("current_position_name")
        public String currentPositionName;

        @InterfaceC65349Pkn("districts")
        public List<CityBean> districts;
        public String en;
        public boolean isL3;
        public String l2Name = "";
        public String name;

        @InterfaceC65349Pkn("name_en")
        public String nameEn;

        @InterfaceC65349Pkn("nearby_label_name")
        public String nearbyLabelName;

        @InterfaceC65349Pkn("nearby_tab_name")
        public String nearbyTabName;

        @InterfaceC65349Pkn("show_name")
        public String showName;

        @InterfaceC65349Pkn("show_type")
        public int showType;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public CityBean() {
        }

        public CityBean(Parcel parcel) {
            this.name = parcel.readString();
            this.code = parcel.readString();
            this.en = parcel.readString();
        }

        @Override // java.lang.Comparable
        public int compareTo(CityBean cityBean) {
            boolean z = this.isL3;
            if (z && !cityBean.isL3) {
                return 1;
            }
            if ((!z && cityBean.isL3) || TextUtils.isEmpty(this.cnPinyin)) {
                return -1;
            }
            if (TextUtils.isEmpty(cityBean.cnPinyin)) {
                return 1;
            }
            return this.cnPinyin.compareTo(cityBean.cnPinyin);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.name);
            parcel.writeString(this.code);
            parcel.writeString(this.en);
        }
    }

    public NearbyCities() {
    }

    public NearbyCities(Parcel parcel) {
        this.current = (CityBean) parcel.readParcelable(CityBean.class.getClassLoader());
        Parcelable.Creator<CityBean> creator = CityBean.CREATOR;
        this.all = parcel.createTypedArrayList(creator);
        this.hot = parcel.createTypedArrayList(creator);
        this.old = parcel.createTypedArrayList(creator);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.current, i);
        parcel.writeTypedList(this.all);
        parcel.writeTypedList(this.hot);
        parcel.writeTypedList(this.old);
    }
}
