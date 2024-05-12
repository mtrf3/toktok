package com.ss.android.ugc.aweme.compliance.api.model;

import X.C15890jp;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class RuleConfig implements Serializable {

    @InterfaceC65349Pkn("op")
    public final String op;
    public final Map<String, String> replaceMap;

    @InterfaceC65349Pkn("type")
    public final String type;

    @InterfaceC65349Pkn("value")
    public final Set<String> value;

    /* JADX WARN: Multi-variable type inference failed */
    public RuleConfig() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RuleConfig copy$default(RuleConfig ruleConfig, String str, String str2, Set set, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ruleConfig.op;
        }
        if ((i & 2) != 0) {
            str2 = ruleConfig.type;
        }
        if ((i & 4) != 0) {
            set = ruleConfig.value;
        }
        if ((i & 8) != 0) {
            map = ruleConfig.replaceMap;
        }
        return ruleConfig.copy(str, str2, set, map);
    }

    public final RuleConfig copy(String str, String str2, Set<String> set, Map<String, String> replaceMap) {
        o.LJIIIZ(replaceMap, "replaceMap");
        return new RuleConfig(str, str2, set, replaceMap);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RuleConfig)) {
            return false;
        }
        RuleConfig ruleConfig = (RuleConfig) obj;
        return o.LJ(this.op, ruleConfig.op) && o.LJ(this.type, ruleConfig.type) && o.LJ(this.value, ruleConfig.value) && o.LJ(this.replaceMap, ruleConfig.replaceMap);
    }

    public int hashCode() {
        String str = this.op;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.type;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Set<String> set = this.value;
        return this.replaceMap.hashCode() + ((hashCode2 + (set != null ? set.hashCode() : 0)) * 31);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RuleConfig(op=");
        LIZ.append(this.op);
        LIZ.append(", type=");
        LIZ.append(this.type);
        LIZ.append(", value=");
        LIZ.append(this.value);
        LIZ.append(", replaceMap=");
        return C15890jp.LIZ(LIZ, this.replaceMap, ')', LIZ);
    }

    public final String getOp() {
        return this.op;
    }

    public final Map<String, String> getReplaceMap() {
        return this.replaceMap;
    }

    public final String getType() {
        return this.type;
    }

    public final Set<String> getValue() {
        return this.value;
    }

    public RuleConfig(String str, String str2, Set<String> set, Map<String, String> replaceMap) {
        o.LJIIIZ(replaceMap, "replaceMap");
        this.op = str;
        this.type = str2;
        this.value = set;
        this.replaceMap = replaceMap;
    }

    public /* synthetic */ RuleConfig(String str, String str2, Set set, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : set, (i & 8) != 0 ? new LinkedHashMap() : map);
    }
}
