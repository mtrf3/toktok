package com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class GiphyDataBean {

    @InterfaceC65349Pkn("analytics")
    public final GiphyAnalyticsBean analytics;

    @InterfaceC65349Pkn("id")
    public final String id;

    @InterfaceC65349Pkn("images")
    public final GiphyImagesBean images;

    @InterfaceC65349Pkn("title")
    public final String title;

    @InterfaceC65349Pkn("type")
    public final String type;

    /* JADX WARN: Multi-variable type inference failed */
    public GiphyDataBean() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiphyDataBean)) {
            return false;
        }
        GiphyDataBean giphyDataBean = (GiphyDataBean) obj;
        return o.LJ(this.type, giphyDataBean.type) && o.LJ(this.id, giphyDataBean.id) && o.LJ(this.images, giphyDataBean.images) && o.LJ(this.title, giphyDataBean.title) && o.LJ(this.analytics, giphyDataBean.analytics);
    }

    public final int hashCode() {
        String str = this.type;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.id;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        GiphyImagesBean giphyImagesBean = this.images;
        int hashCode3 = (hashCode2 + (giphyImagesBean == null ? 0 : giphyImagesBean.hashCode())) * 31;
        String str3 = this.title;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        GiphyAnalyticsBean giphyAnalyticsBean = this.analytics;
        return hashCode4 + (giphyAnalyticsBean != null ? giphyAnalyticsBean.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GiphyDataBean(type=");
        LIZ.append(this.type);
        LIZ.append(", id=");
        LIZ.append(this.id);
        LIZ.append(", images=");
        LIZ.append(this.images);
        LIZ.append(", title=");
        LIZ.append(this.title);
        LIZ.append(", analytics=");
        LIZ.append(this.analytics);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public GiphyDataBean(String str, String str2, GiphyImagesBean giphyImagesBean, String str3, GiphyAnalyticsBean giphyAnalyticsBean) {
        this.type = str;
        this.id = str2;
        this.images = giphyImagesBean;
        this.title = str3;
        this.analytics = giphyAnalyticsBean;
    }

    public /* synthetic */ GiphyDataBean(String str, String str2, GiphyImagesBean giphyImagesBean, String str3, GiphyAnalyticsBean giphyAnalyticsBean, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : giphyImagesBean, (i & 8) != 0 ? null : str3, (i & 16) == 0 ? giphyAnalyticsBean : null);
    }
}
