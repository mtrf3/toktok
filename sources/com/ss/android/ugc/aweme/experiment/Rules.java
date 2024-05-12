package com.ss.android.ugc.aweme.experiment;

import X.C61878OQg;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class Rules extends F9E {

    @InterfaceC65349Pkn("duration")
    public final List<Integer> duration;

    @InterfaceC65349Pkn("stage")
    public final List<Integer> stage;

    public Rules() {
        this(null, null, 3, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.stage, this.duration};
    }

    public Rules(List<Integer> stage, List<Integer> duration) {
        o.LJIIIZ(stage, "stage");
        o.LJIIIZ(duration, "duration");
        this.stage = stage;
        this.duration = duration;
    }

    public Rules(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C61878OQg.INSTANCE : list, (i & 2) != 0 ? C61878OQg.INSTANCE : list2);
    }
}