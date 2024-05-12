package com.bytedance.android.livesdk.interaction.drawguess.network;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdkapi.depend.model.live.PictionaryFullInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class DrawGuessSummaryResponse extends F9E {

    @InterfaceC65349Pkn("pictionary_list")
    public final List<PictionaryFullInfo> pictionaryList;

    /* JADX WARN: Multi-variable type inference failed */
    public DrawGuessSummaryResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.pictionaryList};
    }

    public DrawGuessSummaryResponse(List<PictionaryFullInfo> pictionaryList) {
        o.LJIIIZ(pictionaryList, "pictionaryList");
        this.pictionaryList = pictionaryList;
    }

    public /* synthetic */ DrawGuessSummaryResponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list);
    }
}
