package com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class GiphyAnalyticsBean {

    @InterfaceC65349Pkn("onclick")
    public final GiphyOnclickBean onclick;

    /* JADX WARN: Multi-variable type inference failed */
    public GiphyAnalyticsBean() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GiphyAnalyticsBean) && o.LJ(this.onclick, ((GiphyAnalyticsBean) obj).onclick);
    }

    public final int hashCode() {
        GiphyOnclickBean giphyOnclickBean = this.onclick;
        if (giphyOnclickBean == null) {
            return 0;
        }
        return giphyOnclickBean.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GiphyAnalyticsBean(onclick=");
        LIZ.append(this.onclick);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public GiphyAnalyticsBean(GiphyOnclickBean giphyOnclickBean) {
        this.onclick = giphyOnclickBean;
    }

    public /* synthetic */ GiphyAnalyticsBean(GiphyOnclickBean giphyOnclickBean, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : giphyOnclickBean);
    }
}
