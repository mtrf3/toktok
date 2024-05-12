package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class InputReason extends F9E {

    @InterfaceC65349Pkn("content")
    public final String content;

    @InterfaceC65349Pkn("reason_key")
    public final String reasonKey;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.reasonKey, this.content};
    }

    public InputReason(String reasonKey, String content) {
        o.LJIIIZ(reasonKey, "reasonKey");
        o.LJIIIZ(content, "content");
        this.reasonKey = reasonKey;
        this.content = content;
    }
}
