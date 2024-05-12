package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* loaded from: classes11.dex */
public class ImageInfo implements Serializable {

    @InterfaceC65349Pkn("height")
    public int height;

    @InterfaceC65349Pkn("label_large")
    public UrlModel labelLarge;

    @InterfaceC65349Pkn("label_thumb")
    public UrlModel labelThumb;

    @InterfaceC65349Pkn("width")
    public int width;

    public int getHeight() {
        return this.height;
    }

    public UrlModel getLabelLarge() {
        return this.labelLarge;
    }

    public UrlModel getLabelThumb() {
        return this.labelThumb;
    }

    public int getWidth() {
        return this.width;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setLabelLarge(UrlModel urlModel) {
        this.labelLarge = urlModel;
    }

    public void setLabelThumb(UrlModel urlModel) {
        this.labelThumb = urlModel;
    }

    public void setWidth(int i) {
        this.width = i;
    }
}
