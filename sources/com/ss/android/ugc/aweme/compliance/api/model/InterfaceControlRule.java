package com.ss.android.ugc.aweme.compliance.api.model;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class InterfaceControlRule implements Serializable {

    @InterfaceC65349Pkn("name")
    public final String name;

    @InterfaceC65349Pkn("then")
    public final List<RuleConfig> ruleThens;

    @InterfaceC65349Pkn("when")
    public final RuleWhen ruleWhen;

    /* JADX WARN: Multi-variable type inference failed */
    public InterfaceControlRule() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InterfaceControlRule copy$default(InterfaceControlRule interfaceControlRule, String str, RuleWhen ruleWhen, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = interfaceControlRule.name;
        }
        if ((i & 2) != 0) {
            ruleWhen = interfaceControlRule.ruleWhen;
        }
        if ((i & 4) != 0) {
            list = interfaceControlRule.ruleThens;
        }
        return interfaceControlRule.copy(str, ruleWhen, list);
    }

    public final InterfaceControlRule copy(String str, RuleWhen ruleWhen, List<RuleConfig> list) {
        return new InterfaceControlRule(str, ruleWhen, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceControlRule)) {
            return false;
        }
        InterfaceControlRule interfaceControlRule = (InterfaceControlRule) obj;
        return o.LJ(this.name, interfaceControlRule.name) && o.LJ(this.ruleWhen, interfaceControlRule.ruleWhen) && o.LJ(this.ruleThens, interfaceControlRule.ruleThens);
    }

    public int hashCode() {
        String str = this.name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        RuleWhen ruleWhen = this.ruleWhen;
        int hashCode2 = (hashCode + (ruleWhen == null ? 0 : ruleWhen.hashCode())) * 31;
        List<RuleConfig> list = this.ruleThens;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InterfaceControlRule(name=");
        LIZ.append(this.name);
        LIZ.append(", ruleWhen=");
        LIZ.append(this.ruleWhen);
        LIZ.append(", ruleThens=");
        return C1NE.LIZIZ(LIZ, this.ruleThens, ')', LIZ);
    }

    public final String getName() {
        return this.name;
    }

    public final List<RuleConfig> getRuleThens() {
        return this.ruleThens;
    }

    public final RuleWhen getRuleWhen() {
        return this.ruleWhen;
    }

    public InterfaceControlRule(String str, RuleWhen ruleWhen, List<RuleConfig> list) {
        this.name = str;
        this.ruleWhen = ruleWhen;
        this.ruleThens = list;
    }

    public /* synthetic */ InterfaceControlRule(String str, RuleWhen ruleWhen, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : ruleWhen, (i & 4) != 0 ? null : list);
    }
}
