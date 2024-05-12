package com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model;

import X.C770830u;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SingleLive {

    @InterfaceC65349Pkn("aweme_info")
    public final Aweme aweme;

    /* JADX WARN: Multi-variable type inference failed */
    public SingleLive() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SingleLive) && o.LJ(this.aweme, ((SingleLive) obj).aweme);
    }

    public final int hashCode() {
        Aweme aweme = this.aweme;
        if (aweme == null) {
            return 0;
        }
        return aweme.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SingleLive(aweme=");
        return C770830u.LIZ(LIZ, this.aweme, ')', LIZ);
    }

    public SingleLive(Aweme aweme) {
        this.aweme = aweme;
    }

    public /* synthetic */ SingleLive(Aweme aweme, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : aweme);
    }
}
