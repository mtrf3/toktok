package com.ss.android.ugc.aweme.compliance.api.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class RuleWhen implements Serializable {

    @InterfaceC65349Pkn("domain")
    public final RuleConfig domain;

    @InterfaceC65349Pkn("path")
    public final RuleConfig path;

    /* JADX WARN: Multi-variable type inference failed */
    public RuleWhen() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ RuleWhen copy$default(RuleWhen ruleWhen, RuleConfig ruleConfig, RuleConfig ruleConfig2, int i, Object obj) {
        if ((i & 1) != 0) {
            ruleConfig = ruleWhen.domain;
        }
        if ((i & 2) != 0) {
            ruleConfig2 = ruleWhen.path;
        }
        return ruleWhen.copy(ruleConfig, ruleConfig2);
    }

    public final RuleWhen copy(RuleConfig ruleConfig, RuleConfig ruleConfig2) {
        return new RuleWhen(ruleConfig, ruleConfig2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RuleWhen)) {
            return false;
        }
        RuleWhen ruleWhen = (RuleWhen) obj;
        return o.LJ(this.domain, ruleWhen.domain) && o.LJ(this.path, ruleWhen.path);
    }

    public int hashCode() {
        RuleConfig ruleConfig = this.domain;
        int hashCode = (ruleConfig == null ? 0 : ruleConfig.hashCode()) * 31;
        RuleConfig ruleConfig2 = this.path;
        return hashCode + (ruleConfig2 != null ? ruleConfig2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RuleWhen(domain=");
        LIZ.append(this.domain);
        LIZ.append(", path=");
        LIZ.append(this.path);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final RuleConfig getDomain() {
        return this.domain;
    }

    public final RuleConfig getPath() {
        return this.path;
    }

    public RuleWhen(RuleConfig ruleConfig, RuleConfig ruleConfig2) {
        this.domain = ruleConfig;
        this.path = ruleConfig2;
    }

    public /* synthetic */ RuleWhen(RuleConfig ruleConfig, RuleConfig ruleConfig2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : ruleConfig, (i & 2) != 0 ? null : ruleConfig2);
    }
}
