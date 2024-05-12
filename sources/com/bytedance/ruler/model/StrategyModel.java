package com.bytedance.ruler.model;

import X.C61878OQg;
import X.InterfaceC65349Pkn;
import X.Q1P;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class StrategyModel {

    @InterfaceC65349Pkn("exec_all_rules")
    public boolean execAllRules;

    @InterfaceC65349Pkn("key")
    public String key;

    @InterfaceC65349Pkn("rules")
    public List<Q1P> rules;

    public StrategyModel() {
        this(null, false, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StrategyModel)) {
            return false;
        }
        StrategyModel strategyModel = (StrategyModel) obj;
        return o.LJ(this.key, strategyModel.key) && this.execAllRules == strategyModel.execAllRules && o.LJ(this.rules, strategyModel.rules);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        String str = this.key;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.execAllRules;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        List<Q1P> list = this.rules;
        return i2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("{ key = ");
        LIZ.append(this.key);
        LIZ.append(" , exec_all_rules = ");
        LIZ.append(this.execAllRules);
        LIZ.append(", rules = ");
        LIZ.append(this.rules);
        sb.append(X1D.LIZIZ(LIZ));
        sb.append("}\n");
        String sb2 = sb.toString();
        o.LJFF(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public StrategyModel(String str, boolean z, List<Q1P> list) {
        this.key = str;
        this.execAllRules = z;
        this.rules = list;
    }

    public StrategyModel(String str, boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? C61878OQg.INSTANCE : list);
    }
}
