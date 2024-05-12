package com.bytedance.android.livesdk.interaction.drawguess.network;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdkapi.depend.model.live.PictionaryStatistics;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class DrawGuessEndResponse extends F9E {

    @InterfaceC65349Pkn("pictionary_statistics")
    public final PictionaryStatistics statistics;

    /* JADX WARN: Multi-variable type inference failed */
    public DrawGuessEndResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.statistics};
    }

    public DrawGuessEndResponse(PictionaryStatistics statistics) {
        o.LJIIIZ(statistics, "statistics");
        this.statistics = statistics;
    }

    public /* synthetic */ DrawGuessEndResponse(PictionaryStatistics pictionaryStatistics, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new PictionaryStatistics(0L, 0L, null, 7, null) : pictionaryStatistics);
    }
}
