package com.ss.android.ugc.aweme.plugin.clienttrigger;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class StateNodeProperties extends F9E {

    @InterfaceC65349Pkn("matches")
    public final List<EventMatch> matches;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.matches};
    }

    public StateNodeProperties(List<EventMatch> matches) {
        o.LJIIIZ(matches, "matches");
        this.matches = matches;
    }
}
