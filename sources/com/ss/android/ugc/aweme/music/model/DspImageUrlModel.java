package com.ss.android.ugc.aweme.music.model;

import com.ss.android.ugc.aweme.base.ImageUrlModel;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class DspImageUrlModel implements Serializable {
    public static final Companion Companion = new Companion();
    public final String uri;
    public final ArrayList<String> urls;

    public final ImageUrlModel getImageUrl() {
        return new ImageUrlModel(this.uri, this.urls);
    }

    /* loaded from: classes11.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final DspImageUrlModel toDspImageUrlMode(ImageUrlModel imageUrlModel) {
            o.LJIIIZ(imageUrlModel, "<this>");
            return new DspImageUrlModel(imageUrlModel, null, 0 == true ? 1 : 0, 6, 0 == true ? 1 : 0);
        }
    }

    public final String getUri() {
        return this.uri;
    }

    public final ArrayList<String> getUrls() {
        return this.urls;
    }

    public DspImageUrlModel(ImageUrlModel urlModel, String uri, ArrayList<String> urls) {
        o.LJIIIZ(urlModel, "urlModel");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(urls, "urls");
        this.uri = uri;
        this.urls = urls;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ DspImageUrlModel(com.ss.android.ugc.aweme.base.ImageUrlModel r2, java.lang.String r3, java.util.ArrayList r4, int r5, kotlin.jvm.internal.DefaultConstructorMarker r6) {
        /*
            r1 = this;
            r0 = r5 & 2
            if (r0 == 0) goto Lb
            java.lang.String r3 = r2.mUri
            java.lang.String r0 = "urlModel.uri"
            kotlin.jvm.internal.o.LJIIIIZZ(r3, r0)
        Lb:
            r0 = r5 & 4
            if (r0 == 0) goto L16
            java.util.ArrayList r4 = new java.util.ArrayList
            java.util.List<java.lang.String> r0 = r2.mUrls
            r4.<init>(r0)
        L16:
            r1.<init>(r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.model.DspImageUrlModel.<init>(com.ss.android.ugc.aweme.base.ImageUrlModel, java.lang.String, java.util.ArrayList, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
