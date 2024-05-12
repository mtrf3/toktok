package com.ss.android.ugc.aweme.service.unlogindigg;

import X.C36876Edc;
import X.F9E;
import X.InterfaceC65349Pkn;
import android.util.LruCache;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class UnLoginDiggLocalCache extends F9E {

    @InterfaceC65349Pkn("lru_cache")
    public final LruCache<String, C36876Edc> lruCache;

    @InterfaceC65349Pkn("show_digg_toast")
    public final boolean showDiggToast;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.lruCache, Boolean.valueOf(this.showDiggToast)};
    }

    public UnLoginDiggLocalCache(LruCache<String, C36876Edc> lruCache, boolean z) {
        o.LJIIIZ(lruCache, "lruCache");
        this.lruCache = lruCache;
        this.showDiggToast = z;
    }
}
