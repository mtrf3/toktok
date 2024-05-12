package com.ss.android.ugc.aweme.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class InsightTypeRequest extends F9E {

    @InterfaceC65349Pkn("aweme_id")
    public final String awemeId;

    @InterfaceC65349Pkn("insigh_type")
    public final String insightType;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.insightType, this.awemeId};
    }

    public InsightTypeRequest(String insightType, String awemeId) {
        o.LJIIIZ(insightType, "insightType");
        o.LJIIIZ(awemeId, "awemeId");
        this.insightType = insightType;
        this.awemeId = awemeId;
    }
}
