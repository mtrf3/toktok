package com.ss.android.ugc.aweme.services.function;

/* loaded from: classes11.dex */
public final class FunctionSupportService implements IFunctionSupportService {
    public static final FunctionSupportService INSTANCE = new FunctionSupportService();
    public final /* synthetic */ IFunctionSupportService $$delegate_0 = FunctionSupportServiceImpl.createIFunctionSupportServicebyMonsterPlugin(false);

    @Override // com.ss.android.ugc.aweme.services.function.IFunctionSupportService
    public boolean notSupport(IFunctionKey iFunctionKey) {
        return this.$$delegate_0.notSupport(iFunctionKey);
    }
}
