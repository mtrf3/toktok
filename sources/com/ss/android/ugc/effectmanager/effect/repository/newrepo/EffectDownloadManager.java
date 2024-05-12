package com.ss.android.ugc.effectmanager.effect.repository.newrepo;

import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.utils.EffectExtKt;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class EffectDownloadManager {
    public static final EffectDownloadManager INSTANCE = new EffectDownloadManager();
    public static final ConcurrentHashMap<String, Effect> downloadingEffects = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, ConcurrentHashSet<IFetchEffectListener>> downloadingEffectsListener = new ConcurrentHashMap<>();

    public final List<Effect> currentDownloadingEffects() {
        ArrayList arrayList = new ArrayList();
        Set<Map.Entry<String, Effect>> entrySet = downloadingEffects.entrySet();
        o.LJFF(entrySet, "downloadingEffects.entries");
        Iterator<Map.Entry<String, Effect>> it = entrySet.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getValue());
        }
        return arrayList;
    }

    public final void destroy() {
        downloadingEffectsListener.clear();
    }

    public final void addDownloadEffect(Effect effect) {
        String expectedMd5;
        if (effect != null && (expectedMd5 = EffectExtKt.expectedMd5(effect)) != null) {
            downloadingEffects.put(expectedMd5, effect);
        }
    }

    public final void finishDownloadEffect(Effect effect) {
        String expectedMd5;
        if (effect != null && (expectedMd5 = EffectExtKt.expectedMd5(effect)) != null) {
            ConcurrentHashSet<IFetchEffectListener> concurrentHashSet = downloadingEffectsListener.get(expectedMd5);
            if (concurrentHashSet != null) {
                Iterator<IFetchEffectListener> it = concurrentHashSet.iterator();
                while (it.hasNext()) {
                    it.next().onSuccess(effect);
                }
            }
            downloadingEffectsListener.remove(expectedMd5);
            downloadingEffects.remove(expectedMd5);
        }
    }

    public final boolean isDownloaded(Effect effect) {
        if (effect == null || isDownloading(EffectExtKt.expectedMd5(effect))) {
            return false;
        }
        return FileUtils.INSTANCE.checkFileExists(effect.getUnzipPath());
    }

    public final boolean isDownloading(String str) {
        if (str != null) {
            return downloadingEffects.containsKey(str);
        }
        return false;
    }

    public final void startDownloadEffect(Effect effect) {
        String expectedMd5;
        ConcurrentHashSet<IFetchEffectListener> concurrentHashSet;
        if (effect != null && (expectedMd5 = EffectExtKt.expectedMd5(effect)) != null && (concurrentHashSet = downloadingEffectsListener.get(expectedMd5)) != null) {
            Iterator<IFetchEffectListener> it = concurrentHashSet.iterator();
            while (it.hasNext()) {
                it.next().onStart(effect);
            }
        }
    }

    public final void addDownloadListener(Effect effect, IFetchEffectListener iFetchEffectListener) {
        ConcurrentHashSet<IFetchEffectListener> putIfAbsent;
        o.LJIIJ(iFetchEffectListener, "iFetchEffectListener");
        if (effect != null) {
            if (!isDownloading(EffectExtKt.expectedMd5(effect))) {
                if (isDownloaded(effect)) {
                    iFetchEffectListener.onSuccess(effect);
                    return;
                } else {
                    iFetchEffectListener.onFail(effect, new ExceptionResult(10005));
                    return;
                }
            }
            String expectedMd5 = EffectExtKt.expectedMd5(effect);
            if (expectedMd5 != null) {
                ConcurrentHashMap<String, ConcurrentHashSet<IFetchEffectListener>> concurrentHashMap = downloadingEffectsListener;
                ConcurrentHashSet<IFetchEffectListener> concurrentHashSet = concurrentHashMap.get(expectedMd5);
                if (concurrentHashSet == null && (putIfAbsent = concurrentHashMap.putIfAbsent(expectedMd5, (concurrentHashSet = new ConcurrentHashSet<>()))) != null) {
                    concurrentHashSet = putIfAbsent;
                }
                concurrentHashSet.add(iFetchEffectListener);
            }
        }
    }

    public final void failedDownloadEffect(Effect effect, ExceptionResult e) {
        String expectedMd5;
        o.LJIIJ(e, "e");
        if (effect != null && (expectedMd5 = EffectExtKt.expectedMd5(effect)) != null) {
            ConcurrentHashSet<IFetchEffectListener> concurrentHashSet = downloadingEffectsListener.get(expectedMd5);
            if (concurrentHashSet != null) {
                Iterator<IFetchEffectListener> it = concurrentHashSet.iterator();
                while (it.hasNext()) {
                    it.next().onFail(effect, e);
                }
            }
            downloadingEffectsListener.remove(expectedMd5);
            downloadingEffects.remove(expectedMd5);
        }
    }

    public final void onEffectDownloadProgressChange(Effect effect, int i, long j) {
        String expectedMd5;
        ConcurrentHashSet<IFetchEffectListener> concurrentHashSet;
        if (effect != null && (expectedMd5 = EffectExtKt.expectedMd5(effect)) != null && (concurrentHashSet = downloadingEffectsListener.get(expectedMd5)) != null) {
            Iterator<IFetchEffectListener> it = concurrentHashSet.iterator();
            while (it.hasNext()) {
                IFetchEffectListener next = it.next();
                if (next instanceof IEffectDownloadProgressListener) {
                    ((IEffectDownloadProgressListener) next).onProgress(effect, i, j);
                }
            }
        }
    }
}
