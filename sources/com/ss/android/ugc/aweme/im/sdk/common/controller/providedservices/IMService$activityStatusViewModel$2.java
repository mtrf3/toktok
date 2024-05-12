package com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices;

import X.AbstractC65781Prl;
import X.C100573x7;
import X.InterfaceC65784Pro;
import com.ss.android.ugc.aweme.im.sdk.activitystatus.ActivityStatusViewModelImpl;

/* loaded from: classes2.dex */
public final class IMService$activityStatusViewModel$2 extends AbstractC65781Prl implements InterfaceC65784Pro<ActivityStatusViewModelImpl> {
    public static final IMService$activityStatusViewModel$2 INSTANCE = new IMService$activityStatusViewModel$2();

    public IMService$activityStatusViewModel$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC65784Pro
    public final ActivityStatusViewModelImpl invoke() {
        return (ActivityStatusViewModelImpl) C100573x7.LIZ.getValue();
    }
}
