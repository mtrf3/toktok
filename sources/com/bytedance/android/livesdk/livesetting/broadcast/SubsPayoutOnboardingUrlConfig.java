package com.bytedance.android.livesdk.livesetting.broadcast;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class SubsPayoutOnboardingUrlConfig {

    @InterfaceC65349Pkn("payout_onboarding_popup")
    public String payoutOnboardingPopup;

    /* JADX WARN: Multi-variable type inference failed */
    public SubsPayoutOnboardingUrlConfig() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public SubsPayoutOnboardingUrlConfig(String payoutOnboardingPopup) {
        o.LJIIIZ(payoutOnboardingPopup, "payoutOnboardingPopup");
        this.payoutOnboardingPopup = payoutOnboardingPopup;
    }

    public /* synthetic */ SubsPayoutOnboardingUrlConfig(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
