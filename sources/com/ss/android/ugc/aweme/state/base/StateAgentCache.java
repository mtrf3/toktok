package com.ss.android.ugc.aweme.state.base;

import com.bytedance.mota.storage.motacache.IMotaCache;

/* loaded from: classes16.dex */
public interface StateAgentCache<S> extends IMotaCache {
    String getId();

    @Override // com.bytedance.mota.storage.motacache.IMotaCache
    String getMotaCacheID();

    S getState();
}
