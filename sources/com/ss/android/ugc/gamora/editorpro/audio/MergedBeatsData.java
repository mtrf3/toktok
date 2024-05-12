package com.ss.android.ugc.gamora.editorpro.audio;

import X.C61878OQg;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class MergedBeatsData extends F9E {

    @InterfaceC65349Pkn("time")
    public final List<Integer> time;

    @InterfaceC65349Pkn("value")
    public final List<Integer> value;

    public MergedBeatsData() {
        this(null, null, 3, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.time, this.value};
    }

    public MergedBeatsData(List<Integer> time, List<Integer> value) {
        o.LJIIIZ(time, "time");
        o.LJIIIZ(value, "value");
        this.time = time;
        this.value = value;
    }

    public MergedBeatsData(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C61878OQg.INSTANCE : list, (i & 2) != 0 ? C61878OQg.INSTANCE : list2);
    }
}
