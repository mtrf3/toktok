package com.facebook.share.model;

import X.EnumC48391Iyx;
import X.EnumC48392Iyy;
import Y.IDCreatorS54S0000000_11;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public final class GameRequestContent implements ShareModel {
    public static final Parcelable.Creator<GameRequestContent> CREATOR = new IDCreatorS54S0000000_11(33);
    public final EnumC48392Iyy actionType;
    public final String cta;
    public final String data;
    public final EnumC48391Iyx filters;
    public final String message;
    public final String objectId;
    public final List<String> recipients;
    public final List<String> suggestions;
    public final String title;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public GameRequestContent(Parcel parcel) {
        this.message = parcel.readString();
        this.cta = parcel.readString();
        this.recipients = parcel.createStringArrayList();
        this.title = parcel.readString();
        this.data = parcel.readString();
        this.actionType = (EnumC48392Iyy) parcel.readSerializable();
        this.objectId = parcel.readString();
        this.filters = (EnumC48391Iyx) parcel.readSerializable();
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        this.suggestions = createStringArrayList;
        parcel.readStringList(createStringArrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.message);
        parcel.writeString(this.cta);
        parcel.writeStringList(this.recipients);
        parcel.writeString(this.title);
        parcel.writeString(this.data);
        parcel.writeSerializable(this.actionType);
        parcel.writeString(this.objectId);
        parcel.writeSerializable(this.filters);
        parcel.writeStringList(this.suggestions);
    }
}
