package com.amazon.device.iap.internal.b.f;

import com.amazon.device.iap.internal.b.e;

/* loaded from: classes.dex */
public final class c extends a {
    @Override // com.amazon.device.iap.internal.b.i
    public void a_() {
        Object a = b().d().a("notifyListenerResult");
        if (a != null) {
            Boolean bool = Boolean.TRUE;
            if (bool.equals(a)) {
                a("notifyListenerSucceeded", bool);
                super.a_();
            }
        }
        a("notifyListenerSucceeded", Boolean.FALSE);
        super.a_();
    }

    public c(e eVar, boolean z) {
        super(eVar, "2.0");
        a("receiptDelivered", Boolean.valueOf(z));
    }
}
