package com.ss.android.ugc.aweme.search.lynx.core.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* loaded from: classes9.dex */
public final class LynxImageUrl implements Serializable {
    public static final int $stable = 8;

    @InterfaceC65349Pkn("hot_link")
    public String imageUrl;

    @InterfaceC65349Pkn(alternate = {"avatar_thumb", "icon"}, value = "cover_thumb")
    public UrlModel urlModel;

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final UrlModel getUrlModel() {
        return this.urlModel;
    }

    public final void setImageUrl(String str) {
        this.imageUrl = str;
    }

    public final void setUrlModel(UrlModel urlModel) {
        this.urlModel = urlModel;
    }
}
