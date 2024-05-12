package com.ss.android.ugc.aweme.portrait.api;

import X.C58133Mrh;
import X.C58143Mrr;

/* loaded from: classes11.dex */
public abstract class PortraitCenterInitService implements IPortraitCenterInitService {
    public static final C58143Mrr Companion = new C58143Mrr();

    @Override // com.ss.android.ugc.aweme.portrait.api.IPortraitCenterInitService
    public abstract /* synthetic */ void checkAndInit();

    public static final IPortraitCenterInitService instance() {
        Companion.getClass();
        return C58133Mrh.LIZ;
    }
}
