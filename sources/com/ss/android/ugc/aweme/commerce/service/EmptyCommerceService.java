package com.ss.android.ugc.aweme.commerce.service;

import X.C71367Rzf;
import X.C71407S0t;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class EmptyCommerceService implements ICommerceService {
    public static final C71407S0t Companion = new C71407S0t();

    public Aweme getAwemeById(String str) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.commerce.service.ICommerceService
    public void logCommerceEvents(String event, C71367Rzf c71367Rzf) {
        o.LJIIIZ(event, "event");
    }
}
