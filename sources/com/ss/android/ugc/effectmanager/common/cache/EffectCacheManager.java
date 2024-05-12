package com.ss.android.ugc.effectmanager.common.cache;

import X.C221108m2;
import X.C5H3;
import X.EnumC221088m0;
import android.text.TextUtils;
import com.ss.android.ugc.effectmanager.common.cachemanager.ICache;
import java.util.HashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class EffectCacheManager {
    public static final Companion Companion = new Companion();
    public static final C5H3 instance$delegate = C221108m2.LIZ(EnumC221088m0.SYNCHRONIZED, EffectCacheManager$Companion$instance$2.INSTANCE);
    public HashMap<String, ICache> caches;

    public EffectCacheManager() {
        this.caches = new HashMap<>();
    }

    /* loaded from: classes16.dex */
    public static final class Companion {
        public final EffectCacheManager getInstance() {
            return (EffectCacheManager) EffectCacheManager.instance$delegate.getValue();
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ EffectCacheManager(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final synchronized ICache getCache(String dirPath) {
        o.LJIIJ(dirPath, "dirPath");
        ICache iCache = null;
        if (TextUtils.isEmpty(dirPath)) {
            return null;
        }
        if (this.caches.containsKey(dirPath)) {
            iCache = this.caches.get(dirPath);
        }
        return iCache;
    }

    public final synchronized void setCache(String dirPath, ICache iCache) {
        o.LJIIJ(dirPath, "dirPath");
        this.caches.put(dirPath, iCache);
    }
}
