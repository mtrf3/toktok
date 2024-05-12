package com.ss.android.ugc.aweme.search.service.ecom.ab;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class SearchClassReflectPreloadConfig extends F9E {

    @InterfaceC65349Pkn("preload_delay_time")
    public final long preloadDelayTime;

    @InterfaceC65349Pkn("search_class_reflect_preload_phase")
    public final String searchClassReflectPreloadPhase;

    /* JADX WARN: Multi-variable type inference failed */
    public SearchClassReflectPreloadConfig() {
        this(0L, null, 3, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.preloadDelayTime), this.searchClassReflectPreloadPhase};
    }

    public SearchClassReflectPreloadConfig(long j, String searchClassReflectPreloadPhase) {
        o.LJIIIZ(searchClassReflectPreloadPhase, "searchClassReflectPreloadPhase");
        this.preloadDelayTime = j;
        this.searchClassReflectPreloadPhase = searchClassReflectPreloadPhase;
    }

    public /* synthetic */ SearchClassReflectPreloadConfig(long j, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? "" : str);
    }
}
