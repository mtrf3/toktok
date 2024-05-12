package com.ss.android.ugc.effectmanager;

import X.X1D;
import com.ss.android.ugc.effectmanager.common.cache.IModelCache;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.model.LocalModelInfo;
import com.ss.android.ugc.effectmanager.model.ModelInfo;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class AlgorithmModelInfoMemoryCache {
    public static final AlgorithmModelInfoMemoryCache INSTANCE = new AlgorithmModelInfoMemoryCache();
    public static final ConcurrentHashMap<String, ModelInfoCache> cache = new ConcurrentHashMap<>();
    public static final AtomicBoolean hasBuiltCache = new AtomicBoolean(false);

    public static final synchronized void clear() {
        synchronized (AlgorithmModelInfoMemoryCache.class) {
            cache.clear();
            hasBuiltCache.set(false);
        }
    }

    public static final boolean hasBuiltCache() {
        return hasBuiltCache.get();
    }

    public static final synchronized boolean isModelReady(String str) {
        synchronized (AlgorithmModelInfoMemoryCache.class) {
            if (str == null) {
                return false;
            }
            ModelInfoCache modelInfoCache = cache.get(str);
            if (modelInfoCache == null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("model: ");
                LIZ.append(str);
                LIZ.append(" not in cache!");
                EPLog.e("AlgorithmModelInfoMemoryCache", X1D.LIZIZ(LIZ));
                return false;
            }
            LocalModelInfo localModelInfo = modelInfoCache.getLocalModelInfo();
            ModelInfo serverModelInfo = modelInfoCache.getServerModelInfo();
            if (!o.LJ(localModelInfo.getVersion(), serverModelInfo.getVersion())) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("model: ");
                LIZ2.append(str);
                LIZ2.append(" version not match. local version: ");
                LIZ2.append(localModelInfo.getVersion());
                LIZ2.append(", server version: ");
                LIZ2.append(serverModelInfo.getVersion());
                EPLog.e("AlgorithmModelInfoMemoryCache", X1D.LIZIZ(LIZ2));
                return false;
            }
            if (localModelInfo.isBuilt()) {
                return true;
            }
            if (localModelInfo.getSize() != serverModelInfo.getType()) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("model: ");
                LIZ3.append(str);
                LIZ3.append(" size not match. local size: ");
                LIZ3.append(localModelInfo.getSize());
                LIZ3.append(", server size: ");
                LIZ3.append(serverModelInfo.getType());
                EPLog.e("AlgorithmModelInfoMemoryCache", X1D.LIZIZ(LIZ3));
                return false;
            }
            if (!(!o.LJ(localModelInfo.getMD5(), serverModelInfo.getMD5()))) {
                return true;
            }
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("model: ");
            LIZ4.append(str);
            LIZ4.append(" md5 not match. local md5: ");
            LIZ4.append(localModelInfo.getMD5());
            LIZ4.append(", server md5: ");
            LIZ4.append(serverModelInfo.getMD5());
            EPLog.e("AlgorithmModelInfoMemoryCache", X1D.LIZIZ(LIZ4));
            return false;
        }
    }

    public static final synchronized void writeModelInfo(ModelInfo modelInfo) {
        synchronized (AlgorithmModelInfoMemoryCache.class) {
            o.LJIIJ(modelInfo, "modelInfo");
            String name = modelInfo.getName();
            LocalModelInfo localModelInfo = new LocalModelInfo();
            localModelInfo.setName(name);
            localModelInfo.setMd5(modelInfo.getMD5());
            localModelInfo.setSize(modelInfo.getType());
            localModelInfo.setVersion(modelInfo.getVersion());
            localModelInfo.setBuilt(false);
            ModelInfoCache modelInfoCache = new ModelInfoCache(localModelInfo, modelInfo);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("model: ");
            LIZ.append(name);
            LIZ.append(" write in cache!");
            EPLog.d("AlgorithmModelInfoMemoryCache", X1D.LIZIZ(LIZ));
            cache.put(name, modelInfoCache);
        }
    }

    public final void buildCache(LoadedModelList serverModelInfos, IModelCache localCache) {
        o.LJIIJ(serverModelInfos, "serverModelInfos");
        o.LJIIJ(localCache, "localCache");
        Map<String, ModelInfo> modelInfoList = serverModelInfos.getModelInfoList();
        if (modelInfoList.isEmpty()) {
            hasBuiltCache.set(false);
            return;
        }
        Map<String, LocalModelInfo> localModelInfoList = localCache.getLocalModelInfoList();
        if (localModelInfoList.isEmpty()) {
            hasBuiltCache.set(false);
            return;
        }
        for (Map.Entry<String, ModelInfo> entry : modelInfoList.entrySet()) {
            String name = entry.getKey();
            LocalModelInfo localModelInfo = localModelInfoList.get(name);
            if (localModelInfo != null) {
                ModelInfo value = entry.getValue();
                o.LJFF(value, "modelInfo.value");
                ModelInfoCache modelInfoCache = new ModelInfoCache(localModelInfo, value);
                ConcurrentHashMap<String, ModelInfoCache> concurrentHashMap = cache;
                o.LJFF(name, "name");
                concurrentHashMap.put(name, modelInfoCache);
            }
        }
        hasBuiltCache.set(true);
    }
}
