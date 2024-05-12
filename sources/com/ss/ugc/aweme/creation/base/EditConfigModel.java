package com.ss.ugc.aweme.creation.base;

import X.C84282X5y;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class EditConfigModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<EditConfigModel> CREATOR = new C84282X5y();

    @InterfaceC65349Pkn("stickerConfigModel")
    public StickerConfigModel stickerconfigmodel;

    /* JADX WARN: Multi-variable type inference failed */
    public EditConfigModel() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        parcel.writeParcelable(this.stickerconfigmodel, i);
    }

    public final StickerConfigModel getStickerconfigmodel() {
        return this.stickerconfigmodel;
    }

    public EditConfigModel(StickerConfigModel stickerConfigModel) {
        this.stickerconfigmodel = stickerConfigModel;
    }

    public final void setStickerconfigmodel(StickerConfigModel stickerConfigModel) {
        this.stickerconfigmodel = stickerConfigModel;
    }

    public /* synthetic */ EditConfigModel(StickerConfigModel stickerConfigModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : stickerConfigModel);
    }
}
