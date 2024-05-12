package com.ss.android.ugc.aweme.plugin.clienttrigger;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EventMatch {

    @InterfaceC65349Pkn("event_count")
    public Integer eventCount;

    @InterfaceC65349Pkn("match_parameters")
    public final List<MatchProperty> matchProporties;

    @InterfaceC65349Pkn("name")
    public final String name;

    @InterfaceC65349Pkn("next_node_id")
    public final int nextNodeId;

    @InterfaceC65349Pkn("number_matches_left")
    public Integer numMatchesLeft;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventMatch)) {
            return false;
        }
        EventMatch eventMatch = (EventMatch) obj;
        return o.LJ(this.name, eventMatch.name) && o.LJ(this.matchProporties, eventMatch.matchProporties) && this.nextNodeId == eventMatch.nextNodeId && o.LJ(this.eventCount, eventMatch.eventCount) && o.LJ(this.numMatchesLeft, eventMatch.numMatchesLeft);
    }

    public final int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        List<MatchProperty> list = this.matchProporties;
        int hashCode2 = (((hashCode + (list == null ? 0 : list.hashCode())) * 31) + this.nextNodeId) * 31;
        Integer num = this.eventCount;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.numMatchesLeft;
        return hashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EventMatch(name=");
        LIZ.append(this.name);
        LIZ.append(", matchProporties=");
        LIZ.append(this.matchProporties);
        LIZ.append(", nextNodeId=");
        LIZ.append(this.nextNodeId);
        LIZ.append(", eventCount=");
        LIZ.append(this.eventCount);
        LIZ.append(", numMatchesLeft=");
        return s0.LIZJ(LIZ, this.numMatchesLeft, ')', LIZ);
    }

    public EventMatch(String name, List<MatchProperty> list, int i, Integer num, Integer num2) {
        o.LJIIIZ(name, "name");
        this.name = name;
        this.matchProporties = list;
        this.nextNodeId = i;
        this.eventCount = num;
        this.numMatchesLeft = num2;
    }

    public /* synthetic */ EventMatch(String str, List list, int i, Integer num, Integer num2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? null : list, i, num, (i2 & 16) == 0 ? num2 : null);
    }
}
