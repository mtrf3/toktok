package com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class GiphyGifsResponse {

    @InterfaceC65349Pkn("resources")
    public final GiphyResourcesBean giphyResources;

    @InterfaceC65349Pkn("status_code")
    public final Integer statusCode;

    @InterfaceC65349Pkn("status_msg")
    public final String statusMsg;

    /* JADX WARN: Multi-variable type inference failed */
    public GiphyGifsResponse() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiphyGifsResponse)) {
            return false;
        }
        GiphyGifsResponse giphyGifsResponse = (GiphyGifsResponse) obj;
        return o.LJ(this.statusCode, giphyGifsResponse.statusCode) && o.LJ(this.statusMsg, giphyGifsResponse.statusMsg) && o.LJ(this.giphyResources, giphyGifsResponse.giphyResources);
    }

    public final int hashCode() {
        Integer num = this.statusCode;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.statusMsg;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        GiphyResourcesBean giphyResourcesBean = this.giphyResources;
        return hashCode2 + (giphyResourcesBean != null ? giphyResourcesBean.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GiphyGifsResponse(statusCode=");
        LIZ.append(this.statusCode);
        LIZ.append(", statusMsg=");
        LIZ.append(this.statusMsg);
        LIZ.append(", giphyResources=");
        LIZ.append(this.giphyResources);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public GiphyGifsResponse(Integer num, String str, GiphyResourcesBean giphyResourcesBean) {
        this.statusCode = num;
        this.statusMsg = str;
        this.giphyResources = giphyResourcesBean;
    }

    public /* synthetic */ GiphyGifsResponse(Integer num, String str, GiphyResourcesBean giphyResourcesBean, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : giphyResourcesBean);
    }
}
