package com.ss.android.ugc.aweme.discover.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* loaded from: classes4.dex */
public class CategoryCoverStruct implements Serializable {
    public static final long serialVersionUID = 1;

    @InterfaceC65349Pkn("aweme_id")
    public String awemeId;

    @InterfaceC65349Pkn("cover")
    public UrlModel cover;

    @InterfaceC65349Pkn("dynamic_cover")
    public UrlModel dynamicCover;

    public String getAwemeId() {
        return this.awemeId;
    }

    public UrlModel getCover() {
        return this.cover;
    }

    public UrlModel getDynamicCover() {
        return this.dynamicCover;
    }

    public void setAwemeId(String str) {
        this.awemeId = str;
    }

    public void setCover(UrlModel urlModel) {
        this.cover = urlModel;
    }

    public void setDynamicCover(UrlModel urlModel) {
        this.dynamicCover = urlModel;
    }
}
