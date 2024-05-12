package com.ss.android.ugc.aweme.emoji.stickerstore.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class StickerUrlStruct implements Serializable {

    @InterfaceC65349Pkn("high_resolution_url")
    public final UrlModel highResolutionUrl;

    @InterfaceC65349Pkn("low_resolution_url")
    public final UrlModel lowResolutionUrl;

    @InterfaceC65349Pkn("mid_resolution_url")
    public final UrlModel midResolutionUrl;

    @InterfaceC65349Pkn("uri")
    public final String uri;

    /* JADX WARN: Multi-variable type inference failed */
    public StickerUrlStruct() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ StickerUrlStruct copy$default(StickerUrlStruct stickerUrlStruct, UrlModel urlModel, UrlModel urlModel2, UrlModel urlModel3, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            urlModel = stickerUrlStruct.lowResolutionUrl;
        }
        if ((i & 2) != 0) {
            urlModel2 = stickerUrlStruct.midResolutionUrl;
        }
        if ((i & 4) != 0) {
            urlModel3 = stickerUrlStruct.highResolutionUrl;
        }
        if ((i & 8) != 0) {
            str = stickerUrlStruct.uri;
        }
        return stickerUrlStruct.copy(urlModel, urlModel2, urlModel3, str);
    }

    public final StickerUrlStruct copy(UrlModel urlModel, UrlModel urlModel2, UrlModel urlModel3, String str) {
        return new StickerUrlStruct(urlModel, urlModel2, urlModel3, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickerUrlStruct)) {
            return false;
        }
        StickerUrlStruct stickerUrlStruct = (StickerUrlStruct) obj;
        return o.LJ(this.lowResolutionUrl, stickerUrlStruct.lowResolutionUrl) && o.LJ(this.midResolutionUrl, stickerUrlStruct.midResolutionUrl) && o.LJ(this.highResolutionUrl, stickerUrlStruct.highResolutionUrl) && o.LJ(this.uri, stickerUrlStruct.uri);
    }

    public int hashCode() {
        UrlModel urlModel = this.lowResolutionUrl;
        int hashCode = (urlModel == null ? 0 : urlModel.hashCode()) * 31;
        UrlModel urlModel2 = this.midResolutionUrl;
        int hashCode2 = (hashCode + (urlModel2 == null ? 0 : urlModel2.hashCode())) * 31;
        UrlModel urlModel3 = this.highResolutionUrl;
        int hashCode3 = (hashCode2 + (urlModel3 == null ? 0 : urlModel3.hashCode())) * 31;
        String str = this.uri;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StickerUrlStruct(lowResolutionUrl=");
        LIZ.append(this.lowResolutionUrl);
        LIZ.append(", midResolutionUrl=");
        LIZ.append(this.midResolutionUrl);
        LIZ.append(", highResolutionUrl=");
        LIZ.append(this.highResolutionUrl);
        LIZ.append(", uri=");
        return q.LIZIZ(LIZ, this.uri, ')', LIZ);
    }

    public final UrlModel getHighResolutionUrl() {
        return this.highResolutionUrl;
    }

    public final UrlModel getLowResolutionUrl() {
        return this.lowResolutionUrl;
    }

    public final UrlModel getMidResolutionUrl() {
        return this.midResolutionUrl;
    }

    public final String getUri() {
        return this.uri;
    }

    public StickerUrlStruct(UrlModel urlModel, UrlModel urlModel2, UrlModel urlModel3, String str) {
        this.lowResolutionUrl = urlModel;
        this.midResolutionUrl = urlModel2;
        this.highResolutionUrl = urlModel3;
        this.uri = str;
    }

    public /* synthetic */ StickerUrlStruct(UrlModel urlModel, UrlModel urlModel2, UrlModel urlModel3, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : urlModel, (i & 2) != 0 ? null : urlModel2, (i & 4) != 0 ? null : urlModel3, (i & 8) != 0 ? null : str);
    }
}
