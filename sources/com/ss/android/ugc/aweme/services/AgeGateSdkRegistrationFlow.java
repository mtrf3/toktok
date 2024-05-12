package com.ss.android.ugc.aweme.services;

import X.V0N;

/* loaded from: classes7.dex */
public enum AgeGateSdkRegistrationFlow {
    SIGN_UP(0),
    LOGIN_CONSENT(1),
    COMPONENT_PROVIDER(2),
    NEW_COMPONENT(3);

    public final int flow;

    public static AgeGateSdkRegistrationFlow valueOf(String str) {
        return (AgeGateSdkRegistrationFlow) V0N.LJJJ(AgeGateSdkRegistrationFlow.class, str);
    }

    public final int getFlow() {
        return this.flow;
    }

    AgeGateSdkRegistrationFlow(int i) {
        this.flow = i;
    }
}
