package com.ss.android.ugc.aweme.feed.model;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PhotoModeImageUrlModel implements Serializable {
    public int adaptMultiRateErrCode;

    @InterfaceC65349Pkn("bitrate_images")
    public List<MultiImageUrlInfo> bitrateImages;

    @InterfaceC65349Pkn("display_image")
    public UrlModel displayImageNoWatermark;
    public String gearName;

    @InterfaceC65349Pkn("owner_watermark_image")
    public UrlModel ownerWatermarkImage;
    public PhotoSourceFromScene sourceFrom;
    public UrlModel targetMultiRateImageUrl;

    @InterfaceC65349Pkn("thumbnail")
    public UrlModel thumbnail;

    @InterfaceC65349Pkn("user_watermark_image")
    public UrlModel userWatermarkImage;

    public PhotoModeImageUrlModel() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PhotoModeImageUrlModel copy$default(PhotoModeImageUrlModel photoModeImageUrlModel, UrlModel urlModel, UrlModel urlModel2, UrlModel urlModel3, UrlModel urlModel4, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            urlModel = photoModeImageUrlModel.displayImageNoWatermark;
        }
        if ((i & 2) != 0) {
            urlModel2 = photoModeImageUrlModel.ownerWatermarkImage;
        }
        if ((i & 4) != 0) {
            urlModel3 = photoModeImageUrlModel.userWatermarkImage;
        }
        if ((i & 8) != 0) {
            urlModel4 = photoModeImageUrlModel.thumbnail;
        }
        if ((i & 16) != 0) {
            list = photoModeImageUrlModel.bitrateImages;
        }
        return photoModeImageUrlModel.copy(urlModel, urlModel2, urlModel3, urlModel4, list);
    }

    public final PhotoModeImageUrlModel copy(UrlModel urlModel, UrlModel ownerWatermarkImage, UrlModel userWatermarkImage, UrlModel thumbnail, List<MultiImageUrlInfo> list) {
        o.LJIIIZ(ownerWatermarkImage, "ownerWatermarkImage");
        o.LJIIIZ(userWatermarkImage, "userWatermarkImage");
        o.LJIIIZ(thumbnail, "thumbnail");
        return new PhotoModeImageUrlModel(urlModel, ownerWatermarkImage, userWatermarkImage, thumbnail, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotoModeImageUrlModel)) {
            return false;
        }
        PhotoModeImageUrlModel photoModeImageUrlModel = (PhotoModeImageUrlModel) obj;
        return o.LJ(this.displayImageNoWatermark, photoModeImageUrlModel.displayImageNoWatermark) && o.LJ(this.ownerWatermarkImage, photoModeImageUrlModel.ownerWatermarkImage) && o.LJ(this.userWatermarkImage, photoModeImageUrlModel.userWatermarkImage) && o.LJ(this.thumbnail, photoModeImageUrlModel.thumbnail) && o.LJ(this.bitrateImages, photoModeImageUrlModel.bitrateImages);
    }

    public int hashCode() {
        UrlModel urlModel = this.displayImageNoWatermark;
        int hashCode = (this.thumbnail.hashCode() + ((this.userWatermarkImage.hashCode() + ((this.ownerWatermarkImage.hashCode() + ((urlModel == null ? 0 : urlModel.hashCode()) * 31)) * 31)) * 31)) * 31;
        List<MultiImageUrlInfo> list = this.bitrateImages;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final boolean needSupportMultiRateSelect() {
        if (this.sourceFrom != PhotoSourceFromScene.PUBLISH) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PhotoModeImageUrlModel(displayImageNoWatermark=");
        LIZ.append(this.displayImageNoWatermark);
        LIZ.append(", ownerWatermarkImage=");
        LIZ.append(this.ownerWatermarkImage);
        LIZ.append(", userWatermarkImage=");
        LIZ.append(this.userWatermarkImage);
        LIZ.append(", thumbnail=");
        LIZ.append(this.thumbnail);
        LIZ.append(", bitrateImages=");
        return C1NE.LIZIZ(LIZ, this.bitrateImages, ')', LIZ);
    }

    public final int getAdaptMultiRateErrCode() {
        return this.adaptMultiRateErrCode;
    }

    public final List<MultiImageUrlInfo> getBitrateImages() {
        return this.bitrateImages;
    }

    public final UrlModel getDisplayImageNoWatermark() {
        return this.displayImageNoWatermark;
    }

    public final String getGearName() {
        return this.gearName;
    }

    public final UrlModel getOwnerWatermarkImage() {
        return this.ownerWatermarkImage;
    }

    public final PhotoSourceFromScene getSourceFrom() {
        return this.sourceFrom;
    }

    public final UrlModel getTargetMultiRateImageUrl() {
        return this.targetMultiRateImageUrl;
    }

    public final UrlModel getThumbnail() {
        return this.thumbnail;
    }

    public final UrlModel getUserWatermarkImage() {
        return this.userWatermarkImage;
    }

    public final void setAdaptMultiRateErrCode(int i) {
        this.adaptMultiRateErrCode = i;
    }

    public final void setGearName(String str) {
        this.gearName = str;
    }

    public final void setSourceFrom(PhotoSourceFromScene photoSourceFromScene) {
        o.LJIIIZ(photoSourceFromScene, "<set-?>");
        this.sourceFrom = photoSourceFromScene;
    }

    public final void setTargetMultiRateImageUrl(UrlModel urlModel) {
        this.targetMultiRateImageUrl = urlModel;
    }

    public PhotoModeImageUrlModel(UrlModel urlModel, UrlModel ownerWatermarkImage, UrlModel userWatermarkImage, UrlModel thumbnail, List<MultiImageUrlInfo> list) {
        o.LJIIIZ(ownerWatermarkImage, "ownerWatermarkImage");
        o.LJIIIZ(userWatermarkImage, "userWatermarkImage");
        o.LJIIIZ(thumbnail, "thumbnail");
        this.displayImageNoWatermark = urlModel;
        this.ownerWatermarkImage = ownerWatermarkImage;
        this.userWatermarkImage = userWatermarkImage;
        this.thumbnail = thumbnail;
        this.bitrateImages = list;
        this.adaptMultiRateErrCode = MultiBitrateAdapterErrorCode.DEFAULT_CODE.getCode();
        this.sourceFrom = PhotoSourceFromScene.DEFAULT;
    }

    public /* synthetic */ PhotoModeImageUrlModel(UrlModel urlModel, UrlModel urlModel2, UrlModel urlModel3, UrlModel urlModel4, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(urlModel, urlModel2, urlModel3, urlModel4, (i & 16) != 0 ? null : list);
    }
}
