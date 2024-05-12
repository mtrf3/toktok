package com.ss.android.ugc.aweme.qnasearch.api;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class QnaSearchSuggestionLogPb extends F9E {

    @InterfaceC65349Pkn("impr_id")
    public final String imprId;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.imprId};
    }

    public QnaSearchSuggestionLogPb(String imprId) {
        o.LJIIIZ(imprId, "imprId");
        this.imprId = imprId;
    }
}
