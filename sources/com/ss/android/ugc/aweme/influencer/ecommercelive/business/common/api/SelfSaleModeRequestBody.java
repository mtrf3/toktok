package com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.api;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class SelfSaleModeRequestBody extends F9E {

    @InterfaceC65349Pkn("creator_id")
    public final String authorId;

    @InterfaceC65349Pkn("source_type")
    public final int sourceType;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.authorId, Integer.valueOf(this.sourceType)};
    }

    public SelfSaleModeRequestBody(String authorId, int i) {
        o.LJIIIZ(authorId, "authorId");
        this.authorId = authorId;
        this.sourceType = i;
    }
}
