package com.ss.android.ugc.aweme.publish.model;

import X.InterfaceC65349Pkn;
import X.Q89;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.shortvideo.model.PublishImageModel;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public class VideoCreation extends BaseResponse {
    public PublishImageModel imageCoverModel;
    public List<PublishImageModel> imageGroup = new ArrayList();
    public String mCoverTextImageUri;
    public String mCoverUri;

    @InterfaceC65349Pkn("material_id")
    public String materialId;
    public int videoHeight;
    public int videoWidth;

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoCreation{mCoverUri='");
        Q89.LIZIZ(LIZ, this.mCoverUri, '\'', ", videoWidth=");
        LIZ.append(this.videoWidth);
        LIZ.append(", videoHeight=");
        LIZ.append(this.videoHeight);
        LIZ.append(", mCoverTextImageUri='");
        Q89.LIZIZ(LIZ, this.mCoverTextImageUri, '\'', ", materialId='");
        Q89.LIZIZ(LIZ, this.materialId, '\'', ", imageGroup='");
        LIZ.append(this.imageGroup);
        LIZ.append('\'');
        LIZ.append(", imageCoverModel='");
        LIZ.append(this.imageCoverModel);
        LIZ.append('\'');
        LIZ.append(", status_code=");
        LIZ.append(this.status_code);
        LIZ.append(", error_code=");
        LIZ.append(this.error_code);
        LIZ.append(", message='");
        Q89.LIZIZ(LIZ, this.message, '\'', ", status_msg='");
        Q89.LIZIZ(LIZ, this.status_msg, '\'', ", prompts='");
        Q89.LIZIZ(LIZ, this.prompts, '\'', ", extra=");
        LIZ.append(this.extra);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public String getCoverTextImageUri() {
        return this.mCoverTextImageUri;
    }

    public String getCoverUri() {
        return this.mCoverUri;
    }

    public PublishImageModel getImageCoverModel() {
        return this.imageCoverModel;
    }

    public List<PublishImageModel> getImageGroup() {
        return this.imageGroup;
    }

    public String getMaterialId() {
        return this.materialId;
    }

    public int getVideoHeight() {
        return this.videoHeight;
    }

    public int getVideoWidth() {
        return this.videoWidth;
    }

    public VideoCreation setCoverTextImageUri(String str) {
        this.mCoverTextImageUri = str;
        return this;
    }

    public VideoCreation setCoverUri(String str) {
        this.mCoverUri = str;
        return this;
    }

    public void setImageCoverModel(PublishImageModel publishImageModel) {
        this.imageCoverModel = publishImageModel;
    }

    public void setImageGroup(List<PublishImageModel> list) {
        this.imageGroup = list;
    }

    public VideoCreation setMaterialId(String str) {
        this.materialId = str;
        return this;
    }

    public VideoCreation setVideoHeight(int i) {
        this.videoHeight = i;
        return this;
    }

    public VideoCreation setVideoWidth(int i) {
        this.videoWidth = i;
        return this;
    }
}
