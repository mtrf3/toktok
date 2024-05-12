package com.ss.android.ugc.aweme.shortvideo.model;

import X.F9E;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class ReturnEcommercePhotoSearchModel extends F9E implements Parcelable {
    public static final Parcelable.Creator<ReturnEcommercePhotoSearchModel> CREATOR = new Creator();
    public final boolean albumAuthorized;
    public final boolean cameraAuthorized;
    public final String imagePath;
    public final String logExtra;
    public final PageType pageType;

    /* loaded from: classes8.dex */
    public static final class Creator implements Parcelable.Creator<ReturnEcommercePhotoSearchModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReturnEcommercePhotoSearchModel createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new ReturnEcommercePhotoSearchModel(PageType.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReturnEcommercePhotoSearchModel[] newArray(int i) {
            return new ReturnEcommercePhotoSearchModel[i];
        }
    }

    public static /* synthetic */ ReturnEcommercePhotoSearchModel copy$default(ReturnEcommercePhotoSearchModel returnEcommercePhotoSearchModel, PageType pageType, String str, boolean z, boolean z2, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            pageType = returnEcommercePhotoSearchModel.pageType;
        }
        if ((i & 2) != 0) {
            str = returnEcommercePhotoSearchModel.imagePath;
        }
        if ((i & 4) != 0) {
            z = returnEcommercePhotoSearchModel.albumAuthorized;
        }
        if ((i & 8) != 0) {
            z2 = returnEcommercePhotoSearchModel.cameraAuthorized;
        }
        if ((i & 16) != 0) {
            str2 = returnEcommercePhotoSearchModel.logExtra;
        }
        return returnEcommercePhotoSearchModel.copy(pageType, str, z, z2, str2);
    }

    public final ReturnEcommercePhotoSearchModel copy(PageType pageType, String imagePath, boolean z, boolean z2, String logExtra) {
        o.LJIIIZ(pageType, "pageType");
        o.LJIIIZ(imagePath, "imagePath");
        o.LJIIIZ(logExtra, "logExtra");
        return new ReturnEcommercePhotoSearchModel(pageType, imagePath, z, z2, logExtra);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.pageType, this.imagePath, Boolean.valueOf(this.albumAuthorized), Boolean.valueOf(this.cameraAuthorized), this.logExtra};
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.pageType.name());
        out.writeString(this.imagePath);
        out.writeInt(this.albumAuthorized ? 1 : 0);
        out.writeInt(this.cameraAuthorized ? 1 : 0);
        out.writeString(this.logExtra);
    }

    public ReturnEcommercePhotoSearchModel(PageType pageType, String imagePath, boolean z, boolean z2, String logExtra) {
        o.LJIIIZ(pageType, "pageType");
        o.LJIIIZ(imagePath, "imagePath");
        o.LJIIIZ(logExtra, "logExtra");
        this.pageType = pageType;
        this.imagePath = imagePath;
        this.albumAuthorized = z;
        this.cameraAuthorized = z2;
        this.logExtra = logExtra;
    }

    public /* synthetic */ ReturnEcommercePhotoSearchModel(PageType pageType, String str, boolean z, boolean z2, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(pageType, str, z, z2, (i & 16) != 0 ? "" : str2);
    }
}
