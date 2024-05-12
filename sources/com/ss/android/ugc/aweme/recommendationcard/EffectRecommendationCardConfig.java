package com.ss.android.ugc.aweme.recommendationcard;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class EffectRecommendationCardConfig extends F9E {

    @InterfaceC65349Pkn("effect_card_additional_cool_down_days")
    public final int coolDownDays;

    @InterfaceC65349Pkn("effect_card_no_action_times")
    public final int noActionTimes;

    @InterfaceC65349Pkn("effect_card_reduced_max_count")
    public final int reducedMaxCount;

    @InterfaceC65349Pkn("effect_card_reset_counter")
    public final boolean resetCounter;

    /* JADX WARN: Multi-variable type inference failed */
    public EffectRecommendationCardConfig() {
        this(0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.coolDownDays), Integer.valueOf(this.noActionTimes), Integer.valueOf(this.reducedMaxCount), Boolean.valueOf(this.resetCounter)};
    }

    public EffectRecommendationCardConfig(int i, int i2, int i3, boolean z) {
        this.coolDownDays = i;
        this.noActionTimes = i2;
        this.reducedMaxCount = i3;
        this.resetCounter = z;
    }

    public /* synthetic */ EffectRecommendationCardConfig(int i, int i2, int i3, boolean z, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 5 : i, (i4 & 2) != 0 ? 3 : i2, (i4 & 4) != 0 ? 1 : i3, (i4 & 8) != 0 ? false : z);
    }
}
