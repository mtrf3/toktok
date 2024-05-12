package com.ss.android.ugc.aweme.services;

import X.C158056If;
import X.C2YJ;
import X.C78983UzD;

/* loaded from: classes5.dex */
public class CommerceDataServiceImpl {
    public int getDelayTimeAfterInteraction() {
        return 1;
    }

    public boolean isShowCommerceAfterInteraction() {
        return false;
    }

    public boolean shouldShowCard() {
        boolean z = true;
        try {
            z = true ^ C2YJ.LIZIZ.LIZ.getShopping().getDisableCard().booleanValue();
            return z;
        } catch (C158056If e) {
            C78983UzD.LJIIZILJ(e);
            return z;
        }
    }
}
