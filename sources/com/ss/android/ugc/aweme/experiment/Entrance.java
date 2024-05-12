package com.ss.android.ugc.aweme.experiment;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class Entrance extends F9E {

    @InterfaceC65349Pkn("candidates")
    public final List<Candidate> candidates;

    @InterfaceC65349Pkn("show_limit")
    public final int showLimit;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.showLimit), this.candidates};
    }

    public Entrance(int i, List<Candidate> candidates) {
        o.LJIIIZ(candidates, "candidates");
        this.showLimit = i;
        this.candidates = candidates;
    }
}
