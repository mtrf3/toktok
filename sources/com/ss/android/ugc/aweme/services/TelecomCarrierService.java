package com.ss.android.ugc.aweme.services;

import X.TMH;
import X.TMI;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TelecomCarrierService {
    public String getCurrentTelecomCarrier() {
        return "";
    }

    public void getAuthToken(TMH callback) {
        o.LJIIIZ(callback, "callback");
        callback.LIZ();
    }

    public void getMaskedPhoneInfo(TMI callback) {
        o.LJIIIZ(callback, "callback");
        callback.LIZ();
    }
}
