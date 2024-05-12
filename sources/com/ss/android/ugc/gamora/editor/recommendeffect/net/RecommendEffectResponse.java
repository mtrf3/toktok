package com.ss.android.ugc.gamora.editor.recommendeffect.net;

import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class RecommendEffectResponse {

    @InterfaceC65349Pkn("effect_infos")
    public final List<RecommendEffectItem> effectInfoList;

    @InterfaceC65349Pkn("status_code")
    public final Integer statusCode;

    public RecommendEffectResponse(Integer num, List<RecommendEffectItem> effectInfoList) {
        o.LJIIIZ(effectInfoList, "effectInfoList");
        this.statusCode = num;
        this.effectInfoList = effectInfoList;
    }

    public /* synthetic */ RecommendEffectResponse(Integer num, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, list);
    }
}
