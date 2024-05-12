package com.ss.android.ugc.aweme.compliance.api.model;

import X.C1NE;
import X.C61878OQg;
import X.InterfaceC65349Pkn;
import X.OQY;
import X.X1D;
import java.io.Serializable;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class Condition implements Serializable {

    @InterfaceC65349Pkn("action")
    public final Integer action;

    @InterfaceC65349Pkn("paths")
    public final Set<String> paths;

    @InterfaceC65349Pkn("subdomains")
    public final List<String> subdomains;

    public Condition() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Condition copy$default(Condition condition, Integer num, Set set, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            num = condition.action;
        }
        if ((i & 2) != 0) {
            set = condition.paths;
        }
        if ((i & 4) != 0) {
            list = condition.subdomains;
        }
        return condition.copy(num, set, list);
    }

    public final Condition copy(Integer num, Set<String> set, List<String> list) {
        return new Condition(num, set, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Condition)) {
            return false;
        }
        Condition condition = (Condition) obj;
        return o.LJ(this.action, condition.action) && o.LJ(this.paths, condition.paths) && o.LJ(this.subdomains, condition.subdomains);
    }

    public int hashCode() {
        Integer num = this.action;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Set<String> set = this.paths;
        int hashCode2 = (hashCode + (set == null ? 0 : set.hashCode())) * 31;
        List<String> list = this.subdomains;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Condition(action=");
        LIZ.append(this.action);
        LIZ.append(", paths=");
        LIZ.append(this.paths);
        LIZ.append(", subdomains=");
        return C1NE.LIZIZ(LIZ, this.subdomains, ')', LIZ);
    }

    public final Integer getAction() {
        return this.action;
    }

    public final Set<String> getPaths() {
        return this.paths;
    }

    public final List<String> getSubdomains() {
        return this.subdomains;
    }

    public Condition(Integer num, Set<String> set, List<String> list) {
        this.action = num;
        this.paths = set;
        this.subdomains = list;
    }

    public Condition(Integer num, Set set, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 2 : num, (i & 2) != 0 ? OQY.INSTANCE : set, (i & 4) != 0 ? C61878OQg.INSTANCE : list);
    }
}
