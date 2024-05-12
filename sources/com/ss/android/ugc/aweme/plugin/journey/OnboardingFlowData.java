package com.ss.android.ugc.aweme.plugin.journey;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class OnboardingFlowData {

    @InterfaceC65349Pkn("steps")
    public final List<NewUserJourneyStep> steps;

    /* JADX WARN: Multi-variable type inference failed */
    public OnboardingFlowData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OnboardingFlowData) && o.LJ(this.steps, ((OnboardingFlowData) obj).steps);
    }

    public final int hashCode() {
        List<NewUserJourneyStep> list = this.steps;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OnboardingFlowData(steps=");
        return C1NE.LIZIZ(LIZ, this.steps, ')', LIZ);
    }

    public OnboardingFlowData(List<NewUserJourneyStep> list) {
        this.steps = list;
    }

    public /* synthetic */ OnboardingFlowData(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
