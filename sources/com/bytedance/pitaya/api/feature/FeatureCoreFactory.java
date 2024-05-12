package com.bytedance.pitaya.api.feature;

import com.bytedance.pitaya.api.feature.store.PTYFeatureStoreInstance;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class FeatureCoreFactory implements ReflectionCall {
    public static final FeatureCoreFactory INSTANCE = new FeatureCoreFactory();
    public static final ConcurrentHashMap<String, IFeatureCore> cores = new ConcurrentHashMap<>();
    public static final PTYFeatureStoreInstance featureStore = PTYFeatureStoreInstance.INSTANCE;

    public final ConcurrentHashMap<String, IFeatureCore> getCores() {
        return cores;
    }

    public final PTYFeatureStoreInstance getFeatureStore() {
        return featureStore;
    }

    public final IFeatureCore getFeatureCore(String aid) {
        IFeatureCore iFeatureCore;
        o.LJIIJ(aid, "aid");
        ConcurrentHashMap<String, IFeatureCore> concurrentHashMap = cores;
        synchronized (concurrentHashMap) {
            iFeatureCore = concurrentHashMap.get(aid);
        }
        return iFeatureCore;
    }
}
