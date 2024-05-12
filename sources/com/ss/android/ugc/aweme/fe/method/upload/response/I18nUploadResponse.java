package com.ss.android.ugc.aweme.fe.method.upload.response;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.model.UrlModel;

/* loaded from: classes16.dex */
public final class I18nUploadResponse extends BaseResponse {

    @InterfaceC65349Pkn("cover")
    public UrlModel cover;

    @InterfaceC65349Pkn("video")
    public UrlModel video;

    public final UrlModel getCover() {
        return this.cover;
    }

    public final UrlModel getVideo() {
        return this.video;
    }

    public final void setCover(UrlModel urlModel) {
        this.cover = urlModel;
    }

    public final void setVideo(UrlModel urlModel) {
        this.video = urlModel;
    }
}
