package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* loaded from: classes4.dex */
public class AwemeLabelModel implements Serializable {

    @InterfaceC65349Pkn("label_type")
    public int labelType;

    @InterfaceC65349Pkn("label_url")
    public UrlModel urlModels;

    public AwemeLabelModel() {
    }

    public int getLabelType() {
        return this.labelType;
    }

    public UrlModel getUrlModels() {
        return this.urlModels;
    }

    public void setLabelType(int i) {
        this.labelType = i;
    }

    public void setUrlModels(UrlModel urlModel) {
        this.urlModels = urlModel;
    }

    public AwemeLabelModel(UrlModel urlModel, int i) {
        this.urlModels = urlModel;
        this.labelType = i;
    }
}
