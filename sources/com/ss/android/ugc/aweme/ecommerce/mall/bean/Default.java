package com.ss.android.ugc.aweme.ecommerce.mall.bean;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class Default extends F9E {

    @InterfaceC65349Pkn("custom_inject_key")
    public final List<String> customInjectKey;

    @InterfaceC65349Pkn("enable_storage_inject")
    public final int enableStorageInject;

    @InterfaceC65349Pkn("local_storage_key")
    public final List<String> localStorageKey;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.enableStorageInject), this.localStorageKey, this.customInjectKey};
    }

    public Default(int i, List<String> localStorageKey, List<String> customInjectKey) {
        o.LJIIIZ(localStorageKey, "localStorageKey");
        o.LJIIIZ(customInjectKey, "customInjectKey");
        this.enableStorageInject = i;
        this.localStorageKey = localStorageKey;
        this.customInjectKey = customInjectKey;
    }
}
