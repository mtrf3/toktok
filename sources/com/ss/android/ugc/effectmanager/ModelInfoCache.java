package com.ss.android.ugc.effectmanager;

import X.F9E;
import com.ss.android.ugc.effectmanager.model.LocalModelInfo;
import com.ss.android.ugc.effectmanager.model.ModelInfo;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class ModelInfoCache extends F9E {
    public LocalModelInfo localModelInfo;
    public ModelInfo serverModelInfo;

    public static /* synthetic */ ModelInfoCache copy$default(ModelInfoCache modelInfoCache, LocalModelInfo localModelInfo, ModelInfo modelInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            localModelInfo = modelInfoCache.localModelInfo;
        }
        if ((i & 2) != 0) {
            modelInfo = modelInfoCache.serverModelInfo;
        }
        return modelInfoCache.copy(localModelInfo, modelInfo);
    }

    public final ModelInfoCache copy(LocalModelInfo localModelInfo, ModelInfo serverModelInfo) {
        o.LJIIJ(localModelInfo, "localModelInfo");
        o.LJIIJ(serverModelInfo, "serverModelInfo");
        return new ModelInfoCache(localModelInfo, serverModelInfo);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.localModelInfo, this.serverModelInfo};
    }

    public final LocalModelInfo getLocalModelInfo() {
        return this.localModelInfo;
    }

    public final ModelInfo getServerModelInfo() {
        return this.serverModelInfo;
    }

    public final void setLocalModelInfo(LocalModelInfo localModelInfo) {
        o.LJIIJ(localModelInfo, "<set-?>");
        this.localModelInfo = localModelInfo;
    }

    public final void setServerModelInfo(ModelInfo modelInfo) {
        o.LJIIJ(modelInfo, "<set-?>");
        this.serverModelInfo = modelInfo;
    }

    public ModelInfoCache(LocalModelInfo localModelInfo, ModelInfo serverModelInfo) {
        o.LJIIJ(localModelInfo, "localModelInfo");
        o.LJIIJ(serverModelInfo, "serverModelInfo");
        this.localModelInfo = localModelInfo;
        this.serverModelInfo = serverModelInfo;
    }
}
