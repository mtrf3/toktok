package com.amazon.device.iap.internal.b.h;

import com.amazon.device.iap.internal.b.e;
import com.amazon.device.iap.internal.b.i;
import com.amazon.venezia.command.SuccessResult;

/* loaded from: classes.dex */
public class a extends i {
    @Override // com.amazon.device.iap.internal.b.i
    public boolean a(SuccessResult successResult) {
        return true;
    }

    public a(e eVar, String str, String str2) {
        super(eVar, "submit_metric", "1.0");
        a("metricName", str);
        a("metricAttributes", str2);
        b(false);
    }
}
