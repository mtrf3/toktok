package com.ss.android.ugc.aweme.specialplus;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class SpecialPlusLabels {

    @InterfaceC65349Pkn("effect_ids")
    public String[] effectIds = new String[0];

    @InterfaceC65349Pkn("eligible_effect_ids")
    public String[] eligibleEffectIds = new String[0];

    public final String[] getEffectIds() {
        return this.effectIds;
    }

    public final String[] getEligibleEffectIds() {
        return this.eligibleEffectIds;
    }

    public final void setEffectIds(String[] strArr) {
        o.LJIIIZ(strArr, "<set-?>");
        this.effectIds = strArr;
    }

    public final void setEligibleEffectIds(String[] strArr) {
        o.LJIIIZ(strArr, "<set-?>");
        this.eligibleEffectIds = strArr;
    }
}
