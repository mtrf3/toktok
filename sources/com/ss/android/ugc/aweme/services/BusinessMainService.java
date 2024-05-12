package com.ss.android.ugc.aweme.services;

import android.view.View;

/* loaded from: classes7.dex */
public final class BusinessMainService implements IBusinessMainService {
    public static final BusinessMainService INSTANCE = new BusinessMainService();
    public final /* synthetic */ IBusinessMainService $$delegate_0 = BusinessMainServiceImpl.createIBusinessMainServicebyMonsterPlugin(false);

    @Override // com.ss.android.ugc.aweme.services.IBusinessMainService
    public IInitialChooseLanguageManager getInitialChooseLanguageManager() {
        return this.$$delegate_0.getInitialChooseLanguageManager();
    }

    @Override // com.ss.android.ugc.aweme.services.IBusinessMainService
    public boolean isInActivity() {
        return this.$$delegate_0.isInActivity();
    }

    @Override // com.ss.android.ugc.aweme.services.IBusinessMainService
    public void updateRootViewAndState(View view) {
        this.$$delegate_0.updateRootViewAndState(view);
    }
}
