package com.bytedance.android.live.base.model.user;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;

/* loaded from: classes.dex */
public class SubscribeBadge {

    @InterfaceC65349Pkn("origin_img")
    public ImageModel originImage;

    @InterfaceC65349Pkn("preview_img")
    public ImageModel previewImage;

    public ImageModel getOriginImage() {
        return this.originImage;
    }

    public ImageModel getPreviewImage() {
        return this.previewImage;
    }

    public void setOriginImage(ImageModel imageModel) {
        this.originImage = imageModel;
    }

    public void setPreviewImage(ImageModel imageModel) {
        this.previewImage = imageModel;
    }
}
