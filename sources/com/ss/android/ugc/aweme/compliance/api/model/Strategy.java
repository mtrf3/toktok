package com.ss.android.ugc.aweme.compliance.api.model;

import X.C1NE;
import X.C61878OQg;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class Strategy implements Serializable {

    @InterfaceC65349Pkn("action")
    public final Integer action;

    @InterfaceC65349Pkn("conditions")
    public final List<Condition> conditions;

    @InterfaceC65349Pkn("domains")
    public final List<String> domains;

    public Strategy() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Strategy copy$default(Strategy strategy, Integer num, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = strategy.action;
        }
        if ((i & 2) != 0) {
            list = strategy.conditions;
        }
        if ((i & 4) != 0) {
            list2 = strategy.domains;
        }
        return strategy.copy(num, list, list2);
    }

    public final Strategy copy(Integer num, List<Condition> list, List<String> list2) {
        return new Strategy(num, list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Strategy)) {
            return false;
        }
        Strategy strategy = (Strategy) obj;
        return o.LJ(this.action, strategy.action) && o.LJ(this.conditions, strategy.conditions) && o.LJ(this.domains, strategy.domains);
    }

    public int hashCode() {
        Integer num = this.action;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<Condition> list = this.conditions;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.domains;
        return hashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Strategy(action=");
        LIZ.append(this.action);
        LIZ.append(", conditions=");
        LIZ.append(this.conditions);
        LIZ.append(", domains=");
        return C1NE.LIZIZ(LIZ, this.domains, ')', LIZ);
    }

    public final Integer getAction() {
        return this.action;
    }

    public final List<Condition> getConditions() {
        return this.conditions;
    }

    public final List<String> getDomains() {
        return this.domains;
    }

    public Strategy(Integer num, List<Condition> list, List<String> list2) {
        this.action = num;
        this.conditions = list;
        this.domains = list2;
    }

    public Strategy(Integer num, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 2 : num, (i & 2) != 0 ? C61878OQg.INSTANCE : list, (i & 4) != 0 ? C61878OQg.INSTANCE : list2);
    }
}
