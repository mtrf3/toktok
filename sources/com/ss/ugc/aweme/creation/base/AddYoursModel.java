package com.ss.ugc.aweme.creation.base;

import X.HCI;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class AddYoursModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<AddYoursModel> CREATOR = new HCI();

    @InterfaceC65349Pkn("ay_enter_edit")
    public Boolean ayEnterEdit;

    @InterfaceC65349Pkn("ay_enter_method")
    public String ayEnterMethod;

    @InterfaceC65349Pkn("ay_text")
    public String ayText;

    @InterfaceC65349Pkn("ay_topic_id")
    public String ayTopicId;

    /* JADX WARN: Multi-variable type inference failed */
    public AddYoursModel() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        o.LJIIIZ(parcel, "parcel");
        Boolean bool = this.ayEnterEdit;
        if (bool != null) {
            parcel.writeInt(1);
            i2 = bool.booleanValue();
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
        parcel.writeString(this.ayText);
        parcel.writeString(this.ayTopicId);
        parcel.writeString(this.ayEnterMethod);
    }

    public final Boolean getAyEnterEdit() {
        return this.ayEnterEdit;
    }

    public final String getAyEnterMethod() {
        return this.ayEnterMethod;
    }

    public final String getAyText() {
        return this.ayText;
    }

    public final String getAyTopicId() {
        return this.ayTopicId;
    }

    public final void setAyEnterEdit(Boolean bool) {
        this.ayEnterEdit = bool;
    }

    public final void setAyEnterMethod(String str) {
        this.ayEnterMethod = str;
    }

    public final void setAyText(String str) {
        this.ayText = str;
    }

    public final void setAyTopicId(String str) {
        this.ayTopicId = str;
    }

    public AddYoursModel(Boolean bool, String str, String str2, String str3) {
        this.ayEnterEdit = bool;
        this.ayText = str;
        this.ayTopicId = str2;
        this.ayEnterMethod = str3;
    }

    public /* synthetic */ AddYoursModel(Boolean bool, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }
}
