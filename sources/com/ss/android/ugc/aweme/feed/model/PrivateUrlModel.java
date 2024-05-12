package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;

/* loaded from: classes13.dex */
public class PrivateUrlModel extends BaseResponse {

    @InterfaceC65349Pkn("hybrid_label")
    public List<AwemeHybridLabelModel> hybridLabels;

    @InterfaceC65349Pkn("label_private")
    public UrlModel labelPrivate;

    @InterfaceC65349Pkn("video_text")
    public List<AwemeTextLabelModel> textVideoLabels;
}
