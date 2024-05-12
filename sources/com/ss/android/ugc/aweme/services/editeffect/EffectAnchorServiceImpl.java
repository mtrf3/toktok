package com.ss.android.ugc.aweme.services.editeffect;

import X.C58096Mr6;
import android.util.LruCache;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class EffectAnchorServiceImpl implements IEffectAnchorService {
    public final LruCache<String, EditEffectAnchorManager> dataCache = new LruCache<>(3);

    public static IEffectAnchorService createIEffectAnchorServicebyMonsterPlugin(boolean z) {
        Object LIZ = C58096Mr6.LIZ(IEffectAnchorService.class, z);
        if (LIZ != null) {
            return (IEffectAnchorService) LIZ;
        }
        if (C58096Mr6.h6 == null) {
            synchronized (IEffectAnchorService.class) {
                if (C58096Mr6.h6 == null) {
                    C58096Mr6.h6 = new EffectAnchorServiceImpl();
                }
            }
        }
        return C58096Mr6.h6;
    }

    @Override // com.ss.android.ugc.aweme.services.editeffect.IEffectAnchorService
    public EditEffectAnchorManager getData(String id) {
        o.LJIIIZ(id, "id");
        return this.dataCache.get(id);
    }

    @Override // com.ss.android.ugc.aweme.services.editeffect.IEffectAnchorService
    public void setData(String id, EditEffectAnchorManager manager) {
        o.LJIIIZ(id, "id");
        o.LJIIIZ(manager, "manager");
        this.dataCache.put(id, manager);
    }
}
