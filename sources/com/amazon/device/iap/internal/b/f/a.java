package com.amazon.device.iap.internal.b.f;

import com.amazon.device.iap.internal.b.e;
import com.amazon.device.iap.internal.b.i;
import com.amazon.venezia.command.SuccessResult;

/* loaded from: classes.dex */
public abstract class a extends i {
    @Override // com.amazon.device.iap.internal.b.i
    public boolean a(SuccessResult successResult) {
        return true;
    }

    public a(e eVar, String str) {
        super(eVar, "response_received", str);
        b(false);
    }
}
