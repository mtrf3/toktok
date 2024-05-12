package com.ss.android.ugc.aweme.account.login.v2.network;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class Data extends F9E {

    @InterfaceC65349Pkn("show_consent_page")
    public final boolean showConsentPage;

    public Data() {
        this(false, 1, null);
    }

    public static /* synthetic */ Data copy$default(Data data, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = data.showConsentPage;
        }
        return data.copy(z);
    }

    public final Data copy(boolean z) {
        return new Data(z);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.showConsentPage)};
    }

    public final boolean getShowConsentPage() {
        return this.showConsentPage;
    }

    public Data(boolean z) {
        this.showConsentPage = z;
    }

    public /* synthetic */ Data(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
