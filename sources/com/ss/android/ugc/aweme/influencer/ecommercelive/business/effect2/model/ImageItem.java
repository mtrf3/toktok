package com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model;

import X.C71536S5s;
import X.F9E;
import X.InterfaceC57784Mm4;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ImageItem extends F9E implements InterfaceC57784Mm4, Parcelable {
    public static final Parcelable.Creator<ImageItem> CREATOR = new C71536S5s();

    @InterfaceC65349Pkn("image_id")
    public final String imageId;

    @InterfaceC65349Pkn("image_url")
    public final String imageUrl;

    @InterfaceC65349Pkn("display")
    public final boolean isUsing;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.imageId, this.imageUrl, Boolean.valueOf(this.isUsing)};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.imageId);
        out.writeString(this.imageUrl);
        out.writeInt(this.isUsing ? 1 : 0);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (interfaceC57784Mm4 instanceof ImageItem) {
            ImageItem imageItem = (ImageItem) interfaceC57784Mm4;
            if (o.LJ(this.imageId, imageItem.imageId) && o.LJ(this.imageUrl, imageItem.imageUrl) && this.isUsing == imageItem.isUsing) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if ((interfaceC57784Mm4 instanceof ImageItem) && o.LJ(this.imageId, ((ImageItem) interfaceC57784Mm4).imageId)) {
            return true;
        }
        return false;
    }

    public static ImageItem L(ImageItem imageItem, boolean z) {
        String imageId = imageItem.imageId;
        String imageUrl = imageItem.imageUrl;
        imageItem.getClass();
        o.LJIIIZ(imageId, "imageId");
        o.LJIIIZ(imageUrl, "imageUrl");
        return new ImageItem(imageId, imageUrl, z);
    }

    public ImageItem(String imageId, String imageUrl, boolean z) {
        o.LJIIIZ(imageId, "imageId");
        o.LJIIIZ(imageUrl, "imageUrl");
        this.imageId = imageId;
        this.imageUrl = imageUrl;
        this.isUsing = z;
    }

    public /* synthetic */ ImageItem(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? false : z);
    }
}
