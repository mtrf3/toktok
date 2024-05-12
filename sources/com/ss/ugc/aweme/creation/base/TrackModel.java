package com.ss.ugc.aweme.creation.base;

import X.HDJ;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class TrackModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<TrackModel> CREATOR = new HDJ();

    @InterfaceC65349Pkn("enter_shoot_page_extra")
    public Map<String, String> enterShootPageExtra;

    @InterfaceC65349Pkn("previous_page")
    public String previousPage;

    @InterfaceC65349Pkn("shoot_way")
    public String shootWay;

    /* JADX WARN: Multi-variable type inference failed */
    public TrackModel() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        parcel.writeString(this.previousPage);
        parcel.writeString(this.shootWay);
        Map<String, String> map = this.enterShootPageExtra;
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
    }

    public final Map<String, String> getEnterShootPageExtra() {
        return this.enterShootPageExtra;
    }

    public final String getPreviousPage() {
        return this.previousPage;
    }

    public final String getShootWay() {
        return this.shootWay;
    }

    public final void setEnterShootPageExtra(Map<String, String> map) {
        o.LJIIIZ(map, "<set-?>");
        this.enterShootPageExtra = map;
    }

    public final void setPreviousPage(String str) {
        this.previousPage = str;
    }

    public final void setShootWay(String str) {
        this.shootWay = str;
    }

    public TrackModel(String str, String str2, Map<String, String> enterShootPageExtra) {
        o.LJIIIZ(enterShootPageExtra, "enterShootPageExtra");
        this.previousPage = str;
        this.shootWay = str2;
        this.enterShootPageExtra = enterShootPageExtra;
    }

    public /* synthetic */ TrackModel(String str, String str2, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? new LinkedHashMap() : map);
    }
}
