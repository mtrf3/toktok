package com.ss.android.ugc.aweme.infoSticker.customsticker.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.infoSticker.customsticker.model.CustomStickerExtra;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class CustomStickerExtra extends F9E implements Parcelable {
    public static final Parcelable.Creator<CustomStickerExtra> CREATOR = new Parcelable.Creator<CustomStickerExtra>() { // from class: X.6ch
        @Override // android.os.Parcelable.Creator
        public final CustomStickerExtra createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new CustomStickerExtra(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final CustomStickerExtra[] newArray(int i) {
            return new CustomStickerExtra[i];
        }
    };

    @InterfaceC65349Pkn("upload_gif_count")
    public final int gifCountLimit;

    @InterfaceC65349Pkn("upload_image_max")
    public final int gifSizeLimit;

    @InterfaceC65349Pkn("image_input_height")
    public final int uploadHeightLimit;

    @InterfaceC65349Pkn("image_input_width")
    public final int uploadWidthLimit;

    public static /* synthetic */ CustomStickerExtra copy$default(CustomStickerExtra customStickerExtra, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = customStickerExtra.gifSizeLimit;
        }
        if ((i5 & 2) != 0) {
            i2 = customStickerExtra.gifCountLimit;
        }
        if ((i5 & 4) != 0) {
            i3 = customStickerExtra.uploadWidthLimit;
        }
        if ((i5 & 8) != 0) {
            i4 = customStickerExtra.uploadHeightLimit;
        }
        return customStickerExtra.copy(i, i2, i3, i4);
    }

    public final CustomStickerExtra copy(int i, int i2, int i3, int i4) {
        return new CustomStickerExtra(i, i2, i3, i4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.gifSizeLimit), Integer.valueOf(this.gifCountLimit), Integer.valueOf(this.uploadWidthLimit), Integer.valueOf(this.uploadHeightLimit)};
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.gifSizeLimit);
        out.writeInt(this.gifCountLimit);
        out.writeInt(this.uploadWidthLimit);
        out.writeInt(this.uploadHeightLimit);
    }

    public final int getGifCountLimit() {
        return this.gifCountLimit;
    }

    public final int getGifSizeLimit() {
        return this.gifSizeLimit;
    }

    public final int getUploadHeightLimit() {
        return this.uploadHeightLimit;
    }

    public final int getUploadWidthLimit() {
        return this.uploadWidthLimit;
    }

    public CustomStickerExtra(int i, int i2, int i3, int i4) {
        this.gifSizeLimit = i;
        this.gifCountLimit = i2;
        this.uploadWidthLimit = i3;
        this.uploadHeightLimit = i4;
    }
}
