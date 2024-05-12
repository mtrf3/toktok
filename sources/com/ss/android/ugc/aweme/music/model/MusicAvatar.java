package com.ss.android.ugc.aweme.music.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* loaded from: classes13.dex */
public final class MusicAvatar implements Serializable {

    @InterfaceC65349Pkn("hd")
    public UrlModel hd;

    @InterfaceC65349Pkn("large")
    public UrlModel large;

    @InterfaceC65349Pkn("medium")
    public UrlModel medium;

    @InterfaceC65349Pkn("thumb")
    public UrlModel thumb;

    @InterfaceC65349Pkn("thumbnail")
    public UrlModel thumbnail;

    public final UrlModel getHd() {
        return this.hd;
    }

    public final UrlModel getLarge() {
        return this.large;
    }

    public final UrlModel getMedium() {
        return this.medium;
    }

    public final UrlModel getThumb() {
        return this.thumb;
    }

    public final UrlModel getThumbnail() {
        return this.thumbnail;
    }
}
