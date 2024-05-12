package com.facebook.share.model;

import X.Q3E;
import X.Q8Z;
import Y.IDCreatorS54S0000000_11;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class AppGroupCreationContent implements ShareModel {
    public final Q3E appGroupPrivacy;
    public final String description;
    public final String name;
    public static final Q8Z Companion = new Q8Z();
    public static final Parcelable.Creator<AppGroupCreationContent> CREATOR = new IDCreatorS54S0000000_11(30);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public AppGroupCreationContent(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        this.name = parcel.readString();
        this.description = parcel.readString();
        this.appGroupPrivacy = (Q3E) parcel.readSerializable();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.name);
        out.writeString(this.description);
        out.writeSerializable(this.appGroupPrivacy);
    }
}
