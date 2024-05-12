package com.ss.android.ugc.aweme.search.pages.result.topsearch.core.config;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class SearchDualStreamOptionalModel extends F9E {

    @InterfaceC65349Pkn("android_cache_limit")
    public final int androidCacheLimit;

    public SearchDualStreamOptionalModel() {
        this(0, 1, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.androidCacheLimit)};
    }

    public SearchDualStreamOptionalModel(int i) {
        this.androidCacheLimit = i;
    }

    public /* synthetic */ SearchDualStreamOptionalModel(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 20 : i);
    }
}
