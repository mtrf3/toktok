package com.ss.android.ugc.aweme.framework.services;

import X.InterfaceC65350Pko;
import java.util.Set;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class ExtentionKt {
    public static final <SERVICE> SERVICE spi() {
        ServiceManager.get();
        o.LJIJ();
        throw null;
    }

    public static final <SERVICE> Set<SERVICE> spis() {
        ServiceManager.get();
        o.LJIJ();
        throw null;
    }

    public static final <T> T getService(InterfaceC65350Pko<T> getService) {
        o.LJIIJ(getService, "$this$getService");
        ServiceManager.get();
        o.LJIJ();
        throw null;
    }

    public static final <T> Set<T> getServices(InterfaceC65350Pko<T> getServices) {
        o.LJIIJ(getServices, "$this$getServices");
        ServiceManager.get();
        o.LJIJ();
        throw null;
    }

    public static final <T> T getService(Class<T> getService) {
        o.LJIIJ(getService, "$this$getService");
        ServiceManager.get();
        o.LJIJ();
        throw null;
    }

    public static final <T> Set<T> getServices(Class<T> getServices) {
        o.LJIIJ(getServices, "$this$getServices");
        ServiceManager.get();
        o.LJIJ();
        throw null;
    }
}
