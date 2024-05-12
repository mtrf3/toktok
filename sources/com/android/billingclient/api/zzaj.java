package com.android.billingclient.api;

import X.C0HC;
import X.C0HE;
import X.C36864EdQ;
import android.os.Bundle;
import android.os.ResultReceiver;

/* loaded from: classes.dex */
public final class zzaj extends ResultReceiver {
    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        C0HC LIZ = C0HE.LIZ();
        LIZ.LIZ = i;
        LIZ.LIZIZ = C36864EdQ.LJ(bundle, "BillingClient");
        LIZ.LIZ();
        throw null;
    }
}
