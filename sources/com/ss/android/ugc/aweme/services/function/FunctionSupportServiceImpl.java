package com.ss.android.ugc.aweme.services.function;

import X.C58096Mr6;

/* loaded from: classes11.dex */
public class FunctionSupportServiceImpl implements IFunctionSupportService {
    @Override // com.ss.android.ugc.aweme.services.function.IFunctionSupportService
    public boolean notSupport(IFunctionKey iFunctionKey) {
        return false;
    }

    public static IFunctionSupportService createIFunctionSupportServicebyMonsterPlugin(boolean z) {
        Object LIZ = C58096Mr6.LIZ(IFunctionSupportService.class, z);
        if (LIZ != null) {
            return (IFunctionSupportService) LIZ;
        }
        if (C58096Mr6.i6 == null) {
            synchronized (IFunctionSupportService.class) {
                if (C58096Mr6.i6 == null) {
                    C58096Mr6.i6 = new FunctionSupportServiceImpl();
                }
            }
        }
        return C58096Mr6.i6;
    }
}
