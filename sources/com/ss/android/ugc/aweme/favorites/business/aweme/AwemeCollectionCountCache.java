package com.ss.android.ugc.aweme.favorites.business.aweme;

import X.X1D;
import com.ss.android.ugc.aweme.state.base.StateAgentCache;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class AwemeCollectionCountCache implements StateAgentCache<Long> {
    public static final int $stable = 0;
    public final String id;
    public final long state;

    public static /* synthetic */ AwemeCollectionCountCache copy$default(AwemeCollectionCountCache awemeCollectionCountCache, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = awemeCollectionCountCache.getId();
        }
        if ((i & 2) != 0) {
            j = awemeCollectionCountCache.getState().longValue();
        }
        return awemeCollectionCountCache.copy(str, j);
    }

    public final String component1() {
        return getId();
    }

    public final long component2() {
        return getState().longValue();
    }

    public final AwemeCollectionCountCache copy(String id, long j) {
        o.LJIIIZ(id, "id");
        return new AwemeCollectionCountCache(id, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AwemeCollectionCountCache)) {
            return false;
        }
        AwemeCollectionCountCache awemeCollectionCountCache = (AwemeCollectionCountCache) obj;
        return o.LJ(getId(), awemeCollectionCountCache.getId()) && getState().longValue() == awemeCollectionCountCache.getState().longValue();
    }

    public int hashCode() {
        return getState().hashCode() + (getId().hashCode() * 31);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AwemeCollectionCountCache(id=");
        LIZ.append(getId());
        LIZ.append(", state=");
        LIZ.append(getState().longValue());
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ss.android.ugc.aweme.state.base.StateAgentCache
    public Long getState() {
        return Long.valueOf(this.state);
    }

    @Override // com.ss.android.ugc.aweme.state.base.StateAgentCache, com.bytedance.mota.storage.motacache.IMotaCache
    public String getMotaCacheID() {
        return getId();
    }

    @Override // com.ss.android.ugc.aweme.state.base.StateAgentCache
    public String getId() {
        return this.id;
    }

    public AwemeCollectionCountCache(String id, long j) {
        o.LJIIIZ(id, "id");
        this.id = id;
        this.state = j;
    }
}
