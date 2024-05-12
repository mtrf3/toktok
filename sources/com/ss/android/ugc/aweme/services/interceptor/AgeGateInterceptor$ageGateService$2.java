package com.ss.android.ugc.aweme.services.interceptor;

import X.AbstractC65781Prl;
import X.InterfaceC65784Pro;
import com.ss.android.ugc.aweme.account.agegate.RegistrationAgeGateServiceImpl;
import com.ss.android.ugc.aweme.services.IRegistrationAgeGateService;

/* loaded from: classes12.dex */
public final class AgeGateInterceptor$ageGateService$2 extends AbstractC65781Prl implements InterfaceC65784Pro<IRegistrationAgeGateService> {
    public static final AgeGateInterceptor$ageGateService$2 INSTANCE = new AgeGateInterceptor$ageGateService$2();

    public AgeGateInterceptor$ageGateService$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC65784Pro
    public final IRegistrationAgeGateService invoke() {
        return RegistrationAgeGateServiceImpl.LIZ();
    }
}
