package com.ss.android.ugc.aweme.plugin.clienttrigger;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class BaseEventMatch {

    @InterfaceC65349Pkn("match_parameters")
    public final List<MatchProperty> matchProporties;

    @InterfaceC65349Pkn("name")
    public final String name;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseEventMatch)) {
            return false;
        }
        BaseEventMatch baseEventMatch = (BaseEventMatch) obj;
        return o.LJ(this.name, baseEventMatch.name) && o.LJ(this.matchProporties, baseEventMatch.matchProporties);
    }

    public final int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        List<MatchProperty> list = this.matchProporties;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BaseEventMatch(name=");
        LIZ.append(this.name);
        LIZ.append(", matchProporties=");
        return C1NE.LIZIZ(LIZ, this.matchProporties, ')', LIZ);
    }

    public BaseEventMatch(String name, List<MatchProperty> list) {
        o.LJIIIZ(name, "name");
        this.name = name;
        this.matchProporties = list;
    }

    public /* synthetic */ BaseEventMatch(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : list);
    }
}
