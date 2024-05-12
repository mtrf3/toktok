package com.ss.android.ugc.aweme.image.model;

import X.InterfaceC65349Pkn;
import X.InterfaceC88471Ynr;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.image.model.EditImageInfo;
import com.ss.android.ugc.aweme.image.model.ImageBufferData;
import com.ss.android.ugc.aweme.image.model.ImageFilterInfo;
import com.ss.android.ugc.aweme.image.model.ImageQualityInfo;
import com.ss.android.ugc.aweme.image.model.ImageStickerInfo;
import com.ss.android.ugc.aweme.image.model.ImageStickerInfoNewEngine;
import com.ss.android.ugc.aweme.image.model.ImageSynthesisResult;
import com.ss.android.ugc.aweme.image.model.SingleImageData;
import com.ss.android.ugc.aweme.image.model.SrcImageInfo;
import com.ss.android.ugc.aweme.shortvideo.ImportVideoInfo;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class SingleImageData implements Parcelable, Serializable {
    public static final Parcelable.Creator<SingleImageData> CREATOR = new Parcelable.Creator<SingleImageData>() { // from class: X.5x2
        @Override // android.os.Parcelable.Creator
        public final SingleImageData createFromParcel(Parcel parcel) {
            ImageBufferData createFromParcel;
            ImageStickerInfoNewEngine createFromParcel2;
            ImageSynthesisResult createFromParcel3;
            o.LJIIIZ(parcel, "parcel");
            String readString = parcel.readString();
            SrcImageInfo createFromParcel4 = SrcImageInfo.CREATOR.createFromParcel(parcel);
            ImageQualityInfo imageQualityInfo = null;
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = ImageBufferData.CREATOR.createFromParcel(parcel);
            }
            ImageBufferData imageBufferData = createFromParcel;
            EditImageInfo createFromParcel5 = EditImageInfo.CREATOR.createFromParcel(parcel);
            ImageFilterInfo createFromParcel6 = ImageFilterInfo.CREATOR.createFromParcel(parcel);
            ImageStickerInfo createFromParcel7 = ImageStickerInfo.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                createFromParcel2 = null;
            } else {
                createFromParcel2 = ImageStickerInfoNewEngine.CREATOR.createFromParcel(parcel);
            }
            ImageStickerInfoNewEngine imageStickerInfoNewEngine = createFromParcel2;
            if (parcel.readInt() == 0) {
                createFromParcel3 = null;
            } else {
                createFromParcel3 = ImageSynthesisResult.CREATOR.createFromParcel(parcel);
            }
            ImageSynthesisResult imageSynthesisResult = createFromParcel3;
            if (parcel.readInt() != 0) {
                imageQualityInfo = ImageQualityInfo.CREATOR.createFromParcel(parcel);
            }
            return new SingleImageData(readString, createFromParcel4, imageBufferData, createFromParcel5, createFromParcel6, createFromParcel7, imageStickerInfoNewEngine, imageSynthesisResult, imageQualityInfo, parcel.readInt(), (ImportVideoInfo) parcel.readParcelable(SingleImageData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SingleImageData[] newArray(int i) {
            return new SingleImageData[i];
        }
    };

    @InterfaceC65349Pkn("image_buffer_data")
    public final ImageBufferData bufferData;

    @InterfaceC65349Pkn("edit_image_info")
    public final EditImageInfo editImageInfo;

    @InterfaceC65349Pkn("filterInfo")
    public final ImageFilterInfo filterInfo;

    @InterfaceC65349Pkn("id")
    public final String id;

    @InterfaceC65349Pkn("is_aigc_content")
    public int imageAIGCType;

    @InterfaceC65349Pkn("image_quality_info")
    public ImageQualityInfo imageQualityInfo;

    @InterfaceC65349Pkn("origin_album_image_data")
    public ImportVideoInfo originAlbumImageData;

    @InterfaceC65349Pkn("src_image_info")
    public final SrcImageInfo srcImageInfo;

    @InterfaceC65349Pkn("stickerInfo")
    public ImageStickerInfo stickerInfo;

    @InterfaceC65349Pkn("item_stickerInfo_new_engine")
    public ImageStickerInfoNewEngine stickerInfoNewEngine;

    @InterfaceC65349Pkn("synthesis_data")
    public ImageSynthesisResult synthesisData;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.id);
        this.srcImageInfo.writeToParcel(out, i);
        ImageBufferData imageBufferData = this.bufferData;
        if (imageBufferData == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            imageBufferData.writeToParcel(out, i);
        }
        this.editImageInfo.writeToParcel(out, i);
        this.filterInfo.writeToParcel(out, i);
        this.stickerInfo.writeToParcel(out, i);
        ImageStickerInfoNewEngine imageStickerInfoNewEngine = this.stickerInfoNewEngine;
        if (imageStickerInfoNewEngine == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            imageStickerInfoNewEngine.writeToParcel(out, i);
        }
        ImageSynthesisResult imageSynthesisResult = this.synthesisData;
        if (imageSynthesisResult == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            imageSynthesisResult.writeToParcel(out, i);
        }
        ImageQualityInfo imageQualityInfo = this.imageQualityInfo;
        if (imageQualityInfo == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            imageQualityInfo.writeToParcel(out, i);
        }
        out.writeInt(this.imageAIGCType);
        out.writeParcelable(this.originAlbumImageData, i);
    }

    public final boolean isEdited() {
        if ((!ujb.o.LJJJJJL(this.filterInfo.getFilterId())) || (!this.stickerInfo.getStickers().isEmpty()) || this.editImageInfo.getScaleAfterCrop() != null || this.editImageInfo.getOffsetX() != null || this.editImageInfo.getOffsetY() != null) {
            return true;
        }
        return false;
    }

    public final boolean isManualCrop() {
        if (this.editImageInfo.getScaleAfterCrop() != null) {
            return true;
        }
        return false;
    }

    public final ImageBufferData getBufferData() {
        return this.bufferData;
    }

    public final EditImageInfo getEditImageInfo() {
        return this.editImageInfo;
    }

    public final ImageFilterInfo getFilterInfo() {
        return this.filterInfo;
    }

    public final String getId() {
        return this.id;
    }

    public final int getImageAIGCType() {
        return this.imageAIGCType;
    }

    public final ImageQualityInfo getImageQualityInfo() {
        return this.imageQualityInfo;
    }

    public final ImportVideoInfo getOriginAlbumImageData() {
        return this.originAlbumImageData;
    }

    public final SrcImageInfo getSrcImageInfo() {
        return this.srcImageInfo;
    }

    public final ImageStickerInfo getStickerInfo() {
        return this.stickerInfo;
    }

    public final ImageStickerInfoNewEngine getStickerInfoNewEngine() {
        return this.stickerInfoNewEngine;
    }

    public final ImageSynthesisResult getSynthesisData() {
        return this.synthesisData;
    }

    public final void setImageAIGCType(int i) {
        this.imageAIGCType = i;
    }

    public final void setImageQualityInfo(ImageQualityInfo imageQualityInfo) {
        this.imageQualityInfo = imageQualityInfo;
    }

    public final void setOriginAlbumImageData(ImportVideoInfo importVideoInfo) {
        this.originAlbumImageData = importVideoInfo;
    }

    public final void setStickerInfo(ImageStickerInfo imageStickerInfo) {
        o.LJIIIZ(imageStickerInfo, "<set-?>");
        this.stickerInfo = imageStickerInfo;
    }

    public final void setStickerInfoNewEngine(ImageStickerInfoNewEngine imageStickerInfoNewEngine) {
        this.stickerInfoNewEngine = imageStickerInfoNewEngine;
    }

    public final void setSynthesisData(ImageSynthesisResult imageSynthesisResult) {
        this.synthesisData = imageSynthesisResult;
    }

    public final boolean isAutoCrop(ImageSurfaceData surfaceData, InterfaceC88471Ynr<? super Float, ? super Float, Float> calculateEditRatio) {
        boolean z;
        o.LJIIIZ(surfaceData, "surfaceData");
        o.LJIIIZ(calculateEditRatio, "calculateEditRatio");
        float imageRadio = this.srcImageInfo.getImageRadio();
        if (imageRadio == calculateEditRatio.invoke(Float.valueOf(surfaceData.getSurfaceViewRatio()), Float.valueOf(imageRadio)).floatValue()) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    public final boolean isCrop(ImageSurfaceData surfaceData, InterfaceC88471Ynr<? super Float, ? super Float, Float> calculateEditRatio) {
        o.LJIIIZ(surfaceData, "surfaceData");
        o.LJIIIZ(calculateEditRatio, "calculateEditRatio");
        if (isManualCrop() || isAutoCrop(surfaceData, calculateEditRatio)) {
            return true;
        }
        return false;
    }

    public SingleImageData(String str, SrcImageInfo srcImageInfo, ImageBufferData imageBufferData, EditImageInfo editImageInfo, ImageFilterInfo filterInfo, ImageStickerInfo stickerInfo, ImageStickerInfoNewEngine imageStickerInfoNewEngine, ImageSynthesisResult imageSynthesisResult, ImageQualityInfo imageQualityInfo, int i, ImportVideoInfo importVideoInfo) {
        o.LJIIIZ(srcImageInfo, "srcImageInfo");
        o.LJIIIZ(editImageInfo, "editImageInfo");
        o.LJIIIZ(filterInfo, "filterInfo");
        o.LJIIIZ(stickerInfo, "stickerInfo");
        this.id = str;
        this.srcImageInfo = srcImageInfo;
        this.bufferData = imageBufferData;
        this.editImageInfo = editImageInfo;
        this.filterInfo = filterInfo;
        this.stickerInfo = stickerInfo;
        this.stickerInfoNewEngine = imageStickerInfoNewEngine;
        this.synthesisData = imageSynthesisResult;
        this.imageQualityInfo = imageQualityInfo;
        this.imageAIGCType = i;
        this.originAlbumImageData = importVideoInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ SingleImageData(String str, SrcImageInfo srcImageInfo, ImageBufferData imageBufferData, EditImageInfo editImageInfo, ImageFilterInfo imageFilterInfo, ImageStickerInfo imageStickerInfo, ImageStickerInfoNewEngine imageStickerInfoNewEngine, ImageSynthesisResult imageSynthesisResult, ImageQualityInfo imageQualityInfo, int i, ImportVideoInfo importVideoInfo, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, srcImageInfo, imageBufferData, (i2 & 8) != 0 ? new EditImageInfo(0 == true ? 1 : 0, 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0.0f, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 4095, 0 == true ? 1 : 0) : editImageInfo, (i2 & 16) != 0 ? new ImageFilterInfo(null, null, 0.0f, false, null, false, 63, null) : imageFilterInfo, (i2 & 32) != 0 ? new ImageStickerInfo(new ArrayList()) : imageStickerInfo, (i2 & 64) != 0 ? null : imageStickerInfoNewEngine, (i2 & 128) != 0 ? null : imageSynthesisResult, (i2 & 256) != 0 ? null : imageQualityInfo, (i2 & 512) != 0 ? 0 : i, (i2 & 1024) == 0 ? importVideoInfo : null);
    }
}
