package com.ss.ugc.aweme.creation.base;

import X.C80646Vkw;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public class PublishConfigModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<PublishConfigModel> CREATOR = new C80646Vkw();

    @InterfaceC65349Pkn("placeholder")
    public String placeholder;

    /* JADX WARN: Multi-variable type inference failed */
    public PublishConfigModel() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        parcel.writeString(this.placeholder);
    }

    public final String getPlaceholder() {
        return this.placeholder;
    }

    public PublishConfigModel(String str) {
        this.placeholder = str;
    }

    public final void setPlaceholder(String str) {
        this.placeholder = str;
    }

    public /* synthetic */ PublishConfigModel(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
