package com.ss.android.ugc.effectmanager.common.cache;

import X.C37692Eqm;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.common.cachemanager.ICache;
import com.ss.android.ugc.effectmanager.common.download.DownloadListener;
import com.ss.android.ugc.effectmanager.common.monitor.MonitorTrace;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.File;
import java.io.InputStream;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class EffectDiskLruCache implements ICache {
    public OldEffectDiskLruCache realEffectDiskLruCache;

    public EffectDiskLruCache(EffectConfiguration effectConfiguration) {
        this(effectConfiguration, 0L, 2, null);
    }

    @Override // com.ss.android.ugc.effectmanager.common.cachemanager.ICache
    public void clear() {
        OldEffectDiskLruCache oldEffectDiskLruCache = this.realEffectDiskLruCache;
        if (oldEffectDiskLruCache != null) {
            oldEffectDiskLruCache.clear();
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.cachemanager.ICache
    public boolean has(String key) {
        o.LJIIJ(key, "key");
        OldEffectDiskLruCache oldEffectDiskLruCache = this.realEffectDiskLruCache;
        if (oldEffectDiskLruCache != null) {
            return oldEffectDiskLruCache.has(key);
        }
        return false;
    }

    @Override // com.ss.android.ugc.effectmanager.common.cachemanager.ICache
    public InputStream queryToStream(String key) {
        o.LJIIJ(key, "key");
        OldEffectDiskLruCache oldEffectDiskLruCache = this.realEffectDiskLruCache;
        if (oldEffectDiskLruCache != null) {
            return oldEffectDiskLruCache.queryToStream(key);
        }
        return null;
    }

    @Override // com.ss.android.ugc.effectmanager.common.cachemanager.ICache
    public String queryToValue(String key) {
        o.LJIIJ(key, "key");
        OldEffectDiskLruCache oldEffectDiskLruCache = this.realEffectDiskLruCache;
        if (oldEffectDiskLruCache != null) {
            return oldEffectDiskLruCache.queryToValue(key);
        }
        return null;
    }

    public final void readEffectInMemory(Effect effect) {
        String unzipPath;
        String name;
        o.LJIIJ(effect, "effect");
        OldEffectDiskLruCache oldEffectDiskLruCache = this.realEffectDiskLruCache;
        if (oldEffectDiskLruCache != null && (unzipPath = effect.getUnzipPath()) != null && (name = new File(unzipPath).getName()) != null) {
            oldEffectDiskLruCache.readKeyInMemory(name);
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.cachemanager.ICache
    public boolean remove(String key) {
        o.LJIIJ(key, "key");
        OldEffectDiskLruCache oldEffectDiskLruCache = this.realEffectDiskLruCache;
        if (oldEffectDiskLruCache != null) {
            return oldEffectDiskLruCache.remove(key);
        }
        return false;
    }

    public final void removeEffect(Effect effect) {
        o.LJIIJ(effect, "effect");
        OldEffectDiskLruCache oldEffectDiskLruCache = this.realEffectDiskLruCache;
        if (oldEffectDiskLruCache != null) {
            oldEffectDiskLruCache.removeEffect(effect);
            return;
        }
        throw new C37692Eqm("null cannot be cast to non-null type com.ss.android.ugc.effectmanager.common.cache.OldEffectDiskLruCache");
    }

    @Override // com.ss.android.ugc.effectmanager.common.cachemanager.ICache
    public void removePattern(String patternStr) {
        o.LJIIJ(patternStr, "patternStr");
        OldEffectDiskLruCache oldEffectDiskLruCache = this.realEffectDiskLruCache;
        if (oldEffectDiskLruCache != null) {
            oldEffectDiskLruCache.removePattern(patternStr);
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.cachemanager.ICache
    public void removePattern(Pattern pattern) {
        OldEffectDiskLruCache oldEffectDiskLruCache = this.realEffectDiskLruCache;
        if (oldEffectDiskLruCache != null) {
            oldEffectDiskLruCache.removePattern(pattern);
        }
    }

    public EffectDiskLruCache(EffectConfiguration configuration, long j) {
        o.LJIIJ(configuration, "configuration");
        this.realEffectDiskLruCache = OldEffectDiskLruCache.getInstance(configuration);
    }

    @Override // com.ss.android.ugc.effectmanager.common.cachemanager.ICache
    public long save(String key, InputStream inputStream) {
        o.LJIIJ(key, "key");
        o.LJIIJ(inputStream, "inputStream");
        OldEffectDiskLruCache oldEffectDiskLruCache = this.realEffectDiskLruCache;
        if (oldEffectDiskLruCache != null) {
            return oldEffectDiskLruCache.save(key, inputStream);
        }
        return 0L;
    }

    public final void unzipEffectToDisk(Effect effect, MonitorTrace monitorTrace) {
        o.LJIIJ(effect, "effect");
        OldEffectDiskLruCache oldEffectDiskLruCache = this.realEffectDiskLruCache;
        if (oldEffectDiskLruCache != null) {
            oldEffectDiskLruCache.unzipEffectToDisk(effect, monitorTrace);
            return;
        }
        throw new C37692Eqm("null cannot be cast to non-null type com.ss.android.ugc.effectmanager.common.cache.OldEffectDiskLruCache");
    }

    @Override // com.ss.android.ugc.effectmanager.common.cachemanager.ICache
    public long save(String key, String value) {
        o.LJIIJ(key, "key");
        o.LJIIJ(value, "value");
        OldEffectDiskLruCache oldEffectDiskLruCache = this.realEffectDiskLruCache;
        if (oldEffectDiskLruCache != null) {
            return oldEffectDiskLruCache.save(key, value);
        }
        return 0L;
    }

    public /* synthetic */ EffectDiskLruCache(EffectConfiguration effectConfiguration, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(effectConfiguration, (i & 2) != 0 ? -1L : j);
    }

    public final void writeEffectZipToDisk(Effect effect, InputStream inputStream, String str, long j, DownloadListener downloadListener) {
        o.LJIIJ(effect, "effect");
        o.LJIIJ(inputStream, "inputStream");
        OldEffectDiskLruCache oldEffectDiskLruCache = this.realEffectDiskLruCache;
        if (oldEffectDiskLruCache != null) {
            oldEffectDiskLruCache.writeEffectZipToDisk(effect, inputStream, j, downloadListener);
            return;
        }
        throw new C37692Eqm("null cannot be cast to non-null type com.ss.android.ugc.effectmanager.common.cache.OldEffectDiskLruCache");
    }
}
