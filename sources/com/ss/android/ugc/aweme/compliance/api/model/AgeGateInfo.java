package com.ss.android.ugc.aweme.compliance.api.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class AgeGateInfo extends F9E implements Serializable {

    @InterfaceC65349Pkn("register_age_gate_action")
    public final int registerAgeGateAction;

    public AgeGateInfo() {
        this(0, 1, null);
    }

    public static /* synthetic */ AgeGateInfo copy$default(AgeGateInfo ageGateInfo, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = ageGateInfo.registerAgeGateAction;
        }
        return ageGateInfo.copy(i);
    }

    public final AgeGateInfo copy(int i) {
        return new AgeGateInfo(i);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.registerAgeGateAction)};
    }

    public final int getRegisterAgeGateAction() {
        return this.registerAgeGateAction;
    }

    public AgeGateInfo(int i) {
        this.registerAgeGateAction = i;
    }

    public /* synthetic */ AgeGateInfo(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
