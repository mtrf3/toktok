package com.ss.android.ugc.aweme.favorites.business.aweme;

import X.X1D;
import com.ss.android.ugc.aweme.state.base.StateAgentCache;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class AwemeFavoriteCache implements StateAgentCache<Boolean> {
    public static final int $stable = 0;
    public final String id;
    public final boolean state;

    public static /* synthetic */ AwemeFavoriteCache copy$default(AwemeFavoriteCache awemeFavoriteCache, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = awemeFavoriteCache.getId();
        }
        if ((i & 2) != 0) {
            z = awemeFavoriteCache.getState().booleanValue();
        }
        return awemeFavoriteCache.copy(str, z);
    }

    public final String component1() {
        return getId();
    }

    public final boolean component2() {
        return getState().booleanValue();
    }

    public final AwemeFavoriteCache copy(String id, boolean z) {
        o.LJIIIZ(id, "id");
        return new AwemeFavoriteCache(id, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AwemeFavoriteCache)) {
            return false;
        }
        AwemeFavoriteCache awemeFavoriteCache = (AwemeFavoriteCache) obj;
        return o.LJ(getId(), awemeFavoriteCache.getId()) && getState().booleanValue() == awemeFavoriteCache.getState().booleanValue();
    }

    public int hashCode() {
        return getState().hashCode() + (getId().hashCode() * 31);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AwemeFavoriteCache(id=");
        LIZ.append(getId());
        LIZ.append(", state=");
        LIZ.append(getState().booleanValue());
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ss.android.ugc.aweme.state.base.StateAgentCache
    public Boolean getState() {
        return Boolean.valueOf(this.state);
    }

    @Override // com.ss.android.ugc.aweme.state.base.StateAgentCache, com.bytedance.mota.storage.motacache.IMotaCache
    public String getMotaCacheID() {
        return getId();
    }

    @Override // com.ss.android.ugc.aweme.state.base.StateAgentCache
    public String getId() {
        return this.id;
    }

    public AwemeFavoriteCache(String id, boolean z) {
        o.LJIIIZ(id, "id");
        this.id = id;
        this.state = z;
    }
}
