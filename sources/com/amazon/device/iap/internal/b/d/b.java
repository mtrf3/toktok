package com.amazon.device.iap.internal.b.d;

import com.amazon.device.iap.internal.b.e;
import com.amazon.device.iap.internal.b.i;

/* loaded from: classes.dex */
public abstract class b extends i {
    public final boolean a;

    public void preExecution() {
        String a;
        super.preExecution();
        String str = (String) b().d().a("userId");
        if (this.a) {
            a = null;
        } else {
            a = com.amazon.device.iap.internal.util.b.a(str);
        }
        a("cursor", a);
    }

    public b(e eVar, String str, boolean z) {
        super(eVar, "purchase_updates", str);
        this.a = z;
    }
}
