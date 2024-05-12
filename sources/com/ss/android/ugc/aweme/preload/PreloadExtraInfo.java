package com.ss.android.ugc.aweme.preload;

import Y.IDCreatorS54S0000000_11;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes12.dex */
public class PreloadExtraInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDCreatorS54S0000000_11(61);
    public final String enterFrom;
    public List<String> keyQueryParams;
    public final String previousPage;
    public final int strategyId;
    public final String url;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public PreloadExtraInfo(Parcel parcel) {
        this.enterFrom = parcel.readString();
        this.previousPage = parcel.readString();
        this.url = parcel.readString();
        this.strategyId = parcel.readInt();
        parcel.readStringList(this.keyQueryParams);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.enterFrom);
        parcel.writeString(this.previousPage);
        parcel.writeString(this.url);
        parcel.writeInt(this.strategyId);
        parcel.writeStringList(this.keyQueryParams);
    }

    public PreloadExtraInfo(int i, String str, String str2, String str3, List list) {
        this.enterFrom = str;
        this.previousPage = str2;
        this.url = str3;
        this.strategyId = i;
        this.keyQueryParams = list;
    }
}
