package com.bytedance.common.wschannel.model;

import Y.IDCreatorS57S0000000_15;
import android.content.ComponentName;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes16.dex */
public class WsComponent implements Parcelable {
    public static final Parcelable.Creator<WsComponent> CREATOR = new IDCreatorS57S0000000_15(4);
    public List<WsApi> acceptApis;
    public ComponentName componentName;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.componentName, i);
        parcel.writeTypedList(this.acceptApis);
    }
}
