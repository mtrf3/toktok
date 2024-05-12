package X;

import com.bytedance.pia.core.cache.IPiaCacheProvider;

/* renamed from: X.Elh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37377Elh implements IPiaCacheProvider {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ IPiaCacheProvider.CacheConfig LIZJ;

    @Override // com.bytedance.pia.core.cache.IPiaCacheProvider
    public final String LIZ() {
        return this.LIZ;
    }

    @Override // com.bytedance.pia.core.cache.IPiaCacheProvider
    public final IPiaCacheProvider.CacheConfig LIZIZ() {
        return this.LIZJ;
    }

    @Override // com.bytedance.pia.core.cache.IPiaCacheProvider
    public final String LIZJ() {
        return this.LIZIZ;
    }

    public C37377Elh(String str, String str2, IPiaCacheProvider.CacheConfig cacheConfig) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = cacheConfig;
    }
}
