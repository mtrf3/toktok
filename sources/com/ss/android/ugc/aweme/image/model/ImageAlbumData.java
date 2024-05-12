package com.ss.android.ugc.aweme.image.model;

import X.C47261Igj;
import X.C61878OQg;
import X.InterfaceC65349Pkn;
import X.InterfaceC88471Ynr;
import X.UC7;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.image.model.ImageAlbumData;
import com.ss.android.ugc.aweme.image.model.ImageStickerInfoNewEngine;
import com.ss.android.ugc.aweme.image.model.ImageSurfaceData;
import com.ss.android.ugc.aweme.image.model.ImageUiBusinessData;
import com.ss.android.ugc.aweme.image.model.SingleImageData;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class ImageAlbumData implements Parcelable, Serializable {
    public static final Parcelable.Creator<ImageAlbumData> CREATOR = new Parcelable.Creator<ImageAlbumData>() { // from class: X.5x5
        @Override // android.os.Parcelable.Creator
        public final ImageAlbumData createFromParcel(Parcel parcel) {
            boolean z;
            ImageStickerInfoNewEngine createFromParcel;
            o.LJIIIZ(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = C279117r.LIZIZ(SingleImageData.CREATOR, parcel, arrayList, i, 1);
            }
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            ImageSurfaceData createFromParcel2 = ImageSurfaceData.CREATOR.createFromParcel(parcel);
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = ImageStickerInfoNewEngine.CREATOR.createFromParcel(parcel);
            }
            return new ImageAlbumData(arrayList, z, createFromParcel2, readInt2, readInt3, createFromParcel, ImageUiBusinessData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ImageAlbumData[] newArray(int i) {
            return new ImageAlbumData[i];
        }
    };

    @InterfaceC65349Pkn("auto_enhance_on")
    public boolean autoEnhanceOn;

    @InterfaceC65349Pkn("image_list")
    public List<SingleImageData> imageList;

    @InterfaceC65349Pkn("image_ui_business_data")
    public ImageUiBusinessData imageUiBusinessData;

    @InterfaceC65349Pkn("max_image_height")
    public int maxImageHeight;

    @InterfaceC65349Pkn("max_image_width")
    public int maxImageWidth;

    @InterfaceC65349Pkn("stickerInfo_new_engine")
    public ImageStickerInfoNewEngine stickerInfoNewEngine;

    @InterfaceC65349Pkn("surface_data")
    public ImageSurfaceData surfaceData;

    public ImageAlbumData() {
        this(null, false, null, 0, 0, null, null, 127, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Map<SingleImageData, Integer> getNeedCompileImages() {
        HashMap hashMap = new HashMap();
        int i = 0;
        for (SingleImageData singleImageData : this.imageList) {
            int i2 = i + 1;
            if (i >= 0) {
                SingleImageData singleImageData2 = singleImageData;
                if (singleImageData2.getEditImageInfo().getNeedCompileLocalImage()) {
                    hashMap.put(singleImageData2, Integer.valueOf(i));
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        return hashMap;
    }

    public final boolean hasTextStickers() {
        List<SingleImageData> list = this.imageList;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<SingleImageData> it = list.iterator();
        while (it.hasNext()) {
            List<StickerItemModel> stickers = it.next().getStickerInfo().getStickers();
            if (!(stickers instanceof Collection) || !stickers.isEmpty()) {
                Iterator<StickerItemModel> it2 = stickers.iterator();
                while (it2.hasNext()) {
                    if (it2.next().isTextSticker()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean getAutoEnhanceOn() {
        return this.autoEnhanceOn;
    }

    public final List<SingleImageData> getImageList() {
        return this.imageList;
    }

    public final ImageUiBusinessData getImageUiBusinessData() {
        return this.imageUiBusinessData;
    }

    public final int getMaxImageHeight() {
        return this.maxImageHeight;
    }

    public final int getMaxImageWidth() {
        return this.maxImageWidth;
    }

    public final ImageStickerInfoNewEngine getStickerInfoNewEngine() {
        return this.stickerInfoNewEngine;
    }

    public final ImageSurfaceData getSurfaceData() {
        return this.surfaceData;
    }

    public final int getIsCropValue(InterfaceC88471Ynr<? super Float, ? super Float, Float> calculateEditRatio) {
        o.LJIIIZ(calculateEditRatio, "calculateEditRatio");
        List<SingleImageData> list = this.imageList;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<SingleImageData> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().isManualCrop()) {
                    return 1;
                }
            }
        }
        List<SingleImageData> list2 = this.imageList;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<SingleImageData> it2 = list2.iterator();
            while (it2.hasNext()) {
                if (it2.next().isAutoCrop(this.surfaceData, calculateEditRatio)) {
                    return 9;
                }
            }
        }
        return 0;
    }

    public final void setAutoEnhanceOn(boolean z) {
        this.autoEnhanceOn = z;
    }

    public final void setImageList(List<SingleImageData> list) {
        o.LJIIIZ(list, "<set-?>");
        this.imageList = list;
    }

    public final void setImageUiBusinessData(ImageUiBusinessData imageUiBusinessData) {
        o.LJIIIZ(imageUiBusinessData, "<set-?>");
        this.imageUiBusinessData = imageUiBusinessData;
    }

    public final void setMaxImageHeight(int i) {
        this.maxImageHeight = i;
    }

    public final void setMaxImageWidth(int i) {
        this.maxImageWidth = i;
    }

    public final void setStickerInfoNewEngine(ImageStickerInfoNewEngine imageStickerInfoNewEngine) {
        this.stickerInfoNewEngine = imageStickerInfoNewEngine;
    }

    public final void setSurfaceData(ImageSurfaceData imageSurfaceData) {
        o.LJIIIZ(imageSurfaceData, "<set-?>");
        this.surfaceData = imageSurfaceData;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Iterator LIZJ = UC7.LIZJ(this.imageList, out);
        while (LIZJ.hasNext()) {
            ((SingleImageData) LIZJ.next()).writeToParcel(out, i);
        }
        out.writeInt(this.autoEnhanceOn ? 1 : 0);
        this.surfaceData.writeToParcel(out, i);
        out.writeInt(this.maxImageWidth);
        out.writeInt(this.maxImageHeight);
        ImageStickerInfoNewEngine imageStickerInfoNewEngine = this.stickerInfoNewEngine;
        if (imageStickerInfoNewEngine == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            imageStickerInfoNewEngine.writeToParcel(out, i);
        }
        this.imageUiBusinessData.writeToParcel(out, i);
    }

    public ImageAlbumData(List<SingleImageData> imageList, boolean z, ImageSurfaceData surfaceData, int i, int i2, ImageStickerInfoNewEngine imageStickerInfoNewEngine, ImageUiBusinessData imageUiBusinessData) {
        o.LJIIIZ(imageList, "imageList");
        o.LJIIIZ(surfaceData, "surfaceData");
        o.LJIIIZ(imageUiBusinessData, "imageUiBusinessData");
        this.imageList = imageList;
        this.autoEnhanceOn = z;
        this.surfaceData = surfaceData;
        this.maxImageWidth = i;
        this.maxImageHeight = i2;
        this.stickerInfoNewEngine = imageStickerInfoNewEngine;
        this.imageUiBusinessData = imageUiBusinessData;
    }

    public ImageAlbumData(List list, boolean z, ImageSurfaceData imageSurfaceData, int i, int i2, ImageStickerInfoNewEngine imageStickerInfoNewEngine, ImageUiBusinessData imageUiBusinessData, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? C61878OQg.INSTANCE : list, (i3 & 2) != 0 ? false : z, (i3 & 4) != 0 ? new ImageSurfaceData(0, 0, 3, null) : imageSurfaceData, (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? 0 : i2, (i3 & 32) != 0 ? null : imageStickerInfoNewEngine, (i3 & 64) != 0 ? new ImageUiBusinessData(false, 1, null) : imageUiBusinessData);
    }
}
