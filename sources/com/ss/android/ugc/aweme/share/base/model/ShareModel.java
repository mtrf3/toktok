package com.ss.android.ugc.aweme.share.base.model;

import X.C62513Og9;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class ShareModel implements Parcelable {
    public static final Parcelable.Creator<ShareModel> CREATOR = new C62513Og9();
    public final Serializable customModel;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        parcel.writeSerializable(this.customModel);
    }

    public ShareModel(Serializable serializable) {
        this.customModel = serializable;
    }
}
