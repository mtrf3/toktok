package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C27193Alp;
import X.C27194Alq;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class MapLocateData implements Parcelable {

    @InterfaceC65349Pkn("autocomplete_address_id")
    public final String autoCompleteAddressId;

    @InterfaceC65349Pkn("is_recommend_detail_address")
    public final String isRecommendDetailAddress;

    @InterfaceC65349Pkn("latitude")
    public final String latitude;

    @InterfaceC65349Pkn("longitude")
    public final String longitude;

    @InterfaceC65349Pkn("pin_movable")
    public final String pinMovable;

    @InterfaceC65349Pkn("session_key")
    public final String sessionKey;

    @InterfaceC65349Pkn("shipping_address")
    public final Address shippingAddress;

    @InterfaceC65349Pkn("trackParams")
    public final TrackParams trackParams;
    public static final C27194Alq Companion = new C27194Alq();
    public static final Parcelable.Creator<MapLocateData> CREATOR = new C27193Alp();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MapLocateData)) {
            return false;
        }
        MapLocateData mapLocateData = (MapLocateData) obj;
        return o.LJ(this.longitude, mapLocateData.longitude) && o.LJ(this.latitude, mapLocateData.latitude) && o.LJ(this.shippingAddress, mapLocateData.shippingAddress) && o.LJ(this.autoCompleteAddressId, mapLocateData.autoCompleteAddressId) && o.LJ(this.sessionKey, mapLocateData.sessionKey) && o.LJ(this.trackParams, mapLocateData.trackParams) && o.LJ(this.isRecommendDetailAddress, mapLocateData.isRecommendDetailAddress) && o.LJ(this.pinMovable, mapLocateData.pinMovable);
    }

    public final int hashCode() {
        String str = this.longitude;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.latitude;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Address address = this.shippingAddress;
        int hashCode3 = (hashCode2 + (address == null ? 0 : address.hashCode())) * 31;
        String str3 = this.autoCompleteAddressId;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.sessionKey;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        TrackParams trackParams = this.trackParams;
        int hashCode6 = (hashCode5 + (trackParams == null ? 0 : trackParams.hashCode())) * 31;
        String str5 = this.isRecommendDetailAddress;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.pinMovable;
        return hashCode7 + (str6 != null ? str6.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.longitude);
        out.writeString(this.latitude);
        Address address = this.shippingAddress;
        if (address == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            address.writeToParcel(out, i);
        }
        out.writeString(this.autoCompleteAddressId);
        out.writeString(this.sessionKey);
        TrackParams trackParams = this.trackParams;
        if (trackParams == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            trackParams.writeToParcel(out, i);
        }
        out.writeString(this.isRecommendDetailAddress);
        out.writeString(this.pinMovable);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MapLocateData(longitude=");
        LIZ.append(this.longitude);
        LIZ.append(", latitude=");
        LIZ.append(this.latitude);
        LIZ.append(", shippingAddress=");
        LIZ.append(this.shippingAddress);
        LIZ.append(", autoCompleteAddressId=");
        LIZ.append(this.autoCompleteAddressId);
        LIZ.append(", sessionKey=");
        LIZ.append(this.sessionKey);
        LIZ.append(", trackParams=");
        LIZ.append(this.trackParams);
        LIZ.append(", isRecommendDetailAddress=");
        LIZ.append(this.isRecommendDetailAddress);
        LIZ.append(", pinMovable=");
        return q.LIZIZ(LIZ, this.pinMovable, ')', LIZ);
    }

    public MapLocateData(String str, String str2, Address address, String str3, String str4, TrackParams trackParams, String str5, String str6) {
        this.longitude = str;
        this.latitude = str2;
        this.shippingAddress = address;
        this.autoCompleteAddressId = str3;
        this.sessionKey = str4;
        this.trackParams = trackParams;
        this.isRecommendDetailAddress = str5;
        this.pinMovable = str6;
    }
}
