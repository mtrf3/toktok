package com.ss.android.ugc.aweme.comment.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* loaded from: classes4.dex */
public final class CommentImageStruct implements Serializable {

    @InterfaceC65349Pkn("crop_url")
    public UrlModel cropUrl;

    @InterfaceC65349Pkn("origin_url")
    public UrlModel originUrl;
    public transient int progress = 100;

    public final UrlModel getCropUrl() {
        return this.cropUrl;
    }

    public final UrlModel getOriginUrl() {
        return this.originUrl;
    }

    public final int getProgress() {
        return this.progress;
    }

    public final void setCropUrl(UrlModel urlModel) {
        this.cropUrl = urlModel;
    }

    public final void setOriginUrl(UrlModel urlModel) {
        this.originUrl = urlModel;
    }

    public final void setProgress(int i) {
        this.progress = i;
    }
}
