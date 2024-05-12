package com.ss.android.ugc.aweme.comment.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class GifEmoji implements Serializable {

    @InterfaceC65349Pkn("id")
    public final String id = "";

    @InterfaceC65349Pkn("image_id")
    public final long imageId;
    public LogPbBean logPb;

    @InterfaceC65349Pkn("origin")
    public final UrlModel origin;

    @InterfaceC65349Pkn("stcker_type")
    public final int stickerType;

    @InterfaceC65349Pkn("thumbnail")
    public final UrlModel thumbnail;

    public final String getId() {
        return this.id;
    }

    public final long getImageId() {
        return this.imageId;
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final UrlModel getOrigin() {
        return this.origin;
    }

    public final int getStickerType() {
        return this.stickerType;
    }

    public final UrlModel getThumbnail() {
        return this.thumbnail;
    }

    public final void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }
}
