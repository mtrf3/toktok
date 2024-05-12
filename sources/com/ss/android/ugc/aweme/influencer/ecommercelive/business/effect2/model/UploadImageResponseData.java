package com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model;

import X.C71526S5i;
import X.F9E;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class UploadImageResponseData extends F9E implements Parcelable {
    public static final Parcelable.Creator<UploadImageResponseData> CREATOR = new C71526S5i();

    @InterfaceC65349Pkn("image_id")
    public final String imageId;

    @InterfaceC65349Pkn("image_url")
    public final String imageUrl;

    @InterfaceC65349Pkn("total")
    public final int totalImageCount;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.imageId, this.imageUrl, Integer.valueOf(this.totalImageCount)};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.imageId);
        out.writeString(this.imageUrl);
        out.writeInt(this.totalImageCount);
    }

    public UploadImageResponseData(String imageId, String imageUrl, int i) {
        o.LJIIIZ(imageId, "imageId");
        o.LJIIIZ(imageUrl, "imageUrl");
        this.imageId = imageId;
        this.imageUrl = imageUrl;
        this.totalImageCount = i;
    }
}
