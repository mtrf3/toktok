package com.ss.android.ugc.aweme.search.arch.v2.docker.components.querycorrect;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class HighlightPosition extends F9E {

    @InterfaceC65349Pkn("positions")
    public final List<Position> positions;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.positions};
    }

    public HighlightPosition(List<Position> positions) {
        o.LJIIIZ(positions, "positions");
        this.positions = positions;
    }
}
