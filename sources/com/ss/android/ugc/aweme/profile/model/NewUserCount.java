package com.ss.android.ugc.aweme.profile.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes16.dex */
public class NewUserCount extends BaseResponse implements Parcelable {
    public static final Parcelable.Creator<NewUserCount> CREATOR = new Parcelable.Creator<NewUserCount>() { // from class: com.ss.android.ugc.aweme.profile.model.NewUserCount.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public NewUserCount createFromParcel(Parcel parcel) {
            return new NewUserCount(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public NewUserCount[] newArray(int i) {
            return new NewUserCount[i];
        }
    };
    public int count;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public NewUserCount() {
    }

    public NewUserCount(Parcel parcel) {
        this.count = parcel.readInt();
    }

    public NewUserCount(int i) {
        this.count = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
    }
}
