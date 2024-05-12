package com.ss.android.ugc.aweme.ecommerce.api.model;

import X.B00;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class FetchInfo implements Parcelable {
    public static final Parcelable.Creator<FetchInfo> CREATOR = new B00();

    @InterfaceC65349Pkn("event_name")
    public final String eventName;

    @InterfaceC65349Pkn("fetch_api_type")
    public final Integer fetchAPI;

    @InterfaceC65349Pkn("server_issued_params")
    public final String serverIssuedParams;

    public static /* synthetic */ FetchInfo copy$default(FetchInfo fetchInfo, Integer num, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = fetchInfo.fetchAPI;
        }
        if ((i & 2) != 0) {
            str = fetchInfo.serverIssuedParams;
        }
        if ((i & 4) != 0) {
            str2 = fetchInfo.eventName;
        }
        return fetchInfo.copy(num, str, str2);
    }

    public final FetchInfo copy(Integer num, String str, String str2) {
        return new FetchInfo(num, str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FetchInfo)) {
            return false;
        }
        FetchInfo fetchInfo = (FetchInfo) obj;
        return o.LJ(this.fetchAPI, fetchInfo.fetchAPI) && o.LJ(this.serverIssuedParams, fetchInfo.serverIssuedParams) && o.LJ(this.eventName, fetchInfo.eventName);
    }

    public int hashCode() {
        Integer num = this.fetchAPI;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.serverIssuedParams;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.eventName;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        int intValue;
        o.LJIIIZ(out, "out");
        Integer num = this.fetchAPI;
        if (num == null) {
            intValue = 0;
        } else {
            out.writeInt(1);
            intValue = num.intValue();
        }
        out.writeInt(intValue);
        out.writeString(this.serverIssuedParams);
        out.writeString(this.eventName);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FetchInfo(fetchAPI=");
        LIZ.append(this.fetchAPI);
        LIZ.append(", serverIssuedParams=");
        LIZ.append(this.serverIssuedParams);
        LIZ.append(", eventName=");
        return q.LIZIZ(LIZ, this.eventName, ')', LIZ);
    }

    public final String getEventName() {
        return this.eventName;
    }

    public final Integer getFetchAPI() {
        return this.fetchAPI;
    }

    public final String getServerIssuedParams() {
        return this.serverIssuedParams;
    }

    public FetchInfo(Integer num, String str, String str2) {
        this.fetchAPI = num;
        this.serverIssuedParams = str;
        this.eventName = str2;
    }

    public /* synthetic */ FetchInfo(Integer num, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, str, str2);
    }
}
