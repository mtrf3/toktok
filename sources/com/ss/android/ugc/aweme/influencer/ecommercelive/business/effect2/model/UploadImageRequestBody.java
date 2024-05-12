package com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class UploadImageRequestBody extends F9E {

    @InterfaceC65349Pkn("author_id")
    public final String authorId;

    @InterfaceC65349Pkn("image_url")
    public final String imageTosKey;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.authorId, this.imageTosKey};
    }

    public UploadImageRequestBody(String authorId, String imageTosKey) {
        o.LJIIIZ(authorId, "authorId");
        o.LJIIIZ(imageTosKey, "imageTosKey");
        this.authorId = authorId;
        this.imageTosKey = imageTosKey;
    }
}
