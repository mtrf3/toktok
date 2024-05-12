package com.ss.android.ugc.tiktok.tpsc.model;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes8.dex */
public final class PrivacySettingsAgreementRecord extends F9E {

    @InterfaceC65349Pkn("status")
    public final int status;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.status)};
    }

    public PrivacySettingsAgreementRecord(int i) {
        this.status = i;
    }
}
