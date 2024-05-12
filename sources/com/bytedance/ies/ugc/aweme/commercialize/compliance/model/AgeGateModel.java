package com.bytedance.ies.ugc.aweme.commercialize.compliance.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class AgeGateModel implements Serializable {

    @InterfaceC65349Pkn("display_age_gate")
    public Boolean displayAgeGate;

    /* JADX WARN: Multi-variable type inference failed */
    public AgeGateModel() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final Boolean getDisplayAgeGate() {
        return this.displayAgeGate;
    }

    public AgeGateModel(Boolean bool) {
        this.displayAgeGate = bool;
    }

    public final void setDisplayAgeGate(Boolean bool) {
        this.displayAgeGate = bool;
    }

    public /* synthetic */ AgeGateModel(Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.FALSE : bool);
    }
}
