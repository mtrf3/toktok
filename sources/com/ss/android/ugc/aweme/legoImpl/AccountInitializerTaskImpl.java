package com.ss.android.ugc.aweme.legoImpl;

import X.C58096Mr6;
import com.ss.android.legoapi.IAccountInitializerTaskApi;
import com.ss.android.ugc.aweme.legoImpl.task.AccountRegisterTask;
import com.ss.android.ugc.aweme.legoImpl.task.LoginProxyTask;
import com.ss.android.ugc.aweme.legoImpl.task.RegisterSessionReceiver;
import com.ss.android.ugc.aweme.legoImpl.task.TokenSdkTask;

/* loaded from: classes7.dex */
public final class AccountInitializerTaskImpl implements IAccountInitializerTaskApi {
    public static IAccountInitializerTaskApi LJ() {
        Object LIZ = C58096Mr6.LIZ(IAccountInitializerTaskApi.class, false);
        if (LIZ != null) {
            return (IAccountInitializerTaskApi) LIZ;
        }
        if (C58096Mr6.o2 == null) {
            synchronized (IAccountInitializerTaskApi.class) {
                if (C58096Mr6.o2 == null) {
                    C58096Mr6.o2 = new AccountInitializerTaskImpl();
                }
            }
        }
        return C58096Mr6.o2;
    }

    @Override // com.ss.android.legoapi.IAccountInitializerTaskApi
    public final AccountRegisterTask LIZ() {
        return new AccountRegisterTask();
    }

    @Override // com.ss.android.legoapi.IAccountInitializerTaskApi
    public final LoginProxyTask LIZIZ() {
        return new LoginProxyTask();
    }

    @Override // com.ss.android.legoapi.IAccountInitializerTaskApi
    public final RegisterSessionReceiver LIZJ() {
        return new RegisterSessionReceiver();
    }

    @Override // com.ss.android.legoapi.IAccountInitializerTaskApi
    public final TokenSdkTask LIZLLL() {
        return new TokenSdkTask();
    }
}
